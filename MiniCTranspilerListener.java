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
		outputLines.add("#import <stdio.h>");
		outputLines.add("int main () {");

		outputLines.add(""); // Add empty line for formatting
	}

	@Override
	public void exitProg(MiniCParser.ProgContext ctx) {
		outputLines.add("return 0;");
		outputLines.add("}");

		try {
			FileWriter writer = new FileWriter("./output.c");
			for (String str : outputLines) {
				writer.write(str + System.lineSeparator());
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
			outputLines.add("int " + varName + " = 0;");
		}

		outputLines.add(""); // Add empty line for formatting
	}

	@Override
	public void enterCmdRead(MiniCParser.CmdReadContext ctx) {
		String varName = ctx.T_ID().getText();

		// Check if identifier exists as a defined variable
		validateIdentifier(varName, ctx.getStart().getLine());

		// Gets variable flag of type for scanf
		String varFlag = getVarFlag(varName);

		outputLines.add("scanf(" + varFlag + ", &" + varName + ");");

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

			outputLines.add("printf(" + varFlag + ", &" + varName + ";");
		} else {
			outputLines.add("printf(" + string.getText() + ");");
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
}