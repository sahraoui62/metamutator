package org.apache.commons.lang3.builder;


public class ReflectionToStringBuilder extends org.apache.commons.lang3.builder.ToStringBuilder {
    public static java.lang.String toString(final java.lang.Object object) {
        return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, null, false, false, null);
    }

    public static java.lang.String toString(final java.lang.Object object, final org.apache.commons.lang3.builder.ToStringStyle style) {
        return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, style, false, false, null);
    }

    public static java.lang.String toString(final java.lang.Object object, final org.apache.commons.lang3.builder.ToStringStyle style, final boolean outputTransients) {
        return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, style, outputTransients, false, null);
    }

    public static java.lang.String toString(final java.lang.Object object, final org.apache.commons.lang3.builder.ToStringStyle style, final boolean outputTransients, final boolean outputStatics) {
        return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, style, outputTransients, outputStatics, null);
    }

    public static <T>java.lang.String toString(final T object, final org.apache.commons.lang3.builder.ToStringStyle style, final boolean outputTransients, final boolean outputStatics, final java.lang.Class<? super T> reflectUpToClass) {
        return new org.apache.commons.lang3.builder.ReflectionToStringBuilder(object , style , null , reflectUpToClass , outputTransients , outputStatics).toString();
    }

    public static java.lang.String toStringExclude(final java.lang.Object object, final java.util.Collection<java.lang.String> excludeFieldNames) {
        return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude(object, org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(excludeFieldNames));
    }

    static java.lang.String[] toNoNullStringArray(final java.util.Collection<java.lang.String> collection) {
        if (collection == null) {
            return org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        } 
        return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(collection.toArray());
    }

    static java.lang.String[] toNoNullStringArray(final java.lang.Object[] array) {
        final java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>(array.length);
        for (final java.lang.Object e : array) {
            if (e != null) {
                list.add(e.toString());
            } 
        }
        return list.toArray(new java.lang.String[list.size()]);
    }

    public static java.lang.String toStringExclude(final java.lang.Object object, final java.lang.String... excludeFieldNames) {
        return new org.apache.commons.lang3.builder.ReflectionToStringBuilder(object).setExcludeFieldNames(excludeFieldNames).toString();
    }

    private static java.lang.Object checkNotNull(final java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("The Object passed in should not be null.");
        } 
        return obj;
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
            return false;
        } 
        if ((java.lang.reflect.Modifier.isTransient(field.getModifiers())) && (!(isAppendTransients()))) {
            return false;
        } 
        if ((java.lang.reflect.Modifier.isStatic(field.getModifiers())) && (!(isAppendStatics()))) {
            return false;
        } 
        if (((this.excludeFieldNames) != null) && ((java.util.Arrays.binarySearch(this.excludeFieldNames, field.getName())) >= 0)) {
            return false;
        } 
        if (field.isAnnotationPresent(org.apache.commons.lang3.builder.ToStringExclude.class)) {
            return false;
        } 
        return true;
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
        return this.excludeFieldNames.clone();
    }

    public java.lang.Class<?> getUpToClass() {
        return this.upToClass;
    }

    protected java.lang.Object getValue(final java.lang.reflect.Field field) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        return field.get(getObject());
    }

    public boolean isAppendStatics() {
        return this.appendStatics;
    }

    public boolean isAppendTransients() {
        return this.appendTransients;
    }

    public org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionAppendArray(final java.lang.Object array) {
        getStyle().reflectionAppendArrayDetail(getStringBuffer(), null, array);
        return this;
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
        return this;
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
            return getStyle().getNullText();
        } 
        java.lang.Class<?> clazz = getObject().getClass();
        appendFieldsIn(clazz);
        while (((clazz.getSuperclass()) != null) && (clazz != (getUpToClass()))) {
            clazz = clazz.getSuperclass();
            appendFieldsIn(clazz);
        }
        return super.toString();
    }
}

