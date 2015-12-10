package org.apache.commons.lang3.text;


public class FormattableUtils {
    private static final java.lang.String SIMPLEST_FORMAT = "%s";

    public FormattableUtils() {
        super();
    }

    public static java.lang.String toString(final java.util.Formattable formattable) {
        return java.lang.String.format(SIMPLEST_FORMAT, formattable);
    }

    public static java.util.Formatter append(final java.lang.CharSequence seq, final java.util.Formatter formatter, final int flags, final int width, final int precision) {
        return org.apache.commons.lang3.text.FormattableUtils.append(seq, formatter, flags, width, precision, ' ', null);
    }

    public static java.util.Formatter append(final java.lang.CharSequence seq, final java.util.Formatter formatter, final int flags, final int width, final int precision, final char padChar) {
        return org.apache.commons.lang3.text.FormattableUtils.append(seq, formatter, flags, width, precision, padChar, null);
    }

    public static java.util.Formatter append(final java.lang.CharSequence seq, final java.util.Formatter formatter, final int flags, final int width, final int precision, final java.lang.CharSequence ellipsis) {
        return org.apache.commons.lang3.text.FormattableUtils.append(seq, formatter, flags, width, precision, ' ', ellipsis);
    }

    public static java.util.Formatter append(final java.lang.CharSequence seq, final java.util.Formatter formatter, final int flags, final int width, final int precision, final char padChar, final java.lang.CharSequence ellipsis) {
        org.apache.commons.lang3.Validate.isTrue((((ellipsis == null) || (precision < 0)) || ((ellipsis.length()) <= precision)), "Specified ellipsis '%1$s' exceeds precision of %2$s", ellipsis, java.lang.Integer.valueOf(precision));
        final java.lang.StringBuilder buf = new java.lang.StringBuilder(seq);
        if ((precision >= 0) && (precision < (seq.length()))) {
            final java.lang.CharSequence _ellipsis = org.apache.commons.lang3.ObjectUtils.defaultIfNull(ellipsis, org.apache.commons.lang3.StringUtils.EMPTY);
            buf.replace(((_arithmeticOperatorHotSpot134.is("PLUS")) ? ((precision + (_ellipsis.length()))) : (_arithmeticOperatorHotSpot134.is("MINUS")) ? ((precision - (_ellipsis.length()))) : (_arithmeticOperatorHotSpot134.is("MUL")) ? ((precision * (_ellipsis.length()))) :  ((precision / (_ellipsis.length())))), seq.length(), _ellipsis.toString());
        } 
        final boolean leftJustify = (flags & (java.util.FormattableFlags.LEFT_JUSTIFY)) == (java.util.FormattableFlags.LEFT_JUSTIFY);
        for (int i = buf.length() ; i < width ; i++) {
            buf.insert((leftJustify ? i : 0), padChar);
        }
        formatter.format(buf.toString());
        return formatter;
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot134 = metamutator.Selector.of(134,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.FormattableUtils.class).id("_arithmeticOperatorHotSpot134");
}

