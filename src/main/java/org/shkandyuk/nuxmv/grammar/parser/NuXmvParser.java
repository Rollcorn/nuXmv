// Generated from /home/denis/Documents/5_ITMO/NIR/nuXmv/NuXmvParser.g4 by ANTLR 4.13.1
package org.shkandyuk.nuxmv.grammar.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class NuXmvParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MODULE=1, IVAR=2, SEMI=3, SEMICOLON=4, VAR=5, ASSIGN=6, INIT=7, L_BRACKET=8, 
		R_BRACKET=9, TRANS=10, INVAR=11, INIT_ASSIGN=12, ASSIGN_OP=13, EXCLAMATION_EQ=14, 
		L_ARROW_EQ=15, R_ARROW_EQ=16, L_ARROW=17, R_ARROW=18, EQ=19, NEXT_ASSIGN=20, 
		CASE=21, ESAC=22, BIT_OR=23, COND_EXPR=24, BIT_AND=25, EXCLAMATION=26, 
		TRUE=27, FALSE=28, REAL=29, L_BRACE=30, R_BRACE=31, COMMA=32, ID=33, NUMBER=34, 
		X=35, G=36, F=37, U=38, WS=39, COMMENT=40, LINE_COMMENT=41, STRING=42, 
		BOOLEAN=43;
	public static final int
		RULE_module = 0, RULE_ivar = 1, RULE_var = 2, RULE_assign = 3, RULE_init = 4, 
		RULE_trans = 5, RULE_invarspec = 6, RULE_assignList = 7, RULE_initAssign = 8, 
		RULE_nextAssign = 9, RULE_condition = 10, RULE_condExpr = 11, RULE_expr = 12, 
		RULE_orExpr = 13, RULE_andExpr = 14, RULE_equalityExpr = 15, RULE_relationalExpr = 16, 
		RULE_unaryExpr = 17, RULE_primaryExpr = 18, RULE_type = 19, RULE_valueList = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"module", "ivar", "var", "assign", "init", "trans", "invarspec", "assignList", 
			"initAssign", "nextAssign", "condition", "condExpr", "expr", "orExpr", 
			"andExpr", "equalityExpr", "relationalExpr", "unaryExpr", "primaryExpr", 
			"type", "valueList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'MODULE'", "'IVAR'", "':'", "';'", "'VAR'", "'ASSIGN'", "'INIT'", 
			"'('", "')'", "'TRANS'", "'INVAR'", "'init'", "':='", "'!='", "'<='", 
			"'>='", "'<'", "'>'", "'='", "'next'", "'case'", "'esac'", "'|'", "' :'", 
			"'&'", "'!'", "'TRUE'", "'FALSE'", "'Real'", "'{'", "'}'", "','", null, 
			null, "'X'", "'G'", "'F'", "'U'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MODULE", "IVAR", "SEMI", "SEMICOLON", "VAR", "ASSIGN", "INIT", 
			"L_BRACKET", "R_BRACKET", "TRANS", "INVAR", "INIT_ASSIGN", "ASSIGN_OP", 
			"EXCLAMATION_EQ", "L_ARROW_EQ", "R_ARROW_EQ", "L_ARROW", "R_ARROW", "EQ", 
			"NEXT_ASSIGN", "CASE", "ESAC", "BIT_OR", "COND_EXPR", "BIT_AND", "EXCLAMATION", 
			"TRUE", "FALSE", "REAL", "L_BRACE", "R_BRACE", "COMMA", "ID", "NUMBER", 
			"X", "G", "F", "U", "WS", "COMMENT", "LINE_COMMENT", "STRING", "BOOLEAN"
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
	public String getGrammarFileName() { return "NuXmvParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NuXmvParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(NuXmvParser.MODULE, 0); }
		public TerminalNode ID() { return getToken(NuXmvParser.ID, 0); }
		public List<IvarContext> ivar() {
			return getRuleContexts(IvarContext.class);
		}
		public IvarContext ivar(int i) {
			return getRuleContext(IvarContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public InitContext init(int i) {
			return getRuleContext(InitContext.class,i);
		}
		public List<TransContext> trans() {
			return getRuleContexts(TransContext.class);
		}
		public TransContext trans(int i) {
			return getRuleContext(TransContext.class,i);
		}
		public List<InvarspecContext> invarspec() {
			return getRuleContexts(InvarspecContext.class);
		}
		public InvarspecContext invarspec(int i) {
			return getRuleContext(InvarspecContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuXmvParserVisitor ) return ((NuXmvParserVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(MODULE);
			setState(43);
			match(ID);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IVAR) {
				{
				{
				setState(44);
				ivar();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(50);
				var();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASSIGN) {
				{
				{
				setState(56);
				assign();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INIT) {
				{
				{
				setState(62);
				init();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TRANS) {
				{
				{
				setState(68);
				trans();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INVAR) {
				{
				{
				setState(74);
				invarspec();
				}
				}
				setState(79);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IvarContext extends ParserRuleContext {
		public TerminalNode IVAR() { return getToken(NuXmvParser.IVAR, 0); }
		public TerminalNode ID() { return getToken(NuXmvParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(NuXmvParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NuXmvParser.SEMICOLON, 0); }
		public IvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ivar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).enterIvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).exitIvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuXmvParserVisitor ) return ((NuXmvParserVisitor<? extends T>)visitor).visitIvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IvarContext ivar() throws RecognitionException {
		IvarContext _localctx = new IvarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ivar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(IVAR);
			setState(81);
			match(ID);
			setState(82);
			match(SEMI);
			setState(83);
			type();
			setState(84);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(NuXmvParser.VAR, 0); }
		public TerminalNode ID() { return getToken(NuXmvParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(NuXmvParser.SEMI, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NuXmvParser.SEMICOLON, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuXmvParserVisitor ) return ((NuXmvParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(VAR);
			setState(87);
			match(ID);
			setState(88);
			match(SEMI);
			setState(89);
			type();
			setState(90);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(NuXmvParser.ASSIGN, 0); }
		public AssignListContext assignList() {
			return getRuleContext(AssignListContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuXmvParserVisitor ) return ((NuXmvParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(ASSIGN);
			setState(93);
			assignList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public TerminalNode INIT() { return getToken(NuXmvParser.INIT, 0); }
		public TerminalNode L_BRACKET() { return getToken(NuXmvParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(NuXmvParser.R_BRACKET, 0); }
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuXmvParserVisitor ) return ((NuXmvParserVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(INIT);
			setState(96);
			match(L_BRACKET);
			setState(97);
			expr();
			setState(98);
			match(R_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TransContext extends ParserRuleContext {
		public TerminalNode TRANS() { return getToken(NuXmvParser.TRANS, 0); }
		public TerminalNode L_BRACKET() { return getToken(NuXmvParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(NuXmvParser.R_BRACKET, 0); }
		public TransContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).enterTrans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).exitTrans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuXmvParserVisitor ) return ((NuXmvParserVisitor<? extends T>)visitor).visitTrans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransContext trans() throws RecognitionException {
		TransContext _localctx = new TransContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_trans);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(TRANS);
			setState(101);
			match(L_BRACKET);
			setState(102);
			expr();
			setState(103);
			match(R_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InvarspecContext extends ParserRuleContext {
		public TerminalNode INVAR() { return getToken(NuXmvParser.INVAR, 0); }
		public TerminalNode L_BRACKET() { return getToken(NuXmvParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(NuXmvParser.R_BRACKET, 0); }
		public InvarspecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invarspec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).enterInvarspec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).exitInvarspec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuXmvParserVisitor ) return ((NuXmvParserVisitor<? extends T>)visitor).visitInvarspec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvarspecContext invarspec() throws RecognitionException {
		InvarspecContext _localctx = new InvarspecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_invarspec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(INVAR);
			setState(106);
			match(L_BRACKET);
			setState(107);
			expr();
			setState(108);
			match(R_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignListContext extends ParserRuleContext {
		public List<InitAssignContext> initAssign() {
			return getRuleContexts(InitAssignContext.class);
		}
		public InitAssignContext initAssign(int i) {
			return getRuleContext(InitAssignContext.class,i);
		}
		public List<NextAssignContext> nextAssign() {
			return getRuleContexts(NextAssignContext.class);
		}
		public NextAssignContext nextAssign(int i) {
			return getRuleContext(NextAssignContext.class,i);
		}
		public AssignListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).enterAssignList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).exitAssignList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuXmvParserVisitor ) return ((NuXmvParserVisitor<? extends T>)visitor).visitAssignList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignListContext assignList() throws RecognitionException {
		AssignListContext _localctx = new AssignListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(112);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INIT_ASSIGN:
					{
					setState(110);
					initAssign();
					}
					break;
				case NEXT_ASSIGN:
					{
					setState(111);
					nextAssign();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INIT_ASSIGN || _la==NEXT_ASSIGN );
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitAssignContext extends ParserRuleContext {
		public TerminalNode INIT_ASSIGN() { return getToken(NuXmvParser.INIT_ASSIGN, 0); }
		public TerminalNode L_BRACKET() { return getToken(NuXmvParser.L_BRACKET, 0); }
		public TerminalNode ID() { return getToken(NuXmvParser.ID, 0); }
		public TerminalNode R_BRACKET() { return getToken(NuXmvParser.R_BRACKET, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(NuXmvParser.ASSIGN_OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NuXmvParser.SEMICOLON, 0); }
		public InitAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).enterInitAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).exitInitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuXmvParserVisitor ) return ((NuXmvParserVisitor<? extends T>)visitor).visitInitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitAssignContext initAssign() throws RecognitionException {
		InitAssignContext _localctx = new InitAssignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_initAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(INIT_ASSIGN);
			setState(117);
			match(L_BRACKET);
			setState(118);
			match(ID);
			setState(119);
			match(R_BRACKET);
			setState(120);
			match(ASSIGN_OP);
			setState(121);
			expr();
			setState(122);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NextAssignContext extends ParserRuleContext {
		public TerminalNode NEXT_ASSIGN() { return getToken(NuXmvParser.NEXT_ASSIGN, 0); }
		public TerminalNode L_BRACKET() { return getToken(NuXmvParser.L_BRACKET, 0); }
		public TerminalNode ID() { return getToken(NuXmvParser.ID, 0); }
		public TerminalNode R_BRACKET() { return getToken(NuXmvParser.R_BRACKET, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(NuXmvParser.ASSIGN_OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NuXmvParser.SEMICOLON, 0); }
		public NextAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).enterNextAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).exitNextAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuXmvParserVisitor ) return ((NuXmvParserVisitor<? extends T>)visitor).visitNextAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NextAssignContext nextAssign() throws RecognitionException {
		NextAssignContext _localctx = new NextAssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nextAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(NEXT_ASSIGN);
			setState(125);
			match(L_BRACKET);
			setState(126);
			match(ID);
			setState(127);
			match(R_BRACKET);
			setState(128);
			match(ASSIGN_OP);
			setState(129);
			expr();
			setState(130);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(NuXmvParser.CASE, 0); }
		public TerminalNode ESAC() { return getToken(NuXmvParser.ESAC, 0); }
		public List<CondExprContext> condExpr() {
			return getRuleContexts(CondExprContext.class);
		}
		public CondExprContext condExpr(int i) {
			return getRuleContext(CondExprContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuXmvParserVisitor ) return ((NuXmvParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(CASE);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13735775174912L) != 0)) {
				{
				{
				setState(133);
				condExpr();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(ESAC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COND_EXPR() { return getToken(NuXmvParser.COND_EXPR, 0); }
		public TerminalNode SEMICOLON() { return getToken(NuXmvParser.SEMICOLON, 0); }
		public CondExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).enterCondExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).exitCondExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuXmvParserVisitor ) return ((NuXmvParserVisitor<? extends T>)visitor).visitCondExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondExprContext condExpr() throws RecognitionException {
		CondExprContext _localctx = new CondExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			expr();
			setState(142);
			match(COND_EXPR);
			setState(143);
			expr();
			setState(144);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuXmvParserVisitor ) return ((NuXmvParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			orExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ParserRuleContext {
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
		}
		public List<TerminalNode> BIT_OR() { return getTokens(NuXmvParser.BIT_OR); }
		public TerminalNode BIT_OR(int i) {
			return getToken(NuXmvParser.BIT_OR, i);
		}
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuXmvParserVisitor ) return ((NuXmvParserVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			andExpr();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BIT_OR) {
				{
				{
				setState(149);
				match(BIT_OR);
				setState(150);
				andExpr();
				}
				}
				setState(155);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ParserRuleContext {
		public List<EqualityExprContext> equalityExpr() {
			return getRuleContexts(EqualityExprContext.class);
		}
		public EqualityExprContext equalityExpr(int i) {
			return getRuleContext(EqualityExprContext.class,i);
		}
		public List<TerminalNode> BIT_AND() { return getTokens(NuXmvParser.BIT_AND); }
		public TerminalNode BIT_AND(int i) {
			return getToken(NuXmvParser.BIT_AND, i);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuXmvParserVisitor ) return ((NuXmvParserVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			equalityExpr();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BIT_AND) {
				{
				{
				setState(157);
				match(BIT_AND);
				setState(158);
				equalityExpr();
				}
				}
				setState(163);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExprContext extends ParserRuleContext {
		public List<RelationalExprContext> relationalExpr() {
			return getRuleContexts(RelationalExprContext.class);
		}
		public RelationalExprContext relationalExpr(int i) {
			return getRuleContext(RelationalExprContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(NuXmvParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(NuXmvParser.EQ, i);
		}
		public List<TerminalNode> EXCLAMATION_EQ() { return getTokens(NuXmvParser.EXCLAMATION_EQ); }
		public TerminalNode EXCLAMATION_EQ(int i) {
			return getToken(NuXmvParser.EXCLAMATION_EQ, i);
		}
		public EqualityExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuXmvParserVisitor ) return ((NuXmvParserVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExprContext equalityExpr() throws RecognitionException {
		EqualityExprContext _localctx = new EqualityExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_equalityExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			relationalExpr();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXCLAMATION_EQ || _la==EQ) {
				{
				{
				setState(165);
				_la = _input.LA(1);
				if ( !(_la==EXCLAMATION_EQ || _la==EQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(166);
				relationalExpr();
				}
				}
				setState(171);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExprContext extends ParserRuleContext {
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
		}
		public List<TerminalNode> L_ARROW() { return getTokens(NuXmvParser.L_ARROW); }
		public TerminalNode L_ARROW(int i) {
			return getToken(NuXmvParser.L_ARROW, i);
		}
		public List<TerminalNode> L_ARROW_EQ() { return getTokens(NuXmvParser.L_ARROW_EQ); }
		public TerminalNode L_ARROW_EQ(int i) {
			return getToken(NuXmvParser.L_ARROW_EQ, i);
		}
		public List<TerminalNode> R_ARROW() { return getTokens(NuXmvParser.R_ARROW); }
		public TerminalNode R_ARROW(int i) {
			return getToken(NuXmvParser.R_ARROW, i);
		}
		public List<TerminalNode> R_ARROW_EQ() { return getTokens(NuXmvParser.R_ARROW_EQ); }
		public TerminalNode R_ARROW_EQ(int i) {
			return getToken(NuXmvParser.R_ARROW_EQ, i);
		}
		public RelationalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuXmvParserVisitor ) return ((NuXmvParserVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExprContext relationalExpr() throws RecognitionException {
		RelationalExprContext _localctx = new RelationalExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relationalExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			unaryExpr();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 491520L) != 0)) {
				{
				{
				setState(173);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 491520L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(174);
				unaryExpr();
				}
				}
				setState(179);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode EXCLAMATION() { return getToken(NuXmvParser.EXCLAMATION, 0); }
		public TerminalNode X() { return getToken(NuXmvParser.X, 0); }
		public TerminalNode G() { return getToken(NuXmvParser.G, 0); }
		public TerminalNode F() { return getToken(NuXmvParser.F, 0); }
		public TerminalNode U() { return getToken(NuXmvParser.U, 0); }
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuXmvParserVisitor ) return ((NuXmvParserVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unaryExpr);
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCLAMATION:
			case X:
			case G:
			case F:
			case U:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 515463184384L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(181);
				unaryExpr();
				}
				break;
			case L_BRACKET:
			case TRUE:
			case FALSE:
			case ID:
			case NUMBER:
			case STRING:
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				primaryExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NuXmvParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(NuXmvParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(NuXmvParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(NuXmvParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(NuXmvParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(NuXmvParser.FALSE, 0); }
		public TerminalNode L_BRACKET() { return getToken(NuXmvParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(NuXmvParser.R_BRACKET, 0); }
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuXmvParserVisitor ) return ((NuXmvParserVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_primaryExpr);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(NUMBER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(BOOLEAN);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				match(STRING);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				match(FALSE);
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 7);
				{
				setState(191);
				match(L_BRACKET);
				setState(192);
				expr();
				setState(193);
				match(R_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(NuXmvParser.REAL, 0); }
		public TerminalNode L_BRACE() { return getToken(NuXmvParser.L_BRACE, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(NuXmvParser.R_BRACE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuXmvParserVisitor ) return ((NuXmvParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(REAL);
				}
				break;
			case L_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(L_BRACE);
				setState(199);
				valueList();
				setState(200);
				match(R_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NuXmvParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NuXmvParser.COMMA, i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuXmvParserListener ) ((NuXmvParserListener)listener).exitValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NuXmvParserVisitor ) return ((NuXmvParserVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			expr();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(205);
				match(COMMA);
				setState(206);
				expr();
				}
				}
				setState(211);
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

	public static final String _serializedATN =
		"\u0004\u0001+\u00d5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000.\b\u0000\n\u0000\f\u00001\t\u0000\u0001\u0000"+
		"\u0005\u00004\b\u0000\n\u0000\f\u00007\t\u0000\u0001\u0000\u0005\u0000"+
		":\b\u0000\n\u0000\f\u0000=\t\u0000\u0001\u0000\u0005\u0000@\b\u0000\n"+
		"\u0000\f\u0000C\t\u0000\u0001\u0000\u0005\u0000F\b\u0000\n\u0000\f\u0000"+
		"I\t\u0000\u0001\u0000\u0005\u0000L\b\u0000\n\u0000\f\u0000O\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0004\u0007q\b\u0007\u000b\u0007\f\u0007r\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u0087"+
		"\b\n\n\n\f\n\u008a\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u0098\b\r\n\r\f\r\u009b\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00a0\b\u000e\n\u000e\f\u000e\u00a3\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00a8\b\u000f\n\u000f\f\u000f\u00ab\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00b0\b\u0010\n\u0010\f\u0010"+
		"\u00b3\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00b8\b"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00c4"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00cb\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00d0"+
		"\b\u0014\n\u0014\f\u0014\u00d3\t\u0014\u0001\u0014\u0000\u0000\u0015\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(\u0000\u0003\u0002\u0000\u000e\u000e\u0013\u0013\u0001\u0000"+
		"\u000f\u0012\u0002\u0000\u001a\u001a#&\u00d5\u0000*\u0001\u0000\u0000"+
		"\u0000\u0002P\u0001\u0000\u0000\u0000\u0004V\u0001\u0000\u0000\u0000\u0006"+
		"\\\u0001\u0000\u0000\u0000\b_\u0001\u0000\u0000\u0000\nd\u0001\u0000\u0000"+
		"\u0000\fi\u0001\u0000\u0000\u0000\u000ep\u0001\u0000\u0000\u0000\u0010"+
		"t\u0001\u0000\u0000\u0000\u0012|\u0001\u0000\u0000\u0000\u0014\u0084\u0001"+
		"\u0000\u0000\u0000\u0016\u008d\u0001\u0000\u0000\u0000\u0018\u0092\u0001"+
		"\u0000\u0000\u0000\u001a\u0094\u0001\u0000\u0000\u0000\u001c\u009c\u0001"+
		"\u0000\u0000\u0000\u001e\u00a4\u0001\u0000\u0000\u0000 \u00ac\u0001\u0000"+
		"\u0000\u0000\"\u00b7\u0001\u0000\u0000\u0000$\u00c3\u0001\u0000\u0000"+
		"\u0000&\u00ca\u0001\u0000\u0000\u0000(\u00cc\u0001\u0000\u0000\u0000*"+
		"+\u0005\u0001\u0000\u0000+/\u0005!\u0000\u0000,.\u0003\u0002\u0001\u0000"+
		"-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u000005\u0001\u0000\u0000\u00001/\u0001\u0000"+
		"\u0000\u000024\u0003\u0004\u0002\u000032\u0001\u0000\u0000\u000047\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"6;\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u00008:\u0003\u0006\u0003"+
		"\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000"+
		"\u0000\u0000;<\u0001\u0000\u0000\u0000<A\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000>@\u0003\b\u0004\u0000?>\u0001\u0000\u0000\u0000@C\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"BG\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DF\u0003\n\u0005\u0000"+
		"ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HM\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000JL\u0003\f\u0006\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u0001"+
		"\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\u0002\u0000"+
		"\u0000QR\u0005!\u0000\u0000RS\u0005\u0003\u0000\u0000ST\u0003&\u0013\u0000"+
		"TU\u0005\u0004\u0000\u0000U\u0003\u0001\u0000\u0000\u0000VW\u0005\u0005"+
		"\u0000\u0000WX\u0005!\u0000\u0000XY\u0005\u0003\u0000\u0000YZ\u0003&\u0013"+
		"\u0000Z[\u0005\u0004\u0000\u0000[\u0005\u0001\u0000\u0000\u0000\\]\u0005"+
		"\u0006\u0000\u0000]^\u0003\u000e\u0007\u0000^\u0007\u0001\u0000\u0000"+
		"\u0000_`\u0005\u0007\u0000\u0000`a\u0005\b\u0000\u0000ab\u0003\u0018\f"+
		"\u0000bc\u0005\t\u0000\u0000c\t\u0001\u0000\u0000\u0000de\u0005\n\u0000"+
		"\u0000ef\u0005\b\u0000\u0000fg\u0003\u0018\f\u0000gh\u0005\t\u0000\u0000"+
		"h\u000b\u0001\u0000\u0000\u0000ij\u0005\u000b\u0000\u0000jk\u0005\b\u0000"+
		"\u0000kl\u0003\u0018\f\u0000lm\u0005\t\u0000\u0000m\r\u0001\u0000\u0000"+
		"\u0000nq\u0003\u0010\b\u0000oq\u0003\u0012\t\u0000pn\u0001\u0000\u0000"+
		"\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000s\u000f\u0001\u0000\u0000\u0000"+
		"tu\u0005\f\u0000\u0000uv\u0005\b\u0000\u0000vw\u0005!\u0000\u0000wx\u0005"+
		"\t\u0000\u0000xy\u0005\r\u0000\u0000yz\u0003\u0018\f\u0000z{\u0005\u0004"+
		"\u0000\u0000{\u0011\u0001\u0000\u0000\u0000|}\u0005\u0014\u0000\u0000"+
		"}~\u0005\b\u0000\u0000~\u007f\u0005!\u0000\u0000\u007f\u0080\u0005\t\u0000"+
		"\u0000\u0080\u0081\u0005\r\u0000\u0000\u0081\u0082\u0003\u0018\f\u0000"+
		"\u0082\u0083\u0005\u0004\u0000\u0000\u0083\u0013\u0001\u0000\u0000\u0000"+
		"\u0084\u0088\u0005\u0015\u0000\u0000\u0085\u0087\u0003\u0016\u000b\u0000"+
		"\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000"+
		"\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0005\u0016\u0000\u0000\u008c\u0015\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0003\u0018\f\u0000\u008e\u008f\u0005\u0018\u0000\u0000\u008f"+
		"\u0090\u0003\u0018\f\u0000\u0090\u0091\u0005\u0004\u0000\u0000\u0091\u0017"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0003\u001a\r\u0000\u0093\u0019\u0001"+
		"\u0000\u0000\u0000\u0094\u0099\u0003\u001c\u000e\u0000\u0095\u0096\u0005"+
		"\u0017\u0000\u0000\u0096\u0098\u0003\u001c\u000e\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u001b\u0001"+
		"\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u00a1\u0003"+
		"\u001e\u000f\u0000\u009d\u009e\u0005\u0019\u0000\u0000\u009e\u00a0\u0003"+
		"\u001e\u000f\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a2\u001d\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a9\u0003 \u0010\u0000\u00a5\u00a6\u0007\u0000"+
		"\u0000\u0000\u00a6\u00a8\u0003 \u0010\u0000\u00a7\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u001f\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00b1\u0003\"\u0011\u0000"+
		"\u00ad\u00ae\u0007\u0001\u0000\u0000\u00ae\u00b0\u0003\"\u0011\u0000\u00af"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1"+
		"\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2"+
		"!\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0007\u0002\u0000\u0000\u00b5\u00b8\u0003\"\u0011\u0000\u00b6\u00b8\u0003"+
		"$\u0012\u0000\u00b7\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b8#\u0001\u0000\u0000\u0000\u00b9\u00c4\u0005!\u0000\u0000"+
		"\u00ba\u00c4\u0005\"\u0000\u0000\u00bb\u00c4\u0005+\u0000\u0000\u00bc"+
		"\u00c4\u0005*\u0000\u0000\u00bd\u00c4\u0005\u001b\u0000\u0000\u00be\u00c4"+
		"\u0005\u001c\u0000\u0000\u00bf\u00c0\u0005\b\u0000\u0000\u00c0\u00c1\u0003"+
		"\u0018\f\u0000\u00c1\u00c2\u0005\t\u0000\u0000\u00c2\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c3\u00b9\u0001\u0000\u0000\u0000\u00c3\u00ba\u0001\u0000"+
		"\u0000\u0000\u00c3\u00bb\u0001\u0000\u0000\u0000\u00c3\u00bc\u0001\u0000"+
		"\u0000\u0000\u00c3\u00bd\u0001\u0000\u0000\u0000\u00c3\u00be\u0001\u0000"+
		"\u0000\u0000\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c4%\u0001\u0000\u0000"+
		"\u0000\u00c5\u00cb\u0005\u001d\u0000\u0000\u00c6\u00c7\u0005\u001e\u0000"+
		"\u0000\u00c7\u00c8\u0003(\u0014\u0000\u00c8\u00c9\u0005\u001f\u0000\u0000"+
		"\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c5\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c6\u0001\u0000\u0000\u0000\u00cb\'\u0001\u0000\u0000\u0000\u00cc"+
		"\u00d1\u0003\u0018\f\u0000\u00cd\u00ce\u0005 \u0000\u0000\u00ce\u00d0"+
		"\u0003\u0018\f\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2)\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u0011/5;AGMpr\u0088\u0099\u00a1\u00a9\u00b1\u00b7\u00c3\u00ca"+
		"\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}