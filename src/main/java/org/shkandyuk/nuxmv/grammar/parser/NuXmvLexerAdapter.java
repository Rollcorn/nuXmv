package org.shkandyuk.nuxmv.grammar.parser;

import com.intellij.lexer.Lexer;
import com.intellij.lexer.LexerPosition;
import com.intellij.psi.tree.IElementType;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.jetbrains.annotations.NotNull;
import org.shkandyuk.nuxmv.grammar.NuXmvTokenTypes;

public class NuXmvLexerAdapter extends Lexer {
    private final NuXmvLexer antlrLexer;

    public NuXmvLexerAdapter() {
        antlrLexer = new NuXmvLexer(null);
    }

    @Override
    public void start(@NotNull CharSequence buffer, int startOffset, int endOffset, int initialState) {
        CharStream stream = CharStreams.fromString(buffer.subSequence(startOffset, endOffset).toString());
        antlrLexer.setInputStream(stream);
    }

    @Override
    public int getState() {
        return 0;
    }

    @Override
    public IElementType getTokenType() {
        Token currentToken = antlrLexer.getToken();
        if (currentToken.getType() == Token.EOF) {
            return null;
        }
        return NuXmvTokenTypes.getTokenType(currentToken.getType());
    }

    @Override
    public int getTokenStart() {
        return antlrLexer.getCharIndex();
    }

    @Override
    public int getTokenEnd() {
        return antlrLexer.getCharIndex() + antlrLexer.getText().length();
    }

    @Override
    public void advance() {
        antlrLexer.nextToken();
    }

    @NotNull
    @Override
    public CharSequence getBufferSequence() {
        return antlrLexer.getInputStream().toString();
    }

    @Override
    public int getBufferEnd() {
        return antlrLexer.getInputStream().size();
    }

    @Override
    public void restore(@NotNull LexerPosition position) {
        // ANTLR lexers don't have a concept of state by default
    }

    @Override
    public @NotNull LexerPosition getCurrentPosition() {
        return new LexerPosition() {
            @Override
            public int getOffset() {
                return getTokenStart();
            }
            @Override
            public int getState() {
                return 0; // or return the appropriate state
            }
        };
    }
}