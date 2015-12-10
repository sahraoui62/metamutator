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
            return ((_returnReplacementOperator1135.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1135.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1135.is("ZERO")) ? ( 0 ) : (1 + (builder.length())));
        } 
        return ((_returnReplacementOperator1136.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1136.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1136.is("ZERO")) ? ( 0 ) : (0));
    }

    private boolean isOctalDigit(final char ch) {
        return ((_returnReplacementOperator1133.is("NULL")) ? ( null ) : ((ch >= '0') && (ch <= '7')));
    }

    private boolean isZeroToThree(final char ch) {
        return ((_returnReplacementOperator1134.is("NULL")) ? ( null ) : ((ch >= '0') && (ch <= '3')));
    }

    private static final metamutator.Selector _returnReplacementOperator1133 = metamutator.Selector.of(1133,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.translate.OctalUnescaper.class).id("_returnReplacementOperator1133");

    private static final metamutator.Selector _returnReplacementOperator1134 = metamutator.Selector.of(1134,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.translate.OctalUnescaper.class).id("_returnReplacementOperator1134");

    private static final metamutator.Selector _returnReplacementOperator1135 = metamutator.Selector.of(1135,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.translate.OctalUnescaper.class).id("_returnReplacementOperator1135");

    private static final metamutator.Selector _returnReplacementOperator1136 = metamutator.Selector.of(1136,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.translate.OctalUnescaper.class).id("_returnReplacementOperator1136");
}

