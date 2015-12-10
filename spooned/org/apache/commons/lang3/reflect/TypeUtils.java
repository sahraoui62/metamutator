package org.apache.commons.lang3.reflect;


public class TypeUtils {
    public static class WildcardTypeBuilder implements org.apache.commons.lang3.builder.Builder<java.lang.reflect.WildcardType> {
        private WildcardTypeBuilder() {
        }

        private java.lang.reflect.Type[] upperBounds;

        private java.lang.reflect.Type[] lowerBounds;

        public org.apache.commons.lang3.reflect.TypeUtils.WildcardTypeBuilder withUpperBounds(final java.lang.reflect.Type... bounds) {
            this.upperBounds = bounds;
            return ((_returnReplacementOperator949.is("NULL")) ? ( null ) : (this));
        }

        public org.apache.commons.lang3.reflect.TypeUtils.WildcardTypeBuilder withLowerBounds(final java.lang.reflect.Type... bounds) {
            this.lowerBounds = bounds;
            return ((_returnReplacementOperator948.is("NULL")) ? ( null ) : (this));
        }

        @java.lang.Override
        public java.lang.reflect.WildcardType build() {
            return ((_returnReplacementOperator947.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.reflect.TypeUtils.WildcardTypeImpl(upperBounds , lowerBounds)));
        }
    }

    private static final class GenericArrayTypeImpl implements java.lang.reflect.GenericArrayType {
        private final java.lang.reflect.Type componentType;

        private GenericArrayTypeImpl(final java.lang.reflect.Type componentType) {
            this.componentType = componentType;
        }

        @java.lang.Override
        public java.lang.reflect.Type getGenericComponentType() {
            return ((_returnReplacementOperator940.is("NULL")) ? ( null ) : (componentType));
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ((_returnReplacementOperator939.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.toString(this)));
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            return ((_returnReplacementOperator937.is("NULL")) ? ( null ) : ((obj == (this)) || ((obj instanceof java.lang.reflect.GenericArrayType) && (org.apache.commons.lang3.reflect.TypeUtils.equals(this, ((java.lang.reflect.GenericArrayType)(obj)))))));
        }

        @java.lang.Override
        public int hashCode() {
            int result = 67 << 4;
            result |= componentType.hashCode();
            return ((_returnReplacementOperator938.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator938.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator938.is("ZERO")) ? ( 0 ) : (result));
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
            return ((_returnReplacementOperator945.is("NULL")) ? ( null ) : (raw));
        }

        @java.lang.Override
        public java.lang.reflect.Type getOwnerType() {
            return ((_returnReplacementOperator944.is("NULL")) ? ( null ) : (useOwner));
        }

        @java.lang.Override
        public java.lang.reflect.Type[] getActualTypeArguments() {
            return ((_returnReplacementOperator946.is("NULL")) ? ( null ) : (typeArguments.clone()));
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ((_returnReplacementOperator943.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.toString(this)));
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            return ((_returnReplacementOperator941.is("NULL")) ? ( null ) : ((obj == (this)) || ((obj instanceof java.lang.reflect.ParameterizedType) && (org.apache.commons.lang3.reflect.TypeUtils.equals(this, ((java.lang.reflect.ParameterizedType)(obj)))))));
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
            return ((_returnReplacementOperator942.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator942.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator942.is("ZERO")) ? ( 0 ) : (result));
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
            return ((_returnReplacementOperator954.is("NULL")) ? ( null ) : (upperBounds.clone()));
        }

        @java.lang.Override
        public java.lang.reflect.Type[] getLowerBounds() {
            return ((_returnReplacementOperator953.is("NULL")) ? ( null ) : (lowerBounds.clone()));
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ((_returnReplacementOperator952.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.toString(this)));
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            return ((_returnReplacementOperator950.is("NULL")) ? ( null ) : ((obj == (this)) || ((obj instanceof java.lang.reflect.WildcardType) && (org.apache.commons.lang3.reflect.TypeUtils.equals(this, ((java.lang.reflect.WildcardType)(obj)))))));
        }

        @java.lang.Override
        public int hashCode() {
            int result = 73 << 8;
            result |= java.util.Arrays.hashCode(upperBounds);
            result <<= 8;
            result |= java.util.Arrays.hashCode(lowerBounds);
            return ((_returnReplacementOperator951.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator951.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator951.is("ZERO")) ? ( 0 ) : (result));
        }
    }

    public static final java.lang.reflect.WildcardType WILDCARD_ALL = org.apache.commons.lang3.reflect.TypeUtils.wildcardType().withUpperBounds(java.lang.Object.class).build();

    public TypeUtils() {
        super();
    }

    public static boolean isAssignable(final java.lang.reflect.Type type, final java.lang.reflect.Type toType) {
        return ((_returnReplacementOperator1004.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, toType, null)));
    }

    private static boolean isAssignable(final java.lang.reflect.Type type, final java.lang.reflect.Type toType, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        if ((toType == null) || (toType instanceof java.lang.Class<?>)) {
            return ((_returnReplacementOperator1005.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, ((java.lang.Class<?>)(toType)))));
        } 
        if (toType instanceof java.lang.reflect.ParameterizedType) {
            return ((_returnReplacementOperator1006.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, ((java.lang.reflect.ParameterizedType)(toType)), typeVarAssigns)));
        } 
        if (toType instanceof java.lang.reflect.GenericArrayType) {
            return ((_returnReplacementOperator1007.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, ((java.lang.reflect.GenericArrayType)(toType)), typeVarAssigns)));
        } 
        if (toType instanceof java.lang.reflect.WildcardType) {
            return ((_returnReplacementOperator1008.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, ((java.lang.reflect.WildcardType)(toType)), typeVarAssigns)));
        } 
        if (toType instanceof java.lang.reflect.TypeVariable<?>) {
            return ((_returnReplacementOperator1009.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, ((java.lang.reflect.TypeVariable<?>)(toType)), typeVarAssigns)));
        } 
        throw new java.lang.IllegalStateException(("found an unhandled type: " + toType));
    }

    private static boolean isAssignable(final java.lang.reflect.Type type, final java.lang.Class<?> toClass) {
        if (type == null) {
            return ((_returnReplacementOperator978.is("NULL")) ? ( null ) : ((toClass == null) || (!(toClass.isPrimitive()))));
        } 
        if (toClass == null) {
            return ((_returnReplacementOperator979.is("NULL")) ? ( null ) : (false));
        } 
        if (toClass.equals(type)) {
            return ((_returnReplacementOperator980.is("NULL")) ? ( null ) : (true));
        } 
        if (type instanceof java.lang.Class<?>) {
            return ((_returnReplacementOperator981.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class<?>)(type)), toClass)));
        } 
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return ((_returnReplacementOperator982.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.ParameterizedType)(type))), toClass)));
        } 
        if (type instanceof java.lang.reflect.TypeVariable<?>) {
            for (final java.lang.reflect.Type bound : ((java.lang.reflect.TypeVariable<?>)(type)).getBounds()) {
                if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toClass)) {
                    return ((_returnReplacementOperator983.is("NULL")) ? ( null ) : (true));
                } 
            }
            return ((_returnReplacementOperator984.is("NULL")) ? ( null ) : (false));
        } 
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return ((_returnReplacementOperator985.is("NULL")) ? ( null ) : ((toClass.equals(java.lang.Object.class)) || ((toClass.isArray()) && (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(((java.lang.reflect.GenericArrayType)(type)).getGenericComponentType(), toClass.getComponentType())))));
        } 
        if (type instanceof java.lang.reflect.WildcardType) {
            return ((_returnReplacementOperator986.is("NULL")) ? ( null ) : (false));
        } 
        throw new java.lang.IllegalStateException(("found an unhandled type: " + type));
    }

    private static boolean isAssignable(final java.lang.reflect.Type type, final java.lang.reflect.ParameterizedType toParameterizedType, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        if (type == null) {
            return ((_returnReplacementOperator997.is("NULL")) ? ( null ) : (true));
        } 
        if (toParameterizedType == null) {
            return ((_returnReplacementOperator998.is("NULL")) ? ( null ) : (false));
        } 
        if (toParameterizedType.equals(type)) {
            return ((_returnReplacementOperator999.is("NULL")) ? ( null ) : (true));
        } 
        final java.lang.Class<?> toClass = org.apache.commons.lang3.reflect.TypeUtils.getRawType(toParameterizedType);
        final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> fromTypeVarAssigns = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(type, toClass, null);
        if (fromTypeVarAssigns == null) {
            return ((_returnReplacementOperator1000.is("NULL")) ? ( null ) : (false));
        } 
        if (fromTypeVarAssigns.isEmpty()) {
            return ((_returnReplacementOperator1001.is("NULL")) ? ( null ) : (true));
        } 
        final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> toTypeVarAssigns = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(toParameterizedType, toClass, typeVarAssigns);
        for (final java.lang.reflect.TypeVariable<?> var : toTypeVarAssigns.keySet()) {
            final java.lang.reflect.Type toTypeArg = org.apache.commons.lang3.reflect.TypeUtils.unrollVariableAssignments(var, toTypeVarAssigns);
            final java.lang.reflect.Type fromTypeArg = org.apache.commons.lang3.reflect.TypeUtils.unrollVariableAssignments(var, fromTypeVarAssigns);
            if (((fromTypeArg != null) && (!(toTypeArg.equals(fromTypeArg)))) && (!((toTypeArg instanceof java.lang.reflect.WildcardType) && (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(fromTypeArg, toTypeArg, typeVarAssigns))))) {
                return ((_returnReplacementOperator1002.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator1003.is("NULL")) ? ( null ) : (true));
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
        return ((_returnReplacementOperator1062.is("NULL")) ? ( null ) : (result));
    }

    private static boolean isAssignable(final java.lang.reflect.Type type, final java.lang.reflect.GenericArrayType toGenericArrayType, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        if (type == null) {
            return ((_returnReplacementOperator987.is("NULL")) ? ( null ) : (true));
        } 
        if (toGenericArrayType == null) {
            return ((_returnReplacementOperator988.is("NULL")) ? ( null ) : (false));
        } 
        if (toGenericArrayType.equals(type)) {
            return ((_returnReplacementOperator989.is("NULL")) ? ( null ) : (true));
        } 
        final java.lang.reflect.Type toComponentType = toGenericArrayType.getGenericComponentType();
        if (type instanceof java.lang.Class<?>) {
            final java.lang.Class<?> cls = ((java.lang.Class<?>)(type));
            return ((_returnReplacementOperator990.is("NULL")) ? ( null ) : ((cls.isArray()) && (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(cls.getComponentType(), toComponentType, typeVarAssigns))));
        } 
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return ((_returnReplacementOperator991.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(((java.lang.reflect.GenericArrayType)(type)).getGenericComponentType(), toComponentType, typeVarAssigns)));
        } 
        if (type instanceof java.lang.reflect.WildcardType) {
            for (final java.lang.reflect.Type bound : org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(((java.lang.reflect.WildcardType)(type)))) {
                if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toGenericArrayType)) {
                    return ((_returnReplacementOperator992.is("NULL")) ? ( null ) : (true));
                } 
            }
            return ((_returnReplacementOperator993.is("NULL")) ? ( null ) : (false));
        } 
        if (type instanceof java.lang.reflect.TypeVariable<?>) {
            for (final java.lang.reflect.Type bound : org.apache.commons.lang3.reflect.TypeUtils.getImplicitBounds(((java.lang.reflect.TypeVariable<?>)(type)))) {
                if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toGenericArrayType)) {
                    return ((_returnReplacementOperator994.is("NULL")) ? ( null ) : (true));
                } 
            }
            return ((_returnReplacementOperator995.is("NULL")) ? ( null ) : (false));
        } 
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return ((_returnReplacementOperator996.is("NULL")) ? ( null ) : (false));
        } 
        throw new java.lang.IllegalStateException(("found an unhandled type: " + type));
    }

    private static boolean isAssignable(final java.lang.reflect.Type type, final java.lang.reflect.WildcardType toWildcardType, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        if (type == null) {
            return ((_returnReplacementOperator1015.is("NULL")) ? ( null ) : (true));
        } 
        if (toWildcardType == null) {
            return ((_returnReplacementOperator1016.is("NULL")) ? ( null ) : (false));
        } 
        if (toWildcardType.equals(type)) {
            return ((_returnReplacementOperator1017.is("NULL")) ? ( null ) : (true));
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
                        return ((_returnReplacementOperator1018.is("NULL")) ? ( null ) : (false));
                    } 
                }
            }
            for (java.lang.reflect.Type toBound : toLowerBounds) {
                toBound = org.apache.commons.lang3.reflect.TypeUtils.substituteTypeVariables(toBound, typeVarAssigns);
                for (final java.lang.reflect.Type bound : lowerBounds) {
                    if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(toBound, bound, typeVarAssigns))) {
                        return ((_returnReplacementOperator1019.is("NULL")) ? ( null ) : (false));
                    } 
                }
            }
            return ((_returnReplacementOperator1020.is("NULL")) ? ( null ) : (true));
        } 
        for (final java.lang.reflect.Type toBound : toUpperBounds) {
            if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, org.apache.commons.lang3.reflect.TypeUtils.substituteTypeVariables(toBound, typeVarAssigns), typeVarAssigns))) {
                return ((_returnReplacementOperator1021.is("NULL")) ? ( null ) : (false));
            } 
        }
        for (final java.lang.reflect.Type toBound : toLowerBounds) {
            if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(org.apache.commons.lang3.reflect.TypeUtils.substituteTypeVariables(toBound, typeVarAssigns), type, typeVarAssigns))) {
                return ((_returnReplacementOperator1022.is("NULL")) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperator1023.is("NULL")) ? ( null ) : (true));
    }

    private static boolean isAssignable(final java.lang.reflect.Type type, final java.lang.reflect.TypeVariable<?> toTypeVariable, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        if (type == null) {
            return ((_returnReplacementOperator1010.is("NULL")) ? ( null ) : (true));
        } 
        if (toTypeVariable == null) {
            return ((_returnReplacementOperator1011.is("NULL")) ? ( null ) : (false));
        } 
        if (toTypeVariable.equals(type)) {
            return ((_returnReplacementOperator1012.is("NULL")) ? ( null ) : (true));
        } 
        if (type instanceof java.lang.reflect.TypeVariable<?>) {
            final java.lang.reflect.Type[] bounds = org.apache.commons.lang3.reflect.TypeUtils.getImplicitBounds(((java.lang.reflect.TypeVariable<?>)(type)));
            for (final java.lang.reflect.Type bound : bounds) {
                if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toTypeVariable, typeVarAssigns)) {
                    return ((_returnReplacementOperator1013.is("NULL")) ? ( null ) : (true));
                } 
            }
        } 
        if ((((type instanceof java.lang.Class<?>) || (type instanceof java.lang.reflect.ParameterizedType)) || (type instanceof java.lang.reflect.GenericArrayType)) || (type instanceof java.lang.reflect.WildcardType)) {
            return ((_returnReplacementOperator1014.is("NULL")) ? ( null ) : (false));
        } 
        throw new java.lang.IllegalStateException(("found an unhandled type: " + type));
    }

    private static java.lang.reflect.Type substituteTypeVariables(final java.lang.reflect.Type type, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        if ((type instanceof java.lang.reflect.TypeVariable<?>) && (typeVarAssigns != null)) {
            final java.lang.reflect.Type replacementType = typeVarAssigns.get(type);
            if (replacementType == null) {
                throw new java.lang.IllegalArgumentException(("missing assignment type for type variable " + type));
            } 
            return ((_returnReplacementOperator1060.is("NULL")) ? ( null ) : (replacementType));
        } 
        return ((_returnReplacementOperator1061.is("NULL")) ? ( null ) : (type));
    }

    public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(final java.lang.reflect.ParameterizedType type) {
        return ((_returnReplacementOperator1082.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(type, org.apache.commons.lang3.reflect.TypeUtils.getRawType(type), null)));
    }

    public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(final java.lang.reflect.Type type, final java.lang.Class<?> toClass) {
        return ((_returnReplacementOperator1086.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(type, toClass, null)));
    }

    private static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(final java.lang.reflect.Type type, final java.lang.Class<?> toClass, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> subtypeVarAssigns) {
        if (type instanceof java.lang.Class<?>) {
            return ((_returnReplacementOperator1087.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.Class<?>)(type)), toClass, subtypeVarAssigns)));
        } 
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return ((_returnReplacementOperator1088.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.reflect.ParameterizedType)(type)), toClass, subtypeVarAssigns)));
        } 
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return ((_returnReplacementOperator1089.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.reflect.GenericArrayType)(type)).getGenericComponentType(), (toClass.isArray() ? toClass.getComponentType() : toClass), subtypeVarAssigns)));
        } 
        if (type instanceof java.lang.reflect.WildcardType) {
            for (final java.lang.reflect.Type bound : org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(((java.lang.reflect.WildcardType)(type)))) {
                if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toClass)) {
                    return ((_returnReplacementOperator1090.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(bound, toClass, subtypeVarAssigns)));
                } 
            }
            return ((_returnReplacementOperator1091.is("NULL")) ? ( null ) : (null));
        } 
        if (type instanceof java.lang.reflect.TypeVariable<?>) {
            for (final java.lang.reflect.Type bound : org.apache.commons.lang3.reflect.TypeUtils.getImplicitBounds(((java.lang.reflect.TypeVariable<?>)(type)))) {
                if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toClass)) {
                    return ((_returnReplacementOperator1092.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(bound, toClass, subtypeVarAssigns)));
                } 
            }
            return ((_returnReplacementOperator1093.is("NULL")) ? ( null ) : (null));
        } 
        throw new java.lang.IllegalStateException(("found an unhandled type: " + type));
    }

    private static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(final java.lang.reflect.ParameterizedType parameterizedType, final java.lang.Class<?> toClass, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> subtypeVarAssigns) {
        final java.lang.Class<?> cls = org.apache.commons.lang3.reflect.TypeUtils.getRawType(parameterizedType);
        if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(cls, toClass))) {
            return ((_returnReplacementOperator1083.is("NULL")) ? ( null ) : (null));
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
            return ((_returnReplacementOperator1084.is("NULL")) ? ( null ) : (typeVarAssigns));
        } 
        return ((_returnReplacementOperator1085.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(org.apache.commons.lang3.reflect.TypeUtils.getClosestParentType(cls, toClass), toClass, typeVarAssigns)));
    }

    private static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(java.lang.Class<?> cls, final java.lang.Class<?> toClass, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> subtypeVarAssigns) {
        if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(cls, toClass))) {
            return ((_returnReplacementOperator1078.is("NULL")) ? ( null ) : (null));
        } 
        if (cls.isPrimitive()) {
            if (toClass.isPrimitive()) {
                return ((_returnReplacementOperator1079.is("NULL")) ? ( null ) : (new java.util.HashMap<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>()));
            } 
            cls = org.apache.commons.lang3.ClassUtils.primitiveToWrapper(cls);
        } 
        final java.util.HashMap<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns = subtypeVarAssigns == null ? new java.util.HashMap<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>() : new java.util.HashMap<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>(subtypeVarAssigns);
        if (toClass.equals(cls)) {
            return ((_returnReplacementOperator1080.is("NULL")) ? ( null ) : (typeVarAssigns));
        } 
        return ((_returnReplacementOperator1081.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(org.apache.commons.lang3.reflect.TypeUtils.getClosestParentType(cls, toClass), toClass, typeVarAssigns)));
    }

    public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> determineTypeArguments(final java.lang.Class<?> cls, final java.lang.reflect.ParameterizedType superType) {
        org.apache.commons.lang3.Validate.notNull(cls, "cls is null");
        org.apache.commons.lang3.Validate.notNull(superType, "superType is null");
        final java.lang.Class<?> superClass = org.apache.commons.lang3.reflect.TypeUtils.getRawType(superType);
        if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(cls, superClass))) {
            return ((_returnReplacementOperator1074.is("NULL")) ? ( null ) : (null));
        } 
        if (cls.equals(superClass)) {
            return ((_returnReplacementOperator1075.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(superType, superClass, null)));
        } 
        final java.lang.reflect.Type midType = org.apache.commons.lang3.reflect.TypeUtils.getClosestParentType(cls, superClass);
        if (midType instanceof java.lang.Class<?>) {
            return ((_returnReplacementOperator1076.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.determineTypeArguments(((java.lang.Class<?>)(midType)), superType)));
        } 
        final java.lang.reflect.ParameterizedType midParameterizedType = ((java.lang.reflect.ParameterizedType)(midType));
        final java.lang.Class<?> midClass = org.apache.commons.lang3.reflect.TypeUtils.getRawType(midParameterizedType);
        final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns = org.apache.commons.lang3.reflect.TypeUtils.determineTypeArguments(midClass, superType);
        org.apache.commons.lang3.reflect.TypeUtils.mapTypeVariablesToArguments(cls, midParameterizedType, typeVarAssigns);
        return ((_returnReplacementOperator1077.is("NULL")) ? ( null ) : (typeVarAssigns));
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
                return ((_returnReplacementOperator1058.is("NULL")) ? ( null ) : (genericInterface));
            } 
        } 
        return ((_returnReplacementOperator1059.is("NULL")) ? ( null ) : (cls.getGenericSuperclass()));
    }

    public static boolean isInstance(final java.lang.Object value, final java.lang.reflect.Type type) {
        if (type == null) {
            return ((_returnReplacementOperator1024.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator1025.is("NULL")) ? ( null ) : (value == null ? (!(type instanceof java.lang.Class<?>)) || (!(((java.lang.Class<?>)(type)).isPrimitive())) : org.apache.commons.lang3.reflect.TypeUtils.isAssignable(value.getClass(), type, null)));
    }

    public static java.lang.reflect.Type[] normalizeUpperBounds(final java.lang.reflect.Type[] bounds) {
        org.apache.commons.lang3.Validate.notNull(bounds, "null value specified for bounds array");
        if ((bounds.length) < 2) {
            return ((_returnReplacementOperator1071.is("NULL")) ? ( null ) : (bounds));
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
        return ((_returnReplacementOperator1072.is("NULL")) ? ( null ) : (types.toArray(new java.lang.reflect.Type[types.size()])));
    }

    public static java.lang.reflect.Type[] getImplicitBounds(final java.lang.reflect.TypeVariable<?> typeVariable) {
        org.apache.commons.lang3.Validate.notNull(typeVariable, "typeVariable is null");
        final java.lang.reflect.Type[] bounds = typeVariable.getBounds();
        return ((_returnReplacementOperator1068.is("NULL")) ? ( null ) : ((bounds.length) == 0 ? new java.lang.reflect.Type[]{ java.lang.Object.class } : org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(bounds)));
    }

    public static java.lang.reflect.Type[] getImplicitUpperBounds(final java.lang.reflect.WildcardType wildcardType) {
        org.apache.commons.lang3.Validate.notNull(wildcardType, "wildcardType is null");
        final java.lang.reflect.Type[] bounds = wildcardType.getUpperBounds();
        return ((_returnReplacementOperator1070.is("NULL")) ? ( null ) : ((bounds.length) == 0 ? new java.lang.reflect.Type[]{ java.lang.Object.class } : org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(bounds)));
    }

    public static java.lang.reflect.Type[] getImplicitLowerBounds(final java.lang.reflect.WildcardType wildcardType) {
        org.apache.commons.lang3.Validate.notNull(wildcardType, "wildcardType is null");
        final java.lang.reflect.Type[] bounds = wildcardType.getLowerBounds();
        return ((_returnReplacementOperator1069.is("NULL")) ? ( null ) : ((bounds.length) == 0 ? new java.lang.reflect.Type[]{ null } : bounds));
    }

    public static boolean typesSatisfyVariables(final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        org.apache.commons.lang3.Validate.notNull(typeVarAssigns, "typeVarAssigns is null");
        for (final java.util.Map.Entry<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> entry : typeVarAssigns.entrySet()) {
            final java.lang.reflect.TypeVariable<?> typeVar = entry.getKey();
            final java.lang.reflect.Type type = entry.getValue();
            for (final java.lang.reflect.Type bound : org.apache.commons.lang3.reflect.TypeUtils.getImplicitBounds(typeVar)) {
                if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, org.apache.commons.lang3.reflect.TypeUtils.substituteTypeVariables(bound, typeVarAssigns), typeVarAssigns))) {
                    return ((_returnReplacementOperator1026.is("NULL")) ? ( null ) : (false));
                } 
            }
        }
        return ((_returnReplacementOperator1027.is("NULL")) ? ( null ) : (true));
    }

    private static java.lang.Class<?> getRawType(final java.lang.reflect.ParameterizedType parameterizedType) {
        final java.lang.reflect.Type rawType = parameterizedType.getRawType();
        if (!(rawType instanceof java.lang.Class<?>)) {
            throw new java.lang.IllegalStateException(("Wait... What!? Type of rawType: " + rawType));
        } 
        return ((_returnReplacementOperator1028.is("NULL")) ? ( null ) : (((java.lang.Class<?>)(rawType))));
    }

    public static java.lang.Class<?> getRawType(final java.lang.reflect.Type type, final java.lang.reflect.Type assigningType) {
        if (type instanceof java.lang.Class<?>) {
            return ((_returnReplacementOperator1029.is("NULL")) ? ( null ) : (((java.lang.Class<?>)(type))));
        } 
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return ((_returnReplacementOperator1030.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.ParameterizedType)(type)))));
        } 
        if (type instanceof java.lang.reflect.TypeVariable<?>) {
            if (assigningType == null) {
                return ((_returnReplacementOperator1031.is("NULL")) ? ( null ) : (null));
            } 
            final java.lang.Object genericDeclaration = ((java.lang.reflect.TypeVariable<?>)(type)).getGenericDeclaration();
            if (!(genericDeclaration instanceof java.lang.Class<?>)) {
                return ((_returnReplacementOperator1032.is("NULL")) ? ( null ) : (null));
            } 
            final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(assigningType, ((java.lang.Class<?>)(genericDeclaration)));
            if (typeVarAssigns == null) {
                return ((_returnReplacementOperator1033.is("NULL")) ? ( null ) : (null));
            } 
            final java.lang.reflect.Type typeArgument = typeVarAssigns.get(type);
            if (typeArgument == null) {
                return ((_returnReplacementOperator1034.is("NULL")) ? ( null ) : (null));
            } 
            return ((_returnReplacementOperator1035.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getRawType(typeArgument, assigningType)));
        } 
        if (type instanceof java.lang.reflect.GenericArrayType) {
            final java.lang.Class<?> rawComponentType = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.GenericArrayType)(type)).getGenericComponentType(), assigningType);
            return ((_returnReplacementOperator1036.is("NULL")) ? ( null ) : (java.lang.reflect.Array.newInstance(rawComponentType, 0).getClass()));
        } 
        if (type instanceof java.lang.reflect.WildcardType) {
            return ((_returnReplacementOperator1037.is("NULL")) ? ( null ) : (null));
        } 
        throw new java.lang.IllegalArgumentException(("unknown type: " + type));
    }

    public static boolean isArrayType(final java.lang.reflect.Type type) {
        return ((_returnReplacementOperator977.is("NULL")) ? ( null ) : ((type instanceof java.lang.reflect.GenericArrayType) || ((type instanceof java.lang.Class<?>) && (((java.lang.Class<?>)(type)).isArray()))));
    }

    public static java.lang.reflect.Type getArrayComponentType(final java.lang.reflect.Type type) {
        if (type instanceof java.lang.Class<?>) {
            final java.lang.Class<?> clazz = ((java.lang.Class<?>)(type));
            return ((_returnReplacementOperator1055.is("NULL")) ? ( null ) : (clazz.isArray() ? clazz.getComponentType() : null));
        } 
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return ((_returnReplacementOperator1056.is("NULL")) ? ( null ) : (((java.lang.reflect.GenericArrayType)(type)).getGenericComponentType()));
        } 
        return ((_returnReplacementOperator1057.is("NULL")) ? ( null ) : (null));
    }

    public static java.lang.reflect.Type unrollVariables(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeArguments, final java.lang.reflect.Type type) {
        if (typeArguments == null) {
            typeArguments = java.util.Collections.<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>emptyMap();
        } 
        if (org.apache.commons.lang3.reflect.TypeUtils.containsTypeVariables(type)) {
            if (type instanceof java.lang.reflect.TypeVariable<?>) {
                return ((_returnReplacementOperator1063.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.unrollVariables(typeArguments, typeArguments.get(type))));
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
                return ((_returnReplacementOperator1064.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.parameterizeWithOwner(p.getOwnerType(), ((java.lang.Class<?>)(p.getRawType())), args)));
            } 
            if (type instanceof java.lang.reflect.WildcardType) {
                final java.lang.reflect.WildcardType wild = ((java.lang.reflect.WildcardType)(type));
                return ((_returnReplacementOperator1065.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.wildcardType().withUpperBounds(org.apache.commons.lang3.reflect.TypeUtils.unrollBounds(typeArguments, wild.getUpperBounds())).withLowerBounds(org.apache.commons.lang3.reflect.TypeUtils.unrollBounds(typeArguments, wild.getLowerBounds())).build()));
            } 
        } 
        return ((_returnReplacementOperator1066.is("NULL")) ? ( null ) : (type));
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
        return ((_returnReplacementOperator1073.is("NULL")) ? ( null ) : (result));
    }

    public static boolean containsTypeVariables(final java.lang.reflect.Type type) {
        if (type instanceof java.lang.reflect.TypeVariable<?>) {
            return ((_returnReplacementOperator958.is("NULL")) ? ( null ) : (true));
        } 
        if (type instanceof java.lang.Class<?>) {
            return ((_returnReplacementOperator959.is("NULL")) ? ( null ) : ((((java.lang.Class<?>)(type)).getTypeParameters().length) > 0));
        } 
        if (type instanceof java.lang.reflect.ParameterizedType) {
            for (final java.lang.reflect.Type arg : ((java.lang.reflect.ParameterizedType)(type)).getActualTypeArguments()) {
                if (org.apache.commons.lang3.reflect.TypeUtils.containsTypeVariables(arg)) {
                    return ((_returnReplacementOperator960.is("NULL")) ? ( null ) : (true));
                } 
            }
            return ((_returnReplacementOperator961.is("NULL")) ? ( null ) : (false));
        } 
        if (type instanceof java.lang.reflect.WildcardType) {
            final java.lang.reflect.WildcardType wild = ((java.lang.reflect.WildcardType)(type));
            return ((_returnReplacementOperator962.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.reflect.TypeUtils.containsTypeVariables(org.apache.commons.lang3.reflect.TypeUtils.getImplicitLowerBounds(wild)[0])) || (org.apache.commons.lang3.reflect.TypeUtils.containsTypeVariables(org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(wild)[0]))));
        } 
        return ((_returnReplacementOperator963.is("NULL")) ? ( null ) : (false));
    }

    public static final java.lang.reflect.ParameterizedType parameterize(final java.lang.Class<?> raw, final java.lang.reflect.Type... typeArguments) {
        return ((_returnReplacementOperator1051.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.parameterizeWithOwner(null, raw, typeArguments)));
    }

    public static final java.lang.reflect.ParameterizedType parameterize(final java.lang.Class<?> raw, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeArgMappings) {
        org.apache.commons.lang3.Validate.notNull(raw, "raw class is null");
        org.apache.commons.lang3.Validate.notNull(typeArgMappings, "typeArgMappings is null");
        return ((_returnReplacementOperator1052.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.parameterizeWithOwner(null, raw, org.apache.commons.lang3.reflect.TypeUtils.extractTypeArgumentsFrom(typeArgMappings, raw.getTypeParameters()))));
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
        return ((_returnReplacementOperator1053.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.reflect.TypeUtils.ParameterizedTypeImpl(raw , useOwner , typeArguments)));
    }

    public static final java.lang.reflect.ParameterizedType parameterizeWithOwner(final java.lang.reflect.Type owner, final java.lang.Class<?> raw, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeArgMappings) {
        org.apache.commons.lang3.Validate.notNull(raw, "raw class is null");
        org.apache.commons.lang3.Validate.notNull(typeArgMappings, "typeArgMappings is null");
        return ((_returnReplacementOperator1054.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.parameterizeWithOwner(owner, raw, org.apache.commons.lang3.reflect.TypeUtils.extractTypeArgumentsFrom(typeArgMappings, raw.getTypeParameters()))));
    }

    private static java.lang.reflect.Type[] extractTypeArgumentsFrom(final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> mappings, final java.lang.reflect.TypeVariable<?>[] variables) {
        final java.lang.reflect.Type[] result = new java.lang.reflect.Type[variables.length];
        int index = 0;
        for (final java.lang.reflect.TypeVariable<?> var : variables) {
            org.apache.commons.lang3.Validate.isTrue(mappings.containsKey(var), "missing argument mapping for %s", org.apache.commons.lang3.reflect.TypeUtils.toString(var));
            result[index++] = mappings.get(var);
        }
        return ((_returnReplacementOperator1067.is("NULL")) ? ( null ) : (result));
    }

    public static org.apache.commons.lang3.reflect.TypeUtils.WildcardTypeBuilder wildcardType() {
        return ((_returnReplacementOperator1094.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.reflect.TypeUtils.WildcardTypeBuilder()));
    }

    public static java.lang.reflect.GenericArrayType genericArrayType(final java.lang.reflect.Type componentType) {
        return ((_returnReplacementOperator1050.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.reflect.TypeUtils.GenericArrayTypeImpl(org.apache.commons.lang3.Validate.notNull(componentType, "componentType is null"))));
    }

    @java.lang.SuppressWarnings(value = "deprecation")
    public static boolean equals(final java.lang.reflect.Type t1, final java.lang.reflect.Type t2) {
        if (org.apache.commons.lang3.ObjectUtils.equals(t1, t2)) {
            return ((_returnReplacementOperator967.is("NULL")) ? ( null ) : (true));
        } 
        if (t1 instanceof java.lang.reflect.ParameterizedType) {
            return ((_returnReplacementOperator968.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.equals(((java.lang.reflect.ParameterizedType)(t1)), t2)));
        } 
        if (t1 instanceof java.lang.reflect.GenericArrayType) {
            return ((_returnReplacementOperator969.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.equals(((java.lang.reflect.GenericArrayType)(t1)), t2)));
        } 
        if (t1 instanceof java.lang.reflect.WildcardType) {
            return ((_returnReplacementOperator970.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.equals(((java.lang.reflect.WildcardType)(t1)), t2)));
        } 
        return ((_returnReplacementOperator971.is("NULL")) ? ( null ) : (false));
    }

    private static boolean equals(final java.lang.reflect.ParameterizedType p, final java.lang.reflect.Type t) {
        if (t instanceof java.lang.reflect.ParameterizedType) {
            final java.lang.reflect.ParameterizedType other = ((java.lang.reflect.ParameterizedType)(t));
            if ((org.apache.commons.lang3.reflect.TypeUtils.equals(p.getRawType(), other.getRawType())) && (org.apache.commons.lang3.reflect.TypeUtils.equals(p.getOwnerType(), other.getOwnerType()))) {
                return ((_returnReplacementOperator965.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.equals(p.getActualTypeArguments(), other.getActualTypeArguments())));
            } 
        } 
        return ((_returnReplacementOperator966.is("NULL")) ? ( null ) : (false));
    }

    private static boolean equals(final java.lang.reflect.GenericArrayType a, final java.lang.reflect.Type t) {
        return ((_returnReplacementOperator964.is("NULL")) ? ( null ) : ((t instanceof java.lang.reflect.GenericArrayType) && (org.apache.commons.lang3.reflect.TypeUtils.equals(a.getGenericComponentType(), ((java.lang.reflect.GenericArrayType)(t)).getGenericComponentType()))));
    }

    private static boolean equals(final java.lang.reflect.WildcardType w, final java.lang.reflect.Type t) {
        if (t instanceof java.lang.reflect.WildcardType) {
            final java.lang.reflect.WildcardType other = ((java.lang.reflect.WildcardType)(t));
            return ((_returnReplacementOperator975.is("NULL")) ? ( null ) : ((org.apache.commons.lang3.reflect.TypeUtils.equals(org.apache.commons.lang3.reflect.TypeUtils.getImplicitLowerBounds(w), org.apache.commons.lang3.reflect.TypeUtils.getImplicitLowerBounds(other))) && (org.apache.commons.lang3.reflect.TypeUtils.equals(org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(w), org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(other)))));
        } 
        return ((_returnReplacementOperator976.is("NULL")) ? ( null ) : (false));
    }

    private static boolean equals(final java.lang.reflect.Type[] t1, final java.lang.reflect.Type[] t2) {
        if ((t1.length) == (t2.length)) {
            for (int i = 0 ; i < (t1.length) ; i++) {
                if (!(org.apache.commons.lang3.reflect.TypeUtils.equals(t1[i], t2[i]))) {
                    return ((_returnReplacementOperator972.is("NULL")) ? ( null ) : (false));
                } 
            }
            return ((_returnReplacementOperator973.is("NULL")) ? ( null ) : (true));
        } 
        return ((_returnReplacementOperator974.is("NULL")) ? ( null ) : (false));
    }

    public static java.lang.String toString(final java.lang.reflect.Type type) {
        org.apache.commons.lang3.Validate.notNull(type);
        if (type instanceof java.lang.Class<?>) {
            return ((_returnReplacementOperator1042.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.classToString(((java.lang.Class<?>)(type)))));
        } 
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return ((_returnReplacementOperator1043.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.parameterizedTypeToString(((java.lang.reflect.ParameterizedType)(type)))));
        } 
        if (type instanceof java.lang.reflect.WildcardType) {
            return ((_returnReplacementOperator1044.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.wildcardTypeToString(((java.lang.reflect.WildcardType)(type)))));
        } 
        if (type instanceof java.lang.reflect.TypeVariable<?>) {
            return ((_returnReplacementOperator1045.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.typeVariableToString(((java.lang.reflect.TypeVariable<?>)(type)))));
        } 
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return ((_returnReplacementOperator1046.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.genericArrayTypeToString(((java.lang.reflect.GenericArrayType)(type)))));
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
        return ((_returnReplacementOperator1041.is("NULL")) ? ( null ) : (buf.append(':').append(org.apache.commons.lang3.reflect.TypeUtils.typeVariableToString(var)).toString()));
    }

    public static <T>org.apache.commons.lang3.reflect.Typed<T> wrap(final java.lang.reflect.Type type) {
        return ((_returnReplacementOperator957.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.reflect.Typed<T>() {
    @java.lang.Override
    public java.lang.reflect.Type getType() {
        return ((_returnReplacementOperator956.is("NULL")) ? ( null ) : (type));
    }
}));
    }

    public static <T>org.apache.commons.lang3.reflect.Typed<T> wrap(final java.lang.Class<T> type) {
        return ((_returnReplacementOperator955.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.<T>wrap(((java.lang.reflect.Type)(type)))));
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
        return ((_returnReplacementOperator1038.is("NULL")) ? ( null ) : (buf.toString()));
    }

    private static java.lang.String typeVariableToString(final java.lang.reflect.TypeVariable<?> v) {
        final java.lang.StringBuilder buf = new java.lang.StringBuilder(v.getName());
        final java.lang.reflect.Type[] bounds = v.getBounds();
        if (((bounds.length) > 0) && (!(((bounds.length) == 1) && (java.lang.Object.class.equals(bounds[0]))))) {
            buf.append(" extends ");
            org.apache.commons.lang3.reflect.TypeUtils.appendAllTo(buf, " & ", v.getBounds());
        } 
        return ((_returnReplacementOperator1047.is("NULL")) ? ( null ) : (buf.toString()));
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
        return ((_returnReplacementOperator1040.is("NULL")) ? ( null ) : (buf.toString()));
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
        return ((_returnReplacementOperator1048.is("NULL")) ? ( null ) : (buf.toString()));
    }

    private static java.lang.String genericArrayTypeToString(final java.lang.reflect.GenericArrayType g) {
        return ((_returnReplacementOperator1039.is("NULL")) ? ( null ) : (java.lang.String.format("%s[]", org.apache.commons.lang3.reflect.TypeUtils.toString(g.getGenericComponentType()))));
    }

    private static java.lang.StringBuilder appendAllTo(final java.lang.StringBuilder buf, final java.lang.String sep, final java.lang.reflect.Type... types) {
        org.apache.commons.lang3.Validate.notEmpty(org.apache.commons.lang3.Validate.noNullElements(types));
        if ((types.length) > 0) {
            buf.append(org.apache.commons.lang3.reflect.TypeUtils.toString(types[0]));
            for (int i = 1 ; i < (types.length) ; i++) {
                buf.append(sep).append(org.apache.commons.lang3.reflect.TypeUtils.toString(types[i]));
            }
        } 
        return ((_returnReplacementOperator1049.is("NULL")) ? ( null ) : (buf));
    }

    private static final metamutator.Selector _returnReplacementOperator937 = metamutator.Selector.of(937,new String[]{"INIT","NULL"}).id("_returnReplacementOperator937");

    private static final metamutator.Selector _returnReplacementOperator938 = metamutator.Selector.of(938,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator938");

    private static final metamutator.Selector _returnReplacementOperator939 = metamutator.Selector.of(939,new String[]{"INIT","NULL"}).id("_returnReplacementOperator939");

    private static final metamutator.Selector _returnReplacementOperator940 = metamutator.Selector.of(940,new String[]{"INIT","NULL"}).id("_returnReplacementOperator940");

    private static final metamutator.Selector _returnReplacementOperator941 = metamutator.Selector.of(941,new String[]{"INIT","NULL"}).id("_returnReplacementOperator941");

    private static final metamutator.Selector _returnReplacementOperator942 = metamutator.Selector.of(942,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator942");

    private static final metamutator.Selector _returnReplacementOperator943 = metamutator.Selector.of(943,new String[]{"INIT","NULL"}).id("_returnReplacementOperator943");

    private static final metamutator.Selector _returnReplacementOperator944 = metamutator.Selector.of(944,new String[]{"INIT","NULL"}).id("_returnReplacementOperator944");

    private static final metamutator.Selector _returnReplacementOperator945 = metamutator.Selector.of(945,new String[]{"INIT","NULL"}).id("_returnReplacementOperator945");

    private static final metamutator.Selector _returnReplacementOperator946 = metamutator.Selector.of(946,new String[]{"INIT","NULL"}).id("_returnReplacementOperator946");

    private static final metamutator.Selector _returnReplacementOperator947 = metamutator.Selector.of(947,new String[]{"INIT","NULL"}).id("_returnReplacementOperator947");

    private static final metamutator.Selector _returnReplacementOperator948 = metamutator.Selector.of(948,new String[]{"INIT","NULL"}).id("_returnReplacementOperator948");

    private static final metamutator.Selector _returnReplacementOperator949 = metamutator.Selector.of(949,new String[]{"INIT","NULL"}).id("_returnReplacementOperator949");

    private static final metamutator.Selector _returnReplacementOperator950 = metamutator.Selector.of(950,new String[]{"INIT","NULL"}).id("_returnReplacementOperator950");

    private static final metamutator.Selector _returnReplacementOperator951 = metamutator.Selector.of(951,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator951");

    private static final metamutator.Selector _returnReplacementOperator952 = metamutator.Selector.of(952,new String[]{"INIT","NULL"}).id("_returnReplacementOperator952");

    private static final metamutator.Selector _returnReplacementOperator953 = metamutator.Selector.of(953,new String[]{"INIT","NULL"}).id("_returnReplacementOperator953");

    private static final metamutator.Selector _returnReplacementOperator954 = metamutator.Selector.of(954,new String[]{"INIT","NULL"}).id("_returnReplacementOperator954");

    private static final metamutator.Selector _returnReplacementOperator955 = metamutator.Selector.of(955,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator955");

    private static final metamutator.Selector _returnReplacementOperator956 = metamutator.Selector.of(956,new String[]{"INIT","NULL"}).id("_returnReplacementOperator956");

    private static final metamutator.Selector _returnReplacementOperator957 = metamutator.Selector.of(957,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator957");

    private static final metamutator.Selector _returnReplacementOperator958 = metamutator.Selector.of(958,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator958");

    private static final metamutator.Selector _returnReplacementOperator959 = metamutator.Selector.of(959,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator959");

    private static final metamutator.Selector _returnReplacementOperator960 = metamutator.Selector.of(960,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator960");

    private static final metamutator.Selector _returnReplacementOperator961 = metamutator.Selector.of(961,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator961");

    private static final metamutator.Selector _returnReplacementOperator962 = metamutator.Selector.of(962,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator962");

    private static final metamutator.Selector _returnReplacementOperator963 = metamutator.Selector.of(963,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator963");

    private static final metamutator.Selector _returnReplacementOperator964 = metamutator.Selector.of(964,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator964");

    private static final metamutator.Selector _returnReplacementOperator965 = metamutator.Selector.of(965,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator965");

    private static final metamutator.Selector _returnReplacementOperator966 = metamutator.Selector.of(966,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator966");

    private static final metamutator.Selector _returnReplacementOperator967 = metamutator.Selector.of(967,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator967");

    private static final metamutator.Selector _returnReplacementOperator968 = metamutator.Selector.of(968,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator968");

    private static final metamutator.Selector _returnReplacementOperator969 = metamutator.Selector.of(969,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator969");

    private static final metamutator.Selector _returnReplacementOperator970 = metamutator.Selector.of(970,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator970");

    private static final metamutator.Selector _returnReplacementOperator971 = metamutator.Selector.of(971,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator971");

    private static final metamutator.Selector _returnReplacementOperator972 = metamutator.Selector.of(972,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator972");

    private static final metamutator.Selector _returnReplacementOperator973 = metamutator.Selector.of(973,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator973");

    private static final metamutator.Selector _returnReplacementOperator974 = metamutator.Selector.of(974,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator974");

    private static final metamutator.Selector _returnReplacementOperator975 = metamutator.Selector.of(975,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator975");

    private static final metamutator.Selector _returnReplacementOperator976 = metamutator.Selector.of(976,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator976");

    private static final metamutator.Selector _returnReplacementOperator977 = metamutator.Selector.of(977,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator977");

    private static final metamutator.Selector _returnReplacementOperator978 = metamutator.Selector.of(978,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator978");

    private static final metamutator.Selector _returnReplacementOperator979 = metamutator.Selector.of(979,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator979");

    private static final metamutator.Selector _returnReplacementOperator980 = metamutator.Selector.of(980,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator980");

    private static final metamutator.Selector _returnReplacementOperator981 = metamutator.Selector.of(981,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator981");

    private static final metamutator.Selector _returnReplacementOperator982 = metamutator.Selector.of(982,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator982");

    private static final metamutator.Selector _returnReplacementOperator983 = metamutator.Selector.of(983,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator983");

    private static final metamutator.Selector _returnReplacementOperator984 = metamutator.Selector.of(984,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator984");

    private static final metamutator.Selector _returnReplacementOperator985 = metamutator.Selector.of(985,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator985");

    private static final metamutator.Selector _returnReplacementOperator986 = metamutator.Selector.of(986,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator986");

    private static final metamutator.Selector _returnReplacementOperator987 = metamutator.Selector.of(987,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator987");

    private static final metamutator.Selector _returnReplacementOperator988 = metamutator.Selector.of(988,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator988");

    private static final metamutator.Selector _returnReplacementOperator989 = metamutator.Selector.of(989,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator989");

    private static final metamutator.Selector _returnReplacementOperator990 = metamutator.Selector.of(990,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator990");

    private static final metamutator.Selector _returnReplacementOperator991 = metamutator.Selector.of(991,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator991");

    private static final metamutator.Selector _returnReplacementOperator992 = metamutator.Selector.of(992,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator992");

    private static final metamutator.Selector _returnReplacementOperator993 = metamutator.Selector.of(993,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator993");

    private static final metamutator.Selector _returnReplacementOperator994 = metamutator.Selector.of(994,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator994");

    private static final metamutator.Selector _returnReplacementOperator995 = metamutator.Selector.of(995,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator995");

    private static final metamutator.Selector _returnReplacementOperator996 = metamutator.Selector.of(996,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator996");

    private static final metamutator.Selector _returnReplacementOperator997 = metamutator.Selector.of(997,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator997");

    private static final metamutator.Selector _returnReplacementOperator998 = metamutator.Selector.of(998,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator998");

    private static final metamutator.Selector _returnReplacementOperator999 = metamutator.Selector.of(999,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator999");

    private static final metamutator.Selector _returnReplacementOperator1000 = metamutator.Selector.of(1000,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1000");

    private static final metamutator.Selector _returnReplacementOperator1001 = metamutator.Selector.of(1001,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1001");

    private static final metamutator.Selector _returnReplacementOperator1002 = metamutator.Selector.of(1002,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1002");

    private static final metamutator.Selector _returnReplacementOperator1003 = metamutator.Selector.of(1003,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1003");

    private static final metamutator.Selector _returnReplacementOperator1004 = metamutator.Selector.of(1004,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1004");

    private static final metamutator.Selector _returnReplacementOperator1005 = metamutator.Selector.of(1005,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1005");

    private static final metamutator.Selector _returnReplacementOperator1006 = metamutator.Selector.of(1006,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1006");

    private static final metamutator.Selector _returnReplacementOperator1007 = metamutator.Selector.of(1007,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1007");

    private static final metamutator.Selector _returnReplacementOperator1008 = metamutator.Selector.of(1008,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1008");

    private static final metamutator.Selector _returnReplacementOperator1009 = metamutator.Selector.of(1009,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1009");

    private static final metamutator.Selector _returnReplacementOperator1010 = metamutator.Selector.of(1010,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1010");

    private static final metamutator.Selector _returnReplacementOperator1011 = metamutator.Selector.of(1011,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1011");

    private static final metamutator.Selector _returnReplacementOperator1012 = metamutator.Selector.of(1012,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1012");

    private static final metamutator.Selector _returnReplacementOperator1013 = metamutator.Selector.of(1013,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1013");

    private static final metamutator.Selector _returnReplacementOperator1014 = metamutator.Selector.of(1014,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1014");

    private static final metamutator.Selector _returnReplacementOperator1015 = metamutator.Selector.of(1015,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1015");

    private static final metamutator.Selector _returnReplacementOperator1016 = metamutator.Selector.of(1016,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1016");

    private static final metamutator.Selector _returnReplacementOperator1017 = metamutator.Selector.of(1017,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1017");

    private static final metamutator.Selector _returnReplacementOperator1018 = metamutator.Selector.of(1018,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1018");

    private static final metamutator.Selector _returnReplacementOperator1019 = metamutator.Selector.of(1019,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1019");

    private static final metamutator.Selector _returnReplacementOperator1020 = metamutator.Selector.of(1020,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1020");

    private static final metamutator.Selector _returnReplacementOperator1021 = metamutator.Selector.of(1021,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1021");

    private static final metamutator.Selector _returnReplacementOperator1022 = metamutator.Selector.of(1022,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1022");

    private static final metamutator.Selector _returnReplacementOperator1023 = metamutator.Selector.of(1023,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1023");

    private static final metamutator.Selector _returnReplacementOperator1024 = metamutator.Selector.of(1024,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1024");

    private static final metamutator.Selector _returnReplacementOperator1025 = metamutator.Selector.of(1025,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1025");

    private static final metamutator.Selector _returnReplacementOperator1026 = metamutator.Selector.of(1026,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1026");

    private static final metamutator.Selector _returnReplacementOperator1027 = metamutator.Selector.of(1027,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1027");

    private static final metamutator.Selector _returnReplacementOperator1028 = metamutator.Selector.of(1028,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1028");

    private static final metamutator.Selector _returnReplacementOperator1029 = metamutator.Selector.of(1029,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1029");

    private static final metamutator.Selector _returnReplacementOperator1030 = metamutator.Selector.of(1030,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1030");

    private static final metamutator.Selector _returnReplacementOperator1031 = metamutator.Selector.of(1031,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1031");

    private static final metamutator.Selector _returnReplacementOperator1032 = metamutator.Selector.of(1032,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1032");

    private static final metamutator.Selector _returnReplacementOperator1033 = metamutator.Selector.of(1033,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1033");

    private static final metamutator.Selector _returnReplacementOperator1034 = metamutator.Selector.of(1034,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1034");

    private static final metamutator.Selector _returnReplacementOperator1035 = metamutator.Selector.of(1035,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1035");

    private static final metamutator.Selector _returnReplacementOperator1036 = metamutator.Selector.of(1036,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1036");

    private static final metamutator.Selector _returnReplacementOperator1037 = metamutator.Selector.of(1037,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1037");

    private static final metamutator.Selector _returnReplacementOperator1038 = metamutator.Selector.of(1038,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1038");

    private static final metamutator.Selector _returnReplacementOperator1039 = metamutator.Selector.of(1039,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1039");

    private static final metamutator.Selector _returnReplacementOperator1040 = metamutator.Selector.of(1040,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1040");

    private static final metamutator.Selector _returnReplacementOperator1041 = metamutator.Selector.of(1041,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1041");

    private static final metamutator.Selector _returnReplacementOperator1042 = metamutator.Selector.of(1042,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1042");

    private static final metamutator.Selector _returnReplacementOperator1043 = metamutator.Selector.of(1043,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1043");

    private static final metamutator.Selector _returnReplacementOperator1044 = metamutator.Selector.of(1044,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1044");

    private static final metamutator.Selector _returnReplacementOperator1045 = metamutator.Selector.of(1045,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1045");

    private static final metamutator.Selector _returnReplacementOperator1046 = metamutator.Selector.of(1046,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1046");

    private static final metamutator.Selector _returnReplacementOperator1047 = metamutator.Selector.of(1047,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1047");

    private static final metamutator.Selector _returnReplacementOperator1048 = metamutator.Selector.of(1048,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1048");

    private static final metamutator.Selector _returnReplacementOperator1049 = metamutator.Selector.of(1049,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1049");

    private static final metamutator.Selector _returnReplacementOperator1050 = metamutator.Selector.of(1050,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1050");

    private static final metamutator.Selector _returnReplacementOperator1051 = metamutator.Selector.of(1051,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1051");

    private static final metamutator.Selector _returnReplacementOperator1052 = metamutator.Selector.of(1052,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1052");

    private static final metamutator.Selector _returnReplacementOperator1053 = metamutator.Selector.of(1053,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1053");

    private static final metamutator.Selector _returnReplacementOperator1054 = metamutator.Selector.of(1054,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1054");

    private static final metamutator.Selector _returnReplacementOperator1055 = metamutator.Selector.of(1055,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1055");

    private static final metamutator.Selector _returnReplacementOperator1056 = metamutator.Selector.of(1056,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1056");

    private static final metamutator.Selector _returnReplacementOperator1057 = metamutator.Selector.of(1057,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1057");

    private static final metamutator.Selector _returnReplacementOperator1058 = metamutator.Selector.of(1058,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1058");

    private static final metamutator.Selector _returnReplacementOperator1059 = metamutator.Selector.of(1059,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1059");

    private static final metamutator.Selector _returnReplacementOperator1060 = metamutator.Selector.of(1060,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1060");

    private static final metamutator.Selector _returnReplacementOperator1061 = metamutator.Selector.of(1061,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1061");

    private static final metamutator.Selector _returnReplacementOperator1062 = metamutator.Selector.of(1062,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1062");

    private static final metamutator.Selector _returnReplacementOperator1063 = metamutator.Selector.of(1063,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1063");

    private static final metamutator.Selector _returnReplacementOperator1064 = metamutator.Selector.of(1064,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1064");

    private static final metamutator.Selector _returnReplacementOperator1065 = metamutator.Selector.of(1065,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1065");

    private static final metamutator.Selector _returnReplacementOperator1066 = metamutator.Selector.of(1066,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1066");

    private static final metamutator.Selector _returnReplacementOperator1067 = metamutator.Selector.of(1067,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1067");

    private static final metamutator.Selector _returnReplacementOperator1068 = metamutator.Selector.of(1068,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1068");

    private static final metamutator.Selector _returnReplacementOperator1069 = metamutator.Selector.of(1069,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1069");

    private static final metamutator.Selector _returnReplacementOperator1070 = metamutator.Selector.of(1070,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1070");

    private static final metamutator.Selector _returnReplacementOperator1071 = metamutator.Selector.of(1071,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1071");

    private static final metamutator.Selector _returnReplacementOperator1072 = metamutator.Selector.of(1072,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1072");

    private static final metamutator.Selector _returnReplacementOperator1073 = metamutator.Selector.of(1073,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1073");

    private static final metamutator.Selector _returnReplacementOperator1074 = metamutator.Selector.of(1074,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1074");

    private static final metamutator.Selector _returnReplacementOperator1075 = metamutator.Selector.of(1075,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1075");

    private static final metamutator.Selector _returnReplacementOperator1076 = metamutator.Selector.of(1076,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1076");

    private static final metamutator.Selector _returnReplacementOperator1077 = metamutator.Selector.of(1077,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1077");

    private static final metamutator.Selector _returnReplacementOperator1078 = metamutator.Selector.of(1078,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1078");

    private static final metamutator.Selector _returnReplacementOperator1079 = metamutator.Selector.of(1079,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1079");

    private static final metamutator.Selector _returnReplacementOperator1080 = metamutator.Selector.of(1080,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1080");

    private static final metamutator.Selector _returnReplacementOperator1081 = metamutator.Selector.of(1081,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1081");

    private static final metamutator.Selector _returnReplacementOperator1082 = metamutator.Selector.of(1082,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1082");

    private static final metamutator.Selector _returnReplacementOperator1083 = metamutator.Selector.of(1083,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1083");

    private static final metamutator.Selector _returnReplacementOperator1084 = metamutator.Selector.of(1084,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1084");

    private static final metamutator.Selector _returnReplacementOperator1085 = metamutator.Selector.of(1085,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1085");

    private static final metamutator.Selector _returnReplacementOperator1086 = metamutator.Selector.of(1086,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1086");

    private static final metamutator.Selector _returnReplacementOperator1087 = metamutator.Selector.of(1087,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1087");

    private static final metamutator.Selector _returnReplacementOperator1088 = metamutator.Selector.of(1088,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1088");

    private static final metamutator.Selector _returnReplacementOperator1089 = metamutator.Selector.of(1089,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1089");

    private static final metamutator.Selector _returnReplacementOperator1090 = metamutator.Selector.of(1090,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1090");

    private static final metamutator.Selector _returnReplacementOperator1091 = metamutator.Selector.of(1091,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1091");

    private static final metamutator.Selector _returnReplacementOperator1092 = metamutator.Selector.of(1092,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1092");

    private static final metamutator.Selector _returnReplacementOperator1093 = metamutator.Selector.of(1093,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1093");

    private static final metamutator.Selector _returnReplacementOperator1094 = metamutator.Selector.of(1094,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperator1094");
}

