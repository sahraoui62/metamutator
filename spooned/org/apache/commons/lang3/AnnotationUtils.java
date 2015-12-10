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
            return ((_returnReplacementOperatorHotSpot1905.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if ((a1 == null) || (a2 == null)) {
            return ((_returnReplacementOperatorHotSpot1906.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        final java.lang.Class<? extends java.lang.annotation.Annotation> type = a1.annotationType();
        final java.lang.Class<? extends java.lang.annotation.Annotation> type2 = a2.annotationType();
        org.apache.commons.lang3.Validate.notNull(type, "Annotation %s with null annotationType()", a1);
        org.apache.commons.lang3.Validate.notNull(type2, "Annotation %s with null annotationType()", a2);
        if (!(type.equals(type2))) {
            return ((_returnReplacementOperatorHotSpot1907.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        try {
            for (final java.lang.reflect.Method m : type.getDeclaredMethods()) {
                if (((m.getParameterTypes().length) == 0) && (org.apache.commons.lang3.AnnotationUtils.isValidAnnotationMemberType(m.getReturnType()))) {
                    final java.lang.Object v1 = m.invoke(a1);
                    final java.lang.Object v2 = m.invoke(a2);
                    if (!(org.apache.commons.lang3.AnnotationUtils.memberEquals(m.getReturnType(), v1, v2))) {
                        return ((_returnReplacementOperatorHotSpot1908.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
                    } 
                } 
            }
        } catch (final java.lang.IllegalAccessException ex) {
            return ((_returnReplacementOperatorHotSpot1909.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } catch (final java.lang.reflect.InvocationTargetException ex) {
            return ((_returnReplacementOperatorHotSpot1910.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        }
        return ((_returnReplacementOperatorHotSpot1911.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
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
        return ((_returnReplacementOperatorHotSpot1928.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1928.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1928.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (result));
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
        return ((_returnReplacementOperatorHotSpot1932.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (builder.build()));
    }

    public static boolean isValidAnnotationMemberType(java.lang.Class<?> type) {
        if (type == null) {
            return ((_returnReplacementOperatorHotSpot1912.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if (type.isArray()) {
            type = type.getComponentType();
        } 
        return ((_returnReplacementOperatorHotSpot1913.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((((type.isPrimitive()) || (type.isEnum())) || (type.isAnnotation())) || (java.lang.String.class.equals(type))) || (java.lang.Class.class.equals(type))));
    }

    private static int hashMember(final java.lang.String name, final java.lang.Object value) {
        final int part1 = (name.hashCode()) * 127;
        if (value.getClass().isArray()) {
            return ((_returnReplacementOperatorHotSpot1929.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1929.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1929.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (part1 ^ (org.apache.commons.lang3.AnnotationUtils.arrayMemberHash(value.getClass().getComponentType(), value))));
        } 
        if (value instanceof java.lang.annotation.Annotation) {
            return ((_returnReplacementOperatorHotSpot1930.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1930.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1930.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (part1 ^ (org.apache.commons.lang3.AnnotationUtils.hashCode(((java.lang.annotation.Annotation)(value))))));
        } 
        return ((_returnReplacementOperatorHotSpot1931.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1931.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1931.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (part1 ^ (value.hashCode())));
    }

    private static boolean memberEquals(final java.lang.Class<?> type, final java.lang.Object o1, final java.lang.Object o2) {
        if (o1 == o2) {
            return ((_returnReplacementOperatorHotSpot1914.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if ((o1 == null) || (o2 == null)) {
            return ((_returnReplacementOperatorHotSpot1915.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if (type.isArray()) {
            return ((_returnReplacementOperatorHotSpot1916.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.AnnotationUtils.arrayMemberEquals(type.getComponentType(), o1, o2)));
        } 
        if (type.isAnnotation()) {
            return ((_returnReplacementOperatorHotSpot1917.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.AnnotationUtils.equals(((java.lang.annotation.Annotation)(o1)), ((java.lang.annotation.Annotation)(o2)))));
        } 
        return ((_returnReplacementOperatorHotSpot1918.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (o1.equals(o2)));
    }

    private static boolean arrayMemberEquals(final java.lang.Class<?> componentType, final java.lang.Object o1, final java.lang.Object o2) {
        if (componentType.isAnnotation()) {
            return ((_returnReplacementOperatorHotSpot1895.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.AnnotationUtils.annotationArrayMemberEquals(((java.lang.annotation.Annotation[])(o1)), ((java.lang.annotation.Annotation[])(o2)))));
        } 
        if (componentType.equals(java.lang.Byte.TYPE)) {
            return ((_returnReplacementOperatorHotSpot1896.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.util.Arrays.equals(((byte[])(o1)), ((byte[])(o2)))));
        } 
        if (componentType.equals(java.lang.Short.TYPE)) {
            return ((_returnReplacementOperatorHotSpot1897.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.util.Arrays.equals(((short[])(o1)), ((short[])(o2)))));
        } 
        if (componentType.equals(java.lang.Integer.TYPE)) {
            return ((_returnReplacementOperatorHotSpot1898.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.util.Arrays.equals(((int[])(o1)), ((int[])(o2)))));
        } 
        if (componentType.equals(java.lang.Character.TYPE)) {
            return ((_returnReplacementOperatorHotSpot1899.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.util.Arrays.equals(((char[])(o1)), ((char[])(o2)))));
        } 
        if (componentType.equals(java.lang.Long.TYPE)) {
            return ((_returnReplacementOperatorHotSpot1900.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.util.Arrays.equals(((long[])(o1)), ((long[])(o2)))));
        } 
        if (componentType.equals(java.lang.Float.TYPE)) {
            return ((_returnReplacementOperatorHotSpot1901.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.util.Arrays.equals(((float[])(o1)), ((float[])(o2)))));
        } 
        if (componentType.equals(java.lang.Double.TYPE)) {
            return ((_returnReplacementOperatorHotSpot1902.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.util.Arrays.equals(((double[])(o1)), ((double[])(o2)))));
        } 
        if (componentType.equals(java.lang.Boolean.TYPE)) {
            return ((_returnReplacementOperatorHotSpot1903.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.util.Arrays.equals(((boolean[])(o1)), ((boolean[])(o2)))));
        } 
        return ((_returnReplacementOperatorHotSpot1904.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.util.Arrays.equals(((java.lang.Object[])(o1)), ((java.lang.Object[])(o2)))));
    }

    private static boolean annotationArrayMemberEquals(final java.lang.annotation.Annotation[] a1, final java.lang.annotation.Annotation[] a2) {
        if ((a1.length) != (a2.length)) {
            return ((_returnReplacementOperatorHotSpot1892.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        for (int i = 0 ; i < (a1.length) ; i++) {
            if (!(org.apache.commons.lang3.AnnotationUtils.equals(a1[i], a2[i]))) {
                return ((_returnReplacementOperatorHotSpot1893.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperatorHotSpot1894.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    private static int arrayMemberHash(final java.lang.Class<?> componentType, final java.lang.Object o) {
        if (componentType.equals(java.lang.Byte.TYPE)) {
            return ((_returnReplacementOperatorHotSpot1919.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1919.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1919.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (java.util.Arrays.hashCode(((byte[])(o)))));
        } 
        if (componentType.equals(java.lang.Short.TYPE)) {
            return ((_returnReplacementOperatorHotSpot1920.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1920.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1920.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (java.util.Arrays.hashCode(((short[])(o)))));
        } 
        if (componentType.equals(java.lang.Integer.TYPE)) {
            return ((_returnReplacementOperatorHotSpot1921.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1921.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1921.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (java.util.Arrays.hashCode(((int[])(o)))));
        } 
        if (componentType.equals(java.lang.Character.TYPE)) {
            return ((_returnReplacementOperatorHotSpot1922.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1922.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1922.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (java.util.Arrays.hashCode(((char[])(o)))));
        } 
        if (componentType.equals(java.lang.Long.TYPE)) {
            return ((_returnReplacementOperatorHotSpot1923.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1923.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1923.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (java.util.Arrays.hashCode(((long[])(o)))));
        } 
        if (componentType.equals(java.lang.Float.TYPE)) {
            return ((_returnReplacementOperatorHotSpot1924.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1924.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1924.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (java.util.Arrays.hashCode(((float[])(o)))));
        } 
        if (componentType.equals(java.lang.Double.TYPE)) {
            return ((_returnReplacementOperatorHotSpot1925.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1925.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1925.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (java.util.Arrays.hashCode(((double[])(o)))));
        } 
        if (componentType.equals(java.lang.Boolean.TYPE)) {
            return ((_returnReplacementOperatorHotSpot1926.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1926.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1926.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (java.util.Arrays.hashCode(((boolean[])(o)))));
        } 
        return ((_returnReplacementOperatorHotSpot1927.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1927.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1927.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (java.util.Arrays.hashCode(((java.lang.Object[])(o)))));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1892 = metamutator.Selector.of(1892,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1892");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1893 = metamutator.Selector.of(1893,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1893");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1894 = metamutator.Selector.of(1894,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1894");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1895 = metamutator.Selector.of(1895,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1895");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1896 = metamutator.Selector.of(1896,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1896");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1897 = metamutator.Selector.of(1897,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1897");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1898 = metamutator.Selector.of(1898,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1898");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1899 = metamutator.Selector.of(1899,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1899");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1900 = metamutator.Selector.of(1900,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1900");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1901 = metamutator.Selector.of(1901,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1901");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1902 = metamutator.Selector.of(1902,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1902");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1903 = metamutator.Selector.of(1903,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1903");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1904 = metamutator.Selector.of(1904,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1904");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1905 = metamutator.Selector.of(1905,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1905");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1906 = metamutator.Selector.of(1906,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1906");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1907 = metamutator.Selector.of(1907,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1907");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1908 = metamutator.Selector.of(1908,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1908");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1909 = metamutator.Selector.of(1909,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1909");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1910 = metamutator.Selector.of(1910,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1910");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1911 = metamutator.Selector.of(1911,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1911");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1912 = metamutator.Selector.of(1912,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1912");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1913 = metamutator.Selector.of(1913,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1913");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1914 = metamutator.Selector.of(1914,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1914");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1915 = metamutator.Selector.of(1915,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1915");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1916 = metamutator.Selector.of(1916,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1916");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1917 = metamutator.Selector.of(1917,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1917");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1918 = metamutator.Selector.of(1918,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1918");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1919 = metamutator.Selector.of(1919,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1919");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1920 = metamutator.Selector.of(1920,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1920");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1921 = metamutator.Selector.of(1921,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1921");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1922 = metamutator.Selector.of(1922,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1922");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1923 = metamutator.Selector.of(1923,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1923");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1924 = metamutator.Selector.of(1924,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1924");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1925 = metamutator.Selector.of(1925,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1925");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1926 = metamutator.Selector.of(1926,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1926");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1927 = metamutator.Selector.of(1927,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1927");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1928 = metamutator.Selector.of(1928,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1928");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1929 = metamutator.Selector.of(1929,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1929");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1930 = metamutator.Selector.of(1930,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1930");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1931 = metamutator.Selector.of(1931,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1931");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1932 = metamutator.Selector.of(1932,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperatorHotSpot1932");
}

