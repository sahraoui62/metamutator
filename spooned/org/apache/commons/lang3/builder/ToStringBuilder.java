package org.apache.commons.lang3.builder;


public class ToStringBuilder implements org.apache.commons.lang3.builder.Builder<java.lang.String> {
    private static volatile org.apache.commons.lang3.builder.ToStringStyle defaultStyle = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;

    public static org.apache.commons.lang3.builder.ToStringStyle getDefaultStyle() {
        return org.apache.commons.lang3.builder.ToStringBuilder.defaultStyle;
    }

    public static void setDefaultStyle(final org.apache.commons.lang3.builder.ToStringStyle style) {
        if (style == null) {
            throw new java.lang.IllegalArgumentException("The style must not be null");
        } 
        org.apache.commons.lang3.builder.ToStringBuilder.defaultStyle = style;
    }

    public static java.lang.String reflectionToString(final java.lang.Object object) {
        return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object);
    }

    public static java.lang.String reflectionToString(final java.lang.Object object, final org.apache.commons.lang3.builder.ToStringStyle style) {
        return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, style);
    }

    public static java.lang.String reflectionToString(final java.lang.Object object, final org.apache.commons.lang3.builder.ToStringStyle style, final boolean outputTransients) {
        return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, style, outputTransients, false, null);
    }

    public static <T>java.lang.String reflectionToString(final T object, final org.apache.commons.lang3.builder.ToStringStyle style, final boolean outputTransients, final java.lang.Class<? super T> reflectUpToClass) {
        return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, style, outputTransients, false, reflectUpToClass);
    }

    private final java.lang.StringBuffer buffer;

    private final java.lang.Object object;

    private final org.apache.commons.lang3.builder.ToStringStyle style;

    public ToStringBuilder(final java.lang.Object object) {
        this(object, null, null);
    }

    public ToStringBuilder(final java.lang.Object object ,final org.apache.commons.lang3.builder.ToStringStyle style) {
        this(object, style, null);
    }

    public ToStringBuilder(final java.lang.Object object ,org.apache.commons.lang3.builder.ToStringStyle style ,java.lang.StringBuffer buffer) {
        if (style == null) {
            style = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
        } 
        if (buffer == null) {
            buffer = new java.lang.StringBuffer(512);
        } 
        this.buffer = buffer;
        this.style = style;
        this.object = object;
        style.appendStart(buffer, object);
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final boolean value) {
        style.append(buffer, null, value);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final boolean[] array) {
        style.append(buffer, null, array, null);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final byte value) {
        style.append(buffer, null, value);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final byte[] array) {
        style.append(buffer, null, array, null);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final char value) {
        style.append(buffer, null, value);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final char[] array) {
        style.append(buffer, null, array, null);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final double value) {
        style.append(buffer, null, value);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final double[] array) {
        style.append(buffer, null, array, null);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final float value) {
        style.append(buffer, null, value);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final float[] array) {
        style.append(buffer, null, array, null);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final int value) {
        style.append(buffer, null, value);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final int[] array) {
        style.append(buffer, null, array, null);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final long value) {
        style.append(buffer, null, value);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final long[] array) {
        style.append(buffer, null, array, null);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.Object obj) {
        style.append(buffer, null, obj, null);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.Object[] array) {
        style.append(buffer, null, array, null);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final short value) {
        style.append(buffer, null, value);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final short[] array) {
        style.append(buffer, null, array, null);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final boolean value) {
        style.append(buffer, fieldName, value);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final boolean[] array) {
        style.append(buffer, fieldName, array, null);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final boolean[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final byte value) {
        style.append(buffer, fieldName, value);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final byte[] array) {
        style.append(buffer, fieldName, array, null);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final byte[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final char value) {
        style.append(buffer, fieldName, value);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final char[] array) {
        style.append(buffer, fieldName, array, null);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final char[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final double value) {
        style.append(buffer, fieldName, value);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final double[] array) {
        style.append(buffer, fieldName, array, null);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final double[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final float value) {
        style.append(buffer, fieldName, value);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final float[] array) {
        style.append(buffer, fieldName, array, null);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final float[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final int value) {
        style.append(buffer, fieldName, value);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final int[] array) {
        style.append(buffer, fieldName, array, null);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final int[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final long value) {
        style.append(buffer, fieldName, value);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final long[] array) {
        style.append(buffer, fieldName, array, null);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final long[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final java.lang.Object obj) {
        style.append(buffer, fieldName, obj, null);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final java.lang.Object obj, final boolean fullDetail) {
        style.append(buffer, fieldName, obj, java.lang.Boolean.valueOf(fullDetail));
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final java.lang.Object[] array) {
        style.append(buffer, fieldName, array, null);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final java.lang.Object[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final short value) {
        style.append(buffer, fieldName, value);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final short[] array) {
        style.append(buffer, fieldName, array, null);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final short[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder appendAsObjectToString(final java.lang.Object srcObject) {
        org.apache.commons.lang3.ObjectUtils.identityToString(getStringBuffer(), srcObject);
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder appendSuper(final java.lang.String superToString) {
        if (superToString != null) {
            style.appendSuper(buffer, superToString);
        } 
        return this;
    }

    public org.apache.commons.lang3.builder.ToStringBuilder appendToString(final java.lang.String toString) {
        if (toString != null) {
            style.appendToString(buffer, toString);
        } 
        return this;
    }

    public java.lang.Object getObject() {
        return object;
    }

    public java.lang.StringBuffer getStringBuffer() {
        return buffer;
    }

    public org.apache.commons.lang3.builder.ToStringStyle getStyle() {
        return style;
    }

    @java.lang.Override
    public java.lang.String toString() {
        if ((getObject()) == null) {
            getStringBuffer().append(getStyle().getNullText());
        } else {
            style.appendEnd(getStringBuffer(), getObject());
        }
        return getStringBuffer().toString();
    }

    @java.lang.Override
    public java.lang.String build() {
        return toString();
    }
}

