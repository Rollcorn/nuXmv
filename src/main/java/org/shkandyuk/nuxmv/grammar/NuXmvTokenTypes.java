/*package org.shkandyuk.nuxmv.grammar;


import com.intellij.psi.tree.IElementType;
import org.shkandyuk.nuxmv.grammar.parser.NuXmvLexer;
import org.shkandyuk.nuxmv.grammar.psi.NuXmvElementType;

public interface NuXmvTokenTypes {
    IElementType KEYWORD = new NuXmvElementType("KEYWORD");
    IElementType NUMBER = new NuXmvElementType("NUMBER");
    IElementType COMMENT = new NuXmvElementType("COMMENT");
    IElementType STRING = new NuXmvElementType("STRING");
    IElementType BAD_CHARACTER = new NuXmvElementType("BAD_CHARACTER");

    static IElementType getTokenType(int tokenType) {
        switch (tokenType) {
            case NuXmvLexer.KEYWORD:
                return KEYWORD;
            case NuXmvLexer.NUMBER:
                return NUMBER;
            case NuXmvLexer.COMMENT:
                return COMMENT;
            case NuXmvLexer.STRING:
                return STRING;
            default:
                return BAD_CHARACTER;
        }
    }
}

*/