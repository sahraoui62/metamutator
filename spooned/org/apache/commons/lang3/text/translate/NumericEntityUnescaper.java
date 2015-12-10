package org.apache.commons.lang3.text.translate;


public class NumericEntityUnescaper extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
    public static enum OPTION {
semiColonRequired, semiColonOptional, errorIfNoSemiColon;    }

    private final java.util.EnumSet<org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION> options;

    public NumericEntityUnescaper(final org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION... options) {
        if ((options.length) > 0) {
            this.options = java.util.EnumSet.copyOf(java.util.Arrays.asList(options));
        } else {
            this.options = java.util.EnumSet.copyOf(java.util.Arrays.asList(new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[]{ org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired }));
        }
    }

    public boolean isSet(final org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION option) {
        return ((_returnReplacementOperatorHotSpot1127.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((options) == null ? false : options.contains(option)));
    }

    @java.lang.Override
    public int translate(final java.lang.CharSequence input, final int index, final java.io.Writer out) throws java.io.IOException {
        final int seqEnd = input.length();
        if ((((input.charAt(index)) == '&') && (index < (seqEnd - 2))) && ((input.charAt((index + 1))) == '#')) {
            int start = index + 2;
            boolean isHex = false;
            final char firstChar = input.charAt(start);
            if ((firstChar == 'x') || (firstChar == 'X')) {
                start++;
                isHex = true;
                if (start == seqEnd) {
                    return ((_returnReplacementOperatorHotSpot1128.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1128.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1128.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
                } 
            } 
            int end = start;
            while ((end < seqEnd) && (((((input.charAt(end)) >= '0') && ((input.charAt(end)) <= '9')) || (((input.charAt(end)) >= 'a') && ((input.charAt(end)) <= 'f'))) || (((input.charAt(end)) >= 'A') && ((input.charAt(end)) <= 'F')))) {
                end++;
            }
            final boolean semiNext = (end != seqEnd) && ((input.charAt(end)) == ';');
            if (!semiNext) {
                if (isSet(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired)) {
                    return ((_returnReplacementOperatorHotSpot1129.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1129.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1129.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
                } else if (isSet(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon)) {
                    throw new java.lang.IllegalArgumentException("Semi-colon required at end of numeric entity");
                } 
            } 
            int entityValue;
            try {
                if (isHex) {
                    entityValue = java.lang.Integer.parseInt(input.subSequence(start, end).toString(), 16);
                } else {
                    entityValue = java.lang.Integer.parseInt(input.subSequence(start, end).toString(), 10);
                }
            } catch (final java.lang.NumberFormatException nfe) {
                return ((_returnReplacementOperatorHotSpot1130.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1130.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1130.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
            }
            if (entityValue > 65535) {
                final char[] chrs = java.lang.Character.toChars(entityValue);
                out.write(chrs[0]);
                out.write(chrs[1]);
            } else {
                out.write(entityValue);
            }
            return ((_returnReplacementOperatorHotSpot1131.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1131.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1131.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : ((((2 + end) - start) + (isHex ? 1 : 0)) + (semiNext ? 1 : 0)));
        } 
        return ((_returnReplacementOperatorHotSpot1132.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1132.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1132.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1127 = metamutator.Selector.of(1127,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.class).id("_returnReplacementOperatorHotSpot1127");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1128 = metamutator.Selector.of(1128,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.class).id("_returnReplacementOperatorHotSpot1128");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1129 = metamutator.Selector.of(1129,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.class).id("_returnReplacementOperatorHotSpot1129");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1130 = metamutator.Selector.of(1130,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.class).id("_returnReplacementOperatorHotSpot1130");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1131 = metamutator.Selector.of(1131,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.class).id("_returnReplacementOperatorHotSpot1131");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1132 = metamutator.Selector.of(1132,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.class).id("_returnReplacementOperatorHotSpot1132");
}

