import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.management.RuntimeErrorException;

import java.util.HashMap;

import org.antlr.v4.runtime.tree.*;

public class MiniCTranspilerListener extends MiniCBaseListener {
	List<String> outputLines = new ArrayList<String>();

	Map<String, Integer> integers = new HashMap<String, Integer>();
	Map<String, Double> floats = new HashMap<String, Double>();

	@Override
	public void enterProg(MiniCParser.ProgContext ctx) {
		// Initialize program importing IO lib and declaring main
		outputLines.add("#include <stdio.h>" + System.lineSeparator());
		outputLines.add("int main () {" + System.lineSeparator());
	}

	@Override
	public void exitProg(MiniCParser.ProgContext ctx) {
		outputLines.add("return 0;" + System.lineSeparator() + "}" + System.lineSeparator());

		try {
			FileWriter writer = new FileWriter("../output.c");
			for (String str : outputLines) {
				writer.write(str);
			}
			writer.close();
		} catch (Exception e) {
			System.out.println("Exception when writing to output file!!" + e);
		}
	}

	@Override
	public void enterDeclare(MiniCParser.DeclareContext ctx) {
		List<TerminalNode> declaredVars = ctx.T_ID();

		TerminalNode typeInt = ctx.T_INT();
		TerminalNode typeFloat = ctx.T_FLOAT();

		for (TerminalNode var : declaredVars) {
			String varName = var.getText();
			if (typeInt != null) {
				integers.put(varName, 0); // Initialize all variables with 0
			} else if (typeFloat != null) {
				floats.put(varName, 0d); // Initialize all variables with 0
			}

			outputLines.add(getVarType(varName) + " " + varName + " = 0;" + System.lineSeparator());
		}

	}

	@Override
	public void enterCmdRead(MiniCParser.CmdReadContext ctx) {
		String varName = ctx.T_ID().getText();

		// Check if identifier exists as a defined variable
		validateIdentifier(varName, ctx.getStart().getLine());

		// Gets variable flag of type for scanf
		String varFlag = getVarFlag(varName);

		outputLines.add("scanf(\"" + varFlag + "\", &" + varName + ");" + System.lineSeparator());
	}

	@Override
	public void enterCmdWrite(MiniCParser.CmdWriteContext ctx) {
		TerminalNode var = ctx.T_ID();
		TerminalNode string = ctx.STRING();

		if (var != null) {
			String varName = var.toString();

			// Checks if variable is declared
			validateIdentifier(varName, ctx.getStart().getLine());

			// Gets flag for printf
			String varFlag = getVarFlag(varName);

			outputLines.add("printf(\"" + varFlag + "\", " + varName + ");" + System.lineSeparator());
		} else {
			outputLines.add("printf(" + string.getText() + ");" + System.lineSeparator());
		}
	}

	private void validateIdentifier(String varName, int lineNumber) {
		if (!integers.containsKey(varName) && !floats.containsKey(varName)) {
			throw new RuntimeException("[Linha " + lineNumber + "] Variavel '" + varName + "' nao foi delcarada.");
		}
	}

	private String getVarFlag(String varName) {
		if (integers.containsKey(varName)) {
			return "%d";
		} else if (floats.containsKey(varName)) {
			return "%lf";
		} else {
			return "";
		}
	}

	@Override
	public void enterCmdAssign(MiniCParser.CmdAssignContext ctx) {
		String varName = ctx.T_ID().getText();

		validateIdentifier(varName, ctx.getStart().getLine());

		MiniCParser.ExpressionContext expression = ctx.expression();
		outputLines.add(varName + " = " + getExpressionString(expression));

	}

	private String getVarType(String varName) {
		if (integers.containsKey(varName)) {
			return "int";
		} else if (floats.containsKey(varName)) {
			return "double";
		} else {
			return "";
		}
	}

	@Override
	public void exitCmdAssign(MiniCParser.CmdAssignContext ctx) {
		outputLines.add(";" + System.lineSeparator());
	}

	private String getExpressionString(MiniCParser.ExpressionContext ctx) {
		String expressionString = getTermString(ctx.term(0));

		List<TerminalNode> ops = ctx.T_ARITH_1();
		for (int i = 0; i < ops.size(); i++) {
			String op = ops.get(i).getText();
			expressionString += op + getTermString(ctx.term(i + 1));
		}

		return expressionString;
	}

	private String getTermString(MiniCParser.TermContext ctx) {
		String termString = getFactorString(ctx.factor(0));

		List<TerminalNode> ops = ctx.T_ARITH_2();
		for (int i = 0; i < ops.size(); i++) {
			String op = ops.get(i).getText();
			termString += op + getFactorString(ctx.factor(i + 1));
		}

		return termString;

	}

	private String getFactorString(MiniCParser.FactorContext ctx) {
		TerminalNode num = ctx.T_NUM();
		if (num != null)
			return num.getText();

		TerminalNode var = ctx.T_ID();
		if (var != null)
			return var.getText();

		MiniCParser.ExpressionContext expression = ctx.expression();
		if (expression != null)
			return "(" + getExpressionString(expression) + ")";

		else
			return "";
	}

	private String getConditionString(MiniCParser.ConditionContext ctx) {
		String op = ctx.T_OPERATORS().toString();
		return getExpressionString(ctx.expression(0)) + op + getExpressionString(ctx.expression(1));
	}

	@Override
	public void enterIfStmt(MiniCParser.IfStmtContext ctx) {
		MiniCParser.ConditionContext condition = ctx.condition();
		outputLines.add("if (" + getConditionString(condition) + ") {" + System.lineSeparator());
	}

	@Override
	public void exitIfStmt(MiniCParser.IfStmtContext ctx) {
		outputLines.add("}" + System.lineSeparator());
	}

	@Override
	public void enterElseStmt(MiniCParser.ElseStmtContext ctx) {
		outputLines.add("else {" + System.lineSeparator());
	}

	@Override
	public void exitElseStmt(MiniCParser.ElseStmtContext ctx) {
		outputLines.add("}" + System.lineSeparator());
	}

	@Override
	public void enterCmdWhile(MiniCParser.CmdWhileContext ctx) {
		MiniCParser.ConditionContext condition = ctx.condition();
		outputLines.add("while (" + getConditionString(condition) + ") {" + System.lineSeparator());
	}

	@Override
	public void exitCmdWhile(MiniCParser.CmdWhileContext ctx) {
		outputLines.add("}" + System.lineSeparator());
	}

	@Override
	public void enterCmdDoWhile(MiniCParser.CmdDoWhileContext ctx) {
		outputLines.add("do {" + System.lineSeparator());
	}

	@Override
	public void exitCmdDoWhile(MiniCParser.CmdDoWhileContext ctx) {
		MiniCParser.ConditionContext condition = ctx.condition();
		outputLines.add("} while (" + getConditionString(condition) + ");" + System.lineSeparator());
	}
}