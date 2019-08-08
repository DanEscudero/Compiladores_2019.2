import java.io.FileReader;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

	public static void main(String[] args) {
		int nArgs = args.length;
		if (nArgs == 0) {
			System.out.println("Compilation requires program name.");
		} else {
			try {
				ANTLRInputStream input = new ANTLRInputStream(new FileReader(args[0]));
				MiniCLexer lexer = new MiniCLexer(input);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				MiniCParser parser = new MiniCParser(tokens);
				ParseTree tree = parser.prog();
				System.out.println(tree.toStringTree(parser));
			} catch (Exception e) {
				System.out.println(">>>>" + e);
			}
		}
	}
}