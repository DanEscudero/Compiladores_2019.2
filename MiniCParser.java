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
		T_THEN=8, T_ELSE=9, T_INT=10, T_FLOAT=11, T_WHILE=12, T_DO=13, T_OPERATORS=14, 
		T_ARITH_1=15, T_ARITH_2=16, T_ID=17, T_LETTER=18, T_NUM=19, STRING=20, 
		T_FINAL=21, T_ASSIGN=22, T_LCB=23, T_RCB=24, T_LP=25, T_RP=26, T_COMMA=27, 
		T_QUOTE=28, T_SQUOTE=29;
	public static final int
		RULE_prog = 0, RULE_declare = 1, RULE_block = 2, RULE_cmd = 3, RULE_cmdRead = 4, 
		RULE_cmdWrite = 5, RULE_cmdCondition = 6, RULE_cmdAssign = 7, RULE_cmdWhile = 8, 
		RULE_cmdDoWhile = 9, RULE_ifStmt = 10, RULE_elseStmt = 11, RULE_condition = 12, 
		RULE_expression = 13, RULE_term = 14, RULE_factor = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declare", "block", "cmd", "cmdRead", "cmdWrite", "cmdCondition", 
			"cmdAssign", "cmdWhile", "cmdDoWhile", "ifStmt", "elseStmt", "condition", 
			"expression", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'programa'", "'fimPrograma'", "'var'", "'leia'", "'escreva'", 
			"'se'", "'entao'", "'senao'", "'int'", "'float'", "'enquanto'", "'faca'", 
			null, null, null, null, null, null, null, "';'", "'='", "'{'", "'}'", 
			"'('", "')'", "','", "'\"'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "T_BLANK", "T_INIT", "T_END", "T_DECLARE", "T_READ", "T_WRITE", 
			"T_IF", "T_THEN", "T_ELSE", "T_INT", "T_FLOAT", "T_WHILE", "T_DO", "T_OPERATORS", 
			"T_ARITH_1", "T_ARITH_2", "T_ID", "T_LETTER", "T_NUM", "STRING", "T_FINAL", 
			"T_ASSIGN", "T_LCB", "T_RCB", "T_LP", "T_RP", "T_COMMA", "T_QUOTE", "T_SQUOTE"
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(MiniCParser.T_END, 0); }
		public List<DeclareContext> declare() {
			return getRuleContexts(DeclareContext.class);
		}
		public DeclareContext declare(int i) {
			return getRuleContext(DeclareContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T_INIT);
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				declare();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_INT || _la==T_FLOAT );
			setState(38);
			block();
			setState(39);
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

	public static class DeclareContext extends ParserRuleContext {
		public List<TerminalNode> T_ID() { return getTokens(MiniCParser.T_ID); }
		public TerminalNode T_ID(int i) {
			return getToken(MiniCParser.T_ID, i);
		}
		public TerminalNode T_FINAL() { return getToken(MiniCParser.T_FINAL, 0); }
		public TerminalNode T_INT() { return getToken(MiniCParser.T_INT, 0); }
		public TerminalNode T_FLOAT() { return getToken(MiniCParser.T_FLOAT, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(MiniCParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(MiniCParser.T_COMMA, i);
		}
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitDeclare(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !(_la==T_INT || _la==T_FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(42);
			match(T_ID);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(43);
				match(T_COMMA);
				setState(44);
				match(T_ID);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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

	public static class BlockContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(52);
					cmd();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(55); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmdDoWhileContext cmdDoWhile() {
			return getRuleContext(CmdDoWhileContext.class,0);
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
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_READ:
				{
				setState(57);
				cmdRead();
				}
				break;
			case T_WRITE:
				{
				setState(58);
				cmdWrite();
				}
				break;
			case T_ID:
				{
				setState(59);
				cmdAssign();
				}
				break;
			case T_IF:
				{
				setState(60);
				cmdCondition();
				}
				break;
			case T_WHILE:
				{
				setState(61);
				cmdWhile();
				}
				break;
			case T_DO:
				{
				setState(62);
				cmdDoWhile();
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
			setState(65);
			match(T_READ);
			setState(66);
			match(T_LP);
			setState(67);
			match(T_ID);
			setState(68);
			match(T_RP);
			setState(69);
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
		public TerminalNode STRING() { return getToken(MiniCParser.STRING, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T_WRITE);
			setState(72);
			match(T_LP);
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==T_ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(74);
			match(T_RP);
			setState(75);
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
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
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
			setState(77);
			ifStmt();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(78);
				elseStmt();
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
			setState(81);
			match(T_ID);
			setState(82);
			match(T_ASSIGN);
			setState(83);
			expression();
			setState(84);
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

	public static class CmdWhileContext extends ParserRuleContext {
		public TerminalNode T_WHILE() { return getToken(MiniCParser.T_WHILE, 0); }
		public TerminalNode T_LP() { return getToken(MiniCParser.T_LP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode T_RP() { return getToken(MiniCParser.T_RP, 0); }
		public TerminalNode T_LCB() { return getToken(MiniCParser.T_LCB, 0); }
		public TerminalNode T_RCB() { return getToken(MiniCParser.T_RCB, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitCmdWhile(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T_WHILE);
			setState(87);
			match(T_LP);
			setState(88);
			condition();
			setState(89);
			match(T_RP);
			setState(90);
			match(T_LCB);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_READ) | (1L << T_WRITE) | (1L << T_IF) | (1L << T_WHILE) | (1L << T_DO) | (1L << T_ID))) != 0)) {
				{
				{
				setState(91);
				block();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(T_RCB);
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

	public static class CmdDoWhileContext extends ParserRuleContext {
		public TerminalNode T_DO() { return getToken(MiniCParser.T_DO, 0); }
		public TerminalNode T_LCB() { return getToken(MiniCParser.T_LCB, 0); }
		public TerminalNode T_RCB() { return getToken(MiniCParser.T_RCB, 0); }
		public TerminalNode T_WHILE() { return getToken(MiniCParser.T_WHILE, 0); }
		public TerminalNode T_LP() { return getToken(MiniCParser.T_LP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode T_RP() { return getToken(MiniCParser.T_RP, 0); }
		public TerminalNode T_FINAL() { return getToken(MiniCParser.T_FINAL, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public CmdDoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdDoWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterCmdDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitCmdDoWhile(this);
		}
	}

	public final CmdDoWhileContext cmdDoWhile() throws RecognitionException {
		CmdDoWhileContext _localctx = new CmdDoWhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdDoWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T_DO);
			setState(100);
			match(T_LCB);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_READ) | (1L << T_WRITE) | (1L << T_IF) | (1L << T_WHILE) | (1L << T_DO) | (1L << T_ID))) != 0)) {
				{
				{
				setState(101);
				block();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(T_RCB);
			setState(108);
			match(T_WHILE);
			setState(109);
			match(T_LP);
			setState(110);
			condition();
			setState(111);
			match(T_RP);
			setState(112);
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(MiniCParser.T_IF, 0); }
		public TerminalNode T_LP() { return getToken(MiniCParser.T_LP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode T_RP() { return getToken(MiniCParser.T_RP, 0); }
		public TerminalNode T_LCB() { return getToken(MiniCParser.T_LCB, 0); }
		public TerminalNode T_RCB() { return getToken(MiniCParser.T_RCB, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T_IF);
			setState(115);
			match(T_LP);
			setState(116);
			condition();
			setState(117);
			match(T_RP);
			setState(118);
			match(T_LCB);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_READ) | (1L << T_WRITE) | (1L << T_IF) | (1L << T_WHILE) | (1L << T_DO) | (1L << T_ID))) != 0)) {
				{
				{
				setState(119);
				block();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(T_RCB);
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

	public static class ElseStmtContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(MiniCParser.T_ELSE, 0); }
		public TerminalNode T_LCB() { return getToken(MiniCParser.T_LCB, 0); }
		public TerminalNode T_RCB() { return getToken(MiniCParser.T_RCB, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitElseStmt(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T_ELSE);
			setState(128);
			match(T_LCB);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_READ) | (1L << T_WRITE) | (1L << T_IF) | (1L << T_WHILE) | (1L << T_DO) | (1L << T_ID))) != 0)) {
				{
				{
				setState(129);
				block();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(T_RCB);
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

	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode T_OPERATORS() { return getToken(MiniCParser.T_OPERATORS, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			expression();
			setState(138);
			match(T_OPERATORS);
			setState(139);
			expression();
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
		public List<TerminalNode> T_ARITH_1() { return getTokens(MiniCParser.T_ARITH_1); }
		public TerminalNode T_ARITH_1(int i) {
			return getToken(MiniCParser.T_ARITH_1, i);
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
		enterRule(_localctx, 26, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			term();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ARITH_1) {
				{
				{
				setState(142);
				match(T_ARITH_1);
				setState(143);
				term();
				}
				}
				setState(148);
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
		public List<TerminalNode> T_ARITH_2() { return getTokens(MiniCParser.T_ARITH_2); }
		public TerminalNode T_ARITH_2(int i) {
			return getToken(MiniCParser.T_ARITH_2, i);
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
		enterRule(_localctx, 28, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			factor();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ARITH_2) {
				{
				{
				setState(150);
				match(T_ARITH_2);
				setState(151);
				factor();
				}
				}
				setState(156);
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
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(T_NUM);
				}
				break;
			case T_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(T_ID);
				}
				break;
			case T_LP:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(159);
				match(T_LP);
				setState(160);
				expression();
				setState(161);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00a8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\6\2%\n\2\r\2\16\2&\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63"+
		"\13\3\3\3\3\3\3\4\6\48\n\4\r\4\16\49\3\5\3\5\3\5\3\5\3\5\3\5\5\5B\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\bR\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n_\n\n\f\n\16\nb\13\n\3\n\3"+
		"\n\3\13\3\13\3\13\7\13i\n\13\f\13\16\13l\13\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f{\n\f\f\f\16\f~\13\f\3\f\3\f\3\r"+
		"\3\r\3\r\7\r\u0085\n\r\f\r\16\r\u0088\13\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\7\17\u0093\n\17\f\17\16\17\u0096\13\17\3\20\3\20\3\20"+
		"\7\20\u009b\n\20\f\20\16\20\u009e\13\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00a6\n\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2"+
		"\4\3\2\f\r\4\2\23\23\26\26\2\u00a8\2\"\3\2\2\2\4+\3\2\2\2\6\67\3\2\2\2"+
		"\bA\3\2\2\2\nC\3\2\2\2\fI\3\2\2\2\16O\3\2\2\2\20S\3\2\2\2\22X\3\2\2\2"+
		"\24e\3\2\2\2\26t\3\2\2\2\30\u0081\3\2\2\2\32\u008b\3\2\2\2\34\u008f\3"+
		"\2\2\2\36\u0097\3\2\2\2 \u00a5\3\2\2\2\"$\7\4\2\2#%\5\4\3\2$#\3\2\2\2"+
		"%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\5\6\4\2)*\7\5\2\2*\3\3\2"+
		"\2\2+,\t\2\2\2,\61\7\23\2\2-.\7\35\2\2.\60\7\23\2\2/-\3\2\2\2\60\63\3"+
		"\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\27"+
		"\2\2\65\5\3\2\2\2\668\5\b\5\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3"+
		"\2\2\2:\7\3\2\2\2;B\5\n\6\2<B\5\f\7\2=B\5\20\t\2>B\5\16\b\2?B\5\22\n\2"+
		"@B\5\24\13\2A;\3\2\2\2A<\3\2\2\2A=\3\2\2\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2"+
		"\2B\t\3\2\2\2CD\7\7\2\2DE\7\33\2\2EF\7\23\2\2FG\7\34\2\2GH\7\27\2\2H\13"+
		"\3\2\2\2IJ\7\b\2\2JK\7\33\2\2KL\t\3\2\2LM\7\34\2\2MN\7\27\2\2N\r\3\2\2"+
		"\2OQ\5\26\f\2PR\5\30\r\2QP\3\2\2\2QR\3\2\2\2R\17\3\2\2\2ST\7\23\2\2TU"+
		"\7\30\2\2UV\5\34\17\2VW\7\27\2\2W\21\3\2\2\2XY\7\16\2\2YZ\7\33\2\2Z[\5"+
		"\32\16\2[\\\7\34\2\2\\`\7\31\2\2]_\5\6\4\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2"+
		"\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7\32\2\2d\23\3\2\2\2ef\7\17\2\2fj\7"+
		"\31\2\2gi\5\6\4\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj"+
		"\3\2\2\2mn\7\32\2\2no\7\16\2\2op\7\33\2\2pq\5\32\16\2qr\7\34\2\2rs\7\27"+
		"\2\2s\25\3\2\2\2tu\7\t\2\2uv\7\33\2\2vw\5\32\16\2wx\7\34\2\2x|\7\31\2"+
		"\2y{\5\6\4\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3"+
		"\2\2\2\177\u0080\7\32\2\2\u0080\27\3\2\2\2\u0081\u0082\7\13\2\2\u0082"+
		"\u0086\7\31\2\2\u0083\u0085\5\6\4\2\u0084\u0083\3\2\2\2\u0085\u0088\3"+
		"\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008a\7\32\2\2\u008a\31\3\2\2\2\u008b\u008c\5\34"+
		"\17\2\u008c\u008d\7\20\2\2\u008d\u008e\5\34\17\2\u008e\33\3\2\2\2\u008f"+
		"\u0094\5\36\20\2\u0090\u0091\7\21\2\2\u0091\u0093\5\36\20\2\u0092\u0090"+
		"\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\35\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009c\5 \21\2\u0098\u0099\7\22\2"+
		"\2\u0099\u009b\5 \21\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\37\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a6\7\25\2\2\u00a0\u00a6\7\23\2\2\u00a1\u00a2\7\33\2\2\u00a2\u00a3"+
		"\5\34\17\2\u00a3\u00a4\7\34\2\2\u00a4\u00a6\3\2\2\2\u00a5\u009f\3\2\2"+
		"\2\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6!\3\2\2\2\16&\619AQ`j"+
		"|\u0086\u0094\u009c\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}