import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class MiniCTranspilerListener extends MiniCBaseListener {
	List<String> outputLines = new ArrayList<String>();

	@Override
	public void enterProg(MiniCParser.ProgContext ctx) {
		outputLines.add("#import <stdio.h>");
		outputLines.add("int main () {");
	}

	@Override
	public void exitProg(MiniCParser.ProgContext ctx) {
		outputLines.add("return 0;");
		outputLines.add("}");

		try {
			FileWriter writer = new FileWriter("../output.c");
			for (String str : outputLines) {
				writer.write(str + System.lineSeparator());
			}
			writer.close();
		} catch (Exception e) {
			System.out.println("Exception when writing to output file!!");
		}
	}
}