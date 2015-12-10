package org.apache.commons.lang3.exception;


public class ContextedRuntimeException extends java.lang.RuntimeException implements org.apache.commons.lang3.exception.ExceptionContext {
    private static final long serialVersionUID = 20110706L;

    private final org.apache.commons.lang3.exception.ExceptionContext exceptionContext;

    public ContextedRuntimeException() {
        super();
        exceptionContext = new org.apache.commons.lang3.exception.DefaultExceptionContext();
    }

    public ContextedRuntimeException(final java.lang.String message) {
        super(message);
        exceptionContext = new org.apache.commons.lang3.exception.DefaultExceptionContext();
    }

    public ContextedRuntimeException(final java.lang.Throwable cause) {
        super(cause);
        exceptionContext = new org.apache.commons.lang3.exception.DefaultExceptionContext();
    }

    public ContextedRuntimeException(final java.lang.String message ,final java.lang.Throwable cause) {
        super(message, cause);
        exceptionContext = new org.apache.commons.lang3.exception.DefaultExceptionContext();
    }

    public ContextedRuntimeException(final java.lang.String message ,final java.lang.Throwable cause ,org.apache.commons.lang3.exception.ExceptionContext context) {
        super(message, cause);
        if (context == null) {
            context = new org.apache.commons.lang3.exception.DefaultExceptionContext();
        } 
        exceptionContext = context;
    }

    @java.lang.Override
    public org.apache.commons.lang3.exception.ContextedRuntimeException addContextValue(final java.lang.String label, final java.lang.Object value) {
        exceptionContext.addContextValue(label, value);
        return ((_returnReplacementOperator535.is("NULL")) ? ( null ) : (this));
    }

    @java.lang.Override
    public org.apache.commons.lang3.exception.ContextedRuntimeException setContextValue(final java.lang.String label, final java.lang.Object value) {
        exceptionContext.setContextValue(label, value);
        return ((_returnReplacementOperator536.is("NULL")) ? ( null ) : (this));
    }

    @java.lang.Override
    public java.util.List<java.lang.Object> getContextValues(final java.lang.String label) {
        return ((_returnReplacementOperator533.is("NULL")) ? ( null ) : (this.exceptionContext.getContextValues(label)));
    }

    @java.lang.Override
    public java.lang.Object getFirstContextValue(final java.lang.String label) {
        return ((_returnReplacementOperator528.is("NULL")) ? ( null ) : (this.exceptionContext.getFirstContextValue(label)));
    }

    @java.lang.Override
    public java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> getContextEntries() {
        return ((_returnReplacementOperator532.is("NULL")) ? ( null ) : (this.exceptionContext.getContextEntries()));
    }

    @java.lang.Override
    public java.util.Set<java.lang.String> getContextLabels() {
        return ((_returnReplacementOperator534.is("NULL")) ? ( null ) : (exceptionContext.getContextLabels()));
    }

    @java.lang.Override
    public java.lang.String getMessage() {
        return ((_returnReplacementOperator530.is("NULL")) ? ( null ) : (getFormattedExceptionMessage(super.getMessage())));
    }

    public java.lang.String getRawMessage() {
        return ((_returnReplacementOperator531.is("NULL")) ? ( null ) : (super.getMessage()));
    }

    @java.lang.Override
    public java.lang.String getFormattedExceptionMessage(final java.lang.String baseMessage) {
        return ((_returnReplacementOperator529.is("NULL")) ? ( null ) : (exceptionContext.getFormattedExceptionMessage(baseMessage)));
    }

    private static final metamutator.Selector _returnReplacementOperator528 = metamutator.Selector.of(528,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ContextedRuntimeException.class).id("_returnReplacementOperator528");

    private static final metamutator.Selector _returnReplacementOperator529 = metamutator.Selector.of(529,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ContextedRuntimeException.class).id("_returnReplacementOperator529");

    private static final metamutator.Selector _returnReplacementOperator530 = metamutator.Selector.of(530,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ContextedRuntimeException.class).id("_returnReplacementOperator530");

    private static final metamutator.Selector _returnReplacementOperator531 = metamutator.Selector.of(531,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ContextedRuntimeException.class).id("_returnReplacementOperator531");

    private static final metamutator.Selector _returnReplacementOperator532 = metamutator.Selector.of(532,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ContextedRuntimeException.class).id("_returnReplacementOperator532");

    private static final metamutator.Selector _returnReplacementOperator533 = metamutator.Selector.of(533,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ContextedRuntimeException.class).id("_returnReplacementOperator533");

    private static final metamutator.Selector _returnReplacementOperator534 = metamutator.Selector.of(534,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ContextedRuntimeException.class).id("_returnReplacementOperator534");

    private static final metamutator.Selector _returnReplacementOperator535 = metamutator.Selector.of(535,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ContextedRuntimeException.class).id("_returnReplacementOperator535");

    private static final metamutator.Selector _returnReplacementOperator536 = metamutator.Selector.of(536,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ContextedRuntimeException.class).id("_returnReplacementOperator536");
}

