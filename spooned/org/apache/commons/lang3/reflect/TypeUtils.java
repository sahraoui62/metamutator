package org.apache.commons.lang3.reflect;


public class TypeUtils {
    public static class WildcardTypeBuilder implements org.apache.commons.lang3.builder.Builder<java.lang.reflect.WildcardType> {
        private WildcardTypeBuilder() {
        }

        private java.lang.reflect.Type[] upperBounds;

        private java.lang.reflect.Type[] lowerBounds;

        public org.apache.commons.lang3.reflect.TypeUtils.WildcardTypeBuilder withUpperBounds(final java.lang.reflect.Type... bounds) {
            this.upperBounds = bounds;
            return ((_returnReplacementOperatorHotSpot949.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        }

        public org.apache.commons.lang3.reflect.TypeUtils.WildcardTypeBuilder withLowerBounds(final java.lang.reflect.Type... bounds) {
            this.lowerBounds = bounds;
            return ((_returnReplacementOperatorHotSpot948.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        }

        @java.lang.Override
        public java.lang.reflect.WildcardType build() {
            return ((_returnReplacementOperatorHotSpot947.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.reflect.TypeUtils.WildcardTypeImpl(upperBounds , lowerBounds)));
        }
    }

    private static final class GenericArrayTypeImpl implements java.lang.reflect.GenericArrayType {
        private final java.lang.reflect.Type componentType;

        private GenericArrayTypeImpl(final java.lang.reflect.Type componentType) {
            this.componentType = componentType;
        }

        @java.lang.Override
        public java.lang.reflect.Type getGenericComponentType() {
            return ((_returnReplacementOperatorHotSpot940.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (componentType));
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ((_returnReplacementOperatorHotSpot939.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.toString(this)));
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            return ((_returnReplacementOperatorHotSpot937.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((obj == (this)) || ((obj instanceof java.lang.reflect.GenericArrayType) && (org.apache.commons.lang3.reflect.TypeUtils.equals(this, ((java.lang.reflect.GenericArrayType)(obj)))))));
        }

        @java.lang.Override
        public int hashCode() {
            int result = 67 << 4;
            result |= componentType.hashCode();
            return ((_returnReplacementOperatorHotSpot938.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot938.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot938.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (result));
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
            return ((_returnReplacementOperatorHotSpot945.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (raw));
        }

        @java.lang.Override
        public java.lang.reflect.Type getOwnerType() {
            return ((_returnReplacementOperatorHotSpot944.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (useOwner));
        }

        @java.lang.Override
        public java.lang.reflect.Type[] getActualTypeArguments() {
            return ((_returnReplacementOperatorHotSpot946.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (typeArguments.clone()));
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ((_returnReplacementOperatorHotSpot943.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.toString(this)));
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            return ((_returnReplacementOperatorHotSpot941.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((obj == (this)) || ((obj instanceof java.lang.reflect.ParameterizedType) && (org.apache.commons.lang3.reflect.TypeUtils.equals(this, ((java.lang.reflect.ParameterizedType)(obj)))))));
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
            return ((_returnReplacementOperatorHotSpot942.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot942.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot942.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (result));
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
            return ((_returnReplacementOperatorHotSpot954.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (upperBounds.clone()));
        }

        @java.lang.Override
        public java.lang.reflect.Type[] getLowerBounds() {
            return ((_returnReplacementOperatorHotSpot953.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (lowerBounds.clone()));
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ((_returnReplacementOperatorHotSpot952.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.toString(this)));
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            return ((_returnReplacementOperatorHotSpot950.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((obj == (this)) || ((obj instanceof java.lang.reflect.WildcardType) && (org.apache.commons.lang3.reflect.TypeUtils.equals(this, ((java.lang.reflect.WildcardType)(obj)))))));
        }

        @java.lang.Override
        public int hashCode() {
            int result = 73 << 8;
            result |= java.util.Arrays.hashCode(upperBounds);
            result <<= 8;
            result |= java.util.Arrays.hashCode(lowerBounds);
            return ((_returnReplacementOperatorHotSpot951.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot951.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot951.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (result));
        }
    }

    public static final java.lang.reflect.WildcardType WILDCARD_ALL = org.apache.commons.lang3.reflect.TypeUtils.wildcardType().withUpperBounds(java.lang.Object.class).build();

    public TypeUtils() {
        super();
    }

    public static boolean isAssignable(final java.lang.reflect.Type type, final java.lang.reflect.Type toType) {
        return ((_returnReplacementOperatorHotSpot1004.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, toType, null)));
    }

    private static boolean isAssignable(final java.lang.reflect.Type type, final java.lang.reflect.Type toType, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        if ((toType == null) || (toType instanceof java.lang.Class<?>)) {
            return ((_returnReplacementOperatorHotSpot1005.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, ((java.lang.Class<?>)(toType)))));
        } 
        if (toType instanceof java.lang.reflect.ParameterizedType) {
            return ((_returnReplacementOperatorHotSpot1006.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, ((java.lang.reflect.ParameterizedType)(toType)), typeVarAssigns)));
        } 
        if (toType instanceof java.lang.reflect.GenericArrayType) {
            return ((_returnReplacementOperatorHotSpot1007.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, ((java.lang.reflect.GenericArrayType)(toType)), typeVarAssigns)));
        } 
        if (toType instanceof java.lang.reflect.WildcardType) {
            return ((_returnReplacementOperatorHotSpot1008.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, ((java.lang.reflect.WildcardType)(toType)), typeVarAssigns)));
        } 
        if (toType instanceof java.lang.reflect.TypeVariable<?>) {
            return ((_returnReplacementOperatorHotSpot1009.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, ((java.lang.reflect.TypeVariable<?>)(toType)), typeVarAssigns)));
        } 
        throw new java.lang.IllegalStateException(("found an unhandled type: " + toType));
    }

    private static boolean isAssignable(final java.lang.reflect.Type type, final java.lang.Class<?> toClass) {
        if (type == null) {
            return ((_returnReplacementOperatorHotSpot978.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((toClass == null) || (!(toClass.isPrimitive()))));
        } 
        if (toClass == null) {
            return ((_returnReplacementOperatorHotSpot979.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if (toClass.equals(type)) {
            return ((_returnReplacementOperatorHotSpot980.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if (type instanceof java.lang.Class<?>) {
            return ((_returnReplacementOperatorHotSpot981.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassUtils.isAssignable(((java.lang.Class<?>)(type)), toClass)));
        } 
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return ((_returnReplacementOperatorHotSpot982.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.ParameterizedType)(type))), toClass)));
        } 
        if (type instanceof java.lang.reflect.TypeVariable<?>) {
            for (final java.lang.reflect.Type bound : ((java.lang.reflect.TypeVariable<?>)(type)).getBounds()) {
                if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toClass)) {
                    return ((_returnReplacementOperatorHotSpot983.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
                } 
            }
            return ((_returnReplacementOperatorHotSpot984.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return ((_returnReplacementOperatorHotSpot985.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((toClass.equals(java.lang.Object.class)) || ((toClass.isArray()) && (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(((java.lang.reflect.GenericArrayType)(type)).getGenericComponentType(), toClass.getComponentType())))));
        } 
        if (type instanceof java.lang.reflect.WildcardType) {
            return ((_returnReplacementOperatorHotSpot986.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        throw new java.lang.IllegalStateException(("found an unhandled type: " + type));
    }

    private static boolean isAssignable(final java.lang.reflect.Type type, final java.lang.reflect.ParameterizedType toParameterizedType, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        if (type == null) {
            return ((_returnReplacementOperatorHotSpot997.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if (toParameterizedType == null) {
            return ((_returnReplacementOperatorHotSpot998.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if (toParameterizedType.equals(type)) {
            return ((_returnReplacementOperatorHotSpot999.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        final java.lang.Class<?> toClass = org.apache.commons.lang3.reflect.TypeUtils.getRawType(toParameterizedType);
        final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> fromTypeVarAssigns = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(type, toClass, null);
        if (fromTypeVarAssigns == null) {
            return ((_returnReplacementOperatorHotSpot1000.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if (fromTypeVarAssigns.isEmpty()) {
            return ((_returnReplacementOperatorHotSpot1001.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> toTypeVarAssigns = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(toParameterizedType, toClass, typeVarAssigns);
        for (final java.lang.reflect.TypeVariable<?> var : toTypeVarAssigns.keySet()) {
            final java.lang.reflect.Type toTypeArg = org.apache.commons.lang3.reflect.TypeUtils.unrollVariableAssignments(var, toTypeVarAssigns);
            final java.lang.reflect.Type fromTypeArg = org.apache.commons.lang3.reflect.TypeUtils.unrollVariableAssignments(var, fromTypeVarAssigns);
            if (((fromTypeArg != null) && (!(toTypeArg.equals(fromTypeArg)))) && (!((toTypeArg instanceof java.lang.reflect.WildcardType) && (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(fromTypeArg, toTypeArg, typeVarAssigns))))) {
                return ((_returnReplacementOperatorHotSpot1002.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperatorHotSpot1003.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
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
        return ((_returnReplacementOperatorHotSpot1062.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    private static boolean isAssignable(final java.lang.reflect.Type type, final java.lang.reflect.GenericArrayType toGenericArrayType, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        if (type == null) {
            return ((_returnReplacementOperatorHotSpot987.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if (toGenericArrayType == null) {
            return ((_returnReplacementOperatorHotSpot988.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if (toGenericArrayType.equals(type)) {
            return ((_returnReplacementOperatorHotSpot989.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        final java.lang.reflect.Type toComponentType = toGenericArrayType.getGenericComponentType();
        if (type instanceof java.lang.Class<?>) {
            final java.lang.Class<?> cls = ((java.lang.Class<?>)(type));
            return ((_returnReplacementOperatorHotSpot990.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((cls.isArray()) && (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(cls.getComponentType(), toComponentType, typeVarAssigns))));
        } 
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return ((_returnReplacementOperatorHotSpot991.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(((java.lang.reflect.GenericArrayType)(type)).getGenericComponentType(), toComponentType, typeVarAssigns)));
        } 
        if (type instanceof java.lang.reflect.WildcardType) {
            for (final java.lang.reflect.Type bound : org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(((java.lang.reflect.WildcardType)(type)))) {
                if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toGenericArrayType)) {
                    return ((_returnReplacementOperatorHotSpot992.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
                } 
            }
            return ((_returnReplacementOperatorHotSpot993.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if (type instanceof java.lang.reflect.TypeVariable<?>) {
            for (final java.lang.reflect.Type bound : org.apache.commons.lang3.reflect.TypeUtils.getImplicitBounds(((java.lang.reflect.TypeVariable<?>)(type)))) {
                if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toGenericArrayType)) {
                    return ((_returnReplacementOperatorHotSpot994.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
                } 
            }
            return ((_returnReplacementOperatorHotSpot995.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return ((_returnReplacementOperatorHotSpot996.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        throw new java.lang.IllegalStateException(("found an unhandled type: " + type));
    }

    private static boolean isAssignable(final java.lang.reflect.Type type, final java.lang.reflect.WildcardType toWildcardType, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        if (type == null) {
            return ((_returnReplacementOperatorHotSpot1015.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if (toWildcardType == null) {
            return ((_returnReplacementOperatorHotSpot1016.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if (toWildcardType.equals(type)) {
            return ((_returnReplacementOperatorHotSpot1017.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
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
                        return ((_returnReplacementOperatorHotSpot1018.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
                    } 
                }
            }
            for (java.lang.reflect.Type toBound : toLowerBounds) {
                toBound = org.apache.commons.lang3.reflect.TypeUtils.substituteTypeVariables(toBound, typeVarAssigns);
                for (final java.lang.reflect.Type bound : lowerBounds) {
                    if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(toBound, bound, typeVarAssigns))) {
                        return ((_returnReplacementOperatorHotSpot1019.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
                    } 
                }
            }
            return ((_returnReplacementOperatorHotSpot1020.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        for (final java.lang.reflect.Type toBound : toUpperBounds) {
            if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, org.apache.commons.lang3.reflect.TypeUtils.substituteTypeVariables(toBound, typeVarAssigns), typeVarAssigns))) {
                return ((_returnReplacementOperatorHotSpot1021.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
        }
        for (final java.lang.reflect.Type toBound : toLowerBounds) {
            if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(org.apache.commons.lang3.reflect.TypeUtils.substituteTypeVariables(toBound, typeVarAssigns), type, typeVarAssigns))) {
                return ((_returnReplacementOperatorHotSpot1022.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperatorHotSpot1023.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    private static boolean isAssignable(final java.lang.reflect.Type type, final java.lang.reflect.TypeVariable<?> toTypeVariable, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        if (type == null) {
            return ((_returnReplacementOperatorHotSpot1010.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if (toTypeVariable == null) {
            return ((_returnReplacementOperatorHotSpot1011.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if (toTypeVariable.equals(type)) {
            return ((_returnReplacementOperatorHotSpot1012.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if (type instanceof java.lang.reflect.TypeVariable<?>) {
            final java.lang.reflect.Type[] bounds = org.apache.commons.lang3.reflect.TypeUtils.getImplicitBounds(((java.lang.reflect.TypeVariable<?>)(type)));
            for (final java.lang.reflect.Type bound : bounds) {
                if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toTypeVariable, typeVarAssigns)) {
                    return ((_returnReplacementOperatorHotSpot1013.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
                } 
            }
        } 
        if ((((type instanceof java.lang.Class<?>) || (type instanceof java.lang.reflect.ParameterizedType)) || (type instanceof java.lang.reflect.GenericArrayType)) || (type instanceof java.lang.reflect.WildcardType)) {
            return ((_returnReplacementOperatorHotSpot1014.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        throw new java.lang.IllegalStateException(("found an unhandled type: " + type));
    }

    private static java.lang.reflect.Type substituteTypeVariables(final java.lang.reflect.Type type, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        if ((type instanceof java.lang.reflect.TypeVariable<?>) && (typeVarAssigns != null)) {
            final java.lang.reflect.Type replacementType = typeVarAssigns.get(type);
            if (replacementType == null) {
                throw new java.lang.IllegalArgumentException(("missing assignment type for type variable " + type));
            } 
            return ((_returnReplacementOperatorHotSpot1060.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (replacementType));
        } 
        return ((_returnReplacementOperatorHotSpot1061.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (type));
    }

    public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(final java.lang.reflect.ParameterizedType type) {
        return ((_returnReplacementOperatorHotSpot1082.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(type, org.apache.commons.lang3.reflect.TypeUtils.getRawType(type), null)));
    }

    public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(final java.lang.reflect.Type type, final java.lang.Class<?> toClass) {
        return ((_returnReplacementOperatorHotSpot1086.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(type, toClass, null)));
    }

    private static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(final java.lang.reflect.Type type, final java.lang.Class<?> toClass, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> subtypeVarAssigns) {
        if (type instanceof java.lang.Class<?>) {
            return ((_returnReplacementOperatorHotSpot1087.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.Class<?>)(type)), toClass, subtypeVarAssigns)));
        } 
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return ((_returnReplacementOperatorHotSpot1088.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.reflect.ParameterizedType)(type)), toClass, subtypeVarAssigns)));
        } 
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return ((_returnReplacementOperatorHotSpot1089.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.reflect.GenericArrayType)(type)).getGenericComponentType(), (toClass.isArray() ? toClass.getComponentType() : toClass), subtypeVarAssigns)));
        } 
        if (type instanceof java.lang.reflect.WildcardType) {
            for (final java.lang.reflect.Type bound : org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(((java.lang.reflect.WildcardType)(type)))) {
                if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toClass)) {
                    return ((_returnReplacementOperatorHotSpot1090.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(bound, toClass, subtypeVarAssigns)));
                } 
            }
            return ((_returnReplacementOperatorHotSpot1091.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        if (type instanceof java.lang.reflect.TypeVariable<?>) {
            for (final java.lang.reflect.Type bound : org.apache.commons.lang3.reflect.TypeUtils.getImplicitBounds(((java.lang.reflect.TypeVariable<?>)(type)))) {
                if (org.apache.commons.lang3.reflect.TypeUtils.isAssignable(bound, toClass)) {
                    return ((_returnReplacementOperatorHotSpot1092.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(bound, toClass, subtypeVarAssigns)));
                } 
            }
            return ((_returnReplacementOperatorHotSpot1093.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        throw new java.lang.IllegalStateException(("found an unhandled type: " + type));
    }

    private static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(final java.lang.reflect.ParameterizedType parameterizedType, final java.lang.Class<?> toClass, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> subtypeVarAssigns) {
        final java.lang.Class<?> cls = org.apache.commons.lang3.reflect.TypeUtils.getRawType(parameterizedType);
        if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(cls, toClass))) {
            return ((_returnReplacementOperatorHotSpot1083.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
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
            return ((_returnReplacementOperatorHotSpot1084.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (typeVarAssigns));
        } 
        return ((_returnReplacementOperatorHotSpot1085.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(org.apache.commons.lang3.reflect.TypeUtils.getClosestParentType(cls, toClass), toClass, typeVarAssigns)));
    }

    private static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> getTypeArguments(java.lang.Class<?> cls, final java.lang.Class<?> toClass, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> subtypeVarAssigns) {
        if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(cls, toClass))) {
            return ((_returnReplacementOperatorHotSpot1078.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        if (cls.isPrimitive()) {
            if (toClass.isPrimitive()) {
                return ((_returnReplacementOperatorHotSpot1079.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.util.HashMap<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>()));
            } 
            cls = org.apache.commons.lang3.ClassUtils.primitiveToWrapper(cls);
        } 
        final java.util.HashMap<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns = subtypeVarAssigns == null ? new java.util.HashMap<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>() : new java.util.HashMap<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>(subtypeVarAssigns);
        if (toClass.equals(cls)) {
            return ((_returnReplacementOperatorHotSpot1080.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (typeVarAssigns));
        } 
        return ((_returnReplacementOperatorHotSpot1081.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(org.apache.commons.lang3.reflect.TypeUtils.getClosestParentType(cls, toClass), toClass, typeVarAssigns)));
    }

    public static java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> determineTypeArguments(final java.lang.Class<?> cls, final java.lang.reflect.ParameterizedType superType) {
        org.apache.commons.lang3.Validate.notNull(cls, "cls is null");
        org.apache.commons.lang3.Validate.notNull(superType, "superType is null");
        final java.lang.Class<?> superClass = org.apache.commons.lang3.reflect.TypeUtils.getRawType(superType);
        if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(cls, superClass))) {
            return ((_returnReplacementOperatorHotSpot1074.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        if (cls.equals(superClass)) {
            return ((_returnReplacementOperatorHotSpot1075.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(superType, superClass, null)));
        } 
        final java.lang.reflect.Type midType = org.apache.commons.lang3.reflect.TypeUtils.getClosestParentType(cls, superClass);
        if (midType instanceof java.lang.Class<?>) {
            return ((_returnReplacementOperatorHotSpot1076.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.determineTypeArguments(((java.lang.Class<?>)(midType)), superType)));
        } 
        final java.lang.reflect.ParameterizedType midParameterizedType = ((java.lang.reflect.ParameterizedType)(midType));
        final java.lang.Class<?> midClass = org.apache.commons.lang3.reflect.TypeUtils.getRawType(midParameterizedType);
        final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns = org.apache.commons.lang3.reflect.TypeUtils.determineTypeArguments(midClass, superType);
        org.apache.commons.lang3.reflect.TypeUtils.mapTypeVariablesToArguments(cls, midParameterizedType, typeVarAssigns);
        return ((_returnReplacementOperatorHotSpot1077.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (typeVarAssigns));
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
                return ((_returnReplacementOperatorHotSpot1058.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (genericInterface));
            } 
        } 
        return ((_returnReplacementOperatorHotSpot1059.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (cls.getGenericSuperclass()));
    }

    public static boolean isInstance(final java.lang.Object value, final java.lang.reflect.Type type) {
        if (type == null) {
            return ((_returnReplacementOperatorHotSpot1024.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperatorHotSpot1025.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (value == null ? (!(type instanceof java.lang.Class<?>)) || (!(((java.lang.Class<?>)(type)).isPrimitive())) : org.apache.commons.lang3.reflect.TypeUtils.isAssignable(value.getClass(), type, null)));
    }

    public static java.lang.reflect.Type[] normalizeUpperBounds(final java.lang.reflect.Type[] bounds) {
        org.apache.commons.lang3.Validate.notNull(bounds, "null value specified for bounds array");
        if ((bounds.length) < 2) {
            return ((_returnReplacementOperatorHotSpot1071.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (bounds));
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
        return ((_returnReplacementOperatorHotSpot1072.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (types.toArray(new java.lang.reflect.Type[types.size()])));
    }

    public static java.lang.reflect.Type[] getImplicitBounds(final java.lang.reflect.TypeVariable<?> typeVariable) {
        org.apache.commons.lang3.Validate.notNull(typeVariable, "typeVariable is null");
        final java.lang.reflect.Type[] bounds = typeVariable.getBounds();
        return ((_returnReplacementOperatorHotSpot1068.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((bounds.length) == 0 ? new java.lang.reflect.Type[]{ java.lang.Object.class } : org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(bounds)));
    }

    public static java.lang.reflect.Type[] getImplicitUpperBounds(final java.lang.reflect.WildcardType wildcardType) {
        org.apache.commons.lang3.Validate.notNull(wildcardType, "wildcardType is null");
        final java.lang.reflect.Type[] bounds = wildcardType.getUpperBounds();
        return ((_returnReplacementOperatorHotSpot1070.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((bounds.length) == 0 ? new java.lang.reflect.Type[]{ java.lang.Object.class } : org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(bounds)));
    }

    public static java.lang.reflect.Type[] getImplicitLowerBounds(final java.lang.reflect.WildcardType wildcardType) {
        org.apache.commons.lang3.Validate.notNull(wildcardType, "wildcardType is null");
        final java.lang.reflect.Type[] bounds = wildcardType.getLowerBounds();
        return ((_returnReplacementOperatorHotSpot1069.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((bounds.length) == 0 ? new java.lang.reflect.Type[]{ null } : bounds));
    }

    public static boolean typesSatisfyVariables(final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns) {
        org.apache.commons.lang3.Validate.notNull(typeVarAssigns, "typeVarAssigns is null");
        for (final java.util.Map.Entry<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> entry : typeVarAssigns.entrySet()) {
            final java.lang.reflect.TypeVariable<?> typeVar = entry.getKey();
            final java.lang.reflect.Type type = entry.getValue();
            for (final java.lang.reflect.Type bound : org.apache.commons.lang3.reflect.TypeUtils.getImplicitBounds(typeVar)) {
                if (!(org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type, org.apache.commons.lang3.reflect.TypeUtils.substituteTypeVariables(bound, typeVarAssigns), typeVarAssigns))) {
                    return ((_returnReplacementOperatorHotSpot1026.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
                } 
            }
        }
        return ((_returnReplacementOperatorHotSpot1027.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    private static java.lang.Class<?> getRawType(final java.lang.reflect.ParameterizedType parameterizedType) {
        final java.lang.reflect.Type rawType = parameterizedType.getRawType();
        if (!(rawType instanceof java.lang.Class<?>)) {
            throw new java.lang.IllegalStateException(("Wait... What!? Type of rawType: " + rawType));
        } 
        return ((_returnReplacementOperatorHotSpot1028.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((java.lang.Class<?>)(rawType))));
    }

    public static java.lang.Class<?> getRawType(final java.lang.reflect.Type type, final java.lang.reflect.Type assigningType) {
        if (type instanceof java.lang.Class<?>) {
            return ((_returnReplacementOperatorHotSpot1029.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((java.lang.Class<?>)(type))));
        } 
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return ((_returnReplacementOperatorHotSpot1030.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.ParameterizedType)(type)))));
        } 
        if (type instanceof java.lang.reflect.TypeVariable<?>) {
            if (assigningType == null) {
                return ((_returnReplacementOperatorHotSpot1031.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
            } 
            final java.lang.Object genericDeclaration = ((java.lang.reflect.TypeVariable<?>)(type)).getGenericDeclaration();
            if (!(genericDeclaration instanceof java.lang.Class<?>)) {
                return ((_returnReplacementOperatorHotSpot1032.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
            } 
            final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeVarAssigns = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(assigningType, ((java.lang.Class<?>)(genericDeclaration)));
            if (typeVarAssigns == null) {
                return ((_returnReplacementOperatorHotSpot1033.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
            } 
            final java.lang.reflect.Type typeArgument = typeVarAssigns.get(type);
            if (typeArgument == null) {
                return ((_returnReplacementOperatorHotSpot1034.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
            } 
            return ((_returnReplacementOperatorHotSpot1035.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.getRawType(typeArgument, assigningType)));
        } 
        if (type instanceof java.lang.reflect.GenericArrayType) {
            final java.lang.Class<?> rawComponentType = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.GenericArrayType)(type)).getGenericComponentType(), assigningType);
            return ((_returnReplacementOperatorHotSpot1036.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.reflect.Array.newInstance(rawComponentType, 0).getClass()));
        } 
        if (type instanceof java.lang.reflect.WildcardType) {
            return ((_returnReplacementOperatorHotSpot1037.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        throw new java.lang.IllegalArgumentException(("unknown type: " + type));
    }

    public static boolean isArrayType(final java.lang.reflect.Type type) {
        return ((_returnReplacementOperatorHotSpot977.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((type instanceof java.lang.reflect.GenericArrayType) || ((type instanceof java.lang.Class<?>) && (((java.lang.Class<?>)(type)).isArray()))));
    }

    public static java.lang.reflect.Type getArrayComponentType(final java.lang.reflect.Type type) {
        if (type instanceof java.lang.Class<?>) {
            final java.lang.Class<?> clazz = ((java.lang.Class<?>)(type));
            return ((_returnReplacementOperatorHotSpot1055.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (clazz.isArray() ? clazz.getComponentType() : null));
        } 
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return ((_returnReplacementOperatorHotSpot1056.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((java.lang.reflect.GenericArrayType)(type)).getGenericComponentType()));
        } 
        return ((_returnReplacementOperatorHotSpot1057.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
    }

    public static java.lang.reflect.Type unrollVariables(java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeArguments, final java.lang.reflect.Type type) {
        if (typeArguments == null) {
            typeArguments = java.util.Collections.<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>emptyMap();
        } 
        if (org.apache.commons.lang3.reflect.TypeUtils.containsTypeVariables(type)) {
            if (type instanceof java.lang.reflect.TypeVariable<?>) {
                return ((_returnReplacementOperatorHotSpot1063.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.unrollVariables(typeArguments, typeArguments.get(type))));
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
                return ((_returnReplacementOperatorHotSpot1064.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.parameterizeWithOwner(p.getOwnerType(), ((java.lang.Class<?>)(p.getRawType())), args)));
            } 
            if (type instanceof java.lang.reflect.WildcardType) {
                final java.lang.reflect.WildcardType wild = ((java.lang.reflect.WildcardType)(type));
                return ((_returnReplacementOperatorHotSpot1065.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.wildcardType().withUpperBounds(org.apache.commons.lang3.reflect.TypeUtils.unrollBounds(typeArguments, wild.getUpperBounds())).withLowerBounds(org.apache.commons.lang3.reflect.TypeUtils.unrollBounds(typeArguments, wild.getLowerBounds())).build()));
            } 
        } 
        return ((_returnReplacementOperatorHotSpot1066.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (type));
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
        return ((_returnReplacementOperatorHotSpot1073.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static boolean containsTypeVariables(final java.lang.reflect.Type type) {
        if (type instanceof java.lang.reflect.TypeVariable<?>) {
            return ((_returnReplacementOperatorHotSpot958.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if (type instanceof java.lang.Class<?>) {
            return ((_returnReplacementOperatorHotSpot959.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((((java.lang.Class<?>)(type)).getTypeParameters().length) > 0));
        } 
        if (type instanceof java.lang.reflect.ParameterizedType) {
            for (final java.lang.reflect.Type arg : ((java.lang.reflect.ParameterizedType)(type)).getActualTypeArguments()) {
                if (org.apache.commons.lang3.reflect.TypeUtils.containsTypeVariables(arg)) {
                    return ((_returnReplacementOperatorHotSpot960.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
                } 
            }
            return ((_returnReplacementOperatorHotSpot961.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if (type instanceof java.lang.reflect.WildcardType) {
            final java.lang.reflect.WildcardType wild = ((java.lang.reflect.WildcardType)(type));
            return ((_returnReplacementOperatorHotSpot962.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.reflect.TypeUtils.containsTypeVariables(org.apache.commons.lang3.reflect.TypeUtils.getImplicitLowerBounds(wild)[0])) || (org.apache.commons.lang3.reflect.TypeUtils.containsTypeVariables(org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(wild)[0]))));
        } 
        return ((_returnReplacementOperatorHotSpot963.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
    }

    public static final java.lang.reflect.ParameterizedType parameterize(final java.lang.Class<?> raw, final java.lang.reflect.Type... typeArguments) {
        return ((_returnReplacementOperatorHotSpot1051.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.parameterizeWithOwner(null, raw, typeArguments)));
    }

    public static final java.lang.reflect.ParameterizedType parameterize(final java.lang.Class<?> raw, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeArgMappings) {
        org.apache.commons.lang3.Validate.notNull(raw, "raw class is null");
        org.apache.commons.lang3.Validate.notNull(typeArgMappings, "typeArgMappings is null");
        return ((_returnReplacementOperatorHotSpot1052.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.parameterizeWithOwner(null, raw, org.apache.commons.lang3.reflect.TypeUtils.extractTypeArgumentsFrom(typeArgMappings, raw.getTypeParameters()))));
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
        return ((_returnReplacementOperatorHotSpot1053.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.reflect.TypeUtils.ParameterizedTypeImpl(raw , useOwner , typeArguments)));
    }

    public static final java.lang.reflect.ParameterizedType parameterizeWithOwner(final java.lang.reflect.Type owner, final java.lang.Class<?> raw, final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> typeArgMappings) {
        org.apache.commons.lang3.Validate.notNull(raw, "raw class is null");
        org.apache.commons.lang3.Validate.notNull(typeArgMappings, "typeArgMappings is null");
        return ((_returnReplacementOperatorHotSpot1054.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.parameterizeWithOwner(owner, raw, org.apache.commons.lang3.reflect.TypeUtils.extractTypeArgumentsFrom(typeArgMappings, raw.getTypeParameters()))));
    }

    private static java.lang.reflect.Type[] extractTypeArgumentsFrom(final java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> mappings, final java.lang.reflect.TypeVariable<?>[] variables) {
        final java.lang.reflect.Type[] result = new java.lang.reflect.Type[variables.length];
        int index = 0;
        for (final java.lang.reflect.TypeVariable<?> var : variables) {
            org.apache.commons.lang3.Validate.isTrue(mappings.containsKey(var), "missing argument mapping for %s", org.apache.commons.lang3.reflect.TypeUtils.toString(var));
            result[index++] = mappings.get(var);
        }
        return ((_returnReplacementOperatorHotSpot1067.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (result));
    }

    public static org.apache.commons.lang3.reflect.TypeUtils.WildcardTypeBuilder wildcardType() {
        return ((_returnReplacementOperatorHotSpot1094.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.reflect.TypeUtils.WildcardTypeBuilder()));
    }

    public static java.lang.reflect.GenericArrayType genericArrayType(final java.lang.reflect.Type componentType) {
        return ((_returnReplacementOperatorHotSpot1050.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.reflect.TypeUtils.GenericArrayTypeImpl(org.apache.commons.lang3.Validate.notNull(componentType, "componentType is null"))));
    }

    @java.lang.SuppressWarnings(value = "deprecation")
    public static boolean equals(final java.lang.reflect.Type t1, final java.lang.reflect.Type t2) {
        if (org.apache.commons.lang3.ObjectUtils.equals(t1, t2)) {
            return ((_returnReplacementOperatorHotSpot967.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if (t1 instanceof java.lang.reflect.ParameterizedType) {
            return ((_returnReplacementOperatorHotSpot968.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.equals(((java.lang.reflect.ParameterizedType)(t1)), t2)));
        } 
        if (t1 instanceof java.lang.reflect.GenericArrayType) {
            return ((_returnReplacementOperatorHotSpot969.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.equals(((java.lang.reflect.GenericArrayType)(t1)), t2)));
        } 
        if (t1 instanceof java.lang.reflect.WildcardType) {
            return ((_returnReplacementOperatorHotSpot970.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.equals(((java.lang.reflect.WildcardType)(t1)), t2)));
        } 
        return ((_returnReplacementOperatorHotSpot971.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
    }

    private static boolean equals(final java.lang.reflect.ParameterizedType p, final java.lang.reflect.Type t) {
        if (t instanceof java.lang.reflect.ParameterizedType) {
            final java.lang.reflect.ParameterizedType other = ((java.lang.reflect.ParameterizedType)(t));
            if ((org.apache.commons.lang3.reflect.TypeUtils.equals(p.getRawType(), other.getRawType())) && (org.apache.commons.lang3.reflect.TypeUtils.equals(p.getOwnerType(), other.getOwnerType()))) {
                return ((_returnReplacementOperatorHotSpot965.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.equals(p.getActualTypeArguments(), other.getActualTypeArguments())));
            } 
        } 
        return ((_returnReplacementOperatorHotSpot966.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
    }

    private static boolean equals(final java.lang.reflect.GenericArrayType a, final java.lang.reflect.Type t) {
        return ((_returnReplacementOperatorHotSpot964.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((t instanceof java.lang.reflect.GenericArrayType) && (org.apache.commons.lang3.reflect.TypeUtils.equals(a.getGenericComponentType(), ((java.lang.reflect.GenericArrayType)(t)).getGenericComponentType()))));
    }

    private static boolean equals(final java.lang.reflect.WildcardType w, final java.lang.reflect.Type t) {
        if (t instanceof java.lang.reflect.WildcardType) {
            final java.lang.reflect.WildcardType other = ((java.lang.reflect.WildcardType)(t));
            return ((_returnReplacementOperatorHotSpot975.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((org.apache.commons.lang3.reflect.TypeUtils.equals(org.apache.commons.lang3.reflect.TypeUtils.getImplicitLowerBounds(w), org.apache.commons.lang3.reflect.TypeUtils.getImplicitLowerBounds(other))) && (org.apache.commons.lang3.reflect.TypeUtils.equals(org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(w), org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(other)))));
        } 
        return ((_returnReplacementOperatorHotSpot976.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
    }

    private static boolean equals(final java.lang.reflect.Type[] t1, final java.lang.reflect.Type[] t2) {
        if ((t1.length) == (t2.length)) {
            for (int i = 0 ; i < (t1.length) ; i++) {
                if (!(org.apache.commons.lang3.reflect.TypeUtils.equals(t1[i], t2[i]))) {
                    return ((_returnReplacementOperatorHotSpot972.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
                } 
            }
            return ((_returnReplacementOperatorHotSpot973.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        return ((_returnReplacementOperatorHotSpot974.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
    }

    public static java.lang.String toString(final java.lang.reflect.Type type) {
        org.apache.commons.lang3.Validate.notNull(type);
        if (type instanceof java.lang.Class<?>) {
            return ((_returnReplacementOperatorHotSpot1042.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.classToString(((java.lang.Class<?>)(type)))));
        } 
        if (type instanceof java.lang.reflect.ParameterizedType) {
            return ((_returnReplacementOperatorHotSpot1043.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.parameterizedTypeToString(((java.lang.reflect.ParameterizedType)(type)))));
        } 
        if (type instanceof java.lang.reflect.WildcardType) {
            return ((_returnReplacementOperatorHotSpot1044.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.wildcardTypeToString(((java.lang.reflect.WildcardType)(type)))));
        } 
        if (type instanceof java.lang.reflect.TypeVariable<?>) {
            return ((_returnReplacementOperatorHotSpot1045.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.typeVariableToString(((java.lang.reflect.TypeVariable<?>)(type)))));
        } 
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return ((_returnReplacementOperatorHotSpot1046.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.genericArrayTypeToString(((java.lang.reflect.GenericArrayType)(type)))));
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
        return ((_returnReplacementOperatorHotSpot1041.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buf.append(':').append(org.apache.commons.lang3.reflect.TypeUtils.typeVariableToString(var)).toString()));
    }

    public static <T>org.apache.commons.lang3.reflect.Typed<T> wrap(final java.lang.reflect.Type type) {
        return ((_returnReplacementOperatorHotSpot957.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.reflect.Typed<T>() {
    @java.lang.Override
    public java.lang.reflect.Type getType() {
        return ((_returnReplacementOperatorHotSpot956.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (type));
    }
}));
    }

    public static <T>org.apache.commons.lang3.reflect.Typed<T> wrap(final java.lang.Class<T> type) {
        return ((_returnReplacementOperatorHotSpot955.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.TypeUtils.<T>wrap(((java.lang.reflect.Type)(type)))));
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
        return ((_returnReplacementOperatorHotSpot1038.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buf.toString()));
    }

    private static java.lang.String typeVariableToString(final java.lang.reflect.TypeVariable<?> v) {
        final java.lang.StringBuilder buf = new java.lang.StringBuilder(v.getName());
        final java.lang.reflect.Type[] bounds = v.getBounds();
        if (((bounds.length) > 0) && (!(((bounds.length) == 1) && (java.lang.Object.class.equals(bounds[0]))))) {
            buf.append(" extends ");
            org.apache.commons.lang3.reflect.TypeUtils.appendAllTo(buf, " & ", v.getBounds());
        } 
        return ((_returnReplacementOperatorHotSpot1047.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buf.toString()));
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
        return ((_returnReplacementOperatorHotSpot1040.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buf.toString()));
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
        return ((_returnReplacementOperatorHotSpot1048.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buf.toString()));
    }

    private static java.lang.String genericArrayTypeToString(final java.lang.reflect.GenericArrayType g) {
        return ((_returnReplacementOperatorHotSpot1039.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.String.format("%s[]", org.apache.commons.lang3.reflect.TypeUtils.toString(g.getGenericComponentType()))));
    }

    private static java.lang.StringBuilder appendAllTo(final java.lang.StringBuilder buf, final java.lang.String sep, final java.lang.reflect.Type... types) {
        org.apache.commons.lang3.Validate.notEmpty(org.apache.commons.lang3.Validate.noNullElements(types));
        if ((types.length) > 0) {
            buf.append(org.apache.commons.lang3.reflect.TypeUtils.toString(types[0]));
            for (int i = 1 ; i < (types.length) ; i++) {
                buf.append(sep).append(org.apache.commons.lang3.reflect.TypeUtils.toString(types[i]));
            }
        } 
        return ((_returnReplacementOperatorHotSpot1049.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buf));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot937 = metamutator.Selector.of(937,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot937");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot938 = metamutator.Selector.of(938,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot938");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot939 = metamutator.Selector.of(939,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot939");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot940 = metamutator.Selector.of(940,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot940");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot941 = metamutator.Selector.of(941,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot941");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot942 = metamutator.Selector.of(942,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot942");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot943 = metamutator.Selector.of(943,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot943");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot944 = metamutator.Selector.of(944,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot944");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot945 = metamutator.Selector.of(945,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot945");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot946 = metamutator.Selector.of(946,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot946");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot947 = metamutator.Selector.of(947,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot947");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot948 = metamutator.Selector.of(948,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot948");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot949 = metamutator.Selector.of(949,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot949");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot950 = metamutator.Selector.of(950,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot950");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot951 = metamutator.Selector.of(951,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot951");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot952 = metamutator.Selector.of(952,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot952");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot953 = metamutator.Selector.of(953,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot953");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot954 = metamutator.Selector.of(954,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot954");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot955 = metamutator.Selector.of(955,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot955");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot956 = metamutator.Selector.of(956,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot956");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot957 = metamutator.Selector.of(957,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot957");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot958 = metamutator.Selector.of(958,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot958");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot959 = metamutator.Selector.of(959,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot959");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot960 = metamutator.Selector.of(960,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot960");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot961 = metamutator.Selector.of(961,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot961");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot962 = metamutator.Selector.of(962,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot962");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot963 = metamutator.Selector.of(963,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot963");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot964 = metamutator.Selector.of(964,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot964");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot965 = metamutator.Selector.of(965,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot965");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot966 = metamutator.Selector.of(966,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot966");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot967 = metamutator.Selector.of(967,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot967");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot968 = metamutator.Selector.of(968,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot968");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot969 = metamutator.Selector.of(969,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot969");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot970 = metamutator.Selector.of(970,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot970");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot971 = metamutator.Selector.of(971,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot971");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot972 = metamutator.Selector.of(972,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot972");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot973 = metamutator.Selector.of(973,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot973");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot974 = metamutator.Selector.of(974,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot974");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot975 = metamutator.Selector.of(975,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot975");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot976 = metamutator.Selector.of(976,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot976");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot977 = metamutator.Selector.of(977,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot977");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot978 = metamutator.Selector.of(978,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot978");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot979 = metamutator.Selector.of(979,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot979");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot980 = metamutator.Selector.of(980,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot980");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot981 = metamutator.Selector.of(981,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot981");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot982 = metamutator.Selector.of(982,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot982");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot983 = metamutator.Selector.of(983,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot983");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot984 = metamutator.Selector.of(984,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot984");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot985 = metamutator.Selector.of(985,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot985");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot986 = metamutator.Selector.of(986,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot986");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot987 = metamutator.Selector.of(987,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot987");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot988 = metamutator.Selector.of(988,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot988");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot989 = metamutator.Selector.of(989,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot989");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot990 = metamutator.Selector.of(990,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot990");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot991 = metamutator.Selector.of(991,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot991");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot992 = metamutator.Selector.of(992,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot992");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot993 = metamutator.Selector.of(993,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot993");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot994 = metamutator.Selector.of(994,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot994");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot995 = metamutator.Selector.of(995,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot995");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot996 = metamutator.Selector.of(996,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot996");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot997 = metamutator.Selector.of(997,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot997");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot998 = metamutator.Selector.of(998,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot998");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot999 = metamutator.Selector.of(999,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot999");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1000 = metamutator.Selector.of(1000,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1000");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1001 = metamutator.Selector.of(1001,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1001");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1002 = metamutator.Selector.of(1002,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1002");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1003 = metamutator.Selector.of(1003,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1003");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1004 = metamutator.Selector.of(1004,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1004");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1005 = metamutator.Selector.of(1005,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1005");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1006 = metamutator.Selector.of(1006,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1006");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1007 = metamutator.Selector.of(1007,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1007");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1008 = metamutator.Selector.of(1008,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1008");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1009 = metamutator.Selector.of(1009,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1009");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1010 = metamutator.Selector.of(1010,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1010");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1011 = metamutator.Selector.of(1011,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1011");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1012 = metamutator.Selector.of(1012,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1012");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1013 = metamutator.Selector.of(1013,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1013");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1014 = metamutator.Selector.of(1014,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1014");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1015 = metamutator.Selector.of(1015,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1015");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1016 = metamutator.Selector.of(1016,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1016");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1017 = metamutator.Selector.of(1017,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1017");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1018 = metamutator.Selector.of(1018,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1018");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1019 = metamutator.Selector.of(1019,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1019");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1020 = metamutator.Selector.of(1020,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1020");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1021 = metamutator.Selector.of(1021,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1021");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1022 = metamutator.Selector.of(1022,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1022");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1023 = metamutator.Selector.of(1023,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1023");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1024 = metamutator.Selector.of(1024,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1024");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1025 = metamutator.Selector.of(1025,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1025");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1026 = metamutator.Selector.of(1026,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1026");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1027 = metamutator.Selector.of(1027,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1027");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1028 = metamutator.Selector.of(1028,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1028");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1029 = metamutator.Selector.of(1029,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1029");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1030 = metamutator.Selector.of(1030,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1030");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1031 = metamutator.Selector.of(1031,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1031");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1032 = metamutator.Selector.of(1032,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1032");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1033 = metamutator.Selector.of(1033,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1033");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1034 = metamutator.Selector.of(1034,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1034");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1035 = metamutator.Selector.of(1035,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1035");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1036 = metamutator.Selector.of(1036,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1036");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1037 = metamutator.Selector.of(1037,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1037");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1038 = metamutator.Selector.of(1038,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1038");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1039 = metamutator.Selector.of(1039,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1039");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1040 = metamutator.Selector.of(1040,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1040");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1041 = metamutator.Selector.of(1041,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1041");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1042 = metamutator.Selector.of(1042,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1042");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1043 = metamutator.Selector.of(1043,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1043");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1044 = metamutator.Selector.of(1044,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1044");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1045 = metamutator.Selector.of(1045,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1045");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1046 = metamutator.Selector.of(1046,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1046");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1047 = metamutator.Selector.of(1047,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1047");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1048 = metamutator.Selector.of(1048,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1048");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1049 = metamutator.Selector.of(1049,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1049");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1050 = metamutator.Selector.of(1050,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1050");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1051 = metamutator.Selector.of(1051,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1051");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1052 = metamutator.Selector.of(1052,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1052");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1053 = metamutator.Selector.of(1053,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1053");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1054 = metamutator.Selector.of(1054,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1054");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1055 = metamutator.Selector.of(1055,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1055");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1056 = metamutator.Selector.of(1056,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1056");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1057 = metamutator.Selector.of(1057,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1057");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1058 = metamutator.Selector.of(1058,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1058");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1059 = metamutator.Selector.of(1059,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1059");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1060 = metamutator.Selector.of(1060,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1060");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1061 = metamutator.Selector.of(1061,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1061");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1062 = metamutator.Selector.of(1062,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1062");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1063 = metamutator.Selector.of(1063,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1063");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1064 = metamutator.Selector.of(1064,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1064");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1065 = metamutator.Selector.of(1065,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1065");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1066 = metamutator.Selector.of(1066,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1066");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1067 = metamutator.Selector.of(1067,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1067");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1068 = metamutator.Selector.of(1068,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1068");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1069 = metamutator.Selector.of(1069,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1069");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1070 = metamutator.Selector.of(1070,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1070");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1071 = metamutator.Selector.of(1071,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1071");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1072 = metamutator.Selector.of(1072,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1072");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1073 = metamutator.Selector.of(1073,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1073");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1074 = metamutator.Selector.of(1074,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1074");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1075 = metamutator.Selector.of(1075,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1075");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1076 = metamutator.Selector.of(1076,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1076");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1077 = metamutator.Selector.of(1077,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1077");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1078 = metamutator.Selector.of(1078,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1078");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1079 = metamutator.Selector.of(1079,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1079");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1080 = metamutator.Selector.of(1080,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1080");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1081 = metamutator.Selector.of(1081,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1081");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1082 = metamutator.Selector.of(1082,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1082");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1083 = metamutator.Selector.of(1083,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1083");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1084 = metamutator.Selector.of(1084,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1084");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1085 = metamutator.Selector.of(1085,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1085");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1086 = metamutator.Selector.of(1086,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1086");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1087 = metamutator.Selector.of(1087,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1087");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1088 = metamutator.Selector.of(1088,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1088");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1089 = metamutator.Selector.of(1089,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1089");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1090 = metamutator.Selector.of(1090,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1090");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1091 = metamutator.Selector.of(1091,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1091");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1092 = metamutator.Selector.of(1092,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1092");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1093 = metamutator.Selector.of(1093,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1093");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1094 = metamutator.Selector.of(1094,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.TypeUtils.class).id("_returnReplacementOperatorHotSpot1094");
}

