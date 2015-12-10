package org.apache.commons.lang3.mutable;


public class MutableBoolean implements java.io.Serializable , java.lang.Comparable<org.apache.commons.lang3.mutable.MutableBoolean> , org.apache.commons.lang3.mutable.Mutable<java.lang.Boolean> {
    private static final long serialVersionUID = -4830728138360036487L;

    private boolean value;

    public MutableBoolean() {
        super();
    }

    public MutableBoolean(final boolean value) {
        super();
        this.value = value;
    }

    public MutableBoolean(final java.lang.Boolean value) {
        super();
        this.value = value.booleanValue();
    }

    @java.lang.Override
    public java.lang.Boolean getValue() {
        return java.lang.Boolean.valueOf(this.value);
    }

    public void setValue(final boolean value) {
        this.value = value;
    }

    public void setFalse() {
        this.value = false;
    }

    public void setTrue() {
        this.value = true;
    }

    @java.lang.Override
    public void setValue(final java.lang.Boolean value) {
        this.value = value.booleanValue();
    }

    public boolean isTrue() {
        return ((_returnReplacementOperator776.is("NULL")) ? ( null ) : ((value) == true));
    }

    public boolean isFalse() {
        return ((_returnReplacementOperator775.is("NULL")) ? ( null ) : ((value) == false));
    }

    public boolean booleanValue() {
        return ((_returnReplacementOperator772.is("NULL")) ? ( null ) : (value));
    }

    public java.lang.Boolean toBoolean() {
        return java.lang.Boolean.valueOf(booleanValue());
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj instanceof org.apache.commons.lang3.mutable.MutableBoolean) {
            return ((_returnReplacementOperator773.is("NULL")) ? ( null ) : ((value) == (((org.apache.commons.lang3.mutable.MutableBoolean)(obj)).booleanValue())));
        } 
        return ((_returnReplacementOperator774.is("NULL")) ? ( null ) : (false));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperator778.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator778.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator778.is("ZERO")) ? ( 0 ) : (value ? java.lang.Boolean.TRUE.hashCode() : java.lang.Boolean.FALSE.hashCode()));
    }

    @java.lang.Override
    public int compareTo(final org.apache.commons.lang3.mutable.MutableBoolean other) {
        return ((_returnReplacementOperator777.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator777.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator777.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.BooleanUtils.compare(this.value, other.value)));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperator779.is("NULL")) ? ( null ) : (java.lang.String.valueOf(value)));
    }

    private static final metamutator.Selector _returnReplacementOperator772 = metamutator.Selector.of(772,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableBoolean.class).id("_returnReplacementOperator772");

    private static final metamutator.Selector _returnReplacementOperator773 = metamutator.Selector.of(773,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableBoolean.class).id("_returnReplacementOperator773");

    private static final metamutator.Selector _returnReplacementOperator774 = metamutator.Selector.of(774,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableBoolean.class).id("_returnReplacementOperator774");

    private static final metamutator.Selector _returnReplacementOperator775 = metamutator.Selector.of(775,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableBoolean.class).id("_returnReplacementOperator775");

    private static final metamutator.Selector _returnReplacementOperator776 = metamutator.Selector.of(776,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableBoolean.class).id("_returnReplacementOperator776");

    private static final metamutator.Selector _returnReplacementOperator777 = metamutator.Selector.of(777,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.mutable.MutableBoolean.class).id("_returnReplacementOperator777");

    private static final metamutator.Selector _returnReplacementOperator778 = metamutator.Selector.of(778,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.mutable.MutableBoolean.class).id("_returnReplacementOperator778");

    private static final metamutator.Selector _returnReplacementOperator779 = metamutator.Selector.of(779,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableBoolean.class).id("_returnReplacementOperator779");
}

