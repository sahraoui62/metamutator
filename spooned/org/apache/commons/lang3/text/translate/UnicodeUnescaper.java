package org.apache.commons.lang3.text.translate;


public class UnicodeUnescaper extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
    @java.lang.Override
    public int translate(final java.lang.CharSequence input, final int index, final java.io.Writer out) throws java.io.IOException {
        if ((((input.charAt(index)) == '\\') && (((_arithmeticOperatorHotSpot117.is("PLUS")) ? ((index + 1)) : (_arithmeticOperatorHotSpot117.is("MINUS")) ? ((index - 1)) : (_arithmeticOperatorHotSpot117.is("MUL")) ? ((index * 1)) :  ((index / 1))) < (input.length()))) && ((input.charAt(((_arithmeticOperatorHotSpot118.is("PLUS")) ? ((index + 1)) : (_arithmeticOperatorHotSpot118.is("MINUS")) ? ((index - 1)) : (_arithmeticOperatorHotSpot118.is("MUL")) ? ((index * 1)) :  ((index / 1))))) == 'u')) {
            int i = 2;
            while ((((_arithmeticOperatorHotSpot119.is("PLUS")) ? ((index + i)) : (_arithmeticOperatorHotSpot119.is("MINUS")) ? ((index - i)) : (_arithmeticOperatorHotSpot119.is("MUL")) ? ((index * i)) :  ((index / i))) < (input.length())) && ((input.charAt(((_arithmeticOperatorHotSpot120.is("PLUS")) ? ((index + i)) : (_arithmeticOperatorHotSpot120.is("MINUS")) ? ((index - i)) : (_arithmeticOperatorHotSpot120.is("MUL")) ? ((index * i)) :  ((index / i))))) == 'u')) {
                i++;
            }
            if ((((_arithmeticOperatorHotSpot121.is("PLUS")) ? ((index + i)) : (_arithmeticOperatorHotSpot121.is("MINUS")) ? ((index - i)) : (_arithmeticOperatorHotSpot121.is("MUL")) ? ((index * i)) :  ((index / i))) < (input.length())) && ((input.charAt(((_arithmeticOperatorHotSpot122.is("PLUS")) ? ((index + i)) : (_arithmeticOperatorHotSpot122.is("MINUS")) ? ((index - i)) : (_arithmeticOperatorHotSpot122.is("MUL")) ? ((index * i)) :  ((index / i))))) == '+')) {
                i++;
            } 
            if ((((_arithmeticOperatorHotSpot123.is("PLUS")) ? ((index + i)) : (_arithmeticOperatorHotSpot123.is("MINUS")) ? ((index - i)) : (_arithmeticOperatorHotSpot123.is("MUL")) ? ((index * i)) :  ((index / i))) + 4) <= (input.length())) {
                final java.lang.CharSequence unicode = input.subSequence(((_arithmeticOperatorHotSpot124.is("PLUS")) ? ((index + i)) : (_arithmeticOperatorHotSpot124.is("MINUS")) ? ((index - i)) : (_arithmeticOperatorHotSpot124.is("MUL")) ? ((index * i)) :  ((index / i))), (((_arithmeticOperatorHotSpot125.is("PLUS")) ? ((index + i)) : (_arithmeticOperatorHotSpot125.is("MINUS")) ? ((index - i)) : (_arithmeticOperatorHotSpot125.is("MUL")) ? ((index * i)) :  ((index / i))) + 4));
                try {
                    final int value = java.lang.Integer.parseInt(unicode.toString(), 16);
                    out.write(((char)(value)));
                } catch (final java.lang.NumberFormatException nfe) {
                    throw new java.lang.IllegalArgumentException(("Unable to parse unicode value: " + unicode) , nfe);
                }
                return ((_arithmeticOperatorHotSpot126.is("PLUS")) ? (i + 4) : (_arithmeticOperatorHotSpot126.is("MINUS")) ? (i - 4) : (_arithmeticOperatorHotSpot126.is("MUL")) ? (i * 4) :  (i / 4));
            } 
            throw new java.lang.IllegalArgumentException((("Less than 4 hex digits in unicode value: '" + (input.subSequence(index, input.length()))) + "' due to end of CharSequence"));
        } 
        return 0;
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot117 = metamutator.Selector.of(117,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.UnicodeUnescaper.class).id("_arithmeticOperatorHotSpot117");

    private static final metamutator.Selector _arithmeticOperatorHotSpot118 = metamutator.Selector.of(118,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.UnicodeUnescaper.class).id("_arithmeticOperatorHotSpot118");

    private static final metamutator.Selector _arithmeticOperatorHotSpot119 = metamutator.Selector.of(119,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.UnicodeUnescaper.class).id("_arithmeticOperatorHotSpot119");

    private static final metamutator.Selector _arithmeticOperatorHotSpot120 = metamutator.Selector.of(120,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.UnicodeUnescaper.class).id("_arithmeticOperatorHotSpot120");

    private static final metamutator.Selector _arithmeticOperatorHotSpot121 = metamutator.Selector.of(121,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.UnicodeUnescaper.class).id("_arithmeticOperatorHotSpot121");

    private static final metamutator.Selector _arithmeticOperatorHotSpot122 = metamutator.Selector.of(122,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.UnicodeUnescaper.class).id("_arithmeticOperatorHotSpot122");

    private static final metamutator.Selector _arithmeticOperatorHotSpot123 = metamutator.Selector.of(123,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.UnicodeUnescaper.class).id("_arithmeticOperatorHotSpot123");

    private static final metamutator.Selector _arithmeticOperatorHotSpot124 = metamutator.Selector.of(124,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.UnicodeUnescaper.class).id("_arithmeticOperatorHotSpot124");

    private static final metamutator.Selector _arithmeticOperatorHotSpot125 = metamutator.Selector.of(125,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.UnicodeUnescaper.class).id("_arithmeticOperatorHotSpot125");

    private static final metamutator.Selector _arithmeticOperatorHotSpot126 = metamutator.Selector.of(126,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.translate.UnicodeUnescaper.class).id("_arithmeticOperatorHotSpot126");
}

