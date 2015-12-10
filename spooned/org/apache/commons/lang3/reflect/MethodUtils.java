package org.apache.commons.lang3.reflect;


public class MethodUtils {
    public MethodUtils() {
        super();
    }

    public static java.lang.Object invokeMethod(final java.lang.Object object, final java.lang.String methodName) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        return ((_returnReplacementOperator910.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(object, methodName, org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY, null)));
    }

    public static java.lang.Object invokeMethod(final java.lang.Object object, final java.lang.String methodName, java.lang.Object... args) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        final java.lang.Class<?>[] parameterTypes = org.apache.commons.lang3.ClassUtils.toClass(args);
        return ((_returnReplacementOperator911.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(object, methodName, args, parameterTypes)));
    }

    public static java.lang.Object invokeMethod(final java.lang.Object object, final java.lang.String methodName, java.lang.Object[] args, java.lang.Class<?>[] parameterTypes) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        parameterTypes = org.apache.commons.lang3.ArrayUtils.nullToEmpty(parameterTypes);
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        final java.lang.reflect.Method method = org.apache.commons.lang3.reflect.MethodUtils.getMatchingAccessibleMethod(object.getClass(), methodName, parameterTypes);
        if (method == null) {
            throw new java.lang.NoSuchMethodException(((("No such accessible method: " + methodName) + "() on object: ") + (object.getClass().getName())));
        } 
        return ((_returnReplacementOperator912.is("NULL")) ? ( null ) : (method.invoke(object, args)));
    }

    public static java.lang.Object invokeExactMethod(final java.lang.Object object, final java.lang.String methodName) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        return ((_returnReplacementOperator905.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(object, methodName, org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY, null)));
    }

    public static java.lang.Object invokeExactMethod(final java.lang.Object object, final java.lang.String methodName, java.lang.Object... args) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        final java.lang.Class<?>[] parameterTypes = org.apache.commons.lang3.ClassUtils.toClass(args);
        return ((_returnReplacementOperator906.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(object, methodName, args, parameterTypes)));
    }

    public static java.lang.Object invokeExactMethod(final java.lang.Object object, final java.lang.String methodName, java.lang.Object[] args, java.lang.Class<?>[] parameterTypes) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        parameterTypes = org.apache.commons.lang3.ArrayUtils.nullToEmpty(parameterTypes);
        final java.lang.reflect.Method method = org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(object.getClass(), methodName, parameterTypes);
        if (method == null) {
            throw new java.lang.NoSuchMethodException(((("No such accessible method: " + methodName) + "() on object: ") + (object.getClass().getName())));
        } 
        return ((_returnReplacementOperator907.is("NULL")) ? ( null ) : (method.invoke(object, args)));
    }

    public static java.lang.Object invokeExactStaticMethod(final java.lang.Class<?> cls, final java.lang.String methodName, java.lang.Object[] args, java.lang.Class<?>[] parameterTypes) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        parameterTypes = org.apache.commons.lang3.ArrayUtils.nullToEmpty(parameterTypes);
        final java.lang.reflect.Method method = org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(cls, methodName, parameterTypes);
        if (method == null) {
            throw new java.lang.NoSuchMethodException(((("No such accessible method: " + methodName) + "() on class: ") + (cls.getName())));
        } 
        return ((_returnReplacementOperator909.is("NULL")) ? ( null ) : (method.invoke(null, args)));
    }

    public static java.lang.Object invokeStaticMethod(final java.lang.Class<?> cls, final java.lang.String methodName, java.lang.Object... args) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        final java.lang.Class<?>[] parameterTypes = org.apache.commons.lang3.ClassUtils.toClass(args);
        return ((_returnReplacementOperator913.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.MethodUtils.invokeStaticMethod(cls, methodName, args, parameterTypes)));
    }

    public static java.lang.Object invokeStaticMethod(final java.lang.Class<?> cls, final java.lang.String methodName, java.lang.Object[] args, java.lang.Class<?>[] parameterTypes) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        parameterTypes = org.apache.commons.lang3.ArrayUtils.nullToEmpty(parameterTypes);
        final java.lang.reflect.Method method = org.apache.commons.lang3.reflect.MethodUtils.getMatchingAccessibleMethod(cls, methodName, parameterTypes);
        if (method == null) {
            throw new java.lang.NoSuchMethodException(((("No such accessible method: " + methodName) + "() on class: ") + (cls.getName())));
        } 
        return ((_returnReplacementOperator914.is("NULL")) ? ( null ) : (method.invoke(null, args)));
    }

    public static java.lang.Object invokeExactStaticMethod(final java.lang.Class<?> cls, final java.lang.String methodName, java.lang.Object... args) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        final java.lang.Class<?>[] parameterTypes = org.apache.commons.lang3.ClassUtils.toClass(args);
        return ((_returnReplacementOperator908.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.MethodUtils.invokeExactStaticMethod(cls, methodName, args, parameterTypes)));
    }

    public static java.lang.reflect.Method getAccessibleMethod(final java.lang.Class<?> cls, final java.lang.String methodName, final java.lang.Class<?>... parameterTypes) {
        try {
            return ((_returnReplacementOperator915.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(cls.getMethod(methodName, parameterTypes))));
        } catch (final java.lang.NoSuchMethodException e) {
            return ((_returnReplacementOperator916.is("NULL")) ? ( null ) : (null));
        }
    }

    public static java.lang.reflect.Method getAccessibleMethod(java.lang.reflect.Method method) {
        if (!(org.apache.commons.lang3.reflect.MemberUtils.isAccessible(method))) {
            return ((_returnReplacementOperator917.is("NULL")) ? ( null ) : (null));
        } 
        final java.lang.Class<?> cls = method.getDeclaringClass();
        if (java.lang.reflect.Modifier.isPublic(cls.getModifiers())) {
            return ((_returnReplacementOperator918.is("NULL")) ? ( null ) : (method));
        } 
        final java.lang.String methodName = method.getName();
        final java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        method = org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethodFromInterfaceNest(cls, methodName, parameterTypes);
        if (method == null) {
            method = org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethodFromSuperclass(cls, methodName, parameterTypes);
        } 
        return ((_returnReplacementOperator919.is("NULL")) ? ( null ) : (method));
    }

    private static java.lang.reflect.Method getAccessibleMethodFromSuperclass(final java.lang.Class<?> cls, final java.lang.String methodName, final java.lang.Class<?>... parameterTypes) {
        java.lang.Class<?> parentClass = cls.getSuperclass();
        while (parentClass != null) {
            if (java.lang.reflect.Modifier.isPublic(parentClass.getModifiers())) {
                try {
                    return ((_returnReplacementOperator923.is("NULL")) ? ( null ) : (parentClass.getMethod(methodName, parameterTypes)));
                } catch (final java.lang.NoSuchMethodException e) {
                    return ((_returnReplacementOperator924.is("NULL")) ? ( null ) : (null));
                }
            } 
            parentClass = parentClass.getSuperclass();
        }
        return ((_returnReplacementOperator925.is("NULL")) ? ( null ) : (null));
    }

    private static java.lang.reflect.Method getAccessibleMethodFromInterfaceNest(java.lang.Class<?> cls, final java.lang.String methodName, final java.lang.Class<?>... parameterTypes) {
        for ( ; cls != null ; cls = cls.getSuperclass()) {
            final java.lang.Class<?>[] interfaces = cls.getInterfaces();
            for (int i = 0 ; i < (interfaces.length) ; i++) {
                if (!(java.lang.reflect.Modifier.isPublic(interfaces[i].getModifiers()))) {
                    continue;
                } 
                try {
                    return ((_returnReplacementOperator920.is("NULL")) ? ( null ) : (interfaces[i].getDeclaredMethod(methodName, parameterTypes)));
                } catch (final java.lang.NoSuchMethodException e) {
                }
                final java.lang.reflect.Method method = org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethodFromInterfaceNest(interfaces[i], methodName, parameterTypes);
                if (method != null) {
                    return ((_returnReplacementOperator921.is("NULL")) ? ( null ) : (method));
                } 
            }
        }
        return ((_returnReplacementOperator922.is("NULL")) ? ( null ) : (null));
    }

    public static java.lang.reflect.Method getMatchingAccessibleMethod(final java.lang.Class<?> cls, final java.lang.String methodName, final java.lang.Class<?>... parameterTypes) {
        try {
            final java.lang.reflect.Method method = cls.getMethod(methodName, parameterTypes);
            org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(method);
            return ((_returnReplacementOperator926.is("NULL")) ? ( null ) : (method));
        } catch (final java.lang.NoSuchMethodException e) {
        }
        java.lang.reflect.Method bestMatch = null;
        final java.lang.reflect.Method[] methods = cls.getMethods();
        for (final java.lang.reflect.Method method : methods) {
            if ((method.getName().equals(methodName)) && (org.apache.commons.lang3.ClassUtils.isAssignable(parameterTypes, method.getParameterTypes(), true))) {
                final java.lang.reflect.Method accessibleMethod = org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(method);
                if ((accessibleMethod != null) && ((bestMatch == null) || ((org.apache.commons.lang3.reflect.MemberUtils.compareParameterTypes(accessibleMethod.getParameterTypes(), bestMatch.getParameterTypes(), parameterTypes)) < 0))) {
                    bestMatch = accessibleMethod;
                } 
            } 
        }
        if (bestMatch != null) {
            org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(bestMatch);
        } 
        return ((_returnReplacementOperator927.is("NULL")) ? ( null ) : (bestMatch));
    }

    public static java.util.Set<java.lang.reflect.Method> getOverrideHierarchy(final java.lang.reflect.Method method, final org.apache.commons.lang3.ClassUtils.Interfaces interfacesBehavior) {
        org.apache.commons.lang3.Validate.notNull(method);
        final java.util.Set<java.lang.reflect.Method> result = new java.util.LinkedHashSet<java.lang.reflect.Method>();
        result.add(method);
        final java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        final java.lang.Class<?> declaringClass = method.getDeclaringClass();
        final java.util.Iterator<java.lang.Class<?>> hierarchy = org.apache.commons.lang3.ClassUtils.hierarchy(declaringClass, interfacesBehavior).iterator();
        hierarchy.next();
        hierarchyTraversal : while (hierarchy.hasNext()) {
            final java.lang.Class<?> c = hierarchy.next();
            final java.lang.reflect.Method m = org.apache.commons.lang3.reflect.MethodUtils.getMatchingAccessibleMethod(c, method.getName(), parameterTypes);
            if (m == null) {
                continue;
            } 
            if (java.util.Arrays.equals(m.getParameterTypes(), parameterTypes)) {
                result.add(m);
                continue;
            } 
            final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeArguments = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(declaringClass, m.getDeclaringClass());
            for (int i = 0 ; i < (parameterTypes.length) ; i++) {
                final java.lang.reflect.Type childType = org.apache.commons.lang3.reflect.TypeUtils.unrollVariables(typeArguments, method.getGenericParameterTypes()[i]);
                final java.lang.reflect.Type parentType = org.apache.commons.lang3.reflect.TypeUtils.unrollVariables(typeArguments, m.getGenericParameterTypes()[i]);
                if (!(org.apache.commons.lang3.reflect.TypeUtils.equals(childType, parentType))) {
                    continue hierarchyTraversal;
                } 
            }
            result.add(m);
        }
        return ((_returnReplacementOperator930.is("NULL")) ? ( null ) : (result));
    }

    public static java.lang.reflect.Method[] getMethodsWithAnnotation(final java.lang.Class<?> cls, final java.lang.Class<? extends java.lang.annotation.Annotation> annotationCls) {
        final java.util.List<java.lang.reflect.Method> annotatedMethodsList = org.apache.commons.lang3.reflect.MethodUtils.getMethodsListWithAnnotation(cls, annotationCls);
        return ((_returnReplacementOperator928.is("NULL")) ? ( null ) : (annotatedMethodsList.toArray(new java.lang.reflect.Method[annotatedMethodsList.size()])));
    }

    public static java.util.List<java.lang.reflect.Method> getMethodsListWithAnnotation(final java.lang.Class<?> cls, final java.lang.Class<? extends java.lang.annotation.Annotation> annotationCls) {
        org.apache.commons.lang3.Validate.isTrue((cls != null), "The class must not be null");
        org.apache.commons.lang3.Validate.isTrue((annotationCls != null), "The annotation class must not be null");
        final java.lang.reflect.Method[] allMethods = cls.getMethods();
        final java.util.List<java.lang.reflect.Method> annotatedMethods = new java.util.ArrayList<java.lang.reflect.Method>();
        for (final java.lang.reflect.Method method : allMethods) {
            if ((method.getAnnotation(annotationCls)) != null) {
                annotatedMethods.add(method);
            } 
        }
        return ((_returnReplacementOperator929.is("NULL")) ? ( null ) : (annotatedMethods));
    }

    private static final metamutator.Selector _returnReplacementOperator905 = metamutator.Selector.of(905,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator905");

    private static final metamutator.Selector _returnReplacementOperator906 = metamutator.Selector.of(906,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator906");

    private static final metamutator.Selector _returnReplacementOperator907 = metamutator.Selector.of(907,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator907");

    private static final metamutator.Selector _returnReplacementOperator908 = metamutator.Selector.of(908,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator908");

    private static final metamutator.Selector _returnReplacementOperator909 = metamutator.Selector.of(909,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator909");

    private static final metamutator.Selector _returnReplacementOperator910 = metamutator.Selector.of(910,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator910");

    private static final metamutator.Selector _returnReplacementOperator911 = metamutator.Selector.of(911,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator911");

    private static final metamutator.Selector _returnReplacementOperator912 = metamutator.Selector.of(912,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator912");

    private static final metamutator.Selector _returnReplacementOperator913 = metamutator.Selector.of(913,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator913");

    private static final metamutator.Selector _returnReplacementOperator914 = metamutator.Selector.of(914,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator914");

    private static final metamutator.Selector _returnReplacementOperator915 = metamutator.Selector.of(915,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator915");

    private static final metamutator.Selector _returnReplacementOperator916 = metamutator.Selector.of(916,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator916");

    private static final metamutator.Selector _returnReplacementOperator917 = metamutator.Selector.of(917,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator917");

    private static final metamutator.Selector _returnReplacementOperator918 = metamutator.Selector.of(918,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator918");

    private static final metamutator.Selector _returnReplacementOperator919 = metamutator.Selector.of(919,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator919");

    private static final metamutator.Selector _returnReplacementOperator920 = metamutator.Selector.of(920,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator920");

    private static final metamutator.Selector _returnReplacementOperator921 = metamutator.Selector.of(921,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator921");

    private static final metamutator.Selector _returnReplacementOperator922 = metamutator.Selector.of(922,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator922");

    private static final metamutator.Selector _returnReplacementOperator923 = metamutator.Selector.of(923,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator923");

    private static final metamutator.Selector _returnReplacementOperator924 = metamutator.Selector.of(924,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator924");

    private static final metamutator.Selector _returnReplacementOperator925 = metamutator.Selector.of(925,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator925");

    private static final metamutator.Selector _returnReplacementOperator926 = metamutator.Selector.of(926,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator926");

    private static final metamutator.Selector _returnReplacementOperator927 = metamutator.Selector.of(927,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator927");

    private static final metamutator.Selector _returnReplacementOperator928 = metamutator.Selector.of(928,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator928");

    private static final metamutator.Selector _returnReplacementOperator929 = metamutator.Selector.of(929,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator929");

    private static final metamutator.Selector _returnReplacementOperator930 = metamutator.Selector.of(930,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MethodUtils.class).id("_returnReplacementOperator930");
}

