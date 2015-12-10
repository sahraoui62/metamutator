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
        return ((_returnReplacementOperator1127.is("NULL")) ? ( null ) : ((options) == null ? false : options.contains(option)));
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
                    return ((_returnReplacementOperator1128.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1128.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1128.is("ZERO")) ? ( 0 ) : (0));
                } 
            } 
            int end = start;
            while ((end < seqEnd) && (((((input.charAt(end)) >= '0') && ((input.charAt(end)) <= '9')) || (((input.charAt(end)) >= 'a') && ((input.charAt(end)) <= 'f'))) || (((input.charAt(end)) >= 'A') && ((input.charAt(end)) <= 'F')))) {
                end++;
            }
            final boolean semiNext = (end != seqEnd) && ((input.charAt(end)) == ';');
            if (!semiNext) {
                if (isSet(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired)) {
                    return ((_returnReplacementOperator1129.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1129.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1129.is("ZERO")) ? ( 0 ) : (0));
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
                return ((_returnReplacementOperator1130.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1130.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1130.is("ZERO")) ? ( 0 ) : (0));
            }
            if (entityValue > 65535) {
                final char[] chrs = java.lang.Character.toChars(entityValue);
                out.write(chrs[0]);
                out.write(chrs[1]);
            } else {
                out.write(entityValue);
            }
            return ((_returnReplacementOperator1131.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1131.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1131.is("ZERO")) ? ( 0 ) : ((((2 + end) - start) + (isHex ? 1 : 0)) + (semiNext ? 1 : 0)));
        } 
        return ((_returnReplacementOperator1132.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1132.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1132.is("ZERO")) ? ( 0 ) : (0));
    }

    private static final metamutator.Selector _returnReplacementOperator1127 = metamutator.Selector.of(1127,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.class).id("_returnReplacementOperator1127");

    private static final metamutator.Selector _returnReplacementOperator1128 = metamutator.Selector.of(1128,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.class).id("_returnReplacementOperator1128");

    private static final metamutator.Selector _returnReplacementOperator1129 = metamutator.Selector.of(1129,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.class).id("_returnReplacementOperator1129");

    private static final metamutator.Selector _returnReplacementOperator1130 = metamutator.Selector.of(1130,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.class).id("_returnReplacementOperator1130");

    private static final metamutator.Selector _returnReplacementOperator1131 = metamutator.Selector.of(1131,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.class).id("_returnReplacementOperator1131");

    private static final metamutator.Selector _returnReplacementOperator1132 = metamutator.Selector.of(1132,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.class).id("_returnReplacementOperator1132");
}

