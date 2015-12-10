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
            return ((_returnReplacementOperatorHotSpot2634.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (valueIfNull));
        } 
        return ((_returnReplacementOperatorHotSpot2635.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getShortClassName(object.getClass())));
    }

    public static java.lang.String getShortClassName(final java.lang.Class<?> cls) {
        if (cls == null) {
            return ((_returnReplacementOperatorHotSpot2632.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        return ((_returnReplacementOperatorHotSpot2633.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getShortClassName(cls.getName())));
    }

    public static java.lang.String getShortClassName(java.lang.String className) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(className)) {
            return ((_returnReplacementOperatorHotSpot2636.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
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
        return ((_returnReplacementOperatorHotSpot2637.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (out + arrayPrefix));
    }

    public static java.lang.String getSimpleName(final java.lang.Class<?> cls) {
        if (cls == null) {
            return ((_returnReplacementOperatorHotSpot2638.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        return ((_returnReplacementOperatorHotSpot2639.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (cls.getSimpleName()));
    }

    public static java.lang.String getSimpleName(final java.lang.Object object, final java.lang.String valueIfNull) {
        if (object == null) {
            return ((_returnReplacementOperatorHotSpot2640.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (valueIfNull));
        } 
        return ((_returnReplacementOperatorHotSpot2641.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getSimpleName(object.getClass())));
    }

    public static java.lang.String getPackageName(final java.lang.Object object, final java.lang.String valueIfNull) {
        if (object == null) {
            return ((_returnReplacementOperatorHotSpot2622.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (valueIfNull));
        } 
        return ((_returnReplacementOperatorHotSpot2623.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getPackageName(object.getClass())));
    }

    public static java.lang.String getPackageName(final java.lang.Class<?> cls) {
        if (cls == null) {
            return ((_returnReplacementOperatorHotSpot2620.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        return ((_returnReplacementOperatorHotSpot2621.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getPackageName(cls.getName())));
    }

    public static java.lang.String getPackageName(java.lang.String className) {
        if (org.apache.commons.lang3.StringUtils.isEmpty(className)) {
            return ((_returnReplacementOperatorHotSpot2624.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        while ((className.charAt(0)) == '[') {
            className = className.substring(1);
        }
        if (((className.charAt(0)) == 'L') && ((className.charAt(((className.length()) - 1))) == ';')) {
            className = className.substring(1);
        } 
        final int i = className.lastIndexOf(PACKAGE_SEPARATOR_CHAR);
        if (i == (-1)) {
            return ((_returnReplacementOperatorHotSpot2625.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        return ((_returnReplacementOperatorHotSpot2626.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (className.substring(0, i)));
    }

    public static java.lang.String getAbbreviatedName(final java.lang.Class<?> cls, int len) {
        if (cls == null) {
            return ((_returnReplacementOperatorHotSpot2608.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        return ((_returnReplacementOperatorHotSpot2609.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getAbbreviatedName(cls.getName(), len)));
    }

    public static java.lang.String getAbbreviatedName(java.lang.String className, int len) {
        if (len <= 0) {
            throw new java.lang.IllegalArgumentException("len must be > 0");
        } 
        if (className == null) {
            return ((_returnReplacementOperatorHotSpot2610.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
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
        return ((_returnReplacementOperatorHotSpot2611.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.StringUtils.join(output, '.')));
    }

    public static java.util.List<java.lang.Class<?>> getAllSuperclasses(final java.lang.Class<?> cls) {
        if (cls == null) {
            return ((_returnReplacementOperatorHotSpot2651.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        final java.util.List<java.lang.Class<?>> classes = new java.util.ArrayList<java.lang.Class<?>>();
        java.lang.Class<?> superclass = cls.getSuperclass();
        while (superclass != null) {
            classes.add(superclass);
            superclass = superclass.getSuperclass();
        }
        return ((_returnReplacementOperatorHotSpot2652.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (classes));
    }

    public static java.util.List<java.lang.Class<?>> getAllInterfaces(final java.lang.Class<?> cls) {
        if (cls == null) {
            return ((_returnReplacementOperatorHotSpot2649.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        final java.util.LinkedHashSet<java.lang.Class<?>> interfacesFound = new java.util.LinkedHashSet<java.lang.Class<?>>();
        org.apache.commons.lang3.ClassUtils.getAllInterfaces(cls, interfacesFound);
        return ((_returnReplacementOperatorHotSpot2650.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.util.ArrayList<java.lang.Class<?>>(interfacesFound)));
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
            return ((_returnReplacementOperatorHotSpot2645.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        final java.util.List<java.lang.Class<?>> classes = new java.util.ArrayList<java.lang.Class<?>>(classNames.size());
        for (final java.lang.String className : classNames) {
            try {
                classes.add(java.lang.Class.forName(className));
            } catch (final java.lang.Exception ex) {
                classes.add(null);
            }
        }
        return ((_returnReplacementOperatorHotSpot2646.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (classes));
    }

    public static java.util.List<java.lang.String> convertClassesToClassNames(final java.util.List<java.lang.Class<?>> classes) {
        if (classes == null) {
            return ((_returnReplacementOperatorHotSpot2647.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        final java.util.List<java.lang.String> classNames = new java.util.ArrayList<java.lang.String>(classes.size());
        for (final java.lang.Class<?> cls : classes) {
            if (cls == null) {
                classNames.add(null);
            } else {
                classNames.add(cls.getName());
            }
        }
        return ((_returnReplacementOperatorHotSpot2648.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (classNames));
    }

    public static boolean isAssignable(final java.lang.Class<?>[] classArray, final java.lang.Class<?>... toClassArray) {
        return ((_returnReplacementOperatorHotSpot2574.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.isAssignable(classArray, toClassArray, org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(org.apache.commons.lang3.JavaVersion.JAVA_1_5))));
    }

    public static boolean isAssignable(java.lang.Class<?>[] classArray, java.lang.Class<?>[] toClassArray, final boolean autoboxing) {
        if ((org.apache.commons.lang3.ArrayUtils.isSameLength(classArray, toClassArray)) == false) {
            return ((_returnReplacementOperatorHotSpot2575.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if (classArray == null) {
            classArray = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        } 
        if (toClassArray == null) {
            toClassArray = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY;
        } 
        for (int i = 0 ; i < (classArray.length) ; i++) {
            if ((org.apache.commons.lang3.ClassUtils.isAssignable(classArray[i], toClassArray[i], autoboxing)) == false) {
                return ((_returnReplacementOperatorHotSpot2576.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperatorHotSpot2577.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    public static boolean isPrimitiveOrWrapper(final java.lang.Class<?> type) {
        if (type == null) {
            return ((_returnReplacementOperatorHotSpot2579.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperatorHotSpot2580.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((type.isPrimitive()) || (org.apache.commons.lang3.ClassUtils.isPrimitiveWrapper(type))));
    }

    public static boolean isPrimitiveWrapper(final java.lang.Class<?> type) {
        return ((_returnReplacementOperatorHotSpot2581.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.wrapperPrimitiveMap.containsKey(type)));
    }

    public static boolean isAssignable(final java.lang.Class<?> cls, final java.lang.Class<?> toClass) {
        return ((_returnReplacementOperatorHotSpot2557.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.isAssignable(cls, toClass, org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(org.apache.commons.lang3.JavaVersion.JAVA_1_5))));
    }

    public static boolean isAssignable(java.lang.Class<?> cls, final java.lang.Class<?> toClass, final boolean autoboxing) {
        if (toClass == null) {
            return ((_returnReplacementOperatorHotSpot2558.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if (cls == null) {
            return ((_returnReplacementOperatorHotSpot2559.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (!(toClass.isPrimitive())));
        } 
        if (autoboxing) {
            if ((cls.isPrimitive()) && (!(toClass.isPrimitive()))) {
                cls = org.apache.commons.lang3.ClassUtils.primitiveToWrapper(cls);
                if (cls == null) {
                    return ((_returnReplacementOperatorHotSpot2560.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
                } 
            } 
            if ((toClass.isPrimitive()) && (!(cls.isPrimitive()))) {
                cls = org.apache.commons.lang3.ClassUtils.wrapperToPrimitive(cls);
                if (cls == null) {
                    return ((_returnReplacementOperatorHotSpot2561.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
                } 
            } 
        } 
        if (cls.equals(toClass)) {
            return ((_returnReplacementOperatorHotSpot2562.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if (cls.isPrimitive()) {
            if ((toClass.isPrimitive()) == false) {
                return ((_returnReplacementOperatorHotSpot2563.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
            if (java.lang.Integer.TYPE.equals(cls)) {
                return ((_returnReplacementOperatorHotSpot2564.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((java.lang.Long.TYPE.equals(toClass)) || (java.lang.Float.TYPE.equals(toClass))) || (java.lang.Double.TYPE.equals(toClass))));
            } 
            if (java.lang.Long.TYPE.equals(cls)) {
                return ((_returnReplacementOperatorHotSpot2565.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((java.lang.Float.TYPE.equals(toClass)) || (java.lang.Double.TYPE.equals(toClass))));
            } 
            if (java.lang.Boolean.TYPE.equals(cls)) {
                return ((_returnReplacementOperatorHotSpot2566.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
            if (java.lang.Double.TYPE.equals(cls)) {
                return ((_returnReplacementOperatorHotSpot2567.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
            if (java.lang.Float.TYPE.equals(cls)) {
                return ((_returnReplacementOperatorHotSpot2568.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Double.TYPE.equals(toClass)));
            } 
            if (java.lang.Character.TYPE.equals(cls)) {
                return ((_returnReplacementOperatorHotSpot2569.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((((java.lang.Integer.TYPE.equals(toClass)) || (java.lang.Long.TYPE.equals(toClass))) || (java.lang.Float.TYPE.equals(toClass))) || (java.lang.Double.TYPE.equals(toClass))));
            } 
            if (java.lang.Short.TYPE.equals(cls)) {
                return ((_returnReplacementOperatorHotSpot2570.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((((java.lang.Integer.TYPE.equals(toClass)) || (java.lang.Long.TYPE.equals(toClass))) || (java.lang.Float.TYPE.equals(toClass))) || (java.lang.Double.TYPE.equals(toClass))));
            } 
            if (java.lang.Byte.TYPE.equals(cls)) {
                return ((_returnReplacementOperatorHotSpot2571.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((((java.lang.Short.TYPE.equals(toClass)) || (java.lang.Integer.TYPE.equals(toClass))) || (java.lang.Long.TYPE.equals(toClass))) || (java.lang.Float.TYPE.equals(toClass))) || (java.lang.Double.TYPE.equals(toClass))));
            } 
            return ((_returnReplacementOperatorHotSpot2572.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperatorHotSpot2573.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (toClass.isAssignableFrom(cls)));
    }

    public static java.lang.Class<?> primitiveToWrapper(final java.lang.Class<?> cls) {
        java.lang.Class<?> convertedClass = cls;
        if ((cls != null) && (cls.isPrimitive())) {
            convertedClass = primitiveWrapperMap.get(cls);
        } 
        return ((_returnReplacementOperatorHotSpot2587.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (convertedClass));
    }

    public static java.lang.Class<?>[] primitivesToWrappers(final java.lang.Class<?>... classes) {
        if (classes == null) {
            return ((_returnReplacementOperatorHotSpot2589.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        if ((classes.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2590.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (classes));
        } 
        final java.lang.Class<?>[] convertedClasses = new java.lang.Class[classes.length];
        for (int i = 0 ; i < (classes.length) ; i++) {
            convertedClasses[i] = org.apache.commons.lang3.ClassUtils.primitiveToWrapper(classes[i]);
        }
        return ((_returnReplacementOperatorHotSpot2591.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (convertedClasses));
    }

    public static java.lang.Class<?> wrapperToPrimitive(final java.lang.Class<?> cls) {
        return ((_returnReplacementOperatorHotSpot2588.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.wrapperPrimitiveMap.get(cls)));
    }

    public static java.lang.Class<?>[] wrappersToPrimitives(final java.lang.Class<?>... classes) {
        if (classes == null) {
            return ((_returnReplacementOperatorHotSpot2595.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        if ((classes.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2596.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (classes));
        } 
        final java.lang.Class<?>[] convertedClasses = new java.lang.Class[classes.length];
        for (int i = 0 ; i < (classes.length) ; i++) {
            convertedClasses[i] = org.apache.commons.lang3.ClassUtils.wrapperToPrimitive(classes[i]);
        }
        return ((_returnReplacementOperatorHotSpot2597.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (convertedClasses));
    }

    public static boolean isInnerClass(final java.lang.Class<?> cls) {
        return ((_returnReplacementOperatorHotSpot2578.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((cls != null) && ((cls.getEnclosingClass()) != null)));
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
            return ((_returnReplacementOperatorHotSpot2583.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (clazz));
        } catch (final java.lang.ClassNotFoundException ex) {
            final int lastDotIndex = className.lastIndexOf(PACKAGE_SEPARATOR_CHAR);
            if (lastDotIndex != (-1)) {
                try {
                    return ((_returnReplacementOperatorHotSpot2584.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getClass(classLoader, (((className.substring(0, lastDotIndex)) + (org.apache.commons.lang3.ClassUtils.INNER_CLASS_SEPARATOR_CHAR)) + (className.substring((lastDotIndex + 1)))), initialize)));
                } catch (final java.lang.ClassNotFoundException ex2) {
                }
            } 
            throw ex;
        }
    }

    public static java.lang.Class<?> getClass(final java.lang.ClassLoader classLoader, final java.lang.String className) throws java.lang.ClassNotFoundException {
        return ((_returnReplacementOperatorHotSpot2582.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getClass(classLoader, className, true)));
    }

    public static java.lang.Class<?> getClass(final java.lang.String className) throws java.lang.ClassNotFoundException {
        return ((_returnReplacementOperatorHotSpot2585.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getClass(className, true)));
    }

    public static java.lang.Class<?> getClass(final java.lang.String className, final boolean initialize) throws java.lang.ClassNotFoundException {
        final java.lang.ClassLoader contextCL = java.lang.Thread.currentThread().getContextClassLoader();
        final java.lang.ClassLoader loader = contextCL == null ? org.apache.commons.lang3.ClassUtils.class.getClassLoader() : contextCL;
        return ((_returnReplacementOperatorHotSpot2586.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getClass(loader, className, initialize)));
    }

    public static java.lang.reflect.Method getPublicMethod(final java.lang.Class<?> cls, final java.lang.String methodName, final java.lang.Class<?>... parameterTypes) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        final java.lang.reflect.Method declaredMethod = cls.getMethod(methodName, parameterTypes);
        if (java.lang.reflect.Modifier.isPublic(declaredMethod.getDeclaringClass().getModifiers())) {
            return ((_returnReplacementOperatorHotSpot2643.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (declaredMethod));
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
                return ((_returnReplacementOperatorHotSpot2644.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (candidateMethod));
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
        return ((_returnReplacementOperatorHotSpot2642.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (className));
    }

    public static java.lang.Class<?>[] toClass(final java.lang.Object... array) {
        if (array == null) {
            return ((_returnReplacementOperatorHotSpot2592.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } else if ((array.length) == 0) {
            return ((_returnReplacementOperatorHotSpot2593.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY));
        } 
        final java.lang.Class<?>[] classes = new java.lang.Class[array.length];
        for (int i = 0 ; i < (array.length) ; i++) {
            classes[i] = (array[i]) == null ? null : array[i].getClass();
        }
        return ((_returnReplacementOperatorHotSpot2594.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (classes));
    }

    public static java.lang.String getShortCanonicalName(final java.lang.Object object, final java.lang.String valueIfNull) {
        if (object == null) {
            return ((_returnReplacementOperatorHotSpot2629.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (valueIfNull));
        } 
        return ((_returnReplacementOperatorHotSpot2630.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getShortCanonicalName(object.getClass().getName())));
    }

    public static java.lang.String getShortCanonicalName(final java.lang.Class<?> cls) {
        if (cls == null) {
            return ((_returnReplacementOperatorHotSpot2627.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        return ((_returnReplacementOperatorHotSpot2628.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getShortCanonicalName(cls.getName())));
    }

    public static java.lang.String getShortCanonicalName(final java.lang.String canonicalName) {
        return ((_returnReplacementOperatorHotSpot2631.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getShortClassName(org.apache.commons.lang3.ClassUtils.getCanonicalName(canonicalName))));
    }

    public static java.lang.String getPackageCanonicalName(final java.lang.Object object, final java.lang.String valueIfNull) {
        if (object == null) {
            return ((_returnReplacementOperatorHotSpot2617.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (valueIfNull));
        } 
        return ((_returnReplacementOperatorHotSpot2618.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(object.getClass().getName())));
    }

    public static java.lang.String getPackageCanonicalName(final java.lang.Class<?> cls) {
        if (cls == null) {
            return ((_returnReplacementOperatorHotSpot2615.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.StringUtils.EMPTY));
        } 
        return ((_returnReplacementOperatorHotSpot2616.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(cls.getName())));
    }

    public static java.lang.String getPackageCanonicalName(final java.lang.String canonicalName) {
        return ((_returnReplacementOperatorHotSpot2619.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.getPackageName(org.apache.commons.lang3.ClassUtils.getCanonicalName(canonicalName))));
    }

    private static java.lang.String getCanonicalName(java.lang.String className) {
        className = org.apache.commons.lang3.StringUtils.deleteWhitespace(className);
        if (className == null) {
            return ((_returnReplacementOperatorHotSpot2612.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        int dim = 0;
        while (className.startsWith("[")) {
            dim++;
            className = className.substring(1);
        }
        if (dim < 1) {
            return ((_returnReplacementOperatorHotSpot2613.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (className));
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
        return ((_returnReplacementOperatorHotSpot2614.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (canonicalClassNameBuffer.toString()));
    }

    public static java.lang.Iterable<java.lang.Class<?>> hierarchy(final java.lang.Class<?> type) {
        return ((_returnReplacementOperatorHotSpot2598.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.hierarchy(type, org.apache.commons.lang3.ClassUtils.Interfaces.EXCLUDE)));
    }

    public static java.lang.Iterable<java.lang.Class<?>> hierarchy(final java.lang.Class<?> type, final Interfaces interfacesBehavior) {
        final java.lang.Iterable<java.lang.Class<?>> classes = new java.lang.Iterable<java.lang.Class<?>>() {
            @java.lang.Override
            public java.util.Iterator<java.lang.Class<?>> iterator() {
                final org.apache.commons.lang3.mutable.MutableObject<java.lang.Class<?>> next = new org.apache.commons.lang3.mutable.MutableObject<java.lang.Class<?>>(type);
                return ((_returnReplacementOperatorHotSpot2601.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.util.Iterator<java.lang.Class<?>>() {
    @java.lang.Override
    public boolean hasNext() {
        return ((_returnReplacementOperatorHotSpot2599.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((next.getValue()) != null));
    }

    @java.lang.Override
    public java.lang.Class<?> next() {
        final java.lang.Class<?> result = next.getValue();
        next.setValue(result.getSuperclass());
        return ((_returnReplacementOperatorHotSpot2600.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    @java.lang.Override
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}));
            }
        };
        if (interfacesBehavior != (Interfaces.INCLUDE)) {
            return ((_returnReplacementOperatorHotSpot2602.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (classes));
        } 
        return ((_returnReplacementOperatorHotSpot2607.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.lang.Iterable<java.lang.Class<?>>() {
    @java.lang.Override
    public java.util.Iterator<java.lang.Class<?>> iterator() {
        final java.util.Set<java.lang.Class<?>> seenInterfaces = new java.util.HashSet<java.lang.Class<?>>();
        final java.util.Iterator<java.lang.Class<?>> wrapped = classes.iterator();
        return ((_returnReplacementOperatorHotSpot2606.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.util.Iterator<java.lang.Class<?>>() {
    java.util.Iterator<java.lang.Class<?>> interfaces = java.util.Collections.<java.lang.Class<?>>emptySet().iterator();

    @java.lang.Override
    public boolean hasNext() {
        return ((_returnReplacementOperatorHotSpot2603.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((interfaces.hasNext()) || (wrapped.hasNext())));
    }

    @java.lang.Override
    public java.lang.Class<?> next() {
        if (interfaces.hasNext()) {
            final java.lang.Class<?> nextInterface = interfaces.next();
            seenInterfaces.add(nextInterface);
            return ((_returnReplacementOperatorHotSpot2604.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (nextInterface));
        } 
        final java.lang.Class<?> nextSuperclass = wrapped.next();
        final java.util.Set<java.lang.Class<?>> currentInterfaces = new java.util.LinkedHashSet<java.lang.Class<?>>();
        walkInterfaces(currentInterfaces, nextSuperclass);
        interfaces = currentInterfaces.iterator();
        return ((_returnReplacementOperatorHotSpot2605.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (nextSuperclass));
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

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2557 = metamutator.Selector.of(2557,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2557");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2558 = metamutator.Selector.of(2558,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2558");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2559 = metamutator.Selector.of(2559,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2559");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2560 = metamutator.Selector.of(2560,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2560");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2561 = metamutator.Selector.of(2561,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2561");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2562 = metamutator.Selector.of(2562,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2562");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2563 = metamutator.Selector.of(2563,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2563");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2564 = metamutator.Selector.of(2564,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2564");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2565 = metamutator.Selector.of(2565,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2565");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2566 = metamutator.Selector.of(2566,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2566");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2567 = metamutator.Selector.of(2567,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2567");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2568 = metamutator.Selector.of(2568,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2568");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2569 = metamutator.Selector.of(2569,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2569");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2570 = metamutator.Selector.of(2570,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2570");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2571 = metamutator.Selector.of(2571,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2571");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2572 = metamutator.Selector.of(2572,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2572");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2573 = metamutator.Selector.of(2573,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2573");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2574 = metamutator.Selector.of(2574,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2574");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2575 = metamutator.Selector.of(2575,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2575");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2576 = metamutator.Selector.of(2576,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2576");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2577 = metamutator.Selector.of(2577,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2577");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2578 = metamutator.Selector.of(2578,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2578");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2579 = metamutator.Selector.of(2579,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2579");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2580 = metamutator.Selector.of(2580,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2580");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2581 = metamutator.Selector.of(2581,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2581");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2582 = metamutator.Selector.of(2582,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2582");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2583 = metamutator.Selector.of(2583,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2583");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2584 = metamutator.Selector.of(2584,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2584");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2585 = metamutator.Selector.of(2585,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2585");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2586 = metamutator.Selector.of(2586,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2586");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2587 = metamutator.Selector.of(2587,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2587");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2588 = metamutator.Selector.of(2588,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2588");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2589 = metamutator.Selector.of(2589,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2589");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2590 = metamutator.Selector.of(2590,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2590");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2591 = metamutator.Selector.of(2591,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2591");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2592 = metamutator.Selector.of(2592,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2592");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2593 = metamutator.Selector.of(2593,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2593");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2594 = metamutator.Selector.of(2594,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2594");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2595 = metamutator.Selector.of(2595,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2595");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2596 = metamutator.Selector.of(2596,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2596");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2597 = metamutator.Selector.of(2597,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2597");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2598 = metamutator.Selector.of(2598,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2598");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2599 = metamutator.Selector.of(2599,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot2599");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2600 = metamutator.Selector.of(2600,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot2600");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2601 = metamutator.Selector.of(2601,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot2601");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2602 = metamutator.Selector.of(2602,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2602");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2603 = metamutator.Selector.of(2603,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot2603");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2604 = metamutator.Selector.of(2604,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot2604");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2605 = metamutator.Selector.of(2605,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot2605");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2606 = metamutator.Selector.of(2606,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot2606");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2607 = metamutator.Selector.of(2607,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2607");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2608 = metamutator.Selector.of(2608,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2608");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2609 = metamutator.Selector.of(2609,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2609");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2610 = metamutator.Selector.of(2610,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2610");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2611 = metamutator.Selector.of(2611,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2611");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2612 = metamutator.Selector.of(2612,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2612");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2613 = metamutator.Selector.of(2613,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2613");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2614 = metamutator.Selector.of(2614,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2614");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2615 = metamutator.Selector.of(2615,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2615");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2616 = metamutator.Selector.of(2616,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2616");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2617 = metamutator.Selector.of(2617,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2617");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2618 = metamutator.Selector.of(2618,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2618");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2619 = metamutator.Selector.of(2619,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2619");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2620 = metamutator.Selector.of(2620,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2620");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2621 = metamutator.Selector.of(2621,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2621");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2622 = metamutator.Selector.of(2622,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2622");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2623 = metamutator.Selector.of(2623,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2623");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2624 = metamutator.Selector.of(2624,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2624");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2625 = metamutator.Selector.of(2625,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2625");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2626 = metamutator.Selector.of(2626,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2626");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2627 = metamutator.Selector.of(2627,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2627");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2628 = metamutator.Selector.of(2628,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2628");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2629 = metamutator.Selector.of(2629,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2629");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2630 = metamutator.Selector.of(2630,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2630");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2631 = metamutator.Selector.of(2631,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2631");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2632 = metamutator.Selector.of(2632,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2632");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2633 = metamutator.Selector.of(2633,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2633");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2634 = metamutator.Selector.of(2634,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2634");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2635 = metamutator.Selector.of(2635,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2635");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2636 = metamutator.Selector.of(2636,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2636");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2637 = metamutator.Selector.of(2637,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2637");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2638 = metamutator.Selector.of(2638,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2638");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2639 = metamutator.Selector.of(2639,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2639");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2640 = metamutator.Selector.of(2640,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2640");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2641 = metamutator.Selector.of(2641,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2641");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2642 = metamutator.Selector.of(2642,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2642");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2643 = metamutator.Selector.of(2643,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2643");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2644 = metamutator.Selector.of(2644,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2644");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2645 = metamutator.Selector.of(2645,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2645");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2646 = metamutator.Selector.of(2646,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2646");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2647 = metamutator.Selector.of(2647,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2647");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2648 = metamutator.Selector.of(2648,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2648");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2649 = metamutator.Selector.of(2649,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2649");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2650 = metamutator.Selector.of(2650,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2650");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2651 = metamutator.Selector.of(2651,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2651");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2652 = metamutator.Selector.of(2652,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassUtils.class).id("_returnReplacementOperatorHotSpot2652");
}

