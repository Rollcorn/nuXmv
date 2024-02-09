// Generated from NuXmvParser.g4 by ANTLR 4.13.1

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
		MODULE=1, DEFINE=2, MDEFINE=3, CONSTANTS=4, VAR=5, IVAR=6, PROCESS=7, 
		CASE=8, ESAC=9, FROZENVAR=10, TRANS=11, INVAR=12, SPEC=13, CTLSPEC=14, 
		LTLSPEC=15, PSLSPEC=16, COMPUTE=17, NAME=18, INVARSPEC=19, FAIRNESS=20, 
		JUSTICE=21, COMPASSION=22, ISA=23, ASSIGN=24, CONSTRAINT=25, SIMPWFF=26, 
		CTLWFF=27, LTLWFF=28, PSLWFF=29, COMPWFF=30, IN=31, MIN=32, MAX=33, MIRROR=34, 
		PRED=35, PREDICATES=36, BI_WORD1=37, BI_BOOL=38, BI_SIGNED=39, BI_UNSIGNED=40, 
		BI_EXTEND=41, BI_RESIZE=42, BI_SIZEOF=43, BI_UWCONST=44, BI_SWCONST=45, 
		BI_INIT=46, BI_SELF=47, BI_COUNT=48, BI_ABS=49, BI_MAX=50, BI_MIN=51, 
		T_ARRAY=52, T_OF=53, T_BOOLEAN=54, T_INTEGER=55, T_REAL=56, T_WORD=57, 
		OP_EX=58, OP_AX=59, OP_EF=60, OP_AF=61, OP_EG=62, OP_AG=63, OP_E=64, OP_F=65, 
		OP_O=66, OP_G=67, OP_H=68, OP_X=69, OP_Y=70, OP_Z=71, OP_A=72, OP_U=73, 
		OP_S=74, OP_V=75, OP_T=76, OP_BU=77, OP_EBF=78, OP_ABF=79, OP_EBG=80, 
		OP_ABG=81, OP_NEXT=82, OP_MOD=83, OP_UNION=84, OP_IN=85, OP_XOR=86, OP_XNOR=87, 
		OP_AND=88, OP_OR=89, EXCLAMATION=90, PLUS=91, MINUS=92, MINUS_ARROW=93, 
		L_ARROW=94, R_ARROW=95, ASTERISK=96, SLASH=97, IDENTIFICATOR=98, ASSIGN_OP=99, 
		STATE_ASSIGN=100, L_SQUARE_BRACKET=101, R_SQUARE_BRACKET=102, L_BRACKET=103, 
		R_BRACKET=104, L_BRACE=105, R_BRACE=106, SEMICOLON=107, COLON=108, COMMA=109, 
		INTEGER=110, BIN=111, OCT=112, DEC=113, HEX=114, COMMENT=115, LINE_COMMENT=116, 
		WS=117, BR=118, BAD_CHARACTER=119;
	public static final int
		RULE_root = 0, RULE_module = 1, RULE_variables_declarations = 2, RULE_variables_list = 3, 
		RULE_moduleBody = 4, RULE_varDeclaration = 5, RULE_assignment = 6, RULE_assign_statment = 7, 
		RULE_init = 8, RULE_init_statement = 9, RULE_next = 10, RULE_next_statement = 11, 
		RULE_spec = 12, RULE_expressions = 13, RULE_expression = 14, RULE_unar_ops = 15, 
		RULE_spec_operators = 16, RULE_bit_ops = 17, RULE_case = 18, RULE_case_statment = 19, 
		RULE_type = 20, RULE_value_list = 21, RULE_value = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "module", "variables_declarations", "variables_list", "moduleBody", 
			"varDeclaration", "assignment", "assign_statment", "init", "init_statement", 
			"next", "next_statement", "spec", "expressions", "expression", "unar_ops", 
			"spec_operators", "bit_ops", "case", "case_statment", "type", "value_list", 
			"value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'MODULE'", "'DEFINE'", "'MDEFINE'", "'CONSTANTS'", "'VAR'", "'IVAR'", 
			"'process'", "'case'", "'esac'", "'FROZENVAR'", "'TRANS'", "'INVAR'", 
			"'SPEC'", "'CTLSPEC'", "'LTLSPEC'", "'PSLSPEC'", "'COMPUTE'", "'NAME'", 
			"'INVARSPEC'", "'FAIRNESS'", "'JUSTICE'", "'COMPASSION'", "'ISA'", "'ASSIGN'", 
			"'CONSTRAINT'", "'SIMPWFF'", "'CTLWFF'", "'LTLWFF'", "'PSLWFF'", "'COMPWFF'", 
			"'IN'", "'MIN'", "'MAX'", "'MIRROR'", "'PRED'", "'PREDICATES'", "'word1'", 
			"'bool'", "'signed'", "'unsigned'", "'extend'", "'resize'", "'sizeof'", 
			"'uwconst'", "'swconst'", "'init'", "'self'", "'count'", "'abs'", "'max'", 
			"'min'", "'array'", "'of'", "'boolean'", "'integer'", "'real'", "'word'", 
			"'EX'", "'AX'", "'EF'", "'AF'", "'EG'", "'AG'", "'E'", "'F'", "'O'", 
			"'G'", "'H'", "'X'", "'Y'", "'Z'", "'A'", "'U'", "'S'", "'V'", "'T'", 
			"'BU'", "'EBF'", "'ABF'", "'EBG'", "'ABG'", "'next'", "'mod'", "'union'", 
			"'in'", "'xor'", "'xnor'", "'&'", "'|'", "'!'", "'+'", "'-'", "'->'", 
			"'<'", "'>'", "'*'", "'/'", null, "':='", "'='", "'['", "']'", "'('", 
			"')'", "'{'", "'}'", "';'", "':'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MODULE", "DEFINE", "MDEFINE", "CONSTANTS", "VAR", "IVAR", "PROCESS", 
			"CASE", "ESAC", "FROZENVAR", "TRANS", "INVAR", "SPEC", "CTLSPEC", "LTLSPEC", 
			"PSLSPEC", "COMPUTE", "NAME", "INVARSPEC", "FAIRNESS", "JUSTICE", "COMPASSION", 
			"ISA", "ASSIGN", "CONSTRAINT", "SIMPWFF", "CTLWFF", "LTLWFF", "PSLWFF", 
			"COMPWFF", "IN", "MIN", "MAX", "MIRROR", "PRED", "PREDICATES", "BI_WORD1", 
			"BI_BOOL", "BI_SIGNED", "BI_UNSIGNED", "BI_EXTEND", "BI_RESIZE", "BI_SIZEOF", 
			"BI_UWCONST", "BI_SWCONST", "BI_INIT", "BI_SELF", "BI_COUNT", "BI_ABS", 
			"BI_MAX", "BI_MIN", "T_ARRAY", "T_OF", "T_BOOLEAN", "T_INTEGER", "T_REAL", 
			"T_WORD", "OP_EX", "OP_AX", "OP_EF", "OP_AF", "OP_EG", "OP_AG", "OP_E", 
			"OP_F", "OP_O", "OP_G", "OP_H", "OP_X", "OP_Y", "OP_Z", "OP_A", "OP_U", 
			"OP_S", "OP_V", "OP_T", "OP_BU", "OP_EBF", "OP_ABF", "OP_EBG", "OP_ABG", 
			"OP_NEXT", "OP_MOD", "OP_UNION", "OP_IN", "OP_XOR", "OP_XNOR", "OP_AND", 
			"OP_OR", "EXCLAMATION", "PLUS", "MINUS", "MINUS_ARROW", "L_ARROW", "R_ARROW", 
			"ASTERISK", "SLASH", "IDENTIFICATOR", "ASSIGN_OP", "STATE_ASSIGN", "L_SQUARE_BRACKET", 
			"R_SQUARE_BRACKET", "L_BRACKET", "R_BRACKET", "L_BRACE", "R_BRACE", "SEMICOLON", 
			"COLON", "COMMA", "INTEGER", "BIN", "OCT", "DEC", "HEX", "COMMENT", "LINE_COMMENT", 
			"WS", "BR", "BAD_CHARACTER"
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
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NuXmvParser.EOF, 0); }
		public List<ModuleContext> module() {
			return getRuleContexts(ModuleContext.class);
		}
		public ModuleContext module(int i) {
			return getRuleContext(ModuleContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODULE) {
				{
				{
				setState(46);
				module();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(EOF);
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
	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(NuXmvParser.MODULE, 0); }
		public TerminalNode IDENTIFICATOR() { return getToken(NuXmvParser.IDENTIFICATOR, 0); }
		public ModuleBodyContext moduleBody() {
			return getRuleContext(ModuleBodyContext.class,0);
		}
		public Variables_declarationsContext variables_declarations() {
			return getRuleContext(Variables_declarationsContext.class,0);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(MODULE);
			setState(55);
			match(IDENTIFICATOR);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_BRACKET) {
				{
				setState(56);
				variables_declarations();
				}
			}

			setState(59);
			moduleBody();
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
	public static class Variables_declarationsContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(NuXmvParser.L_BRACKET, 0); }
		public Variables_listContext variables_list() {
			return getRuleContext(Variables_listContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(NuXmvParser.R_BRACKET, 0); }
		public Variables_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables_declarations; }
	}

	public final Variables_declarationsContext variables_declarations() throws RecognitionException {
		Variables_declarationsContext _localctx = new Variables_declarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variables_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(L_BRACKET);
			setState(62);
			variables_list();
			setState(63);
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
	public static class Variables_listContext extends ParserRuleContext {
		public TerminalNode IDENTIFICATOR() { return getToken(NuXmvParser.IDENTIFICATOR, 0); }
		public TerminalNode COMMA() { return getToken(NuXmvParser.COMMA, 0); }
		public Variables_listContext variables_list() {
			return getRuleContext(Variables_listContext.class,0);
		}
		public Variables_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables_list; }
	}

	public final Variables_listContext variables_list() throws RecognitionException {
		Variables_listContext _localctx = new Variables_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variables_list);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(IDENTIFICATOR);
				setState(66);
				match(COMMA);
				setState(67);
				variables_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(IDENTIFICATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleBodyContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public SpecContext spec() {
			return getRuleContext(SpecContext.class,0);
		}
		public ModuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleBody; }
	}

	public final ModuleBodyContext moduleBody() throws RecognitionException {
		ModuleBodyContext _localctx = new ModuleBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_moduleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			varDeclaration();
			setState(72);
			assignment();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LTLSPEC) {
				{
				setState(73);
				spec();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(NuXmvParser.VAR, 0); }
		public List<TerminalNode> IDENTIFICATOR() { return getTokens(NuXmvParser.IDENTIFICATOR); }
		public TerminalNode IDENTIFICATOR(int i) {
			return getToken(NuXmvParser.IDENTIFICATOR, i);
		}
		public List<TerminalNode> COLON() { return getTokens(NuXmvParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(NuXmvParser.COLON, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(NuXmvParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(NuXmvParser.SEMICOLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> L_BRACE() { return getTokens(NuXmvParser.L_BRACE); }
		public TerminalNode L_BRACE(int i) {
			return getToken(NuXmvParser.L_BRACE, i);
		}
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public List<TerminalNode> R_BRACE() { return getTokens(NuXmvParser.R_BRACE); }
		public TerminalNode R_BRACE(int i) {
			return getToken(NuXmvParser.R_BRACE, i);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(VAR);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFICATOR) {
				{
				{
				setState(77);
				match(IDENTIFICATOR);
				setState(78);
				match(COLON);
				setState(84);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ARRAY:
				case T_BOOLEAN:
				case T_INTEGER:
				case T_REAL:
					{
					setState(79);
					type();
					}
					break;
				case L_BRACE:
					{
					setState(80);
					match(L_BRACE);
					setState(81);
					expressions();
					setState(82);
					match(R_BRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(86);
				match(SEMICOLON);
				}
				}
				setState(92);
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(NuXmvParser.ASSIGN, 0); }
		public List<Assign_statmentContext> assign_statment() {
			return getRuleContexts(Assign_statmentContext.class);
		}
		public Assign_statmentContext assign_statment(int i) {
			return getRuleContext(Assign_statmentContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ASSIGN);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BI_INIT || _la==OP_NEXT) {
				{
				{
				setState(94);
				assign_statment(0);
				}
				}
				setState(99);
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
	public static class Assign_statmentContext extends ParserRuleContext {
		public Init_statementContext init_statement() {
			return getRuleContext(Init_statementContext.class,0);
		}
		public TerminalNode STATE_ASSIGN() { return getToken(NuXmvParser.STATE_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN_OP() { return getToken(NuXmvParser.ASSIGN_OP, 0); }
		public TerminalNode SEMICOLON() { return getToken(NuXmvParser.SEMICOLON, 0); }
		public Next_statementContext next_statement() {
			return getRuleContext(Next_statementContext.class,0);
		}
		public TerminalNode COLON() { return getToken(NuXmvParser.COLON, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public NextContext next() {
			return getRuleContext(NextContext.class,0);
		}
		public Assign_statmentContext assign_statment() {
			return getRuleContext(Assign_statmentContext.class,0);
		}
		public Assign_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statment; }
	}

	public final Assign_statmentContext assign_statment() throws RecognitionException {
		return assign_statment(0);
	}

	private Assign_statmentContext assign_statment(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Assign_statmentContext _localctx = new Assign_statmentContext(_ctx, _parentState);
		Assign_statmentContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_assign_statment, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(101);
				init_statement();
				setState(102);
				match(STATE_ASSIGN);
				setState(103);
				expression(0);
				}
				break;
			case 2:
				{
				setState(105);
				init_statement();
				setState(106);
				match(ASSIGN_OP);
				setState(107);
				expression(0);
				setState(108);
				match(SEMICOLON);
				}
				break;
			case 3:
				{
				setState(110);
				next_statement();
				setState(111);
				match(STATE_ASSIGN);
				setState(112);
				expression(0);
				}
				break;
			case 4:
				{
				setState(114);
				next_statement();
				setState(115);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN_OP || _la==COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				expression(0);
				setState(117);
				match(SEMICOLON);
				}
				break;
			case 5:
				{
				setState(119);
				init();
				}
				break;
			case 6:
				{
				setState(120);
				next();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(134);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new Assign_statmentContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assign_statment);
						setState(123);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(124);
						match(COLON);
						setState(125);
						expression(0);
						setState(126);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new Assign_statmentContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assign_statment);
						setState(128);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(129);
						match(ASSIGN_OP);
						setState(130);
						expression(0);
						}
						break;
					case 3:
						{
						_localctx = new Assign_statmentContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assign_statment);
						setState(131);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(132);
						match(STATE_ASSIGN);
						setState(133);
						expression(0);
						}
						break;
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	public static class InitContext extends ParserRuleContext {
		public Init_statementContext init_statement() {
			return getRuleContext(Init_statementContext.class,0);
		}
		public TerminalNode ASSIGN_OP() { return getToken(NuXmvParser.ASSIGN_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			init_statement();
			setState(140);
			match(ASSIGN_OP);
			setState(141);
			expression(0);
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
	public static class Init_statementContext extends ParserRuleContext {
		public TerminalNode BI_INIT() { return getToken(NuXmvParser.BI_INIT, 0); }
		public TerminalNode L_BRACKET() { return getToken(NuXmvParser.L_BRACKET, 0); }
		public TerminalNode IDENTIFICATOR() { return getToken(NuXmvParser.IDENTIFICATOR, 0); }
		public TerminalNode R_BRACKET() { return getToken(NuXmvParser.R_BRACKET, 0); }
		public Init_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_statement; }
	}

	public final Init_statementContext init_statement() throws RecognitionException {
		Init_statementContext _localctx = new Init_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_init_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(BI_INIT);
			setState(144);
			match(L_BRACKET);
			setState(145);
			match(IDENTIFICATOR);
			setState(146);
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
	public static class NextContext extends ParserRuleContext {
		public Next_statementContext next_statement() {
			return getRuleContext(Next_statementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next; }
	}

	public final NextContext next() throws RecognitionException {
		NextContext _localctx = new NextContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_next);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			next_statement();
			setState(149);
			expression(0);
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
	public static class Next_statementContext extends ParserRuleContext {
		public TerminalNode OP_NEXT() { return getToken(NuXmvParser.OP_NEXT, 0); }
		public TerminalNode L_BRACKET() { return getToken(NuXmvParser.L_BRACKET, 0); }
		public TerminalNode IDENTIFICATOR() { return getToken(NuXmvParser.IDENTIFICATOR, 0); }
		public TerminalNode R_BRACKET() { return getToken(NuXmvParser.R_BRACKET, 0); }
		public Next_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_statement; }
	}

	public final Next_statementContext next_statement() throws RecognitionException {
		Next_statementContext _localctx = new Next_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_next_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(OP_NEXT);
			setState(152);
			match(L_BRACKET);
			setState(153);
			match(IDENTIFICATOR);
			setState(154);
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
	public static class SpecContext extends ParserRuleContext {
		public TerminalNode LTLSPEC() { return getToken(NuXmvParser.LTLSPEC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(NuXmvParser.SEMICOLON, 0); }
		public SpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec; }
	}

	public final SpecContext spec() throws RecognitionException {
		SpecContext _localctx = new SpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(LTLSPEC);
			setState(157);
			expression(0);
			setState(158);
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
	public static class ExpressionsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(NuXmvParser.COMMA, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressions);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				expression(0);
				setState(162);
				match(COMMA);
				setState(163);
				expressions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(NuXmvParser.L_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode R_BRACKET() { return getToken(NuXmvParser.R_BRACKET, 0); }
		public TerminalNode L_BRACE() { return getToken(NuXmvParser.L_BRACE, 0); }
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(NuXmvParser.R_BRACE, 0); }
		public CaseContext case_() {
			return getRuleContext(CaseContext.class,0);
		}
		public Bit_opsContext bit_ops() {
			return getRuleContext(Bit_opsContext.class,0);
		}
		public Spec_operatorsContext spec_operators() {
			return getRuleContext(Spec_operatorsContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(NuXmvParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(NuXmvParser.SLASH, 0); }
		public TerminalNode PLUS() { return getToken(NuXmvParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NuXmvParser.MINUS, 0); }
		public TerminalNode STATE_ASSIGN() { return getToken(NuXmvParser.STATE_ASSIGN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCLAMATION:
			case IDENTIFICATOR:
			case INTEGER:
				{
				setState(169);
				value();
				}
				break;
			case L_BRACKET:
				{
				setState(170);
				match(L_BRACKET);
				setState(171);
				expression(0);
				setState(172);
				match(R_BRACKET);
				}
				break;
			case L_BRACE:
				{
				setState(174);
				match(L_BRACE);
				setState(175);
				value_list();
				setState(176);
				match(R_BRACE);
				}
				break;
			case CASE:
				{
				setState(178);
				case_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(198);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(182);
						bit_ops();
						setState(183);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(185);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(186);
						spec_operators();
						setState(187);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(190);
						_la = _input.LA(1);
						if ( !(_la==ASTERISK || _la==SLASH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(191);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(193);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(194);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(196);
						match(STATE_ASSIGN);
						setState(197);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
	public static class Unar_opsContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION() { return getToken(NuXmvParser.EXCLAMATION, 0); }
		public Unar_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unar_ops; }
	}

	public final Unar_opsContext unar_ops() throws RecognitionException {
		Unar_opsContext _localctx = new Unar_opsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unar_ops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(EXCLAMATION);
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
	public static class Spec_operatorsContext extends ParserRuleContext {
		public TerminalNode OP_EX() { return getToken(NuXmvParser.OP_EX, 0); }
		public TerminalNode OP_EG() { return getToken(NuXmvParser.OP_EG, 0); }
		public TerminalNode OP_EF() { return getToken(NuXmvParser.OP_EF, 0); }
		public TerminalNode OP_AX() { return getToken(NuXmvParser.OP_AX, 0); }
		public TerminalNode OP_AG() { return getToken(NuXmvParser.OP_AG, 0); }
		public TerminalNode OP_AF() { return getToken(NuXmvParser.OP_AF, 0); }
		public TerminalNode OP_BU() { return getToken(NuXmvParser.OP_BU, 0); }
		public TerminalNode OP_EBF() { return getToken(NuXmvParser.OP_EBF, 0); }
		public TerminalNode OP_EBG() { return getToken(NuXmvParser.OP_EBG, 0); }
		public TerminalNode OP_ABF() { return getToken(NuXmvParser.OP_ABF, 0); }
		public TerminalNode OP_ABG() { return getToken(NuXmvParser.OP_ABG, 0); }
		public TerminalNode OP_E() { return getToken(NuXmvParser.OP_E, 0); }
		public TerminalNode OP_F() { return getToken(NuXmvParser.OP_F, 0); }
		public TerminalNode OP_O() { return getToken(NuXmvParser.OP_O, 0); }
		public TerminalNode OP_G() { return getToken(NuXmvParser.OP_G, 0); }
		public TerminalNode OP_U() { return getToken(NuXmvParser.OP_U, 0); }
		public TerminalNode OP_H() { return getToken(NuXmvParser.OP_H, 0); }
		public TerminalNode OP_X() { return getToken(NuXmvParser.OP_X, 0); }
		public TerminalNode OP_Y() { return getToken(NuXmvParser.OP_Y, 0); }
		public TerminalNode OP_Z() { return getToken(NuXmvParser.OP_Z, 0); }
		public TerminalNode OP_A() { return getToken(NuXmvParser.OP_A, 0); }
		public TerminalNode OP_S() { return getToken(NuXmvParser.OP_S, 0); }
		public TerminalNode OP_V() { return getToken(NuXmvParser.OP_V, 0); }
		public TerminalNode OP_T() { return getToken(NuXmvParser.OP_T, 0); }
		public Spec_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_operators; }
	}

	public final Spec_operatorsContext spec_operators() throws RecognitionException {
		Spec_operatorsContext _localctx = new Spec_operatorsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_spec_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 16777215L) != 0)) ) {
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
	public static class Bit_opsContext extends ParserRuleContext {
		public TerminalNode OP_AND() { return getToken(NuXmvParser.OP_AND, 0); }
		public TerminalNode OP_OR() { return getToken(NuXmvParser.OP_OR, 0); }
		public TerminalNode OP_XOR() { return getToken(NuXmvParser.OP_XOR, 0); }
		public TerminalNode OP_XNOR() { return getToken(NuXmvParser.OP_XNOR, 0); }
		public TerminalNode OP_IN() { return getToken(NuXmvParser.OP_IN, 0); }
		public TerminalNode OP_MOD() { return getToken(NuXmvParser.OP_MOD, 0); }
		public Bit_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_ops; }
	}

	public final Bit_opsContext bit_ops() throws RecognitionException {
		Bit_opsContext _localctx = new Bit_opsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bit_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 125L) != 0)) ) {
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
	public static class CaseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(NuXmvParser.CASE, 0); }
		public TerminalNode ESAC() { return getToken(NuXmvParser.ESAC, 0); }
		public List<Case_statmentContext> case_statment() {
			return getRuleContexts(Case_statmentContext.class);
		}
		public Case_statmentContext case_statment(int i) {
			return getRuleContext(Case_statmentContext.class,i);
		}
		public CaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case; }
	}

	public final CaseContext case_() throws RecognitionException {
		CaseContext _localctx = new CaseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(CASE);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==BI_INIT || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & 278987009L) != 0)) {
				{
				{
				setState(210);
				case_statment();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
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
	public static class Case_statmentContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(NuXmvParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(NuXmvParser.SEMICOLON, 0); }
		public Assign_statmentContext assign_statment() {
			return getRuleContext(Assign_statmentContext.class,0);
		}
		public Case_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statment; }
	}

	public final Case_statmentContext case_statment() throws RecognitionException {
		Case_statmentContext _localctx = new Case_statmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_case_statment);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
			case EXCLAMATION:
			case IDENTIFICATOR:
			case L_BRACKET:
			case L_BRACE:
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				expression(0);
				setState(219);
				match(COLON);
				setState(220);
				expression(0);
				setState(221);
				match(SEMICOLON);
				}
				break;
			case BI_INIT:
			case OP_NEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				assign_statment(0);
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
		public TerminalNode T_BOOLEAN() { return getToken(NuXmvParser.T_BOOLEAN, 0); }
		public TerminalNode T_INTEGER() { return getToken(NuXmvParser.T_INTEGER, 0); }
		public TerminalNode T_REAL() { return getToken(NuXmvParser.T_REAL, 0); }
		public TerminalNode T_ARRAY() { return getToken(NuXmvParser.T_ARRAY, 0); }
		public TerminalNode L_SQUARE_BRACKET() { return getToken(NuXmvParser.L_SQUARE_BRACKET, 0); }
		public TerminalNode R_SQUARE_BRACKET() { return getToken(NuXmvParser.R_SQUARE_BRACKET, 0); }
		public TerminalNode T_OF() { return getToken(NuXmvParser.T_OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type);
		int _la;
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(T_BOOLEAN);
				}
				break;
			case T_INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(T_INTEGER);
				}
				break;
			case T_REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(T_REAL);
				}
				break;
			case T_ARRAY:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(T_ARRAY);
				setState(230);
				match(L_SQUARE_BRACKET);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 1048833L) != 0)) {
					{
					setState(231);
					value_list();
					}
				}

				setState(234);
				match(R_SQUARE_BRACKET);
				setState(235);
				match(T_OF);
				setState(236);
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
	public static class Value_listContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(NuXmvParser.COMMA, 0); }
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public Value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list; }
	}

	public final Value_listContext value_list() throws RecognitionException {
		Value_listContext _localctx = new Value_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_value_list);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				value();
				setState(241);
				match(COMMA);
				setState(242);
				value_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public Unar_opsContext unar_ops() {
			return getRuleContext(Unar_opsContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode IDENTIFICATOR() { return getToken(NuXmvParser.IDENTIFICATOR, 0); }
		public TerminalNode INTEGER() { return getToken(NuXmvParser.INTEGER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_value);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCLAMATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				unar_ops();
				setState(247);
				value();
				}
				break;
			case IDENTIFICATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(IDENTIFICATOR);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(INTEGER);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return assign_statment_sempred((Assign_statmentContext)_localctx, predIndex);
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean assign_statment_sempred(Assign_statmentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001w\u00fe\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0005\u00000\b\u0000\n\u0000\f\u0000"+
		"3\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001:\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003F\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"K\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005U\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005Y\b\u0005\n\u0005\f\u0005\\\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0005\u0006`\b\u0006\n\u0006\f\u0006c\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007z\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0087\b\u0007\n\u0007"+
		"\f\u0007\u008a\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a7\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b4\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00c7\b\u000e\n\u000e\f\u000e\u00ca\t\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u00d4\b\u0012\n\u0012\f\u0012\u00d7\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00e1\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u00e9\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u00ee\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u00f5\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00fc\b\u0016\u0001\u0016"+
		"\u0000\u0002\u000e\u001c\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000\u0005\u0002\u0000"+
		"ccll\u0001\u0000`a\u0001\u0000[\\\u0001\u0000:Q\u0002\u0000SSUY\u0108"+
		"\u00001\u0001\u0000\u0000\u0000\u00026\u0001\u0000\u0000\u0000\u0004="+
		"\u0001\u0000\u0000\u0000\u0006E\u0001\u0000\u0000\u0000\bG\u0001\u0000"+
		"\u0000\u0000\nL\u0001\u0000\u0000\u0000\f]\u0001\u0000\u0000\u0000\u000e"+
		"y\u0001\u0000\u0000\u0000\u0010\u008b\u0001\u0000\u0000\u0000\u0012\u008f"+
		"\u0001\u0000\u0000\u0000\u0014\u0094\u0001\u0000\u0000\u0000\u0016\u0097"+
		"\u0001\u0000\u0000\u0000\u0018\u009c\u0001\u0000\u0000\u0000\u001a\u00a6"+
		"\u0001\u0000\u0000\u0000\u001c\u00b3\u0001\u0000\u0000\u0000\u001e\u00cb"+
		"\u0001\u0000\u0000\u0000 \u00cd\u0001\u0000\u0000\u0000\"\u00cf\u0001"+
		"\u0000\u0000\u0000$\u00d1\u0001\u0000\u0000\u0000&\u00e0\u0001\u0000\u0000"+
		"\u0000(\u00ed\u0001\u0000\u0000\u0000*\u00f4\u0001\u0000\u0000\u0000,"+
		"\u00fb\u0001\u0000\u0000\u0000.0\u0003\u0002\u0001\u0000/.\u0001\u0000"+
		"\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u000024\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"45\u0005\u0000\u0000\u00015\u0001\u0001\u0000\u0000\u000067\u0005\u0001"+
		"\u0000\u000079\u0005b\u0000\u00008:\u0003\u0004\u0002\u000098\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0003"+
		"\b\u0004\u0000<\u0003\u0001\u0000\u0000\u0000=>\u0005g\u0000\u0000>?\u0003"+
		"\u0006\u0003\u0000?@\u0005h\u0000\u0000@\u0005\u0001\u0000\u0000\u0000"+
		"AB\u0005b\u0000\u0000BC\u0005m\u0000\u0000CF\u0003\u0006\u0003\u0000D"+
		"F\u0005b\u0000\u0000EA\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000"+
		"F\u0007\u0001\u0000\u0000\u0000GH\u0003\n\u0005\u0000HJ\u0003\f\u0006"+
		"\u0000IK\u0003\u0018\f\u0000JI\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000K\t\u0001\u0000\u0000\u0000LZ\u0005\u0005\u0000\u0000MN\u0005b\u0000"+
		"\u0000NT\u0005l\u0000\u0000OU\u0003(\u0014\u0000PQ\u0005i\u0000\u0000"+
		"QR\u0003\u001a\r\u0000RS\u0005j\u0000\u0000SU\u0001\u0000\u0000\u0000"+
		"TO\u0001\u0000\u0000\u0000TP\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000VW\u0005k\u0000\u0000WY\u0001\u0000\u0000\u0000XM\u0001\u0000\u0000"+
		"\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[\u000b\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"]a\u0005\u0018\u0000\u0000^`\u0003\u000e\u0007\u0000_^\u0001\u0000\u0000"+
		"\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000b\r\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0006"+
		"\u0007\uffff\uffff\u0000ef\u0003\u0012\t\u0000fg\u0005d\u0000\u0000gh"+
		"\u0003\u001c\u000e\u0000hz\u0001\u0000\u0000\u0000ij\u0003\u0012\t\u0000"+
		"jk\u0005c\u0000\u0000kl\u0003\u001c\u000e\u0000lm\u0005k\u0000\u0000m"+
		"z\u0001\u0000\u0000\u0000no\u0003\u0016\u000b\u0000op\u0005d\u0000\u0000"+
		"pq\u0003\u001c\u000e\u0000qz\u0001\u0000\u0000\u0000rs\u0003\u0016\u000b"+
		"\u0000st\u0007\u0000\u0000\u0000tu\u0003\u001c\u000e\u0000uv\u0005k\u0000"+
		"\u0000vz\u0001\u0000\u0000\u0000wz\u0003\u0010\b\u0000xz\u0003\u0014\n"+
		"\u0000yd\u0001\u0000\u0000\u0000yi\u0001\u0000\u0000\u0000yn\u0001\u0000"+
		"\u0000\u0000yr\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yx\u0001"+
		"\u0000\u0000\u0000z\u0088\u0001\u0000\u0000\u0000{|\n\t\u0000\u0000|}"+
		"\u0005l\u0000\u0000}~\u0003\u001c\u000e\u0000~\u007f\u0005k\u0000\u0000"+
		"\u007f\u0087\u0001\u0000\u0000\u0000\u0080\u0081\n\u0004\u0000\u0000\u0081"+
		"\u0082\u0005c\u0000\u0000\u0082\u0087\u0003\u001c\u000e\u0000\u0083\u0084"+
		"\n\u0003\u0000\u0000\u0084\u0085\u0005d\u0000\u0000\u0085\u0087\u0003"+
		"\u001c\u000e\u0000\u0086{\u0001\u0000\u0000\u0000\u0086\u0080\u0001\u0000"+
		"\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u000f\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0003\u0012\t\u0000\u008c\u008d\u0005c\u0000"+
		"\u0000\u008d\u008e\u0003\u001c\u000e\u0000\u008e\u0011\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0005.\u0000\u0000\u0090\u0091\u0005g\u0000\u0000\u0091"+
		"\u0092\u0005b\u0000\u0000\u0092\u0093\u0005h\u0000\u0000\u0093\u0013\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0003\u0016\u000b\u0000\u0095\u0096\u0003"+
		"\u001c\u000e\u0000\u0096\u0015\u0001\u0000\u0000\u0000\u0097\u0098\u0005"+
		"R\u0000\u0000\u0098\u0099\u0005g\u0000\u0000\u0099\u009a\u0005b\u0000"+
		"\u0000\u009a\u009b\u0005h\u0000\u0000\u009b\u0017\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0005\u000f\u0000\u0000\u009d\u009e\u0003\u001c\u000e\u0000"+
		"\u009e\u009f\u0005k\u0000\u0000\u009f\u0019\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003\u001c\u000e\u0000\u00a2"+
		"\u00a3\u0005m\u0000\u0000\u00a3\u00a4\u0003\u001a\r\u0000\u00a4\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a7\u0003\u001c\u000e\u0000\u00a6\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a1\u0001\u0000\u0000\u0000\u00a6\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u001b\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0006\u000e\uffff\uffff\u0000\u00a9\u00b4\u0003,\u0016\u0000\u00aa\u00ab"+
		"\u0005g\u0000\u0000\u00ab\u00ac\u0003\u001c\u000e\u0000\u00ac\u00ad\u0005"+
		"h\u0000\u0000\u00ad\u00b4\u0001\u0000\u0000\u0000\u00ae\u00af\u0005i\u0000"+
		"\u0000\u00af\u00b0\u0003*\u0015\u0000\u00b0\u00b1\u0005j\u0000\u0000\u00b1"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b4\u0003$\u0012\u0000\u00b3\u00a8"+
		"\u0001\u0000\u0000\u0000\u00b3\u00aa\u0001\u0000\u0000\u0000\u00b3\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00c8"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\n\b\u0000\u0000\u00b6\u00b7\u0003"+
		"\"\u0011\u0000\u00b7\u00b8\u0003\u001c\u000e\t\u00b8\u00c7\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\n\u0007\u0000\u0000\u00ba\u00bb\u0003 \u0010"+
		"\u0000\u00bb\u00bc\u0003\u001c\u000e\b\u00bc\u00c7\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\n\u0006\u0000\u0000\u00be\u00bf\u0007\u0001\u0000\u0000\u00bf"+
		"\u00c7\u0003\u001c\u000e\u0007\u00c0\u00c1\n\u0005\u0000\u0000\u00c1\u00c2"+
		"\u0007\u0002\u0000\u0000\u00c2\u00c7\u0003\u001c\u000e\u0006\u00c3\u00c4"+
		"\n\u0002\u0000\u0000\u00c4\u00c5\u0005d\u0000\u0000\u00c5\u00c7\u0003"+
		"\u001c\u000e\u0003\u00c6\u00b5\u0001\u0000\u0000\u0000\u00c6\u00b9\u0001"+
		"\u0000\u0000\u0000\u00c6\u00bd\u0001\u0000\u0000\u0000\u00c6\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c3\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u001d\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0005Z\u0000\u0000\u00cc\u001f\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0007\u0003\u0000\u0000\u00ce!\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0007\u0004\u0000\u0000\u00d0#\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d5\u0005\b\u0000\u0000\u00d2\u00d4\u0003&\u0013\u0000\u00d3"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0005\t\u0000\u0000\u00d9%\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0003\u001c\u000e\u0000\u00db\u00dc\u0005l\u0000\u0000\u00dc\u00dd\u0003"+
		"\u001c\u000e\u0000\u00dd\u00de\u0005k\u0000\u0000\u00de\u00e1\u0001\u0000"+
		"\u0000\u0000\u00df\u00e1\u0003\u000e\u0007\u0000\u00e0\u00da\u0001\u0000"+
		"\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\'\u0001\u0000\u0000"+
		"\u0000\u00e2\u00ee\u00056\u0000\u0000\u00e3\u00ee\u00057\u0000\u0000\u00e4"+
		"\u00ee\u00058\u0000\u0000\u00e5\u00e6\u00054\u0000\u0000\u00e6\u00e8\u0005"+
		"e\u0000\u0000\u00e7\u00e9\u0003*\u0015\u0000\u00e8\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0005f\u0000\u0000\u00eb\u00ec\u00055\u0000\u0000\u00ec"+
		"\u00ee\u0003(\u0014\u0000\u00ed\u00e2\u0001\u0000\u0000\u0000\u00ed\u00e3"+
		"\u0001\u0000\u0000\u0000\u00ed\u00e4\u0001\u0000\u0000\u0000\u00ed\u00e5"+
		"\u0001\u0000\u0000\u0000\u00ee)\u0001\u0000\u0000\u0000\u00ef\u00f5\u0003"+
		",\u0016\u0000\u00f0\u00f1\u0003,\u0016\u0000\u00f1\u00f2\u0005m\u0000"+
		"\u0000\u00f2\u00f3\u0003*\u0015\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f4\u00ef\u0001\u0000\u0000\u0000\u00f4\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f5+\u0001\u0000\u0000\u0000\u00f6\u00f7\u0003\u001e\u000f\u0000\u00f7"+
		"\u00f8\u0003,\u0016\u0000\u00f8\u00fc\u0001\u0000\u0000\u0000\u00f9\u00fc"+
		"\u0005b\u0000\u0000\u00fa\u00fc\u0005n\u0000\u0000\u00fb\u00f6\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fc-\u0001\u0000\u0000\u0000\u001419EJTZay\u0086\u0088"+
		"\u00a6\u00b3\u00c6\u00c8\u00d5\u00e0\u00e8\u00ed\u00f4\u00fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}