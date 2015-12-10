package org.apache.commons.lang3.text.translate;


public class OctalUnescaper extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
    @java.lang.Override
    public int translate(final java.lang.CharSequence input, final int index, final java.io.Writer out) throws java.io.IOException {
        final int remaining = ((_arithmeticOperatorHotSpot111.is("PLUS")) ? (((input.length()) + index)) : (_arithmeticOperatorHotSpot111.is("MINUS")) ? (((input.length()) - index)) : (_arithmeticOperatorHotSpot111.is("MUL")) ? (((input.length()) * index)) :  (((input.length()) / index))) - 1;
        final java.lang.StringBuilder builder = new java.lang.StringBuilder();
        if ((((input.charAt(index)) == '\\') && (remaining > 0)) && (isOctalDigit(input.charAt(((_arithmeticOperatorHotSpot112.is("PLUS")) ? ((index + 1)) : (_arithmeticOperatorHotSpot112.is("MINUS")) ? ((index - 1)) : (_arithmeticOperatorHotSpot112.is("MUL")) ? ((index * 1)) :  ((index / 1))))))) {
            final int next = ((_arithmeticOperatorHotSpot113.is("PLUS")) ? (index + 1) : (_arithmeticOperatorHotSpot113.is("MINUS")) ? (index - 1) : (_arithmeticOperatorHotSpot113.is("MUL")) ? (index * 1) :  (index / 1));
            final int next2 = ((_arithmeticOperatorHotSpot114.is("PLUS")) ? (index + 2) : (_arithmeticOperatorHotSpot114.is("MINUS")) ? (index - 2) : (_arithmeticOperatorHotSpot114.is("MUL")) ? (index * 2) :  (index / 2));
            final int next3 = ((_arithmeticOperatorHotSpot115.is("PLUS")) ? (index + 3) : (_arithmeticOperatorHotSpot115.is("MINUS")) ? (index - 3) : (_arithmeticOperatorHotSpot115.is("MUL")) ? (index * 3) :  (index / 3));
            builder.append(input.charAt(next));
            if ((remaining > 1) && (isOctalDigit(input.charAt(next2)))) {
                builder.append(input.charAt(next2));
                if (((remaining > 2) && (isZeroToThree(input.charAt(next)))) && (isOctalDigit(input.charAt(next3)))) {
                    builder.append(input.charAt(next3));
                } 
            } 
            out.write(java.lang.Integer.parseInt(builder.toString(), 8));
            return ((_arithmeticOperatorHotSpot116.is("PLUS")) ? (1 + (builder.length())) : (_arithmeticOperatorHotSpot116.is("MINUS")) ? (1 - (builder.length())) : (_arithmeticOperatorHotSpot116.is("MUL")) ? (1 * (builder.length())) :  (1 / (builder.length())));
        } 
        return 0;
    }

    private boolean isOctalDigit(final char ch) {
        return (ch >= '0') && (ch <= '7');
    }

    private boolean isZeroToThree(final char ch) {
        return (ch >= '0') && (ch <= '3');
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot111 = metamutator.Selector.of(111,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.OctalUnescaper.class).id("_arithmeticOperatorHotSpot111");

    private static final metamutator.Selector _arithmeticOperatorHotSpot112 = metamutator.Selector.of(112,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.OctalUnescaper.class).id("_arithmeticOperatorHotSpot112");

    private static final metamutator.Selector _arithmeticOperatorHotSpot113 = metamutator.Selector.of(113,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.OctalUnescaper.class).id("_arithmeticOperatorHotSpot113");

    private static final metamutator.Selector _arithmeticOperatorHotSpot114 = metamutator.Selector.of(114,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.OctalUnescaper.class).id("_arithmeticOperatorHotSpot114");

    private static final metamutator.Selector _arithmeticOperatorHotSpot115 = metamutator.Selector.of(115,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.OctalUnescaper.class).id("_arithmeticOperatorHotSpot115");

    private static final metamutator.Selector _arithmeticOperatorHotSpot116 = metamutator.Selector.of(116,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.OctalUnescaper.class).id("_arithmeticOperatorHotSpot116");
}

