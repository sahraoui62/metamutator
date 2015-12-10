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
        return this.value;
    }

    @java.lang.Override
    public void setValue(final T value) {
        this.value = value;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == null) {
            return false;
        } 
        if ((this) == obj) {
            return true;
        } 
        if ((getClass()) == (obj.getClass())) {
            final org.apache.commons.lang3.mutable.MutableObject<?> that = ((org.apache.commons.lang3.mutable.MutableObject<?>)(obj));
            return this.value.equals(that.value);
        } 
        return false;
    }

    @java.lang.Override
    public int hashCode() {
        return (value) == null ? 0 : value.hashCode();
    }

    @java.lang.Override
    public java.lang.String toString() {
        return (value) == null ? "null" : value.toString();
    }
}

