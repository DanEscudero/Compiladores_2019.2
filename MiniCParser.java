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
		T_THEN=8, T_ELSE=9, T_INT=10, T_FLOAT=11, T_OPERATORS=12, T_ARITH_1=13, 
		T_ARITH_2=14, T_ID=15, T_LETTER=16, T_NUM=17, STRING=18, T_FINAL=19, T_ASSIGN=20, 
		T_LCB=21, T_RCB=22, T_LP=23, T_RP=24, T_COMMA=25, T_QUOTE=26, T_SQUOTE=27;
	public static final int
		RULE_prog = 0, RULE_declare = 1, RULE_block = 2, RULE_cmd = 3, RULE_cmdRead = 4, 
		RULE_cmdWrite = 5, RULE_cmdCondition = 6, RULE_ifStmt = 7, RULE_elseStmt = 8, 
		RULE_condition = 9, RULE_cmdAssign = 10, RULE_expression = 11, RULE_term = 12, 
		RULE_factor = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declare", "block", "cmd", "cmdRead", "cmdWrite", "cmdCondition", 
			"ifStmt", "elseStmt", "condition", "cmdAssign", "expression", "term", 
			"factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'programa'", "'fimPrograma'", "'var'", "'leia'", "'escreva'", 
			"'se'", "'entao'", "'senao'", "'int'", "'float'", null, null, null, null, 
			null, null, null, "';'", "'='", "'{'", "'}'", "'('", "')'", "','", "'\"'", 
			"'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "T_BLANK", "T_INIT", "T_END", "T_DECLARE", "T_READ", "T_WRITE", 
			"T_IF", "T_THEN", "T_ELSE", "T_INT", "T_FLOAT", "T_OPERATORS", "T_ARITH_1", 
			"T_ARITH_2", "T_ID", "T_LETTER", "T_NUM", "STRING", "T_FINAL", "T_ASSIGN", 
			"T_LCB", "T_RCB", "T_LP", "T_RP", "T_COMMA", "T_QUOTE", "T_SQUOTE"
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
			setState(28);
			match(T_INIT);
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				declare();
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_INT || _la==T_FLOAT );
			setState(34);
			block();
			setState(35);
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
			setState(37);
			_la = _input.LA(1);
			if ( !(_la==T_INT || _la==T_FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(38);
			match(T_ID);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(39);
				match(T_COMMA);
				setState(40);
				match(T_ID);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				cmd();
				}
				}
				setState(51); 
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
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_READ:
				{
				setState(53);
				cmdRead();
				}
				break;
			case T_WRITE:
				{
				setState(54);
				cmdWrite();
				}
				break;
			case T_ID:
				{
				setState(55);
				cmdAssign();
				}
				break;
			case T_IF:
				{
				setState(56);
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
			setState(59);
			match(T_READ);
			setState(60);
			match(T_LP);
			setState(61);
			match(T_ID);
			setState(62);
			match(T_RP);
			setState(63);
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
			setState(65);
			match(T_WRITE);
			setState(66);
			match(T_LP);
			setState(67);
			_la = _input.LA(1);
			if ( !(_la==T_ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
			setState(71);
			ifStmt();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(72);
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(MiniCParser.T_IF, 0); }
		public TerminalNode T_LP() { return getToken(MiniCParser.T_LP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode T_RP() { return getToken(MiniCParser.T_RP, 0); }
		public TerminalNode T_LCB() { return getToken(MiniCParser.T_LCB, 0); }
		public TerminalNode T_RCB() { return getToken(MiniCParser.T_RCB, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
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
		enterRule(_localctx, 14, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T_IF);
			setState(76);
			match(T_LP);
			setState(77);
			condition();
			setState(78);
			match(T_RP);
			setState(79);
			match(T_LCB);
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				cmd();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_READ) | (1L << T_WRITE) | (1L << T_IF) | (1L << T_ID))) != 0) );
			setState(85);
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
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
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
		enterRule(_localctx, 16, RULE_elseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T_ELSE);
			setState(88);
			match(T_LCB);
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				cmd();
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_READ) | (1L << T_WRITE) | (1L << T_IF) | (1L << T_ID))) != 0) );
			setState(94);
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
		enterRule(_localctx, 18, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			expression();
			setState(97);
			match(T_OPERATORS);
			setState(98);
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
		enterRule(_localctx, 20, RULE_cmdAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T_ID);
			setState(101);
			match(T_ASSIGN);
			setState(102);
			expression();
			setState(103);
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
		enterRule(_localctx, 22, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			term();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ARITH_1) {
				{
				{
				setState(106);
				match(T_ARITH_1);
				setState(107);
				term();
				}
				}
				setState(112);
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
		enterRule(_localctx, 24, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			factor();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ARITH_2) {
				{
				{
				setState(114);
				match(T_ARITH_2);
				setState(115);
				factor();
				}
				}
				setState(120);
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
		enterRule(_localctx, 26, RULE_factor);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(T_NUM);
				}
				break;
			case T_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(T_ID);
				}
				break;
			case T_LP:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(123);
				match(T_LP);
				setState(124);
				expression();
				setState(125);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u0084\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\6\2!\n\2\r\2\16\2\""+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\3\3\3\4\6\4\64"+
		"\n\4\r\4\16\4\65\3\5\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\bL\n\b\3\t\3\t\3\t\3\t\3\t\3\t\6\tT\n\t"+
		"\r\t\16\tU\3\t\3\t\3\n\3\n\3\n\6\n]\n\n\r\n\16\n^\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\ro\n\r\f\r\16\rr\13\r\3\16"+
		"\3\16\3\16\7\16w\n\16\f\16\16\16z\13\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0082\n\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\4\3"+
		"\2\f\r\4\2\21\21\24\24\2\u0082\2\36\3\2\2\2\4\'\3\2\2\2\6\63\3\2\2\2\b"+
		";\3\2\2\2\n=\3\2\2\2\fC\3\2\2\2\16I\3\2\2\2\20M\3\2\2\2\22Y\3\2\2\2\24"+
		"b\3\2\2\2\26f\3\2\2\2\30k\3\2\2\2\32s\3\2\2\2\34\u0081\3\2\2\2\36 \7\4"+
		"\2\2\37!\5\4\3\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2"+
		"\2$%\5\6\4\2%&\7\5\2\2&\3\3\2\2\2\'(\t\2\2\2(-\7\21\2\2)*\7\33\2\2*,\7"+
		"\21\2\2+)\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2"+
		"\60\61\7\25\2\2\61\5\3\2\2\2\62\64\5\b\5\2\63\62\3\2\2\2\64\65\3\2\2\2"+
		"\65\63\3\2\2\2\65\66\3\2\2\2\66\7\3\2\2\2\67<\5\n\6\28<\5\f\7\29<\5\26"+
		"\f\2:<\5\16\b\2;\67\3\2\2\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<\t\3\2\2\2="+
		">\7\7\2\2>?\7\31\2\2?@\7\21\2\2@A\7\32\2\2AB\7\25\2\2B\13\3\2\2\2CD\7"+
		"\b\2\2DE\7\31\2\2EF\t\3\2\2FG\7\32\2\2GH\7\25\2\2H\r\3\2\2\2IK\5\20\t"+
		"\2JL\5\22\n\2KJ\3\2\2\2KL\3\2\2\2L\17\3\2\2\2MN\7\t\2\2NO\7\31\2\2OP\5"+
		"\24\13\2PQ\7\32\2\2QS\7\27\2\2RT\5\b\5\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2"+
		"UV\3\2\2\2VW\3\2\2\2WX\7\30\2\2X\21\3\2\2\2YZ\7\13\2\2Z\\\7\27\2\2[]\5"+
		"\b\5\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\30\2\2"+
		"a\23\3\2\2\2bc\5\30\r\2cd\7\16\2\2de\5\30\r\2e\25\3\2\2\2fg\7\21\2\2g"+
		"h\7\26\2\2hi\5\30\r\2ij\7\25\2\2j\27\3\2\2\2kp\5\32\16\2lm\7\17\2\2mo"+
		"\5\32\16\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\31\3\2\2\2rp\3\2\2"+
		"\2sx\5\34\17\2tu\7\20\2\2uw\5\34\17\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy"+
		"\3\2\2\2y\33\3\2\2\2zx\3\2\2\2{\u0082\7\23\2\2|\u0082\7\21\2\2}~\7\31"+
		"\2\2~\177\5\30\r\2\177\u0080\7\32\2\2\u0080\u0082\3\2\2\2\u0081{\3\2\2"+
		"\2\u0081|\3\2\2\2\u0081}\3\2\2\2\u0082\35\3\2\2\2\f\"-\65;KU^px\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}