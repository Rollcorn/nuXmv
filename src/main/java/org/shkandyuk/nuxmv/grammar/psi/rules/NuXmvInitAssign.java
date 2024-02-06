package org.shkandyuk.nuxmv.grammar.psi.rules;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class NuXmvInitAssign extends ASTWrapperPsiElement {
    public NuXmvInitAssign(@NotNull ASTNode node) {
        super(node);
    }
}