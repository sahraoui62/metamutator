package org.apache.commons.lang3.reflect;


public class FieldUtils {
    public FieldUtils() {
        super();
    }

    public static java.lang.reflect.Field getField(final java.lang.Class<?> cls, final java.lang.String fieldName) {
        final java.lang.reflect.Field field = org.apache.commons.lang3.reflect.FieldUtils.getField(cls, fieldName, false);
        org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(field);
        return ((_returnReplacementOperator884.is("NULL")) ? ( null ) : (field));
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
                return ((_returnReplacementOperator885.is("NULL")) ? ( null ) : (field));
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
        return ((_returnReplacementOperator886.is("NULL")) ? ( null ) : (match));
    }

    public static java.lang.reflect.Field getDeclaredField(final java.lang.Class<?> cls, final java.lang.String fieldName) {
        return ((_returnReplacementOperator880.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(cls, fieldName, false)));
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
                    return ((_returnReplacementOperator881.is("NULL")) ? ( null ) : (null));
                }
            } 
            return ((_returnReplacementOperator882.is("NULL")) ? ( null ) : (field));
        } catch (final java.lang.NoSuchFieldException e) {
        }
        return ((_returnReplacementOperator883.is("NULL")) ? ( null ) : (null));
    }

    public static java.lang.reflect.Field[] getAllFields(final java.lang.Class<?> cls) {
        final java.util.List<java.lang.reflect.Field> allFieldsList = org.apache.commons.lang3.reflect.FieldUtils.getAllFieldsList(cls);
        return ((_returnReplacementOperator887.is("NULL")) ? ( null ) : (allFieldsList.toArray(new java.lang.reflect.Field[allFieldsList.size()])));
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
        return ((_returnReplacementOperator889.is("NULL")) ? ( null ) : (allFields));
    }

    public static java.lang.reflect.Field[] getFieldsWithAnnotation(final java.lang.Class<?> cls, final java.lang.Class<? extends java.lang.annotation.Annotation> annotationCls) {
        final java.util.List<java.lang.reflect.Field> annotatedFieldsList = org.apache.commons.lang3.reflect.FieldUtils.getFieldsListWithAnnotation(cls, annotationCls);
        return ((_returnReplacementOperator888.is("NULL")) ? ( null ) : (annotatedFieldsList.toArray(new java.lang.reflect.Field[annotatedFieldsList.size()])));
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
        return ((_returnReplacementOperator890.is("NULL")) ? ( null ) : (annotatedFields));
    }

    public static java.lang.Object readStaticField(final java.lang.reflect.Field field) throws java.lang.IllegalAccessException {
        return ((_returnReplacementOperator878.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readStaticField(field, false)));
    }

    public static java.lang.Object readStaticField(final java.lang.reflect.Field field, final boolean forceAccess) throws java.lang.IllegalAccessException {
        org.apache.commons.lang3.Validate.isTrue((field != null), "The field must not be null");
        org.apache.commons.lang3.Validate.isTrue(java.lang.reflect.Modifier.isStatic(field.getModifiers()), "The field '%s' is not static", field.getName());
        return ((_returnReplacementOperator879.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readField(field, ((java.lang.Object)(null)), forceAccess)));
    }

    public static java.lang.Object readStaticField(final java.lang.Class<?> cls, final java.lang.String fieldName) throws java.lang.IllegalAccessException {
        return ((_returnReplacementOperator876.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readStaticField(cls, fieldName, false)));
    }

    public static java.lang.Object readStaticField(final java.lang.Class<?> cls, final java.lang.String fieldName, final boolean forceAccess) throws java.lang.IllegalAccessException {
        final java.lang.reflect.Field field = org.apache.commons.lang3.reflect.FieldUtils.getField(cls, fieldName, forceAccess);
        org.apache.commons.lang3.Validate.isTrue((field != null), "Cannot locate field '%s' on %s", fieldName, cls);
        return ((_returnReplacementOperator877.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readStaticField(field, false)));
    }

    public static java.lang.Object readDeclaredStaticField(final java.lang.Class<?> cls, final java.lang.String fieldName) throws java.lang.IllegalAccessException {
        return ((_returnReplacementOperator870.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readDeclaredStaticField(cls, fieldName, false)));
    }

    public static java.lang.Object readDeclaredStaticField(final java.lang.Class<?> cls, final java.lang.String fieldName, final boolean forceAccess) throws java.lang.IllegalAccessException {
        final java.lang.reflect.Field field = org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(cls, fieldName, forceAccess);
        org.apache.commons.lang3.Validate.isTrue((field != null), "Cannot locate declared field %s.%s", cls.getName(), fieldName);
        return ((_returnReplacementOperator871.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readStaticField(field, false)));
    }

    public static java.lang.Object readField(final java.lang.reflect.Field field, final java.lang.Object target) throws java.lang.IllegalAccessException {
        return ((_returnReplacementOperator874.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readField(field, target, false)));
    }

    public static java.lang.Object readField(final java.lang.reflect.Field field, final java.lang.Object target, final boolean forceAccess) throws java.lang.IllegalAccessException {
        org.apache.commons.lang3.Validate.isTrue((field != null), "The field must not be null");
        if (forceAccess && (!(field.isAccessible()))) {
            field.setAccessible(true);
        } else {
            org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(field);
        }
        return ((_returnReplacementOperator875.is("NULL")) ? ( null ) : (field.get(target)));
    }

    public static java.lang.Object readField(final java.lang.Object target, final java.lang.String fieldName) throws java.lang.IllegalAccessException {
        return ((_returnReplacementOperator872.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readField(target, fieldName, false)));
    }

    public static java.lang.Object readField(final java.lang.Object target, final java.lang.String fieldName, final boolean forceAccess) throws java.lang.IllegalAccessException {
        org.apache.commons.lang3.Validate.isTrue((target != null), "target object must not be null");
        final java.lang.Class<?> cls = target.getClass();
        final java.lang.reflect.Field field = org.apache.commons.lang3.reflect.FieldUtils.getField(cls, fieldName, forceAccess);
        org.apache.commons.lang3.Validate.isTrue((field != null), "Cannot locate field %s on %s", fieldName, cls);
        return ((_returnReplacementOperator873.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readField(field, target, false)));
    }

    public static java.lang.Object readDeclaredField(final java.lang.Object target, final java.lang.String fieldName) throws java.lang.IllegalAccessException {
        return ((_returnReplacementOperator868.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readDeclaredField(target, fieldName, false)));
    }

    public static java.lang.Object readDeclaredField(final java.lang.Object target, final java.lang.String fieldName, final boolean forceAccess) throws java.lang.IllegalAccessException {
        org.apache.commons.lang3.Validate.isTrue((target != null), "target object must not be null");
        final java.lang.Class<?> cls = target.getClass();
        final java.lang.reflect.Field field = org.apache.commons.lang3.reflect.FieldUtils.getDeclaredField(cls, fieldName, forceAccess);
        org.apache.commons.lang3.Validate.isTrue((field != null), "Cannot locate declared field %s.%s", cls, fieldName);
        return ((_returnReplacementOperator869.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.FieldUtils.readField(field, target, false)));
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

    private static final metamutator.Selector _returnReplacementOperator868 = metamutator.Selector.of(868,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator868");

    private static final metamutator.Selector _returnReplacementOperator869 = metamutator.Selector.of(869,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator869");

    private static final metamutator.Selector _returnReplacementOperator870 = metamutator.Selector.of(870,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator870");

    private static final metamutator.Selector _returnReplacementOperator871 = metamutator.Selector.of(871,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator871");

    private static final metamutator.Selector _returnReplacementOperator872 = metamutator.Selector.of(872,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator872");

    private static final metamutator.Selector _returnReplacementOperator873 = metamutator.Selector.of(873,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator873");

    private static final metamutator.Selector _returnReplacementOperator874 = metamutator.Selector.of(874,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator874");

    private static final metamutator.Selector _returnReplacementOperator875 = metamutator.Selector.of(875,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator875");

    private static final metamutator.Selector _returnReplacementOperator876 = metamutator.Selector.of(876,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator876");

    private static final metamutator.Selector _returnReplacementOperator877 = metamutator.Selector.of(877,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator877");

    private static final metamutator.Selector _returnReplacementOperator878 = metamutator.Selector.of(878,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator878");

    private static final metamutator.Selector _returnReplacementOperator879 = metamutator.Selector.of(879,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator879");

    private static final metamutator.Selector _returnReplacementOperator880 = metamutator.Selector.of(880,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator880");

    private static final metamutator.Selector _returnReplacementOperator881 = metamutator.Selector.of(881,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator881");

    private static final metamutator.Selector _returnReplacementOperator882 = metamutator.Selector.of(882,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator882");

    private static final metamutator.Selector _returnReplacementOperator883 = metamutator.Selector.of(883,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator883");

    private static final metamutator.Selector _returnReplacementOperator884 = metamutator.Selector.of(884,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator884");

    private static final metamutator.Selector _returnReplacementOperator885 = metamutator.Selector.of(885,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator885");

    private static final metamutator.Selector _returnReplacementOperator886 = metamutator.Selector.of(886,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator886");

    private static final metamutator.Selector _returnReplacementOperator887 = metamutator.Selector.of(887,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator887");

    private static final metamutator.Selector _returnReplacementOperator888 = metamutator.Selector.of(888,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator888");

    private static final metamutator.Selector _returnReplacementOperator889 = metamutator.Selector.of(889,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator889");

    private static final metamutator.Selector _returnReplacementOperator890 = metamutator.Selector.of(890,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.FieldUtils.class).id("_returnReplacementOperator890");
}

