package org.apache.commons.lang3.text.translate;


public class UnicodeUnpairedSurrogateRemover extends org.apache.commons.lang3.text.translate.CodePointTranslator {
    @java.lang.Override
    public boolean translate(final int codepoint, final java.io.Writer out) throws java.io.IOException {
        if ((codepoint >= (java.lang.Character.MIN_SURROGATE)) && (codepoint <= (java.lang.Character.MAX_SURROGATE))) {
            return ((_returnReplacementOperator1147.is("NULL")) ? ( null ) : (true));
        } 
        return ((_returnReplacementOperator1148.is("NULL")) ? ( null ) : (false));
    }

    private static final metamutator.Selector _returnReplacementOperator1147 = metamutator.Selector.of(1147,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover.class).id("_returnReplacementOperator1147");

    private static final metamutator.Selector _returnReplacementOperator1148 = metamutator.Selector.of(1148,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover.class).id("_returnReplacementOperator1148");
}

