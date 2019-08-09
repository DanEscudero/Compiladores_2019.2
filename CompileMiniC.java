import java.io.FileReader;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CompileMiniC {
	public static void main(String[] args) {
		int nArgs = args.length;
		if (nArgs == 0) {
			System.out.println("Compilacao requer o caminho do arquivo do programa.");
		} else {
			String fileName = args[0];
			// O trecho de código a seguir foi baseado no livro "The Definitive ANTLR 4 Reference", de Terrence Parr
			try {
				// Pega os caracteres do arquivo de input
				ANTLRInputStream input = new ANTLRInputStream(new FileReader(fileName));

				// Cria um lexer a partir dos caracteres do arquivo de input
				MiniCLexer lexer = new MiniCLexer(input);

				// Cria um buffer de tokens a partir do lexer
				CommonTokenStream tokens = new CommonTokenStream(lexer);

				// Cria um parser a partir do buffer de tokens
				MiniCParser parser = new MiniCParser(tokens);

				// Inicia o parsing a partir da regra 'prog'. Salva o parsing em uma ParseTree
				ParseTree tree = parser.prog();

				// Cria uma esturura que anda na ParseTree
				ParseTreeWalker walker = new ParseTreeWalker();

				// Passa com o walker na ParseTree
				// Esse processo chama os callbacks do listener, que, por sua vez, compoe o arquivo de output
				walker.walk(new MiniCTranspilerListener(), tree);

				System.out.println("Compilação terminada!");
			} catch (Exception e) {
				System.out.println("Erro de compilação." + e);
				// System.out.println(e.getMessage());
			}
		}
	}
}