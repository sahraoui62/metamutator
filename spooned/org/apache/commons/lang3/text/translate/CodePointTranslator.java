package org.apache.commons.lang3.text.translate;


public abstract class CodePointTranslator extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
    @java.lang.Override
    public final int translate(final java.lang.CharSequence input, final int index, final java.io.Writer out) throws java.io.IOException {
        final int codepoint = java.lang.Character.codePointAt(input, index);
        final boolean consumed = translate(codepoint, out);
        return ((_returnReplacementOperatorHotSpot1101.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1101.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1101.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (consumed ? 1 : 0));
    }

    public abstract boolean translate(int codepoint, java.io.Writer out) throws java.io.IOException;

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1101 = metamutator.Selector.of(1101,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.translate.CodePointTranslator.class).id("_returnReplacementOperatorHotSpot1101");
}

