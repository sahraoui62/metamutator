package org.apache.commons.lang3.text.translate;


public class UnicodeUnescaper extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
    @java.lang.Override
    public int translate(final java.lang.CharSequence input, final int index, final java.io.Writer out) throws java.io.IOException {
        if ((((input.charAt(index)) == '\\') && ((index + 1) < (input.length()))) && ((input.charAt((index + 1))) == 'u')) {
            int i = 2;
            while (((index + i) < (input.length())) && ((input.charAt((index + i))) == 'u')) {
                i++;
            }
            if (((index + i) < (input.length())) && ((input.charAt((index + i))) == '+')) {
                i++;
            } 
            if (((index + i) + 4) <= (input.length())) {
                final java.lang.CharSequence unicode = input.subSequence((index + i), ((index + i) + 4));
                try {
                    final int value = java.lang.Integer.parseInt(unicode.toString(), 16);
                    out.write(((char)(value)));
                } catch (final java.lang.NumberFormatException nfe) {
                    throw new java.lang.IllegalArgumentException(("Unable to parse unicode value: " + unicode) , nfe);
                }
                return ((_returnReplacementOperatorHotSpot1145.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1145.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1145.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i + 4));
            } 
            throw new java.lang.IllegalArgumentException((("Less than 4 hex digits in unicode value: '" + (input.subSequence(index, input.length()))) + "' due to end of CharSequence"));
        } 
        return ((_returnReplacementOperatorHotSpot1146.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1146.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1146.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1145 = metamutator.Selector.of(1145,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.translate.UnicodeUnescaper.class).id("_returnReplacementOperatorHotSpot1145");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1146 = metamutator.Selector.of(1146,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.translate.UnicodeUnescaper.class).id("_returnReplacementOperatorHotSpot1146");
}

