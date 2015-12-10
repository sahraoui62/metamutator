package org.apache.commons.lang3.builder;


final class IDKey {
    private final java.lang.Object value;

    private final int id;

    public IDKey(final java.lang.Object _value) {
        id = java.lang.System.identityHashCode(_value);
        value = _value;
    }

    @java.lang.Override
    public int hashCode() {
        return ((_returnReplacementOperator294.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator294.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator294.is("ZERO")) ? ( 0 ) : (id));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object other) {
        if (!(other instanceof org.apache.commons.lang3.builder.IDKey)) {
            return ((_returnReplacementOperator291.is("NULL")) ? ( null ) : (false));
        } 
        final org.apache.commons.lang3.builder.IDKey idKey = ((org.apache.commons.lang3.builder.IDKey)(other));
        if ((id) != (idKey.id)) {
            return ((_returnReplacementOperator292.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator293.is("NULL")) ? ( null ) : ((value) == (idKey.value)));
    }

    private static final metamutator.Selector _returnReplacementOperator291 = metamutator.Selector.of(291,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.IDKey.class).id("_returnReplacementOperator291");

    private static final metamutator.Selector _returnReplacementOperator292 = metamutator.Selector.of(292,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.IDKey.class).id("_returnReplacementOperator292");

    private static final metamutator.Selector _returnReplacementOperator293 = metamutator.Selector.of(293,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.IDKey.class).id("_returnReplacementOperator293");

    private static final metamutator.Selector _returnReplacementOperator294 = metamutator.Selector.of(294,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.builder.IDKey.class).id("_returnReplacementOperator294");
}

