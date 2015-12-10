package org.apache.commons.lang3.reflect;


public class MethodUtils {
    public MethodUtils() {
        super();
    }

    public static java.lang.Object invokeMethod(final java.lang.Object object, final java.lang.String methodName) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        return org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(object, methodName, org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY, null);
    }

    public static java.lang.Object invokeMethod(final java.lang.Object object, final java.lang.String methodName, java.lang.Object... args) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        final java.lang.Class<?>[] parameterTypes = org.apache.commons.lang3.ClassUtils.toClass(args);
        return org.apache.commons.lang3.reflect.MethodUtils.invokeMethod(object, methodName, args, parameterTypes);
    }

    public static java.lang.Object invokeMethod(final java.lang.Object object, final java.lang.String methodName, java.lang.Object[] args, java.lang.Class<?>[] parameterTypes) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        parameterTypes = org.apache.commons.lang3.ArrayUtils.nullToEmpty(parameterTypes);
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        final java.lang.reflect.Method method = org.apache.commons.lang3.reflect.MethodUtils.getMatchingAccessibleMethod(object.getClass(), methodName, parameterTypes);
        if (method == null) {
            throw new java.lang.NoSuchMethodException(((("No such accessible method: " + methodName) + "() on object: ") + (object.getClass().getName())));
        } 
        return method.invoke(object, args);
    }

    public static java.lang.Object invokeExactMethod(final java.lang.Object object, final java.lang.String methodName) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        return org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(object, methodName, org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY, null);
    }

    public static java.lang.Object invokeExactMethod(final java.lang.Object object, final java.lang.String methodName, java.lang.Object... args) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        final java.lang.Class<?>[] parameterTypes = org.apache.commons.lang3.ClassUtils.toClass(args);
        return org.apache.commons.lang3.reflect.MethodUtils.invokeExactMethod(object, methodName, args, parameterTypes);
    }

    public static java.lang.Object invokeExactMethod(final java.lang.Object object, final java.lang.String methodName, java.lang.Object[] args, java.lang.Class<?>[] parameterTypes) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        parameterTypes = org.apache.commons.lang3.ArrayUtils.nullToEmpty(parameterTypes);
        final java.lang.reflect.Method method = org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(object.getClass(), methodName, parameterTypes);
        if (method == null) {
            throw new java.lang.NoSuchMethodException(((("No such accessible method: " + methodName) + "() on object: ") + (object.getClass().getName())));
        } 
        return method.invoke(object, args);
    }

    public static java.lang.Object invokeExactStaticMethod(final java.lang.Class<?> cls, final java.lang.String methodName, java.lang.Object[] args, java.lang.Class<?>[] parameterTypes) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        parameterTypes = org.apache.commons.lang3.ArrayUtils.nullToEmpty(parameterTypes);
        final java.lang.reflect.Method method = org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(cls, methodName, parameterTypes);
        if (method == null) {
            throw new java.lang.NoSuchMethodException(((("No such accessible method: " + methodName) + "() on class: ") + (cls.getName())));
        } 
        return method.invoke(null, args);
    }

    public static java.lang.Object invokeStaticMethod(final java.lang.Class<?> cls, final java.lang.String methodName, java.lang.Object... args) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        final java.lang.Class<?>[] parameterTypes = org.apache.commons.lang3.ClassUtils.toClass(args);
        return org.apache.commons.lang3.reflect.MethodUtils.invokeStaticMethod(cls, methodName, args, parameterTypes);
    }

    public static java.lang.Object invokeStaticMethod(final java.lang.Class<?> cls, final java.lang.String methodName, java.lang.Object[] args, java.lang.Class<?>[] parameterTypes) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        parameterTypes = org.apache.commons.lang3.ArrayUtils.nullToEmpty(parameterTypes);
        final java.lang.reflect.Method method = org.apache.commons.lang3.reflect.MethodUtils.getMatchingAccessibleMethod(cls, methodName, parameterTypes);
        if (method == null) {
            throw new java.lang.NoSuchMethodException(((("No such accessible method: " + methodName) + "() on class: ") + (cls.getName())));
        } 
        return method.invoke(null, args);
    }

    public static java.lang.Object invokeExactStaticMethod(final java.lang.Class<?> cls, final java.lang.String methodName, java.lang.Object... args) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
        args = org.apache.commons.lang3.ArrayUtils.nullToEmpty(args);
        final java.lang.Class<?>[] parameterTypes = org.apache.commons.lang3.ClassUtils.toClass(args);
        return org.apache.commons.lang3.reflect.MethodUtils.invokeExactStaticMethod(cls, methodName, args, parameterTypes);
    }

    public static java.lang.reflect.Method getAccessibleMethod(final java.lang.Class<?> cls, final java.lang.String methodName, final java.lang.Class<?>... parameterTypes) {
        try {
            return org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethod(cls.getMethod(methodName, parameterTypes));
        } catch (final java.lang.NoSuchMethodException e) {
            return null;
        }
    }

    public static java.lang.reflect.Method getAccessibleMethod(java.lang.reflect.Method method) {
        if (!(org.apache.commons.lang3.reflect.MemberUtils.isAccessible(method))) {
            return null;
        } 
        final java.lang.Class<?> cls = method.getDeclaringClass();
        if (java.lang.reflect.Modifier.isPublic(cls.getModifiers())) {
            return method;
        } 
        final java.lang.String methodName = method.getName();
        final java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        method = org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethodFromInterfaceNest(cls, methodName, parameterTypes);
        if (method == null) {
            method = org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethodFromSuperclass(cls, methodName, parameterTypes);
        } 
        return method;
    }

    private static java.lang.reflect.Method getAccessibleMethodFromSuperclass(final java.lang.Class<?> cls, final java.lang.String methodName, final java.lang.Class<?>... parameterTypes) {
        java.lang.Class<?> parentClass = cls.getSuperclass();
        while (parentClass != null) {
            if (java.lang.reflect.Modifier.isPublic(parentClass.getModifiers())) {
                try {
                    return parentClass.getMethod(methodName, parameterTypes);
                } catch (final java.lang.NoSuchMethodException e) {
                    return null;
                }
            } 
            parentClass = parentClass.getSuperclass();
        }
        return null;
    }

    private static java.lang.reflect.Method getAccessibleMethodFromInterfaceNest(java.lang.Class<?> cls, final java.lang.String methodName, final java.lang.Class<?>... parameterTypes) {
        for ( ; cls != null ; cls = cls.getSuperclass()) {
            final java.lang.Class<?>[] interfaces = cls.getInterfaces();
            for (int i = 0 ; i < (interfaces.length) ; i++) {
                if (!(java.lang.reflect.Modifier.isPublic(interfaces[i].getModifiers()))) {
                    continue;
                } 
                try {
                    return interfaces[i].getDeclaredMethod(methodName, parameterTypes);
                } catch (final java.lang.NoSuchMethodException e) {
                }
                final java.lang.reflect.Method method = org.apache.commons.lang3.reflect.MethodUtils.getAccessibleMethodFromInterfaceNest(interfaces[i], methodName, parameterTypes);
                if (method != null) {
                    return method;
                } 
            }
        }
        return null;
    }

    public static java.lang.reflect.Method getMatchingAccessibleMethod(final java.lang.Class<?> cls, final java.lang.String methodName, final java.lang.Class<?>... parameterTypes) {
        try {
            final java.lang.reflect.Method method = cls.getMethod(methodName, parameterTypes);
            org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(method);
            return method;
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
        return bestMatch;
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
        return result;
    }

    public static java.lang.reflect.Method[] getMethodsWithAnnotation(final java.lang.Class<?> cls, final java.lang.Class<? extends java.lang.annotation.Annotation> annotationCls) {
        final java.util.List<java.lang.reflect.Method> annotatedMethodsList = org.apache.commons.lang3.reflect.MethodUtils.getMethodsListWithAnnotation(cls, annotationCls);
        return annotatedMethodsList.toArray(new java.lang.reflect.Method[annotatedMethodsList.size()]);
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
        return annotatedMethods;
    }
}

