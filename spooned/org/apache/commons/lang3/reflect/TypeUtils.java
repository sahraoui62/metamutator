package org.apache.commons.lang3.reflect;


public class TypeUtils {
    public static class WildcardTypeBuilder implements org.apache.commons.lang3.builder.Builder<java.lang.reflect.WildcardType> {
        private WildcardTypeBuilder() {
        }

        private java.lang.reflect.Type[] upperBounds;

        private java.lang.reflect.Type[] lowerBounds;

        public org.apache.commons.lang3.reflect.TypeUtils.WildcardTypeBuilder withUpperBounds(final java.lang.reflect.Type... bounds) {
            this.upperBounds = bounds;
            return this;
        }

        public org.apache.commons.lang3.reflect.TypeUtils.WildcardTypeBuilder withLowerBounds(final java.lang.reflect.Type... bounds) {
            this.lowerBounds = bounds;
            return this;
        }

        @java.lang.Override
        public java.lang.reflect.WildcardType build() {
            return new org.apache.commons.lang3.reflect.TypeUtils.WildcardTypeImpl(upperBounds , lowerBounds);
        }
    }

    private static final class GenericArrayTypeImpl implements java.lang.reflect.GenericArrayType {
        private final java.lang.reflect.Type componentType;

        private GenericArrayTypeImpl(final java.lang.reflect.Type componentType) {
            this.componentType = componentType;
        }

        @java.lang.Override
        public java.lang.reflect.Type getGenericComponentType() {
            return componentType;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return org.apache.commons.lang3.reflect.TypeUtils.toString(this);
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            return (obj == (this)) || ((obj instanceof java.lang.reflect.GenericArrayType) && (org.apache.commons.lang3.reflect.TypeUtils.equals(this, ((java.lang.reflect.GenericArrayType)(obj)))));
        }

        @java.lang.Override
        public int hashCode() {
            int result = 67 << 4;
            result |= componentType.hashCode();
            return result;
        }
    }

    private static final class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType {
        private final java.lang.Class<?> raw;

        private final java.lang.reflect.Type useOwner;

        private final java.lang.reflect.Type[] typeArguments;

        private ParameterizedTypeImpl(final java.lang.Class<?> raw ,final java.lang.reflect.Type useOwner ,final java.lang.reflect.Type[] typeArguments) {
            this.raw = raw;
            this.useOwner = useOwner;
            this.typeArguments = typeArguments.clone();
        }

        @java.lang.Override
        public java.lang.reflect.Type getRawType() {
            return raw;
        }

        @java.lang.Override
        public java.lang.reflect.Type getOwnerType() {
            return useOwner;
        }

        @java.lang.Override
        public java.lang.reflect.Type[] getActualTypeArguments() {
            return typeArguments.clone();
        }

        @java.lang.Override
        public java.lang.String toString() {
            return org.apache.commons.lang3.reflect.TypeUtils.toString(this);
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            return (obj == (this)) || ((obj instanceof java.lang.reflect.ParameterizedType) && (org.apache.commons.lang3.reflect.TypeUtils.equals(this, ((java.lang.reflect.ParameterizedType)(obj)))));
        }

        @java.lang.SuppressWarnings(value = "deprecation")
        @java.lang.Override
        public int hashCode() {
            int result = 71 << 4;
            result |= raw.hashCode();
            result <<= 4;
            result |= org.apache.commons.lang3.ObjectUtils.hashCode(useOwner);
            result <<= 8;
            result |= java.util.Arrays.hashCode(typeArguments);
            return result;
        }
    }

    private static final class WildcardTypeImpl implements java.lang.reflect.WildcardType {
        private static final java.lang.reflect.Type[] EMPTY_BOUNDS = new java.lang.reflect.Type[0];

        private final java.lang.reflect.Type[] upperBounds;

        private final java.lang.reflect.Type[] lowerBounds;

        private WildcardTypeImpl(final java.lang.reflect.Type[] upperBounds ,final java.lang.reflect.Type[] lowerBounds) {
            this.upperBounds = org.apache.commons.lang3.ObjectUtils.defaultIfNull(upperBounds, EMPTY_BOUNDS);
            this.lowerBounds = org.apache.commons.lang3.ObjectUtils.defaultIfNull(lowerBounds, EMPTY_BOUNDS);
        }

        @java.lang.Override
        public java.lang.reflect.Type[] getUpperBounds() {
            return upperBounds.clone();
        }

        @java.lang.Override
        public java.lang.reflect.Type[] getLowerBounds() {
            return lowerBounds.clone();
        }

        @java.lang.Override
        public java.lang.String toString() {
            return org.apache.commons.lang3.reflect.TypeUtils.toString(this);
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            return (obj == (this)) || ((obj instanceof java.lang.reflect.WildcardType) && (org.apache.commons.lang3.reflect.TypeUtils.equals(this, ((java.lang.reflect.WildcardType)(obj)))));
        }

        @java.lang.Override
        public int hashCode() {
            int result = 73 << 8;
            result |= java.util.Arrays.hashCode(upperBounds);
            result <<= 8;
            result |= java.util.Arrays.hashCode(lowerBounds);
            return result;
        }
    }

    public static final java.lang.reflect.WildcardType WILDCARD_ALL = org.apache.commons.lang3.reflect.TypeUtils.wildcardType().withUpperBounds(java.lang.Object.class).build();

    public TypeUtils() {
        super();
    }

    public static boolean isAssignable(final java.lang.reflect.Type type, final java.lang.reflect.Type toType) {
        return org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, toType, null);
    }

    private static boolean isAssignable(final java.lang.reflect.Type type, final java.lang.reflect.Type toType, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        if ((toType == null) || (toType instanceof java.lang.Class<?>)) {
            return org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, ((java.lang.Class<?>)(toType)));
        } 
        if (toType instanceof java.lang.reflect.ParameterizedType) {
            return org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, ((java.lang.reflect.ParameterizedType)(toType)), typeVarAssigns);
        } 
        if (toType instanceof java.lang.reflect.GenericArrayType) {
            return org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, ((java.lang.reflect.GenericArrayType)(toType)), typeVarAssigns);
        } 
        if (toType instanceof java.lang.reflect.WildcardType) {
            return org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, ((java.lang.reflect.WildcardType)(toType)), typeVarAssigns);
        } 
        if (toType instanceof java.lang.reflect.TypeVariable<?>) {
            return org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, ((java.lang.reflect.TypeVariable<?>)(toType)), typeVarAssigns);
        } 
        throw new java.lang.IllegalStateException(("found an unhandled type: " + toType));
    }

    private static boolean isAssignable(final java.lang.reflect.Type type, final java.lang.Class<?> toClass) {
        if (type == null) {
            return (toClass == null) || (!(toClass.isPrimitive()));
        } 
        if (toClass == null) {
            return false;
        } 
        if (toClass.equals(type)) {
            return true;
        } 
        if (type instanceof java.lang.Class<?>) {
            return org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class<?>)(type)), toClass);
        } 
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return org.apache.commons.lang3.reflect.TypeUtils.isAssignable(org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.ParameterizedType)(type))), toClass);
        } 
        if (type instanceof java.lang.reflect.TypeVariable<?>) {
            for (final java.lang.reflect.Type bound : ((java.lang.reflect.TypeVariable<?>)(type)).getBounds()) {
                if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toClass)) {
                    return true;
                } 
            }
            return false;
        } 
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return (toClass.equals(java.lang.Object.class)) || ((toClass.isArray()) && (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(((java.lang.reflect.GenericArrayType)(type)).getGenericComponentType(), toClass.getComponentType())));
        } 
        if (type instanceof java.lang.reflect.WildcardType) {
            return false;
        } 
        throw new java.lang.IllegalStateException(("found an unhandled type: " + type));
    }

    private static boolean isAssignable(final java.lang.reflect.Type type, final java.lang.reflect.ParameterizedType toParameterizedType, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        if (type == null) {
            return true;
        } 
        if (toParameterizedType == null) {
            return false;
        } 
        if (toParameterizedType.equals(type)) {
            return true;
        } 
        final java.lang.Class<?> toClass = org.apache.commons.lang3.reflect.TypeUtils.getRawType(toParameterizedType);
        final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> fromTypeVarAssigns = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(type, toClass, null);
        if (fromTypeVarAssigns == null) {
            return false;
        } 
        if (fromTypeVarAssigns.isEmpty()) {
            return true;
        } 
        final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> toTypeVarAssigns = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(toParameterizedType, toClass, typeVarAssigns);
        for (final java.lang.reflect.TypeVariable<?> var : toTypeVarAssigns.keySet()) {
            final java.lang.reflect.Type toTypeArg = org.apache.commons.lang3.reflect.TypeUtils.unrollVariableAssignments(var, toTypeVarAssigns);
            final java.lang.reflect.Type fromTypeArg = org.apache.commons.lang3.reflect.TypeUtils.unrollVariableAssignments(var, fromTypeVarAssigns);
            if (((fromTypeArg != null) && (!(toTypeArg.equals(fromTypeArg)))) && (!((toTypeArg instanceof java.lang.reflect.WildcardType) && (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(fromTypeArg, toTypeArg, typeVarAssigns))))) {
                return false;
            } 
        }
        return true;
    }

    private static java.lang.reflect.Type unrollVariableAssignments(java.lang.reflect.TypeVariable<?> var, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        java.lang.reflect.Type result;
        do {
            result = typeVarAssigns.get(var);
            if ((result instanceof java.lang.reflect.TypeVariable<?>) && (!(result.equals(var)))) {
                var = ((java.lang.reflect.TypeVariable<?>)(result));
                continue;
            } 
            break;
        } while (true );
        return result;
    }

    private static boolean isAssignable(final java.lang.reflect.Type type, final java.lang.reflect.GenericArrayType toGenericArrayType, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        if (type == null) {
            return true;
        } 
        if (toGenericArrayType == null) {
            return false;
        } 
        if (toGenericArrayType.equals(type)) {
            return true;
        } 
        final java.lang.reflect.Type toComponentType = toGenericArrayType.getGenericComponentType();
        if (type instanceof java.lang.Class<?>) {
            final java.lang.Class<?> cls = ((java.lang.Class<?>)(type));
            return (cls.isArray()) && (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(cls.getComponentType(), toComponentType, typeVarAssigns));
        } 
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return org.apache.commons.lang3.reflect.TypeUtils.isAssignable(((java.lang.reflect.GenericArrayType)(type)).getGenericComponentType(), toComponentType, typeVarAssigns);
        } 
        if (type instanceof java.lang.reflect.WildcardType) {
            for (final java.lang.reflect.Type bound : org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(((java.lang.reflect.WildcardType)(type)))) {
                if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toGenericArrayType)) {
                    return true;
                } 
            }
            return false;
        } 
        if (type instanceof java.lang.reflect.TypeVariable<?>) {
            for (final java.lang.reflect.Type bound : org.apache.commons.lang3.reflect.TypeUtils.getImplicitBounds(((java.lang.reflect.TypeVariable<?>)(type)))) {
                if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toGenericArrayType)) {
                    return true;
                } 
            }
            return false;
        } 
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return false;
        } 
        throw new java.lang.IllegalStateException(("found an unhandled type: " + type));
    }

    private static boolean isAssignable(final java.lang.reflect.Type type, final java.lang.reflect.WildcardType toWildcardType, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        if (type == null) {
            return true;
        } 
        if (toWildcardType == null) {
            return false;
        } 
        if (toWildcardType.equals(type)) {
            return true;
        } 
        final java.lang.reflect.Type[] toUpperBounds = org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(toWildcardType);
        final java.lang.reflect.Type[] toLowerBounds = org.apache.commons.lang3.reflect.TypeUtils.getImplicitLowerBounds(toWildcardType);
        if (type instanceof java.lang.reflect.WildcardType) {
            final java.lang.reflect.WildcardType wildcardType = ((java.lang.reflect.WildcardType)(type));
            final java.lang.reflect.Type[] upperBounds = org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(wildcardType);
            final java.lang.reflect.Type[] lowerBounds = org.apache.commons.lang3.reflect.TypeUtils.getImplicitLowerBounds(wildcardType);
            for (java.lang.reflect.Type toBound : toUpperBounds) {
                toBound = org.apache.commons.lang3.reflect.TypeUtils.substituteTypeVariables(toBound, typeVarAssigns);
                for (final java.lang.reflect.Type bound : upperBounds) {
                    if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toBound, typeVarAssigns))) {
                        return false;
                    } 
                }
            }
            for (java.lang.reflect.Type toBound : toLowerBounds) {
                toBound = org.apache.commons.lang3.reflect.TypeUtils.substituteTypeVariables(toBound, typeVarAssigns);
                for (final java.lang.reflect.Type bound : lowerBounds) {
                    if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(toBound, bound, typeVarAssigns))) {
                        return false;
                    } 
                }
            }
            return true;
        } 
        for (final java.lang.reflect.Type toBound : toUpperBounds) {
            if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, org.apache.commons.lang3.reflect.TypeUtils.substituteTypeVariables(toBound, typeVarAssigns), typeVarAssigns))) {
                return false;
            } 
        }
        for (final java.lang.reflect.Type toBound : toLowerBounds) {
            if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(org.apache.commons.lang3.reflect.TypeUtils.substituteTypeVariables(toBound, typeVarAssigns), type, typeVarAssigns))) {
                return false;
            } 
        }
        return true;
    }

    private static boolean isAssignable(final java.lang.reflect.Type type, final java.lang.reflect.TypeVariable<?> toTypeVariable, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        if (type == null) {
            return true;
        } 
        if (toTypeVariable == null) {
            return false;
        } 
        if (toTypeVariable.equals(type)) {
            return true;
        } 
        if (type instanceof java.lang.reflect.TypeVariable<?>) {
            final java.lang.reflect.Type[] bounds = org.apache.commons.lang3.reflect.TypeUtils.getImplicitBounds(((java.lang.reflect.TypeVariable<?>)(type)));
            for (final java.lang.reflect.Type bound : bounds) {
                if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toTypeVariable, typeVarAssigns)) {
                    return true;
                } 
            }
        } 
        if ((((type instanceof java.lang.Class<?>) || (type instanceof java.lang.reflect.ParameterizedType)) || (type instanceof java.lang.reflect.GenericArrayType)) || (type instanceof java.lang.reflect.WildcardType)) {
            return false;
        } 
        throw new java.lang.IllegalStateException(("found an unhandled type: " + type));
    }

    private static java.lang.reflect.Type substituteTypeVariables(final java.lang.reflect.Type type, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        if ((type instanceof java.lang.reflect.TypeVariable<?>) && (typeVarAssigns != null)) {
            final java.lang.reflect.Type replacementType = typeVarAssigns.get(type);
            if (replacementType == null) {
                throw new java.lang.IllegalArgumentException(("missing assignment type for type variable " + type));
            } 
            return replacementType;
        } 
        return type;
    }

    public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(final java.lang.reflect.ParameterizedType type) {
        return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(type, org.apache.commons.lang3.reflect.TypeUtils.getRawType(type), null);
    }

    public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(final java.lang.reflect.Type type, final java.lang.Class<?> toClass) {
        return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(type, toClass, null);
    }

    private static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(final java.lang.reflect.Type type, final java.lang.Class<?> toClass, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> subtypeVarAssigns) {
        if (type instanceof java.lang.Class<?>) {
            return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.Class<?>)(type)), toClass, subtypeVarAssigns);
        } 
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.reflect.ParameterizedType)(type)), toClass, subtypeVarAssigns);
        } 
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.reflect.GenericArrayType)(type)).getGenericComponentType(), (toClass.isArray() ? toClass.getComponentType() : toClass), subtypeVarAssigns);
        } 
        if (type instanceof java.lang.reflect.WildcardType) {
            for (final java.lang.reflect.Type bound : org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(((java.lang.reflect.WildcardType)(type)))) {
                if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toClass)) {
                    return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(bound, toClass, subtypeVarAssigns);
                } 
            }
            return null;
        } 
        if (type instanceof java.lang.reflect.TypeVariable<?>) {
            for (final java.lang.reflect.Type bound : org.apache.commons.lang3.reflect.TypeUtils.getImplicitBounds(((java.lang.reflect.TypeVariable<?>)(type)))) {
                if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toClass)) {
                    return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(bound, toClass, subtypeVarAssigns);
                } 
            }
            return null;
        } 
        throw new java.lang.IllegalStateException(("found an unhandled type: " + type));
    }

    private static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(final java.lang.reflect.ParameterizedType parameterizedType, final java.lang.Class<?> toClass, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> subtypeVarAssigns) {
        final java.lang.Class<?> cls = org.apache.commons.lang3.reflect.TypeUtils.getRawType(parameterizedType);
        if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(cls, toClass))) {
            return null;
        } 
        final java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
        java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns;
        if (ownerType instanceof java.lang.reflect.ParameterizedType) {
            final java.lang.reflect.ParameterizedType parameterizedOwnerType = ((java.lang.reflect.ParameterizedType)(ownerType));
            typeVarAssigns = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(parameterizedOwnerType, org.apache.commons.lang3.reflect.TypeUtils.getRawType(parameterizedOwnerType), subtypeVarAssigns);
        } else {
            typeVarAssigns = subtypeVarAssigns == null ? new java.util.HashMap<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>() : new java.util.HashMap<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>(subtypeVarAssigns);
        }
        final java.lang.reflect.Type[] typeArgs = parameterizedType.getActualTypeArguments();
        final java.lang.reflect.TypeVariable<?>[] typeParams = cls.getTypeParameters();
        for (int i = 0 ; i < (typeParams.length) ; i++) {
            final java.lang.reflect.Type typeArg = typeArgs[i];
            typeVarAssigns.put(typeParams[i], (typeVarAssigns.containsKey(typeArg) ? typeVarAssigns.get(typeArg) : typeArg));
        }
        if (toClass.equals(cls)) {
            return typeVarAssigns;
        } 
        return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(org.apache.commons.lang3.reflect.TypeUtils.getClosestParentType(cls, toClass), toClass, typeVarAssigns);
    }

    private static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(java.lang.Class<?> cls, final java.lang.Class<?> toClass, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> subtypeVarAssigns) {
        if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(cls, toClass))) {
            return null;
        } 
        if (cls.isPrimitive()) {
            if (toClass.isPrimitive()) {
                return new java.util.HashMap<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>();
            } 
            cls = org.apache.commons.lang3.ClassUtils.primitiveToWrapper(cls);
        } 
        final java.util.HashMap<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns = subtypeVarAssigns == null ? new java.util.HashMap<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>() : new java.util.HashMap<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>(subtypeVarAssigns);
        if (toClass.equals(cls)) {
            return typeVarAssigns;
        } 
        return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(org.apache.commons.lang3.reflect.TypeUtils.getClosestParentType(cls, toClass), toClass, typeVarAssigns);
    }

    public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> determineTypeArguments(final java.lang.Class<?> cls, final java.lang.reflect.ParameterizedType superType) {
        org.apache.commons.lang3.Validate.notNull(cls, "cls is null");
        org.apache.commons.lang3.Validate.notNull(superType, "superType is null");
        final java.lang.Class<?> superClass = org.apache.commons.lang3.reflect.TypeUtils.getRawType(superType);
        if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(cls, superClass))) {
            return null;
        } 
        if (cls.equals(superClass)) {
            return org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(superType, superClass, null);
        } 
        final java.lang.reflect.Type midType = org.apache.commons.lang3.reflect.TypeUtils.getClosestParentType(cls, superClass);
        if (midType instanceof java.lang.Class<?>) {
            return org.apache.commons.lang3.reflect.TypeUtils.determineTypeArguments(((java.lang.Class<?>)(midType)), superType);
        } 
        final java.lang.reflect.ParameterizedType midParameterizedType = ((java.lang.reflect.ParameterizedType)(midType));
        final java.lang.Class<?> midClass = org.apache.commons.lang3.reflect.TypeUtils.getRawType(midParameterizedType);
        final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns = org.apache.commons.lang3.reflect.TypeUtils.determineTypeArguments(midClass, superType);
        org.apache.commons.lang3.reflect.TypeUtils.mapTypeVariablesToArguments(cls, midParameterizedType, typeVarAssigns);
        return typeVarAssigns;
    }

    private static <T>void mapTypeVariablesToArguments(final java.lang.Class<T> cls, final java.lang.reflect.ParameterizedType parameterizedType, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        final java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof java.lang.reflect.ParameterizedType) {
            org.apache.commons.lang3.reflect.TypeUtils.mapTypeVariablesToArguments(cls, ((java.lang.reflect.ParameterizedType)(ownerType)), typeVarAssigns);
        } 
        final java.lang.reflect.Type[] typeArgs = parameterizedType.getActualTypeArguments();
        final java.lang.reflect.TypeVariable<?>[] typeVars = org.apache.commons.lang3.reflect.TypeUtils.getRawType(parameterizedType).getTypeParameters();
        final java.util.List<java.lang.reflect.TypeVariable<java.lang.Class<T>>> typeVarList = java.util.Arrays.asList(cls.getTypeParameters());
        for (int i = 0 ; i < (typeArgs.length) ; i++) {
            final java.lang.reflect.TypeVariable<?> typeVar = typeVars[i];
            final java.lang.reflect.Type typeArg = typeArgs[i];
            if ((typeVarList.contains(typeArg)) && (typeVarAssigns.containsKey(typeVar))) {
                typeVarAssigns.put(((java.lang.reflect.TypeVariable<?>)(typeArg)), typeVarAssigns.get(typeVar));
            } 
        }
    }

    private static java.lang.reflect.Type getClosestParentType(final java.lang.Class<?> cls, final java.lang.Class<?> superClass) {
        if (superClass.isInterface()) {
            final java.lang.reflect.Type[] interfaceTypes = cls.getGenericInterfaces();
            java.lang.reflect.Type genericInterface = null;
            for (final java.lang.reflect.Type midType : interfaceTypes) {
                java.lang.Class<?> midClass = null;
                if (midType instanceof java.lang.reflect.ParameterizedType) {
                    midClass = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.ParameterizedType)(midType)));
                } else if (midType instanceof java.lang.Class<?>) {
                    midClass = ((java.lang.Class<?>)(midType));
                } else {
                    throw new java.lang.IllegalStateException((("Unexpected generic" + " interface type found: ") + midType));
                }
                if ((org.apache.commons.lang3.reflect.TypeUtils.isAssignable(midClass, superClass)) && (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(genericInterface, ((java.lang.reflect.Type)(midClass))))) {
                    genericInterface = midType;
                } 
            }
            if (genericInterface != null) {
                return genericInterface;
            } 
        } 
        return cls.getGenericSuperclass();
    }

    public static boolean isInstance(final java.lang.Object value, final java.lang.reflect.Type type) {
        if (type == null) {
            return false;
        } 
        return value == null ? (!(type instanceof java.lang.Class<?>)) || (!(((java.lang.Class<?>)(type)).isPrimitive())) : org.apache.commons.lang3.reflect.TypeUtils.isAssignable(value.getClass(), type, null);
    }

    public static java.lang.reflect.Type[] normalizeUpperBounds(final java.lang.reflect.Type[] bounds) {
        org.apache.commons.lang3.Validate.notNull(bounds, "null value specified for bounds array");
        if ((bounds.length) < 2) {
            return bounds;
        } 
        final java.util.Set<java.lang.reflect.Type> types = new java.util.HashSet<java.lang.reflect.Type>(bounds.length);
        for (final java.lang.reflect.Type type1 : bounds) {
            boolean subtypeFound = false;
            for (final java.lang.reflect.Type type2 : bounds) {
                if ((type1 != type2) && (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type2, type1, null))) {
                    subtypeFound = true;
                    break;
                } 
            }
            if (!subtypeFound) {
                types.add(type1);
            } 
        }
        return types.toArray(new java.lang.reflect.Type[types.size()]);
    }

    public static java.lang.reflect.Type[] getImplicitBounds(final java.lang.reflect.TypeVariable<?> typeVariable) {
        org.apache.commons.lang3.Validate.notNull(typeVariable, "typeVariable is null");
        final java.lang.reflect.Type[] bounds = typeVariable.getBounds();
        return (bounds.length) == 0 ? new java.lang.reflect.Type[]{ java.lang.Object.class } : org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(bounds);
    }

    public static java.lang.reflect.Type[] getImplicitUpperBounds(final java.lang.reflect.WildcardType wildcardType) {
        org.apache.commons.lang3.Validate.notNull(wildcardType, "wildcardType is null");
        final java.lang.reflect.Type[] bounds = wildcardType.getUpperBounds();
        return (bounds.length) == 0 ? new java.lang.reflect.Type[]{ java.lang.Object.class } : org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(bounds);
    }

    public static java.lang.reflect.Type[] getImplicitLowerBounds(final java.lang.reflect.WildcardType wildcardType) {
        org.apache.commons.lang3.Validate.notNull(wildcardType, "wildcardType is null");
        final java.lang.reflect.Type[] bounds = wildcardType.getLowerBounds();
        return (bounds.length) == 0 ? new java.lang.reflect.Type[]{ null } : bounds;
    }

    public static boolean typesSatisfyVariables(final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        org.apache.commons.lang3.Validate.notNull(typeVarAssigns, "typeVarAssigns is null");
        for (final java.util.Map.Entry<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> entry : typeVarAssigns.entrySet()) {
            final java.lang.reflect.TypeVariable<?> typeVar = entry.getKey();
            final java.lang.reflect.Type type = entry.getValue();
            for (final java.lang.reflect.Type bound : org.apache.commons.lang3.reflect.TypeUtils.getImplicitBounds(typeVar)) {
                if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, org.apache.commons.lang3.reflect.TypeUtils.substituteTypeVariables(bound, typeVarAssigns), typeVarAssigns))) {
                    return false;
                } 
            }
        }
        return true;
    }

    private static java.lang.Class<?> getRawType(final java.lang.reflect.ParameterizedType parameterizedType) {
        final java.lang.reflect.Type rawType = parameterizedType.getRawType();
        if (!(rawType instanceof java.lang.Class<?>)) {
            throw new java.lang.IllegalStateException(("Wait... What!? Type of rawType: " + rawType));
        } 
        return ((java.lang.Class<?>)(rawType));
    }

    public static java.lang.Class<?> getRawType(final java.lang.reflect.Type type, final java.lang.reflect.Type assigningType) {
        if (type instanceof java.lang.Class<?>) {
            return ((java.lang.Class<?>)(type));
        } 
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.ParameterizedType)(type)));
        } 
        if (type instanceof java.lang.reflect.TypeVariable<?>) {
            if (assigningType == null) {
                return null;
            } 
            final java.lang.Object genericDeclaration = ((java.lang.reflect.TypeVariable<?>)(type)).getGenericDeclaration();
            if (!(genericDeclaration instanceof java.lang.Class<?>)) {
                return null;
            } 
            final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(assigningType, ((java.lang.Class<?>)(genericDeclaration)));
            if (typeVarAssigns == null) {
                return null;
            } 
            final java.lang.reflect.Type typeArgument = typeVarAssigns.get(type);
            if (typeArgument == null) {
                return null;
            } 
            return org.apache.commons.lang3.reflect.TypeUtils.getRawType(typeArgument, assigningType);
        } 
        if (type instanceof java.lang.reflect.GenericArrayType) {
            final java.lang.Class<?> rawComponentType = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.GenericArrayType)(type)).getGenericComponentType(), assigningType);
            return java.lang.reflect.Array.newInstance(rawComponentType, 0).getClass();
        } 
        if (type instanceof java.lang.reflect.WildcardType) {
            return null;
        } 
        throw new java.lang.IllegalArgumentException(("unknown type: " + type));
    }

    public static boolean isArrayType(final java.lang.reflect.Type type) {
        return (type instanceof java.lang.reflect.GenericArrayType) || ((type instanceof java.lang.Class<?>) && (((java.lang.Class<?>)(type)).isArray()));
    }

    public static java.lang.reflect.Type getArrayComponentType(final java.lang.reflect.Type type) {
        if (type instanceof java.lang.Class<?>) {
            final java.lang.Class<?> clazz = ((java.lang.Class<?>)(type));
            return clazz.isArray() ? clazz.getComponentType() : null;
        } 
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return ((java.lang.reflect.GenericArrayType)(type)).getGenericComponentType();
        } 
        return null;
    }

    public static java.lang.reflect.Type unrollVariables(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeArguments, final java.lang.reflect.Type type) {
        if (typeArguments == null) {
            typeArguments = java.util.Collections.<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>emptyMap();
        } 
        if (org.apache.commons.lang3.reflect.TypeUtils.containsTypeVariables(type)) {
            if (type instanceof java.lang.reflect.TypeVariable<?>) {
                return org.apache.commons.lang3.reflect.TypeUtils.unrollVariables(typeArguments, typeArguments.get(type));
            } 
            if (type instanceof java.lang.reflect.ParameterizedType) {
                final java.lang.reflect.ParameterizedType p = ((java.lang.reflect.ParameterizedType)(type));
                final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> parameterizedTypeArguments;
                if ((p.getOwnerType()) == null) {
                    parameterizedTypeArguments = typeArguments;
                } else {
                    parameterizedTypeArguments = new java.util.HashMap<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>(typeArguments);
                    parameterizedTypeArguments.putAll(org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(p));
                }
                final java.lang.reflect.Type[] args = p.getActualTypeArguments();
                for (int i = 0 ; i < (args.length) ; i++) {
                    final java.lang.reflect.Type unrolled = org.apache.commons.lang3.reflect.TypeUtils.unrollVariables(parameterizedTypeArguments, args[i]);
                    if (unrolled != null) {
                        args[i] = unrolled;
                    } 
                }
                return org.apache.commons.lang3.reflect.TypeUtils.parameterizeWithOwner(p.getOwnerType(), ((java.lang.Class<?>)(p.getRawType())), args);
            } 
            if (type instanceof java.lang.reflect.WildcardType) {
                final java.lang.reflect.WildcardType wild = ((java.lang.reflect.WildcardType)(type));
                return org.apache.commons.lang3.reflect.TypeUtils.wildcardType().withUpperBounds(org.apache.commons.lang3.reflect.TypeUtils.unrollBounds(typeArguments, wild.getUpperBounds())).withLowerBounds(org.apache.commons.lang3.reflect.TypeUtils.unrollBounds(typeArguments, wild.getLowerBounds())).build();
            } 
        } 
        return type;
    }

    private static java.lang.reflect.Type[] unrollBounds(final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeArguments, final java.lang.reflect.Type[] bounds) {
        java.lang.reflect.Type[] result = bounds;
        int i = 0;
        for ( ; i < (result.length) ; i++) {
            final java.lang.reflect.Type unrolled = org.apache.commons.lang3.reflect.TypeUtils.unrollVariables(typeArguments, result[i]);
            if (unrolled == null) {
                result = org.apache.commons.lang3.ArrayUtils.remove(result, i--);
            } else {
                result[i] = unrolled;
            }
        }
        return result;
    }

    public static boolean containsTypeVariables(final java.lang.reflect.Type type) {
        if (type instanceof java.lang.reflect.TypeVariable<?>) {
            return true;
        } 
        if (type instanceof java.lang.Class<?>) {
            return (((java.lang.Class<?>)(type)).getTypeParameters().length) > 0;
        } 
        if (type instanceof java.lang.reflect.ParameterizedType) {
            for (final java.lang.reflect.Type arg : ((java.lang.reflect.ParameterizedType)(type)).getActualTypeArguments()) {
                if (org.apache.commons.lang3.reflect.TypeUtils.containsTypeVariables(arg)) {
                    return true;
                } 
            }
            return false;
        } 
        if (type instanceof java.lang.reflect.WildcardType) {
            final java.lang.reflect.WildcardType wild = ((java.lang.reflect.WildcardType)(type));
            return (org.apache.commons.lang3.reflect.TypeUtils.containsTypeVariables(org.apache.commons.lang3.reflect.TypeUtils.getImplicitLowerBounds(wild)[0])) || (org.apache.commons.lang3.reflect.TypeUtils.containsTypeVariables(org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(wild)[0]));
        } 
        return false;
    }

    public static final java.lang.reflect.ParameterizedType parameterize(final java.lang.Class<?> raw, final java.lang.reflect.Type... typeArguments) {
        return org.apache.commons.lang3.reflect.TypeUtils.parameterizeWithOwner(null, raw, typeArguments);
    }

    public static final java.lang.reflect.ParameterizedType parameterize(final java.lang.Class<?> raw, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeArgMappings) {
        org.apache.commons.lang3.Validate.notNull(raw, "raw class is null");
        org.apache.commons.lang3.Validate.notNull(typeArgMappings, "typeArgMappings is null");
        return org.apache.commons.lang3.reflect.TypeUtils.parameterizeWithOwner(null, raw, org.apache.commons.lang3.reflect.TypeUtils.extractTypeArgumentsFrom(typeArgMappings, raw.getTypeParameters()));
    }

    public static final java.lang.reflect.ParameterizedType parameterizeWithOwner(final java.lang.reflect.Type owner, final java.lang.Class<?> raw, final java.lang.reflect.Type... typeArguments) {
        org.apache.commons.lang3.Validate.notNull(raw, "raw class is null");
        final java.lang.reflect.Type useOwner;
        if ((raw.getEnclosingClass()) == null) {
            org.apache.commons.lang3.Validate.isTrue((owner == null), "no owner allowed for top-level %s", raw);
            useOwner = null;
        } else if (owner == null) {
            useOwner = raw.getEnclosingClass();
        } else {
            org.apache.commons.lang3.Validate.isTrue(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(owner, raw.getEnclosingClass()), "%s is invalid owner type for parameterized %s", owner, raw);
            useOwner = owner;
        }
        org.apache.commons.lang3.Validate.noNullElements(typeArguments, "null type argument at index %s");
        org.apache.commons.lang3.Validate.isTrue(((raw.getTypeParameters().length) == (typeArguments.length)), "invalid number of type parameters specified: expected %d, got %d", raw.getTypeParameters().length, typeArguments.length);
        return new org.apache.commons.lang3.reflect.TypeUtils.ParameterizedTypeImpl(raw , useOwner , typeArguments);
    }

    public static final java.lang.reflect.ParameterizedType parameterizeWithOwner(final java.lang.reflect.Type owner, final java.lang.Class<?> raw, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeArgMappings) {
        org.apache.commons.lang3.Validate.notNull(raw, "raw class is null");
        org.apache.commons.lang3.Validate.notNull(typeArgMappings, "typeArgMappings is null");
        return org.apache.commons.lang3.reflect.TypeUtils.parameterizeWithOwner(owner, raw, org.apache.commons.lang3.reflect.TypeUtils.extractTypeArgumentsFrom(typeArgMappings, raw.getTypeParameters()));
    }

    private static java.lang.reflect.Type[] extractTypeArgumentsFrom(final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> mappings, final java.lang.reflect.TypeVariable<?>[] variables) {
        final java.lang.reflect.Type[] result = new java.lang.reflect.Type[variables.length];
        int index = 0;
        for (final java.lang.reflect.TypeVariable<?> var : variables) {
            org.apache.commons.lang3.Validate.isTrue(mappings.containsKey(var), "missing argument mapping for %s", org.apache.commons.lang3.reflect.TypeUtils.toString(var));
            result[index++] = mappings.get(var);
        }
        return result;
    }

    public static org.apache.commons.lang3.reflect.TypeUtils.WildcardTypeBuilder wildcardType() {
        return new org.apache.commons.lang3.reflect.TypeUtils.WildcardTypeBuilder();
    }

    public static java.lang.reflect.GenericArrayType genericArrayType(final java.lang.reflect.Type componentType) {
        return new org.apache.commons.lang3.reflect.TypeUtils.GenericArrayTypeImpl(org.apache.commons.lang3.Validate.notNull(componentType, "componentType is null"));
    }

    @java.lang.SuppressWarnings(value = "deprecation")
    public static boolean equals(final java.lang.reflect.Type t1, final java.lang.reflect.Type t2) {
        if (org.apache.commons.lang3.ObjectUtils.equals(t1, t2)) {
            return true;
        } 
        if (t1 instanceof java.lang.reflect.ParameterizedType) {
            return org.apache.commons.lang3.reflect.TypeUtils.equals(((java.lang.reflect.ParameterizedType)(t1)), t2);
        } 
        if (t1 instanceof java.lang.reflect.GenericArrayType) {
            return org.apache.commons.lang3.reflect.TypeUtils.equals(((java.lang.reflect.GenericArrayType)(t1)), t2);
        } 
        if (t1 instanceof java.lang.reflect.WildcardType) {
            return org.apache.commons.lang3.reflect.TypeUtils.equals(((java.lang.reflect.WildcardType)(t1)), t2);
        } 
        return false;
    }

    private static boolean equals(final java.lang.reflect.ParameterizedType p, final java.lang.reflect.Type t) {
        if (t instanceof java.lang.reflect.ParameterizedType) {
            final java.lang.reflect.ParameterizedType other = ((java.lang.reflect.ParameterizedType)(t));
            if ((org.apache.commons.lang3.reflect.TypeUtils.equals(p.getRawType(), other.getRawType())) && (org.apache.commons.lang3.reflect.TypeUtils.equals(p.getOwnerType(), other.getOwnerType()))) {
                return org.apache.commons.lang3.reflect.TypeUtils.equals(p.getActualTypeArguments(), other.getActualTypeArguments());
            } 
        } 
        return false;
    }

    private static boolean equals(final java.lang.reflect.GenericArrayType a, final java.lang.reflect.Type t) {
        return (t instanceof java.lang.reflect.GenericArrayType) && (org.apache.commons.lang3.reflect.TypeUtils.equals(a.getGenericComponentType(), ((java.lang.reflect.GenericArrayType)(t)).getGenericComponentType()));
    }

    private static boolean equals(final java.lang.reflect.WildcardType w, final java.lang.reflect.Type t) {
        if (t instanceof java.lang.reflect.WildcardType) {
            final java.lang.reflect.WildcardType other = ((java.lang.reflect.WildcardType)(t));
            return (org.apache.commons.lang3.reflect.TypeUtils.equals(org.apache.commons.lang3.reflect.TypeUtils.getImplicitLowerBounds(w), org.apache.commons.lang3.reflect.TypeUtils.getImplicitLowerBounds(other))) && (org.apache.commons.lang3.reflect.TypeUtils.equals(org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(w), org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(other)));
        } 
        return false;
    }

    private static boolean equals(final java.lang.reflect.Type[] t1, final java.lang.reflect.Type[] t2) {
        if ((t1.length) == (t2.length)) {
            for (int i = 0 ; i < (t1.length) ; i++) {
                if (!(org.apache.commons.lang3.reflect.TypeUtils.equals(t1[i], t2[i]))) {
                    return false;
                } 
            }
            return true;
        } 
        return false;
    }

    public static java.lang.String toString(final java.lang.reflect.Type type) {
        org.apache.commons.lang3.Validate.notNull(type);
        if (type instanceof java.lang.Class<?>) {
            return org.apache.commons.lang3.reflect.TypeUtils.classToString(((java.lang.Class<?>)(type)));
        } 
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return org.apache.commons.lang3.reflect.TypeUtils.parameterizedTypeToString(((java.lang.reflect.ParameterizedType)(type)));
        } 
        if (type instanceof java.lang.reflect.WildcardType) {
            return org.apache.commons.lang3.reflect.TypeUtils.wildcardTypeToString(((java.lang.reflect.WildcardType)(type)));
        } 
        if (type instanceof java.lang.reflect.TypeVariable<?>) {
            return org.apache.commons.lang3.reflect.TypeUtils.typeVariableToString(((java.lang.reflect.TypeVariable<?>)(type)));
        } 
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return org.apache.commons.lang3.reflect.TypeUtils.genericArrayTypeToString(((java.lang.reflect.GenericArrayType)(type)));
        } 
        throw new java.lang.IllegalArgumentException(org.apache.commons.lang3.ObjectUtils.identityToString(type));
    }

    public static java.lang.String toLongString(final java.lang.reflect.TypeVariable<?> var) {
        org.apache.commons.lang3.Validate.notNull(var, "var is null");
        final java.lang.StringBuilder buf = new java.lang.StringBuilder();
        final java.lang.reflect.GenericDeclaration d = ((java.lang.reflect.TypeVariable<?>)(var)).getGenericDeclaration();
        if (d instanceof java.lang.Class<?>) {
            java.lang.Class<?> c = ((java.lang.Class<?>)(d));
            while (true) {
                if ((c.getEnclosingClass()) == null) {
                    buf.insert(0, c.getName());
                    break;
                } 
                buf.insert(0, c.getSimpleName()).insert(0, '.');
                c = c.getEnclosingClass();
            }
        } else if (d instanceof java.lang.reflect.Type) {
            buf.append(org.apache.commons.lang3.reflect.TypeUtils.toString(((java.lang.reflect.Type)(d))));
        } else {
            buf.append(d);
        }
        return buf.append(':').append(org.apache.commons.lang3.reflect.TypeUtils.typeVariableToString(var)).toString();
    }

    public static <T>org.apache.commons.lang3.reflect.Typed<T> wrap(final java.lang.reflect.Type type) {
        return new org.apache.commons.lang3.reflect.Typed<T>() {
            @java.lang.Override
            public java.lang.reflect.Type getType() {
                return type;
            }
        };
    }

    public static <T>org.apache.commons.lang3.reflect.Typed<T> wrap(final java.lang.Class<T> type) {
        return org.apache.commons.lang3.reflect.TypeUtils.<T>wrap(((java.lang.reflect.Type)(type)));
    }

    private static java.lang.String classToString(final java.lang.Class<?> c) {
        final java.lang.StringBuilder buf = new java.lang.StringBuilder();
        if ((c.getEnclosingClass()) != null) {
            buf.append(org.apache.commons.lang3.reflect.TypeUtils.classToString(c.getEnclosingClass())).append('.').append(c.getSimpleName());
        } else {
            buf.append(c.getName());
        }
        if ((c.getTypeParameters().length) > 0) {
            buf.append('<');
            org.apache.commons.lang3.reflect.TypeUtils.appendAllTo(buf, ", ", c.getTypeParameters());
            buf.append('>');
        } 
        return buf.toString();
    }

    private static java.lang.String typeVariableToString(final java.lang.reflect.TypeVariable<?> v) {
        final java.lang.StringBuilder buf = new java.lang.StringBuilder(v.getName());
        final java.lang.reflect.Type[] bounds = v.getBounds();
        if (((bounds.length) > 0) && (!(((bounds.length) == 1) && (java.lang.Object.class.equals(bounds[0]))))) {
            buf.append(" extends ");
            org.apache.commons.lang3.reflect.TypeUtils.appendAllTo(buf, " & ", v.getBounds());
        } 
        return buf.toString();
    }

    private static java.lang.String parameterizedTypeToString(final java.lang.reflect.ParameterizedType p) {
        final java.lang.StringBuilder buf = new java.lang.StringBuilder();
        final java.lang.reflect.Type useOwner = p.getOwnerType();
        final java.lang.Class<?> raw = ((java.lang.Class<?>)(p.getRawType()));
        final java.lang.reflect.Type[] typeArguments = p.getActualTypeArguments();
        if (useOwner == null) {
            buf.append(raw.getName());
        } else {
            if (useOwner instanceof java.lang.Class<?>) {
                buf.append(((java.lang.Class<?>)(useOwner)).getName());
            } else {
                buf.append(useOwner.toString());
            }
            buf.append('.').append(raw.getSimpleName());
        }
        org.apache.commons.lang3.reflect.TypeUtils.appendAllTo(buf.append('<'), ", ", typeArguments).append('>');
        return buf.toString();
    }

    private static java.lang.String wildcardTypeToString(final java.lang.reflect.WildcardType w) {
        final java.lang.StringBuilder buf = new java.lang.StringBuilder().append('?');
        final java.lang.reflect.Type[] lowerBounds = w.getLowerBounds();
        final java.lang.reflect.Type[] upperBounds = w.getUpperBounds();
        if (((lowerBounds.length) > 1) || (((lowerBounds.length) == 1) && ((lowerBounds[0]) != null))) {
            org.apache.commons.lang3.reflect.TypeUtils.appendAllTo(buf.append(" super "), " & ", lowerBounds);
        } else if (((upperBounds.length) > 1) || (((upperBounds.length) == 1) && (!(java.lang.Object.class.equals(upperBounds[0]))))) {
            org.apache.commons.lang3.reflect.TypeUtils.appendAllTo(buf.append(" extends "), " & ", upperBounds);
        } 
        return buf.toString();
    }

    private static java.lang.String genericArrayTypeToString(final java.lang.reflect.GenericArrayType g) {
        return java.lang.String.format("%s[]", org.apache.commons.lang3.reflect.TypeUtils.toString(g.getGenericComponentType()));
    }

    private static java.lang.StringBuilder appendAllTo(final java.lang.StringBuilder buf, final java.lang.String sep, final java.lang.reflect.Type... types) {
        org.apache.commons.lang3.Validate.notEmpty(org.apache.commons.lang3.Validate.noNullElements(types));
        if ((types.length) > 0) {
            buf.append(org.apache.commons.lang3.reflect.TypeUtils.toString(types[0]));
            for (int i = 1 ; i < (types.length) ; i++) {
                buf.append(sep).append(org.apache.commons.lang3.reflect.TypeUtils.toString(types[i]));
            }
        } 
        return buf;
    }
}

