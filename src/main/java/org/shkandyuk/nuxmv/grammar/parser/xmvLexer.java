// Generated from /home/denis/Documents/5_ITMO/NIR/nuXmv/src/main/java/org/shkandyuk/nuxmv/grammar/parser/xmvLexer.g4 by ANTLR 4.13.1
package org.shkandyuk.nuxmv.grammar.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class xmvLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MODULE=1, VAR=2, ASSIGN=3, SPEC=4, BOOLEAN=5, INTEGER=6, REAL=7, ARRAY=8, 
		OF=9, TRUE=10, FALSE=11, PLUS=12, MINUS=13, MUL=14, DIV=15, AND=16, OR=17, 
		IMPLIES=18, IFF=19, EQ=20, NEQ=21, LPAREN=22, RPAREN=23, LBRACK=24, RBRACK=25, 
		COLON=26, SEMI=27, COMMA=28, DOTDOT=29, ID=30, INT=31, WS=32, COLONEQ=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MODULE", "VAR", "ASSIGN", "SPEC", "BOOLEAN", "INTEGER", "REAL", "ARRAY", 
			"OF", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", "AND", "OR", "IMPLIES", 
			"IFF", "EQ", "NEQ", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "COLON", 
			"SEMI", "COMMA", "DOTDOT", "ID", "INT", "WS", "COLONEQ"
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


	public xmvLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "xmvLexer.g4"; }

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
		"\u0004\u0000!\u00c5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u00b2\b\u001d\n\u001d\f\u001d\u00b5\t\u001d\u0001\u001e"+
		"\u0004\u001e\u00b8\b\u001e\u000b\u001e\f\u001e\u00b9\u0001\u001f\u0004"+
		"\u001f\u00bd\b\u001f\u000b\u001f\f\u001f\u00be\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0000\u0000!\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c"+
		"9\u001d;\u001e=\u001f? A!\u0001\u0000\u0004\u0003\u0000AZ__az\u0004\u0000"+
		"09AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  \u00c7\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000"+
		"?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0001C\u0001"+
		"\u0000\u0000\u0000\u0003J\u0001\u0000\u0000\u0000\u0005N\u0001\u0000\u0000"+
		"\u0000\u0007U\u0001\u0000\u0000\u0000\tZ\u0001\u0000\u0000\u0000\u000b"+
		"b\u0001\u0000\u0000\u0000\rj\u0001\u0000\u0000\u0000\u000fo\u0001\u0000"+
		"\u0000\u0000\u0011u\u0001\u0000\u0000\u0000\u0013x\u0001\u0000\u0000\u0000"+
		"\u0015}\u0001\u0000\u0000\u0000\u0017\u0083\u0001\u0000\u0000\u0000\u0019"+
		"\u0085\u0001\u0000\u0000\u0000\u001b\u0087\u0001\u0000\u0000\u0000\u001d"+
		"\u0089\u0001\u0000\u0000\u0000\u001f\u008b\u0001\u0000\u0000\u0000!\u008f"+
		"\u0001\u0000\u0000\u0000#\u0092\u0001\u0000\u0000\u0000%\u0095\u0001\u0000"+
		"\u0000\u0000\'\u0099\u0001\u0000\u0000\u0000)\u009b\u0001\u0000\u0000"+
		"\u0000+\u009e\u0001\u0000\u0000\u0000-\u00a0\u0001\u0000\u0000\u0000/"+
		"\u00a2\u0001\u0000\u0000\u00001\u00a4\u0001\u0000\u0000\u00003\u00a6\u0001"+
		"\u0000\u0000\u00005\u00a8\u0001\u0000\u0000\u00007\u00aa\u0001\u0000\u0000"+
		"\u00009\u00ac\u0001\u0000\u0000\u0000;\u00af\u0001\u0000\u0000\u0000="+
		"\u00b7\u0001\u0000\u0000\u0000?\u00bc\u0001\u0000\u0000\u0000A\u00c2\u0001"+
		"\u0000\u0000\u0000CD\u0005M\u0000\u0000DE\u0005O\u0000\u0000EF\u0005D"+
		"\u0000\u0000FG\u0005U\u0000\u0000GH\u0005L\u0000\u0000HI\u0005E\u0000"+
		"\u0000I\u0002\u0001\u0000\u0000\u0000JK\u0005V\u0000\u0000KL\u0005A\u0000"+
		"\u0000LM\u0005R\u0000\u0000M\u0004\u0001\u0000\u0000\u0000NO\u0005A\u0000"+
		"\u0000OP\u0005S\u0000\u0000PQ\u0005S\u0000\u0000QR\u0005I\u0000\u0000"+
		"RS\u0005G\u0000\u0000ST\u0005N\u0000\u0000T\u0006\u0001\u0000\u0000\u0000"+
		"UV\u0005S\u0000\u0000VW\u0005P\u0000\u0000WX\u0005E\u0000\u0000XY\u0005"+
		"C\u0000\u0000Y\b\u0001\u0000\u0000\u0000Z[\u0005b\u0000\u0000[\\\u0005"+
		"o\u0000\u0000\\]\u0005o\u0000\u0000]^\u0005l\u0000\u0000^_\u0005e\u0000"+
		"\u0000_`\u0005a\u0000\u0000`a\u0005n\u0000\u0000a\n\u0001\u0000\u0000"+
		"\u0000bc\u0005i\u0000\u0000cd\u0005n\u0000\u0000de\u0005t\u0000\u0000"+
		"ef\u0005e\u0000\u0000fg\u0005g\u0000\u0000gh\u0005e\u0000\u0000hi\u0005"+
		"r\u0000\u0000i\f\u0001\u0000\u0000\u0000jk\u0005r\u0000\u0000kl\u0005"+
		"e\u0000\u0000lm\u0005a\u0000\u0000mn\u0005l\u0000\u0000n\u000e\u0001\u0000"+
		"\u0000\u0000op\u0005a\u0000\u0000pq\u0005r\u0000\u0000qr\u0005r\u0000"+
		"\u0000rs\u0005a\u0000\u0000st\u0005y\u0000\u0000t\u0010\u0001\u0000\u0000"+
		"\u0000uv\u0005o\u0000\u0000vw\u0005f\u0000\u0000w\u0012\u0001\u0000\u0000"+
		"\u0000xy\u0005T\u0000\u0000yz\u0005R\u0000\u0000z{\u0005U\u0000\u0000"+
		"{|\u0005E\u0000\u0000|\u0014\u0001\u0000\u0000\u0000}~\u0005F\u0000\u0000"+
		"~\u007f\u0005A\u0000\u0000\u007f\u0080\u0005L\u0000\u0000\u0080\u0081"+
		"\u0005S\u0000\u0000\u0081\u0082\u0005E\u0000\u0000\u0082\u0016\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005+\u0000\u0000\u0084\u0018\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005-\u0000\u0000\u0086\u001a\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005*\u0000\u0000\u0088\u001c\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005/\u0000\u0000\u008a\u001e\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0005a\u0000\u0000\u008c\u008d\u0005n\u0000\u0000\u008d\u008e\u0005d"+
		"\u0000\u0000\u008e \u0001\u0000\u0000\u0000\u008f\u0090\u0005o\u0000\u0000"+
		"\u0090\u0091\u0005r\u0000\u0000\u0091\"\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0005=\u0000\u0000\u0093\u0094\u0005>\u0000\u0000\u0094$\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005<\u0000\u0000\u0096\u0097\u0005=\u0000"+
		"\u0000\u0097\u0098\u0005>\u0000\u0000\u0098&\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005=\u0000\u0000\u009a(\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"!\u0000\u0000\u009c\u009d\u0005=\u0000\u0000\u009d*\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005(\u0000\u0000\u009f,\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0005)\u0000\u0000\u00a1.\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"[\u0000\u0000\u00a30\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005]\u0000"+
		"\u0000\u00a52\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005:\u0000\u0000\u00a7"+
		"4\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005;\u0000\u0000\u00a96\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0005,\u0000\u0000\u00ab8\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0005.\u0000\u0000\u00ad\u00ae\u0005.\u0000\u0000\u00ae"+
		":\u0001\u0000\u0000\u0000\u00af\u00b3\u0007\u0000\u0000\u0000\u00b0\u00b2"+
		"\u0007\u0001\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b4<\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b8\u0007\u0002\u0000\u0000\u00b7\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba>\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bd\u0007\u0003\u0000\u0000\u00bc\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0006\u001f\u0000\u0000\u00c1@\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0005:\u0000\u0000\u00c3\u00c4\u0005=\u0000\u0000\u00c4"+
		"B\u0001\u0000\u0000\u0000\u0004\u0000\u00b3\u00b9\u00be\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}