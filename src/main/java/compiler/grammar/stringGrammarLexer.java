// Generated from D:/laby/protege/MathLangCompiler/src/main/java/compiler/grammar\stringGrammar.g4 by ANTLR 4.8

package compiler.grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class stringGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ASSIGN=2, INT_TYPE=3, STRING_TYPE=4, SEMICOLON=5, OPAR=6, CPAR=7, 
		OANGLEBR=8, EQOANGLEBR=9, CANGLEBR=10, EQCANGLEBR=11, OBRACKET=12, CBRACKET=13, 
		COLON=14, NEGATION=15, INCR=16, DECR=17, EQ=18, NEQ=19, IS=20, MUL=21, 
		DIV=22, ADD=23, SUB=24, IN=25, POW=26, PRINT=27, PRITTY_PRINT=28, CONST=29, 
		IF=30, ELSE=31, WHILE=32, FOREACH=33, FOR=34, CASE=35, DEFAULT=36, MAIN=37, 
		FUNCTION=38, RETURN=39, INT=40, STRING=41, ID=42, COMMENT=43, SPACES=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "ASSIGN", "INT_TYPE", "STRING_TYPE", "SEMICOLON", "OPAR", "CPAR", 
			"OANGLEBR", "EQOANGLEBR", "CANGLEBR", "EQCANGLEBR", "OBRACKET", "CBRACKET", 
			"COLON", "NEGATION", "INCR", "DECR", "EQ", "NEQ", "IS", "MUL", "DIV", 
			"ADD", "SUB", "IN", "POW", "PRINT", "PRITTY_PRINT", "CONST", "IF", "ELSE", 
			"WHILE", "FOREACH", "FOR", "CASE", "DEFAULT", "MAIN", "FUNCTION", "RETURN", 
			"INT", "STRING", "ID", "COMMENT", "SPACES"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'='", "'integer'", "'string'", "';'", "'('", "')'", "'<'", 
			"'<='", "'>'", "'>='", "'{'", "'}'", "':'", "'!'", "'++'", "'--'", "'=='", 
			"'!='", "'is'", "'*'", "'/'", "'+'", "'-'", "'in'", "'^'", "'print'", 
			"'<<'", "'const'", "'if'", "'else'", "'while'", "'forEach'", "'for'", 
			"'case'", "'default'", "'main'", "'fun'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ASSIGN", "INT_TYPE", "STRING_TYPE", "SEMICOLON", "OPAR", 
			"CPAR", "OANGLEBR", "EQOANGLEBR", "CANGLEBR", "EQCANGLEBR", "OBRACKET", 
			"CBRACKET", "COLON", "NEGATION", "INCR", "DECR", "EQ", "NEQ", "IS", "MUL", 
			"DIV", "ADD", "SUB", "IN", "POW", "PRINT", "PRITTY_PRINT", "CONST", "IF", 
			"ELSE", "WHILE", "FOREACH", "FOR", "CASE", "DEFAULT", "MAIN", "FUNCTION", 
			"RETURN", "INT", "STRING", "ID", "COMMENT", "SPACES"
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


	public stringGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "stringGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0108\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\6)\u00ea\n)\r)\16)\u00eb\3*\6*\u00ef"+
		"\n*\r*\16*\u00f0\3+\3+\7+\u00f5\n+\f+\16+\u00f8\13+\3,\3,\3,\3,\7,\u00fe"+
		"\n,\f,\16,\u0101\13,\3,\3,\3-\3-\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.\3\2\b\3\2\62;\5\2\62;C\\c|\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17"+
		"\17\5\2\13\f\17\17\"\"\2\u010b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2"+
		"\2\5]\3\2\2\2\7_\3\2\2\2\tg\3\2\2\2\13n\3\2\2\2\rp\3\2\2\2\17r\3\2\2\2"+
		"\21t\3\2\2\2\23v\3\2\2\2\25y\3\2\2\2\27{\3\2\2\2\31~\3\2\2\2\33\u0080"+
		"\3\2\2\2\35\u0082\3\2\2\2\37\u0084\3\2\2\2!\u0086\3\2\2\2#\u0089\3\2\2"+
		"\2%\u008c\3\2\2\2\'\u008f\3\2\2\2)\u0092\3\2\2\2+\u0095\3\2\2\2-\u0097"+
		"\3\2\2\2/\u0099\3\2\2\2\61\u009b\3\2\2\2\63\u009d\3\2\2\2\65\u00a0\3\2"+
		"\2\2\67\u00a2\3\2\2\29\u00a8\3\2\2\2;\u00ab\3\2\2\2=\u00b1\3\2\2\2?\u00b4"+
		"\3\2\2\2A\u00b9\3\2\2\2C\u00bf\3\2\2\2E\u00c7\3\2\2\2G\u00cb\3\2\2\2I"+
		"\u00d0\3\2\2\2K\u00d8\3\2\2\2M\u00dd\3\2\2\2O\u00e1\3\2\2\2Q\u00e9\3\2"+
		"\2\2S\u00ee\3\2\2\2U\u00f2\3\2\2\2W\u00f9\3\2\2\2Y\u0104\3\2\2\2[\\\7"+
		".\2\2\\\4\3\2\2\2]^\7?\2\2^\6\3\2\2\2_`\7k\2\2`a\7p\2\2ab\7v\2\2bc\7g"+
		"\2\2cd\7i\2\2de\7g\2\2ef\7t\2\2f\b\3\2\2\2gh\7u\2\2hi\7v\2\2ij\7t\2\2"+
		"jk\7k\2\2kl\7p\2\2lm\7i\2\2m\n\3\2\2\2no\7=\2\2o\f\3\2\2\2pq\7*\2\2q\16"+
		"\3\2\2\2rs\7+\2\2s\20\3\2\2\2tu\7>\2\2u\22\3\2\2\2vw\7>\2\2wx\7?\2\2x"+
		"\24\3\2\2\2yz\7@\2\2z\26\3\2\2\2{|\7@\2\2|}\7?\2\2}\30\3\2\2\2~\177\7"+
		"}\2\2\177\32\3\2\2\2\u0080\u0081\7\177\2\2\u0081\34\3\2\2\2\u0082\u0083"+
		"\7<\2\2\u0083\36\3\2\2\2\u0084\u0085\7#\2\2\u0085 \3\2\2\2\u0086\u0087"+
		"\7-\2\2\u0087\u0088\7-\2\2\u0088\"\3\2\2\2\u0089\u008a\7/\2\2\u008a\u008b"+
		"\7/\2\2\u008b$\3\2\2\2\u008c\u008d\7?\2\2\u008d\u008e\7?\2\2\u008e&\3"+
		"\2\2\2\u008f\u0090\7#\2\2\u0090\u0091\7?\2\2\u0091(\3\2\2\2\u0092\u0093"+
		"\7k\2\2\u0093\u0094\7u\2\2\u0094*\3\2\2\2\u0095\u0096\7,\2\2\u0096,\3"+
		"\2\2\2\u0097\u0098\7\61\2\2\u0098.\3\2\2\2\u0099\u009a\7-\2\2\u009a\60"+
		"\3\2\2\2\u009b\u009c\7/\2\2\u009c\62\3\2\2\2\u009d\u009e\7k\2\2\u009e"+
		"\u009f\7p\2\2\u009f\64\3\2\2\2\u00a0\u00a1\7`\2\2\u00a1\66\3\2\2\2\u00a2"+
		"\u00a3\7r\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7p\2\2"+
		"\u00a6\u00a7\7v\2\2\u00a78\3\2\2\2\u00a8\u00a9\7>\2\2\u00a9\u00aa\7>\2"+
		"\2\u00aa:\3\2\2\2\u00ab\u00ac\7e\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7"+
		"p\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7v\2\2\u00b0<\3\2\2\2\u00b1\u00b2"+
		"\7k\2\2\u00b2\u00b3\7h\2\2\u00b3>\3\2\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6"+
		"\7n\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7g\2\2\u00b8@\3\2\2\2\u00b9\u00ba"+
		"\7y\2\2\u00ba\u00bb\7j\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7n\2\2\u00bd"+
		"\u00be\7g\2\2\u00beB\3\2\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1\7q\2\2\u00c1"+
		"\u00c2\7t\2\2\u00c2\u00c3\7G\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7e\2\2"+
		"\u00c5\u00c6\7j\2\2\u00c6D\3\2\2\2\u00c7\u00c8\7h\2\2\u00c8\u00c9\7q\2"+
		"\2\u00c9\u00ca\7t\2\2\u00caF\3\2\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7"+
		"c\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7g\2\2\u00cfH\3\2\2\2\u00d0\u00d1"+
		"\7f\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7h\2\2\u00d3\u00d4\7c\2\2\u00d4"+
		"\u00d5\7w\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7v\2\2\u00d7J\3\2\2\2\u00d8"+
		"\u00d9\7o\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7p\2\2"+
		"\u00dcL\3\2\2\2\u00dd\u00de\7h\2\2\u00de\u00df\7w\2\2\u00df\u00e0\7p\2"+
		"\2\u00e0N\3\2\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7"+
		"v\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7p\2\2\u00e7P"+
		"\3\2\2\2\u00e8\u00ea\t\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ecR\3\2\2\2\u00ed\u00ef\t\3\2\2"+
		"\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1T\3\2\2\2\u00f2\u00f6\t\4\2\2\u00f3\u00f5\t\5\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7V\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb"+
		"\7\61\2\2\u00fb\u00ff\3\2\2\2\u00fc\u00fe\n\6\2\2\u00fd\u00fc\3\2\2\2"+
		"\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102"+
		"\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\b,\2\2\u0103X\3\2\2\2\u0104\u0105"+
		"\t\7\2\2\u0105\u0106\3\2\2\2\u0106\u0107\b-\2\2\u0107Z\3\2\2\2\7\2\u00eb"+
		"\u00f0\u00f6\u00ff\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}