package org.apache.commons.lang3.mutable;


public class MutableLong extends java.lang.Number implements java.lang.Comparable<org.apache.commons.lang3.mutable.MutableLong> , org.apache.commons.lang3.mutable.Mutable<java.lang.Number> {
    private static final long serialVersionUID = 62986528375L;

    private long value;

    public MutableLong() {
        super();
    }

    public MutableLong(final long value) {
        super();
        this.value = value;
    }

    public MutableLong(final java.lang.Number value) {
        super();
        this.value = value.longValue();
    }

    public MutableLong(final java.lang.String value) throws java.lang.NumberFormatException {
        super();
        this.value = java.lang.Long.parseLong(value);
    }

    @java.lang.Override
    public java.lang.Long getValue() {
        return ((_returnReplacementOperator834.is("NULL")) ? ( null ) : (java.lang.Long.valueOf(this.value)));
    }

    public void setValue(final long value) {
        this.value = value;
    }

    @java.lang.Override
    public void setValue(final java.lang.Number value) {
        this.value = value.longValue();
    }

    public void increment() {
        (value)++;
    }

    public void decrement() {
        (value)--;
    }

    public void add(final long operand) {
        this.value += operand;
    }

    public void add(final java.lang.Number operand) {
        this.value += operand.longValue();
    }

    public void subtract(final long operand) {
        this.value -= operand;
    }

    public void subtract(final java.lang.Number operand) {
        this.value -= operand.longValue();
    }

    @java.lang.Override
    public int intValue() {
        return ((_returnReplacementOperator833.is("NULL")) ? ( null ) : (((int)(value))));
    }

    @java.lang.Override
    public long longValue() {
        return ((_returnReplacementOperator837.is("NULL")) ? ( null ) : (value));
    }

    @java.lang.Override
    public float floatValue() {
        return ((_returnReplacementOperator830.is("NULL")) ? ( null ) : (value));
    }

    @java.lang.Override
    public double doubleValue() {
        return ((_returnReplacementOperator829.is("NULL")) ? ( null ) : (value));
    }

    public java.lang.Long toLong() {
        return ((_returnReplacementOperator835.is("NULL")) ? ( null ) : (java.lang.Long.valueOf(longValue())));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj instanceof org.apache.commons.lang3.mutable.MutableLong) {
            return ((_returnReplacementOperator827.is("NULL")) ? ( null ) : ((value) == (((org.apache.commons.lang3.mutable.MutableLong)(obj)).longValue())));
        } 
        return ((_returnReplacementOperator828.is("NULL")) ? ( null ) : (false));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperator832.is("NULL")) ? ( null ) : (((int)((value) ^ ((value) >>> 32)))));
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.mutable.MutableLong other) {
        return ((_returnReplacementOperator831.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator831.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator831.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.math.NumberUtils.compare(this.value, other.value)));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperator836.is("NULL")) ? ( null ) : (java.lang.String.valueOf(value)));
    }

    private static final metamutator.Selector _returnReplacementOperator827 = metamutator.Selector.of(827,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableLong.class).id("_returnReplacementOperator827");

    private static final metamutator.Selector _returnReplacementOperator828 = metamutator.Selector.of(828,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableLong.class).id("_returnReplacementOperator828");

    private static final metamutator.Selector _returnReplacementOperator829 = metamutator.Selector.of(829,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableLong.class).id("_returnReplacementOperator829");

    private static final metamutator.Selector _returnReplacementOperator830 = metamutator.Selector.of(830,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableLong.class).id("_returnReplacementOperator830");

    private static final metamutator.Selector _returnReplacementOperator831 = metamutator.Selector.of(831,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.mutable.MutableLong.class).id("_returnReplacementOperator831");

    private static final metamutator.Selector _returnReplacementOperator832 = metamutator.Selector.of(832,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableLong.class).id("_returnReplacementOperator832");

    private static final metamutator.Selector _returnReplacementOperator833 = metamutator.Selector.of(833,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableLong.class).id("_returnReplacementOperator833");

    private static final metamutator.Selector _returnReplacementOperator834 = metamutator.Selector.of(834,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableLong.class).id("_returnReplacementOperator834");

    private static final metamutator.Selector _returnReplacementOperator835 = metamutator.Selector.of(835,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableLong.class).id("_returnReplacementOperator835");

    private static final metamutator.Selector _returnReplacementOperator836 = metamutator.Selector.of(836,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableLong.class).id("_returnReplacementOperator836");

    private static final metamutator.Selector _returnReplacementOperator837 = metamutator.Selector.of(837,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableLong.class).id("_returnReplacementOperator837");
}

