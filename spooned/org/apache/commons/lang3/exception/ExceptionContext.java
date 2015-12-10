package org.apache.commons.lang3.exception;


public interface ExceptionContext {
    org.apache.commons.lang3.exception.ExceptionContext addContextValue(java.lang.String label, java.lang.Object value);

    org.apache.commons.lang3.exception.ExceptionContext setContextValue(java.lang.String label, java.lang.Object value);

    java.util.List<java.lang.Object> getContextValues(java.lang.String label);

    java.lang.Object getFirstContextValue(java.lang.String label);

    java.util.Set<java.lang.String> getContextLabels();

    java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> getContextEntries();

    java.lang.String getFormattedExceptionMessage(java.lang.String baseMessage);
}

