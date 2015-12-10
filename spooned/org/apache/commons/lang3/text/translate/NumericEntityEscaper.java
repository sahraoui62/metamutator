package org.apache.commons.lang3.text.translate;


public class NumericEntityEscaper extends org.apache.commons.lang3.text.translate.CodePointTranslator {
    private final int below;

    private final int above;

    private final boolean between;

    private NumericEntityEscaper(final int below ,final int above ,final boolean between) {
        this.below = below;
        this.above = above;
        this.between = between;
    }

    public NumericEntityEscaper() {
        this(0, java.lang.Integer.MAX_VALUE, true);
    }

    public static org.apache.commons.lang3.text.translate.NumericEntityEscaper below(final int codepoint) {
        return org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(codepoint, java.lang.Integer.MAX_VALUE);
    }

    public static org.apache.commons.lang3.text.translate.NumericEntityEscaper above(final int codepoint) {
        return org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, codepoint);
    }

    public static org.apache.commons.lang3.text.translate.NumericEntityEscaper between(final int codepointLow, final int codepointHigh) {
        return new org.apache.commons.lang3.text.translate.NumericEntityEscaper(codepointLow , codepointHigh , true);
    }

    public static org.apache.commons.lang3.text.translate.NumericEntityEscaper outsideOf(final int codepointLow, final int codepointHigh) {
        return new org.apache.commons.lang3.text.translate.NumericEntityEscaper(codepointLow , codepointHigh , false);
    }

    @java.lang.Override
    public boolean translate(final int codepoint, final java.io.Writer out) throws java.io.IOException {
        if (between) {
            if ((codepoint < (below)) || (codepoint > (above))) {
                return false;
            } 
        } else {
            if ((codepoint >= (below)) && (codepoint <= (above))) {
                return false;
            } 
        }
        out.write("&#");
        out.write(java.lang.Integer.toString(codepoint, 10));
        out.write(';');
        return true;
    }
}

