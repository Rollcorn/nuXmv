package org.shkandyuk.nuxmv.highlight;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.shkandyuk.nuxmv.NuXmvIcons;

import javax.swing.*;
import java.util.Map;

public class NuXmvColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Identifiers", NuXmvSyntaxHighlighter.ID),
            new AttributesDescriptor("Keywords", NuXmvSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Brackets", NuXmvSyntaxHighlighter.BRACKETS),
            new AttributesDescriptor("Operations", NuXmvSyntaxHighlighter.OPERATION),
            new AttributesDescriptor("Line comments", NuXmvSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("Operators", NuXmvSyntaxHighlighter.OPERATOR),
            new AttributesDescriptor("Block comments", NuXmvSyntaxHighlighter.BLOCK_COMMENT),

    };

    @Override
    public @Nullable Icon getIcon() {
        return NuXmvIcons.FILE;
    }

    @Override
    public @NotNull SyntaxHighlighter getHighlighter() {
        return new NuXmvSyntaxHighlighter();
    }

    @Override
    public @NonNls @NotNull String getDemoText() {
        return "# You are reading the \".properties\" entry.\n" +
                "! The exclamation mark can also mark text as comments.\n" +
                "website = https://en.wikipedia.org/\n" +
                "language = English\n" +
                "# The backslash below tells the application to continue reading\n" +
                "# the value onto the next line.\n" +
                "message = Welcome to \\\n" +
                "          Wikipedia!\n" +
                "# Add spaces to the key\n" +
                "key\\ with\\ spaces = This is the value that could be looked up with the key \"key with spaces\".\n" +
                "# Unicode\n" +
                "tab : \\u0009";
    }

    @Override
    public @Nullable Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public  String getDisplayName() {
        return "NuXmv";
    }
}
