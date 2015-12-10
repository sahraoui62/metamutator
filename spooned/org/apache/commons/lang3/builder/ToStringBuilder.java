package org.apache.commons.lang3.builder;


public class ToStringBuilder implements org.apache.commons.lang3.builder.Builder<java.lang.String> {
    private static volatile org.apache.commons.lang3.builder.ToStringStyle defaultStyle = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;

    public static org.apache.commons.lang3.builder.ToStringStyle getDefaultStyle() {
        return ((_returnReplacementOperatorHotSpot400.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.ToStringBuilder.defaultStyle));
    }

    public static void setDefaultStyle(final org.apache.commons.lang3.builder.ToStringStyle style) {
        if (style == null) {
            throw new java.lang.IllegalArgumentException("The style must not be null");
        } 
        org.apache.commons.lang3.builder.ToStringBuilder.defaultStyle = style;
    }

    public static java.lang.String reflectionToString(final java.lang.Object object) {
        return ((_returnReplacementOperatorHotSpot346.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object)));
    }

    public static java.lang.String reflectionToString(final java.lang.Object object, final org.apache.commons.lang3.builder.ToStringStyle style) {
        return ((_returnReplacementOperatorHotSpot347.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, style)));
    }

    public static java.lang.String reflectionToString(final java.lang.Object object, final org.apache.commons.lang3.builder.ToStringStyle style, final boolean outputTransients) {
        return ((_returnReplacementOperatorHotSpot348.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, style, outputTransients, false, null)));
    }

    public static <T>java.lang.String reflectionToString(final T object, final org.apache.commons.lang3.builder.ToStringStyle style, final boolean outputTransients, final java.lang.Class<? super T> reflectUpToClass) {
        return ((_returnReplacementOperatorHotSpot343.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, style, outputTransients, false, reflectUpToClass)));
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
        return ((_returnReplacementOperatorHotSpot351.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final boolean[] array) {
        style.append(buffer, null, array, null);
        return ((_returnReplacementOperatorHotSpot352.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final byte value) {
        style.append(buffer, null, value);
        return ((_returnReplacementOperatorHotSpot353.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final byte[] array) {
        style.append(buffer, null, array, null);
        return ((_returnReplacementOperatorHotSpot354.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final char value) {
        style.append(buffer, null, value);
        return ((_returnReplacementOperatorHotSpot355.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final char[] array) {
        style.append(buffer, null, array, null);
        return ((_returnReplacementOperatorHotSpot356.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final double value) {
        style.append(buffer, null, value);
        return ((_returnReplacementOperatorHotSpot357.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final double[] array) {
        style.append(buffer, null, array, null);
        return ((_returnReplacementOperatorHotSpot358.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final float value) {
        style.append(buffer, null, value);
        return ((_returnReplacementOperatorHotSpot359.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final float[] array) {
        style.append(buffer, null, array, null);
        return ((_returnReplacementOperatorHotSpot360.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final int value) {
        style.append(buffer, null, value);
        return ((_returnReplacementOperatorHotSpot361.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final int[] array) {
        style.append(buffer, null, array, null);
        return ((_returnReplacementOperatorHotSpot362.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final long value) {
        style.append(buffer, null, value);
        return ((_returnReplacementOperatorHotSpot393.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final long[] array) {
        style.append(buffer, null, array, null);
        return ((_returnReplacementOperatorHotSpot394.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.Object obj) {
        style.append(buffer, null, obj, null);
        return ((_returnReplacementOperatorHotSpot363.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.Object[] array) {
        style.append(buffer, null, array, null);
        return ((_returnReplacementOperatorHotSpot364.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final short value) {
        style.append(buffer, null, value);
        return ((_returnReplacementOperatorHotSpot395.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final short[] array) {
        style.append(buffer, null, array, null);
        return ((_returnReplacementOperatorHotSpot396.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final boolean value) {
        style.append(buffer, fieldName, value);
        return ((_returnReplacementOperatorHotSpot365.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final boolean[] array) {
        style.append(buffer, fieldName, array, null);
        return ((_returnReplacementOperatorHotSpot366.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final boolean[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return ((_returnReplacementOperatorHotSpot367.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final byte value) {
        style.append(buffer, fieldName, value);
        return ((_returnReplacementOperatorHotSpot368.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final byte[] array) {
        style.append(buffer, fieldName, array, null);
        return ((_returnReplacementOperatorHotSpot369.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final byte[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return ((_returnReplacementOperatorHotSpot370.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final char value) {
        style.append(buffer, fieldName, value);
        return ((_returnReplacementOperatorHotSpot371.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final char[] array) {
        style.append(buffer, fieldName, array, null);
        return ((_returnReplacementOperatorHotSpot372.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final char[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return ((_returnReplacementOperatorHotSpot373.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final double value) {
        style.append(buffer, fieldName, value);
        return ((_returnReplacementOperatorHotSpot374.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final double[] array) {
        style.append(buffer, fieldName, array, null);
        return ((_returnReplacementOperatorHotSpot375.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final double[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return ((_returnReplacementOperatorHotSpot376.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final float value) {
        style.append(buffer, fieldName, value);
        return ((_returnReplacementOperatorHotSpot377.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final float[] array) {
        style.append(buffer, fieldName, array, null);
        return ((_returnReplacementOperatorHotSpot378.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final float[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return ((_returnReplacementOperatorHotSpot379.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final int value) {
        style.append(buffer, fieldName, value);
        return ((_returnReplacementOperatorHotSpot380.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final int[] array) {
        style.append(buffer, fieldName, array, null);
        return ((_returnReplacementOperatorHotSpot381.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final int[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return ((_returnReplacementOperatorHotSpot382.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final long value) {
        style.append(buffer, fieldName, value);
        return ((_returnReplacementOperatorHotSpot387.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final long[] array) {
        style.append(buffer, fieldName, array, null);
        return ((_returnReplacementOperatorHotSpot388.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final long[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return ((_returnReplacementOperatorHotSpot389.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final java.lang.Object obj) {
        style.append(buffer, fieldName, obj, null);
        return ((_returnReplacementOperatorHotSpot383.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final java.lang.Object obj, final boolean fullDetail) {
        style.append(buffer, fieldName, obj, java.lang.Boolean.valueOf(fullDetail));
        return ((_returnReplacementOperatorHotSpot384.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final java.lang.Object[] array) {
        style.append(buffer, fieldName, array, null);
        return ((_returnReplacementOperatorHotSpot385.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final java.lang.Object[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return ((_returnReplacementOperatorHotSpot386.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final short value) {
        style.append(buffer, fieldName, value);
        return ((_returnReplacementOperatorHotSpot390.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final short[] array) {
        style.append(buffer, fieldName, array, null);
        return ((_returnReplacementOperatorHotSpot391.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final short[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return ((_returnReplacementOperatorHotSpot392.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder appendAsObjectToString(final java.lang.Object srcObject) {
        org.apache.commons.lang3.ObjectUtils.identityToString(getStringBuffer(), srcObject);
        return ((_returnReplacementOperatorHotSpot397.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder appendSuper(final java.lang.String superToString) {
        if (superToString != null) {
            style.appendSuper(buffer, superToString);
        } 
        return ((_returnReplacementOperatorHotSpot398.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder appendToString(final java.lang.String toString) {
        if (toString != null) {
            style.appendToString(buffer, toString);
        } 
        return ((_returnReplacementOperatorHotSpot399.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public java.lang.Object getObject() {
        return ((_returnReplacementOperatorHotSpot344.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (object));
    }

    public java.lang.StringBuffer getStringBuffer() {
        return ((_returnReplacementOperatorHotSpot350.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buffer));
    }

    public org.apache.commons.lang3.builder.ToStringStyle getStyle() {
        return ((_returnReplacementOperatorHotSpot401.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (style));
    }

    @java.lang.Override
    public java.lang.String toString() {
        if ((getObject()) == null) {
            getStringBuffer().append(getStyle().getNullText());
        } else {
            style.appendEnd(getStringBuffer(), getObject());
        }
        return ((_returnReplacementOperatorHotSpot349.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (getStringBuffer().toString()));
    }

    @java.lang.Override
    public java.lang.String build() {
        return ((_returnReplacementOperatorHotSpot345.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (toString()));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot343 = metamutator.Selector.of(343,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot343");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot344 = metamutator.Selector.of(344,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot344");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot345 = metamutator.Selector.of(345,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot345");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot346 = metamutator.Selector.of(346,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot346");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot347 = metamutator.Selector.of(347,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot347");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot348 = metamutator.Selector.of(348,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot348");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot349 = metamutator.Selector.of(349,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot349");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot350 = metamutator.Selector.of(350,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot350");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot351 = metamutator.Selector.of(351,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot351");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot352 = metamutator.Selector.of(352,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot352");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot353 = metamutator.Selector.of(353,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot353");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot354 = metamutator.Selector.of(354,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot354");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot355 = metamutator.Selector.of(355,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot355");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot356 = metamutator.Selector.of(356,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot356");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot357 = metamutator.Selector.of(357,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot357");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot358 = metamutator.Selector.of(358,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot358");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot359 = metamutator.Selector.of(359,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot359");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot360 = metamutator.Selector.of(360,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot360");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot361 = metamutator.Selector.of(361,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot361");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot362 = metamutator.Selector.of(362,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot362");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot363 = metamutator.Selector.of(363,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot363");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot364 = metamutator.Selector.of(364,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot364");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot365 = metamutator.Selector.of(365,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot365");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot366 = metamutator.Selector.of(366,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot366");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot367 = metamutator.Selector.of(367,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot367");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot368 = metamutator.Selector.of(368,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot368");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot369 = metamutator.Selector.of(369,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot369");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot370 = metamutator.Selector.of(370,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot370");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot371 = metamutator.Selector.of(371,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot371");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot372 = metamutator.Selector.of(372,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot372");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot373 = metamutator.Selector.of(373,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot373");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot374 = metamutator.Selector.of(374,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot374");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot375 = metamutator.Selector.of(375,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot375");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot376 = metamutator.Selector.of(376,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot376");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot377 = metamutator.Selector.of(377,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot377");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot378 = metamutator.Selector.of(378,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot378");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot379 = metamutator.Selector.of(379,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot379");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot380 = metamutator.Selector.of(380,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot380");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot381 = metamutator.Selector.of(381,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot381");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot382 = metamutator.Selector.of(382,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot382");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot383 = metamutator.Selector.of(383,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot383");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot384 = metamutator.Selector.of(384,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot384");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot385 = metamutator.Selector.of(385,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot385");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot386 = metamutator.Selector.of(386,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot386");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot387 = metamutator.Selector.of(387,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot387");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot388 = metamutator.Selector.of(388,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot388");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot389 = metamutator.Selector.of(389,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot389");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot390 = metamutator.Selector.of(390,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot390");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot391 = metamutator.Selector.of(391,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot391");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot392 = metamutator.Selector.of(392,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot392");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot393 = metamutator.Selector.of(393,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot393");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot394 = metamutator.Selector.of(394,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot394");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot395 = metamutator.Selector.of(395,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot395");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot396 = metamutator.Selector.of(396,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot396");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot397 = metamutator.Selector.of(397,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot397");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot398 = metamutator.Selector.of(398,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot398");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot399 = metamutator.Selector.of(399,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot399");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot400 = metamutator.Selector.of(400,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot400");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot401 = metamutator.Selector.of(401,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperatorHotSpot401");
}

