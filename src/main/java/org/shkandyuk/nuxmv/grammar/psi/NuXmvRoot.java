package org.shkandyuk.nuxmv.grammar.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class NuXmvRoot extends ASTWrapperPsiElement {
    public NuXmvRoot(@NotNull ASTNode node) {
        super(node);
    }
}
