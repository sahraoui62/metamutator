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
                return consumed;
            } 
        }
        return 0;
    }
}

