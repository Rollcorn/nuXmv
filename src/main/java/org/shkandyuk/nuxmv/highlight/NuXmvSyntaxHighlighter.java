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
import org.shkandyuk.nuxmv.NuXmv;
import org.shkandyuk.nuxmv.grammar.antlr.NuXmvLexer;
import org.shkandyuk.nuxmv.grammar.antlr.NuXmvParser;

import static com.intellij.openapi.editor.DefaultLanguageHighlighterColors.LINE_COMMENT;
import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class NuXmvSyntaxHighlighter implements SyntaxHighlighter {
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];


    public static final TextAttributesKey ID =
            createTextAttributesKey("NUXMV_ID", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("NUXMV_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey BRACKETS =
            createTextAttributesKey("NUXMV_NUMBER", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey OPERATION =
            createTextAttributesKey("NUXMV_NUMBER", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("NUXMV_COMMENT", LINE_COMMENT);
        public static final TextAttributesKey BLOCK_COMMENT =
            createTextAttributesKey("NUXMV_BLOCK_COMMENT", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("NUXMV_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);


    static {
        PSIElementTypeFactory.defineLanguageIElementTypes(NuXmv.INSTANCE,
                NuXmvParser.tokenNames,
                NuXmvParser.ruleNames);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        NuXmvLexer lexer = new NuXmvLexer(null);
        return new ANTLRLexerAdaptor(NuXmv.INSTANCE, lexer);
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (!(tokenType instanceof TokenIElementType)) return EMPTY_KEYS;
        TokenIElementType myType = (TokenIElementType) tokenType;
        int ttype = myType.getANTLRTokenType();
        TextAttributesKey attrKey;
        switch (ttype) {
            case NuXmvLexer.VAR:
            case NuXmvLexer.MODULE:
            case NuXmvLexer.CASE:
            case NuXmvLexer.BI_INIT:
            case NuXmvLexer.SKIP:
            case NuXmvLexer.T_BOOLEAN:
            case NuXmvLexer.IVAR:
            case NuXmvLexer.OP_NEXT:
            case NuXmvLexer.OP_MOD:
            case NuXmvLexer.INVARSPEC:
            case NuXmvLexer.INVAR:
                attrKey = KEYWORD;
                break;

            case NuXmvLexer.OP_EX | NuXmvLexer.OP_EG | NuXmvLexer.OP_EF |
                    NuXmvLexer.OP_AX | NuXmvLexer.OP_AG | NuXmvLexer.OP_AF
                    | NuXmvLexer.OP_BU | NuXmvLexer.OP_EBF | NuXmvLexer.OP_EBG
                    | NuXmvLexer.OP_ABF | NuXmvLexer.OP_ABG
                    | NuXmvLexer.OP_E   | NuXmvLexer.OP_F | NuXmvLexer.OP_O
                    | NuXmvLexer.OP_G   | NuXmvLexer.OP_U | NuXmvLexer.OP_H
                    | NuXmvLexer.OP_X   | NuXmvLexer.OP_Y | NuXmvLexer.OP_Z
                    | NuXmvLexer.OP_A   | NuXmvLexer.OP_U | NuXmvLexer.OP_S
                    | NuXmvLexer.OP_V   | NuXmvLexer.OP_T:
            case NuXmvLexer.STATE_ASSIGN:
            case NuXmvLexer.MINUS_ARROW:
            case NuXmvLexer.ASSIGN_OP:
            case NuXmvLexer.ASSIGN:
                attrKey = OPERATION;
                break;

            case NuXmvLexer.L_BRACE | NuXmvLexer.R_BRACE
                    | NuXmvLexer.L_BRACKET | NuXmvLexer.R_BRACKET:
                attrKey = BRACKETS;
                break;

            case NuXmvLexer.IDENTIFICATOR:
                attrKey = ID;
                break;

            case NuXmvLexer.COMMENT:
                attrKey = LINE_COMMENT;
                break;

            case NuXmvLexer.LINE_COMMENT:
                attrKey = BLOCK_COMMENT;
                break;

            case NuXmvLexer.BAD_CHARACTER:
                attrKey = BAD_CHARACTER;
                break;

            default:
                return EMPTY_KEYS;
        }
        return new TextAttributesKey[]{attrKey};
    }
}
