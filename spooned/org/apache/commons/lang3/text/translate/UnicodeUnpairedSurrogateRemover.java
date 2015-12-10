package org.apache.commons.lang3.text.translate;


public class UnicodeUnpairedSurrogateRemover extends org.apache.commons.lang3.text.translate.CodePointTranslator {
    @java.lang.Override
    public boolean translate(final int codepoint, final java.io.Writer out) throws java.io.IOException {
        if ((codepoint >= (java.lang.Character.MIN_SURROGATE)) && (codepoint <= (java.lang.Character.MAX_SURROGATE))) {
            return ((_returnReplacementOperatorHotSpot1147.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        return ((_returnReplacementOperatorHotSpot1148.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1147 = metamutator.Selector.of(1147,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover.class).id("_returnReplacementOperatorHotSpot1147");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1148 = metamutator.Selector.of(1148,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover.class).id("_returnReplacementOperatorHotSpot1148");
}

