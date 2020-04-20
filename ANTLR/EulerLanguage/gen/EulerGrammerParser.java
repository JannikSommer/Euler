// Generated from C:/Users/janni/IdeaProjects/EulerLanguage/Grammar\EulerGrammer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EulerGrammerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOLLAR=1, SEMI=2, ASSIGN=3, LT=4, BT=5, EQEQ=6, NOTEQ=7, LTEQ=8, BTEQ=9, 
		IF=10, THEN=11, ELSE=12, END=13, WHILE=14, DO=15, PRINT=16, NEWLINE=17, 
		WHITESPACE=18, PLUS=19, MINUS=20, MULT=21, DIVID=22, MOD=23, LPAREN=24, 
		RPAREN=25, LSQBRACK=26, RSQBRACK=27, COMMA=28, NUM=29, MATRIX=30, VECTOR=31, 
		STRING=32, ID=33;
	public static final int
		RULE_program = 0, RULE_dcls = 1, RULE_dcl = 2, RULE_stmts = 3, RULE_stmt = 4, 
		RULE_expr = 5, RULE_ctrlstmt = 6, RULE_ifstmt = 7, RULE_elsestmts = 8, 
		RULE_elseifstmts = 9, RULE_printstmt = 10, RULE_stringstmt = 11, RULE_appendsting = 12, 
		RULE_valindex = 13, RULE_iterstmt = 14, RULE_whilestmt = 15, RULE_assignstmt = 16, 
		RULE_addexpr = 17, RULE_multiexpr = 18, RULE_primeexpr = 19, RULE_logstmt = 20, 
		RULE_logop = 21, RULE_ariop = 22, RULE_mulop = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "dcls", "dcl", "stmts", "stmt", "expr", "ctrlstmt", "ifstmt", 
			"elsestmts", "elseifstmts", "printstmt", "stringstmt", "appendsting", 
			"valindex", "iterstmt", "whilestmt", "assignstmt", "addexpr", "multiexpr", 
			"primeexpr", "logstmt", "logop", "ariop", "mulop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", "';'", "'='", "'<'", "'>'", "'=='", "'!='", "'<='", "'>='", 
			"'if'", "'then'", "'else'", "'end'", "'while'", "'do'", "'print'", null, 
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'['", "']'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOLLAR", "SEMI", "ASSIGN", "LT", "BT", "EQEQ", "NOTEQ", "LTEQ", 
			"BTEQ", "IF", "THEN", "ELSE", "END", "WHILE", "DO", "PRINT", "NEWLINE", 
			"WHITESPACE", "PLUS", "MINUS", "MULT", "DIVID", "MOD", "LPAREN", "RPAREN", 
			"LSQBRACK", "RSQBRACK", "COMMA", "NUM", "MATRIX", "VECTOR", "STRING", 
			"ID"
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
	public String getGrammarFileName() { return "EulerGrammer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EulerGrammerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public DclsContext dcls() {
			return getRuleContext(DclsContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode DOLLAR() { return getToken(EulerGrammerParser.DOLLAR, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			dcls();
			setState(49);
			stmts();
			setState(50);
			match(DOLLAR);
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

	public static class DclsContext extends ParserRuleContext {
		public List<DclContext> dcl() {
			return getRuleContexts(DclContext.class);
		}
		public DclContext dcl(int i) {
			return getRuleContext(DclContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(EulerGrammerParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(EulerGrammerParser.SEMI, i);
		}
		public DclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterDcls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitDcls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitDcls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclsContext dcls() throws RecognitionException {
		DclsContext _localctx = new DclsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dcls);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(52);
					dcl();
					setState(53);
					match(SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(57); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class DclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EulerGrammerParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(EulerGrammerParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode VECTOR() { return getToken(EulerGrammerParser.VECTOR, 0); }
		public TerminalNode MATRIX() { return getToken(EulerGrammerParser.MATRIX, 0); }
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dcl);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(ID);
				setState(61);
				match(ASSIGN);
				setState(62);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(ID);
				setState(64);
				match(ASSIGN);
				setState(65);
				match(VECTOR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(ID);
				setState(67);
				match(ASSIGN);
				setState(68);
				match(MATRIX);
				}
				break;
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

	public static class StmtsContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << LPAREN) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(71);
				stmt();
				}
				}
				setState(76);
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

	public static class StmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(EulerGrammerParser.SEMI, 0); }
		public CtrlstmtContext ctrlstmt() {
			return getRuleContext(CtrlstmtContext.class,0);
		}
		public IterstmtContext iterstmt() {
			return getRuleContext(IterstmtContext.class,0);
		}
		public AssignstmtContext assignstmt() {
			return getRuleContext(AssignstmtContext.class,0);
		}
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				expr();
				setState(78);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				ctrlstmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				iterstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				assignstmt();
				setState(83);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				printstmt();
				setState(86);
				match(SEMI);
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			addexpr();
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

	public static class CtrlstmtContext extends ParserRuleContext {
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public CtrlstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctrlstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterCtrlstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitCtrlstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitCtrlstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtrlstmtContext ctrlstmt() throws RecognitionException {
		CtrlstmtContext _localctx = new CtrlstmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ctrlstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			ifstmt();
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

	public static class IfstmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(EulerGrammerParser.IF, 0); }
		public LogstmtContext logstmt() {
			return getRuleContext(LogstmtContext.class,0);
		}
		public TerminalNode THEN() { return getToken(EulerGrammerParser.THEN, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public ElsestmtsContext elsestmts() {
			return getRuleContext(ElsestmtsContext.class,0);
		}
		public TerminalNode END() { return getToken(EulerGrammerParser.END, 0); }
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(IF);
			setState(95);
			logstmt();
			setState(96);
			match(THEN);
			setState(97);
			stmts();
			setState(98);
			elsestmts();
			setState(99);
			match(END);
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

	public static class ElsestmtsContext extends ParserRuleContext {
		public ElseifstmtsContext elseifstmts() {
			return getRuleContext(ElseifstmtsContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(EulerGrammerParser.ELSE, 0); }
		public TerminalNode THEN() { return getToken(EulerGrammerParser.THEN, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public ElsestmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterElsestmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitElsestmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitElsestmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsestmtsContext elsestmts() throws RecognitionException {
		ElsestmtsContext _localctx = new ElsestmtsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elsestmts);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				elseifstmts();
				setState(102);
				match(ELSE);
				setState(103);
				match(THEN);
				setState(104);
				stmts();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				elseifstmts();
				}
				break;
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

	public static class ElseifstmtsContext extends ParserRuleContext {
		public List<TerminalNode> ELSE() { return getTokens(EulerGrammerParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(EulerGrammerParser.ELSE, i);
		}
		public List<TerminalNode> IF() { return getTokens(EulerGrammerParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(EulerGrammerParser.IF, i);
		}
		public List<LogstmtContext> logstmt() {
			return getRuleContexts(LogstmtContext.class);
		}
		public LogstmtContext logstmt(int i) {
			return getRuleContext(LogstmtContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(EulerGrammerParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(EulerGrammerParser.THEN, i);
		}
		public List<StmtsContext> stmts() {
			return getRuleContexts(StmtsContext.class);
		}
		public StmtsContext stmts(int i) {
			return getRuleContext(StmtsContext.class,i);
		}
		public ElseifstmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifstmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterElseifstmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitElseifstmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitElseifstmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifstmtsContext elseifstmts() throws RecognitionException {
		ElseifstmtsContext _localctx = new ElseifstmtsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elseifstmts);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(109);
					match(ELSE);
					setState(110);
					match(IF);
					setState(111);
					logstmt();
					setState(112);
					match(THEN);
					setState(113);
					stmts();
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class PrintstmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(EulerGrammerParser.PRINT, 0); }
		public StringstmtContext stringstmt() {
			return getRuleContext(StringstmtContext.class,0);
		}
		public PrintstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterPrintstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitPrintstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitPrintstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(PRINT);
			setState(121);
			stringstmt();
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

	public static class StringstmtContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(EulerGrammerParser.STRING, 0); }
		public AppendstingContext appendsting() {
			return getRuleContext(AppendstingContext.class,0);
		}
		public TerminalNode NUM() { return getToken(EulerGrammerParser.NUM, 0); }
		public TerminalNode ID() { return getToken(EulerGrammerParser.ID, 0); }
		public ValindexContext valindex() {
			return getRuleContext(ValindexContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(EulerGrammerParser.NEWLINE, 0); }
		public StringstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterStringstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitStringstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitStringstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringstmtContext stringstmt() throws RecognitionException {
		StringstmtContext _localctx = new StringstmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stringstmt);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(123);
					appendsting();
					}
					break;
				}
				setState(126);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(127);
					appendsting();
					}
					break;
				}
				setState(130);
				match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(131);
					appendsting();
					}
					break;
				}
				setState(134);
				match(ID);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQBRACK) {
					{
					setState(135);
					valindex();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(138);
					appendsting();
					}
					break;
				}
				setState(141);
				match(NEWLINE);
				}
				break;
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

	public static class AppendstingContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(EulerGrammerParser.STRING, 0); }
		public TerminalNode PLUS() { return getToken(EulerGrammerParser.PLUS, 0); }
		public AppendstingContext appendsting() {
			return getRuleContext(AppendstingContext.class,0);
		}
		public TerminalNode NUM() { return getToken(EulerGrammerParser.NUM, 0); }
		public TerminalNode ID() { return getToken(EulerGrammerParser.ID, 0); }
		public ValindexContext valindex() {
			return getRuleContext(ValindexContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(EulerGrammerParser.NEWLINE, 0); }
		public AppendstingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendsting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterAppendsting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitAppendsting(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitAppendsting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendstingContext appendsting() throws RecognitionException {
		AppendstingContext _localctx = new AppendstingContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_appendsting);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(STRING);
				setState(145);
				match(PLUS);
				setState(147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(146);
					appendsting();
					}
					break;
				}
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(NUM);
				setState(150);
				match(PLUS);
				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(151);
					appendsting();
					}
					break;
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(ID);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQBRACK) {
					{
					setState(155);
					valindex();
					}
				}

				setState(158);
				match(PLUS);
				setState(160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(159);
					appendsting();
					}
					break;
				}
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(NEWLINE);
				setState(163);
				match(PLUS);
				setState(165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(164);
					appendsting();
					}
					break;
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

	public static class ValindexContext extends ParserRuleContext {
		public TerminalNode LSQBRACK() { return getToken(EulerGrammerParser.LSQBRACK, 0); }
		public List<TerminalNode> NUM() { return getTokens(EulerGrammerParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(EulerGrammerParser.NUM, i);
		}
		public TerminalNode RSQBRACK() { return getToken(EulerGrammerParser.RSQBRACK, 0); }
		public TerminalNode COMMA() { return getToken(EulerGrammerParser.COMMA, 0); }
		public ValindexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valindex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterValindex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitValindex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitValindex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValindexContext valindex() throws RecognitionException {
		ValindexContext _localctx = new ValindexContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_valindex);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(LSQBRACK);
				setState(170);
				match(NUM);
				setState(171);
				match(RSQBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(LSQBRACK);
				setState(173);
				match(NUM);
				setState(174);
				match(COMMA);
				setState(175);
				match(NUM);
				setState(176);
				match(RSQBRACK);
				}
				break;
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

	public static class IterstmtContext extends ParserRuleContext {
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public IterstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterIterstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitIterstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitIterstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterstmtContext iterstmt() throws RecognitionException {
		IterstmtContext _localctx = new IterstmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_iterstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			whilestmt();
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

	public static class WhilestmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(EulerGrammerParser.WHILE, 0); }
		public LogstmtContext logstmt() {
			return getRuleContext(LogstmtContext.class,0);
		}
		public TerminalNode DO() { return getToken(EulerGrammerParser.DO, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode END() { return getToken(EulerGrammerParser.END, 0); }
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitWhilestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitWhilestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(WHILE);
			setState(182);
			logstmt();
			setState(183);
			match(DO);
			setState(184);
			stmts();
			setState(185);
			match(END);
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

	public static class AssignstmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EulerGrammerParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(EulerGrammerParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ValindexContext valindex() {
			return getRuleContext(ValindexContext.class,0);
		}
		public AssignstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterAssignstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitAssignstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitAssignstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignstmtContext assignstmt() throws RecognitionException {
		AssignstmtContext _localctx = new AssignstmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ID);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQBRACK) {
				{
				setState(188);
				valindex();
				}
			}

			setState(191);
			match(ASSIGN);
			setState(192);
			expr();
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

	public static class AddexprContext extends ParserRuleContext {
		public MultiexprContext multiexpr() {
			return getRuleContext(MultiexprContext.class,0);
		}
		public AriopContext ariop() {
			return getRuleContext(AriopContext.class,0);
		}
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public AddexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterAddexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitAddexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitAddexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddexprContext addexpr() throws RecognitionException {
		AddexprContext _localctx = new AddexprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_addexpr);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				multiexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				multiexpr();
				setState(196);
				ariop();
				setState(197);
				addexpr();
				}
				break;
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

	public static class MultiexprContext extends ParserRuleContext {
		public PrimeexprContext primeexpr() {
			return getRuleContext(PrimeexprContext.class,0);
		}
		public MulopContext mulop() {
			return getRuleContext(MulopContext.class,0);
		}
		public MultiexprContext multiexpr() {
			return getRuleContext(MultiexprContext.class,0);
		}
		public MultiexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterMultiexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitMultiexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitMultiexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiexprContext multiexpr() throws RecognitionException {
		MultiexprContext _localctx = new MultiexprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiexpr);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				primeexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				primeexpr();
				setState(203);
				mulop();
				setState(204);
				multiexpr();
				}
				break;
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

	public static class PrimeexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EulerGrammerParser.ID, 0); }
		public ValindexContext valindex() {
			return getRuleContext(ValindexContext.class,0);
		}
		public TerminalNode NUM() { return getToken(EulerGrammerParser.NUM, 0); }
		public TerminalNode LPAREN() { return getToken(EulerGrammerParser.LPAREN, 0); }
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EulerGrammerParser.RPAREN, 0); }
		public PrimeexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primeexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterPrimeexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitPrimeexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitPrimeexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimeexprContext primeexpr() throws RecognitionException {
		PrimeexprContext _localctx = new PrimeexprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primeexpr);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(ID);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQBRACK) {
					{
					setState(209);
					valindex();
					}
				}

				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(NUM);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(LPAREN);
				setState(214);
				addexpr();
				setState(215);
				match(RPAREN);
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

	public static class LogstmtContext extends ParserRuleContext {
		public List<AddexprContext> addexpr() {
			return getRuleContexts(AddexprContext.class);
		}
		public AddexprContext addexpr(int i) {
			return getRuleContext(AddexprContext.class,i);
		}
		public LogopContext logop() {
			return getRuleContext(LogopContext.class,0);
		}
		public LogstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterLogstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitLogstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitLogstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogstmtContext logstmt() throws RecognitionException {
		LogstmtContext _localctx = new LogstmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			addexpr();
			setState(220);
			logop();
			setState(221);
			addexpr();
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

	public static class LogopContext extends ParserRuleContext {
		public TerminalNode EQEQ() { return getToken(EulerGrammerParser.EQEQ, 0); }
		public TerminalNode BT() { return getToken(EulerGrammerParser.BT, 0); }
		public TerminalNode LT() { return getToken(EulerGrammerParser.LT, 0); }
		public TerminalNode BTEQ() { return getToken(EulerGrammerParser.BTEQ, 0); }
		public TerminalNode LTEQ() { return getToken(EulerGrammerParser.LTEQ, 0); }
		public TerminalNode NOTEQ() { return getToken(EulerGrammerParser.NOTEQ, 0); }
		public LogopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterLogop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitLogop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitLogop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogopContext logop() throws RecognitionException {
		LogopContext _localctx = new LogopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << BT) | (1L << EQEQ) | (1L << NOTEQ) | (1L << LTEQ) | (1L << BTEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AriopContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(EulerGrammerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(EulerGrammerParser.MINUS, 0); }
		public AriopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ariop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterAriop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitAriop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitAriop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AriopContext ariop() throws RecognitionException {
		AriopContext _localctx = new AriopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ariop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MulopContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(EulerGrammerParser.MULT, 0); }
		public TerminalNode DIVID() { return getToken(EulerGrammerParser.DIVID, 0); }
		public TerminalNode MOD() { return getToken(EulerGrammerParser.MOD, 0); }
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).enterMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EulerGrammerListener ) ((EulerGrammerListener)listener).exitMulop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EulerGrammerVisitor ) return ((EulerGrammerVisitor<? extends T>)visitor).visitMulop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIVID) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00e8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\6\3:\n\3\r\3\16\3;\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4H\n\4\3\5\7\5K\n\5\f\5\16\5N\13\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nn\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\7\13v\n\13\f\13\16\13y\13\13\3\f\3\f\3\f\3\r\5\r\177\n\r\3\r"+
		"\3\r\5\r\u0083\n\r\3\r\3\r\5\r\u0087\n\r\3\r\3\r\5\r\u008b\n\r\3\r\5\r"+
		"\u008e\n\r\3\r\5\r\u0091\n\r\3\16\3\16\3\16\5\16\u0096\n\16\3\16\3\16"+
		"\3\16\5\16\u009b\n\16\3\16\3\16\5\16\u009f\n\16\3\16\3\16\5\16\u00a3\n"+
		"\16\3\16\3\16\3\16\5\16\u00a8\n\16\5\16\u00aa\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00b4\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\5\22\u00c0\n\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00ca\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u00d1\n\24\3\25\3\25\5"+
		"\25\u00d5\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u00dc\n\25\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\2\5\3\2\6\13\3\2\25\26\3\2\27\31\2\u00f1\2"+
		"\62\3\2\2\2\49\3\2\2\2\6G\3\2\2\2\bL\3\2\2\2\nZ\3\2\2\2\f\\\3\2\2\2\16"+
		"^\3\2\2\2\20`\3\2\2\2\22m\3\2\2\2\24w\3\2\2\2\26z\3\2\2\2\30\u0090\3\2"+
		"\2\2\32\u00a9\3\2\2\2\34\u00b3\3\2\2\2\36\u00b5\3\2\2\2 \u00b7\3\2\2\2"+
		"\"\u00bd\3\2\2\2$\u00c9\3\2\2\2&\u00d0\3\2\2\2(\u00db\3\2\2\2*\u00dd\3"+
		"\2\2\2,\u00e1\3\2\2\2.\u00e3\3\2\2\2\60\u00e5\3\2\2\2\62\63\5\4\3\2\63"+
		"\64\5\b\5\2\64\65\7\3\2\2\65\3\3\2\2\2\66\67\5\6\4\2\678\7\4\2\28:\3\2"+
		"\2\29\66\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\5\3\2\2\2=H\7#\2\2>?\7"+
		"#\2\2?@\7\5\2\2@H\5\f\7\2AB\7#\2\2BC\7\5\2\2CH\7!\2\2DE\7#\2\2EF\7\5\2"+
		"\2FH\7 \2\2G=\3\2\2\2G>\3\2\2\2GA\3\2\2\2GD\3\2\2\2H\7\3\2\2\2IK\5\n\6"+
		"\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\t\3\2\2\2NL\3\2\2\2OP\5\f"+
		"\7\2PQ\7\4\2\2Q[\3\2\2\2R[\5\16\b\2S[\5\36\20\2TU\5\"\22\2UV\7\4\2\2V"+
		"[\3\2\2\2WX\5\26\f\2XY\7\4\2\2Y[\3\2\2\2ZO\3\2\2\2ZR\3\2\2\2ZS\3\2\2\2"+
		"ZT\3\2\2\2ZW\3\2\2\2[\13\3\2\2\2\\]\5$\23\2]\r\3\2\2\2^_\5\20\t\2_\17"+
		"\3\2\2\2`a\7\f\2\2ab\5*\26\2bc\7\r\2\2cd\5\b\5\2de\5\22\n\2ef\7\17\2\2"+
		"f\21\3\2\2\2gh\5\24\13\2hi\7\16\2\2ij\7\r\2\2jk\5\b\5\2kn\3\2\2\2ln\5"+
		"\24\13\2mg\3\2\2\2ml\3\2\2\2n\23\3\2\2\2op\7\16\2\2pq\7\f\2\2qr\5*\26"+
		"\2rs\7\r\2\2st\5\b\5\2tv\3\2\2\2uo\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2"+
		"\2x\25\3\2\2\2yw\3\2\2\2z{\7\22\2\2{|\5\30\r\2|\27\3\2\2\2}\177\5\32\16"+
		"\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0091\7\"\2\2\u0081"+
		"\u0083\5\32\16\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3"+
		"\2\2\2\u0084\u0091\7\37\2\2\u0085\u0087\5\32\16\2\u0086\u0085\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\7#\2\2\u0089\u008b"+
		"\5\34\17\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0091\3\2\2\2"+
		"\u008c\u008e\5\32\16\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0091\7\23\2\2\u0090~\3\2\2\2\u0090\u0082\3\2\2\2\u0090"+
		"\u0086\3\2\2\2\u0090\u008d\3\2\2\2\u0091\31\3\2\2\2\u0092\u0093\7\"\2"+
		"\2\u0093\u0095\7\25\2\2\u0094\u0096\5\32\16\2\u0095\u0094\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u00aa\3\2\2\2\u0097\u0098\7\37\2\2\u0098\u009a\7"+
		"\25\2\2\u0099\u009b\5\32\16\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2"+
		"\u009b\u00aa\3\2\2\2\u009c\u009e\7#\2\2\u009d\u009f\5\34\17\2\u009e\u009d"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\7\25\2\2"+
		"\u00a1\u00a3\5\32\16\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00aa"+
		"\3\2\2\2\u00a4\u00a5\7\23\2\2\u00a5\u00a7\7\25\2\2\u00a6\u00a8\5\32\16"+
		"\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u0092"+
		"\3\2\2\2\u00a9\u0097\3\2\2\2\u00a9\u009c\3\2\2\2\u00a9\u00a4\3\2\2\2\u00aa"+
		"\33\3\2\2\2\u00ab\u00ac\7\34\2\2\u00ac\u00ad\7\37\2\2\u00ad\u00b4\7\35"+
		"\2\2\u00ae\u00af\7\34\2\2\u00af\u00b0\7\37\2\2\u00b0\u00b1\7\36\2\2\u00b1"+
		"\u00b2\7\37\2\2\u00b2\u00b4\7\35\2\2\u00b3\u00ab\3\2\2\2\u00b3\u00ae\3"+
		"\2\2\2\u00b4\35\3\2\2\2\u00b5\u00b6\5 \21\2\u00b6\37\3\2\2\2\u00b7\u00b8"+
		"\7\20\2\2\u00b8\u00b9\5*\26\2\u00b9\u00ba\7\21\2\2\u00ba\u00bb\5\b\5\2"+
		"\u00bb\u00bc\7\17\2\2\u00bc!\3\2\2\2\u00bd\u00bf\7#\2\2\u00be\u00c0\5"+
		"\34\17\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c2\7\5\2\2\u00c2\u00c3\5\f\7\2\u00c3#\3\2\2\2\u00c4\u00ca\5&\24\2"+
		"\u00c5\u00c6\5&\24\2\u00c6\u00c7\5.\30\2\u00c7\u00c8\5$\23\2\u00c8\u00ca"+
		"\3\2\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca%\3\2\2\2\u00cb"+
		"\u00d1\5(\25\2\u00cc\u00cd\5(\25\2\u00cd\u00ce\5\60\31\2\u00ce\u00cf\5"+
		"&\24\2\u00cf\u00d1\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1"+
		"\'\3\2\2\2\u00d2\u00d4\7#\2\2\u00d3\u00d5\5\34\17\2\u00d4\u00d3\3\2\2"+
		"\2\u00d4\u00d5\3\2\2\2\u00d5\u00dc\3\2\2\2\u00d6\u00dc\7\37\2\2\u00d7"+
		"\u00d8\7\32\2\2\u00d8\u00d9\5$\23\2\u00d9\u00da\7\33\2\2\u00da\u00dc\3"+
		"\2\2\2\u00db\u00d2\3\2\2\2\u00db\u00d6\3\2\2\2\u00db\u00d7\3\2\2\2\u00dc"+
		")\3\2\2\2\u00dd\u00de\5$\23\2\u00de\u00df\5,\27\2\u00df\u00e0\5$\23\2"+
		"\u00e0+\3\2\2\2\u00e1\u00e2\t\2\2\2\u00e2-\3\2\2\2\u00e3\u00e4\t\3\2\2"+
		"\u00e4/\3\2\2\2\u00e5\u00e6\t\4\2\2\u00e6\61\3\2\2\2\32;GLZmw~\u0082\u0086"+
		"\u008a\u008d\u0090\u0095\u009a\u009e\u00a2\u00a7\u00a9\u00b3\u00bf\u00c9"+
		"\u00d0\u00d4\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}