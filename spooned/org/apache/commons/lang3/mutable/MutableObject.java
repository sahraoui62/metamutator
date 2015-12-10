package org.apache.commons.lang3.mutable;


public class MutableObject<T> implements java.io.Serializable , org.apache.commons.lang3.mutable.Mutable<T> {
    private static final long serialVersionUID = 86241875189L;

    private T value;

    public MutableObject() {
        super();
    }

    public MutableObject(final T value) {
        super();
        this.value = value;
    }

    @java.lang.Override
    public T getValue() {
        return ((_returnReplacementOperator838.is("NULL")) ? ( null ) : (this.value));
    }

    @java.lang.Override
    public void setValue(final T value) {
        this.value = value;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == null) {
            return ((_returnReplacementOperator839.is("NULL")) ? ( null ) : (false));
        } 
        if ((this) == obj) {
            return ((_returnReplacementOperator840.is("NULL")) ? ( null ) : (true));
        } 
        if ((getClass()) == (obj.getClass())) {
            final org.apache.commons.lang3.mutable.MutableObject<?> that = ((org.apache.commons.lang3.mutable.MutableObject<?>)(obj));
            return ((_returnReplacementOperator841.is("NULL")) ? ( null ) : (this.value.equals(that.value)));
        } 
        return ((_returnReplacementOperator842.is("NULL")) ? ( null ) : (false));
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperator843.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator843.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator843.is("ZERO")) ? ( 0 ) : ((value) == null ? 0 : value.hashCode()));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperator844.is("NULL")) ? ( null ) : ((value) == null ? "null" : value.toString()));
    }

    private static final metamutator.Selector _returnReplacementOperator838 = metamutator.Selector.of(838,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableObject.class).id("_returnReplacementOperator838");

    private static final metamutator.Selector _returnReplacementOperator839 = metamutator.Selector.of(839,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableObject.class).id("_returnReplacementOperator839");

    private static final metamutator.Selector _returnReplacementOperator840 = metamutator.Selector.of(840,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableObject.class).id("_returnReplacementOperator840");

    private static final metamutator.Selector _returnReplacementOperator841 = metamutator.Selector.of(841,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableObject.class).id("_returnReplacementOperator841");

    private static final metamutator.Selector _returnReplacementOperator842 = metamutator.Selector.of(842,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableObject.class).id("_returnReplacementOperator842");

    private static final metamutator.Selector _returnReplacementOperator843 = metamutator.Selector.of(843,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.mutable.MutableObject.class).id("_returnReplacementOperator843");

    private static final metamutator.Selector _returnReplacementOperator844 = metamutator.Selector.of(844,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.mutable.MutableObject.class).id("_returnReplacementOperator844");
}

