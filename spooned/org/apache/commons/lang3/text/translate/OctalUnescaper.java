package org.apache.commons.lang3.text.translate;


public class OctalUnescaper extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
    @java.lang.Override
    public int translate(final java.lang.CharSequence input, final int index, final java.io.Writer out) throws java.io.IOException {
        final int remaining = ((input.length()) - index) - 1;
        final java.lang.StringBuilder builder = new java.lang.StringBuilder();
        if ((((input.charAt(index)) == '\\') && (remaining > 0)) && (isOctalDigit(input.charAt((index + 1))))) {
            final int next = index + 1;
            final int next2 = index + 2;
            final int next3 = index + 3;
            builder.append(input.charAt(next));
            if ((remaining > 1) && (isOctalDigit(input.charAt(next2)))) {
                builder.append(input.charAt(next2));
                if (((remaining > 2) && (isZeroToThree(input.charAt(next)))) && (isOctalDigit(input.charAt(next3)))) {
                    builder.append(input.charAt(next3));
                } 
            } 
            out.write(java.lang.Integer.parseInt(builder.toString(), 8));
            return ((_returnReplacementOperatorHotSpot1135.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1135.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1135.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (1 + (builder.length())));
        } 
        return ((_returnReplacementOperatorHotSpot1136.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1136.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1136.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
    }

    private boolean isOctalDigit(final char ch) {
        return ((_returnReplacementOperatorHotSpot1133.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((ch >= '0') && (ch <= '7')));
    }

    private boolean isZeroToThree(final char ch) {
        return ((_returnReplacementOperatorHotSpot1134.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((ch >= '0') && (ch <= '3')));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1133 = metamutator.Selector.of(1133,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.translate.OctalUnescaper.class).id("_returnReplacementOperatorHotSpot1133");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1134 = metamutator.Selector.of(1134,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.translate.OctalUnescaper.class).id("_returnReplacementOperatorHotSpot1134");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1135 = metamutator.Selector.of(1135,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.translate.OctalUnescaper.class).id("_returnReplacementOperatorHotSpot1135");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1136 = metamutator.Selector.of(1136,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.translate.OctalUnescaper.class).id("_returnReplacementOperatorHotSpot1136");
}

