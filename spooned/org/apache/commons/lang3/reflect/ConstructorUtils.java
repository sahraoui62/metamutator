package org.apache.commons.lang3.reflect;


public class ConstructorUtils {
    public ConstructorUtils() {
        super();
    }

    public static <T>T invokeConstructor(final java.lang.Class<T> cls, java.lang.Object... args) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        final java.lang.Class<?>[] parameterTypes = org.apache.commons.lang3.ClassUtils.toClass(args);
        return org.apache.commons.lang3.reflect.ConstructorUtils.invokeConstructor(cls, args, parameterTypes);
    }

    public static <T>T invokeConstructor(final java.lang.Class<T> cls, java.lang.Object[] args, java.lang.Class<?>[] parameterTypes) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        parameterTypes = org.apache.commons.lang3.ArrayUtils.nullToEmpty(parameterTypes);
        final java.lang.reflect.Constructor<T> ctor = org.apache.commons.lang3.reflect.ConstructorUtils.getMatchingAccessibleConstructor(cls, parameterTypes);
        if (ctor == null) {
            throw new java.lang.NoSuchMethodException(("No such accessible constructor on object: " + (cls.getName())));
        } 
        return ctor.newInstance(args);
    }

    public static <T>T invokeExactConstructor(final java.lang.Class<T> cls, java.lang.Object... args) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        final java.lang.Class<?>[] parameterTypes = org.apache.commons.lang3.ClassUtils.toClass(args);
        return org.apache.commons.lang3.reflect.ConstructorUtils.invokeExactConstructor(cls, args, parameterTypes);
    }

    public static <T>T invokeExactConstructor(final java.lang.Class<T> cls, java.lang.Object[] args, java.lang.Class<?>[] parameterTypes) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        parameterTypes = org.apache.commons.lang3.ArrayUtils.nullToEmpty(parameterTypes);
        final java.lang.reflect.Constructor<T> ctor = org.apache.commons.lang3.reflect.ConstructorUtils.getAccessibleConstructor(cls, parameterTypes);
        if (ctor == null) {
            throw new java.lang.NoSuchMethodException(("No such accessible constructor on object: " + (cls.getName())));
        } 
        return ctor.newInstance(args);
    }

    public static <T>java.lang.reflect.Constructor<T> getAccessibleConstructor(final java.lang.Class<T> cls, final java.lang.Class<?>... parameterTypes) {
        org.apache.commons.lang3.Validate.notNull(cls, "class cannot be null");
        try {
            return org.apache.commons.lang3.reflect.ConstructorUtils.getAccessibleConstructor(cls.getConstructor(parameterTypes));
        } catch (final java.lang.NoSuchMethodException e) {
            return null;
        }
    }

    public static <T>java.lang.reflect.Constructor<T> getAccessibleConstructor(final java.lang.reflect.Constructor<T> ctor) {
        org.apache.commons.lang3.Validate.notNull(ctor, "constructor cannot be null");
        return (org.apache.commons.lang3.reflect.MemberUtils.isAccessible(ctor)) && (org.apache.commons.lang3.reflect.ConstructorUtils.isAccessible(ctor.getDeclaringClass())) ? ctor : null;
    }

    public static <T>java.lang.reflect.Constructor<T> getMatchingAccessibleConstructor(final java.lang.Class<T> cls, final java.lang.Class<?>... parameterTypes) {
        org.apache.commons.lang3.Validate.notNull(cls, "class cannot be null");
        try {
            final java.lang.reflect.Constructor<T> ctor = cls.getConstructor(parameterTypes);
            org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(ctor);
            return ctor;
        } catch (final java.lang.NoSuchMethodException e) {
        }
        java.lang.reflect.Constructor<T> result = null;
        final java.lang.reflect.Constructor<?>[] ctors = cls.getConstructors();
        for (java.lang.reflect.Constructor<?> ctor : ctors) {
            if (org.apache.commons.lang3.ClassUtils.isAssignable(parameterTypes, ctor.getParameterTypes(), true)) {
                ctor = org.apache.commons.lang3.reflect.ConstructorUtils.getAccessibleConstructor(ctor);
                if (ctor != null) {
                    org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(ctor);
                    if ((result == null) || ((org.apache.commons.lang3.reflect.MemberUtils.compareParameterTypes(ctor.getParameterTypes(), result.getParameterTypes(), parameterTypes)) < 0)) {
                        @java.lang.SuppressWarnings(value = "unchecked")
                        final java.lang.reflect.Constructor<T> constructor = ((java.lang.reflect.Constructor<T>)(ctor));
                        result = constructor;
                    } 
                } 
            } 
        }
        return result;
    }

    private static boolean isAccessible(final java.lang.Class<?> type) {
        java.lang.Class<?> cls = type;
        while (cls != null) {
            if (!(java.lang.reflect.Modifier.isPublic(cls.getModifiers()))) {
                return false;
            } 
            cls = cls.getEnclosingClass();
        }
        return true;
    }
}

