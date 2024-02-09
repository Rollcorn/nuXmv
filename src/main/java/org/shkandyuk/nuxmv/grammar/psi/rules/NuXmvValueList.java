package org.shkandyuk.nuxmv.grammar.psi.rules;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public class NuXmvValueList extends ASTWrapperPsiElement {
    public NuXmvValueList(@NotNull ASTNode node) {
        super(node);
    }
}