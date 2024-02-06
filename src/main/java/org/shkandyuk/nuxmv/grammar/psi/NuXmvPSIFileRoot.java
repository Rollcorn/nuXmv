package org.shkandyuk.nuxmv.grammar.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import org.shkandyuk.nuxmv.NuXmvFileType;
import org.shkandyuk.nuxmv.NuXmvLanguage;

public class NuXmvPSIFileRoot extends PsiFileBase {

    public NuXmvPSIFileRoot(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, NuXmvLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return NuXmvFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "LibSL File";
    }
}
