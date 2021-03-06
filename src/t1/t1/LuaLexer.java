// Generated from /home/jessica/Área de Trabalho/ufscar/CC1/T1/CC1-T1/src/t1/Lua.g4 by ANTLR 4.7
package t1;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, ENDL=3, FUNCTION=4, IF=5, THEN=6, ELSE=7, REPEAT=8, UNTIL=9, 
		FOR=10, DO=11, MINUS=12, PLUS=13, TIMES=14, DIVIDED=15, NOR=16, HASH=17, 
		LOCAL=18, ATRIBUICAO=19, COMPARACAO=20, LPAREN=21, RPAREN=22, END=23, 
		RETURN=24, FALSE=25, COMENTARIO_INICIO=26, UNDERSCORE=27, DOT=28, SEMI_C=29, 
		CADEIA=30, ID=31, NUMERO=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "WS", "ENDL", "LETRA", "ALGARISMO", "FUNCTION", "IF", "THEN", 
		"ELSE", "REPEAT", "UNTIL", "FOR", "DO", "MINUS", "PLUS", "TIMES", "DIVIDED", 
		"NOR", "HASH", "LOCAL", "ATRIBUICAO", "COMPARACAO", "LPAREN", "RPAREN", 
		"END", "RETURN", "FALSE", "COMENTARIO_INICIO", "UNDERSCORE", "DOT", "SEMI_C", 
		"CADEIA", "ID", "NUMERO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", null, null, "'function'", "'if'", "'then'", "'else'", "'repeat'", 
		"'until'", "'for'", "'do'", "'-'", "'+'", "'*'", "'/'", "'nor'", "'#'", 
		"'local'", "'='", null, "'('", "')'", "'end'", "'return'", "'false'", 
		null, "'_'", "'.'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WS", "ENDL", "FUNCTION", "IF", "THEN", "ELSE", "REPEAT", 
		"UNTIL", "FOR", "DO", "MINUS", "PLUS", "TIMES", "DIVIDED", "NOR", "HASH", 
		"LOCAL", "ATRIBUICAO", "COMPARACAO", "LPAREN", "RPAREN", "END", "RETURN", 
		"FALSE", "COMENTARIO_INICIO", "UNDERSCORE", "DOT", "SEMI_C", "CADEIA", 
		"ID", "NUMERO"
	};
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


	   public static String grupo="<<Digite os RAs do grupo aqui 619612>>";


	public LuaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lua.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00ed\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\3\3\3\3\4\5\4O\n\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\27\5\27\u009a\n\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\6\35\u00b5\n\35\r\35\16\35\u00b6\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\7!\u00c3\n!\f!\16!\u00c6\13!"+
		"\3!\3!\3!\7!\u00cb\n!\f!\16!\u00ce\13!\3!\5!\u00d1\n!\3\"\3\"\5\"\u00d5"+
		"\n\"\3\"\3\"\3\"\6\"\u00da\n\"\r\"\16\"\u00db\5\"\u00de\n\"\3#\7#\u00e1"+
		"\n#\f#\16#\u00e4\13#\3#\5#\u00e7\n#\3#\6#\u00ea\n#\r#\16#\u00eb\2\2$\3"+
		"\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17"+
		"!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36"+
		"?\37A C!E\"\3\2\7\5\2C\\c|~~\3\2\62;\4\2\f\f\17\17\4\2))^^\3\2$$\2\u00f7"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5I\3\2\2\2\7N\3\2\2\2\t"+
		"R\3\2\2\2\13T\3\2\2\2\rV\3\2\2\2\17_\3\2\2\2\21b\3\2\2\2\23g\3\2\2\2\25"+
		"l\3\2\2\2\27s\3\2\2\2\31y\3\2\2\2\33}\3\2\2\2\35\u0080\3\2\2\2\37\u0082"+
		"\3\2\2\2!\u0084\3\2\2\2#\u0086\3\2\2\2%\u0088\3\2\2\2\'\u008c\3\2\2\2"+
		")\u008e\3\2\2\2+\u0094\3\2\2\2-\u0099\3\2\2\2/\u009b\3\2\2\2\61\u009d"+
		"\3\2\2\2\63\u009f\3\2\2\2\65\u00a3\3\2\2\2\67\u00aa\3\2\2\29\u00b0\3\2"+
		"\2\2;\u00ba\3\2\2\2=\u00bc\3\2\2\2?\u00be\3\2\2\2A\u00d0\3\2\2\2C\u00d4"+
		"\3\2\2\2E\u00e2\3\2\2\2GH\7.\2\2H\4\3\2\2\2IJ\7\"\2\2JK\3\2\2\2KL\b\3"+
		"\2\2L\6\3\2\2\2MO\4\13\f\2NM\3\2\2\2OP\3\2\2\2PQ\b\4\2\2Q\b\3\2\2\2RS"+
		"\t\2\2\2S\n\3\2\2\2TU\t\3\2\2U\f\3\2\2\2VW\7h\2\2WX\7w\2\2XY\7p\2\2YZ"+
		"\7e\2\2Z[\7v\2\2[\\\7k\2\2\\]\7q\2\2]^\7p\2\2^\16\3\2\2\2_`\7k\2\2`a\7"+
		"h\2\2a\20\3\2\2\2bc\7v\2\2cd\7j\2\2de\7g\2\2ef\7p\2\2f\22\3\2\2\2gh\7"+
		"g\2\2hi\7n\2\2ij\7u\2\2jk\7g\2\2k\24\3\2\2\2lm\7t\2\2mn\7g\2\2no\7r\2"+
		"\2op\7g\2\2pq\7c\2\2qr\7v\2\2r\26\3\2\2\2st\7w\2\2tu\7p\2\2uv\7v\2\2v"+
		"w\7k\2\2wx\7n\2\2x\30\3\2\2\2yz\7h\2\2z{\7q\2\2{|\7t\2\2|\32\3\2\2\2}"+
		"~\7f\2\2~\177\7q\2\2\177\34\3\2\2\2\u0080\u0081\7/\2\2\u0081\36\3\2\2"+
		"\2\u0082\u0083\7-\2\2\u0083 \3\2\2\2\u0084\u0085\7,\2\2\u0085\"\3\2\2"+
		"\2\u0086\u0087\7\61\2\2\u0087$\3\2\2\2\u0088\u0089\7p\2\2\u0089\u008a"+
		"\7q\2\2\u008a\u008b\7t\2\2\u008b&\3\2\2\2\u008c\u008d\7%\2\2\u008d(\3"+
		"\2\2\2\u008e\u008f\7n\2\2\u008f\u0090\7q\2\2\u0090\u0091\7e\2\2\u0091"+
		"\u0092\7c\2\2\u0092\u0093\7n\2\2\u0093*\3\2\2\2\u0094\u0095\7?\2\2\u0095"+
		",\3\2\2\2\u0096\u0097\7?\2\2\u0097\u009a\7?\2\2\u0098\u009a\7@\2\2\u0099"+
		"\u0096\3\2\2\2\u0099\u0098\3\2\2\2\u009a.\3\2\2\2\u009b\u009c\7*\2\2\u009c"+
		"\60\3\2\2\2\u009d\u009e\7+\2\2\u009e\62\3\2\2\2\u009f\u00a0\7g\2\2\u00a0"+
		"\u00a1\7p\2\2\u00a1\u00a2\7f\2\2\u00a2\64\3\2\2\2\u00a3\u00a4\7t\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8\7t\2\2"+
		"\u00a8\u00a9\7p\2\2\u00a9\66\3\2\2\2\u00aa\u00ab\7h\2\2\u00ab\u00ac\7"+
		"c\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7g\2\2\u00af8"+
		"\3\2\2\2\u00b0\u00b1\7/\2\2\u00b1\u00b2\7/\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00b5\n\4\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\b\35\2\2\u00b9"+
		":\3\2\2\2\u00ba\u00bb\7a\2\2\u00bb<\3\2\2\2\u00bc\u00bd\7\60\2\2\u00bd"+
		">\3\2\2\2\u00be\u00bf\7=\2\2\u00bf@\3\2\2\2\u00c0\u00c4\t\5\2\2\u00c1"+
		"\u00c3\n\5\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00d1\t\5\2\2\u00c8\u00cc\7$\2\2\u00c9\u00cb\n\6\2\2\u00ca\u00c9\3\2"+
		"\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d1\7$\2\2\u00d0\u00c0\3\2"+
		"\2\2\u00d0\u00c8\3\2\2\2\u00d1B\3\2\2\2\u00d2\u00d5\5\t\5\2\u00d3\u00d5"+
		"\5;\36\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00dd\3\2\2\2\u00d6"+
		"\u00da\5\t\5\2\u00d7\u00da\5\13\6\2\u00d8\u00da\5;\36\2\u00d9\u00d6\3"+
		"\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d9\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00deD\3\2\2\2\u00df\u00e1\5\13\6\2\u00e0\u00df"+
		"\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\5=\37\2\u00e6\u00e5\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00ea\5\13\6\2\u00e9"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ecF\3\2\2\2\20\2N\u0099\u00b6\u00c4\u00cc\u00d0\u00d4\u00d9\u00db"+
		"\u00dd\u00e2\u00e6\u00eb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}