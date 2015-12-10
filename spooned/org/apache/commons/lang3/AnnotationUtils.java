package org.apache.commons.lang3;


public class AnnotationUtils {
    private static final org.apache.commons.lang3.builder.ToStringStyle TO_STRING_STYLE = new org.apache.commons.lang3.builder.ToStringStyle() {
        private static final long serialVersionUID = 1L;

        {
            setDefaultFullDetail(true);
            setArrayContentDetail(true);
            setUseClassName(true);
            setUseShortClassName(true);
            setUseIdentityHashCode(false);
            setContentStart("(");
            setContentEnd(")");
            setFieldSeparator(", ");
            setArrayStart("[");
            setArrayEnd("]");
        }

        @java.lang.Override
        protected java.lang.String getShortClassName(final java.lang.Class<?> cls) {
            java.lang.Class<? extends java.lang.annotation.Annotation> annotationType = null;
            for (final java.lang.Class<?> iface : org.apache.commons.lang3.ClassUtils.getAllInterfaces(cls)) {
                if (java.lang.annotation.Annotation.class.isAssignableFrom(iface)) {
                    @java.lang.SuppressWarnings(value = "unchecked")
                    final java.lang.Class<? extends java.lang.annotation.Annotation> found = ((java.lang.Class<? extends java.lang.annotation.Annotation>)(iface));
                    annotationType = found;
                    break;
                } 
            }
            return new java.lang.StringBuilder((annotationType == null ? "" : annotationType.getName())).insert(0, '@').toString();
        }

        @java.lang.Override
        protected void appendDetail(final java.lang.StringBuffer buffer, final java.lang.String fieldName, java.lang.Object value) {
            if (value instanceof java.lang.annotation.Annotation) {
                value = org.apache.commons.lang3.AnnotationUtils.toString(((java.lang.annotation.Annotation)(value)));
            } 
            super.appendDetail(buffer, fieldName, value);
        }
    };

    public AnnotationUtils() {
    }

    public static boolean equals(final java.lang.annotation.Annotation a1, final java.lang.annotation.Annotation a2) {
        if (a1 == a2) {
            return true;
        } 
        if ((a1 == null) || (a2 == null)) {
            return false;
        } 
        final java.lang.Class<? extends java.lang.annotation.Annotation> type = a1.annotationType();
        final java.lang.Class<? extends java.lang.annotation.Annotation> type2 = a2.annotationType();
        org.apache.commons.lang3.Validate.notNull(type, "Annotation %s with null annotationType()", a1);
        org.apache.commons.lang3.Validate.notNull(type2, "Annotation %s with null annotationType()", a2);
        if (!(type.equals(type2))) {
            return false;
        } 
        try {
            for (final java.lang.reflect.Method m : type.getDeclaredMethods()) {
                if (((m.getParameterTypes().length) == 0) && (org.apache.commons.lang3.AnnotationUtils.isValidAnnotationMemberType(m.getReturnType()))) {
                    final java.lang.Object v1 = m.invoke(a1);
                    final java.lang.Object v2 = m.invoke(a2);
                    if (!(org.apache.commons.lang3.AnnotationUtils.memberEquals(m.getReturnType(), v1, v2))) {
                        return false;
                    } 
                } 
            }
        } catch (final java.lang.IllegalAccessException ex) {
            return false;
        } catch (final java.lang.reflect.InvocationTargetException ex) {
            return false;
        }
        return true;
    }

    public static int hashCode(final java.lang.annotation.Annotation a) {
        int result = 0;
        final java.lang.Class<? extends java.lang.annotation.Annotation> type = a.annotationType();
        for (final java.lang.reflect.Method m : type.getDeclaredMethods()) {
            try {
                final java.lang.Object value = m.invoke(a);
                if (value == null) {
                    throw new java.lang.IllegalStateException(java.lang.String.format("Annotation method %s returned null", m));
                } 
                result += org.apache.commons.lang3.AnnotationUtils.hashMember(m.getName(), value);
            } catch (final java.lang.RuntimeException ex) {
                throw ex;
            } catch (final java.lang.Exception ex) {
                throw new java.lang.RuntimeException(ex);
            }
        }
        return result;
    }

    public static java.lang.String toString(final java.lang.annotation.Annotation a) {
        final org.apache.commons.lang3.builder.ToStringBuilder builder = new org.apache.commons.lang3.builder.ToStringBuilder(a , TO_STRING_STYLE);
        for (final java.lang.reflect.Method m : a.annotationType().getDeclaredMethods()) {
            if ((m.getParameterTypes().length) > 0) {
                continue;
            } 
            try {
                builder.append(m.getName(), m.invoke(a));
            } catch (final java.lang.RuntimeException ex) {
                throw ex;
            } catch (final java.lang.Exception ex) {
                throw new java.lang.RuntimeException(ex);
            }
        }
        return builder.build();
    }

    public static boolean isValidAnnotationMemberType(java.lang.Class<?> type) {
        if (type == null) {
            return false;
        } 
        if (type.isArray()) {
            type = type.getComponentType();
        } 
        return ((((type.isPrimitive()) || (type.isEnum())) || (type.isAnnotation())) || (java.lang.String.class.equals(type))) || (java.lang.Class.class.equals(type));
    }

    private static int hashMember(final java.lang.String name, final java.lang.Object value) {
        final int part1 = ((_arithmeticOperatorHotSpot349.is("PLUS")) ? ((name.hashCode()) + 127) : (_arithmeticOperatorHotSpot349.is("MINUS")) ? ((name.hashCode()) - 127) : (_arithmeticOperatorHotSpot349.is("MUL")) ? ((name.hashCode()) * 127) :  ((name.hashCode()) / 127));
        if (value.getClass().isArray()) {
            return part1 ^ (org.apache.commons.lang3.AnnotationUtils.arrayMemberHash(value.getClass().getComponentType(), value));
        } 
        if (value instanceof java.lang.annotation.Annotation) {
            return part1 ^ (org.apache.commons.lang3.AnnotationUtils.hashCode(((java.lang.annotation.Annotation)(value))));
        } 
        return part1 ^ (value.hashCode());
    }

    private static boolean memberEquals(final java.lang.Class<?> type, final java.lang.Object o1, final java.lang.Object o2) {
        if (o1 == o2) {
            return true;
        } 
        if ((o1 == null) || (o2 == null)) {
            return false;
        } 
        if (type.isArray()) {
            return org.apache.commons.lang3.AnnotationUtils.arrayMemberEquals(type.getComponentType(), o1, o2);
        } 
        if (type.isAnnotation()) {
            return org.apache.commons.lang3.AnnotationUtils.equals(((java.lang.annotation.Annotation)(o1)), ((java.lang.annotation.Annotation)(o2)));
        } 
        return o1.equals(o2);
    }

    private static boolean arrayMemberEquals(final java.lang.Class<?> componentType, final java.lang.Object o1, final java.lang.Object o2) {
        if (componentType.isAnnotation()) {
            return org.apache.commons.lang3.AnnotationUtils.annotationArrayMemberEquals(((java.lang.annotation.Annotation[])(o1)), ((java.lang.annotation.Annotation[])(o2)));
        } 
        if (componentType.equals(java.lang.Byte.TYPE)) {
            return java.util.Arrays.equals(((byte[])(o1)), ((byte[])(o2)));
        } 
        if (componentType.equals(java.lang.Short.TYPE)) {
            return java.util.Arrays.equals(((short[])(o1)), ((short[])(o2)));
        } 
        if (componentType.equals(java.lang.Integer.TYPE)) {
            return java.util.Arrays.equals(((int[])(o1)), ((int[])(o2)));
        } 
        if (componentType.equals(java.lang.Character.TYPE)) {
            return java.util.Arrays.equals(((char[])(o1)), ((char[])(o2)));
        } 
        if (componentType.equals(java.lang.Long.TYPE)) {
            return java.util.Arrays.equals(((long[])(o1)), ((long[])(o2)));
        } 
        if (componentType.equals(java.lang.Float.TYPE)) {
            return java.util.Arrays.equals(((float[])(o1)), ((float[])(o2)));
        } 
        if (componentType.equals(java.lang.Double.TYPE)) {
            return java.util.Arrays.equals(((double[])(o1)), ((double[])(o2)));
        } 
        if (componentType.equals(java.lang.Boolean.TYPE)) {
            return java.util.Arrays.equals(((boolean[])(o1)), ((boolean[])(o2)));
        } 
        return java.util.Arrays.equals(((java.lang.Object[])(o1)), ((java.lang.Object[])(o2)));
    }

    private static boolean annotationArrayMemberEquals(final java.lang.annotation.Annotation[] a1, final java.lang.annotation.Annotation[] a2) {
        if ((a1.length) != (a2.length)) {
            return false;
        } 
        for (int i = 0 ; i < (a1.length) ; i++) {
            if (!(org.apache.commons.lang3.AnnotationUtils.equals(a1[i], a2[i]))) {
                return false;
            } 
        }
        return true;
    }

    private static int arrayMemberHash(final java.lang.Class<?> componentType, final java.lang.Object o) {
        if (componentType.equals(java.lang.Byte.TYPE)) {
            return java.util.Arrays.hashCode(((byte[])(o)));
        } 
        if (componentType.equals(java.lang.Short.TYPE)) {
            return java.util.Arrays.hashCode(((short[])(o)));
        } 
        if (componentType.equals(java.lang.Integer.TYPE)) {
            return java.util.Arrays.hashCode(((int[])(o)));
        } 
        if (componentType.equals(java.lang.Character.TYPE)) {
            return java.util.Arrays.hashCode(((char[])(o)));
        } 
        if (componentType.equals(java.lang.Long.TYPE)) {
            return java.util.Arrays.hashCode(((long[])(o)));
        } 
        if (componentType.equals(java.lang.Float.TYPE)) {
            return java.util.Arrays.hashCode(((float[])(o)));
        } 
        if (componentType.equals(java.lang.Double.TYPE)) {
            return java.util.Arrays.hashCode(((double[])(o)));
        } 
        if (componentType.equals(java.lang.Boolean.TYPE)) {
            return java.util.Arrays.hashCode(((boolean[])(o)));
        } 
        return java.util.Arrays.hashCode(((java.lang.Object[])(o)));
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot349 = metamutator.Selector.of(349,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_arithmeticOperatorHotSpot349");
}

