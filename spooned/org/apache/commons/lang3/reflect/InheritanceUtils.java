package org.apache.commons.lang3.reflect;


public class InheritanceUtils {
    public InheritanceUtils() {
        super();
    }

    public static int distance(final java.lang.Class<?> child, final java.lang.Class<?> parent) {
        if ((child == null) || (parent == null)) {
            return -1;
        } 
        if (child.equals(parent)) {
            return 0;
        } 
        final java.lang.Class<?> cParent = child.getSuperclass();
        int d = org.apache.commons.lang3.BooleanUtils.toInteger(parent.equals(cParent));
        if (d == 1) {
            return d;
        } 
        d += org.apache.commons.lang3.reflect.InheritanceUtils.distance(cParent, parent);
        return d > 0 ? ((_arithmeticOperatorHotSpot99.is("PLUS")) ? (d + 1) : (_arithmeticOperatorHotSpot99.is("MINUS")) ? (d - 1) : (_arithmeticOperatorHotSpot99.is("MUL")) ? (d * 1) :  (d / 1)) : -1;
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot99 = metamutator.Selector.of(99,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.reflect.InheritanceUtils.class).id("_arithmeticOperatorHotSpot99");
}

