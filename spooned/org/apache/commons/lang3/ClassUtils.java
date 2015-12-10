package org.apache.commons.lang3;


public class ClassUtils {
    public enum Interfaces {
INCLUDE, EXCLUDE;    }

    public static final char PACKAGE_SEPARATOR_CHAR = '.';

    public static final java.lang.String PACKAGE_SEPARATOR = java.lang.String.valueOf(PACKAGE_SEPARATOR_CHAR);

    public static final char INNER_CLASS_SEPARATOR_CHAR = '$';

    public static final java.lang.String INNER_CLASS_SEPARATOR = java.lang.String.valueOf(INNER_CLASS_SEPARATOR_CHAR);

    private static final java.util.Map<java.lang.Class<?>, java.lang.Class<?>> primitiveWrapperMap = new java.util.HashMap<java.lang.Class<?>, java.lang.Class<?>>();

    static {
        primitiveWrapperMap.put(java.lang.Boolean.TYPE, java.lang.Boolean.class);
        primitiveWrapperMap.put(java.lang.Byte.TYPE, java.lang.Byte.class);
        primitiveWrapperMap.put(java.lang.Character.TYPE, java.lang.Character.class);
        primitiveWrapperMap.put(java.lang.Short.TYPE, java.lang.Short.class);
        primitiveWrapperMap.put(java.lang.Integer.TYPE, java.lang.Integer.class);
        primitiveWrapperMap.put(java.lang.Long.TYPE, java.lang.Long.class);
        primitiveWrapperMap.put(java.lang.Double.TYPE, java.lang.Double.class);
        primitiveWrapperMap.put(java.lang.Float.TYPE, java.lang.Float.class);
        primitiveWrapperMap.put(java.lang.Void.TYPE, java.lang.Void.TYPE);
    }

    private static final java.util.Map<java.lang.Class<?>, java.lang.Class<?>> wrapperPrimitiveMap = new java.util.HashMap<java.lang.Class<?>, java.lang.Class<?>>();

    static {
        for (final java.util.Map.Entry<java.lang.Class<?>, java.lang.Class<?>> entry : primitiveWrapperMap.entrySet()) {
            final java.lang.Class<?> primitiveClass = entry.getKey();
            final java.lang.Class<?> wrapperClass = entry.getValue();
            if (!(primitiveClass.equals(wrapperClass))) {
                wrapperPrimitiveMap.put(wrapperClass, primitiveClass);
            } 
        }
    }

    private static final java.util.Map<java.lang.String, java.lang.String> abbreviationMap;

    private static final java.util.Map<java.lang.String, java.lang.String> reverseAbbreviationMap;

    static {
        final java.util.Map<java.lang.String, java.lang.String> m = new java.util.HashMap<java.lang.String, java.lang.String>();
        m.put("int", "I");
        m.put("boolean", "Z");
        m.put("float", "F");
        m.put("long", "J");
        m.put("short", "S");
        m.put("byte", "B");
        m.put("double", "D");
        m.put("char", "C");
        m.put("void", "V");
        final java.util.Map<java.lang.String, java.lang.String> r = new java.util.HashMap<java.lang.String, java.lang.String>();
        for (final java.util.Map.Entry<java.lang.String, java.lang.String> e : m.entrySet()) {
            r.put(e.getValue(), e.getKey());
        }
        abbreviationMap = java.util.Collections.unmodifiableMap(m);
        reverseAbbreviationMap = java.util.Collections.unmodifiableMap(r);
    }

    public ClassUtils() {
        super();
    }

    public static java.lang.String getShortClassName(final java.lang.Object object, final java.lang.String valueIfNull) {
        if (object == null) {
            return ((_returnReplacementOperator2634.is("NULL")) ? ( null ) : (valueIfNull));
        } 
        return ((_returnReplacementOperator2635.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getShortClassName(object.getClass())));
    }

    public static java.lang.String getShortClassName(final java.lang.Class<?> cls) {
        if (cls == null) {
            return ((_returnReplacementOperator2632.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        return ((_returnReplacementOperator2633.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getShortClassName(cls.getName())));
    }

    public static java.lang.String getShortClassName(java.lang.String className) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(className)) {
            return ((_returnReplacementOperator2636.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        final java.lang.StringBuilder arrayPrefix = new java.lang.StringBuilder();
        if (className.startsWith("[")) {
            while ((className.charAt(0)) == '[') {
                className = className.substring(1);
                arrayPrefix.append("[]");
            }
            if (((className.charAt(0)) == 'L') && ((className.charAt(((className.length()) - 1))) == ';')) {
                className = className.substring(1, ((className.length()) - 1));
            } 
            if (reverseAbbreviationMap.containsKey(className)) {
                className = reverseAbbreviationMap.get(className);
            } 
        } 
        final int lastDotIdx = className.lastIndexOf(PACKAGE_SEPARATOR_CHAR);
        final int innerIdx = className.indexOf(INNER_CLASS_SEPARATOR_CHAR, (lastDotIdx == (-1) ? 0 : lastDotIdx + 1));
        java.lang.String out = className.substring((lastDotIdx + 1));
        if (innerIdx != (-1)) {
            out = out.replace(INNER_CLASS_SEPARATOR_CHAR, PACKAGE_SEPARATOR_CHAR);
        } 
        return ((_returnReplacementOperator2637.is("NULL")) ? ( null ) : (out + arrayPrefix));
    }

    public static java.lang.String getSimpleName(final java.lang.Class<?> cls) {
        if (cls == null) {
            return ((_returnReplacementOperator2638.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        return ((_returnReplacementOperator2639.is("NULL")) ? ( null ) : (cls.getSimpleName()));
    }

    public static java.lang.String getSimpleName(final java.lang.Object object, final java.lang.String valueIfNull) {
        if (object == null) {
            return ((_returnReplacementOperator2640.is("NULL")) ? ( null ) : (valueIfNull));
        } 
        return ((_returnReplacementOperator2641.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getSimpleName(object.getClass())));
    }

    public static java.lang.String getPackageName(final java.lang.Object object, final java.lang.String valueIfNull) {
        if (object == null) {
            return ((_returnReplacementOperator2622.is("NULL")) ? ( null ) : (valueIfNull));
        } 
        return ((_returnReplacementOperator2623.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getPackageName(object.getClass())));
    }

    public static java.lang.String getPackageName(final java.lang.Class<?> cls) {
        if (cls == null) {
            return ((_returnReplacementOperator2620.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        return ((_returnReplacementOperator2621.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getPackageName(cls.getName())));
    }

    public static java.lang.String getPackageName(java.lang.String className) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(className)) {
            return ((_returnReplacementOperator2624.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        while ((className.charAt(0)) == '[') {
            className = className.substring(1);
        }
        if (((className.charAt(0)) == 'L') && ((className.charAt(((className.length()) - 1))) == ';')) {
            className = className.substring(1);
        } 
        final int i = className.lastIndexOf(PACKAGE_SEPARATOR_CHAR);
        if (i == (-1)) {
            return ((_returnReplacementOperator2625.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        return ((_returnReplacementOperator2626.is("NULL")) ? ( null ) : (className.substring(0, i)));
    }

    public static java.lang.String getAbbreviatedName(final java.lang.Class<?> cls, int len) {
        if (cls == null) {
            return ((_returnReplacementOperator2608.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        return ((_returnReplacementOperator2609.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getAbbreviatedName(cls.getName(), len)));
    }

    public static java.lang.String getAbbreviatedName(java.lang.String className, int len) {
        if (len <= 0) {
            throw new java.lang.IllegalArgumentException("len must be > 0");
        } 
        if (className == null) {
            return ((_returnReplacementOperator2610.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        int availableSpace = len;
        int packageLevels = org.apache.commons.lang3.StringUtils.countMatches(className, '.');
        java.lang.String[] output = new java.lang.String[packageLevels + 1];
        int endIndex = (className.length()) - 1;
        for (int level = packageLevels ; level >= 0 ; level--) {
            int startIndex = className.lastIndexOf('.', endIndex);
            java.lang.String part = className.substring((startIndex + 1), (endIndex + 1));
            availableSpace -= part.length();
            if (level > 0) {
                availableSpace--;
            } 
            if (level == packageLevels) {
                output[level] = part;
            } else {
                if (availableSpace > 0) {
                    output[level] = part;
                } else {
                    output[level] = part.substring(0, 1);
                }
            }
            endIndex = startIndex - 1;
        }
        return ((_returnReplacementOperator2611.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.join(output, '.')));
    }

    public static java.util.List<java.lang.Class<?>> getAllSuperclasses(final java.lang.Class<?> cls) {
        if (cls == null) {
            return ((_returnReplacementOperator2651.is("NULL")) ? ( null ) : (null));
        } 
        final java.util.List<java.lang.Class<?>> classes = new java.util.ArrayList<java.lang.Class<?>>();
        java.lang.Class<?> superclass = cls.getSuperclass();
        while (superclass != null) {
            classes.add(superclass);
            superclass = superclass.getSuperclass();
        }
        return ((_returnReplacementOperator2652.is("NULL")) ? ( null ) : (classes));
    }

    public static java.util.List<java.lang.Class<?>> getAllInterfaces(final java.lang.Class<?> cls) {
        if (cls == null) {
            return ((_returnReplacementOperator2649.is("NULL")) ? ( null ) : (null));
        } 
        final java.util.LinkedHashSet<java.lang.Class<?>> interfacesFound = new java.util.LinkedHashSet<java.lang.Class<?>>();
        org.apache.commons.lang3.ClassUtils.getAllInterfaces(cls, interfacesFound);
        return ((_returnReplacementOperator2650.is("NULL")) ? ( null ) : (new java.util.ArrayList<java.lang.Class<?>>(interfacesFound)));
    }

    private static void getAllInterfaces(java.lang.Class<?> cls, final java.util.HashSet<java.lang.Class<?>> interfacesFound) {
        while (cls != null) {
            final java.lang.Class<?>[] interfaces = cls.getInterfaces();
            for (final java.lang.Class<?> i : interfaces) {
                if (interfacesFound.add(i)) {
                    org.apache.commons.lang3.ClassUtils.getAllInterfaces(i, interfacesFound);
                } 
            }
            cls = cls.getSuperclass();
        }
    }

    public static java.util.List<java.lang.Class<?>> convertClassNamesToClasses(final java.util.List<java.lang.String> classNames) {
        if (classNames == null) {
            return ((_returnReplacementOperator2645.is("NULL")) ? ( null ) : (null));
        } 
        final java.util.List<java.lang.Class<?>> classes = new java.util.ArrayList<java.lang.Class<?>>(classNames.size());
        for (final java.lang.String className : classNames) {
            try {
                classes.add(java.lang.Class.forName(className));
            } catch (final java.lang.Exception ex) {
                classes.add(null);
            }
        }
        return ((_returnReplacementOperator2646.is("NULL")) ? ( null ) : (classes));
    }

    public static java.util.List<java.lang.String> convertClassesToClassNames(final java.util.List<java.lang.Class<?>> classes) {
        if (classes == null) {
            return ((_returnReplacementOperator2647.is("NULL")) ? ( null ) : (null));
        } 
        final java.util.List<java.lang.String> classNames = new java.util.ArrayList<java.lang.String>(classes.size());
        for (final java.lang.Class<?> cls : classes) {
            if (cls == null) {
                classNames.add(null);
            } else {
                classNames.add(cls.getName());
            }
        }
        return ((_returnReplacementOperator2648.is("NULL")) ? ( null ) : (classNames));
    }

    public static boolean isAssignable(final java.lang.Class<?>[] classArray, final java.lang.Class<?>... toClassArray) {
        return ((_returnReplacementOperator2574.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.isAssignable(classArray, toClassArray, org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(org.apache.commons.lang3.JavaVersion.JAVA_1_5))));
    }

    public static boolean isAssignable(java.lang.Class<?>[] classArray, java.lang.Class<?>[] toClassArray, final boolean autoboxing) {
        if ((org.apache.commons.lang3.ArrayUtils.isSameLength(classArray, toClassArray)) == false) {
            return ((_returnReplacementOperator2575.is("NULL")) ? ( null ) : (false));
        } 
        if (classArray == null) {
            classArray = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        } 
        if (toClassArray == null) {
            toClassArray = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        } 
        for (int i = 0 ; i < (classArray.length) ; i++) {
            if ((org.apache.commons.lang3.ClassUtils.isAssignable(classArray[i], toClassArray[i], autoboxing)) == false) {
                return ((_returnReplacementOperator2576.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator2577.is("NULL")) ? ( null ) : (true));
    }

    public static boolean isPrimitiveOrWrapper(final java.lang.Class<?> type) {
        if (type == null) {
            return ((_returnReplacementOperator2579.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator2580.is("NULL")) ? ( null ) : ((type.isPrimitive()) || (org.apache.commons.lang3.ClassUtils.isPrimitiveWrapper(type))));
    }

    public static boolean isPrimitiveWrapper(final java.lang.Class<?> type) {
        return ((_returnReplacementOperator2581.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.wrapperPrimitiveMap.containsKey(type)));
    }

    public static boolean isAssignable(final java.lang.Class<?> cls, final java.lang.Class<?> toClass) {
        return ((_returnReplacementOperator2557.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.isAssignable(cls, toClass, org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(org.apache.commons.lang3.JavaVersion.JAVA_1_5))));
    }

    public static boolean isAssignable(java.lang.Class<?> cls, final java.lang.Class<?> toClass, final boolean autoboxing) {
        if (toClass == null) {
            return ((_returnReplacementOperator2558.is("NULL")) ? ( null ) : (false));
        } 
        if (cls == null) {
            return ((_returnReplacementOperator2559.is("NULL")) ? ( null ) : (!(toClass.isPrimitive())));
        } 
        if (autoboxing) {
            if ((cls.isPrimitive()) && (!(toClass.isPrimitive()))) {
                cls = org.apache.commons.lang3.ClassUtils.primitiveToWrapper(cls);
                if (cls == null) {
                    return ((_returnReplacementOperator2560.is("NULL")) ? ( null ) : (false));
                } 
            } 
            if ((toClass.isPrimitive()) && (!(cls.isPrimitive()))) {
                cls = org.apache.commons.lang3.ClassUtils.wrapperToPrimitive(cls);
                if (cls == null) {
                    return ((_returnReplacementOperator2561.is("NULL")) ? ( null ) : (false));
                } 
            } 
        } 
        if (cls.equals(toClass)) {
            return ((_returnReplacementOperator2562.is("NULL")) ? ( null ) : (true));
        } 
        if (cls.isPrimitive()) {
            if ((toClass.isPrimitive()) == false) {
                return ((_returnReplacementOperator2563.is("NULL")) ? ( null ) : (false));
            } 
            if (java.lang.Integer.TYPE.equals(cls)) {
                return ((_returnReplacementOperator2564.is("NULL")) ? ( null ) : (((java.lang.Long.TYPE.equals(toClass)) || (java.lang.Float.TYPE.equals(toClass))) || (java.lang.Double.TYPE.equals(toClass))));
            } 
            if (java.lang.Long.TYPE.equals(cls)) {
                return ((_returnReplacementOperator2565.is("NULL")) ? ( null ) : ((java.lang.Float.TYPE.equals(toClass)) || (java.lang.Double.TYPE.equals(toClass))));
            } 
            if (java.lang.Boolean.TYPE.equals(cls)) {
                return ((_returnReplacementOperator2566.is("NULL")) ? ( null ) : (false));
            } 
            if (java.lang.Double.TYPE.equals(cls)) {
                return ((_returnReplacementOperator2567.is("NULL")) ? ( null ) : (false));
            } 
            if (java.lang.Float.TYPE.equals(cls)) {
                return ((_returnReplacementOperator2568.is("NULL")) ? ( null ) : (java.lang.Double.TYPE.equals(toClass)));
            } 
            if (java.lang.Character.TYPE.equals(cls)) {
                return ((_returnReplacementOperator2569.is("NULL")) ? ( null ) : ((((java.lang.Integer.TYPE.equals(toClass)) || (java.lang.Long.TYPE.equals(toClass))) || (java.lang.Float.TYPE.equals(toClass))) || (java.lang.Double.TYPE.equals(toClass))));
            } 
            if (java.lang.Short.TYPE.equals(cls)) {
                return ((_returnReplacementOperator2570.is("NULL")) ? ( null ) : ((((java.lang.Integer.TYPE.equals(toClass)) || (java.lang.Long.TYPE.equals(toClass))) || (java.lang.Float.TYPE.equals(toClass))) || (java.lang.Double.TYPE.equals(toClass))));
            } 
            if (java.lang.Byte.TYPE.equals(cls)) {
                return ((_returnReplacementOperator2571.is("NULL")) ? ( null ) : (((((java.lang.Short.TYPE.equals(toClass)) || (java.lang.Integer.TYPE.equals(toClass))) || (java.lang.Long.TYPE.equals(toClass))) || (java.lang.Float.TYPE.equals(toClass))) || (java.lang.Double.TYPE.equals(toClass))));
            } 
            return ((_returnReplacementOperator2572.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator2573.is("NULL")) ? ( null ) : (toClass.isAssignableFrom(cls)));
    }

    public static java.lang.Class<?> primitiveToWrapper(final java.lang.Class<?> cls) {
        java.lang.Class<?> convertedClass = cls;
        if ((cls != null) && (cls.isPrimitive())) {
            convertedClass = primitiveWrapperMap.get(cls);
        } 
        return ((_returnReplacementOperator2587.is("NULL")) ? ( null ) : (convertedClass));
    }

    public static java.lang.Class<?>[] primitivesToWrappers(final java.lang.Class<?>... classes) {
        if (classes == null) {
            return ((_returnReplacementOperator2589.is("NULL")) ? ( null ) : (null));
        } 
        if ((classes.length) == 0) {
            return ((_returnReplacementOperator2590.is("NULL")) ? ( null ) : (classes));
        } 
        final java.lang.Class<?>[] convertedClasses = new java.lang.Class[classes.length];
        for (int i = 0 ; i < (classes.length) ; i++) {
            convertedClasses[i] = org.apache.commons.lang3.ClassUtils.primitiveToWrapper(classes[i]);
        }
        return ((_returnReplacementOperator2591.is("NULL")) ? ( null ) : (convertedClasses));
    }

    public static java.lang.Class<?> wrapperToPrimitive(final java.lang.Class<?> cls) {
        return ((_returnReplacementOperator2588.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.wrapperPrimitiveMap.get(cls)));
    }

    public static java.lang.Class<?>[] wrappersToPrimitives(final java.lang.Class<?>... classes) {
        if (classes == null) {
            return ((_returnReplacementOperator2595.is("NULL")) ? ( null ) : (null));
        } 
        if ((classes.length) == 0) {
            return ((_returnReplacementOperator2596.is("NULL")) ? ( null ) : (classes));
        } 
        final java.lang.Class<?>[] convertedClasses = new java.lang.Class[classes.length];
        for (int i = 0 ; i < (classes.length) ; i++) {
            convertedClasses[i] = org.apache.commons.lang3.ClassUtils.wrapperToPrimitive(classes[i]);
        }
        return ((_returnReplacementOperator2597.is("NULL")) ? ( null ) : (convertedClasses));
    }

    public static boolean isInnerClass(final java.lang.Class<?> cls) {
        return ((_returnReplacementOperator2578.is("NULL")) ? ( null ) : ((cls != null) && ((cls.getEnclosingClass()) != null)));
    }

    public static java.lang.Class<?> getClass(final java.lang.ClassLoader classLoader, final java.lang.String className, final boolean initialize) throws java.lang.ClassNotFoundException {
        try {
            java.lang.Class<?> clazz;
            if (abbreviationMap.containsKey(className)) {
                final java.lang.String clsName = "[" + (abbreviationMap.get(className));
                clazz = java.lang.Class.forName(clsName, initialize, classLoader).getComponentType();
            } else {
                clazz = java.lang.Class.forName(org.apache.commons.lang3.ClassUtils.toCanonicalName(className), initialize, classLoader);
            }
            return ((_returnReplacementOperator2583.is("NULL")) ? ( null ) : (clazz));
        } catch (final java.lang.ClassNotFoundException ex) {
            final int lastDotIndex = className.lastIndexOf(PACKAGE_SEPARATOR_CHAR);
            if (lastDotIndex != (-1)) {
                try {
                    return ((_returnReplacementOperator2584.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getClass(classLoader, (((className.substring(0, lastDotIndex)) + (org.apache.commons.lang3.ClassUtils.INNER_CLASS_SEPARATOR_CHAR)) + (className.substring((lastDotIndex + 1)))), initialize)));
                } catch (final java.lang.ClassNotFoundException ex2) {
                }
            } 
            throw ex;
        }
    }

    public static java.lang.Class<?> getClass(final java.lang.ClassLoader classLoader, final java.lang.String className) throws java.lang.ClassNotFoundException {
        return ((_returnReplacementOperator2582.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getClass(classLoader, className, true)));
    }

    public static java.lang.Class<?> getClass(final java.lang.String className) throws java.lang.ClassNotFoundException {
        return ((_returnReplacementOperator2585.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getClass(className, true)));
    }

    public static java.lang.Class<?> getClass(final java.lang.String className, final boolean initialize) throws java.lang.ClassNotFoundException {
        final java.lang.ClassLoader contextCL = java.lang.Thread.currentThread().getContextClassLoader();
        final java.lang.ClassLoader loader = contextCL == null ? org.apache.commons.lang3.ClassUtils.class.getClassLoader() : contextCL;
        return ((_returnReplacementOperator2586.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getClass(loader, className, initialize)));
    }

    public static java.lang.reflect.Method getPublicMethod(final java.lang.Class<?> cls, final java.lang.String methodName, final java.lang.Class<?>... parameterTypes) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        final java.lang.reflect.Method declaredMethod = cls.getMethod(methodName, parameterTypes);
        if (java.lang.reflect.Modifier.isPublic(declaredMethod.getDeclaringClass().getModifiers())) {
            return ((_returnReplacementOperator2643.is("NULL")) ? ( null ) : (declaredMethod));
        } 
        final java.util.List<java.lang.Class<?>> candidateClasses = new java.util.ArrayList<java.lang.Class<?>>();
        candidateClasses.addAll(org.apache.commons.lang3.ClassUtils.getAllInterfaces(cls));
        candidateClasses.addAll(org.apache.commons.lang3.ClassUtils.getAllSuperclasses(cls));
        for (final java.lang.Class<?> candidateClass : candidateClasses) {
            if (!(java.lang.reflect.Modifier.isPublic(candidateClass.getModifiers()))) {
                continue;
            } 
            java.lang.reflect.Method candidateMethod;
            try {
                candidateMethod = candidateClass.getMethod(methodName, parameterTypes);
            } catch (final java.lang.NoSuchMethodException ex) {
                continue;
            }
            if (java.lang.reflect.Modifier.isPublic(candidateMethod.getDeclaringClass().getModifiers())) {
                return ((_returnReplacementOperator2644.is("NULL")) ? ( null ) : (candidateMethod));
            } 
        }
        throw new java.lang.NoSuchMethodException(((("Can't find a public method for " + methodName) + " ") + (org.apache.commons.lang3.ArrayUtils.toString(parameterTypes))));
    }

    private static java.lang.String toCanonicalName(java.lang.String className) {
        className = org.apache.commons.lang3.StringUtils.deleteWhitespace(className);
        if (className == null) {
            throw new java.lang.NullPointerException("className must not be null.");
        } else if (className.endsWith("[]")) {
            final java.lang.StringBuilder classNameBuffer = new java.lang.StringBuilder();
            while (className.endsWith("[]")) {
                className = className.substring(0, ((className.length()) - 2));
                classNameBuffer.append("[");
            }
            final java.lang.String abbreviation = abbreviationMap.get(className);
            if (abbreviation != null) {
                classNameBuffer.append(abbreviation);
            } else {
                classNameBuffer.append("L").append(className).append(";");
            }
            className = classNameBuffer.toString();
        } 
        return ((_returnReplacementOperator2642.is("NULL")) ? ( null ) : (className));
    }

    public static java.lang.Class<?>[] toClass(final java.lang.Object... array) {
        if (array == null) {
            return ((_returnReplacementOperator2592.is("NULL")) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperator2593.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY));
        } 
        final java.lang.Class<?>[] classes = new java.lang.Class[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            classes[i] = (array[i]) == null ? null : array[i].getClass();
        }
        return ((_returnReplacementOperator2594.is("NULL")) ? ( null ) : (classes));
    }

    public static java.lang.String getShortCanonicalName(final java.lang.Object object, final java.lang.String valueIfNull) {
        if (object == null) {
            return ((_returnReplacementOperator2629.is("NULL")) ? ( null ) : (valueIfNull));
        } 
        return ((_returnReplacementOperator2630.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getShortCanonicalName(object.getClass().getName())));
    }

    public static java.lang.String getShortCanonicalName(final java.lang.Class<?> cls) {
        if (cls == null) {
            return ((_returnReplacementOperator2627.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        return ((_returnReplacementOperator2628.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getShortCanonicalName(cls.getName())));
    }

    public static java.lang.String getShortCanonicalName(final java.lang.String canonicalName) {
        return ((_returnReplacementOperator2631.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getShortClassName(org.apache.commons.lang3.ClassUtils.getCanonicalName(canonicalName))));
    }

    public static java.lang.String getPackageCanonicalName(final java.lang.Object object, final java.lang.String valueIfNull) {
        if (object == null) {
            return ((_returnReplacementOperator2617.is("NULL")) ? ( null ) : (valueIfNull));
        } 
        return ((_returnReplacementOperator2618.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(object.getClass().getName())));
    }

    public static java.lang.String getPackageCanonicalName(final java.lang.Class<?> cls) {
        if (cls == null) {
            return ((_returnReplacementOperator2615.is("NULL")) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        return ((_returnReplacementOperator2616.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(cls.getName())));
    }

    public static java.lang.String getPackageCanonicalName(final java.lang.String canonicalName) {
        return ((_returnReplacementOperator2619.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getPackageName(org.apache.commons.lang3.ClassUtils.getCanonicalName(canonicalName))));
    }

    private static java.lang.String getCanonicalName(java.lang.String className) {
        className = org.apache.commons.lang3.StringUtils.deleteWhitespace(className);
        if (className == null) {
            return ((_returnReplacementOperator2612.is("NULL")) ? ( null ) : (null));
        } 
        int dim = 0;
        while (className.startsWith("[")) {
            dim++;
            className = className.substring(1);
        }
        if (dim < 1) {
            return ((_returnReplacementOperator2613.is("NULL")) ? ( null ) : (className));
        } 
        if (className.startsWith("L")) {
            className = className.substring(1, (className.endsWith(";") ? (className.length()) - 1 : className.length()));
        } else {
            if ((className.length()) > 0) {
                className = reverseAbbreviationMap.get(className.substring(0, 1));
            } 
        }
        final java.lang.StringBuilder canonicalClassNameBuffer = new java.lang.StringBuilder(className);
        for (int i = 0 ; i < dim ; i++) {
            canonicalClassNameBuffer.append("[]");
        }
        return ((_returnReplacementOperator2614.is("NULL")) ? ( null ) : (canonicalClassNameBuffer.toString()));
    }

    public static java.lang.Iterable<java.lang.Class<?>> hierarchy(final java.lang.Class<?> type) {
        return ((_returnReplacementOperator2598.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.hierarchy(type, org.apache.commons.lang3.ClassUtils.Interfaces.EXCLUDE)));
    }

    public static java.lang.Iterable<java.lang.Class<?>> hierarchy(final java.lang.Class<?> type, final Interfaces interfacesBehavior) {
        final java.lang.Iterable<java.lang.Class<?>> classes = new java.lang.Iterable<java.lang.Class<?>>() {
            @java.lang.Override
            public java.util.Iterator<java.lang.Class<?>> iterator() {
                final org.apache.commons.lang3.mutable.MutableObject<java.lang.Class<?>> next = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Class<?>>(type);
                return ((_returnReplacementOperator2601.is("NULL")) ? ( null ) : (new java.util.Iterator<java.lang.Class<?>>() {
    @java.lang.Override
    public boolean hasNext() {
        return ((_returnReplacementOperator2599.is("NULL")) ? ( null ) : ((next.getValue()) != null));
    }

    @java.lang.Override
    public java.lang.Class<?> next() {
        final java.lang.Class<?> result = next.getValue();
        next.setValue(result.getSuperclass());
        return ((_returnReplacementOperator2600.is("NULL")) ? ( null ) : (result));
    }

    @java.lang.Override
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}));
            }
        };
        if (interfacesBehavior != (Interfaces.INCLUDE)) {
            return ((_returnReplacementOperator2602.is("NULL")) ? ( null ) : (classes));
        } 
        return ((_returnReplacementOperator2607.is("NULL")) ? ( null ) : (new java.lang.Iterable<java.lang.Class<?>>() {
    @java.lang.Override
    public java.util.Iterator<java.lang.Class<?>> iterator() {
        final java.util.Set<java.lang.Class<?>> seenInterfaces = new java.util.HashSet<java.lang.Class<?>>();
        final java.util.Iterator<java.lang.Class<?>> wrapped = classes.iterator();
        return ((_returnReplacementOperator2606.is("NULL")) ? ( null ) : (new java.util.Iterator<java.lang.Class<?>>() {
    java.util.Iterator<java.lang.Class<?>> interfaces = java.util.Collections.<java.lang.Class<?>>emptySet().iterator();

    @java.lang.Override
    public boolean hasNext() {
        return ((_returnReplacementOperator2603.is("NULL")) ? ( null ) : ((interfaces.hasNext()) || (wrapped.hasNext())));
    }

    @java.lang.Override
    public java.lang.Class<?> next() {
        if (interfaces.hasNext()) {
            final java.lang.Class<?> nextInterface = interfaces.next();
            seenInterfaces.add(nextInterface);
            return ((_returnReplacementOperator2604.is("NULL")) ? ( null ) : (nextInterface));
        } 
        final java.lang.Class<?> nextSuperclass = wrapped.next();
        final java.util.Set<java.lang.Class<?>> currentInterfaces = new java.util.LinkedHashSet<java.lang.Class<?>>();
        walkInterfaces(currentInterfaces, nextSuperclass);
        interfaces = currentInterfaces.iterator();
        return ((_returnReplacementOperator2605.is("NULL")) ? ( null ) : (nextSuperclass));
    }

    private void walkInterfaces(final java.util.Set<java.lang.Class<?>> addTo, final java.lang.Class<?> c) {
        for (final java.lang.Class<?> iface : c.getInterfaces()) {
            if (!(seenInterfaces.contains(iface))) {
                addTo.add(iface);
            } 
            walkInterfaces(addTo, iface);
        }
    }

    @java.lang.Override
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}));
    }
}));
    }

    private static final metamutator.Selector _returnReplacementOperator2557 = metamutator.Selector.of(2557,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2557");

    private static final metamutator.Selector _returnReplacementOperator2558 = metamutator.Selector.of(2558,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2558");

    private static final metamutator.Selector _returnReplacementOperator2559 = metamutator.Selector.of(2559,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2559");

    private static final metamutator.Selector _returnReplacementOperator2560 = metamutator.Selector.of(2560,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2560");

    private static final metamutator.Selector _returnReplacementOperator2561 = metamutator.Selector.of(2561,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2561");

    private static final metamutator.Selector _returnReplacementOperator2562 = metamutator.Selector.of(2562,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2562");

    private static final metamutator.Selector _returnReplacementOperator2563 = metamutator.Selector.of(2563,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2563");

    private static final metamutator.Selector _returnReplacementOperator2564 = metamutator.Selector.of(2564,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2564");

    private static final metamutator.Selector _returnReplacementOperator2565 = metamutator.Selector.of(2565,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2565");

    private static final metamutator.Selector _returnReplacementOperator2566 = metamutator.Selector.of(2566,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2566");

    private static final metamutator.Selector _returnReplacementOperator2567 = metamutator.Selector.of(2567,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2567");

    private static final metamutator.Selector _returnReplacementOperator2568 = metamutator.Selector.of(2568,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2568");

    private static final metamutator.Selector _returnReplacementOperator2569 = metamutator.Selector.of(2569,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2569");

    private static final metamutator.Selector _returnReplacementOperator2570 = metamutator.Selector.of(2570,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2570");

    private static final metamutator.Selector _returnReplacementOperator2571 = metamutator.Selector.of(2571,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2571");

    private static final metamutator.Selector _returnReplacementOperator2572 = metamutator.Selector.of(2572,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2572");

    private static final metamutator.Selector _returnReplacementOperator2573 = metamutator.Selector.of(2573,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2573");

    private static final metamutator.Selector _returnReplacementOperator2574 = metamutator.Selector.of(2574,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2574");

    private static final metamutator.Selector _returnReplacementOperator2575 = metamutator.Selector.of(2575,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2575");

    private static final metamutator.Selector _returnReplacementOperator2576 = metamutator.Selector.of(2576,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2576");

    private static final metamutator.Selector _returnReplacementOperator2577 = metamutator.Selector.of(2577,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2577");

    private static final metamutator.Selector _returnReplacementOperator2578 = metamutator.Selector.of(2578,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2578");

    private static final metamutator.Selector _returnReplacementOperator2579 = metamutator.Selector.of(2579,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2579");

    private static final metamutator.Selector _returnReplacementOperator2580 = metamutator.Selector.of(2580,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2580");

    private static final metamutator.Selector _returnReplacementOperator2581 = metamutator.Selector.of(2581,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2581");

    private static final metamutator.Selector _returnReplacementOperator2582 = metamutator.Selector.of(2582,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2582");

    private static final metamutator.Selector _returnReplacementOperator2583 = metamutator.Selector.of(2583,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2583");

    private static final metamutator.Selector _returnReplacementOperator2584 = metamutator.Selector.of(2584,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2584");

    private static final metamutator.Selector _returnReplacementOperator2585 = metamutator.Selector.of(2585,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2585");

    private static final metamutator.Selector _returnReplacementOperator2586 = metamutator.Selector.of(2586,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2586");

    private static final metamutator.Selector _returnReplacementOperator2587 = metamutator.Selector.of(2587,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2587");

    private static final metamutator.Selector _returnReplacementOperator2588 = metamutator.Selector.of(2588,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2588");

    private static final metamutator.Selector _returnReplacementOperator2589 = metamutator.Selector.of(2589,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2589");

    private static final metamutator.Selector _returnReplacementOperator2590 = metamutator.Selector.of(2590,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2590");

    private static final metamutator.Selector _returnReplacementOperator2591 = metamutator.Selector.of(2591,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2591");

    private static final metamutator.Selector _returnReplacementOperator2592 = metamutator.Selector.of(2592,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2592");

    private static final metamutator.Selector _returnReplacementOperator2593 = metamutator.Selector.of(2593,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2593");

    private static final metamutator.Selector _returnReplacementOperator2594 = metamutator.Selector.of(2594,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2594");

    private static final metamutator.Selector _returnReplacementOperator2595 = metamutator.Selector.of(2595,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2595");

    private static final metamutator.Selector _returnReplacementOperator2596 = metamutator.Selector.of(2596,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2596");

    private static final metamutator.Selector _returnReplacementOperator2597 = metamutator.Selector.of(2597,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2597");

    private static final metamutator.Selector _returnReplacementOperator2598 = metamutator.Selector.of(2598,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2598");

    private static final metamutator.Selector _returnReplacementOperator2599 = metamutator.Selector.of(2599,new String[]{"INIT","NULL"}).id("_returnReplacementOperator2599");

    private static final metamutator.Selector _returnReplacementOperator2600 = metamutator.Selector.of(2600,new String[]{"INIT","NULL"}).id("_returnReplacementOperator2600");

    private static final metamutator.Selector _returnReplacementOperator2601 = metamutator.Selector.of(2601,new String[]{"INIT","NULL"}).id("_returnReplacementOperator2601");

    private static final metamutator.Selector _returnReplacementOperator2602 = metamutator.Selector.of(2602,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2602");

    private static final metamutator.Selector _returnReplacementOperator2603 = metamutator.Selector.of(2603,new String[]{"INIT","NULL"}).id("_returnReplacementOperator2603");

    private static final metamutator.Selector _returnReplacementOperator2604 = metamutator.Selector.of(2604,new String[]{"INIT","NULL"}).id("_returnReplacementOperator2604");

    private static final metamutator.Selector _returnReplacementOperator2605 = metamutator.Selector.of(2605,new String[]{"INIT","NULL"}).id("_returnReplacementOperator2605");

    private static final metamutator.Selector _returnReplacementOperator2606 = metamutator.Selector.of(2606,new String[]{"INIT","NULL"}).id("_returnReplacementOperator2606");

    private static final metamutator.Selector _returnReplacementOperator2607 = metamutator.Selector.of(2607,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2607");

    private static final metamutator.Selector _returnReplacementOperator2608 = metamutator.Selector.of(2608,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2608");

    private static final metamutator.Selector _returnReplacementOperator2609 = metamutator.Selector.of(2609,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2609");

    private static final metamutator.Selector _returnReplacementOperator2610 = metamutator.Selector.of(2610,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2610");

    private static final metamutator.Selector _returnReplacementOperator2611 = metamutator.Selector.of(2611,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2611");

    private static final metamutator.Selector _returnReplacementOperator2612 = metamutator.Selector.of(2612,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2612");

    private static final metamutator.Selector _returnReplacementOperator2613 = metamutator.Selector.of(2613,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2613");

    private static final metamutator.Selector _returnReplacementOperator2614 = metamutator.Selector.of(2614,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2614");

    private static final metamutator.Selector _returnReplacementOperator2615 = metamutator.Selector.of(2615,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2615");

    private static final metamutator.Selector _returnReplacementOperator2616 = metamutator.Selector.of(2616,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2616");

    private static final metamutator.Selector _returnReplacementOperator2617 = metamutator.Selector.of(2617,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2617");

    private static final metamutator.Selector _returnReplacementOperator2618 = metamutator.Selector.of(2618,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2618");

    private static final metamutator.Selector _returnReplacementOperator2619 = metamutator.Selector.of(2619,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2619");

    private static final metamutator.Selector _returnReplacementOperator2620 = metamutator.Selector.of(2620,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2620");

    private static final metamutator.Selector _returnReplacementOperator2621 = metamutator.Selector.of(2621,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2621");

    private static final metamutator.Selector _returnReplacementOperator2622 = metamutator.Selector.of(2622,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2622");

    private static final metamutator.Selector _returnReplacementOperator2623 = metamutator.Selector.of(2623,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2623");

    private static final metamutator.Selector _returnReplacementOperator2624 = metamutator.Selector.of(2624,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2624");

    private static final metamutator.Selector _returnReplacementOperator2625 = metamutator.Selector.of(2625,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2625");

    private static final metamutator.Selector _returnReplacementOperator2626 = metamutator.Selector.of(2626,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2626");

    private static final metamutator.Selector _returnReplacementOperator2627 = metamutator.Selector.of(2627,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2627");

    private static final metamutator.Selector _returnReplacementOperator2628 = metamutator.Selector.of(2628,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2628");

    private static final metamutator.Selector _returnReplacementOperator2629 = metamutator.Selector.of(2629,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2629");

    private static final metamutator.Selector _returnReplacementOperator2630 = metamutator.Selector.of(2630,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2630");

    private static final metamutator.Selector _returnReplacementOperator2631 = metamutator.Selector.of(2631,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2631");

    private static final metamutator.Selector _returnReplacementOperator2632 = metamutator.Selector.of(2632,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2632");

    private static final metamutator.Selector _returnReplacementOperator2633 = metamutator.Selector.of(2633,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2633");

    private static final metamutator.Selector _returnReplacementOperator2634 = metamutator.Selector.of(2634,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2634");

    private static final metamutator.Selector _returnReplacementOperator2635 = metamutator.Selector.of(2635,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2635");

    private static final metamutator.Selector _returnReplacementOperator2636 = metamutator.Selector.of(2636,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2636");

    private static final metamutator.Selector _returnReplacementOperator2637 = metamutator.Selector.of(2637,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2637");

    private static final metamutator.Selector _returnReplacementOperator2638 = metamutator.Selector.of(2638,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2638");

    private static final metamutator.Selector _returnReplacementOperator2639 = metamutator.Selector.of(2639,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2639");

    private static final metamutator.Selector _returnReplacementOperator2640 = metamutator.Selector.of(2640,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2640");

    private static final metamutator.Selector _returnReplacementOperator2641 = metamutator.Selector.of(2641,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2641");

    private static final metamutator.Selector _returnReplacementOperator2642 = metamutator.Selector.of(2642,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2642");

    private static final metamutator.Selector _returnReplacementOperator2643 = metamutator.Selector.of(2643,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2643");

    private static final metamutator.Selector _returnReplacementOperator2644 = metamutator.Selector.of(2644,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2644");

    private static final metamutator.Selector _returnReplacementOperator2645 = metamutator.Selector.of(2645,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2645");

    private static final metamutator.Selector _returnReplacementOperator2646 = metamutator.Selector.of(2646,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2646");

    private static final metamutator.Selector _returnReplacementOperator2647 = metamutator.Selector.of(2647,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2647");

    private static final metamutator.Selector _returnReplacementOperator2648 = metamutator.Selector.of(2648,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2648");

    private static final metamutator.Selector _returnReplacementOperator2649 = metamutator.Selector.of(2649,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2649");

    private static final metamutator.Selector _returnReplacementOperator2650 = metamutator.Selector.of(2650,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2650");

    private static final metamutator.Selector _returnReplacementOperator2651 = metamutator.Selector.of(2651,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2651");

    private static final metamutator.Selector _returnReplacementOperator2652 = metamutator.Selector.of(2652,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperator2652");
}

