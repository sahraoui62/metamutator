package org.apache.commons.lang3.text.translate;


public class JavaUnicodeEscaper extends org.apache.commons.lang3.text.translate.UnicodeEscaper {
    public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper above(final int codepoint) {
        return ((_returnReplacementOperator1114.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.outsideOf(0, codepoint)));
    }

    public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper below(final int codepoint) {
        return ((_returnReplacementOperator1115.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.outsideOf(codepoint, java.lang.Integer.MAX_VALUE)));
    }

    public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper between(final int codepointLow, final int codepointHigh) {
        return ((_returnReplacementOperator1116.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.text.translate.JavaUnicodeEscaper(codepointLow , codepointHigh , true)));
    }

    public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper outsideOf(final int codepointLow, final int codepointHigh) {
        return ((_returnReplacementOperator1117.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.text.translate.JavaUnicodeEscaper(codepointLow , codepointHigh , false)));
    }

    public JavaUnicodeEscaper(final int below ,final int above ,final boolean between) {
        super(below, above, between);
    }

    @java.lang.Override
    protected java.lang.String toUtf16Escape(final int codepoint) {
        final char[] surrogatePair = java.lang.Character.toChars(codepoint);
        return ((_returnReplacementOperator1113.is("NULL")) ? ( null ) : ((("\\u" + (org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(surrogatePair[0]))) + "\\u") + (org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(surrogatePair[1]))));
    }

    private static final metamutator.Selector _returnReplacementOperator1113 = metamutator.Selector.of(1113,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.class).id("_returnReplacementOperator1113");

    private static final metamutator.Selector _returnReplacementOperator1114 = metamutator.Selector.of(1114,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.class).id("_returnReplacementOperator1114");

    private static final metamutator.Selector _returnReplacementOperator1115 = metamutator.Selector.of(1115,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.class).id("_returnReplacementOperator1115");

    private static final metamutator.Selector _returnReplacementOperator1116 = metamutator.Selector.of(1116,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.class).id("_returnReplacementOperator1116");

    private static final metamutator.Selector _returnReplacementOperator1117 = metamutator.Selector.of(1117,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.class).id("_returnReplacementOperator1117");
}

