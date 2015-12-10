package org.apache.commons.lang3.reflect;


public class ConstructorUtils {
    public ConstructorUtils() {
        super();
    }

    public static <T>T invokeConstructor(final java.lang.Class<T> cls, java.lang.Object... args) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        final java.lang.Class<?>[] parameterTypes = org.apache.commons.lang3.ClassUtils.toClass(args);
        return ((_returnReplacementOperator857.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.ConstructorUtils.invokeConstructor(cls, args, parameterTypes)));
    }

    public static <T>T invokeConstructor(final java.lang.Class<T> cls, java.lang.Object[] args, java.lang.Class<?>[] parameterTypes) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        parameterTypes = org.apache.commons.lang3.ArrayUtils.nullToEmpty(parameterTypes);
        final java.lang.reflect.Constructor<T> ctor = org.apache.commons.lang3.reflect.ConstructorUtils.getMatchingAccessibleConstructor(cls, parameterTypes);
        if (ctor == null) {
            throw new java.lang.NoSuchMethodException(("No such accessible constructor on object: " + (cls.getName())));
        } 
        return ((_returnReplacementOperator858.is("NULL")) ? ( null ) : (ctor.newInstance(args)));
    }

    public static <T>T invokeExactConstructor(final java.lang.Class<T> cls, java.lang.Object... args) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        final java.lang.Class<?>[] parameterTypes = org.apache.commons.lang3.ClassUtils.toClass(args);
        return ((_returnReplacementOperator859.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.ConstructorUtils.invokeExactConstructor(cls, args, parameterTypes)));
    }

    public static <T>T invokeExactConstructor(final java.lang.Class<T> cls, java.lang.Object[] args, java.lang.Class<?>[] parameterTypes) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        parameterTypes = org.apache.commons.lang3.ArrayUtils.nullToEmpty(parameterTypes);
        final java.lang.reflect.Constructor<T> ctor = org.apache.commons.lang3.reflect.ConstructorUtils.getAccessibleConstructor(cls, parameterTypes);
        if (ctor == null) {
            throw new java.lang.NoSuchMethodException(("No such accessible constructor on object: " + (cls.getName())));
        } 
        return ((_returnReplacementOperator860.is("NULL")) ? ( null ) : (ctor.newInstance(args)));
    }

    public static <T>java.lang.reflect.Constructor<T> getAccessibleConstructor(final java.lang.Class<T> cls, final java.lang.Class<?>... parameterTypes) {
        org.apache.commons.lang3.Validate.notNull(cls, "class cannot be null");
        try {
            return ((_returnReplacementOperator861.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.ConstructorUtils.getAccessibleConstructor(cls.getConstructor(parameterTypes))));
        } catch (final java.lang.NoSuchMethodException e) {
            return ((_returnReplacementOperator862.is("NULL")) ? ( null ) : (null));
        }
    }

    public static <T>java.lang.reflect.Constructor<T> getAccessibleConstructor(final java.lang.reflect.Constructor<T> ctor) {
        org.apache.commons.lang3.Validate.notNull(ctor, "constructor cannot be null");
        return ((_returnReplacementOperator863.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.reflect.MemberUtils.isAccessible(ctor)) && (org.apache.commons.lang3.reflect.ConstructorUtils.isAccessible(ctor.getDeclaringClass())) ? ctor : null));
    }

    public static <T>java.lang.reflect.Constructor<T> getMatchingAccessibleConstructor(final java.lang.Class<T> cls, final java.lang.Class<?>... parameterTypes) {
        org.apache.commons.lang3.Validate.notNull(cls, "class cannot be null");
        try {
            final java.lang.reflect.Constructor<T> ctor = cls.getConstructor(parameterTypes);
            org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(ctor);
            return ((_returnReplacementOperator864.is("NULL")) ? ( null ) : (ctor));
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
        return ((_returnReplacementOperator865.is("NULL")) ? ( null ) : (result));
    }

    private static boolean isAccessible(final java.lang.Class<?> type) {
        java.lang.Class<?> cls = type;
        while (cls != null) {
            if (!(java.lang.reflect.Modifier.isPublic(cls.getModifiers()))) {
                return ((_returnReplacementOperator866.is("NULL")) ? ( null ) : (false));
            } 
            cls = cls.getEnclosingClass();
        }
        return ((_returnReplacementOperator867.is("NULL")) ? ( null ) : (true));
    }

    private static final metamutator.Selector _returnReplacementOperator857 = metamutator.Selector.of(857,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperator857");

    private static final metamutator.Selector _returnReplacementOperator858 = metamutator.Selector.of(858,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperator858");

    private static final metamutator.Selector _returnReplacementOperator859 = metamutator.Selector.of(859,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperator859");

    private static final metamutator.Selector _returnReplacementOperator860 = metamutator.Selector.of(860,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperator860");

    private static final metamutator.Selector _returnReplacementOperator861 = metamutator.Selector.of(861,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperator861");

    private static final metamutator.Selector _returnReplacementOperator862 = metamutator.Selector.of(862,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperator862");

    private static final metamutator.Selector _returnReplacementOperator863 = metamutator.Selector.of(863,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperator863");

    private static final metamutator.Selector _returnReplacementOperator864 = metamutator.Selector.of(864,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperator864");

    private static final metamutator.Selector _returnReplacementOperator865 = metamutator.Selector.of(865,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperator865");

    private static final metamutator.Selector _returnReplacementOperator866 = metamutator.Selector.of(866,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperator866");

    private static final metamutator.Selector _returnReplacementOperator867 = metamutator.Selector.of(867,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperator867");
}

