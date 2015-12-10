package org.apache.commons.lang3.text.translate;


public class AggregateTranslator extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
    private final org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators;

    public AggregateTranslator(final org.apache.commons.lang3.text.translate.CharSequenceTranslator... translators) {
        this.translators = org.apache.commons.lang3.ArrayUtils.clone(translators);
    }

    @java.lang.Override
    public int translate(final java.lang.CharSequence input, final int index, final java.io.Writer out) throws java.io.IOException {
        for (final org.apache.commons.lang3.text.translate.CharSequenceTranslator translator : translators) {
            final int consumed = translator.translate(input, index, out);
            if (consumed != 0) {
                return ((_returnReplacementOperatorHotSpot1095.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1095.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1095.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (consumed));
            } 
        }
        return ((_returnReplacementOperatorHotSpot1096.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1096.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1096.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1095 = metamutator.Selector.of(1095,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.translate.AggregateTranslator.class).id("_returnReplacementOperatorHotSpot1095");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1096 = metamutator.Selector.of(1096,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.translate.AggregateTranslator.class).id("_returnReplacementOperatorHotSpot1096");
}

