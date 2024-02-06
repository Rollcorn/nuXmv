// Generated from /home/denis/Documents/5_ITMO/NIR/nuXmv/src/main/java/org/shkandyuk/nuxmv/grammar/parser/xmvParser.g4 by ANTLR 4.13.1
package org.shkandyuk.nuxmv.grammar.parser;

import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class xmvParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MODULE=1, VAR=2, ASSIGN=3, SPEC=4, BOOLEAN=5, INTEGER=6, REAL=7, ARRAY=8, 
		OF=9, TRUE=10, FALSE=11, PLUS=12, MINUS=13, MUL=14, DIV=15, AND=16, OR=17, 
		IMPLIES=18, IFF=19, EQ=20, NEQ=21, LPAREN=22, RPAREN=23, LBRACK=24, RBRACK=25, 
		COLON=26, SEMI=27, COMMA=28, DOTDOT=29, ID=30, INT=31, WS=32, COLONEQ=33;
	public static final int
		RULE_module = 0, RULE_moduleParameters = 1, RULE_moduleContent = 2, RULE_variableDeclaration = 3, 
		RULE_type = 4, RULE_assignment = 5, RULE_expression = 6, RULE_binaryOp = 7, 
		RULE_specification = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"module", "moduleParameters", "moduleContent", "variableDeclaration", 
			"type", "assignment", "expression", "binaryOp", "specification"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'MODULE'", "'VAR'", "'ASSIGN'", "'SPEC'", "'boolean'", "'integer'", 
			"'real'", "'array'", "'of'", "'TRUE'", "'FALSE'", "'+'", "'-'", "'*'", 
			"'/'", "'and'", "'or'", "'=>'", "'<=>'", "'='", "'!='", "'('", "')'", 
			"'['", "']'", "':'", "';'", "','", "'..'", null, null, null, "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MODULE", "VAR", "ASSIGN", "SPEC", "BOOLEAN", "INTEGER", "REAL", 
			"ARRAY", "OF", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", "AND", 
			"OR", "IMPLIES", "IFF", "EQ", "NEQ", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
			"COLON", "SEMI", "COMMA", "DOTDOT", "ID", "INT", "WS", "COLONEQ"
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
	public String getGrammarFileName() { return "xmvParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public xmvParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(xmvParser.MODULE, 0); }
		public TerminalNode ID() { return getToken(xmvParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(xmvParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(xmvParser.RPAREN, 0); }
		public TerminalNode LBRACK() { return getToken(xmvParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(xmvParser.RBRACK, 0); }
		public ModuleParametersContext moduleParameters() {
			return getRuleContext(ModuleParametersContext.class,0);
		}
		public List<ModuleContentContext> moduleContent() {
			return getRuleContexts(ModuleContentContext.class);
		}
		public ModuleContentContext moduleContent(int i) {
			return getRuleContext(ModuleContentContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmvParserListener ) ((xmvParserListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmvParserListener ) ((xmvParserListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmvParserVisitor ) return ((xmvParserVisitor<? extends T>)visitor).visitModule(this);
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
			setState(18);
			match(MODULE);
			setState(19);
			match(ID);
			setState(20);
			match(LPAREN);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(21);
				moduleParameters();
				}
			}

			setState(24);
			match(RPAREN);
			setState(25);
			match(LBRACK);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) {
				{
				{
				setState(26);
				moduleContent();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(RBRACK);
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
	public static class ModuleParametersContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(xmvParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(xmvParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(xmvParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(xmvParser.COMMA, i);
		}
		public ModuleParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmvParserListener ) ((xmvParserListener)listener).enterModuleParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmvParserListener ) ((xmvParserListener)listener).exitModuleParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmvParserVisitor ) return ((xmvParserVisitor<? extends T>)visitor).visitModuleParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleParametersContext moduleParameters() throws RecognitionException {
		ModuleParametersContext _localctx = new ModuleParametersContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_moduleParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(ID);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(35);
				match(COMMA);
				setState(36);
				match(ID);
				}
				}
				setState(41);
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
	public static class ModuleContentContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public SpecificationContext specification() {
			return getRuleContext(SpecificationContext.class,0);
		}
		public ModuleContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmvParserListener ) ((xmvParserListener)listener).enterModuleContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmvParserListener ) ((xmvParserListener)listener).exitModuleContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmvParserVisitor ) return ((xmvParserVisitor<? extends T>)visitor).visitModuleContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContentContext moduleContent() throws RecognitionException {
		ModuleContentContext _localctx = new ModuleContentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_moduleContent);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				variableDeclaration();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				assignment();
				}
				break;
			case SPEC:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				specification();
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(xmvParser.VAR, 0); }
		public TerminalNode ID() { return getToken(xmvParser.ID, 0); }
		public TerminalNode COLON() { return getToken(xmvParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(xmvParser.SEMI, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmvParserListener ) ((xmvParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmvParserListener ) ((xmvParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmvParserVisitor ) return ((xmvParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(VAR);
			setState(48);
			match(ID);
			setState(49);
			match(COLON);
			setState(50);
			type();
			setState(51);
			match(SEMI);
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
		public TerminalNode BOOLEAN() { return getToken(xmvParser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(xmvParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(xmvParser.REAL, 0); }
		public TerminalNode ARRAY() { return getToken(xmvParser.ARRAY, 0); }
		public TerminalNode LBRACK() { return getToken(xmvParser.LBRACK, 0); }
		public List<TerminalNode> INT() { return getTokens(xmvParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(xmvParser.INT, i);
		}
		public TerminalNode DOTDOT() { return getToken(xmvParser.DOTDOT, 0); }
		public TerminalNode RBRACK() { return getToken(xmvParser.RBRACK, 0); }
		public TerminalNode OF() { return getToken(xmvParser.OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmvParserListener ) ((xmvParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmvParserListener ) ((xmvParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmvParserVisitor ) return ((xmvParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(BOOLEAN);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(INTEGER);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(REAL);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(ARRAY);
				setState(57);
				match(LBRACK);
				setState(58);
				match(INT);
				setState(59);
				match(DOTDOT);
				setState(60);
				match(INT);
				setState(61);
				match(RBRACK);
				setState(62);
				match(OF);
				setState(63);
				type();
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(xmvParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(xmvParser.ID, 0); }
		public TerminalNode COLONEQ() { return getToken(xmvParser.COLONEQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(xmvParser.SEMI, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmvParserListener ) ((xmvParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmvParserListener ) ((xmvParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmvParserVisitor ) return ((xmvParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ASSIGN);
			setState(67);
			match(ID);
			setState(68);
			match(COLONEQ);
			setState(69);
			expression(0);
			setState(70);
			match(SEMI);
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(xmvParser.ID, 0); }
		public TerminalNode INT() { return getToken(xmvParser.INT, 0); }
		public TerminalNode TRUE() { return getToken(xmvParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(xmvParser.FALSE, 0); }
		public TerminalNode LPAREN() { return getToken(xmvParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(xmvParser.RPAREN, 0); }
		public BinaryOpContext binaryOp() {
			return getRuleContext(BinaryOpContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmvParserListener ) ((xmvParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmvParserListener ) ((xmvParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmvParserVisitor ) return ((xmvParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(73);
				match(ID);
				}
				break;
			case INT:
				{
				setState(74);
				match(INT);
				}
				break;
			case TRUE:
				{
				setState(75);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(76);
				match(FALSE);
				}
				break;
			case LPAREN:
				{
				setState(77);
				match(LPAREN);
				setState(78);
				expression(0);
				setState(79);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(83);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(84);
					binaryOp();
					setState(85);
					expression(3);
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryOpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(xmvParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(xmvParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(xmvParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(xmvParser.DIV, 0); }
		public TerminalNode AND() { return getToken(xmvParser.AND, 0); }
		public TerminalNode OR() { return getToken(xmvParser.OR, 0); }
		public TerminalNode IMPLIES() { return getToken(xmvParser.IMPLIES, 0); }
		public TerminalNode IFF() { return getToken(xmvParser.IFF, 0); }
		public TerminalNode EQ() { return getToken(xmvParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(xmvParser.NEQ, 0); }
		public BinaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmvParserListener ) ((xmvParserListener)listener).enterBinaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmvParserListener ) ((xmvParserListener)listener).exitBinaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmvParserVisitor ) return ((xmvParserVisitor<? extends T>)visitor).visitBinaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOpContext binaryOp() throws RecognitionException {
		BinaryOpContext _localctx = new BinaryOpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_binaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4190208L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class SpecificationContext extends ParserRuleContext {
		public TerminalNode SPEC() { return getToken(xmvParser.SPEC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(xmvParser.SEMI, 0); }
		public SpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xmvParserListener ) ((xmvParserListener)listener).enterSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xmvParserListener ) ((xmvParserListener)listener).exitSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xmvParserVisitor ) return ((xmvParserVisitor<? extends T>)visitor).visitSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecificationContext specification() throws RecognitionException {
		SpecificationContext _localctx = new SpecificationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(SPEC);
			setState(95);
			expression(0);
			setState(96);
			match(SEMI);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001!c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0017\b"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001c\b\u0000\n"+
		"\u0000\f\u0000\u001f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001&\b\u0001\n\u0001\f\u0001)\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002.\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004A\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006R\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006X\b\u0006\n\u0006\f\u0006[\t"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0000\u0001\f\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0001"+
		"\u0001\u0000\f\u0015f\u0000\u0012\u0001\u0000\u0000\u0000\u0002\"\u0001"+
		"\u0000\u0000\u0000\u0004-\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000"+
		"\u0000\b@\u0001\u0000\u0000\u0000\nB\u0001\u0000\u0000\u0000\fQ\u0001"+
		"\u0000\u0000\u0000\u000e\\\u0001\u0000\u0000\u0000\u0010^\u0001\u0000"+
		"\u0000\u0000\u0012\u0013\u0005\u0001\u0000\u0000\u0013\u0014\u0005\u001e"+
		"\u0000\u0000\u0014\u0016\u0005\u0016\u0000\u0000\u0015\u0017\u0003\u0002"+
		"\u0001\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000"+
		"\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0017"+
		"\u0000\u0000\u0019\u001d\u0005\u0018\u0000\u0000\u001a\u001c\u0003\u0004"+
		"\u0002\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000"+
		"\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000"+
		"\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000"+
		"\u0000 !\u0005\u0019\u0000\u0000!\u0001\u0001\u0000\u0000\u0000\"\'\u0005"+
		"\u001e\u0000\u0000#$\u0005\u001c\u0000\u0000$&\u0005\u001e\u0000\u0000"+
		"%#\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000(\u0003\u0001\u0000\u0000\u0000)\'\u0001"+
		"\u0000\u0000\u0000*.\u0003\u0006\u0003\u0000+.\u0003\n\u0005\u0000,.\u0003"+
		"\u0010\b\u0000-*\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-,\u0001"+
		"\u0000\u0000\u0000.\u0005\u0001\u0000\u0000\u0000/0\u0005\u0002\u0000"+
		"\u000001\u0005\u001e\u0000\u000012\u0005\u001a\u0000\u000023\u0003\b\u0004"+
		"\u000034\u0005\u001b\u0000\u00004\u0007\u0001\u0000\u0000\u00005A\u0005"+
		"\u0005\u0000\u00006A\u0005\u0006\u0000\u00007A\u0005\u0007\u0000\u0000"+
		"89\u0005\b\u0000\u00009:\u0005\u0018\u0000\u0000:;\u0005\u001f\u0000\u0000"+
		";<\u0005\u001d\u0000\u0000<=\u0005\u001f\u0000\u0000=>\u0005\u0019\u0000"+
		"\u0000>?\u0005\t\u0000\u0000?A\u0003\b\u0004\u0000@5\u0001\u0000\u0000"+
		"\u0000@6\u0001\u0000\u0000\u0000@7\u0001\u0000\u0000\u0000@8\u0001\u0000"+
		"\u0000\u0000A\t\u0001\u0000\u0000\u0000BC\u0005\u0003\u0000\u0000CD\u0005"+
		"\u001e\u0000\u0000DE\u0005!\u0000\u0000EF\u0003\f\u0006\u0000FG\u0005"+
		"\u001b\u0000\u0000G\u000b\u0001\u0000\u0000\u0000HI\u0006\u0006\uffff"+
		"\uffff\u0000IR\u0005\u001e\u0000\u0000JR\u0005\u001f\u0000\u0000KR\u0005"+
		"\n\u0000\u0000LR\u0005\u000b\u0000\u0000MN\u0005\u0016\u0000\u0000NO\u0003"+
		"\f\u0006\u0000OP\u0005\u0017\u0000\u0000PR\u0001\u0000\u0000\u0000QH\u0001"+
		"\u0000\u0000\u0000QJ\u0001\u0000\u0000\u0000QK\u0001\u0000\u0000\u0000"+
		"QL\u0001\u0000\u0000\u0000QM\u0001\u0000\u0000\u0000RY\u0001\u0000\u0000"+
		"\u0000ST\n\u0002\u0000\u0000TU\u0003\u000e\u0007\u0000UV\u0003\f\u0006"+
		"\u0003VX\u0001\u0000\u0000\u0000WS\u0001\u0000\u0000\u0000X[\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\r\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0007\u0000\u0000\u0000"+
		"]\u000f\u0001\u0000\u0000\u0000^_\u0005\u0004\u0000\u0000_`\u0003\f\u0006"+
		"\u0000`a\u0005\u001b\u0000\u0000a\u0011\u0001\u0000\u0000\u0000\u0007"+
		"\u0016\u001d\'-@QY";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}