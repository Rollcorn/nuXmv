package org.shkandyuk.nuxmv.grammar.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.shkandyuk.nuxmv.NuXmvLanguage;

public class NuXmvElementType extends IElementType {
    public NuXmvElementType(@NotNull @NonNls String debugName) {
        super(debugName, NuXmvLanguage.INSTANCE);
    }
}
