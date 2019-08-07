import MiniCLexer;
import MiniCParser;

public class MiniC {

	public static void main(String[] args) {
		try {
			MiniCLexer l = new MiniCLexer(System.in);
			MiniCParser p = new MiniCParser(l);
			p.prog();
			System.out.println("DONE");
		} catch (Exception e) {
			System.out.println(">>>>" + e.getMessage());
		}
	}
}