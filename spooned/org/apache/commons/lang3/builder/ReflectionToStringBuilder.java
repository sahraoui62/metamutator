package org.apache.commons.lang3.builder;


public class ReflectionToStringBuilder extends org.apache.commons.lang3.builder.ToStringBuilder {
    public static java.lang.String toString(final java.lang.Object object) {
        return ((_returnReplacementOperatorHotSpot311.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, null, false, false, null)));
    }

    public static java.lang.String toString(final java.lang.Object object, final org.apache.commons.lang3.builder.ToStringStyle style) {
        return ((_returnReplacementOperatorHotSpot312.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, style, false, false, null)));
    }

    public static java.lang.String toString(final java.lang.Object object, final org.apache.commons.lang3.builder.ToStringStyle style, final boolean outputTransients) {
        return ((_returnReplacementOperatorHotSpot313.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, style, outputTransients, false, null)));
    }

    public static java.lang.String toString(final java.lang.Object object, final org.apache.commons.lang3.builder.ToStringStyle style, final boolean outputTransients, final boolean outputStatics) {
        return ((_returnReplacementOperatorHotSpot314.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, style, outputTransients, outputStatics, null)));
    }

    public static <T>java.lang.String toString(final T object, final org.apache.commons.lang3.builder.ToStringStyle style, final boolean outputTransients, final boolean outputStatics, final java.lang.Class<? super T> reflectUpToClass) {
        return ((_returnReplacementOperatorHotSpot297.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.builder.ReflectionToStringBuilder(object , style , null , reflectUpToClass , outputTransients , outputStatics).toString()));
    }

    public static java.lang.String toStringExclude(final java.lang.Object object, final java.util.Collection<java.lang.String> excludeFieldNames) {
        return ((_returnReplacementOperatorHotSpot316.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(object, org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(excludeFieldNames))));
    }

    static java.lang.String[] toNoNullStringArray(final java.util.Collection<java.lang.String> collection) {
        if (collection == null) {
            return ((_returnReplacementOperatorHotSpot319.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY));
        } 
        return ((_returnReplacementOperatorHotSpot320.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(collection.toArray())));
    }

    static java.lang.String[] toNoNullStringArray(final java.lang.Object[] array) {
        final java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>(array.length);
        for (final java.lang.Object e : array) {
            if (e != null) {
                list.add(e.toString());
            } 
        }
        return ((_returnReplacementOperatorHotSpot318.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (list.toArray(new java.lang.String[list.size()])));
    }

    public static java.lang.String toStringExclude(final java.lang.Object object, final java.lang.String... excludeFieldNames) {
        return ((_returnReplacementOperatorHotSpot315.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.builder.ReflectionToStringBuilder(object).setExcludeFieldNames(excludeFieldNames).toString()));
    }

    private static java.lang.Object checkNotNull(final java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("The Object passed in should not be null.");
        } 
        return ((_returnReplacementOperatorHotSpot307.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (obj));
    }

    private boolean appendStatics = false;

    private boolean appendTransients = false;

    protected java.lang.String[] excludeFieldNames;

    private java.lang.Class<?> upToClass = null;

    public ReflectionToStringBuilder(final java.lang.Object object) {
        super(org.apache.commons.lang3.builder.ReflectionToStringBuilder.checkNotNull(object));
    }

    public ReflectionToStringBuilder(final java.lang.Object object ,final org.apache.commons.lang3.builder.ToStringStyle style) {
        super(org.apache.commons.lang3.builder.ReflectionToStringBuilder.checkNotNull(object), style);
    }

    public ReflectionToStringBuilder(final java.lang.Object object ,final org.apache.commons.lang3.builder.ToStringStyle style ,final java.lang.StringBuffer buffer) {
        super(org.apache.commons.lang3.builder.ReflectionToStringBuilder.checkNotNull(object), style, buffer);
    }

    public <T>ReflectionToStringBuilder(final T object ,final org.apache.commons.lang3.builder.ToStringStyle style ,final java.lang.StringBuffer buffer ,final java.lang.Class<? super T> reflectUpToClass ,final boolean outputTransients ,final boolean outputStatics) {
        super(org.apache.commons.lang3.builder.ReflectionToStringBuilder.checkNotNull(object), style, buffer);
        setUpToClass(reflectUpToClass);
        setAppendTransients(outputTransients);
        setAppendStatics(outputStatics);
    }

    protected boolean accept(final java.lang.reflect.Field field) {
        if ((field.getName().indexOf(org.apache.commons.lang3.ClassUtils.INNER_CLASS_SEPARATOR_CHAR)) != (-1)) {
            return ((_returnReplacementOperatorHotSpot298.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if ((java.lang.reflect.Modifier.isTransient(field.getModifiers())) && (!(isAppendTransients()))) {
            return ((_returnReplacementOperatorHotSpot299.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if ((java.lang.reflect.Modifier.isStatic(field.getModifiers())) && (!(isAppendStatics()))) {
            return ((_returnReplacementOperatorHotSpot300.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if (((this.excludeFieldNames) != null) && ((java.util.Arrays.binarySearch(this.excludeFieldNames, field.getName())) >= 0)) {
            return ((_returnReplacementOperatorHotSpot301.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if (field.isAnnotationPresent(org.apache.commons.lang3.builder.ToStringExclude.class)) {
            return ((_returnReplacementOperatorHotSpot302.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperatorHotSpot303.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    protected void appendFieldsIn(final java.lang.Class<?> clazz) {
        if (clazz.isArray()) {
            reflectionAppendArray(getObject());
            return ;
        } 
        final java.lang.reflect.Field[] fields = clazz.getDeclaredFields();
        java.lang.reflect.AccessibleObject.setAccessible(fields, true);
        for (final java.lang.reflect.Field field : fields) {
            final java.lang.String fieldName = field.getName();
            if (accept(field)) {
                try {
                    final java.lang.Object fieldValue = getValue(field);
                    append(fieldName, fieldValue);
                } catch (final java.lang.IllegalAccessException ex) {
                    throw new java.lang.InternalError(("Unexpected IllegalAccessException: " + (ex.getMessage())));
                }
            } 
        }
    }

    public java.lang.String[] getExcludeFieldNames() {
        return ((_returnReplacementOperatorHotSpot317.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this.excludeFieldNames.clone()));
    }

    public java.lang.Class<?> getUpToClass() {
        return ((_returnReplacementOperatorHotSpot306.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this.upToClass));
    }

    protected java.lang.Object getValue(final java.lang.reflect.Field field) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        return ((_returnReplacementOperatorHotSpot308.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (field.get(getObject())));
    }

    public boolean isAppendStatics() {
        return ((_returnReplacementOperatorHotSpot304.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this.appendStatics));
    }

    public boolean isAppendTransients() {
        return ((_returnReplacementOperatorHotSpot305.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this.appendTransients));
    }

    public org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionAppendArray(final java.lang.Object array) {
        getStyle().reflectionAppendArrayDetail(getStringBuffer(), null, array);
        return ((_returnReplacementOperatorHotSpot321.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public void setAppendStatics(final boolean appendStatics) {
        this.appendStatics = appendStatics;
    }

    public void setAppendTransients(final boolean appendTransients) {
        this.appendTransients = appendTransients;
    }

    public org.apache.commons.lang3.builder.ReflectionToStringBuilder setExcludeFieldNames(final java.lang.String... excludeFieldNamesParam) {
        if (excludeFieldNamesParam == null) {
            this.excludeFieldNames = null;
        } else {
            this.excludeFieldNames = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(excludeFieldNamesParam);
            java.util.Arrays.sort(this.excludeFieldNames);
        }
        return ((_returnReplacementOperatorHotSpot322.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public void setUpToClass(final java.lang.Class<?> clazz) {
        if (clazz != null) {
            final java.lang.Object object = getObject();
            if ((object != null) && ((clazz.isInstance(object)) == false)) {
                throw new java.lang.IllegalArgumentException("Specified class is not a superclass of the object");
            } 
        } 
        this.upToClass = clazz;
    }

    @java.lang.Override
    public java.lang.String toString() {
        if ((getObject()) == null) {
            return ((_returnReplacementOperatorHotSpot309.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (getStyle().getNullText()));
        } 
        java.lang.Class<?> clazz = getObject().getClass();
        appendFieldsIn(clazz);
        while (((clazz.getSuperclass()) != null) && (clazz != (getUpToClass()))) {
            clazz = clazz.getSuperclass();
            appendFieldsIn(clazz);
        }
        return ((_returnReplacementOperatorHotSpot310.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (super.toString()));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot297 = metamutator.Selector.of(297,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot297");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot298 = metamutator.Selector.of(298,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot298");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot299 = metamutator.Selector.of(299,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot299");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot300 = metamutator.Selector.of(300,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot300");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot301 = metamutator.Selector.of(301,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot301");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot302 = metamutator.Selector.of(302,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot302");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot303 = metamutator.Selector.of(303,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot303");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot304 = metamutator.Selector.of(304,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot304");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot305 = metamutator.Selector.of(305,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot305");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot306 = metamutator.Selector.of(306,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot306");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot307 = metamutator.Selector.of(307,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot307");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot308 = metamutator.Selector.of(308,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot308");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot309 = metamutator.Selector.of(309,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot309");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot310 = metamutator.Selector.of(310,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot310");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot311 = metamutator.Selector.of(311,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot311");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot312 = metamutator.Selector.of(312,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot312");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot313 = metamutator.Selector.of(313,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot313");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot314 = metamutator.Selector.of(314,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot314");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot315 = metamutator.Selector.of(315,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot315");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot316 = metamutator.Selector.of(316,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot316");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot317 = metamutator.Selector.of(317,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot317");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot318 = metamutator.Selector.of(318,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot318");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot319 = metamutator.Selector.of(319,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot319");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot320 = metamutator.Selector.of(320,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot320");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot321 = metamutator.Selector.of(321,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot321");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot322 = metamutator.Selector.of(322,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperatorHotSpot322");
}

