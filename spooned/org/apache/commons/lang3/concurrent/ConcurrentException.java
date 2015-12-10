package org.apache.commons.lang3.concurrent;


public class ConcurrentException extends java.lang.Exception {
    private static final long serialVersionUID = 6622707671812226130L;

    protected ConcurrentException() {
        super();
    }

    public ConcurrentException(final java.lang.Throwable cause) {
        super(org.apache.commons.lang3.concurrent.ConcurrentUtils.checkedException(cause));
    }

    public ConcurrentException(final java.lang.String msg ,final java.lang.Throwable cause) {
        super(msg, org.apache.commons.lang3.concurrent.ConcurrentUtils.checkedException(cause));
    }
}

