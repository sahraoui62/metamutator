package org.apache.commons.lang3.reflect;


abstract class MemberUtils {
    private static final int ACCESS_TEST = ((java.lang.reflect.Modifier.PUBLIC) | (java.lang.reflect.Modifier.PROTECTED)) | (java.lang.reflect.Modifier.PRIVATE);

    private static final java.lang.Class<?>[] ORDERED_PRIMITIVE_TYPES = new java.lang.Class<?>[]{ java.lang.Byte.TYPE , java.lang.Short.TYPE , java.lang.Character.TYPE , java.lang.Integer.TYPE , java.lang.Long.TYPE , java.lang.Float.TYPE , java.lang.Double.TYPE };

    static boolean setAccessibleWorkaround(final java.lang.reflect.AccessibleObject o) {
        if ((o == null) || (o.isAccessible())) {
            return ((_returnReplacementOperator897.is("NULL")) ? ( null ) : (false));
        } 
        final java.lang.reflect.Member m = ((java.lang.reflect.Member)(o));
        if (((!(o.isAccessible())) && (java.lang.reflect.Modifier.isPublic(m.getModifiers()))) && (org.apache.commons.lang3.reflect.MemberUtils.isPackageAccess(m.getDeclaringClass().getModifiers()))) {
            try {
                o.setAccessible(true);
                return ((_returnReplacementOperator898.is("NULL")) ? ( null ) : (true));
            } catch (final java.lang.SecurityException e) {
            }
        } 
        return ((_returnReplacementOperator899.is("NULL")) ? ( null ) : (false));
    }

    static boolean isPackageAccess(final int modifiers) {
        return ((_returnReplacementOperator896.is("NULL")) ? ( null ) : ((modifiers & (org.apache.commons.lang3.reflect.MemberUtils.ACCESS_TEST)) == 0));
    }

    static boolean isAccessible(final java.lang.reflect.Member m) {
        return ((_returnReplacementOperator895.is("NULL")) ? ( null ) : (((m != null) && (java.lang.reflect.Modifier.isPublic(m.getModifiers()))) && (!(m.isSynthetic()))));
    }

    static int compareParameterTypes(final java.lang.Class<?>[] left, final java.lang.Class<?>[] right, final java.lang.Class<?>[] actual) {
        final float leftCost = org.apache.commons.lang3.reflect.MemberUtils.getTotalTransformationCost(actual, left);
        final float rightCost = org.apache.commons.lang3.reflect.MemberUtils.getTotalTransformationCost(actual, right);
        return ((_returnReplacementOperator904.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator904.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator904.is("ZERO")) ? ( 0 ) : (leftCost < rightCost ? -1 : rightCost < leftCost ? 1 : 0));
    }

    private static float getTotalTransformationCost(final java.lang.Class<?>[] srcArgs, final java.lang.Class<?>[] destArgs) {
        float totalCost = 0.0F;
        for (int i = 0 ; i < (srcArgs.length) ; i++) {
            java.lang.Class<?> srcClass;
            java.lang.Class<?> destClass;
            srcClass = srcArgs[i];
            destClass = destArgs[i];
            totalCost += org.apache.commons.lang3.reflect.MemberUtils.getObjectTransformationCost(srcClass, destClass);
        }
        return ((_returnReplacementOperator903.is("NULL")) ? ( null ) : (totalCost));
    }

    private static float getObjectTransformationCost(java.lang.Class<?> srcClass, final java.lang.Class<?> destClass) {
        if (destClass.isPrimitive()) {
            return ((_returnReplacementOperator900.is("NULL")) ? ( null ) : (org.apache.commons.lang3.reflect.MemberUtils.getPrimitivePromotionCost(srcClass, destClass)));
        } 
        float cost = 0.0F;
        while ((srcClass != null) && (!(destClass.equals(srcClass)))) {
            if ((destClass.isInterface()) && (org.apache.commons.lang3.ClassUtils.isAssignable(srcClass, destClass))) {
                cost += 0.25F;
                break;
            } 
            cost++;
            srcClass = srcClass.getSuperclass();
        }
        if (srcClass == null) {
            cost += 1.5F;
        } 
        return ((_returnReplacementOperator901.is("NULL")) ? ( null ) : (cost));
    }

    private static float getPrimitivePromotionCost(final java.lang.Class<?> srcClass, final java.lang.Class<?> destClass) {
        float cost = 0.0F;
        java.lang.Class<?> cls = srcClass;
        if (!(cls.isPrimitive())) {
            cost += 0.1F;
            cls = org.apache.commons.lang3.ClassUtils.wrapperToPrimitive(cls);
        } 
        for (int i = 0 ; (cls != destClass) && (i < (ORDERED_PRIMITIVE_TYPES.length)) ; i++) {
            if (cls == (ORDERED_PRIMITIVE_TYPES[i])) {
                cost += 0.1F;
                if (i < ((ORDERED_PRIMITIVE_TYPES.length) - 1)) {
                    cls = ORDERED_PRIMITIVE_TYPES[(i + 1)];
                } 
            } 
        }
        return ((_returnReplacementOperator902.is("NULL")) ? ( null ) : (cost));
    }

    private static final metamutator.Selector _returnReplacementOperator895 = metamutator.Selector.of(895,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MemberUtils.class).id("_returnReplacementOperator895");

    private static final metamutator.Selector _returnReplacementOperator896 = metamutator.Selector.of(896,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MemberUtils.class).id("_returnReplacementOperator896");

    private static final metamutator.Selector _returnReplacementOperator897 = metamutator.Selector.of(897,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MemberUtils.class).id("_returnReplacementOperator897");

    private static final metamutator.Selector _returnReplacementOperator898 = metamutator.Selector.of(898,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MemberUtils.class).id("_returnReplacementOperator898");

    private static final metamutator.Selector _returnReplacementOperator899 = metamutator.Selector.of(899,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MemberUtils.class).id("_returnReplacementOperator899");

    private static final metamutator.Selector _returnReplacementOperator900 = metamutator.Selector.of(900,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MemberUtils.class).id("_returnReplacementOperator900");

    private static final metamutator.Selector _returnReplacementOperator901 = metamutator.Selector.of(901,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MemberUtils.class).id("_returnReplacementOperator901");

    private static final metamutator.Selector _returnReplacementOperator902 = metamutator.Selector.of(902,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MemberUtils.class).id("_returnReplacementOperator902");

    private static final metamutator.Selector _returnReplacementOperator903 = metamutator.Selector.of(903,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.reflect.MemberUtils.class).id("_returnReplacementOperator903");

    private static final metamutator.Selector _returnReplacementOperator904 = metamutator.Selector.of(904,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.reflect.MemberUtils.class).id("_returnReplacementOperator904");
}

