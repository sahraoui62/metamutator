package org.apache.commons.lang3.text.translate;


public class AggregateTranslator extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
    private final org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators;

    public AggregateTranslator(final org.apache.commons.lang3.text.translate.CharSequenceTranslator... translators) {
        this.translators = org.apache.commons.lang3.ArrayUtils.clone(translators);
    }

    @java.lang.Override
    public int translate(final java.lang.CharSequence input, final int index, final java.io.Writer out) throws java.io.IOException {
        for (final org.apache.commons.lang3.text.translate.CharSequenceTranslator translator : translators) {
            final int consumed = translator.translate(input, index, out);
            if (consumed != 0) {
                return ((_returnReplacementOperator1095.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1095.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1095.is("ZERO")) ? ( 0 ) : (consumed));
            } 
        }
        return ((_returnReplacementOperator1096.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1096.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1096.is("ZERO")) ? ( 0 ) : (0));
    }

    private static final metamutator.Selector _returnReplacementOperator1095 = metamutator.Selector.of(1095,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.translate.AggregateTranslator.class).id("_returnReplacementOperator1095");

    private static final metamutator.Selector _returnReplacementOperator1096 = metamutator.Selector.of(1096,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.text.translate.AggregateTranslator.class).id("_returnReplacementOperator1096");
}

