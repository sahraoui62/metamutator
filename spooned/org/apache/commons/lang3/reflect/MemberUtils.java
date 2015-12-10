package org.apache.commons.lang3.reflect;


abstract class MemberUtils {
    private static final int ACCESS_TEST = ((java.lang.reflect.Modifier.PUBLIC) | (java.lang.reflect.Modifier.PROTECTED)) | (java.lang.reflect.Modifier.PRIVATE);

    private static final java.lang.Class<?>[] ORDERED_PRIMITIVE_TYPES = new java.lang.Class<?>[]{ java.lang.Byte.TYPE , java.lang.Short.TYPE , java.lang.Character.TYPE , java.lang.Integer.TYPE , java.lang.Long.TYPE , java.lang.Float.TYPE , java.lang.Double.TYPE };

    static boolean setAccessibleWorkaround(final java.lang.reflect.AccessibleObject o) {
        if ((o == null) || (o.isAccessible())) {
            return false;
        } 
        final java.lang.reflect.Member m = ((java.lang.reflect.Member)(o));
        if (((!(o.isAccessible())) && (java.lang.reflect.Modifier.isPublic(m.getModifiers()))) && (org.apache.commons.lang3.reflect.MemberUtils.isPackageAccess(m.getDeclaringClass().getModifiers()))) {
            try {
                o.setAccessible(true);
                return true;
            } catch (final java.lang.SecurityException e) {
            }
        } 
        return false;
    }

    static boolean isPackageAccess(final int modifiers) {
        return (modifiers & (ACCESS_TEST)) == 0;
    }

    static boolean isAccessible(final java.lang.reflect.Member m) {
        return ((m != null) && (java.lang.reflect.Modifier.isPublic(m.getModifiers()))) && (!(m.isSynthetic()));
    }

    static int compareParameterTypes(final java.lang.Class<?>[] left, final java.lang.Class<?>[] right, final java.lang.Class<?>[] actual) {
        final float leftCost = org.apache.commons.lang3.reflect.MemberUtils.getTotalTransformationCost(actual, left);
        final float rightCost = org.apache.commons.lang3.reflect.MemberUtils.getTotalTransformationCost(actual, right);
        return leftCost < rightCost ? -1 : rightCost < leftCost ? 1 : 0;
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
        return totalCost;
    }

    private static float getObjectTransformationCost(java.lang.Class<?> srcClass, final java.lang.Class<?> destClass) {
        if (destClass.isPrimitive()) {
            return org.apache.commons.lang3.reflect.MemberUtils.getPrimitivePromotionCost(srcClass, destClass);
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
        return cost;
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
                if (i < ((_arithmeticOperatorHotSpot100.is("PLUS")) ? (((org.apache.commons.lang3.reflect.MemberUtils.ORDERED_PRIMITIVE_TYPES.length) + 1)) : (_arithmeticOperatorHotSpot100.is("MINUS")) ? (((org.apache.commons.lang3.reflect.MemberUtils.ORDERED_PRIMITIVE_TYPES.length) - 1)) : (_arithmeticOperatorHotSpot100.is("MUL")) ? (((org.apache.commons.lang3.reflect.MemberUtils.ORDERED_PRIMITIVE_TYPES.length) * 1)) :  (((org.apache.commons.lang3.reflect.MemberUtils.ORDERED_PRIMITIVE_TYPES.length) / 1)))) {
                    cls = ORDERED_PRIMITIVE_TYPES[((_arithmeticOperatorHotSpot101.is("PLUS")) ? ((i + 1)) : (_arithmeticOperatorHotSpot101.is("MINUS")) ? ((i - 1)) : (_arithmeticOperatorHotSpot101.is("MUL")) ? ((i * 1)) :  ((i / 1)))];
                } 
            } 
        }
        return cost;
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot100 = metamutator.Selector.of(100,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.reflect.MemberUtils.class).id("_arithmeticOperatorHotSpot100");

    private static final metamutator.Selector _arithmeticOperatorHotSpot101 = metamutator.Selector.of(101,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.reflect.MemberUtils.class).id("_arithmeticOperatorHotSpot101");
}

