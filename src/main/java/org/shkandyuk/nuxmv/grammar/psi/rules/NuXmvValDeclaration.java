package org.shkandyuk.nuxmv.grammar.psi.rules;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public class NuXmvValDeclaration extends ASTWrapperPsiElement {
    public NuXmvValDeclaration(@NotNull ASTNode node) {
        super(node);
    }
}