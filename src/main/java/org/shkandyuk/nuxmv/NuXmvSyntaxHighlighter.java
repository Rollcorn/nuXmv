package org.shkandyuk.nuxmv;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.shkandyuk.nuxmv.grammar.parser.NuXmvLexerAdapter;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class NuXmvSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey STRING =
            createTextAttributesKey("STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new NuXmvLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(NuXmvTypes.KEYWORD)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(NuXmvTypes.NUMBER)) {
            return NUMBER_KEYS;
        } else if (tokenType.equals(NuXmvTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(NuXmvTypes.STRING)) {
            return STRING_KEYS;
        } else if (tokenType.equals(NuXmvTypes.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
