package org.apache.commons.lang3.text.translate;


public class JavaUnicodeEscaper extends org.apache.commons.lang3.text.translate.UnicodeEscaper {
    public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper above(final int codepoint) {
        return org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.outsideOf(0, codepoint);
    }

    public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper below(final int codepoint) {
        return org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.outsideOf(codepoint, java.lang.Integer.MAX_VALUE);
    }

    public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper between(final int codepointLow, final int codepointHigh) {
        return new org.apache.commons.lang3.text.translate.JavaUnicodeEscaper(codepointLow , codepointHigh , true);
    }

    public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper outsideOf(final int codepointLow, final int codepointHigh) {
        return new org.apache.commons.lang3.text.translate.JavaUnicodeEscaper(codepointLow , codepointHigh , false);
    }

    public JavaUnicodeEscaper(final int below ,final int above ,final boolean between) {
        super(below, above, between);
    }

    @java.lang.Override
    protected java.lang.String toUtf16Escape(final int codepoint) {
        final char[] surrogatePair = java.lang.Character.toChars(codepoint);
        return (("\\u" + (org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(surrogatePair[0]))) + "\\u") + (org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(surrogatePair[1]));
    }
}

