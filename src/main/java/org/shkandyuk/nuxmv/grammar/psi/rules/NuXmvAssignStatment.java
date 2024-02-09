package org.shkandyuk.nuxmv.grammar.psi.rules;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public class NuXmvAssignStatment extends ASTWrapperPsiElement {
    public NuXmvAssignStatment(@NotNull ASTNode node) {
        super(node);
    }
}