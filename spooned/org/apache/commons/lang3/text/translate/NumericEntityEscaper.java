package org.apache.commons.lang3.text.translate;


public class NumericEntityEscaper extends org.apache.commons.lang3.text.translate.CodePointTranslator {
    private final int below;

    private final int above;

    private final boolean between;

    private NumericEntityEscaper(final int below ,final int above ,final boolean between) {
        this.below = below;
        this.above = above;
        this.between = between;
    }

    public NumericEntityEscaper() {
        this(0, java.lang.Integer.MAX_VALUE, true);
    }

    public static org.apache.commons.lang3.text.translate.NumericEntityEscaper below(final int codepoint) {
        return ((_returnReplacementOperatorHotSpot1124.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(codepoint, java.lang.Integer.MAX_VALUE)));
    }

    public static org.apache.commons.lang3.text.translate.NumericEntityEscaper above(final int codepoint) {
        return ((_returnReplacementOperatorHotSpot1123.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, codepoint)));
    }

    public static org.apache.commons.lang3.text.translate.NumericEntityEscaper between(final int codepointLow, final int codepointHigh) {
        return ((_returnReplacementOperatorHotSpot1125.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.text.translate.NumericEntityEscaper(codepointLow , codepointHigh , true)));
    }

    public static org.apache.commons.lang3.text.translate.NumericEntityEscaper outsideOf(final int codepointLow, final int codepointHigh) {
        return ((_returnReplacementOperatorHotSpot1126.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.text.translate.NumericEntityEscaper(codepointLow , codepointHigh , false)));
    }

    @java.lang.Override
    public boolean translate(final int codepoint, final java.io.Writer out) throws java.io.IOException {
        if (between) {
            if ((codepoint < (below)) || (codepoint > (above))) {
                return ((_returnReplacementOperatorHotSpot1120.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
        } else {
            if ((codepoint >= (below)) && (codepoint <= (above))) {
                return ((_returnReplacementOperatorHotSpot1121.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
        }
        out.write("&#");
        out.write(java.lang.Integer.toString(codepoint, 10));
        out.write(';');
        return ((_returnReplacementOperatorHotSpot1122.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1120 = metamutator.Selector.of(1120,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.translate.NumericEntityEscaper.class).id("_returnReplacementOperatorHotSpot1120");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1121 = metamutator.Selector.of(1121,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.translate.NumericEntityEscaper.class).id("_returnReplacementOperatorHotSpot1121");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1122 = metamutator.Selector.of(1122,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.translate.NumericEntityEscaper.class).id("_returnReplacementOperatorHotSpot1122");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1123 = metamutator.Selector.of(1123,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.translate.NumericEntityEscaper.class).id("_returnReplacementOperatorHotSpot1123");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1124 = metamutator.Selector.of(1124,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.translate.NumericEntityEscaper.class).id("_returnReplacementOperatorHotSpot1124");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1125 = metamutator.Selector.of(1125,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.translate.NumericEntityEscaper.class).id("_returnReplacementOperatorHotSpot1125");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1126 = metamutator.Selector.of(1126,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.translate.NumericEntityEscaper.class).id("_returnReplacementOperatorHotSpot1126");
}

