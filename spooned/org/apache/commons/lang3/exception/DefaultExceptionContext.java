package org.apache.commons.lang3.exception;


public class DefaultExceptionContext implements java.io.Serializable , org.apache.commons.lang3.exception.ExceptionContext {
    private static final long serialVersionUID = 20110706L;

    private final java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> contextValues = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>>();

    @java.lang.Override
    public org.apache.commons.lang3.exception.DefaultExceptionContext addContextValue(final java.lang.String label, final java.lang.Object value) {
        contextValues.add(new org.apache.commons.lang3.tuple.ImmutablePair<java.lang.String, java.lang.Object>(label , value));
        return this;
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
        return this;
    }

    @java.lang.Override
    public java.util.List<java.lang.Object> getContextValues(final java.lang.String label) {
        final java.util.List<java.lang.Object> values = new java.util.ArrayList<java.lang.Object>();
        for (final org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object> pair : contextValues) {
            if (org.apache.commons.lang3.StringUtils.equals(label, pair.getKey())) {
                values.add(pair.getValue());
            } 
        }
        return values;
    }

    @java.lang.Override
    public java.lang.Object getFirstContextValue(final java.lang.String label) {
        for (final org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object> pair : contextValues) {
            if (org.apache.commons.lang3.StringUtils.equals(label, pair.getKey())) {
                return pair.getValue();
            } 
        }
        return null;
    }

    @java.lang.Override
    public java.util.Set<java.lang.String> getContextLabels() {
        final java.util.Set<java.lang.String> labels = new java.util.HashSet<java.lang.String>();
        for (final org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object> pair : contextValues) {
            labels.add(pair.getKey());
        }
        return labels;
    }

    @java.lang.Override
    public java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> getContextEntries() {
        return contextValues;
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
        return buffer.toString();
    }
}

