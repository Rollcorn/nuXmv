package org.shkandyuk.nuxmv;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class NuXmvFileType extends LanguageFileType {
    public static final NuXmvFileType INSTANCE = new NuXmvFileType();

    private NuXmvFileType() {
        super(NuXmvLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "NuXmv File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "NuXmv language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "NuXmv";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return NuXmvIcons.FILE;
    }
}
