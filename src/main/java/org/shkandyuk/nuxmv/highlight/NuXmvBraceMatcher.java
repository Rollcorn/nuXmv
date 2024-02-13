package org.shkandyuk.nuxmv.highlight;

import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.shkandyuk.nuxmv.grammar.antlr.NuXmvLexer;

import static org.shkandyuk.nuxmv.NuXmvParserDefinition.tokens;

public class NuXmvBraceMatcher implements PairedBraceMatcher {

    BracePair[] PAIRS = {
            new BracePair(tokens.get(NuXmvLexer.L_BRACE), tokens.get(NuXmvLexer.R_BRACE), true),
            new BracePair(tokens.get(NuXmvLexer.L_BRACKET), tokens.get(NuXmvLexer.R_BRACKET), true),
            new BracePair(tokens.get(NuXmvLexer.L_SQUARE_BRACKET), tokens.get(NuXmvLexer.R_SQUARE_BRACKET), true),
    };

    @Override
    public BracePair @NotNull [] getPairs() {
        return PAIRS;
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType lbraceType, @Nullable IElementType contextType) {
        return true;
    }

    @Override
    public int getCodeConstructStart(PsiFile file, int openingBraceOffset) {
        return 0;
    }
}
