package org.apache.commons.lang3.text;


public class CompositeFormat extends java.text.Format {
    private static final long serialVersionUID = -4329119827877627683L;

    private final java.text.Format parser;

    private final java.text.Format formatter;

    public CompositeFormat(final java.text.Format parser ,final java.text.Format formatter) {
        this.parser = parser;
        this.formatter = formatter;
    }

    @java.lang.Override
    public java.lang.StringBuffer format(final java.lang.Object obj, final java.lang.StringBuffer toAppendTo, final java.text.FieldPosition pos) {
        return formatter.format(obj, toAppendTo, pos);
    }

    @java.lang.Override
    public java.lang.Object parseObject(final java.lang.String source, final java.text.ParsePosition pos) {
        return parser.parseObject(source, pos);
    }

    public java.text.Format getParser() {
        return this.parser;
    }

    public java.text.Format getFormatter() {
        return this.formatter;
    }

    public java.lang.String reformat(final java.lang.String input) throws java.text.ParseException {
        return format(parseObject(input));
    }
}

