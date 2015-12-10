package org.apache.commons.lang3.text.translate;


public class UnicodeUnpairedSurrogateRemover extends org.apache.commons.lang3.text.translate.CodePointTranslator {
    @java.lang.Override
    public boolean translate(final int codepoint, final java.io.Writer out) throws java.io.IOException {
        if ((codepoint >= (java.lang.Character.MIN_SURROGATE)) && (codepoint <= (java.lang.Character.MAX_SURROGATE))) {
            return true;
        } 
        return false;
    }
}

