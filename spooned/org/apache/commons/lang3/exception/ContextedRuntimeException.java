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
        return ((_returnReplacementOperatorHotSpot535.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    @java.lang.Override
    public org.apache.commons.lang3.exception.ContextedRuntimeException setContextValue(final java.lang.String label, final java.lang.Object value) {
        exceptionContext.setContextValue(label, value);
        return ((_returnReplacementOperatorHotSpot536.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    @java.lang.Override
    public java.util.List<java.lang.Object> getContextValues(final java.lang.String label) {
        return ((_returnReplacementOperatorHotSpot533.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this.exceptionContext.getContextValues(label)));
    }

    @java.lang.Override
    public java.lang.Object getFirstContextValue(final java.lang.String label) {
        return ((_returnReplacementOperatorHotSpot528.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this.exceptionContext.getFirstContextValue(label)));
    }

    @java.lang.Override
    public java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.Object>> getContextEntries() {
        return ((_returnReplacementOperatorHotSpot532.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this.exceptionContext.getContextEntries()));
    }

    @java.lang.Override
    public java.util.Set<java.lang.String> getContextLabels() {
        return ((_returnReplacementOperatorHotSpot534.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (exceptionContext.getContextLabels()));
    }

    @java.lang.Override
    public java.lang.String getMessage() {
        return ((_returnReplacementOperatorHotSpot530.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (getFormattedExceptionMessage(super.getMessage())));
    }

    public java.lang.String getRawMessage() {
        return ((_returnReplacementOperatorHotSpot531.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (super.getMessage()));
    }

    @java.lang.Override
    public java.lang.String getFormattedExceptionMessage(final java.lang.String baseMessage) {
        return ((_returnReplacementOperatorHotSpot529.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (exceptionContext.getFormattedExceptionMessage(baseMessage)));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot528 = metamutator.Selector.of(528,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ContextedRuntimeException.class).id("_returnReplacementOperatorHotSpot528");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot529 = metamutator.Selector.of(529,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ContextedRuntimeException.class).id("_returnReplacementOperatorHotSpot529");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot530 = metamutator.Selector.of(530,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ContextedRuntimeException.class).id("_returnReplacementOperatorHotSpot530");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot531 = metamutator.Selector.of(531,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ContextedRuntimeException.class).id("_returnReplacementOperatorHotSpot531");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot532 = metamutator.Selector.of(532,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ContextedRuntimeException.class).id("_returnReplacementOperatorHotSpot532");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot533 = metamutator.Selector.of(533,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ContextedRuntimeException.class).id("_returnReplacementOperatorHotSpot533");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot534 = metamutator.Selector.of(534,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ContextedRuntimeException.class).id("_returnReplacementOperatorHotSpot534");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot535 = metamutator.Selector.of(535,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ContextedRuntimeException.class).id("_returnReplacementOperatorHotSpot535");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot536 = metamutator.Selector.of(536,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ContextedRuntimeException.class).id("_returnReplacementOperatorHotSpot536");
}

