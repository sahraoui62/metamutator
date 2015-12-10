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
        return (options) == null ? false : options.contains(option);
    }

    @java.lang.Override
    public int translate(final java.lang.CharSequence input, final int index, final java.io.Writer out) throws java.io.IOException {
        final int seqEnd = input.length();
        if ((((input.charAt(index)) == '&') && (index < ((_arithmeticOperatorHotSpot107.is("PLUS")) ? ((seqEnd + 2)) : (_arithmeticOperatorHotSpot107.is("MINUS")) ? ((seqEnd - 2)) : (_arithmeticOperatorHotSpot107.is("MUL")) ? ((seqEnd * 2)) :  ((seqEnd / 2))))) && ((input.charAt(((_arithmeticOperatorHotSpot108.is("PLUS")) ? ((index + 1)) : (_arithmeticOperatorHotSpot108.is("MINUS")) ? ((index - 1)) : (_arithmeticOperatorHotSpot108.is("MUL")) ? ((index * 1)) :  ((index / 1))))) == '#')) {
            int start = ((_arithmeticOperatorHotSpot109.is("PLUS")) ? (index + 2) : (_arithmeticOperatorHotSpot109.is("MINUS")) ? (index - 2) : (_arithmeticOperatorHotSpot109.is("MUL")) ? (index * 2) :  (index / 2));
            boolean isHex = false;
            final char firstChar = input.charAt(start);
            if ((firstChar == 'x') || (firstChar == 'X')) {
                start++;
                isHex = true;
                if (start == seqEnd) {
                    return 0;
                } 
            } 
            int end = start;
            while ((end < seqEnd) && (((((input.charAt(end)) >= '0') && ((input.charAt(end)) <= '9')) || (((input.charAt(end)) >= 'a') && ((input.charAt(end)) <= 'f'))) || (((input.charAt(end)) >= 'A') && ((input.charAt(end)) <= 'F')))) {
                end++;
            }
            final boolean semiNext = (end != seqEnd) && ((input.charAt(end)) == ';');
            if (!semiNext) {
                if (isSet(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired)) {
                    return 0;
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
                return 0;
            }
            if (entityValue > 65535) {
                final char[] chrs = java.lang.Character.toChars(entityValue);
                out.write(chrs[0]);
                out.write(chrs[1]);
            } else {
                out.write(entityValue);
            }
            return ((((_arithmeticOperatorHotSpot110.is("PLUS")) ? ((2 + end)) : (_arithmeticOperatorHotSpot110.is("MINUS")) ? ((2 - end)) : (_arithmeticOperatorHotSpot110.is("MUL")) ? ((2 * end)) :  ((2 / end))) - start) + (isHex ? 1 : 0)) + (semiNext ? 1 : 0);
        } 
        return 0;
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot107 = metamutator.Selector.of(107,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.class).id("_arithmeticOperatorHotSpot107");

    private static final metamutator.Selector _arithmeticOperatorHotSpot108 = metamutator.Selector.of(108,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.class).id("_arithmeticOperatorHotSpot108");

    private static final metamutator.Selector _arithmeticOperatorHotSpot109 = metamutator.Selector.of(109,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.class).id("_arithmeticOperatorHotSpot109");

    private static final metamutator.Selector _arithmeticOperatorHotSpot110 = metamutator.Selector.of(110,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.class).id("_arithmeticOperatorHotSpot110");
}

