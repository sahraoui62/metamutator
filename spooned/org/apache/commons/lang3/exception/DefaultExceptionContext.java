package org.apache.commons.lang3.exception;


public class DefaultExceptionContext implements java.io.Serializable , org.apache.commons.lang3.exception.ExceptionContext {
    private static final long serialVersionUID = 20110706L;

    private final java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> contextValues = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>>();

    @java.lang.Override
    public org.apache.commons.lang3.exception.DefaultExceptionContext addContextValue(final java.lang.String label, final java.lang.Object value) {
        contextValues.add(new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Object>(label , value));
        return ((_returnReplacementOperatorHotSpot543.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    @java.lang.Override
    public org.apache.commons.lang3.exception.DefaultExceptionContext setContextValue(final java.lang.String label, final java.lang.Object value) {
        for (final java.util.Iterator<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> iter = contextValues.iterator() ; iter.hasNext() ; ) {
            final org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object> p = iter.next();
            if (org.apache.commons.lang3.StringUtils.equals(label, p.getKey())) {
                iter.remove();
            } 
        }
        addContextValue(label, value);
        return ((_returnReplacementOperatorHotSpot544.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    @java.lang.Override
    public java.util.List<java.lang.Object> getContextValues(final java.lang.String label) {
        final java.util.List<java.lang.Object> values = new java.util.ArrayList<java.lang.Object>();
        for (final org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object> pair : contextValues) {
            if (org.apache.commons.lang3.StringUtils.equals(label, pair.getKey())) {
                values.add(pair.getValue());
            } 
        }
        return ((_returnReplacementOperatorHotSpot541.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (values));
    }

    @java.lang.Override
    public java.lang.Object getFirstContextValue(final java.lang.String label) {
        for (final org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object> pair : contextValues) {
            if (org.apache.commons.lang3.StringUtils.equals(label, pair.getKey())) {
                return ((_returnReplacementOperatorHotSpot537.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (pair.getValue()));
            } 
        }
        return ((_returnReplacementOperatorHotSpot538.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
    }

    @java.lang.Override
    public java.util.Set<java.lang.String> getContextLabels() {
        final java.util.Set<java.lang.String> labels = new java.util.HashSet<java.lang.String>();
        for (final org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object> pair : contextValues) {
            labels.add(pair.getKey());
        }
        return ((_returnReplacementOperatorHotSpot542.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (labels));
    }

    @java.lang.Override
    public java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> getContextEntries() {
        return ((_returnReplacementOperatorHotSpot540.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (contextValues));
    }

    @java.lang.Override
    public java.lang.String getFormattedExceptionMessage(final java.lang.String baseMessage) {
        final java.lang.StringBuilder buffer = new java.lang.StringBuilder(256);
        if (baseMessage != null) {
            buffer.append(baseMessage);
        } 
        if ((contextValues.size()) > 0) {
            if ((buffer.length()) > 0) {
                buffer.append('\n');
            } 
            buffer.append("Exception Context:\n");
            int i = 0;
            for (final org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object> pair : contextValues) {
                buffer.append("\t[");
                buffer.append(++i);
                buffer.append(':');
                buffer.append(pair.getKey());
                buffer.append("=");
                final java.lang.Object value = pair.getValue();
                if (value == null) {
                    buffer.append("null");
                } else {
                    java.lang.String valueStr;
                    try {
                        valueStr = value.toString();
                    } catch (final java.lang.Exception e) {
                        valueStr = "Exception thrown on toString(): " + (org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(e));
                    }
                    buffer.append(valueStr);
                }
                buffer.append("]\n");
            }
            buffer.append("---------------------------------");
        } 
        return ((_returnReplacementOperatorHotSpot539.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buffer.toString()));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot537 = metamutator.Selector.of(537,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.DefaultExceptionContext.class).id("_returnReplacementOperatorHotSpot537");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot538 = metamutator.Selector.of(538,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.DefaultExceptionContext.class).id("_returnReplacementOperatorHotSpot538");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot539 = metamutator.Selector.of(539,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.DefaultExceptionContext.class).id("_returnReplacementOperatorHotSpot539");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot540 = metamutator.Selector.of(540,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.DefaultExceptionContext.class).id("_returnReplacementOperatorHotSpot540");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot541 = metamutator.Selector.of(541,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.DefaultExceptionContext.class).id("_returnReplacementOperatorHotSpot541");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot542 = metamutator.Selector.of(542,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.DefaultExceptionContext.class).id("_returnReplacementOperatorHotSpot542");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot543 = metamutator.Selector.of(543,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.DefaultExceptionContext.class).id("_returnReplacementOperatorHotSpot543");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot544 = metamutator.Selector.of(544,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.DefaultExceptionContext.class).id("_returnReplacementOperatorHotSpot544");
}

