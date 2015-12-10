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
            return ((_returnReplacementOperator1905.is("NULL")) ? ( null ) : (true));
        } 
        if ((a1 == null) || (a2 == null)) {
            return ((_returnReplacementOperator1906.is("NULL")) ? ( null ) : (false));
        } 
        final java.lang.Class<? extends java.lang.annotation.Annotation> type = a1.annotationType();
        final java.lang.Class<? extends java.lang.annotation.Annotation> type2 = a2.annotationType();
        org.apache.commons.lang3.Validate.notNull(type, "Annotation %s with null annotationType()", a1);
        org.apache.commons.lang3.Validate.notNull(type2, "Annotation %s with null annotationType()", a2);
        if (!(type.equals(type2))) {
            return ((_returnReplacementOperator1907.is("NULL")) ? ( null ) : (false));
        } 
        try {
            for (final java.lang.reflect.Method m : type.getDeclaredMethods()) {
                if (((m.getParameterTypes().length) == 0) && (org.apache.commons.lang3.AnnotationUtils.isValidAnnotationMemberType(m.getReturnType()))) {
                    final java.lang.Object v1 = m.invoke(a1);
                    final java.lang.Object v2 = m.invoke(a2);
                    if (!(org.apache.commons.lang3.AnnotationUtils.memberEquals(m.getReturnType(), v1, v2))) {
                        return ((_returnReplacementOperator1908.is("NULL")) ? ( null ) : (false));
                    } 
                } 
            }
        } catch (final java.lang.IllegalAccessException ex) {
            return ((_returnReplacementOperator1909.is("NULL")) ? ( null ) : (false));
        } catch (final java.lang.reflect.InvocationTargetException ex) {
            return ((_returnReplacementOperator1910.is("NULL")) ? ( null ) : (false));
        }
        return ((_returnReplacementOperator1911.is("NULL")) ? ( null ) : (true));
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
        return ((_returnReplacementOperator1928.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1928.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1928.is("ZERO")) ? ( 0 ) : (result));
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
        return ((_returnReplacementOperator1932.is("NULL")) ? ( null ) : (builder.build()));
    }

    public static boolean isValidAnnotationMemberType(java.lang.Class<?> type) {
        if (type == null) {
            return ((_returnReplacementOperator1912.is("NULL")) ? ( null ) : (false));
        } 
        if (type.isArray()) {
            type = type.getComponentType();
        } 
        return ((_returnReplacementOperator1913.is("NULL")) ? ( null ) : (((((type.isPrimitive()) || (type.isEnum())) || (type.isAnnotation())) || (java.lang.String.class.equals(type))) || (java.lang.Class.class.equals(type))));
    }

    private static int hashMember(final java.lang.String name, final java.lang.Object value) {
        final int part1 = (name.hashCode()) * 127;
        if (value.getClass().isArray()) {
            return ((_returnReplacementOperator1929.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1929.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1929.is("ZERO")) ? ( 0 ) : (part1 ^ (org.apache.commons.lang3.AnnotationUtils.arrayMemberHash(value.getClass().getComponentType(), value))));
        } 
        if (value instanceof java.lang.annotation.Annotation) {
            return ((_returnReplacementOperator1930.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1930.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1930.is("ZERO")) ? ( 0 ) : (part1 ^ (org.apache.commons.lang3.AnnotationUtils.hashCode(((java.lang.annotation.Annotation)(value))))));
        } 
        return ((_returnReplacementOperator1931.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1931.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1931.is("ZERO")) ? ( 0 ) : (part1 ^ (value.hashCode())));
    }

    private static boolean memberEquals(final java.lang.Class<?> type, final java.lang.Object o1, final java.lang.Object o2) {
        if (o1 == o2) {
            return ((_returnReplacementOperator1914.is("NULL")) ? ( null ) : (true));
        } 
        if ((o1 == null) || (o2 == null)) {
            return ((_returnReplacementOperator1915.is("NULL")) ? ( null ) : (false));
        } 
        if (type.isArray()) {
            return ((_returnReplacementOperator1916.is("NULL")) ? ( null ) : (org.apache.commons.lang3.AnnotationUtils.arrayMemberEquals(type.getComponentType(), o1, o2)));
        } 
        if (type.isAnnotation()) {
            return ((_returnReplacementOperator1917.is("NULL")) ? ( null ) : (org.apache.commons.lang3.AnnotationUtils.equals(((java.lang.annotation.Annotation)(o1)), ((java.lang.annotation.Annotation)(o2)))));
        } 
        return ((_returnReplacementOperator1918.is("NULL")) ? ( null ) : (o1.equals(o2)));
    }

    private static boolean arrayMemberEquals(final java.lang.Class<?> componentType, final java.lang.Object o1, final java.lang.Object o2) {
        if (componentType.isAnnotation()) {
            return ((_returnReplacementOperator1895.is("NULL")) ? ( null ) : (org.apache.commons.lang3.AnnotationUtils.annotationArrayMemberEquals(((java.lang.annotation.Annotation[])(o1)), ((java.lang.annotation.Annotation[])(o2)))));
        } 
        if (componentType.equals(java.lang.Byte.TYPE)) {
            return ((_returnReplacementOperator1896.is("NULL")) ? ( null ) : (java.util.Arrays.equals(((byte[])(o1)), ((byte[])(o2)))));
        } 
        if (componentType.equals(java.lang.Short.TYPE)) {
            return ((_returnReplacementOperator1897.is("NULL")) ? ( null ) : (java.util.Arrays.equals(((short[])(o1)), ((short[])(o2)))));
        } 
        if (componentType.equals(java.lang.Integer.TYPE)) {
            return ((_returnReplacementOperator1898.is("NULL")) ? ( null ) : (java.util.Arrays.equals(((int[])(o1)), ((int[])(o2)))));
        } 
        if (componentType.equals(java.lang.Character.TYPE)) {
            return ((_returnReplacementOperator1899.is("NULL")) ? ( null ) : (java.util.Arrays.equals(((char[])(o1)), ((char[])(o2)))));
        } 
        if (componentType.equals(java.lang.Long.TYPE)) {
            return ((_returnReplacementOperator1900.is("NULL")) ? ( null ) : (java.util.Arrays.equals(((long[])(o1)), ((long[])(o2)))));
        } 
        if (componentType.equals(java.lang.Float.TYPE)) {
            return ((_returnReplacementOperator1901.is("NULL")) ? ( null ) : (java.util.Arrays.equals(((float[])(o1)), ((float[])(o2)))));
        } 
        if (componentType.equals(java.lang.Double.TYPE)) {
            return ((_returnReplacementOperator1902.is("NULL")) ? ( null ) : (java.util.Arrays.equals(((double[])(o1)), ((double[])(o2)))));
        } 
        if (componentType.equals(java.lang.Boolean.TYPE)) {
            return ((_returnReplacementOperator1903.is("NULL")) ? ( null ) : (java.util.Arrays.equals(((boolean[])(o1)), ((boolean[])(o2)))));
        } 
        return ((_returnReplacementOperator1904.is("NULL")) ? ( null ) : (java.util.Arrays.equals(((java.lang.Object[])(o1)), ((java.lang.Object[])(o2)))));
    }

    private static boolean annotationArrayMemberEquals(final java.lang.annotation.Annotation[] a1, final java.lang.annotation.Annotation[] a2) {
        if ((a1.length) != (a2.length)) {
            return ((_returnReplacementOperator1892.is("NULL")) ? ( null ) : (false));
        } 
        for (int i = 0 ; i < (a1.length) ; i++) {
            if (!(org.apache.commons.lang3.AnnotationUtils.equals(a1[i], a2[i]))) {
                return ((_returnReplacementOperator1893.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator1894.is("NULL")) ? ( null ) : (true));
    }

    private static int arrayMemberHash(final java.lang.Class<?> componentType, final java.lang.Object o) {
        if (componentType.equals(java.lang.Byte.TYPE)) {
            return ((_returnReplacementOperator1919.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1919.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1919.is("ZERO")) ? ( 0 ) : (java.util.Arrays.hashCode(((byte[])(o)))));
        } 
        if (componentType.equals(java.lang.Short.TYPE)) {
            return ((_returnReplacementOperator1920.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1920.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1920.is("ZERO")) ? ( 0 ) : (java.util.Arrays.hashCode(((short[])(o)))));
        } 
        if (componentType.equals(java.lang.Integer.TYPE)) {
            return ((_returnReplacementOperator1921.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1921.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1921.is("ZERO")) ? ( 0 ) : (java.util.Arrays.hashCode(((int[])(o)))));
        } 
        if (componentType.equals(java.lang.Character.TYPE)) {
            return ((_returnReplacementOperator1922.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1922.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1922.is("ZERO")) ? ( 0 ) : (java.util.Arrays.hashCode(((char[])(o)))));
        } 
        if (componentType.equals(java.lang.Long.TYPE)) {
            return ((_returnReplacementOperator1923.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1923.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1923.is("ZERO")) ? ( 0 ) : (java.util.Arrays.hashCode(((long[])(o)))));
        } 
        if (componentType.equals(java.lang.Float.TYPE)) {
            return ((_returnReplacementOperator1924.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1924.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1924.is("ZERO")) ? ( 0 ) : (java.util.Arrays.hashCode(((float[])(o)))));
        } 
        if (componentType.equals(java.lang.Double.TYPE)) {
            return ((_returnReplacementOperator1925.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1925.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1925.is("ZERO")) ? ( 0 ) : (java.util.Arrays.hashCode(((double[])(o)))));
        } 
        if (componentType.equals(java.lang.Boolean.TYPE)) {
            return ((_returnReplacementOperator1926.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1926.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1926.is("ZERO")) ? ( 0 ) : (java.util.Arrays.hashCode(((boolean[])(o)))));
        } 
        return ((_returnReplacementOperator1927.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator1927.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator1927.is("ZERO")) ? ( 0 ) : (java.util.Arrays.hashCode(((java.lang.Object[])(o)))));
    }

    private static final metamutator.Selector _returnReplacementOperator1892 = metamutator.Selector.of(1892,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1892");

    private static final metamutator.Selector _returnReplacementOperator1893 = metamutator.Selector.of(1893,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1893");

    private static final metamutator.Selector _returnReplacementOperator1894 = metamutator.Selector.of(1894,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1894");

    private static final metamutator.Selector _returnReplacementOperator1895 = metamutator.Selector.of(1895,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1895");

    private static final metamutator.Selector _returnReplacementOperator1896 = metamutator.Selector.of(1896,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1896");

    private static final metamutator.Selector _returnReplacementOperator1897 = metamutator.Selector.of(1897,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1897");

    private static final metamutator.Selector _returnReplacementOperator1898 = metamutator.Selector.of(1898,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1898");

    private static final metamutator.Selector _returnReplacementOperator1899 = metamutator.Selector.of(1899,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1899");

    private static final metamutator.Selector _returnReplacementOperator1900 = metamutator.Selector.of(1900,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1900");

    private static final metamutator.Selector _returnReplacementOperator1901 = metamutator.Selector.of(1901,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1901");

    private static final metamutator.Selector _returnReplacementOperator1902 = metamutator.Selector.of(1902,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1902");

    private static final metamutator.Selector _returnReplacementOperator1903 = metamutator.Selector.of(1903,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1903");

    private static final metamutator.Selector _returnReplacementOperator1904 = metamutator.Selector.of(1904,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1904");

    private static final metamutator.Selector _returnReplacementOperator1905 = metamutator.Selector.of(1905,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1905");

    private static final metamutator.Selector _returnReplacementOperator1906 = metamutator.Selector.of(1906,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1906");

    private static final metamutator.Selector _returnReplacementOperator1907 = metamutator.Selector.of(1907,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1907");

    private static final metamutator.Selector _returnReplacementOperator1908 = metamutator.Selector.of(1908,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1908");

    private static final metamutator.Selector _returnReplacementOperator1909 = metamutator.Selector.of(1909,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1909");

    private static final metamutator.Selector _returnReplacementOperator1910 = metamutator.Selector.of(1910,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1910");

    private static final metamutator.Selector _returnReplacementOperator1911 = metamutator.Selector.of(1911,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1911");

    private static final metamutator.Selector _returnReplacementOperator1912 = metamutator.Selector.of(1912,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1912");

    private static final metamutator.Selector _returnReplacementOperator1913 = metamutator.Selector.of(1913,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1913");

    private static final metamutator.Selector _returnReplacementOperator1914 = metamutator.Selector.of(1914,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1914");

    private static final metamutator.Selector _returnReplacementOperator1915 = metamutator.Selector.of(1915,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1915");

    private static final metamutator.Selector _returnReplacementOperator1916 = metamutator.Selector.of(1916,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1916");

    private static final metamutator.Selector _returnReplacementOperator1917 = metamutator.Selector.of(1917,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1917");

    private static final metamutator.Selector _returnReplacementOperator1918 = metamutator.Selector.of(1918,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1918");

    private static final metamutator.Selector _returnReplacementOperator1919 = metamutator.Selector.of(1919,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1919");

    private static final metamutator.Selector _returnReplacementOperator1920 = metamutator.Selector.of(1920,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1920");

    private static final metamutator.Selector _returnReplacementOperator1921 = metamutator.Selector.of(1921,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1921");

    private static final metamutator.Selector _returnReplacementOperator1922 = metamutator.Selector.of(1922,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1922");

    private static final metamutator.Selector _returnReplacementOperator1923 = metamutator.Selector.of(1923,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1923");

    private static final metamutator.Selector _returnReplacementOperator1924 = metamutator.Selector.of(1924,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1924");

    private static final metamutator.Selector _returnReplacementOperator1925 = metamutator.Selector.of(1925,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1925");

    private static final metamutator.Selector _returnReplacementOperator1926 = metamutator.Selector.of(1926,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1926");

    private static final metamutator.Selector _returnReplacementOperator1927 = metamutator.Selector.of(1927,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1927");

    private static final metamutator.Selector _returnReplacementOperator1928 = metamutator.Selector.of(1928,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1928");

    private static final metamutator.Selector _returnReplacementOperator1929 = metamutator.Selector.of(1929,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1929");

    private static final metamutator.Selector _returnReplacementOperator1930 = metamutator.Selector.of(1930,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1930");

    private static final metamutator.Selector _returnReplacementOperator1931 = metamutator.Selector.of(1931,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1931");

    private static final metamutator.Selector _returnReplacementOperator1932 = metamutator.Selector.of(1932,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.AnnotationUtils.class).id("_returnReplacementOperator1932");
}

