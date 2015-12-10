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
        return ((_returnReplacementOperator526.is("NULL")) ? ( null ) : (this));
    }

    @java.lang.Override
    public org.apache.commons.lang3.exception.ContextedException setContextValue(final java.lang.String label, final java.lang.Object value) {
        exceptionContext.setContextValue(label, value);
        return ((_returnReplacementOperator527.is("NULL")) ? ( null ) : (this));
    }

    @java.lang.Override
    public java.util.List<java.lang.Object> getContextValues(final java.lang.String label) {
        return ((_returnReplacementOperator524.is("NULL")) ? ( null ) : (this.exceptionContext.getContextValues(label)));
    }

    @java.lang.Override
    public java.lang.Object getFirstContextValue(final java.lang.String label) {
        return ((_returnReplacementOperator519.is("NULL")) ? ( null ) : (this.exceptionContext.getFirstContextValue(label)));
    }

    @java.lang.Override
    public java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> getContextEntries() {
        return ((_returnReplacementOperator523.is("NULL")) ? ( null ) : (this.exceptionContext.getContextEntries()));
    }

    @java.lang.Override
    public java.util.Set<java.lang.String> getContextLabels() {
        return ((_returnReplacementOperator525.is("NULL")) ? ( null ) : (exceptionContext.getContextLabels()));
    }

    @java.lang.Override
    public java.lang.String getMessage() {
        return ((_returnReplacementOperator521.is("NULL")) ? ( null ) : (getFormattedExceptionMessage(super.getMessage())));
    }

    public java.lang.String getRawMessage() {
        return ((_returnReplacementOperator522.is("NULL")) ? ( null ) : (super.getMessage()));
    }

    @java.lang.Override
    public java.lang.String getFormattedExceptionMessage(final java.lang.String baseMessage) {
        return ((_returnReplacementOperator520.is("NULL")) ? ( null ) : (exceptionContext.getFormattedExceptionMessage(baseMessage)));
    }

    private static final metamutator.Selector _returnReplacementOperator519 = metamutator.Selector.of(519,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ContextedException.class).id("_returnReplacementOperator519");

    private static final metamutator.Selector _returnReplacementOperator520 = metamutator.Selector.of(520,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ContextedException.class).id("_returnReplacementOperator520");

    private static final metamutator.Selector _returnReplacementOperator521 = metamutator.Selector.of(521,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ContextedException.class).id("_returnReplacementOperator521");

    private static final metamutator.Selector _returnReplacementOperator522 = metamutator.Selector.of(522,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ContextedException.class).id("_returnReplacementOperator522");

    private static final metamutator.Selector _returnReplacementOperator523 = metamutator.Selector.of(523,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ContextedException.class).id("_returnReplacementOperator523");

    private static final metamutator.Selector _returnReplacementOperator524 = metamutator.Selector.of(524,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ContextedException.class).id("_returnReplacementOperator524");

    private static final metamutator.Selector _returnReplacementOperator525 = metamutator.Selector.of(525,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ContextedException.class).id("_returnReplacementOperator525");

    private static final metamutator.Selector _returnReplacementOperator526 = metamutator.Selector.of(526,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ContextedException.class).id("_returnReplacementOperator526");

    private static final metamutator.Selector _returnReplacementOperator527 = metamutator.Selector.of(527,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ContextedException.class).id("_returnReplacementOperator527");
}

