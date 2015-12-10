package org.apache.commons.lang3.text.translate;


public class JavaUnicodeEscaper extends org.apache.commons.lang3.text.translate.UnicodeEscaper {
    public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper above(final int codepoint) {
        return ((_returnReplacementOperatorHotSpot1114.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.outsideOf(0, codepoint)));
    }

    public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper below(final int codepoint) {
        return ((_returnReplacementOperatorHotSpot1115.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.outsideOf(codepoint, java.lang.Integer.MAX_VALUE)));
    }

    public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper between(final int codepointLow, final int codepointHigh) {
        return ((_returnReplacementOperatorHotSpot1116.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.text.translate.JavaUnicodeEscaper(codepointLow , codepointHigh , true)));
    }

    public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper outsideOf(final int codepointLow, final int codepointHigh) {
        return ((_returnReplacementOperatorHotSpot1117.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.text.translate.JavaUnicodeEscaper(codepointLow , codepointHigh , false)));
    }

    public JavaUnicodeEscaper(final int below ,final int above ,final boolean between) {
        super(below, above, between);
    }

    @java.lang.Override
    protected java.lang.String toUtf16Escape(final int codepoint) {
        final char[] surrogatePair = java.lang.Character.toChars(codepoint);
        return ((_returnReplacementOperatorHotSpot1113.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((("\\u" + (org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(surrogatePair[0]))) + "\\u") + (org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(surrogatePair[1]))));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1113 = metamutator.Selector.of(1113,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.class).id("_returnReplacementOperatorHotSpot1113");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1114 = metamutator.Selector.of(1114,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.class).id("_returnReplacementOperatorHotSpot1114");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1115 = metamutator.Selector.of(1115,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.class).id("_returnReplacementOperatorHotSpot1115");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1116 = metamutator.Selector.of(1116,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.class).id("_returnReplacementOperatorHotSpot1116");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1117 = metamutator.Selector.of(1117,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.translate.JavaUnicodeEscaper.class).id("_returnReplacementOperatorHotSpot1117");
}

