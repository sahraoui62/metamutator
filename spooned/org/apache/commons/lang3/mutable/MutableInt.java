package org.apache.commons.lang3.mutable;


public class MutableInt extends java.lang.Number implements java.lang.Comparable<org.apache.commons.lang3.mutable.MutableInt> , org.apache.commons.lang3.mutable.Mutable<java.lang.Number> {
    private static final long serialVersionUID = 512176391864L;

    private int value;

    public MutableInt() {
        super();
    }

    public MutableInt(final int value) {
        super();
        this.value = value;
    }

    public MutableInt(final java.lang.Number value) {
        super();
        this.value = value.intValue();
    }

    public MutableInt(final java.lang.String value) throws java.lang.NumberFormatException {
        super();
        this.value = java.lang.Integer.parseInt(value);
    }

    @java.lang.Override
    public java.lang.Integer getValue() {
        return ((_returnReplacementOperator823.is("NULL")) ? ( null ) : (java.lang.Integer.valueOf(this.value)));
    }

    public void setValue(final int value) {
        this.value = value;
    }

    @java.lang.Override
    public void setValue(final java.lang.Number value) {
        this.value = value.intValue();
    }

    public void increment() {
        (value)++;
    }

    public void decrement() {
        (value)--;
    }

    public void add(final int operand) {
        this.value += operand;
    }

    public void add(final java.lang.Number operand) {
        this.value += operand.intValue();
    }

    public void subtract(final int operand) {
        this.value -= operand;
    }

    public void subtract(final java.lang.Number operand) {
        this.value -= operand.intValue();
    }

    @java.lang.Override
    public int intValue() {
        return ((_returnReplacementOperator822.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator822.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator822.is("ZERO")) ? ( 0 ) : (value));
    }

    @java.lang.Override
    public long longValue() {
        return ((_returnReplacementOperator826.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator826.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator826.is("ZERO")) ? ( 0 ) : (value));
    }

    @java.lang.Override
    public float floatValue() {
        return ((_returnReplacementOperator819.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator819.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator819.is("ZERO")) ? ( 0 ) : (value));
    }

    @java.lang.Override
    public double doubleValue() {
        return ((_returnReplacementOperator818.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator818.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator818.is("ZERO")) ? ( 0 ) : (value));
    }

    public java.lang.Integer toInteger() {
        return ((_returnReplacementOperator824.is("NULL")) ? ( null ) : (java.lang.Integer.valueOf(intValue())));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj instanceof org.apache.commons.lang3.mutable.MutableInt) {
            return ((_returnReplacementOperator816.is("NULL")) ? ( null ) : ((value) == (((org.apache.commons.lang3.mutable.MutableInt)(obj)).intValue())));
        } 
        return ((_returnReplacementOperator817.is("NULL")) ? ( null ) : (false));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperator821.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator821.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator821.is("ZERO")) ? ( 0 ) : (value));
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.mutable.MutableInt other) {
        return ((_returnReplacementOperator820.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator820.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator820.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.math.NumberUtils.compare(this.value, other.value)));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperator825.is("NULL")) ? ( null ) : (java.lang.String.valueOf(value)));
    }

    private static final metamutator.Selector _returnReplacementOperator816 = metamutator.Selector.of(816,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableInt.class).id("_returnReplacementOperator816");

    private static final metamutator.Selector _returnReplacementOperator817 = metamutator.Selector.of(817,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableInt.class).id("_returnReplacementOperator817");

    private static final metamutator.Selector _returnReplacementOperator818 = metamutator.Selector.of(818,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.mutable.MutableInt.class).id("_returnReplacementOperator818");

    private static final metamutator.Selector _returnReplacementOperator819 = metamutator.Selector.of(819,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.mutable.MutableInt.class).id("_returnReplacementOperator819");

    private static final metamutator.Selector _returnReplacementOperator820 = metamutator.Selector.of(820,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.mutable.MutableInt.class).id("_returnReplacementOperator820");

    private static final metamutator.Selector _returnReplacementOperator821 = metamutator.Selector.of(821,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.mutable.MutableInt.class).id("_returnReplacementOperator821");

    private static final metamutator.Selector _returnReplacementOperator822 = metamutator.Selector.of(822,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.mutable.MutableInt.class).id("_returnReplacementOperator822");

    private static final metamutator.Selector _returnReplacementOperator823 = metamutator.Selector.of(823,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableInt.class).id("_returnReplacementOperator823");

    private static final metamutator.Selector _returnReplacementOperator824 = metamutator.Selector.of(824,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableInt.class).id("_returnReplacementOperator824");

    private static final metamutator.Selector _returnReplacementOperator825 = metamutator.Selector.of(825,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableInt.class).id("_returnReplacementOperator825");

    private static final metamutator.Selector _returnReplacementOperator826 = metamutator.Selector.of(826,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.mutable.MutableInt.class).id("_returnReplacementOperator826");
}

