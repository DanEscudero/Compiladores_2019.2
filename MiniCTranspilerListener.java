import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.antlr.v4.runtime.tree.*;

public class MiniCTranspilerListener extends MiniCBaseListener {
	List<String> outputLines = new ArrayList<String>();

	Map<String, Integer> integers = new HashMap<String, Integer>();

	@Override
	public void enterProg(MiniCParser.ProgContext ctx) {
		// Initialize program importing IO lib and declaring main
		outputLines.add("#import <stdio.h>" + System.lineSeparator());
		outputLines.add("int main () {" + System.lineSeparator());
	}

	@Override
	public void exitProg(MiniCParser.ProgContext ctx) {
		outputLines.add("");
		outputLines.add("return 0;" + System.lineSeparator());
		outputLines.add("}" + System.lineSeparator());

		try {
			FileWriter writer = new FileWriter("./output.c");
			for (String str : outputLines) {
				writer.write(str);
			}
			writer.close();
		} catch (Exception e) {
			System.out.println("Exception when writing to output file!!");
		}
	}

	@Override
	public void enterDeclara(MiniCParser.DeclaraContext ctx) {
		List<TerminalNode> declaredVars = ctx.T_ID();
		for (TerminalNode var : declaredVars) {
			String varName = var.getText();
			integers.put(varName, 0); // Initialize all variables with 0
			outputLines.add("int " + varName + " = 0;" + System.lineSeparator());
		}
	}

	@Override
	public void enterCmdRead(MiniCParser.CmdReadContext ctx) {
		String varName = ctx.T_ID().getText();

		// Check if identifier exists as a defined variable
		validateIdentifier(varName, ctx.getStart().getLine());

		// Gets variable flag of type for scanf
		String varFlag = getVarFlag(varName);

		outputLines.add("scanf(" + varFlag + ", &" + varName + ");" + System.lineSeparator());

		// TODO:
		// if (chars.containsKey(var)) varFlag = "%c";
	}

	@Override
	public void enterCmdWrite(MiniCParser.CmdWriteContext ctx) {
		TerminalNode var = ctx.T_ID();
		TerminalNode string = ctx.STRING();

		if (var != null) {
			String varName = var.toString();
			System.out.println("varName:" + varName);

			// Checks if variable is declared
			validateIdentifier(varName, ctx.getStart().getLine());

			// Gets flag for printf
			String varFlag = getVarFlag(varName);

			outputLines.add("printf(" + varFlag + ", &" + varName + ";" + System.lineSeparator());
		} else {
			outputLines.add("printf(" + string.getText() + ");" + System.lineSeparator());
		}
	}

	private void validateIdentifier(String varName, int lineNumber) {
		if (!integers.containsKey(varName)) {
			System.out.println(">>> Var not found:" + varName);
			throw new RuntimeException("[Linha " + lineNumber + "] Variavel '" + varName + "' nao foi delcarada.");
		}
	}

	private String getVarFlag(String varName) {
		if (integers.containsKey(varName)) {
			return "%d";
		} else {
			return "";
		}
	}

	@Override
	public void enterCmdAssign(MiniCParser.CmdAssignContext ctx) {
		String varName = ctx.T_ID().getText();

		validateIdentifier(varName, ctx.getStart().getLine());

		MiniCParser.ExpressionContext expressionContext = ctx.expression();

		outputLines.add(varName + " = ");
	}

	@Override
	public void exitCmdAssign(MiniCParser.CmdAssignContext ctx) {
		outputLines.add(";" + System.lineSeparator());
	}

	private String getExpressionString(MiniCParser.ExpressionContext ctx) {
		// TODO
		return "";
	}

	private String getConditionString(MiniCParser.ConditionContext ctx) {
		MiniCParser.ExpressionContext firstExpression = ctx.expression(0);
		MiniCParser.ExpressionContext secondExpression = ctx.expression(1);
		String op = ctx.T_OPERATORS().toString();
		return getExpressionString(ctx.expression(0)) + op + getExpressionString(ctx.expression(0));
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
}