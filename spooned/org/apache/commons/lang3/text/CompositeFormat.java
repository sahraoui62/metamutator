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
        return ((_returnReplacementOperator1151.is("NULL")) ? ( null ) : (formatter.format(obj, toAppendTo, pos)));
    }

    @java.lang.Override
    public java.lang.Object parseObject(final java.lang.String source, final java.text.ParsePosition pos) {
        return ((_returnReplacementOperator1149.is("NULL")) ? ( null ) : (parser.parseObject(source, pos)));
    }

    public java.text.Format getParser() {
        return ((_returnReplacementOperator1153.is("NULL")) ? ( null ) : (this.parser));
    }

    public java.text.Format getFormatter() {
        return ((_returnReplacementOperator1152.is("NULL")) ? ( null ) : (this.formatter));
    }

    public java.lang.String reformat(final java.lang.String input) throws java.text.ParseException {
        return ((_returnReplacementOperator1150.is("NULL")) ? ( null ) : (format(parseObject(input))));
    }

    private static final metamutator.Selector _returnReplacementOperator1149 = metamutator.Selector.of(1149,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.CompositeFormat.class).id("_returnReplacementOperator1149");

    private static final metamutator.Selector _returnReplacementOperator1150 = metamutator.Selector.of(1150,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.CompositeFormat.class).id("_returnReplacementOperator1150");

    private static final metamutator.Selector _returnReplacementOperator1151 = metamutator.Selector.of(1151,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.CompositeFormat.class).id("_returnReplacementOperator1151");

    private static final metamutator.Selector _returnReplacementOperator1152 = metamutator.Selector.of(1152,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.CompositeFormat.class).id("_returnReplacementOperator1152");

    private static final metamutator.Selector _returnReplacementOperator1153 = metamutator.Selector.of(1153,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.text.CompositeFormat.class).id("_returnReplacementOperator1153");
}

