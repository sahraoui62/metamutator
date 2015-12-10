package org.apache.commons.lang3.exception;


public class ContextedException extends java.lang.Exception implements org.apache.commons.lang3.exception.ExceptionContext {
    private static final long serialVersionUID = 20110706L;

    private final org.apache.commons.lang3.exception.ExceptionContext exceptionContext;

    public ContextedException() {
        super();
        exceptionContext = new org.apache.commons.lang3.exception.DefaultExceptionContext();
    }

    public ContextedException(final java.lang.String message) {
        super(message);
        exceptionContext = new org.apache.commons.lang3.exception.DefaultExceptionContext();
    }

    public ContextedException(final java.lang.Throwable cause) {
        super(cause);
        exceptionContext = new org.apache.commons.lang3.exception.DefaultExceptionContext();
    }

    public ContextedException(final java.lang.String message ,final java.lang.Throwable cause) {
        super(message, cause);
        exceptionContext = new org.apache.commons.lang3.exception.DefaultExceptionContext();
    }

    public ContextedException(final java.lang.String message ,final java.lang.Throwable cause ,org.apache.commons.lang3.exception.ExceptionContext context) {
        super(message, cause);
        if (context == null) {
            context = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        } 
        exceptionContext = context;
    }

    @java.lang.Override
    public org.apache.commons.lang3.exception.ContextedException addContextValue(final java.lang.String label, final java.lang.Object value) {
        exceptionContext.addContextValue(label, value);
        return this;
    }

    @java.lang.Override
    public org.apache.commons.lang3.exception.ContextedException setContextValue(final java.lang.String label, final java.lang.Object value) {
        exceptionContext.setContextValue(label, value);
        return this;
    }

    @java.lang.Override
    public java.util.List<java.lang.Object> getContextValues(final java.lang.String label) {
        return this.exceptionContext.getContextValues(label);
    }

    @java.lang.Override
    public java.lang.Object getFirstContextValue(final java.lang.String label) {
        return this.exceptionContext.getFirstContextValue(label);
    }

    @java.lang.Override
    public java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> getContextEntries() {
        return this.exceptionContext.getContextEntries();
    }

    @java.lang.Override
    public java.util.Set<java.lang.String> getContextLabels() {
        return exceptionContext.getContextLabels();
    }

    @java.lang.Override
    public java.lang.String getMessage() {
        return getFormattedExceptionMessage(super.getMessage());
    }

    public java.lang.String getRawMessage() {
        return super.getMessage();
    }

    @java.lang.Override
    public java.lang.String getFormattedExceptionMessage(final java.lang.String baseMessage) {
        return exceptionContext.getFormattedExceptionMessage(baseMessage);
    }
}

