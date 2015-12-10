package org.apache.commons.lang3.builder;


public class MultilineRecursiveToStringStyle extends org.apache.commons.lang3.builder.RecursiveToStringStyle {
    private static final long serialVersionUID = 1L;

    private int indent = 2;

    private int spaces = 2;

    public MultilineRecursiveToStringStyle() {
        super();
        resetIndent();
    }

    private void resetIndent() {
        setArrayStart((("{" + (org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR)) + (spacer(spaces))));
        setArraySeparator((("," + (org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR)) + (spacer(spaces))));
        setArrayEnd((((org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR) + (spacer(((spaces) - (indent))))) + "}"));
        setContentStart((("[" + (org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR)) + (spacer(spaces))));
        setFieldSeparator((("," + (org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR)) + (spacer(spaces))));
        setContentEnd((((org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR) + (spacer(((spaces) - (indent))))) + "]"));
    }

    private java.lang.StringBuilder spacer(int spaces) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0 ; i < spaces ; i++) {
            sb.append(" ");
        }
        return ((_returnReplacementOperator295.is("NULL")) ? ( null ) : (sb));
    }

    @java.lang.Override
    public void appendDetail(java.lang.StringBuffer buffer, java.lang.String fieldName, java.lang.Object value) {
        if (((!(org.apache.commons.lang3.ClassUtils.isPrimitiveWrapper(value.getClass()))) && (!(java.lang.String.class.equals(value.getClass())))) && (accept(value.getClass()))) {
            spaces += indent;
            resetIndent();
            buffer.append(org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(value, this));
            spaces -= indent;
            resetIndent();
        } else {
            super.appendDetail(buffer, fieldName, value);
        }
    }

    @java.lang.Override
    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final java.lang.Object[] array) {
        spaces += indent;
        resetIndent();
        super.appendDetail(buffer, fieldName, array);
        spaces -= indent;
        resetIndent();
    }

    @java.lang.Override
    protected void reflectionAppendArrayDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final java.lang.Object array) {
        spaces += indent;
        resetIndent();
        super.appendDetail(buffer, fieldName, array);
        spaces -= indent;
        resetIndent();
    }

    @java.lang.Override
    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final long[] array) {
        spaces += indent;
        resetIndent();
        super.appendDetail(buffer, fieldName, array);
        spaces -= indent;
        resetIndent();
    }

    @java.lang.Override
    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final int[] array) {
        spaces += indent;
        resetIndent();
        super.appendDetail(buffer, fieldName, array);
        spaces -= indent;
        resetIndent();
    }

    @java.lang.Override
    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final short[] array) {
        spaces += indent;
        resetIndent();
        super.appendDetail(buffer, fieldName, array);
        spaces -= indent;
        resetIndent();
    }

    @java.lang.Override
    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final byte[] array) {
        spaces += indent;
        resetIndent();
        super.appendDetail(buffer, fieldName, array);
        spaces -= indent;
        resetIndent();
    }

    @java.lang.Override
    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final char[] array) {
        spaces += indent;
        resetIndent();
        super.appendDetail(buffer, fieldName, array);
        spaces -= indent;
        resetIndent();
    }

    @java.lang.Override
    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final double[] array) {
        spaces += indent;
        resetIndent();
        super.appendDetail(buffer, fieldName, array);
        spaces -= indent;
        resetIndent();
    }

    @java.lang.Override
    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final float[] array) {
        spaces += indent;
        resetIndent();
        super.appendDetail(buffer, fieldName, array);
        spaces -= indent;
        resetIndent();
    }

    @java.lang.Override
    protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, final boolean[] array) {
        spaces += indent;
        resetIndent();
        super.appendDetail(buffer, fieldName, array);
        spaces -= indent;
        resetIndent();
    }

    private static final metamutator.Selector _returnReplacementOperator295 = metamutator.Selector.of(295,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle.class).id("_returnReplacementOperator295");
}

