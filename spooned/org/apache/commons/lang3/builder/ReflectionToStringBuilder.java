package org.apache.commons.lang3.builder;


public class ReflectionToStringBuilder extends org.apache.commons.lang3.builder.ToStringBuilder {
    public static java.lang.String toString(final java.lang.Object object) {
        return ((_returnReplacementOperator311.is("NULL")) ? ( null ) : (org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, null, false, false, null)));
    }

    public static java.lang.String toString(final java.lang.Object object, final org.apache.commons.lang3.builder.ToStringStyle style) {
        return ((_returnReplacementOperator312.is("NULL")) ? ( null ) : (org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, style, false, false, null)));
    }

    public static java.lang.String toString(final java.lang.Object object, final org.apache.commons.lang3.builder.ToStringStyle style, final boolean outputTransients) {
        return ((_returnReplacementOperator313.is("NULL")) ? ( null ) : (org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, style, outputTransients, false, null)));
    }

    public static java.lang.String toString(final java.lang.Object object, final org.apache.commons.lang3.builder.ToStringStyle style, final boolean outputTransients, final boolean outputStatics) {
        return ((_returnReplacementOperator314.is("NULL")) ? ( null ) : (org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, style, outputTransients, outputStatics, null)));
    }

    public static <T>java.lang.String toString(final T object, final org.apache.commons.lang3.builder.ToStringStyle style, final boolean outputTransients, final boolean outputStatics, final java.lang.Class<? super T> reflectUpToClass) {
        return ((_returnReplacementOperator297.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.builder.ReflectionToStringBuilder(object , style , null , reflectUpToClass , outputTransients , outputStatics).toString()));
    }

    public static java.lang.String toStringExclude(final java.lang.Object object, final java.util.Collection<java.lang.String> excludeFieldNames) {
        return ((_returnReplacementOperator316.is("NULL")) ? ( null ) : (org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(object, org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(excludeFieldNames))));
    }

    static java.lang.String[] toNoNullStringArray(final java.util.Collection<java.lang.String> collection) {
        if (collection == null) {
            return ((_returnReplacementOperator319.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY));
        } 
        return ((_returnReplacementOperator320.is("NULL")) ? ( null ) : (org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(collection.toArray())));
    }

    static java.lang.String[] toNoNullStringArray(final java.lang.Object[] array) {
        final java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>(array.length);
        for (final java.lang.Object e : array) {
            if (e != null) {
                list.add(e.toString());
            } 
        }
        return ((_returnReplacementOperator318.is("NULL")) ? ( null ) : (list.toArray(new java.lang.String[list.size()])));
    }

    public static java.lang.String toStringExclude(final java.lang.Object object, final java.lang.String... excludeFieldNames) {
        return ((_returnReplacementOperator315.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.builder.ReflectionToStringBuilder(object).setExcludeFieldNames(excludeFieldNames).toString()));
    }

    private static java.lang.Object checkNotNull(final java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("The Object passed in should not be null.");
        } 
        return ((_returnReplacementOperator307.is("NULL")) ? ( null ) : (obj));
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
            return ((_returnReplacementOperator298.is("NULL")) ? ( null ) : (false));
        } 
        if ((java.lang.reflect.Modifier.isTransient(field.getModifiers())) && (!(isAppendTransients()))) {
            return ((_returnReplacementOperator299.is("NULL")) ? ( null ) : (false));
        } 
        if ((java.lang.reflect.Modifier.isStatic(field.getModifiers())) && (!(isAppendStatics()))) {
            return ((_returnReplacementOperator300.is("NULL")) ? ( null ) : (false));
        } 
        if (((this.excludeFieldNames) != null) && ((java.util.Arrays.binarySearch(this.excludeFieldNames, field.getName())) >= 0)) {
            return ((_returnReplacementOperator301.is("NULL")) ? ( null ) : (false));
        } 
        if (field.isAnnotationPresent(org.apache.commons.lang3.builder.ToStringExclude.class)) {
            return ((_returnReplacementOperator302.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator303.is("NULL")) ? ( null ) : (true));
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
        return ((_returnReplacementOperator317.is("NULL")) ? ( null ) : (this.excludeFieldNames.clone()));
    }

    public java.lang.Class<?> getUpToClass() {
        return ((_returnReplacementOperator306.is("NULL")) ? ( null ) : (this.upToClass));
    }

    protected java.lang.Object getValue(final java.lang.reflect.Field field) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        return ((_returnReplacementOperator308.is("NULL")) ? ( null ) : (field.get(getObject())));
    }

    public boolean isAppendStatics() {
        return ((_returnReplacementOperator304.is("NULL")) ? ( null ) : (this.appendStatics));
    }

    public boolean isAppendTransients() {
        return ((_returnReplacementOperator305.is("NULL")) ? ( null ) : (this.appendTransients));
    }

    public org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionAppendArray(final java.lang.Object array) {
        getStyle().reflectionAppendArrayDetail(getStringBuffer(), null, array);
        return ((_returnReplacementOperator321.is("NULL")) ? ( null ) : (this));
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
        return ((_returnReplacementOperator322.is("NULL")) ? ( null ) : (this));
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
            return ((_returnReplacementOperator309.is("NULL")) ? ( null ) : (getStyle().getNullText()));
        } 
        java.lang.Class<?> clazz = getObject().getClass();
        appendFieldsIn(clazz);
        while (((clazz.getSuperclass()) != null) && (clazz != (getUpToClass()))) {
            clazz = clazz.getSuperclass();
            appendFieldsIn(clazz);
        }
        return ((_returnReplacementOperator310.is("NULL")) ? ( null ) : (super.toString()));
    }

    private static final metamutator.Selector _returnReplacementOperator297 = metamutator.Selector.of(297,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator297");

    private static final metamutator.Selector _returnReplacementOperator298 = metamutator.Selector.of(298,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator298");

    private static final metamutator.Selector _returnReplacementOperator299 = metamutator.Selector.of(299,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator299");

    private static final metamutator.Selector _returnReplacementOperator300 = metamutator.Selector.of(300,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator300");

    private static final metamutator.Selector _returnReplacementOperator301 = metamutator.Selector.of(301,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator301");

    private static final metamutator.Selector _returnReplacementOperator302 = metamutator.Selector.of(302,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator302");

    private static final metamutator.Selector _returnReplacementOperator303 = metamutator.Selector.of(303,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator303");

    private static final metamutator.Selector _returnReplacementOperator304 = metamutator.Selector.of(304,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator304");

    private static final metamutator.Selector _returnReplacementOperator305 = metamutator.Selector.of(305,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator305");

    private static final metamutator.Selector _returnReplacementOperator306 = metamutator.Selector.of(306,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator306");

    private static final metamutator.Selector _returnReplacementOperator307 = metamutator.Selector.of(307,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator307");

    private static final metamutator.Selector _returnReplacementOperator308 = metamutator.Selector.of(308,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator308");

    private static final metamutator.Selector _returnReplacementOperator309 = metamutator.Selector.of(309,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator309");

    private static final metamutator.Selector _returnReplacementOperator310 = metamutator.Selector.of(310,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator310");

    private static final metamutator.Selector _returnReplacementOperator311 = metamutator.Selector.of(311,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator311");

    private static final metamutator.Selector _returnReplacementOperator312 = metamutator.Selector.of(312,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator312");

    private static final metamutator.Selector _returnReplacementOperator313 = metamutator.Selector.of(313,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator313");

    private static final metamutator.Selector _returnReplacementOperator314 = metamutator.Selector.of(314,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator314");

    private static final metamutator.Selector _returnReplacementOperator315 = metamutator.Selector.of(315,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator315");

    private static final metamutator.Selector _returnReplacementOperator316 = metamutator.Selector.of(316,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator316");

    private static final metamutator.Selector _returnReplacementOperator317 = metamutator.Selector.of(317,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator317");

    private static final metamutator.Selector _returnReplacementOperator318 = metamutator.Selector.of(318,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator318");

    private static final metamutator.Selector _returnReplacementOperator319 = metamutator.Selector.of(319,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator319");

    private static final metamutator.Selector _returnReplacementOperator320 = metamutator.Selector.of(320,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator320");

    private static final metamutator.Selector _returnReplacementOperator321 = metamutator.Selector.of(321,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator321");

    private static final metamutator.Selector _returnReplacementOperator322 = metamutator.Selector.of(322,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.ReflectionToStringBuilder.class).id("_returnReplacementOperator322");
}

