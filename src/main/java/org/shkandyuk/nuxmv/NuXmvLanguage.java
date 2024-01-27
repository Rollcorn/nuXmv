package org.shkandyuk.nuxmv;

import com.intellij.lang.Language;

public class NuXmvLanguage extends Language {
    public static final NuXmvLanguage INSTANCE = new NuXmvLanguage();

    protected NuXmvLanguage() {
        super("NuXmv");
    }
}
