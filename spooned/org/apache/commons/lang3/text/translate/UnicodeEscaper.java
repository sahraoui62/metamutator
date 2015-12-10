package org.apache.commons.lang3.text.translate;


public class UnicodeEscaper extends org.apache.commons.lang3.text.translate.CodePointTranslator {
    private final int below;

    private final int above;

    private final boolean between;

    public UnicodeEscaper() {
        this(0, java.lang.Integer.MAX_VALUE, true);
    }

    protected UnicodeEscaper(final int below ,final int above ,final boolean between) {
        this.below = below;
        this.above = above;
        this.between = between;
    }

    public static org.apache.commons.lang3.text.translate.UnicodeEscaper below(final int codepoint) {
        return ((_returnReplacementOperator1142.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(codepoint, java.lang.Integer.MAX_VALUE)));
    }

    public static org.apache.commons.lang3.text.translate.UnicodeEscaper above(final int codepoint) {
        return ((_returnReplacementOperator1141.is("NULL")) ? ( null ) : (org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, codepoint)));
    }

    public static org.apache.commons.lang3.text.translate.UnicodeEscaper outsideOf(final int codepointLow, final int codepointHigh) {
        return ((_returnReplacementOperator1144.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.text.translate.UnicodeEscaper(codepointLow , codepointHigh , false)));
    }

    public static org.apache.commons.lang3.text.translate.UnicodeEscaper between(final int codepointLow, final int codepointHigh) {
        return ((_returnReplacementOperator1143.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.text.translate.UnicodeEscaper(codepointLow , codepointHigh , true)));
    }

    @java.lang.Override
    public boolean translate(final int codepoint, final java.io.Writer out) throws java.io.IOException {
        if (between) {
            if ((codepoint < (below)) || (codepoint > (above))) {
                return ((_returnReplacementOperator1137.is("NULL")) ? ( null ) : (false));
            } 
        } else {
            if ((codepoint >= (below)) && (codepoint <= (above))) {
                return ((_returnReplacementOperator1138.is("NULL")) ? ( null ) : (false));
            } 
        }
        if (codepoint > 65535) {
            out.write(toUtf16Escape(codepoint));
        } else {
            out.write("\\u");
            out.write(org.apache.commons.lang3.text.translate.CharSequenceTranslator.HEX_DIGITS[((codepoint >> 12) & 15)]);
            out.write(org.apache.commons.lang3.text.translate.CharSequenceTranslator.HEX_DIGITS[((codepoint >> 8) & 15)]);
            out.write(org.apache.commons.lang3.text.translate.CharSequenceTranslator.HEX_DIGITS[((codepoint >> 4) & 15)]);
            out.write(org.apache.commons.lang3.text.translate.CharSequenceTranslator.HEX_DIGITS[(codepoint & 15)]);
        }
        return ((_returnReplacementOperator1139.is("NULL")) ? ( null ) : (true));
    }

    protected java.lang.String toUtf16Escape(final int codepoint) {
        return ((_returnReplacementOperator1140.is("NULL")) ? ( null ) : ("\\u" + (org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(codepoint))));
    }

    private static final metamutator.Selector _returnReplacementOperator1137 = metamutator.Selector.of(1137,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.translate.UnicodeEscaper.class).id("_returnReplacementOperator1137");

    private static final metamutator.Selector _returnReplacementOperator1138 = metamutator.Selector.of(1138,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.translate.UnicodeEscaper.class).id("_returnReplacementOperator1138");

    private static final metamutator.Selector _returnReplacementOperator1139 = metamutator.Selector.of(1139,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.translate.UnicodeEscaper.class).id("_returnReplacementOperator1139");

    private static final metamutator.Selector _returnReplacementOperator1140 = metamutator.Selector.of(1140,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.translate.UnicodeEscaper.class).id("_returnReplacementOperator1140");

    private static final metamutator.Selector _returnReplacementOperator1141 = metamutator.Selector.of(1141,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.translate.UnicodeEscaper.class).id("_returnReplacementOperator1141");

    private static final metamutator.Selector _returnReplacementOperator1142 = metamutator.Selector.of(1142,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.translate.UnicodeEscaper.class).id("_returnReplacementOperator1142");

    private static final metamutator.Selector _returnReplacementOperator1143 = metamutator.Selector.of(1143,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.translate.UnicodeEscaper.class).id("_returnReplacementOperator1143");

    private static final metamutator.Selector _returnReplacementOperator1144 = metamutator.Selector.of(1144,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.translate.UnicodeEscaper.class).id("_returnReplacementOperator1144");
}

