package org.apache.commons.lang3.reflect;


public class InheritanceUtils {
    public InheritanceUtils() {
        super();
    }

    public static int distance(final java.lang.Class<?> child, final java.lang.Class<?> parent) {
        if ((child == null) || (parent == null)) {
            return ((_returnReplacementOperator891.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator891.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator891.is("ZERO")) ? ( 0 ) : (-1));
        } 
        if (child.equals(parent)) {
            return ((_returnReplacementOperator892.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator892.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator892.is("ZERO")) ? ( 0 ) : (0));
        } 
        final java.lang.Class<?> cParent = child.getSuperclass();
        int d = org.apache.commons.lang3.BooleanUtils.toInteger(parent.equals(cParent));
        if (d == 1) {
            return ((_returnReplacementOperator893.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator893.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator893.is("ZERO")) ? ( 0 ) : (d));
        } 
        d += org.apache.commons.lang3.reflect.InheritanceUtils.distance(cParent, parent);
        return ((_returnReplacementOperator894.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator894.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator894.is("ZERO")) ? ( 0 ) : (d > 0 ? d + 1 : -1));
    }

    private static final metamutator.Selector _returnReplacementOperator891 = metamutator.Selector.of(891,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.reflect.InheritanceUtils.class).id("_returnReplacementOperator891");

    private static final metamutator.Selector _returnReplacementOperator892 = metamutator.Selector.of(892,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.reflect.InheritanceUtils.class).id("_returnReplacementOperator892");

    private static final metamutator.Selector _returnReplacementOperator893 = metamutator.Selector.of(893,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.reflect.InheritanceUtils.class).id("_returnReplacementOperator893");

    private static final metamutator.Selector _returnReplacementOperator894 = metamutator.Selector.of(894,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.reflect.InheritanceUtils.class).id("_returnReplacementOperator894");
}

