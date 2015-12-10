package org.apache.commons.lang3.reflect;


public class FieldUtils {
    public FieldUtils() {
        super();
    }

    public static java.lang.reflect.Field getField(final java.lang.Class<?> cls, final java.lang.String fieldName) {
        final java.lang.reflect.Field field = org.apache.commons.lang3.reflect.FieldUtils.getField(cls, fieldName, false);
        org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(field);
        return ((_returnReplacementOperatorHotSpot884.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (field));
    }

    public static java.lang.reflect.Field getField(final java.lang.Class<?> cls, final java.lang.String fieldName, final boolean forceAccess) {
        org.apache.commons.lang3.Validate.isTrue((cls != null), "The class must not be null");
        org.apache.commons.lang3.Validate.isTrue(org.apache.commons.lang3.StringUtils.isNotBlank(fieldName), "The field name must not be blank/empty");
        for (java.lang.Class<?> acls = cls ; acls != null ; acls = acls.getSuperclass()) {
            try {
                final java.lang.reflect.Field field = acls.getDeclaredField(fieldName);
                if (!(java.lang.reflect.Modifier.isPublic(field.getModifiers()))) {
                    if (forceAccess) {
                        field.setAccessible(true);
                    } else {
                        continue;
                    }
                } 
                return ((_returnReplacementOperatorHotSpot885.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (field));
            } catch (final java.lang.NoSuchFieldException ex) {
            }
        }
        java.lang.reflect.Field match = null;
        for (final java.lang.Class<?> class1 : org.apache.commons.lang3.ClassUtils.getAllInterfaces(cls)) {
            try {
                final java.lang.reflect.Field test = class1.getField(fieldName);
                org.apache.commons.lang3.Validate.isTrue((match == null), ("Reference to field %s is ambiguous relative to %s" + "; a matching field exists on two or more implemented interfaces."), fieldName, cls);
                match = test;
            } catch (final java.lang.NoSuchFieldException ex) {
            }
        }
        return ((_returnReplacementOperatorHotSpot886.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (match));
    }

    public static java.lang.reflect.Field getDeclaredField(final java.lang.Class<?> cls, final java.lang.String fieldName) {
        return ((_returnReplacementOperatorHotSpot880.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(cls, fieldName, false)));
    }

    public static java.lang.reflect.Field getDeclaredField(final java.lang.Class<?> cls, final java.lang.String fieldName, final boolean forceAccess) {
        org.apache.commons.lang3.Validate.isTrue((cls != null), "The class must not be null");
        org.apache.commons.lang3.Validate.isTrue(org.apache.commons.lang3.StringUtils.isNotBlank(fieldName), "The field name must not be blank/empty");
        try {
            final java.lang.reflect.Field field = cls.getDeclaredField(fieldName);
            if (!(org.apache.commons.lang3.reflect.MemberUtils.isAccessible(field))) {
                if (forceAccess) {
                    field.setAccessible(true);
                } else {
                    return ((_returnReplacementOperatorHotSpot881.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
                }
            } 
            return ((_returnReplacementOperatorHotSpot882.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (field));
        } catch (final java.lang.NoSuchFieldException e) {
        }
        return ((_returnReplacementOperatorHotSpot883.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
    }

    public static java.lang.reflect.Field[] getAllFields(final java.lang.Class<?> cls) {
        final java.util.List<java.lang.reflect.Field> allFieldsList = org.apache.commons.lang3.reflect.FieldUtils.getAllFieldsList(cls);
        return ((_returnReplacementOperatorHotSpot887.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (allFieldsList.toArray(new java.lang.reflect.Field[allFieldsList.size()])));
    }

    public static java.util.List<java.lang.reflect.Field> getAllFieldsList(final java.lang.Class<?> cls) {
        org.apache.commons.lang3.Validate.isTrue((cls != null), "The class must not be null");
        final java.util.List<java.lang.reflect.Field> allFields = new java.util.ArrayList<java.lang.reflect.Field>();
        java.lang.Class<?> currentClass = cls;
        while (currentClass != null) {
            final java.lang.reflect.Field[] declaredFields = currentClass.getDeclaredFields();
            for (final java.lang.reflect.Field field : declaredFields) {
                allFields.add(field);
            }
            currentClass = currentClass.getSuperclass();
        }
        return ((_returnReplacementOperatorHotSpot889.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (allFields));
    }

    public static java.lang.reflect.Field[] getFieldsWithAnnotation(final java.lang.Class<?> cls, final java.lang.Class<? extends java.lang.annotation.Annotation> annotationCls) {
        final java.util.List<java.lang.reflect.Field> annotatedFieldsList = org.apache.commons.lang3.reflect.FieldUtils.getFieldsListWithAnnotation(cls, annotationCls);
        return ((_returnReplacementOperatorHotSpot888.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (annotatedFieldsList.toArray(new java.lang.reflect.Field[annotatedFieldsList.size()])));
    }

    public static java.util.List<java.lang.reflect.Field> getFieldsListWithAnnotation(final java.lang.Class<?> cls, final java.lang.Class<? extends java.lang.annotation.Annotation> annotationCls) {
        org.apache.commons.lang3.Validate.isTrue((annotationCls != null), "The annotation class must not be null");
        final java.util.List<java.lang.reflect.Field> allFields = org.apache.commons.lang3.reflect.FieldUtils.getAllFieldsList(cls);
        final java.util.List<java.lang.reflect.Field> annotatedFields = new java.util.ArrayList<java.lang.reflect.Field>();
        for (final java.lang.reflect.Field field : allFields) {
            if ((field.getAnnotation(annotationCls)) != null) {
                annotatedFields.add(field);
            } 
        }
        return ((_returnReplacementOperatorHotSpot890.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (annotatedFields));
    }

    public static java.lang.Object readStaticField(final java.lang.reflect.Field field) throws java.lang.IllegalAccessException {
        return ((_returnReplacementOperatorHotSpot878.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readStaticField(field, false)));
    }

    public static java.lang.Object readStaticField(final java.lang.reflect.Field field, final boolean forceAccess) throws java.lang.IllegalAccessException {
        org.apache.commons.lang3.Validate.isTrue((field != null), "The field must not be null");
        org.apache.commons.lang3.Validate.isTrue(java.lang.reflect.Modifier.isStatic(field.getModifiers()), "The field '%s' is not static", field.getName());
        return ((_returnReplacementOperatorHotSpot879.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readField(field, ((java.lang.Object)(null)), forceAccess)));
    }

    public static java.lang.Object readStaticField(final java.lang.Class<?> cls, final java.lang.String fieldName) throws java.lang.IllegalAccessException {
        return ((_returnReplacementOperatorHotSpot876.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readStaticField(cls, fieldName, false)));
    }

    public static java.lang.Object readStaticField(final java.lang.Class<?> cls, final java.lang.String fieldName, final boolean forceAccess) throws java.lang.IllegalAccessException {
        final java.lang.reflect.Field field = org.apache.commons.lang3.reflect.FieldUtils.getField(cls, fieldName, forceAccess);
        org.apache.commons.lang3.Validate.isTrue((field != null), "Cannot locate field '%s' on %s", fieldName, cls);
        return ((_returnReplacementOperatorHotSpot877.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readStaticField(field, false)));
    }

    public static java.lang.Object readDeclaredStaticField(final java.lang.Class<?> cls, final java.lang.String fieldName) throws java.lang.IllegalAccessException {
        return ((_returnReplacementOperatorHotSpot870.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readDeclaredStaticField(cls, fieldName, false)));
    }

    public static java.lang.Object readDeclaredStaticField(final java.lang.Class<?> cls, final java.lang.String fieldName, final boolean forceAccess) throws java.lang.IllegalAccessException {
        final java.lang.reflect.Field field = org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(cls, fieldName, forceAccess);
        org.apache.commons.lang3.Validate.isTrue((field != null), "Cannot locate declared field %s.%s", cls.getName(), fieldName);
        return ((_returnReplacementOperatorHotSpot871.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readStaticField(field, false)));
    }

    public static java.lang.Object readField(final java.lang.reflect.Field field, final java.lang.Object target) throws java.lang.IllegalAccessException {
        return ((_returnReplacementOperatorHotSpot874.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readField(field, target, false)));
    }

    public static java.lang.Object readField(final java.lang.reflect.Field field, final java.lang.Object target, final boolean forceAccess) throws java.lang.IllegalAccessException {
        org.apache.commons.lang3.Validate.isTrue((field != null), "The field must not be null");
        if (forceAccess && (!(field.isAccessible()))) {
            field.setAccessible(true);
        } else {
            org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(field);
        }
        return ((_returnReplacementOperatorHotSpot875.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (field.get(target)));
    }

    public static java.lang.Object readField(final java.lang.Object target, final java.lang.String fieldName) throws java.lang.IllegalAccessException {
        return ((_returnReplacementOperatorHotSpot872.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readField(target, fieldName, false)));
    }

    public static java.lang.Object readField(final java.lang.Object target, final java.lang.String fieldName, final boolean forceAccess) throws java.lang.IllegalAccessException {
        org.apache.commons.lang3.Validate.isTrue((target != null), "target object must not be null");
        final java.lang.Class<?> cls = target.getClass();
        final java.lang.reflect.Field field = org.apache.commons.lang3.reflect.FieldUtils.getField(cls, fieldName, forceAccess);
        org.apache.commons.lang3.Validate.isTrue((field != null), "Cannot locate field %s on %s", fieldName, cls);
        return ((_returnReplacementOperatorHotSpot873.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readField(field, target, false)));
    }

    public static java.lang.Object readDeclaredField(final java.lang.Object target, final java.lang.String fieldName) throws java.lang.IllegalAccessException {
        return ((_returnReplacementOperatorHotSpot868.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(target, fieldName, false)));
    }

    public static java.lang.Object readDeclaredField(final java.lang.Object target, final java.lang.String fieldName, final boolean forceAccess) throws java.lang.IllegalAccessException {
        org.apache.commons.lang3.Validate.isTrue((target != null), "target object must not be null");
        final java.lang.Class<?> cls = target.getClass();
        final java.lang.reflect.Field field = org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(cls, fieldName, forceAccess);
        org.apache.commons.lang3.Validate.isTrue((field != null), "Cannot locate declared field %s.%s", cls, fieldName);
        return ((_returnReplacementOperatorHotSpot869.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readField(field, target, false)));
    }

    public static void writeStaticField(final java.lang.reflect.Field field, final java.lang.Object value) throws java.lang.IllegalAccessException {
        org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field, value, false);
    }

    public static void writeStaticField(final java.lang.reflect.Field field, final java.lang.Object value, final boolean forceAccess) throws java.lang.IllegalAccessException {
        org.apache.commons.lang3.Validate.isTrue((field != null), "The field must not be null");
        org.apache.commons.lang3.Validate.isTrue(java.lang.reflect.Modifier.isStatic(field.getModifiers()), "The field %s.%s is not static", field.getDeclaringClass().getName(), field.getName());
        org.apache.commons.lang3.reflect.FieldUtils.writeField(field, ((java.lang.Object)(null)), value, forceAccess);
    }

    public static void writeStaticField(final java.lang.Class<?> cls, final java.lang.String fieldName, final java.lang.Object value) throws java.lang.IllegalAccessException {
        org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(cls, fieldName, value, false);
    }

    public static void writeStaticField(final java.lang.Class<?> cls, final java.lang.String fieldName, final java.lang.Object value, final boolean forceAccess) throws java.lang.IllegalAccessException {
        final java.lang.reflect.Field field = org.apache.commons.lang3.reflect.FieldUtils.getField(cls, fieldName, forceAccess);
        org.apache.commons.lang3.Validate.isTrue((field != null), "Cannot locate field %s on %s", fieldName, cls);
        org.apache.commons.lang3.reflect.FieldUtils.writeStaticField(field, value, false);
    }

    public static void writeDeclaredStaticField(final java.lang.Class<?> cls, final java.lang.String fieldName, final java.lang.Object value) throws java.lang.IllegalAccessException {
        org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredStaticField(cls, fieldName, value, false);
    }

    public static void writeDeclaredStaticField(final java.lang.Class<?> cls, final java.lang.String fieldName, final java.lang.Object value, final boolean forceAccess) throws java.lang.IllegalAccessException {
        final java.lang.reflect.Field field = org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(cls, fieldName, forceAccess);
        org.apache.commons.lang3.Validate.isTrue((field != null), "Cannot locate declared field %s.%s", cls.getName(), fieldName);
        org.apache.commons.lang3.reflect.FieldUtils.writeField(field, ((java.lang.Object)(null)), value, false);
    }

    public static void writeField(final java.lang.reflect.Field field, final java.lang.Object target, final java.lang.Object value) throws java.lang.IllegalAccessException {
        org.apache.commons.lang3.reflect.FieldUtils.writeField(field, target, value, false);
    }

    public static void writeField(final java.lang.reflect.Field field, final java.lang.Object target, final java.lang.Object value, final boolean forceAccess) throws java.lang.IllegalAccessException {
        org.apache.commons.lang3.Validate.isTrue((field != null), "The field must not be null");
        if (forceAccess && (!(field.isAccessible()))) {
            field.setAccessible(true);
        } else {
            org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(field);
        }
        field.set(target, value);
    }

    public static void removeFinalModifier(final java.lang.reflect.Field field) {
        org.apache.commons.lang3.reflect.FieldUtils.removeFinalModifier(field, true);
    }

    public static void removeFinalModifier(final java.lang.reflect.Field field, final boolean forceAccess) {
        org.apache.commons.lang3.Validate.isTrue((field != null), "The field must not be null");
        try {
            if (java.lang.reflect.Modifier.isFinal(field.getModifiers())) {
                final java.lang.reflect.Field modifiersField = java.lang.reflect.Field.class.getDeclaredField("modifiers");
                final boolean doForceAccess = forceAccess && (!(modifiersField.isAccessible()));
                if (doForceAccess) {
                    modifiersField.setAccessible(true);
                } 
                try {
                    modifiersField.setInt(field, ((field.getModifiers()) & (~(java.lang.reflect.Modifier.FINAL))));
                } finally {
                    if (doForceAccess) {
                        modifiersField.setAccessible(false);
                    } 
                }
            } 
        } catch (final java.lang.NoSuchFieldException ignored) {
        } catch (final java.lang.IllegalAccessException ignored) {
        }
    }

    public static void writeField(final java.lang.Object target, final java.lang.String fieldName, final java.lang.Object value) throws java.lang.IllegalAccessException {
        org.apache.commons.lang3.reflect.FieldUtils.writeField(target, fieldName, value, false);
    }

    public static void writeField(final java.lang.Object target, final java.lang.String fieldName, final java.lang.Object value, final boolean forceAccess) throws java.lang.IllegalAccessException {
        org.apache.commons.lang3.Validate.isTrue((target != null), "target object must not be null");
        final java.lang.Class<?> cls = target.getClass();
        final java.lang.reflect.Field field = org.apache.commons.lang3.reflect.FieldUtils.getField(cls, fieldName, forceAccess);
        org.apache.commons.lang3.Validate.isTrue((field != null), "Cannot locate declared field %s.%s", cls.getName(), fieldName);
        org.apache.commons.lang3.reflect.FieldUtils.writeField(field, target, value, false);
    }

    public static void writeDeclaredField(final java.lang.Object target, final java.lang.String fieldName, final java.lang.Object value) throws java.lang.IllegalAccessException {
        org.apache.commons.lang3.reflect.FieldUtils.writeDeclaredField(target, fieldName, value, false);
    }

    public static void writeDeclaredField(final java.lang.Object target, final java.lang.String fieldName, final java.lang.Object value, final boolean forceAccess) throws java.lang.IllegalAccessException {
        org.apache.commons.lang3.Validate.isTrue((target != null), "target object must not be null");
        final java.lang.Class<?> cls = target.getClass();
        final java.lang.reflect.Field field = org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(cls, fieldName, forceAccess);
        org.apache.commons.lang3.Validate.isTrue((field != null), "Cannot locate declared field %s.%s", cls.getName(), fieldName);
        org.apache.commons.lang3.reflect.FieldUtils.writeField(field, target, value, false);
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot868 = metamutator.Selector.of(868,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot868");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot869 = metamutator.Selector.of(869,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot869");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot870 = metamutator.Selector.of(870,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot870");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot871 = metamutator.Selector.of(871,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot871");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot872 = metamutator.Selector.of(872,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot872");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot873 = metamutator.Selector.of(873,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot873");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot874 = metamutator.Selector.of(874,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot874");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot875 = metamutator.Selector.of(875,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot875");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot876 = metamutator.Selector.of(876,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot876");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot877 = metamutator.Selector.of(877,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot877");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot878 = metamutator.Selector.of(878,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot878");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot879 = metamutator.Selector.of(879,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot879");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot880 = metamutator.Selector.of(880,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot880");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot881 = metamutator.Selector.of(881,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot881");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot882 = metamutator.Selector.of(882,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot882");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot883 = metamutator.Selector.of(883,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot883");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot884 = metamutator.Selector.of(884,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot884");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot885 = metamutator.Selector.of(885,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot885");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot886 = metamutator.Selector.of(886,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot886");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot887 = metamutator.Selector.of(887,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot887");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot888 = metamutator.Selector.of(888,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot888");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot889 = metamutator.Selector.of(889,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot889");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot890 = metamutator.Selector.of(890,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperatorHotSpot890");
}

