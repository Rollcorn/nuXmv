package org.shkandyuk.nuxmv.highlight;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.psi.tree.IElementType;
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.jetbrains.annotations.NotNull;
import org.shkandyuk.nuxmv.NuXmvLanguage;
import org.shkandyuk.nuxmv.grammar.parser.NuXmvLexer;
import org.shkandyuk.nuxmv.grammar.parser.NuXmvParser;

import static com.intellij.openapi.editor.DefaultLanguageHighlighterColors.BLOCK_COMMENT;
import static com.intellij.openapi.editor.DefaultLanguageHighlighterColors.LINE_COMMENT;
import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class NuXmvSyntaxHighlighter implements SyntaxHighlighter {
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];


    public static final TextAttributesKey ID =
            createTextAttributesKey("NUXMV_ID", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("NUXMV_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("NUXMV_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("NUXMV_COMMENT", LINE_COMMENT);
    public static final TextAttributesKey STRING =
            createTextAttributesKey("STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("NUXMV_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);


    static {
        PSIElementTypeFactory.defineLanguageIElementTypes(NuXmvLanguage.INSTANCE,
                NuXmvParser.tokenNames,
                NuXmvParser.ruleNames);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        NuXmvLexer lexer = new NuXmvLexer(null);
        return new ANTLRLexerAdaptor(NuXmvLanguage.INSTANCE, lexer);    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (!(tokenType instanceof TokenIElementType)) return EMPTY_KEYS;
        TokenIElementType myType = (TokenIElementType) tokenType;
        int ttype = myType.getANTLRTokenType();
        TextAttributesKey attrKey;
        switch (ttype) {
            case NuXmvLexer.ID:
                attrKey = ID;
                break;
            case NuXmvLexer.VAR:
            case NuXmvLexer.MODULE:
            case NuXmvLexer.CASE:
            case NuXmvLexer.INIT:
            case NuXmvLexer.NEXT_ASSIGN:
            case NuXmvLexer.SKIP:
            case NuXmvLexer.BOOLEAN:
            case NuXmvLexer.TRUE:
            case NuXmvLexer.FALSE:
            case NuXmvLexer.IVAR:
            case NuXmvLexer.INVAR:
                attrKey = KEYWORD;
                break;
            case NuXmvLexer.STRING:
                attrKey = STRING;
                break;
            case NuXmvLexer.COMMENT:
                attrKey = BLOCK_COMMENT;
                break;
            case NuXmvLexer.LINE_COMMENT:
                attrKey = LINE_COMMENT;
                break;
//            case NuXmvLexer.BAD_CHARACTER:
//                attrKey = BAD_CHARACTER;
//                break;
            default:
                return EMPTY_KEYS;
        }
        return new TextAttributesKey[]{attrKey};
    }
}
