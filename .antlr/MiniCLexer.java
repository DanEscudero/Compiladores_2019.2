// Generated from /home/daniel/Área de Trabalho/Compiladores_2019.2/MiniC.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_BLANK=1, T_INIT=2, T_END=3, T_DECLARE=4, T_READ=5, T_WRITE=6, T_IF=7, 
		T_THEN=8, T_ELSE=9, T_OPERATORS=10, T_SUM=11, T_SUB=12, T_MUL=13, T_DIV=14, 
		T_ID=15, T_LETTER=16, T_NUM=17, STRING=18, T_FINAL=19, T_ASSIGN=20, T_LCB=21, 
		T_RCB=22, T_LP=23, T_RP=24, T_COMMA=25, T_QUOTE=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T_BLANK", "T_INIT", "T_END", "T_DECLARE", "T_READ", "T_WRITE", "T_IF", 
		"T_THEN", "T_ELSE", "T_OPERATORS", "T_SUM", "T_SUB", "T_MUL", "T_DIV", 
		"T_ID", "T_LETTER", "T_NUM", "STRING", "T_FINAL", "T_ASSIGN", "T_LCB", 
		"T_RCB", "T_LP", "T_RP", "T_COMMA", "T_QUOTE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'programa'", "'fimPrograma'", "'var'", "'leia'", "'escreva'", 
		"'se'", "'entao'", "'senao'", null, "'+'", "'-'", "'*'", "'/'", null, 
		null, null, null, "';'", "'='", "'{'", "'}'", "'('", "')'", "','", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "T_BLANK", "T_INIT", "T_END", "T_DECLARE", "T_READ", "T_WRITE", 
		"T_IF", "T_THEN", "T_ELSE", "T_OPERATORS", "T_SUM", "T_SUB", "T_MUL", 
		"T_DIV", "T_ID", "T_LETTER", "T_NUM", "STRING", "T_FINAL", "T_ASSIGN", 
		"T_LCB", "T_RCB", "T_LP", "T_RP", "T_COMMA", "T_QUOTE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MiniCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00b3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13~\n\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\7\20\u008a\n\20\f\20\16\20\u008d\13\20\3"+
		"\21\3\21\3\22\5\22\u0092\n\22\3\22\6\22\u0095\n\22\r\22\16\22\u0096\3"+
		"\23\3\23\3\23\3\23\7\23\u009d\n\23\f\23\16\23\u00a0\13\23\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\3\2\t\5\2\13\f\17\17\"\"\4\2>>@@\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2"+
		"$$^^\6\2\f\f\17\17$$^^\2\u00bd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\3\67\3\2\2\2\5;\3\2\2\2\7D\3\2\2\2\tP\3\2\2\2\13T\3\2\2\2\rY\3\2\2\2"+
		"\17a\3\2\2\2\21d\3\2\2\2\23j\3\2\2\2\25}\3\2\2\2\27\177\3\2\2\2\31\u0081"+
		"\3\2\2\2\33\u0083\3\2\2\2\35\u0085\3\2\2\2\37\u0087\3\2\2\2!\u008e\3\2"+
		"\2\2#\u0091\3\2\2\2%\u0098\3\2\2\2\'\u00a3\3\2\2\2)\u00a5\3\2\2\2+\u00a7"+
		"\3\2\2\2-\u00a9\3\2\2\2/\u00ab\3\2\2\2\61\u00ad\3\2\2\2\63\u00af\3\2\2"+
		"\2\65\u00b1\3\2\2\2\678\t\2\2\289\3\2\2\29:\b\2\2\2:\4\3\2\2\2;<\7r\2"+
		"\2<=\7t\2\2=>\7q\2\2>?\7i\2\2?@\7t\2\2@A\7c\2\2AB\7o\2\2BC\7c\2\2C\6\3"+
		"\2\2\2DE\7h\2\2EF\7k\2\2FG\7o\2\2GH\7R\2\2HI\7t\2\2IJ\7q\2\2JK\7i\2\2"+
		"KL\7t\2\2LM\7c\2\2MN\7o\2\2NO\7c\2\2O\b\3\2\2\2PQ\7x\2\2QR\7c\2\2RS\7"+
		"t\2\2S\n\3\2\2\2TU\7n\2\2UV\7g\2\2VW\7k\2\2WX\7c\2\2X\f\3\2\2\2YZ\7g\2"+
		"\2Z[\7u\2\2[\\\7e\2\2\\]\7t\2\2]^\7g\2\2^_\7x\2\2_`\7c\2\2`\16\3\2\2\2"+
		"ab\7u\2\2bc\7g\2\2c\20\3\2\2\2de\7g\2\2ef\7p\2\2fg\7v\2\2gh\7c\2\2hi\7"+
		"q\2\2i\22\3\2\2\2jk\7u\2\2kl\7g\2\2lm\7p\2\2mn\7c\2\2no\7q\2\2o\24\3\2"+
		"\2\2p~\t\3\2\2qr\7>\2\2r~\7?\2\2st\7@\2\2t~\7?\2\2uv\7#\2\2v~\7?\2\2w"+
		"x\7?\2\2x~\7?\2\2yz\7~\2\2z~\7~\2\2{|\7(\2\2|~\7(\2\2}p\3\2\2\2}q\3\2"+
		"\2\2}s\3\2\2\2}u\3\2\2\2}w\3\2\2\2}y\3\2\2\2}{\3\2\2\2~\26\3\2\2\2\177"+
		"\u0080\7-\2\2\u0080\30\3\2\2\2\u0081\u0082\7/\2\2\u0082\32\3\2\2\2\u0083"+
		"\u0084\7,\2\2\u0084\34\3\2\2\2\u0085\u0086\7\61\2\2\u0086\36\3\2\2\2\u0087"+
		"\u008b\t\4\2\2\u0088\u008a\t\5\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c \3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008e\u008f\t\4\2\2\u008f\"\3\2\2\2\u0090\u0092\7/\2\2\u0091"+
		"\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0095\t\6"+
		"\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097$\3\2\2\2\u0098\u009e\7$\2\2\u0099\u009a\7^\2\2\u009a"+
		"\u009d\t\7\2\2\u009b\u009d\n\b\2\2\u009c\u0099\3\2\2\2\u009c\u009b\3\2"+
		"\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7$\2\2\u00a2&\3\2\2\2\u00a3"+
		"\u00a4\7=\2\2\u00a4(\3\2\2\2\u00a5\u00a6\7?\2\2\u00a6*\3\2\2\2\u00a7\u00a8"+
		"\7}\2\2\u00a8,\3\2\2\2\u00a9\u00aa\7\177\2\2\u00aa.\3\2\2\2\u00ab\u00ac"+
		"\7*\2\2\u00ac\60\3\2\2\2\u00ad\u00ae\7+\2\2\u00ae\62\3\2\2\2\u00af\u00b0"+
		"\7.\2\2\u00b0\64\3\2\2\2\u00b1\u00b2\7$\2\2\u00b2\66\3\2\2\2\t\2}\u008b"+
		"\u0091\u0096\u009c\u009e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}