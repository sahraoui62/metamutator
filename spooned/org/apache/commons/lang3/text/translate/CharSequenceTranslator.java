package org.apache.commons.lang3.text.translate;


public abstract class CharSequenceTranslator {
    static final char[] HEX_DIGITS = new char[]{ '0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9' , 'A' , 'B' , 'C' , 'D' , 'E' , 'F' };

    public abstract int translate(java.lang.CharSequence input, int index, java.io.Writer out) throws java.io.IOException;

    public final java.lang.String translate(final java.lang.CharSequence input) {
        if (input == null) {
            return null;
        } 
        try {
            final java.io.StringWriter writer = new java.io.StringWriter(((_arithmeticOperatorHotSpot102.is("PLUS")) ? (((input.length()) + 2)) : (_arithmeticOperatorHotSpot102.is("MINUS")) ? (((input.length()) - 2)) : (_arithmeticOperatorHotSpot102.is("MUL")) ? (((input.length()) * 2)) :  (((input.length()) / 2))));
            translate(input, writer);
            return writer.toString();
        } catch (final java.io.IOException ioe) {
            throw new java.lang.RuntimeException(ioe);
        }
    }

    public final void translate(final java.lang.CharSequence input, final java.io.Writer out) throws java.io.IOException {
        if (out == null) {
            throw new java.lang.IllegalArgumentException("The Writer must not be null");
        } 
        if (input == null) {
            return ;
        } 
        int pos = 0;
        final int len = input.length();
        while (pos < len) {
            final int consumed = translate(input, pos, out);
            if (consumed == 0) {
                char c1 = input.charAt(pos);
                out.write(c1);
                pos++;
                if ((java.lang.Character.isHighSurrogate(c1)) && (pos < len)) {
                    char c2 = input.charAt(pos);
                    if (java.lang.Character.isLowSurrogate(c2)) {
                        out.write(c2);
                        pos++;
                    } 
                } 
                continue;
            } 
            for (int pt = 0 ; pt < consumed ; pt++) {
                pos += java.lang.Character.charCount(java.lang.Character.codePointAt(input, pos));
            }
        }
    }

    public final org.apache.commons.lang3.text.translate.CharSequenceTranslator with(final org.apache.commons.lang3.text.translate.CharSequenceTranslator... translators) {
        final org.apache.commons.lang3.text.translate.CharSequenceTranslator[] newArray = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[((_arithmeticOperatorHotSpot103.is("PLUS")) ? ((translators.length) + 1) : (_arithmeticOperatorHotSpot103.is("MINUS")) ? ((translators.length) - 1) : (_arithmeticOperatorHotSpot103.is("MUL")) ? ((translators.length) * 1) :  ((translators.length) / 1))];
        newArray[0] = this;
        java.lang.System.arraycopy(translators, 0, newArray, 1, translators.length);
        return new org.apache.commons.lang3.text.translate.AggregateTranslator(newArray);
    }

    public static java.lang.String hex(final int codepoint) {
        return java.lang.Integer.toHexString(codepoint).toUpperCase(java.util.Locale.ENGLISH);
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot102 = metamutator.Selector.of(102,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.text.translate.CharSequenceTranslator.class).id("_arithmeticOperatorHotSpot102");

    private static final metamutator.Selector _arithmeticOperatorHotSpot103 = metamutator.Selector.of(103,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.CharSequenceTranslator.class).id("_arithmeticOperatorHotSpot103");
}

