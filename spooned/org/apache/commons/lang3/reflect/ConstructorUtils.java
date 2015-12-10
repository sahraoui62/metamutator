package org.apache.commons.lang3.reflect;


public class ConstructorUtils {
    public ConstructorUtils() {
        super();
    }

    public static <T>T invokeConstructor(final java.lang.Class<T> cls, java.lang.Object... args) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        final java.lang.Class<?>[] parameterTypes = org.apache.commons.lang3.ClassUtils.toClass(args);
        return ((_returnReplacementOperatorHotSpot857.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.ConstructorUtils.invokeConstructor(cls, args, parameterTypes)));
    }

    public static <T>T invokeConstructor(final java.lang.Class<T> cls, java.lang.Object[] args, java.lang.Class<?>[] parameterTypes) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        parameterTypes = org.apache.commons.lang3.ArrayUtils.nullToEmpty(parameterTypes);
        final java.lang.reflect.Constructor<T> ctor = org.apache.commons.lang3.reflect.ConstructorUtils.getMatchingAccessibleConstructor(cls, parameterTypes);
        if (ctor == null) {
            throw new java.lang.NoSuchMethodException(("No such accessible constructor on object: " + (cls.getName())));
        } 
        return ((_returnReplacementOperatorHotSpot858.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (ctor.newInstance(args)));
    }

    public static <T>T invokeExactConstructor(final java.lang.Class<T> cls, java.lang.Object... args) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        final java.lang.Class<?>[] parameterTypes = org.apache.commons.lang3.ClassUtils.toClass(args);
        return ((_returnReplacementOperatorHotSpot859.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.ConstructorUtils.invokeExactConstructor(cls, args, parameterTypes)));
    }

    public static <T>T invokeExactConstructor(final java.lang.Class<T> cls, java.lang.Object[] args, java.lang.Class<?>[] parameterTypes) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        parameterTypes = org.apache.commons.lang3.ArrayUtils.nullToEmpty(parameterTypes);
        final java.lang.reflect.Constructor<T> ctor = org.apache.commons.lang3.reflect.ConstructorUtils.getAccessibleConstructor(cls, parameterTypes);
        if (ctor == null) {
            throw new java.lang.NoSuchMethodException(("No such accessible constructor on object: " + (cls.getName())));
        } 
        return ((_returnReplacementOperatorHotSpot860.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (ctor.newInstance(args)));
    }

    public static <T>java.lang.reflect.Constructor<T> getAccessibleConstructor(final java.lang.Class<T> cls, final java.lang.Class<?>... parameterTypes) {
        org.apache.commons.lang3.Validate.notNull(cls, "class cannot be null");
        try {
            return ((_returnReplacementOperatorHotSpot861.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.ConstructorUtils.getAccessibleConstructor(cls.getConstructor(parameterTypes))));
        } catch (final java.lang.NoSuchMethodException e) {
            return ((_returnReplacementOperatorHotSpot862.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        }
    }

    public static <T>java.lang.reflect.Constructor<T> getAccessibleConstructor(final java.lang.reflect.Constructor<T> ctor) {
        org.apache.commons.lang3.Validate.notNull(ctor, "constructor cannot be null");
        return ((_returnReplacementOperatorHotSpot863.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.reflect.MemberUtils.isAccessible(ctor)) && (org.apache.commons.lang3.reflect.ConstructorUtils.isAccessible(ctor.getDeclaringClass())) ? ctor : null));
    }

    public static <T>java.lang.reflect.Constructor<T> getMatchingAccessibleConstructor(final java.lang.Class<T> cls, final java.lang.Class<?>... parameterTypes) {
        org.apache.commons.lang3.Validate.notNull(cls, "class cannot be null");
        try {
            final java.lang.reflect.Constructor<T> ctor = cls.getConstructor(parameterTypes);
            org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(ctor);
            return ((_returnReplacementOperatorHotSpot864.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (ctor));
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
        return ((_returnReplacementOperatorHotSpot865.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    private static boolean isAccessible(final java.lang.Class<?> type) {
        java.lang.Class<?> cls = type;
        while (cls != null) {
            if (!(java.lang.reflect.Modifier.isPublic(cls.getModifiers()))) {
                return ((_returnReplacementOperatorHotSpot866.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
            cls = cls.getEnclosingClass();
        }
        return ((_returnReplacementOperatorHotSpot867.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot857 = metamutator.Selector.of(857,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperatorHotSpot857");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot858 = metamutator.Selector.of(858,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperatorHotSpot858");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot859 = metamutator.Selector.of(859,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperatorHotSpot859");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot860 = metamutator.Selector.of(860,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperatorHotSpot860");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot861 = metamutator.Selector.of(861,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperatorHotSpot861");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot862 = metamutator.Selector.of(862,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperatorHotSpot862");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot863 = metamutator.Selector.of(863,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperatorHotSpot863");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot864 = metamutator.Selector.of(864,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperatorHotSpot864");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot865 = metamutator.Selector.of(865,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperatorHotSpot865");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot866 = metamutator.Selector.of(866,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperatorHotSpot866");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot867 = metamutator.Selector.of(867,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.ConstructorUtils.class).id("_returnReplacementOperatorHotSpot867");
}

