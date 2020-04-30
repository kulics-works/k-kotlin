// Generated from /Users/kulics/Documents/kulics-works/k-kotlin/src/main/java/com/kulics/k/antlr/KLexer.g4 by ANTLR 4.8
package com.kulics.k.antlr.generate;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Add_Equal=1, Sub_Equal=2, Mul_Equal=3, Div_Equal=4, Mod_Equal=5, Pow_Equal=6, 
		Colon_Equal=7, Equal_Equal=8, Less_Equal=9, Greater_Equal=10, Not_Equal=11, 
		Combine_Equal=12, Forward_Back_Slash=13, Back_Forward_Slash=14, Dot_Dot_Dot=15, 
		Dot_Dot_Less=16, Dot_Dot_Greater=17, Dot_Dot=18, Dot=19, Comma_Comma_Comma=20, 
		Comma_Comma=21, Comma=22, Right_Flow=23, Left_Flow=24, Right_Arrow=25, 
		Left_Arrow=26, Right_Wave=27, Left_Wave=28, Equal=29, Less_Less=30, Greater_Greater=31, 
		And_And=32, Or_Or=33, Caret_Caret=34, Tilde_Tilde=35, Less=36, Greater=37, 
		Semi=38, Left_Paren=39, Right_Paren=40, Left_Brace=41, Right_Brace=42, 
		Left_Brack=43, Right_Brack=44, Colon=45, Question=46, At=47, Bang=48, 
		Coin=49, Tilde=50, Add=51, Sub=52, Mul=53, Div=54, Mod=55, And=56, Or=57, 
		Caret=58, Grave=59, Sharp=60, TypeI8=61, TypeU8=62, TypeI16=63, TypeU16=64, 
		TypeI32=65, TypeU32=66, TypeI64=67, TypeU64=68, TypeF32=69, TypeF64=70, 
		TypeChr=71, TypeStr=72, TypeBool=73, TypeInt=74, TypeNum=75, TypeByte=76, 
		TypeAny=77, NilLiteral=78, TrueLiteral=79, FalseLiteral=80, UndefinedLiteral=81, 
		FloatLiteral=82, DecimalLiteral=83, BinaryLiteral=84, OctalLiteral=85, 
		HexLiteral=86, Quote_Quote_Quote_Open=87, Quote_Open=88, CharLiteral=89, 
		IDPrivate=90, IDPublic=91, Discard=92, Comment_Tag=93, Comment_Block=94, 
		Comment_Line=95, New_Line=96, WS=97, Quote_Close=98, String_Template_Open=99, 
		TextLiteral=100, Quote_Quote_Quote_Close=101, Raw_Quote=102, Raw_String_Template_Open=103, 
		RawTextLiteral=104;
	public static final int
		ModeString=1, ModeRawString=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "ModeString", "ModeRawString"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Add_Equal", "Sub_Equal", "Mul_Equal", "Div_Equal", "Mod_Equal", "Pow_Equal", 
			"Colon_Equal", "Equal_Equal", "Less_Equal", "Greater_Equal", "Not_Equal", 
			"Combine_Equal", "Forward_Back_Slash", "Back_Forward_Slash", "Dot_Dot_Dot", 
			"Dot_Dot_Less", "Dot_Dot_Greater", "Dot_Dot", "Dot", "Comma_Comma_Comma", 
			"Comma_Comma", "Comma", "Right_Flow", "Left_Flow", "Right_Arrow", "Left_Arrow", 
			"Right_Wave", "Left_Wave", "Equal", "Less_Less", "Greater_Greater", "And_And", 
			"Or_Or", "Caret_Caret", "Tilde_Tilde", "Less", "Greater", "Semi", "Left_Paren", 
			"Right_Paren", "Left_Brace", "Right_Brace", "Left_Brack", "Right_Brack", 
			"Colon", "Question", "At", "Bang", "Coin", "Tilde", "Add", "Sub", "Mul", 
			"Div", "Mod", "And", "Or", "Caret", "Grave", "Sharp", "TypeI8", "TypeU8", 
			"TypeI16", "TypeU16", "TypeI32", "TypeU32", "TypeI64", "TypeU64", "TypeF32", 
			"TypeF64", "TypeChr", "TypeStr", "TypeBool", "TypeInt", "TypeNum", "TypeByte", 
			"TypeAny", "NilLiteral", "TrueLiteral", "FalseLiteral", "UndefinedLiteral", 
			"FloatLiteral", "DecimalLiteral", "BinaryLiteral", "OctalLiteral", "HexLiteral", 
			"Digit", "Exponent", "Quote_Quote_Quote_Open", "Quote_Open", "CharLiteral", 
			"IDPrivate", "IDPublic", "Discard", "Comment_Tag", "Comment_Block", "Comment_Line", 
			"New_Line", "WS", "IdentifierPartCharacter", "LetterCharacter", "DecimalDigitCharacter", 
			"ConnectingCharacter", "CombiningCharacter", "FormattingCharacter", "UnicodeEscapeSequence", 
			"HexDigit", "UnicodeClassLU", "UnicodeClassLL", "UnicodeClassLT", "UnicodeClassLM", 
			"UnicodeClassLO", "UnicodeClassNL", "UnicodeClassMN", "UnicodeClassMC", 
			"UnicodeClassCF", "UnicodeClassPC", "UnicodeClassND", "Quote_Close", 
			"String_Template_Open", "TextLiteral", "Quote_Quote_Quote_Close", "Raw_Quote", 
			"Raw_String_Template_Open", "RawTextLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "':='", "'=='", 
			"'<='", "'>='", "'><'", "'<>'", "'/\\'", "'\\/'", "'...'", "'..<'", "'..>'", 
			"'..'", "'.'", "',,,'", "',,'", "','", "'->>'", "'<<-'", "'->'", "'<-'", 
			"'~>'", "'<~'", "'='", "'<<'", "'>>'", "'&&'", "'||'", "'^^'", "'~~'", 
			"'<'", "'>'", "';'", "'('", "')'", "'{'", "'}'", "'['", "']'", "':'", 
			"'?'", "'@'", "'!'", "'$'", "'~'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'&'", "'|'", "'^'", "'`'", "'#'", "'i8'", "'u8'", "'i16'", "'u16'", 
			"'i32'", "'u32'", "'i64'", "'u64'", "'f32'", "'f64'", "'chr'", "'str'", 
			"'bool'", "'int'", "'num'", "'byte'", "'any'", "'nil'", "'true'", "'false'", 
			"'undef'", null, null, null, null, null, null, null, null, null, null, 
			"'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Add_Equal", "Sub_Equal", "Mul_Equal", "Div_Equal", "Mod_Equal", 
			"Pow_Equal", "Colon_Equal", "Equal_Equal", "Less_Equal", "Greater_Equal", 
			"Not_Equal", "Combine_Equal", "Forward_Back_Slash", "Back_Forward_Slash", 
			"Dot_Dot_Dot", "Dot_Dot_Less", "Dot_Dot_Greater", "Dot_Dot", "Dot", "Comma_Comma_Comma", 
			"Comma_Comma", "Comma", "Right_Flow", "Left_Flow", "Right_Arrow", "Left_Arrow", 
			"Right_Wave", "Left_Wave", "Equal", "Less_Less", "Greater_Greater", "And_And", 
			"Or_Or", "Caret_Caret", "Tilde_Tilde", "Less", "Greater", "Semi", "Left_Paren", 
			"Right_Paren", "Left_Brace", "Right_Brace", "Left_Brack", "Right_Brack", 
			"Colon", "Question", "At", "Bang", "Coin", "Tilde", "Add", "Sub", "Mul", 
			"Div", "Mod", "And", "Or", "Caret", "Grave", "Sharp", "TypeI8", "TypeU8", 
			"TypeI16", "TypeU16", "TypeI32", "TypeU32", "TypeI64", "TypeU64", "TypeF32", 
			"TypeF64", "TypeChr", "TypeStr", "TypeBool", "TypeInt", "TypeNum", "TypeByte", 
			"TypeAny", "NilLiteral", "TrueLiteral", "FalseLiteral", "UndefinedLiteral", 
			"FloatLiteral", "DecimalLiteral", "BinaryLiteral", "OctalLiteral", "HexLiteral", 
			"Quote_Quote_Quote_Open", "Quote_Open", "CharLiteral", "IDPrivate", "IDPublic", 
			"Discard", "Comment_Tag", "Comment_Block", "Comment_Line", "New_Line", 
			"WS", "Quote_Close", "String_Template_Open", "TextLiteral", "Quote_Quote_Quote_Close", 
			"Raw_Quote", "Raw_String_Template_Open", "RawTextLiteral"
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


	public KLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2j\u0305\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4"+
		"H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\t"+
		"S\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^"+
		"\4_\t_\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j"+
		"\tj\4k\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu"+
		"\4v\tv\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3("+
		"\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\3"+
		"8\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3@\3A\3A\3"+
		"A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\3E\3F\3F\3F\3F\3G\3"+
		"G\3G\3G\3H\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3L\3L\3L\3"+
		"L\3M\3M\3M\3M\3M\3N\3N\3N\3N\3O\3O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3"+
		"Q\3Q\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\5S\u0200\nS\5S\u0202\nS\3T\3T\3"+
		"U\3U\3U\7U\u0209\nU\fU\16U\u020c\13U\3U\3U\3V\3V\3V\7V\u0213\nV\fV\16"+
		"V\u0216\13V\3V\3V\3W\3W\3W\7W\u021d\nW\fW\16W\u0220\13W\3W\3W\3X\3X\3"+
		"X\7X\u0227\nX\fX\16X\u022a\13X\3X\5X\u022d\nX\3Y\3Y\5Y\u0231\nY\3Y\6Y"+
		"\u0234\nY\rY\16Y\u0235\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\7\\\u0248\n\\\f\\\16\\\u024b\13\\\3\\\3\\\3]\3]\6]\u0251\n]\r]"+
		"\16]\u0252\3^\3^\7^\u0257\n^\f^\16^\u025a\13^\3_\3_\3`\3`\3`\3`\7`\u0262"+
		"\n`\f`\16`\u0265\13`\3a\3a\3a\3a\7a\u026b\na\fa\16a\u026e\13a\3a\3a\3"+
		"a\3a\3a\3b\3b\3b\3b\7b\u0279\nb\fb\16b\u027c\13b\3b\3b\3c\5c\u0281\nc"+
		"\3c\3c\3d\6d\u0286\nd\rd\16d\u0287\3d\3d\3e\3e\3e\3e\3e\5e\u0291\ne\3"+
		"f\3f\3f\3f\3f\3f\3f\5f\u029a\nf\3g\3g\5g\u029e\ng\3h\3h\5h\u02a2\nh\3"+
		"i\3i\3i\5i\u02a7\ni\3j\3j\5j\u02ab\nj\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3"+
		"k\3k\3k\3k\3k\3k\3k\3k\3k\3k\5k\u02c1\nk\3l\5l\u02c4\nl\3m\3m\3n\3n\3"+
		"o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3x\3x\3x\3y\3"+
		"y\3y\3y\3y\3z\3z\3z\6z\u02e8\nz\rz\16z\u02e9\3z\5z\u02ed\nz\3{\3{\3{\3"+
		"{\3{\3{\3|\3|\3}\3}\3}\3}\3}\3~\3~\3~\6~\u02ff\n~\r~\16~\u0300\3~\5~\u0304"+
		"\n~\4\u0249\u026c\2\177\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f"+
		"\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65"+
		"\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63"+
		"g\64i\65k\66m\67o8q9s:u;w<y={>}?\177@\u0081A\u0083B\u0085C\u0087D\u0089"+
		"E\u008bF\u008dG\u008fH\u0091I\u0093J\u0095K\u0097L\u0099M\u009bN\u009d"+
		"O\u009fP\u00a1Q\u00a3R\u00a5S\u00a7T\u00a9U\u00abV\u00adW\u00afX\u00b1"+
		"\2\u00b3\2\u00b5Y\u00b7Z\u00b9[\u00bb\\\u00bd]\u00bf^\u00c1_\u00c3`\u00c5"+
		"a\u00c7b\u00c9c\u00cb\2\u00cd\2\u00cf\2\u00d1\2\u00d3\2\u00d5\2\u00d7"+
		"\2\u00d9\2\u00db\2\u00dd\2\u00df\2\u00e1\2\u00e3\2\u00e5\2\u00e7\2\u00e9"+
		"\2\u00eb\2\u00ed\2\u00ef\2\u00f1d\u00f3e\u00f5f\u00f7g\u00f9h\u00fbi\u00fd"+
		"j\5\2\3\4\37\4\2DDdd\4\2\62\63aa\3\2\62\63\4\2QQqq\4\2\629aa\3\2\629\4"+
		"\2ZZzz\6\2\62;CHaach\5\2\62;CHch\3\2\62;\4\2\62;aa\4\2GGgg\4\2--//\b\2"+
		"^^ddhhppttvv\4\2\f\f\17\17\4\2\13\13\"\"T\2C\\\u00c2\u00d8\u00da\u00e0"+
		"\u0102\u0138\u013b\u0149\u014c\u017f\u0183\u0184\u0186\u018d\u0190\u0193"+
		"\u0195\u0196\u0198\u019a\u019e\u019f\u01a1\u01a2\u01a4\u01ab\u01ae\u01b5"+
		"\u01b7\u01be\u01c6\u01cf\u01d1\u01dd\u01e0\u01f0\u01f3\u01f6\u01f8\u01fa"+
		"\u01fc\u0234\u023c\u023d\u023f\u0240\u0243\u0248\u024a\u0250\u0372\u0374"+
		"\u0378\u0381\u0388\u038c\u038e\u03a3\u03a5\u03ad\u03d1\u03d6\u03da\u03f0"+
		"\u03f6\u03f9\u03fb\u03fc\u03ff\u0431\u0462\u0482\u048c\u04cf\u04d2\u0530"+
		"\u0533\u0558\u10a2\u10c7\u10c9\u10cf\u1e02\u1e96\u1ea0\u1f00\u1f0a\u1f11"+
		"\u1f1a\u1f1f\u1f2a\u1f31\u1f3a\u1f41\u1f4a\u1f4f\u1f5b\u1f61\u1f6a\u1f71"+
		"\u1fba\u1fbd\u1fca\u1fcd\u1fda\u1fdd\u1fea\u1fee\u1ffa\u1ffd\u2104\u2109"+
		"\u210d\u210f\u2112\u2114\u2117\u211f\u2126\u212f\u2132\u2135\u2140\u2141"+
		"\u2147\u2185\u2c02\u2c30\u2c62\u2c66\u2c69\u2c72\u2c74\u2c77\u2c80\u2c82"+
		"\u2c84\u2ce4\u2ced\u2cef\u2cf4\ua642\ua644\ua66e\ua682\ua69c\ua724\ua730"+
		"\ua734\ua770\ua77b\ua788\ua78d\ua78f\ua792\ua794\ua798\ua7af\ua7b2\ua7b3"+
		"\uff23\uff3cS\2c|\u00b7\u00f8\u00fa\u0101\u0103\u0179\u017c\u0182\u0185"+
		"\u0187\u018a\u0194\u0197\u019d\u01a0\u01a3\u01a5\u01a7\u01aa\u01af\u01b2"+
		"\u01b6\u01b8\u01c1\u01c8\u01ce\u01d0\u01f5\u01f7\u01fb\u01fd\u023b\u023e"+
		"\u0244\u0249\u0295\u0297\u02b1\u0373\u0375\u0379\u037f\u0392\u03d0\u03d2"+
		"\u03d3\u03d7\u03d9\u03db\u03f5\u03f7\u0461\u0463\u0483\u048d\u04c1\u04c4"+
		"\u0531\u0563\u0589\u1d02\u1d2d\u1d6d\u1d79\u1d7b\u1d9c\u1e03\u1e9f\u1ea1"+
		"\u1f09\u1f12\u1f17\u1f22\u1f29\u1f32\u1f39\u1f42\u1f47\u1f52\u1f59\u1f62"+
		"\u1f69\u1f72\u1f7f\u1f82\u1f89\u1f92\u1f99\u1fa2\u1fa9\u1fb2\u1fb6\u1fb8"+
		"\u1fb9\u1fc0\u1fc6\u1fc8\u1fc9\u1fd2\u1fd5\u1fd8\u1fd9\u1fe2\u1fe9\u1ff4"+
		"\u1ff6\u1ff8\u1ff9\u210c\u2115\u2131\u213b\u213e\u213f\u2148\u214b\u2150"+
		"\u2186\u2c32\u2c60\u2c63\u2c6e\u2c73\u2c7d\u2c83\u2cee\u2cf0\u2cf5\u2d02"+
		"\u2d27\u2d29\u2d2f\ua643\ua66f\ua683\ua69d\ua725\ua733\ua735\ua77a\ua77c"+
		"\ua77e\ua781\ua789\ua78e\ua790\ua793\ua797\ua799\ua7ab\ua7fc\uab5c\uab66"+
		"\uab67\ufb02\ufb08\ufb15\ufb19\uff43\uff5c\b\2\u01c7\u01cd\u01f4\u1f91"+
		"\u1f9a\u1fa1\u1faa\u1fb1\u1fbe\u1fce\u1ffe\u1ffe#\2\u02b2\u02c3\u02c8"+
		"\u02d3\u02e2\u02e6\u02ee\u02f0\u0376\u037c\u055b\u0642\u06e7\u06e8\u07f6"+
		"\u07f7\u07fc\u081c\u0826\u082a\u0973\u0e48\u0ec8\u10fe\u17d9\u1845\u1aa9"+
		"\u1c7f\u1d2e\u1d6c\u1d7a\u1dc1\u2073\u2081\u2092\u209e\u2c7e\u2c7f\u2d71"+
		"\u2e31\u3007\u3037\u303d\u3100\ua017\ua4ff\ua60e\ua681\ua69e\ua69f\ua719"+
		"\ua721\ua772\ua78a\ua7fa\ua7fb\ua9d1\ua9e8\uaa72\uaadf\uaaf5\uaaf6\uab5e"+
		"\uab61\uff72\uffa1\u00ec\2\u00ac\u00bc\u01bd\u01c5\u0296\u05ec\u05f2\u05f4"+
		"\u0622\u0641\u0643\u064c\u0670\u0671\u0673\u06d5\u06d7\u06fe\u0701\u0712"+
		"\u0714\u0731\u074f\u07a7\u07b3\u07ec\u0802\u0817\u0842\u085a\u08a2\u08b4"+
		"\u0906\u093b\u093f\u0952\u095a\u0963\u0974\u0982\u0987\u098e\u0991\u0992"+
		"\u0995\u09aa\u09ac\u09b2\u09b4\u09bb\u09bf\u09d0\u09de\u09df\u09e1\u09e3"+
		"\u09f2\u09f3\u0a07\u0a0c\u0a11\u0a12\u0a15\u0a2a\u0a2c\u0a32\u0a34\u0a35"+
		"\u0a37\u0a38\u0a3a\u0a3b\u0a5b\u0a5e\u0a60\u0a76\u0a87\u0a8f\u0a91\u0a93"+
		"\u0a95\u0aaa\u0aac\u0ab2\u0ab4\u0ab5\u0ab7\u0abb\u0abf\u0ad2\u0ae2\u0ae3"+
		"\u0b07\u0b0e\u0b11\u0b12\u0b15\u0b2a\u0b2c\u0b32\u0b34\u0b35\u0b37\u0b3b"+
		"\u0b3f\u0b63\u0b73\u0b85\u0b87\u0b8c\u0b90\u0b92\u0b94\u0b97\u0b9b\u0b9c"+
		"\u0b9e\u0bac\u0bb0\u0bbb\u0bd2\u0c0e\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c3b"+
		"\u0c3f\u0c8e\u0c90\u0c92\u0c94\u0caa\u0cac\u0cb5\u0cb7\u0cbb\u0cbf\u0ce0"+
		"\u0ce2\u0ce3\u0cf3\u0cf4\u0d07\u0d0e\u0d10\u0d12\u0d14\u0d3c\u0d3f\u0d50"+
		"\u0d62\u0d63\u0d7c\u0d81\u0d87\u0d98\u0d9c\u0db3\u0db5\u0dbd\u0dbf\u0dc8"+
		"\u0e03\u0e32\u0e34\u0e35\u0e42\u0e47\u0e83\u0e84\u0e86\u0e8c\u0e8f\u0e99"+
		"\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7\u0ea9\u0eac\u0ead\u0eaf\u0eb2\u0eb4\u0eb5"+
		"\u0ebf\u0ec6\u0ede\u0ee1\u0f02\u0f49\u0f4b\u0f6e\u0f8a\u0f8e\u1002\u102c"+
		"\u1041\u1057\u105c\u105f\u1063\u1072\u1077\u1083\u1090\u10fc\u10ff\u124a"+
		"\u124c\u124f\u1252\u1258\u125a\u125f\u1262\u128a\u128c\u128f\u1292\u12b2"+
		"\u12b4\u12b7\u12ba\u12c0\u12c2\u12c7\u12ca\u12d8\u12da\u1312\u1314\u1317"+
		"\u131a\u135c\u1382\u1391\u13a2\u13f6\u1403\u166e\u1671\u1681\u1683\u169c"+
		"\u16a2\u16ec\u16f3\u16fa\u1702\u170e\u1710\u1713\u1722\u1733\u1742\u1753"+
		"\u1762\u176e\u1770\u1772\u1782\u17b5\u17de\u1844\u1846\u1879\u1882\u18aa"+
		"\u18ac\u18f7\u1902\u1920\u1952\u196f\u1972\u1976\u1982\u19ad\u19c3\u19c9"+
		"\u1a02\u1a18\u1a22\u1a56\u1b07\u1b35\u1b47\u1b4d\u1b85\u1ba2\u1bb0\u1bb1"+
		"\u1bbc\u1be7\u1c02\u1c25\u1c4f\u1c51\u1c5c\u1c79\u1ceb\u1cee\u1cf0\u1cf3"+
		"\u1cf7\u1cf8\u2137\u213a\u2d32\u2d69\u2d82\u2d98\u2da2\u2da8\u2daa\u2db0"+
		"\u2db2\u2db8\u2dba\u2dc0\u2dc2\u2dc8\u2dca\u2dd0\u2dd2\u2dd8\u2dda\u2de0"+
		"\u3008\u303e\u3043\u3098\u30a1\u30fc\u3101\u312f\u3133\u3190\u31a2\u31bc"+
		"\u31f2\u3201\u3402\u4db7\u4e02\u9fce\ua002\ua016\ua018\ua48e\ua4d2\ua4f9"+
		"\ua502\ua60d\ua612\ua621\ua62c\ua62d\ua670\ua6e7\ua7f9\ua803\ua805\ua807"+
		"\ua809\ua80c\ua80e\ua824\ua842\ua875\ua884\ua8b5\ua8f4\ua8f9\ua8fd\ua927"+
		"\ua932\ua948\ua962\ua97e\ua986\ua9b4\ua9e2\ua9e6\ua9e9\ua9f1\ua9fc\uaa00"+
		"\uaa02\uaa2a\uaa42\uaa44\uaa46\uaa4d\uaa62\uaa71\uaa73\uaa78\uaa7c\uaab1"+
		"\uaab3\uaabf\uaac2\uaac4\uaadd\uaade\uaae2\uaaec\uaaf4\uab08\uab0b\uab10"+
		"\uab13\uab18\uab22\uab28\uab2a\uab30\uabc2\uabe4\uac02\ud7a5\ud7b2\ud7c8"+
		"\ud7cd\ud7fd\uf902\ufa6f\ufa72\ufadb\ufb1f\ufb2a\ufb2c\ufb38\ufb3a\ufb3e"+
		"\ufb40\ufbb3\ufbd5\ufd3f\ufd52\ufd91\ufd94\ufdc9\ufdf2\ufdfd\ufe72\ufe76"+
		"\ufe78\ufefe\uff68\uff71\uff73\uff9f\uffa2\uffc0\uffc4\uffc9\uffcc\uffd1"+
		"\uffd4\uffd9\uffdc\uffde\4\2\u16f0\u16f2\u2162\u2171\5\2\u0905\u0905\u0940"+
		"\u0942\u094b\u094e\5\2\u00af\u00af\u0602\u0605\u06df\u06df\b\2aa\u2041"+
		"\u2042\u2056\u2056\ufe35\ufe36\ufe4f\ufe51\uff41\uff41\'\2\62;\u0662\u066b"+
		"\u06f2\u06fb\u07c2\u07cb\u0968\u0971\u09e8\u09f1\u0a68\u0a71\u0ae8\u0af1"+
		"\u0b68\u0b71\u0be8\u0bf1\u0c68\u0c71\u0ce8\u0cf1\u0d68\u0d71\u0de8\u0df1"+
		"\u0e52\u0e5b\u0ed2\u0edb\u0f22\u0f2b\u1042\u104b\u1092\u109b\u17e2\u17eb"+
		"\u1812\u181b\u1948\u1951\u19d2\u19db\u1a82\u1a8b\u1a92\u1a9b\u1b52\u1b5b"+
		"\u1bb2\u1bbb\u1c42\u1c4b\u1c52\u1c5b\ua622\ua62b\ua8d2\ua8db\ua902\ua90b"+
		"\ua9d2\ua9db\ua9f2\ua9fb\uaa52\uaa5b\uabf2\uabfb\uff12\uff1b\n\2$$&&^"+
		"^ddhhppttvv\5\2$$&&^^\4\2$$&&\2\u0316\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2"+
		"\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5"+
		"\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2"+
		"\2\2\u00af\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2"+
		"\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\3\u00f1\3\2\2\2\3\u00f3"+
		"\3\2\2\2\3\u00f5\3\2\2\2\4\u00f7\3\2\2\2\4\u00f9\3\2\2\2\4\u00fb\3\2\2"+
		"\2\4\u00fd\3\2\2\2\5\u00ff\3\2\2\2\7\u0102\3\2\2\2\t\u0105\3\2\2\2\13"+
		"\u0108\3\2\2\2\r\u010b\3\2\2\2\17\u010e\3\2\2\2\21\u0111\3\2\2\2\23\u0114"+
		"\3\2\2\2\25\u0117\3\2\2\2\27\u011a\3\2\2\2\31\u011d\3\2\2\2\33\u0120\3"+
		"\2\2\2\35\u0123\3\2\2\2\37\u0126\3\2\2\2!\u0129\3\2\2\2#\u012d\3\2\2\2"+
		"%\u0131\3\2\2\2\'\u0135\3\2\2\2)\u0138\3\2\2\2+\u013a\3\2\2\2-\u013e\3"+
		"\2\2\2/\u0141\3\2\2\2\61\u0143\3\2\2\2\63\u0147\3\2\2\2\65\u014b\3\2\2"+
		"\2\67\u014e\3\2\2\29\u0151\3\2\2\2;\u0154\3\2\2\2=\u0157\3\2\2\2?\u0159"+
		"\3\2\2\2A\u015c\3\2\2\2C\u015f\3\2\2\2E\u0162\3\2\2\2G\u0165\3\2\2\2I"+
		"\u0168\3\2\2\2K\u016b\3\2\2\2M\u016d\3\2\2\2O\u016f\3\2\2\2Q\u0171\3\2"+
		"\2\2S\u0173\3\2\2\2U\u0175\3\2\2\2W\u0179\3\2\2\2Y\u017d\3\2\2\2[\u017f"+
		"\3\2\2\2]\u0181\3\2\2\2_\u0183\3\2\2\2a\u0185\3\2\2\2c\u0187\3\2\2\2e"+
		"\u0189\3\2\2\2g\u018b\3\2\2\2i\u018d\3\2\2\2k\u018f\3\2\2\2m\u0191\3\2"+
		"\2\2o\u0193\3\2\2\2q\u0195\3\2\2\2s\u0197\3\2\2\2u\u0199\3\2\2\2w\u019b"+
		"\3\2\2\2y\u019d\3\2\2\2{\u019f\3\2\2\2}\u01a1\3\2\2\2\177\u01a4\3\2\2"+
		"\2\u0081\u01a7\3\2\2\2\u0083\u01ab\3\2\2\2\u0085\u01af\3\2\2\2\u0087\u01b3"+
		"\3\2\2\2\u0089\u01b7\3\2\2\2\u008b\u01bb\3\2\2\2\u008d\u01bf\3\2\2\2\u008f"+
		"\u01c3\3\2\2\2\u0091\u01c7\3\2\2\2\u0093\u01cb\3\2\2\2\u0095\u01cf\3\2"+
		"\2\2\u0097\u01d4\3\2\2\2\u0099\u01d8\3\2\2\2\u009b\u01dc\3\2\2\2\u009d"+
		"\u01e1\3\2\2\2\u009f\u01e5\3\2\2\2\u00a1\u01e9\3\2\2\2\u00a3\u01ee\3\2"+
		"\2\2\u00a5\u01f4\3\2\2\2\u00a7\u01fa\3\2\2\2\u00a9\u0203\3\2\2\2\u00ab"+
		"\u0205\3\2\2\2\u00ad\u020f\3\2\2\2\u00af\u0219\3\2\2\2\u00b1\u022c\3\2"+
		"\2\2\u00b3\u022e\3\2\2\2\u00b5\u0237\3\2\2\2\u00b7\u023d\3\2\2\2\u00b9"+
		"\u0241\3\2\2\2\u00bb\u024e\3\2\2\2\u00bd\u0254\3\2\2\2\u00bf\u025b\3\2"+
		"\2\2\u00c1\u025d\3\2\2\2\u00c3\u0266\3\2\2\2\u00c5\u0274\3\2\2\2\u00c7"+
		"\u0280\3\2\2\2\u00c9\u0285\3\2\2\2\u00cb\u0290\3\2\2\2\u00cd\u0299\3\2"+
		"\2\2\u00cf\u029d\3\2\2\2\u00d1\u02a1\3\2\2\2\u00d3\u02a6\3\2\2\2\u00d5"+
		"\u02aa\3\2\2\2\u00d7\u02c0\3\2\2\2\u00d9\u02c3\3\2\2\2\u00db\u02c5\3\2"+
		"\2\2\u00dd\u02c7\3\2\2\2\u00df\u02c9\3\2\2\2\u00e1\u02cb\3\2\2\2\u00e3"+
		"\u02cd\3\2\2\2\u00e5\u02cf\3\2\2\2\u00e7\u02d1\3\2\2\2\u00e9\u02d3\3\2"+
		"\2\2\u00eb\u02d5\3\2\2\2\u00ed\u02d7\3\2\2\2\u00ef\u02d9\3\2\2\2\u00f1"+
		"\u02db\3\2\2\2\u00f3\u02df\3\2\2\2\u00f5\u02ec\3\2\2\2\u00f7\u02ee\3\2"+
		"\2\2\u00f9\u02f4\3\2\2\2\u00fb\u02f6\3\2\2\2\u00fd\u0303\3\2\2\2\u00ff"+
		"\u0100\7-\2\2\u0100\u0101\7?\2\2\u0101\6\3\2\2\2\u0102\u0103\7/\2\2\u0103"+
		"\u0104\7?\2\2\u0104\b\3\2\2\2\u0105\u0106\7,\2\2\u0106\u0107\7?\2\2\u0107"+
		"\n\3\2\2\2\u0108\u0109\7\61\2\2\u0109\u010a\7?\2\2\u010a\f\3\2\2\2\u010b"+
		"\u010c\7\'\2\2\u010c\u010d\7?\2\2\u010d\16\3\2\2\2\u010e\u010f\7`\2\2"+
		"\u010f\u0110\7?\2\2\u0110\20\3\2\2\2\u0111\u0112\7<\2\2\u0112\u0113\7"+
		"?\2\2\u0113\22\3\2\2\2\u0114\u0115\7?\2\2\u0115\u0116\7?\2\2\u0116\24"+
		"\3\2\2\2\u0117\u0118\7>\2\2\u0118\u0119\7?\2\2\u0119\26\3\2\2\2\u011a"+
		"\u011b\7@\2\2\u011b\u011c\7?\2\2\u011c\30\3\2\2\2\u011d\u011e\7@\2\2\u011e"+
		"\u011f\7>\2\2\u011f\32\3\2\2\2\u0120\u0121\7>\2\2\u0121\u0122\7@\2\2\u0122"+
		"\34\3\2\2\2\u0123\u0124\7\61\2\2\u0124\u0125\7^\2\2\u0125\36\3\2\2\2\u0126"+
		"\u0127\7^\2\2\u0127\u0128\7\61\2\2\u0128 \3\2\2\2\u0129\u012a\7\60\2\2"+
		"\u012a\u012b\7\60\2\2\u012b\u012c\7\60\2\2\u012c\"\3\2\2\2\u012d\u012e"+
		"\7\60\2\2\u012e\u012f\7\60\2\2\u012f\u0130\7>\2\2\u0130$\3\2\2\2\u0131"+
		"\u0132\7\60\2\2\u0132\u0133\7\60\2\2\u0133\u0134\7@\2\2\u0134&\3\2\2\2"+
		"\u0135\u0136\7\60\2\2\u0136\u0137\7\60\2\2\u0137(\3\2\2\2\u0138\u0139"+
		"\7\60\2\2\u0139*\3\2\2\2\u013a\u013b\7.\2\2\u013b\u013c\7.\2\2\u013c\u013d"+
		"\7.\2\2\u013d,\3\2\2\2\u013e\u013f\7.\2\2\u013f\u0140\7.\2\2\u0140.\3"+
		"\2\2\2\u0141\u0142\7.\2\2\u0142\60\3\2\2\2\u0143\u0144\7/\2\2\u0144\u0145"+
		"\7@\2\2\u0145\u0146\7@\2\2\u0146\62\3\2\2\2\u0147\u0148\7>\2\2\u0148\u0149"+
		"\7>\2\2\u0149\u014a\7/\2\2\u014a\64\3\2\2\2\u014b\u014c\7/\2\2\u014c\u014d"+
		"\7@\2\2\u014d\66\3\2\2\2\u014e\u014f\7>\2\2\u014f\u0150\7/\2\2\u01508"+
		"\3\2\2\2\u0151\u0152\7\u0080\2\2\u0152\u0153\7@\2\2\u0153:\3\2\2\2\u0154"+
		"\u0155\7>\2\2\u0155\u0156\7\u0080\2\2\u0156<\3\2\2\2\u0157\u0158\7?\2"+
		"\2\u0158>\3\2\2\2\u0159\u015a\7>\2\2\u015a\u015b\7>\2\2\u015b@\3\2\2\2"+
		"\u015c\u015d\7@\2\2\u015d\u015e\7@\2\2\u015eB\3\2\2\2\u015f\u0160\7(\2"+
		"\2\u0160\u0161\7(\2\2\u0161D\3\2\2\2\u0162\u0163\7~\2\2\u0163\u0164\7"+
		"~\2\2\u0164F\3\2\2\2\u0165\u0166\7`\2\2\u0166\u0167\7`\2\2\u0167H\3\2"+
		"\2\2\u0168\u0169\7\u0080\2\2\u0169\u016a\7\u0080\2\2\u016aJ\3\2\2\2\u016b"+
		"\u016c\7>\2\2\u016cL\3\2\2\2\u016d\u016e\7@\2\2\u016eN\3\2\2\2\u016f\u0170"+
		"\7=\2\2\u0170P\3\2\2\2\u0171\u0172\7*\2\2\u0172R\3\2\2\2\u0173\u0174\7"+
		"+\2\2\u0174T\3\2\2\2\u0175\u0176\7}\2\2\u0176\u0177\3\2\2\2\u0177\u0178"+
		"\b*\2\2\u0178V\3\2\2\2\u0179\u017a\7\177\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017c\b+\3\2\u017cX\3\2\2\2\u017d\u017e\7]\2\2\u017eZ\3\2\2\2\u017f\u0180"+
		"\7_\2\2\u0180\\\3\2\2\2\u0181\u0182\7<\2\2\u0182^\3\2\2\2\u0183\u0184"+
		"\7A\2\2\u0184`\3\2\2\2\u0185\u0186\7B\2\2\u0186b\3\2\2\2\u0187\u0188\7"+
		"#\2\2\u0188d\3\2\2\2\u0189\u018a\7&\2\2\u018af\3\2\2\2\u018b\u018c\7\u0080"+
		"\2\2\u018ch\3\2\2\2\u018d\u018e\7-\2\2\u018ej\3\2\2\2\u018f\u0190\7/\2"+
		"\2\u0190l\3\2\2\2\u0191\u0192\7,\2\2\u0192n\3\2\2\2\u0193\u0194\7\61\2"+
		"\2\u0194p\3\2\2\2\u0195\u0196\7\'\2\2\u0196r\3\2\2\2\u0197\u0198\7(\2"+
		"\2\u0198t\3\2\2\2\u0199\u019a\7~\2\2\u019av\3\2\2\2\u019b\u019c\7`\2\2"+
		"\u019cx\3\2\2\2\u019d\u019e\7b\2\2\u019ez\3\2\2\2\u019f\u01a0\7%\2\2\u01a0"+
		"|\3\2\2\2\u01a1\u01a2\7k\2\2\u01a2\u01a3\7:\2\2\u01a3~\3\2\2\2\u01a4\u01a5"+
		"\7w\2\2\u01a5\u01a6\7:\2\2\u01a6\u0080\3\2\2\2\u01a7\u01a8\7k\2\2\u01a8"+
		"\u01a9\7\63\2\2\u01a9\u01aa\78\2\2\u01aa\u0082\3\2\2\2\u01ab\u01ac\7w"+
		"\2\2\u01ac\u01ad\7\63\2\2\u01ad\u01ae\78\2\2\u01ae\u0084\3\2\2\2\u01af"+
		"\u01b0\7k\2\2\u01b0\u01b1\7\65\2\2\u01b1\u01b2\7\64\2\2\u01b2\u0086\3"+
		"\2\2\2\u01b3\u01b4\7w\2\2\u01b4\u01b5\7\65\2\2\u01b5\u01b6\7\64\2\2\u01b6"+
		"\u0088\3\2\2\2\u01b7\u01b8\7k\2\2\u01b8\u01b9\78\2\2\u01b9\u01ba\7\66"+
		"\2\2\u01ba\u008a\3\2\2\2\u01bb\u01bc\7w\2\2\u01bc\u01bd\78\2\2\u01bd\u01be"+
		"\7\66\2\2\u01be\u008c\3\2\2\2\u01bf\u01c0\7h\2\2\u01c0\u01c1\7\65\2\2"+
		"\u01c1\u01c2\7\64\2\2\u01c2\u008e\3\2\2\2\u01c3\u01c4\7h\2\2\u01c4\u01c5"+
		"\78\2\2\u01c5\u01c6\7\66\2\2\u01c6\u0090\3\2\2\2\u01c7\u01c8\7e\2\2\u01c8"+
		"\u01c9\7j\2\2\u01c9\u01ca\7t\2\2\u01ca\u0092\3\2\2\2\u01cb\u01cc\7u\2"+
		"\2\u01cc\u01cd\7v\2\2\u01cd\u01ce\7t\2\2\u01ce\u0094\3\2\2\2\u01cf\u01d0"+
		"\7d\2\2\u01d0\u01d1\7q\2\2\u01d1\u01d2\7q\2\2\u01d2\u01d3\7n\2\2\u01d3"+
		"\u0096\3\2\2\2\u01d4\u01d5\7k\2\2\u01d5\u01d6\7p\2\2\u01d6\u01d7\7v\2"+
		"\2\u01d7\u0098\3\2\2\2\u01d8\u01d9\7p\2\2\u01d9\u01da\7w\2\2\u01da\u01db"+
		"\7o\2\2\u01db\u009a\3\2\2\2\u01dc\u01dd\7d\2\2\u01dd\u01de\7{\2\2\u01de"+
		"\u01df\7v\2\2\u01df\u01e0\7g\2\2\u01e0\u009c\3\2\2\2\u01e1\u01e2\7c\2"+
		"\2\u01e2\u01e3\7p\2\2\u01e3\u01e4\7{\2\2\u01e4\u009e\3\2\2\2\u01e5\u01e6"+
		"\7p\2\2\u01e6\u01e7\7k\2\2\u01e7\u01e8\7n\2\2\u01e8\u00a0\3\2\2\2\u01e9"+
		"\u01ea\7v\2\2\u01ea\u01eb\7t\2\2\u01eb\u01ec\7w\2\2\u01ec\u01ed\7g\2\2"+
		"\u01ed\u00a2\3\2\2\2\u01ee\u01ef\7h\2\2\u01ef\u01f0\7c\2\2\u01f0\u01f1"+
		"\7n\2\2\u01f1\u01f2\7u\2\2\u01f2\u01f3\7g\2\2\u01f3\u00a4\3\2\2\2\u01f4"+
		"\u01f5\7w\2\2\u01f5\u01f6\7p\2\2\u01f6\u01f7\7f\2\2\u01f7\u01f8\7g\2\2"+
		"\u01f8\u01f9\7h\2\2\u01f9\u00a6\3\2\2\2\u01fa\u0201\5\u00b1X\2\u01fb\u0202"+
		"\5\u00b3Y\2\u01fc\u01fd\7\60\2\2\u01fd\u01ff\5\u00b1X\2\u01fe\u0200\5"+
		"\u00b3Y\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2\2\2"+
		"\u0201\u01fb\3\2\2\2\u0201\u01fc\3\2\2\2\u0202\u00a8\3\2\2\2\u0203\u0204"+
		"\5\u00b1X\2\u0204\u00aa\3\2\2\2\u0205\u0206\7\62\2\2\u0206\u020a\t\2\2"+
		"\2\u0207\u0209\t\3\2\2\u0208\u0207\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208"+
		"\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d\3\2\2\2\u020c\u020a\3\2\2\2\u020d"+
		"\u020e\t\4\2\2\u020e\u00ac\3\2\2\2\u020f\u0210\7\62\2\2\u0210\u0214\t"+
		"\5\2\2\u0211\u0213\t\6\2\2\u0212\u0211\3\2\2\2\u0213\u0216\3\2\2\2\u0214"+
		"\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0214\3\2"+
		"\2\2\u0217\u0218\t\7\2\2\u0218\u00ae\3\2\2\2\u0219\u021a\7\62\2\2\u021a"+
		"\u021e\t\b\2\2\u021b\u021d\t\t\2\2\u021c\u021b\3\2\2\2\u021d\u0220\3\2"+
		"\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220"+
		"\u021e\3\2\2\2\u0221\u0222\t\n\2\2\u0222\u00b0\3\2\2\2\u0223\u022d\t\13"+
		"\2\2\u0224\u0228\t\13\2\2\u0225\u0227\t\f\2\2\u0226\u0225\3\2\2\2\u0227"+
		"\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2"+
		"\2\2\u022a\u0228\3\2\2\2\u022b\u022d\t\13\2\2\u022c\u0223\3\2\2\2\u022c"+
		"\u0224\3\2\2\2\u022d\u00b2\3\2\2\2\u022e\u0230\t\r\2\2\u022f\u0231\t\16"+
		"\2\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232"+
		"\u0234\t\13\2\2\u0233\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0233\3"+
		"\2\2\2\u0235\u0236\3\2\2\2\u0236\u00b4\3\2\2\2\u0237\u0238\7$\2\2\u0238"+
		"\u0239\7$\2\2\u0239\u023a\7$\2\2\u023a\u023b\3\2\2\2\u023b\u023c\bZ\4"+
		"\2\u023c\u00b6\3\2\2\2\u023d\u023e\7$\2\2\u023e\u023f\3\2\2\2\u023f\u0240"+
		"\b[\5\2\u0240\u00b8\3\2\2\2\u0241\u0249\7)\2\2\u0242\u0243\7^\2\2\u0243"+
		"\u0248\7)\2\2\u0244\u0245\7^\2\2\u0245\u0248\t\17\2\2\u0246\u0248\13\2"+
		"\2\2\u0247\u0242\3\2\2\2\u0247\u0244\3\2\2\2\u0247\u0246\3\2\2\2\u0248"+
		"\u024b\3\2\2\2\u0249\u024a\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024c\3\2"+
		"\2\2\u024b\u0249\3\2\2\2\u024c\u024d\7)\2\2\u024d\u00ba\3\2\2\2\u024e"+
		"\u0250\7a\2\2\u024f\u0251\5\u00cbe\2\u0250\u024f\3\2\2\2\u0251\u0252\3"+
		"\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u00bc\3\2\2\2\u0254"+
		"\u0258\5\u00cdf\2\u0255\u0257\5\u00cbe\2\u0256\u0255\3\2\2\2\u0257\u025a"+
		"\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u00be\3\2\2\2\u025a"+
		"\u0258\3\2\2\2\u025b\u025c\7a\2\2\u025c\u00c0\3\2\2\2\u025d\u025e\7%\2"+
		"\2\u025e\u025f\7%\2\2\u025f\u0263\3\2\2\2\u0260\u0262\n\20\2\2\u0261\u0260"+
		"\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264"+
		"\u00c2\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u0267\7%\2\2\u0267\u0268\7?\2"+
		"\2\u0268\u026c\3\2\2\2\u0269\u026b\13\2\2\2\u026a\u0269\3\2\2\2\u026b"+
		"\u026e\3\2\2\2\u026c\u026d\3\2\2\2\u026c\u026a\3\2\2\2\u026d\u026f\3\2"+
		"\2\2\u026e\u026c\3\2\2\2\u026f\u0270\7?\2\2\u0270\u0271\7%\2\2\u0271\u0272"+
		"\3\2\2\2\u0272\u0273\ba\6\2\u0273\u00c4\3\2\2\2\u0274\u0275\7%\2\2\u0275"+
		"\u0276\7<\2\2\u0276\u027a\3\2\2\2\u0277\u0279\n\20\2\2\u0278\u0277\3\2"+
		"\2\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b"+
		"\u027d\3\2\2\2\u027c\u027a\3\2\2\2\u027d\u027e\bb\6\2\u027e\u00c6\3\2"+
		"\2\2\u027f\u0281\7\17\2\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282\u0283\7\f\2\2\u0283\u00c8\3\2\2\2\u0284\u0286\t\21"+
		"\2\2\u0285\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0285\3\2\2\2\u0287"+
		"\u0288\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\bd\6\2\u028a\u00ca\3\2"+
		"\2\2\u028b\u0291\5\u00cdf\2\u028c\u0291\5\u00cfg\2\u028d\u0291\5\u00d1"+
		"h\2\u028e\u0291\5\u00d3i\2\u028f\u0291\5\u00d5j\2\u0290\u028b\3\2\2\2"+
		"\u0290\u028c\3\2\2\2\u0290\u028d\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u028f"+
		"\3\2\2\2\u0291\u00cc\3\2\2\2\u0292\u029a\5\u00dbm\2\u0293\u029a\5\u00dd"+
		"n\2\u0294\u029a\5\u00dfo\2\u0295\u029a\5\u00e1p\2\u0296\u029a\5\u00e3"+
		"q\2\u0297\u029a\5\u00e5r\2\u0298\u029a\5\u00d7k\2\u0299\u0292\3\2\2\2"+
		"\u0299\u0293\3\2\2\2\u0299\u0294\3\2\2\2\u0299\u0295\3\2\2\2\u0299\u0296"+
		"\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u0298\3\2\2\2\u029a\u00ce\3\2\2\2\u029b"+
		"\u029e\5\u00efw\2\u029c\u029e\5\u00d7k\2\u029d\u029b\3\2\2\2\u029d\u029c"+
		"\3\2\2\2\u029e\u00d0\3\2\2\2\u029f\u02a2\5\u00edv\2\u02a0\u02a2\5\u00d7"+
		"k\2\u02a1\u029f\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2\u00d2\3\2\2\2\u02a3"+
		"\u02a7\5\u00e7s\2\u02a4\u02a7\5\u00e9t\2\u02a5\u02a7\5\u00d7k\2\u02a6"+
		"\u02a3\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a5\3\2\2\2\u02a7\u00d4\3\2"+
		"\2\2\u02a8\u02ab\5\u00ebu\2\u02a9\u02ab\5\u00d7k\2\u02aa\u02a8\3\2\2\2"+
		"\u02aa\u02a9\3\2\2\2\u02ab\u00d6\3\2\2\2\u02ac\u02ad\7^\2\2\u02ad\u02ae"+
		"\7w\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0\5\u00d9l\2\u02b0\u02b1\5\u00d9"+
		"l\2\u02b1\u02b2\5\u00d9l\2\u02b2\u02b3\5\u00d9l\2\u02b3\u02c1\3\2\2\2"+
		"\u02b4\u02b5\7^\2\2\u02b5\u02b6\7W\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8"+
		"\5\u00d9l\2\u02b8\u02b9\5\u00d9l\2\u02b9\u02ba\5\u00d9l\2\u02ba\u02bb"+
		"\5\u00d9l\2\u02bb\u02bc\5\u00d9l\2\u02bc\u02bd\5\u00d9l\2\u02bd\u02be"+
		"\5\u00d9l\2\u02be\u02bf\5\u00d9l\2\u02bf\u02c1\3\2\2\2\u02c0\u02ac\3\2"+
		"\2\2\u02c0\u02b4\3\2\2\2\u02c1\u00d8\3\2\2\2\u02c2\u02c4\t\n\2\2\u02c3"+
		"\u02c2\3\2\2\2\u02c4\u00da\3\2\2\2\u02c5\u02c6\t\22\2\2\u02c6\u00dc\3"+
		"\2\2\2\u02c7\u02c8\t\23\2\2\u02c8\u00de\3\2\2\2\u02c9\u02ca\t\24\2\2\u02ca"+
		"\u00e0\3\2\2\2\u02cb\u02cc\t\25\2\2\u02cc\u00e2\3\2\2\2\u02cd\u02ce\t"+
		"\26\2\2\u02ce\u00e4\3\2\2\2\u02cf\u02d0\t\27\2\2\u02d0\u00e6\3\2\2\2\u02d1"+
		"\u02d2\4\u0302\u0312\2\u02d2\u00e8\3\2\2\2\u02d3\u02d4\t\30\2\2\u02d4"+
		"\u00ea\3\2\2\2\u02d5\u02d6\t\31\2\2\u02d6\u00ec\3\2\2\2\u02d7\u02d8\t"+
		"\32\2\2\u02d8\u00ee\3\2\2\2\u02d9\u02da\t\33\2\2\u02da\u00f0\3\2\2\2\u02db"+
		"\u02dc\7$\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\bx\3\2\u02de\u00f2\3\2\2"+
		"\2\u02df\u02e0\7&\2\2\u02e0\u02e1\7}\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3"+
		"\by\2\2\u02e3\u00f4\3\2\2\2\u02e4\u02e5\7^\2\2\u02e5\u02ed\t\34\2\2\u02e6"+
		"\u02e8\n\35\2\2\u02e7\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02e7\3"+
		"\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02ed\7&\2\2\u02ec"+
		"\u02e4\3\2\2\2\u02ec\u02e7\3\2\2\2\u02ec\u02eb\3\2\2\2\u02ed\u00f6\3\2"+
		"\2\2\u02ee\u02ef\7$\2\2\u02ef\u02f0\7$\2\2\u02f0\u02f1\7$\2\2\u02f1\u02f2"+
		"\3\2\2\2\u02f2\u02f3\b{\3\2\u02f3\u00f8\3\2\2\2\u02f4\u02f5\7$\2\2\u02f5"+
		"\u00fa\3\2\2\2\u02f6\u02f7\7&\2\2\u02f7\u02f8\7}\2\2\u02f8\u02f9\3\2\2"+
		"\2\u02f9\u02fa\b}\2\2\u02fa\u00fc\3\2\2\2\u02fb\u02fc\7^\2\2\u02fc\u0304"+
		"\7&\2\2\u02fd\u02ff\n\36\2\2\u02fe\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300"+
		"\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0304\3\2\2\2\u0302\u0304\7&"+
		"\2\2\u0303\u02fb\3\2\2\2\u0303\u02fe\3\2\2\2\u0303\u0302\3\2\2\2\u0304"+
		"\u00fe\3\2\2\2#\2\3\4\u01ff\u0201\u020a\u0214\u021e\u0228\u022c\u0230"+
		"\u0235\u0247\u0249\u0252\u0258\u0263\u026c\u027a\u0280\u0287\u0290\u0299"+
		"\u029d\u02a1\u02a6\u02aa\u02c0\u02c3\u02e9\u02ec\u0300\u0303\7\7\2\2\6"+
		"\2\2\7\4\2\7\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}