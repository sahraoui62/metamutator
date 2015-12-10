package org.apache.commons.lang3.builder;


public class ToStringBuilder implements org.apache.commons.lang3.builder.Builder<java.lang.String> {
    private static volatile org.apache.commons.lang3.builder.ToStringStyle defaultStyle = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;

    public static org.apache.commons.lang3.builder.ToStringStyle getDefaultStyle() {
        return ((_returnReplacementOperator400.is("NULL")) ? ( null ) : (org.apache.commons.lang3.builder.ToStringBuilder.defaultStyle));
    }

    public static void setDefaultStyle(final org.apache.commons.lang3.builder.ToStringStyle style) {
        if (style == null) {
            throw new java.lang.IllegalArgumentException("The style must not be null");
        } 
        org.apache.commons.lang3.builder.ToStringBuilder.defaultStyle = style;
    }

    public static java.lang.String reflectionToString(final java.lang.Object object) {
        return ((_returnReplacementOperator346.is("NULL")) ? ( null ) : (org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object)));
    }

    public static java.lang.String reflectionToString(final java.lang.Object object, final org.apache.commons.lang3.builder.ToStringStyle style) {
        return ((_returnReplacementOperator347.is("NULL")) ? ( null ) : (org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, style)));
    }

    public static java.lang.String reflectionToString(final java.lang.Object object, final org.apache.commons.lang3.builder.ToStringStyle style, final boolean outputTransients) {
        return ((_returnReplacementOperator348.is("NULL")) ? ( null ) : (org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, style, outputTransients, false, null)));
    }

    public static <T>java.lang.String reflectionToString(final T object, final org.apache.commons.lang3.builder.ToStringStyle style, final boolean outputTransients, final java.lang.Class<? super T> reflectUpToClass) {
        return ((_returnReplacementOperator343.is("NULL")) ? ( null ) : (org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, style, outputTransients, false, reflectUpToClass)));
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
        return ((_returnReplacementOperator351.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final boolean[] array) {
        style.append(buffer, null, array, null);
        return ((_returnReplacementOperator352.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final byte value) {
        style.append(buffer, null, value);
        return ((_returnReplacementOperator353.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final byte[] array) {
        style.append(buffer, null, array, null);
        return ((_returnReplacementOperator354.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final char value) {
        style.append(buffer, null, value);
        return ((_returnReplacementOperator355.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final char[] array) {
        style.append(buffer, null, array, null);
        return ((_returnReplacementOperator356.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final double value) {
        style.append(buffer, null, value);
        return ((_returnReplacementOperator357.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final double[] array) {
        style.append(buffer, null, array, null);
        return ((_returnReplacementOperator358.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final float value) {
        style.append(buffer, null, value);
        return ((_returnReplacementOperator359.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final float[] array) {
        style.append(buffer, null, array, null);
        return ((_returnReplacementOperator360.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final int value) {
        style.append(buffer, null, value);
        return ((_returnReplacementOperator361.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final int[] array) {
        style.append(buffer, null, array, null);
        return ((_returnReplacementOperator362.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final long value) {
        style.append(buffer, null, value);
        return ((_returnReplacementOperator393.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final long[] array) {
        style.append(buffer, null, array, null);
        return ((_returnReplacementOperator394.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.Object obj) {
        style.append(buffer, null, obj, null);
        return ((_returnReplacementOperator363.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.Object[] array) {
        style.append(buffer, null, array, null);
        return ((_returnReplacementOperator364.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final short value) {
        style.append(buffer, null, value);
        return ((_returnReplacementOperator395.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final short[] array) {
        style.append(buffer, null, array, null);
        return ((_returnReplacementOperator396.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final boolean value) {
        style.append(buffer, fieldName, value);
        return ((_returnReplacementOperator365.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final boolean[] array) {
        style.append(buffer, fieldName, array, null);
        return ((_returnReplacementOperator366.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final boolean[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return ((_returnReplacementOperator367.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final byte value) {
        style.append(buffer, fieldName, value);
        return ((_returnReplacementOperator368.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final byte[] array) {
        style.append(buffer, fieldName, array, null);
        return ((_returnReplacementOperator369.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final byte[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return ((_returnReplacementOperator370.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final char value) {
        style.append(buffer, fieldName, value);
        return ((_returnReplacementOperator371.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final char[] array) {
        style.append(buffer, fieldName, array, null);
        return ((_returnReplacementOperator372.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final char[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return ((_returnReplacementOperator373.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final double value) {
        style.append(buffer, fieldName, value);
        return ((_returnReplacementOperator374.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final double[] array) {
        style.append(buffer, fieldName, array, null);
        return ((_returnReplacementOperator375.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final double[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return ((_returnReplacementOperator376.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final float value) {
        style.append(buffer, fieldName, value);
        return ((_returnReplacementOperator377.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final float[] array) {
        style.append(buffer, fieldName, array, null);
        return ((_returnReplacementOperator378.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final float[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return ((_returnReplacementOperator379.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final int value) {
        style.append(buffer, fieldName, value);
        return ((_returnReplacementOperator380.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final int[] array) {
        style.append(buffer, fieldName, array, null);
        return ((_returnReplacementOperator381.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final int[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return ((_returnReplacementOperator382.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final long value) {
        style.append(buffer, fieldName, value);
        return ((_returnReplacementOperator387.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final long[] array) {
        style.append(buffer, fieldName, array, null);
        return ((_returnReplacementOperator388.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final long[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return ((_returnReplacementOperator389.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final java.lang.Object obj) {
        style.append(buffer, fieldName, obj, null);
        return ((_returnReplacementOperator383.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final java.lang.Object obj, final boolean fullDetail) {
        style.append(buffer, fieldName, obj, java.lang.Boolean.valueOf(fullDetail));
        return ((_returnReplacementOperator384.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final java.lang.Object[] array) {
        style.append(buffer, fieldName, array, null);
        return ((_returnReplacementOperator385.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final java.lang.Object[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return ((_returnReplacementOperator386.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final short value) {
        style.append(buffer, fieldName, value);
        return ((_returnReplacementOperator390.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final short[] array) {
        style.append(buffer, fieldName, array, null);
        return ((_returnReplacementOperator391.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder append(final java.lang.String fieldName, final short[] array, final boolean fullDetail) {
        style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
        return ((_returnReplacementOperator392.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder appendAsObjectToString(final java.lang.Object srcObject) {
        org.apache.commons.lang3.ObjectUtils.identityToString(getStringBuffer(), srcObject);
        return ((_returnReplacementOperator397.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder appendSuper(final java.lang.String superToString) {
        if (superToString != null) {
            style.appendSuper(buffer, superToString);
        } 
        return ((_returnReplacementOperator398.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.ToStringBuilder appendToString(final java.lang.String toString) {
        if (toString != null) {
            style.appendToString(buffer, toString);
        } 
        return ((_returnReplacementOperator399.is("NULL")) ? ( null ) : (this));
    }

    public java.lang.Object getObject() {
        return ((_returnReplacementOperator344.is("NULL")) ? ( null ) : (object));
    }

    public java.lang.StringBuffer getStringBuffer() {
        return ((_returnReplacementOperator350.is("NULL")) ? ( null ) : (buffer));
    }

    public org.apache.commons.lang3.builder.ToStringStyle getStyle() {
        return ((_returnReplacementOperator401.is("NULL")) ? ( null ) : (style));
    }

    @java.lang.Override
    public java.lang.String toString() {
        if ((getObject()) == null) {
            getStringBuffer().append(getStyle().getNullText());
        } else {
            style.appendEnd(getStringBuffer(), getObject());
        }
        return ((_returnReplacementOperator349.is("NULL")) ? ( null ) : (getStringBuffer().toString()));
    }

    @java.lang.Override
    public java.lang.String build() {
        return ((_returnReplacementOperator345.is("NULL")) ? ( null ) : (toString()));
    }

    private static final metamutator.Selector _returnReplacementOperator343 = metamutator.Selector.of(343,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator343");

    private static final metamutator.Selector _returnReplacementOperator344 = metamutator.Selector.of(344,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator344");

    private static final metamutator.Selector _returnReplacementOperator345 = metamutator.Selector.of(345,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator345");

    private static final metamutator.Selector _returnReplacementOperator346 = metamutator.Selector.of(346,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator346");

    private static final metamutator.Selector _returnReplacementOperator347 = metamutator.Selector.of(347,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator347");

    private static final metamutator.Selector _returnReplacementOperator348 = metamutator.Selector.of(348,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator348");

    private static final metamutator.Selector _returnReplacementOperator349 = metamutator.Selector.of(349,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator349");

    private static final metamutator.Selector _returnReplacementOperator350 = metamutator.Selector.of(350,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator350");

    private static final metamutator.Selector _returnReplacementOperator351 = metamutator.Selector.of(351,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator351");

    private static final metamutator.Selector _returnReplacementOperator352 = metamutator.Selector.of(352,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator352");

    private static final metamutator.Selector _returnReplacementOperator353 = metamutator.Selector.of(353,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator353");

    private static final metamutator.Selector _returnReplacementOperator354 = metamutator.Selector.of(354,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator354");

    private static final metamutator.Selector _returnReplacementOperator355 = metamutator.Selector.of(355,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator355");

    private static final metamutator.Selector _returnReplacementOperator356 = metamutator.Selector.of(356,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator356");

    private static final metamutator.Selector _returnReplacementOperator357 = metamutator.Selector.of(357,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator357");

    private static final metamutator.Selector _returnReplacementOperator358 = metamutator.Selector.of(358,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator358");

    private static final metamutator.Selector _returnReplacementOperator359 = metamutator.Selector.of(359,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator359");

    private static final metamutator.Selector _returnReplacementOperator360 = metamutator.Selector.of(360,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator360");

    private static final metamutator.Selector _returnReplacementOperator361 = metamutator.Selector.of(361,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator361");

    private static final metamutator.Selector _returnReplacementOperator362 = metamutator.Selector.of(362,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator362");

    private static final metamutator.Selector _returnReplacementOperator363 = metamutator.Selector.of(363,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator363");

    private static final metamutator.Selector _returnReplacementOperator364 = metamutator.Selector.of(364,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator364");

    private static final metamutator.Selector _returnReplacementOperator365 = metamutator.Selector.of(365,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator365");

    private static final metamutator.Selector _returnReplacementOperator366 = metamutator.Selector.of(366,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator366");

    private static final metamutator.Selector _returnReplacementOperator367 = metamutator.Selector.of(367,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator367");

    private static final metamutator.Selector _returnReplacementOperator368 = metamutator.Selector.of(368,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator368");

    private static final metamutator.Selector _returnReplacementOperator369 = metamutator.Selector.of(369,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator369");

    private static final metamutator.Selector _returnReplacementOperator370 = metamutator.Selector.of(370,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator370");

    private static final metamutator.Selector _returnReplacementOperator371 = metamutator.Selector.of(371,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator371");

    private static final metamutator.Selector _returnReplacementOperator372 = metamutator.Selector.of(372,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator372");

    private static final metamutator.Selector _returnReplacementOperator373 = metamutator.Selector.of(373,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator373");

    private static final metamutator.Selector _returnReplacementOperator374 = metamutator.Selector.of(374,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator374");

    private static final metamutator.Selector _returnReplacementOperator375 = metamutator.Selector.of(375,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator375");

    private static final metamutator.Selector _returnReplacementOperator376 = metamutator.Selector.of(376,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator376");

    private static final metamutator.Selector _returnReplacementOperator377 = metamutator.Selector.of(377,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator377");

    private static final metamutator.Selector _returnReplacementOperator378 = metamutator.Selector.of(378,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator378");

    private static final metamutator.Selector _returnReplacementOperator379 = metamutator.Selector.of(379,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator379");

    private static final metamutator.Selector _returnReplacementOperator380 = metamutator.Selector.of(380,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator380");

    private static final metamutator.Selector _returnReplacementOperator381 = metamutator.Selector.of(381,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator381");

    private static final metamutator.Selector _returnReplacementOperator382 = metamutator.Selector.of(382,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator382");

    private static final metamutator.Selector _returnReplacementOperator383 = metamutator.Selector.of(383,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator383");

    private static final metamutator.Selector _returnReplacementOperator384 = metamutator.Selector.of(384,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator384");

    private static final metamutator.Selector _returnReplacementOperator385 = metamutator.Selector.of(385,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator385");

    private static final metamutator.Selector _returnReplacementOperator386 = metamutator.Selector.of(386,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator386");

    private static final metamutator.Selector _returnReplacementOperator387 = metamutator.Selector.of(387,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator387");

    private static final metamutator.Selector _returnReplacementOperator388 = metamutator.Selector.of(388,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator388");

    private static final metamutator.Selector _returnReplacementOperator389 = metamutator.Selector.of(389,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator389");

    private static final metamutator.Selector _returnReplacementOperator390 = metamutator.Selector.of(390,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator390");

    private static final metamutator.Selector _returnReplacementOperator391 = metamutator.Selector.of(391,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator391");

    private static final metamutator.Selector _returnReplacementOperator392 = metamutator.Selector.of(392,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator392");

    private static final metamutator.Selector _returnReplacementOperator393 = metamutator.Selector.of(393,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator393");

    private static final metamutator.Selector _returnReplacementOperator394 = metamutator.Selector.of(394,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator394");

    private static final metamutator.Selector _returnReplacementOperator395 = metamutator.Selector.of(395,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator395");

    private static final metamutator.Selector _returnReplacementOperator396 = metamutator.Selector.of(396,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator396");

    private static final metamutator.Selector _returnReplacementOperator397 = metamutator.Selector.of(397,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator397");

    private static final metamutator.Selector _returnReplacementOperator398 = metamutator.Selector.of(398,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator398");

    private static final metamutator.Selector _returnReplacementOperator399 = metamutator.Selector.of(399,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator399");

    private static final metamutator.Selector _returnReplacementOperator400 = metamutator.Selector.of(400,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator400");

    private static final metamutator.Selector _returnReplacementOperator401 = metamutator.Selector.of(401,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ToStringBuilder.class).id("_returnReplacementOperator401");
}

