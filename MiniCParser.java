// Generated from MiniC.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_BLANK=1, T_INIT=2, T_END=3, T_DECLARE=4, T_READ=5, T_WRITE=6, T_IF=7, 
		T_THEN=8, T_ELSE=9, T_OPERATORS=10, T_SUM=11, T_SUB=12, T_MUL=13, T_DIV=14, 
		T_ID=15, T_LETTER=16, T_NUM=17, T_FINAL=18, T_ASSIGN=19, T_LCB=20, T_RCB=21, 
		T_LP=22, T_RP=23, T_COMMA=24, T_QUOTE=25;
	public static final int
		RULE_prog = 0, RULE_declara = 1, RULE_bloco = 2, RULE_cmd = 3, RULE_cmdRead = 4, 
		RULE_cmdWrite = 5, RULE_cmdCondition = 6, RULE_cmdAssign = 7, RULE_expression = 8, 
		RULE_term = 9, RULE_factor = 10, RULE_text = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declara", "bloco", "cmd", "cmdRead", "cmdWrite", "cmdCondition", 
			"cmdAssign", "expression", "term", "factor", "text"
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

	@Override
	public String getGrammarFileName() { return "MiniC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode T_INIT() { return getToken(MiniCParser.T_INIT, 0); }
		public DeclaraContext declara() {
			return getRuleContext(DeclaraContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode T_END() { return getToken(MiniCParser.T_END, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T_INIT);
			setState(25);
			declara();
			setState(26);
			bloco();
			setState(27);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaraContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(MiniCParser.T_DECLARE, 0); }
		public List<TerminalNode> T_ID() { return getTokens(MiniCParser.T_ID); }
		public TerminalNode T_ID(int i) {
			return getToken(MiniCParser.T_ID, i);
		}
		public TerminalNode T_FINAL() { return getToken(MiniCParser.T_FINAL, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(MiniCParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(MiniCParser.T_COMMA, i);
		}
		public DeclaraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterDeclara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitDeclara(this);
		}
	}

	public final DeclaraContext declara() throws RecognitionException {
		DeclaraContext _localctx = new DeclaraContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T_DECLARE);
			setState(30);
			match(T_ID);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(31);
				match(T_COMMA);
				setState(32);
				match(T_ID);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(T_FINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				cmd();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_READ) | (1L << T_WRITE) | (1L << T_IF) | (1L << T_ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdReadContext cmdRead() {
			return getRuleContext(CmdReadContext.class,0);
		}
		public CmdWriteContext cmdWrite() {
			return getRuleContext(CmdWriteContext.class,0);
		}
		public CmdAssignContext cmdAssign() {
			return getRuleContext(CmdAssignContext.class,0);
		}
		public CmdConditionContext cmdCondition() {
			return getRuleContext(CmdConditionContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_READ:
				{
				setState(45);
				cmdRead();
				}
				break;
			case T_WRITE:
				{
				setState(46);
				cmdWrite();
				}
				break;
			case T_ID:
				{
				setState(47);
				cmdAssign();
				}
				break;
			case T_IF:
				{
				setState(48);
				cmdCondition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdReadContext extends ParserRuleContext {
		public TerminalNode T_READ() { return getToken(MiniCParser.T_READ, 0); }
		public TerminalNode T_LP() { return getToken(MiniCParser.T_LP, 0); }
		public TerminalNode T_ID() { return getToken(MiniCParser.T_ID, 0); }
		public TerminalNode T_RP() { return getToken(MiniCParser.T_RP, 0); }
		public TerminalNode T_FINAL() { return getToken(MiniCParser.T_FINAL, 0); }
		public CmdReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterCmdRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitCmdRead(this);
		}
	}

	public final CmdReadContext cmdRead() throws RecognitionException {
		CmdReadContext _localctx = new CmdReadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmdRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T_READ);
			setState(52);
			match(T_LP);
			setState(53);
			match(T_ID);
			setState(54);
			match(T_RP);
			setState(55);
			match(T_FINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdWriteContext extends ParserRuleContext {
		public TerminalNode T_WRITE() { return getToken(MiniCParser.T_WRITE, 0); }
		public TerminalNode T_LP() { return getToken(MiniCParser.T_LP, 0); }
		public TerminalNode T_RP() { return getToken(MiniCParser.T_RP, 0); }
		public TerminalNode T_FINAL() { return getToken(MiniCParser.T_FINAL, 0); }
		public TerminalNode T_ID() { return getToken(MiniCParser.T_ID, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public CmdWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterCmdWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitCmdWrite(this);
		}
	}

	public final CmdWriteContext cmdWrite() throws RecognitionException {
		CmdWriteContext _localctx = new CmdWriteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T_WRITE);
			setState(58);
			match(T_LP);
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ID:
				{
				setState(59);
				match(T_ID);
				}
				break;
			case T_QUOTE:
				{
				setState(60);
				text();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(63);
			match(T_RP);
			setState(64);
			match(T_FINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdConditionContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(MiniCParser.T_IF, 0); }
		public TerminalNode T_LP() { return getToken(MiniCParser.T_LP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode T_OPERATORS() { return getToken(MiniCParser.T_OPERATORS, 0); }
		public TerminalNode T_RP() { return getToken(MiniCParser.T_RP, 0); }
		public List<TerminalNode> T_LCB() { return getTokens(MiniCParser.T_LCB); }
		public TerminalNode T_LCB(int i) {
			return getToken(MiniCParser.T_LCB, i);
		}
		public List<TerminalNode> T_RCB() { return getTokens(MiniCParser.T_RCB); }
		public TerminalNode T_RCB(int i) {
			return getToken(MiniCParser.T_RCB, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(MiniCParser.T_ELSE, 0); }
		public CmdConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterCmdCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitCmdCondition(this);
		}
	}

	public final CmdConditionContext cmdCondition() throws RecognitionException {
		CmdConditionContext _localctx = new CmdConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T_IF);
			setState(67);
			match(T_LP);
			setState(68);
			expression();
			setState(69);
			match(T_OPERATORS);
			setState(70);
			expression();
			setState(71);
			match(T_RP);
			setState(72);
			match(T_LCB);
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				cmd();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_READ) | (1L << T_WRITE) | (1L << T_IF) | (1L << T_ID))) != 0) );
			setState(78);
			match(T_RCB);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(79);
				match(T_ELSE);
				setState(80);
				match(T_LCB);
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(81);
					cmd();
					}
					}
					setState(84); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_READ) | (1L << T_WRITE) | (1L << T_IF) | (1L << T_ID))) != 0) );
				setState(86);
				match(T_RCB);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdAssignContext extends ParserRuleContext {
		public TerminalNode T_ID() { return getToken(MiniCParser.T_ID, 0); }
		public TerminalNode T_ASSIGN() { return getToken(MiniCParser.T_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode T_FINAL() { return getToken(MiniCParser.T_FINAL, 0); }
		public CmdAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterCmdAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitCmdAssign(this);
		}
	}

	public final CmdAssignContext cmdAssign() throws RecognitionException {
		CmdAssignContext _localctx = new CmdAssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T_ID);
			setState(91);
			match(T_ASSIGN);
			setState(92);
			expression();
			setState(93);
			match(T_FINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> T_SUM() { return getTokens(MiniCParser.T_SUM); }
		public TerminalNode T_SUM(int i) {
			return getToken(MiniCParser.T_SUM, i);
		}
		public List<TerminalNode> T_SUB() { return getTokens(MiniCParser.T_SUB); }
		public TerminalNode T_SUB(int i) {
			return getToken(MiniCParser.T_SUB, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			term();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_SUM || _la==T_SUB) {
				{
				{
				setState(96);
				_la = _input.LA(1);
				if ( !(_la==T_SUM || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(97);
				term();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> T_MUL() { return getTokens(MiniCParser.T_MUL); }
		public TerminalNode T_MUL(int i) {
			return getToken(MiniCParser.T_MUL, i);
		}
		public List<TerminalNode> T_DIV() { return getTokens(MiniCParser.T_DIV); }
		public TerminalNode T_DIV(int i) {
			return getToken(MiniCParser.T_DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			factor();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_MUL || _la==T_DIV) {
				{
				{
				setState(104);
				_la = _input.LA(1);
				if ( !(_la==T_MUL || _la==T_DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(105);
				factor();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode T_NUM() { return getToken(MiniCParser.T_NUM, 0); }
		public TerminalNode T_ID() { return getToken(MiniCParser.T_ID, 0); }
		public TerminalNode T_LP() { return getToken(MiniCParser.T_LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode T_RP() { return getToken(MiniCParser.T_RP, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_factor);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(T_NUM);
				}
				break;
			case T_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(T_ID);
				}
				break;
			case T_LP:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(113);
				match(T_LP);
				setState(114);
				expression();
				setState(115);
				match(T_RP);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> T_QUOTE() { return getTokens(MiniCParser.T_QUOTE); }
		public TerminalNode T_QUOTE(int i) {
			return getToken(MiniCParser.T_QUOTE, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T_QUOTE);
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T_QUOTE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_BLANK) | (1L << T_INIT) | (1L << T_END) | (1L << T_DECLARE) | (1L << T_READ) | (1L << T_WRITE) | (1L << T_IF) | (1L << T_THEN) | (1L << T_ELSE) | (1L << T_OPERATORS) | (1L << T_SUM) | (1L << T_SUB) | (1L << T_MUL) | (1L << T_DIV) | (1L << T_ID) | (1L << T_LETTER) | (1L << T_NUM) | (1L << T_FINAL) | (1L << T_ASSIGN) | (1L << T_LCB) | (1L << T_RCB) | (1L << T_LP) | (1L << T_RP) | (1L << T_COMMA))) != 0) );
			setState(125);
			match(T_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u0082\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3$\n\3\f\3"+
		"\16\3\'\13\3\3\3\3\3\3\4\6\4,\n\4\r\4\16\4-\3\5\3\5\3\5\3\5\5\5\64\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7@\n\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\6\bM\n\b\r\b\16\bN\3\b\3\b\3\b\3\b\6\bU\n\b\r"+
		"\b\16\bV\3\b\3\b\5\b[\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\ne\n\n\f\n"+
		"\16\nh\13\n\3\13\3\13\3\13\7\13m\n\13\f\13\16\13p\13\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\fx\n\f\3\r\3\r\6\r|\n\r\r\r\16\r}\3\r\3\r\3\r\2\2\16\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\2\5\3\2\r\16\3\2\17\20\3\2\33\33\2\u0083\2"+
		"\32\3\2\2\2\4\37\3\2\2\2\6+\3\2\2\2\b\63\3\2\2\2\n\65\3\2\2\2\f;\3\2\2"+
		"\2\16D\3\2\2\2\20\\\3\2\2\2\22a\3\2\2\2\24i\3\2\2\2\26w\3\2\2\2\30y\3"+
		"\2\2\2\32\33\7\4\2\2\33\34\5\4\3\2\34\35\5\6\4\2\35\36\7\5\2\2\36\3\3"+
		"\2\2\2\37 \7\6\2\2 %\7\21\2\2!\"\7\32\2\2\"$\7\21\2\2#!\3\2\2\2$\'\3\2"+
		"\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\24\2\2)\5\3\2\2\2*,"+
		"\5\b\5\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\7\3\2\2\2/\64\5\n\6"+
		"\2\60\64\5\f\7\2\61\64\5\20\t\2\62\64\5\16\b\2\63/\3\2\2\2\63\60\3\2\2"+
		"\2\63\61\3\2\2\2\63\62\3\2\2\2\64\t\3\2\2\2\65\66\7\7\2\2\66\67\7\30\2"+
		"\2\678\7\21\2\289\7\31\2\29:\7\24\2\2:\13\3\2\2\2;<\7\b\2\2<?\7\30\2\2"+
		"=@\7\21\2\2>@\5\30\r\2?=\3\2\2\2?>\3\2\2\2@A\3\2\2\2AB\7\31\2\2BC\7\24"+
		"\2\2C\r\3\2\2\2DE\7\t\2\2EF\7\30\2\2FG\5\22\n\2GH\7\f\2\2HI\5\22\n\2I"+
		"J\7\31\2\2JL\7\26\2\2KM\5\b\5\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2"+
		"\2OP\3\2\2\2PZ\7\27\2\2QR\7\13\2\2RT\7\26\2\2SU\5\b\5\2TS\3\2\2\2UV\3"+
		"\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\27\2\2Y[\3\2\2\2ZQ\3\2\2\2Z["+
		"\3\2\2\2[\17\3\2\2\2\\]\7\21\2\2]^\7\25\2\2^_\5\22\n\2_`\7\24\2\2`\21"+
		"\3\2\2\2af\5\24\13\2bc\t\2\2\2ce\5\24\13\2db\3\2\2\2eh\3\2\2\2fd\3\2\2"+
		"\2fg\3\2\2\2g\23\3\2\2\2hf\3\2\2\2in\5\26\f\2jk\t\3\2\2km\5\26\f\2lj\3"+
		"\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\25\3\2\2\2pn\3\2\2\2qx\7\23\2\2"+
		"rx\7\21\2\2st\7\30\2\2tu\5\22\n\2uv\7\31\2\2vx\3\2\2\2wq\3\2\2\2wr\3\2"+
		"\2\2ws\3\2\2\2x\27\3\2\2\2y{\7\33\2\2z|\n\4\2\2{z\3\2\2\2|}\3\2\2\2}{"+
		"\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7\33\2\2\u0080\31\3\2\2\2\r"+
		"%-\63?NVZfnw}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}