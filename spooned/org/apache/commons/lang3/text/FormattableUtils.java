package org.apache.commons.lang3.text;


public class FormattableUtils {
    private static final java.lang.String SIMPLEST_FORMAT = "%s";

    public FormattableUtils() {
        super();
    }

    public static java.lang.String toString(final java.util.Formattable formattable) {
        return ((_returnReplacementOperatorHotSpot1174.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.String.format(org.apache.commons.lang3.text.FormattableUtils.SIMPLEST_FORMAT, formattable)));
    }

    public static java.util.Formatter append(final java.lang.CharSequence seq, final java.util.Formatter formatter, final int flags, final int width, final int precision) {
        return ((_returnReplacementOperatorHotSpot1175.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.FormattableUtils.append(seq, formatter, flags, width, precision, ' ', null)));
    }

    public static java.util.Formatter append(final java.lang.CharSequence seq, final java.util.Formatter formatter, final int flags, final int width, final int precision, final char padChar) {
        return ((_returnReplacementOperatorHotSpot1176.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.FormattableUtils.append(seq, formatter, flags, width, precision, padChar, null)));
    }

    public static java.util.Formatter append(final java.lang.CharSequence seq, final java.util.Formatter formatter, final int flags, final int width, final int precision, final java.lang.CharSequence ellipsis) {
        return ((_returnReplacementOperatorHotSpot1178.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.FormattableUtils.append(seq, formatter, flags, width, precision, ' ', ellipsis)));
    }

    public static java.util.Formatter append(final java.lang.CharSequence seq, final java.util.Formatter formatter, final int flags, final int width, final int precision, final char padChar, final java.lang.CharSequence ellipsis) {
        org.apache.commons.lang3.Validate.isTrue((((ellipsis == null) || (precision < 0)) || ((ellipsis.length()) <= precision)), "Specified ellipsis '%1$s' exceeds precision of %2$s", ellipsis, java.lang.Integer.valueOf(precision));
        final java.lang.StringBuilder buf = new java.lang.StringBuilder(seq);
        if ((precision >= 0) && (precision < (seq.length()))) {
            final java.lang.CharSequence _ellipsis = org.apache.commons.lang3.ObjectUtils.defaultIfNull(ellipsis, org.apache.commons.lang3.StringUtils.EMPTY);
            buf.replace((precision - (_ellipsis.length())), seq.length(), _ellipsis.toString());
        } 
        final boolean leftJustify = (flags & (java.util.FormattableFlags.LEFT_JUSTIFY)) == (java.util.FormattableFlags.LEFT_JUSTIFY);
        for (int i = buf.length() ; i < width ; i++) {
            buf.insert((leftJustify ? i : 0), padChar);
        }
        formatter.format(buf.toString());
        return ((_returnReplacementOperatorHotSpot1177.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (formatter));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1174 = metamutator.Selector.of(1174,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.FormattableUtils.class).id("_returnReplacementOperatorHotSpot1174");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1175 = metamutator.Selector.of(1175,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.FormattableUtils.class).id("_returnReplacementOperatorHotSpot1175");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1176 = metamutator.Selector.of(1176,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.FormattableUtils.class).id("_returnReplacementOperatorHotSpot1176");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1177 = metamutator.Selector.of(1177,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.FormattableUtils.class).id("_returnReplacementOperatorHotSpot1177");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1178 = metamutator.Selector.of(1178,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.FormattableUtils.class).id("_returnReplacementOperatorHotSpot1178");
}

