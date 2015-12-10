package org.apache.commons.lang3.text.translate;


public abstract class CodePointTranslator extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
    @java.lang.Override
    public final int translate(final java.lang.CharSequence input, final int index, final java.io.Writer out) throws java.io.IOException {
        final int codepoint = java.lang.Character.codePointAt(input, index);
        final boolean consumed = translate(codepoint, out);
        return consumed ? 1 : 0;
    }

    public abstract boolean translate(int codepoint, java.io.Writer out) throws java.io.IOException;
}

