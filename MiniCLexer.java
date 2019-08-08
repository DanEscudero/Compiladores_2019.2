// Generated from MiniC.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_BLANK=1, T_INIT=2, T_END=3, T_DECLARE=4, T_READ=5, T_WRITE=6, T_IF=7, 
		T_THEN=8, T_ELSE=9, T_OPERATORS=10, T_SUM=11, T_SUB=12, T_MUL=13, T_DIV=14, 
		T_ID=15, T_LETTER=16, T_NUM=17, T_FINAL=18, T_ASSIGN=19, T_LCB=20, T_RCB=21, 
		T_LP=22, T_RP=23, T_COMMA=24, T_QUOTE=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T_BLANK", "T_INIT", "T_END", "T_DECLARE", "T_READ", "T_WRITE", "T_IF", 
			"T_THEN", "T_ELSE", "T_OPERATORS", "T_SUM", "T_SUB", "T_MUL", "T_DIV", 
			"T_ID", "T_LETTER", "T_NUM", "T_FINAL", "T_ASSIGN", "T_LCB", "T_RCB", 
			"T_LP", "T_RP", "T_COMMA", "T_QUOTE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'programa'", "'fimPrograma'", "'var'", "'leia'", "'escreva'", 
			"'se'", "'entao'", "'senao'", null, "'+'", "'-'", "'*'", "'/'", null, 
			null, null, "';'", "'='", "'{'", "'}'", "'('", "')'", "','", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "T_BLANK", "T_INIT", "T_END", "T_DECLARE", "T_READ", "T_WRITE", 
			"T_IF", "T_THEN", "T_ELSE", "T_OPERATORS", "T_SUM", "T_SUB", "T_MUL", 
			"T_DIV", "T_ID", "T_LETTER", "T_NUM", "T_FINAL", "T_ASSIGN", "T_LCB", 
			"T_RCB", "T_LP", "T_RP", "T_COMMA", "T_QUOTE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00a3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13|\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\7\20\u0088\n\20\f\20\16\20\u008b\13\20\3\21\3\21\3"+
		"\22\6\22\u0090\n\22\r\22\16\22\u0091\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\3\2\7\5\2\13\f\17\17\"\"\4\2>>@@\4\2C"+
		"\\c|\5\2\62;C\\c|\3\2\62;\2\u00aa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2"+
		"\2\2\59\3\2\2\2\7B\3\2\2\2\tN\3\2\2\2\13R\3\2\2\2\rW\3\2\2\2\17_\3\2\2"+
		"\2\21b\3\2\2\2\23h\3\2\2\2\25{\3\2\2\2\27}\3\2\2\2\31\177\3\2\2\2\33\u0081"+
		"\3\2\2\2\35\u0083\3\2\2\2\37\u0085\3\2\2\2!\u008c\3\2\2\2#\u008f\3\2\2"+
		"\2%\u0093\3\2\2\2\'\u0095\3\2\2\2)\u0097\3\2\2\2+\u0099\3\2\2\2-\u009b"+
		"\3\2\2\2/\u009d\3\2\2\2\61\u009f\3\2\2\2\63\u00a1\3\2\2\2\65\66\t\2\2"+
		"\2\66\67\3\2\2\2\678\b\2\2\28\4\3\2\2\29:\7r\2\2:;\7t\2\2;<\7q\2\2<=\7"+
		"i\2\2=>\7t\2\2>?\7c\2\2?@\7o\2\2@A\7c\2\2A\6\3\2\2\2BC\7h\2\2CD\7k\2\2"+
		"DE\7o\2\2EF\7R\2\2FG\7t\2\2GH\7q\2\2HI\7i\2\2IJ\7t\2\2JK\7c\2\2KL\7o\2"+
		"\2LM\7c\2\2M\b\3\2\2\2NO\7x\2\2OP\7c\2\2PQ\7t\2\2Q\n\3\2\2\2RS\7n\2\2"+
		"ST\7g\2\2TU\7k\2\2UV\7c\2\2V\f\3\2\2\2WX\7g\2\2XY\7u\2\2YZ\7e\2\2Z[\7"+
		"t\2\2[\\\7g\2\2\\]\7x\2\2]^\7c\2\2^\16\3\2\2\2_`\7u\2\2`a\7g\2\2a\20\3"+
		"\2\2\2bc\7g\2\2cd\7p\2\2de\7v\2\2ef\7c\2\2fg\7q\2\2g\22\3\2\2\2hi\7u\2"+
		"\2ij\7g\2\2jk\7p\2\2kl\7c\2\2lm\7q\2\2m\24\3\2\2\2n|\t\3\2\2op\7>\2\2"+
		"p|\7?\2\2qr\7@\2\2r|\7?\2\2st\7#\2\2t|\7?\2\2uv\7?\2\2v|\7?\2\2wx\7~\2"+
		"\2x|\7~\2\2yz\7(\2\2z|\7(\2\2{n\3\2\2\2{o\3\2\2\2{q\3\2\2\2{s\3\2\2\2"+
		"{u\3\2\2\2{w\3\2\2\2{y\3\2\2\2|\26\3\2\2\2}~\7-\2\2~\30\3\2\2\2\177\u0080"+
		"\7/\2\2\u0080\32\3\2\2\2\u0081\u0082\7,\2\2\u0082\34\3\2\2\2\u0083\u0084"+
		"\7\61\2\2\u0084\36\3\2\2\2\u0085\u0089\t\4\2\2\u0086\u0088\t\5\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a \3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\t\4\2\2\u008d\"\3"+
		"\2\2\2\u008e\u0090\t\6\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092$\3\2\2\2\u0093\u0094\7=\2\2\u0094"+
		"&\3\2\2\2\u0095\u0096\7?\2\2\u0096(\3\2\2\2\u0097\u0098\7}\2\2\u0098*"+
		"\3\2\2\2\u0099\u009a\7\177\2\2\u009a,\3\2\2\2\u009b\u009c\7*\2\2\u009c"+
		".\3\2\2\2\u009d\u009e\7+\2\2\u009e\60\3\2\2\2\u009f\u00a0\7.\2\2\u00a0"+
		"\62\3\2\2\2\u00a1\u00a2\7$\2\2\u00a2\64\3\2\2\2\6\2{\u0089\u0091\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}