package org.apache.commons.lang3.concurrent;


public class ConcurrentRuntimeException extends java.lang.RuntimeException {
    private static final long serialVersionUID = -6582182735562919670L;

    protected ConcurrentRuntimeException() {
        super();
    }

    public ConcurrentRuntimeException(final java.lang.Throwable cause) {
        super(org.apache.commons.lang3.concurrent.ConcurrentUtils.checkedException(cause));
    }

    public ConcurrentRuntimeException(final java.lang.String msg ,final java.lang.Throwable cause) {
        super(msg, org.apache.commons.lang3.concurrent.ConcurrentUtils.checkedException(cause));
    }
}

