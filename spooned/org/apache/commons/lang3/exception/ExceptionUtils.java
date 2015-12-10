package org.apache.commons.lang3.exception;


public class ExceptionUtils {
    static final java.lang.String WRAPPED_MARKER = " [wrapped] ";

    private static final java.lang.String[] CAUSE_METHOD_NAMES = new java.lang.String[]{ "getCause" , "getNextException" , "getTargetException" , "getException" , "getSourceException" , "getRootCause" , "getCausedByException" , "getNested" , "getLinkedException" , "getNestedException" , "getLinkedCause" , "getThrowable" };

    public ExceptionUtils() {
        super();
    }

    @java.lang.Deprecated
    public static java.lang.String[] getDefaultCauseMethodNames() {
        return ((_returnReplacementOperatorHotSpot561.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(org.apache.commons.lang3.exception.ExceptionUtils.CAUSE_METHOD_NAMES)));
    }

    @java.lang.Deprecated
    public static java.lang.Throwable getCause(final java.lang.Throwable throwable) {
        return ((_returnReplacementOperatorHotSpot567.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.exception.ExceptionUtils.getCause(throwable, org.apache.commons.lang3.exception.ExceptionUtils.CAUSE_METHOD_NAMES)));
    }

    @java.lang.Deprecated
    public static java.lang.Throwable getCause(final java.lang.Throwable throwable, java.lang.String[] methodNames) {
        if (throwable == null) {
            return ((_returnReplacementOperatorHotSpot568.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
        } 
        if (methodNames == null) {
            methodNames = CAUSE_METHOD_NAMES;
        } 
        for (final java.lang.String methodName : methodNames) {
            if (methodName != null) {
                final java.lang.Throwable cause = org.apache.commons.lang3.exception.ExceptionUtils.getCauseUsingMethodName(throwable, methodName);
                if (cause != null) {
                    return ((_returnReplacementOperatorHotSpot569.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (cause));
                } 
            } 
        }
        return ((_returnReplacementOperatorHotSpot570.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
    }

    public static java.lang.Throwable getRootCause(final java.lang.Throwable throwable) {
        final java.util.List<java.lang.Throwable> list = org.apache.commons.lang3.exception.ExceptionUtils.getThrowableList(throwable);
        return ((_returnReplacementOperatorHotSpot573.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((list.size()) < 2 ? null : ((java.lang.Throwable)(list.get(((list.size()) - 1))))));
    }

    private static java.lang.Throwable getCauseUsingMethodName(final java.lang.Throwable throwable, final java.lang.String methodName) {
        java.lang.reflect.Method method = null;
        try {
            method = throwable.getClass().getMethod(methodName);
        } catch (final java.lang.NoSuchMethodException ignored) {
        } catch (final java.lang.SecurityException ignored) {
        }
        if ((method != null) && (java.lang.Throwable.class.isAssignableFrom(method.getReturnType()))) {
            try {
                return ((_returnReplacementOperatorHotSpot571.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((java.lang.Throwable)(method.invoke(throwable)))));
            } catch (final java.lang.IllegalAccessException ignored) {
            } catch (final java.lang.IllegalArgumentException ignored) {
            } catch (final java.lang.reflect.InvocationTargetException ignored) {
            }
        } 
        return ((_returnReplacementOperatorHotSpot572.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (null));
    }

    public static int getThrowableCount(final java.lang.Throwable throwable) {
        return ((_returnReplacementOperatorHotSpot547.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot547.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot547.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.exception.ExceptionUtils.getThrowableList(throwable).size()));
    }

    public static java.lang.Throwable[] getThrowables(final java.lang.Throwable throwable) {
        final java.util.List<java.lang.Throwable> list = org.apache.commons.lang3.exception.ExceptionUtils.getThrowableList(throwable);
        return ((_returnReplacementOperatorHotSpot574.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (list.toArray(new java.lang.Throwable[list.size()])));
    }

    public static java.util.List<java.lang.Throwable> getThrowableList(java.lang.Throwable throwable) {
        final java.util.List<java.lang.Throwable> list = new java.util.ArrayList<java.lang.Throwable>();
        while ((throwable != null) && ((list.contains(throwable)) == false)) {
            list.add(throwable);
            throwable = org.apache.commons.lang3.exception.ExceptionUtils.getCause(throwable);
        }
        return ((_returnReplacementOperatorHotSpot576.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (list));
    }

    public static int indexOfThrowable(final java.lang.Throwable throwable, final java.lang.Class<?> clazz) {
        return ((_returnReplacementOperatorHotSpot553.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot553.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot553.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.exception.ExceptionUtils.indexOf(throwable, clazz, 0, false)));
    }

    public static int indexOfThrowable(final java.lang.Throwable throwable, final java.lang.Class<?> clazz, final int fromIndex) {
        return ((_returnReplacementOperatorHotSpot554.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot554.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot554.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.exception.ExceptionUtils.indexOf(throwable, clazz, fromIndex, false)));
    }

    public static int indexOfType(final java.lang.Throwable throwable, final java.lang.Class<?> type) {
        return ((_returnReplacementOperatorHotSpot555.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot555.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot555.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.exception.ExceptionUtils.indexOf(throwable, type, 0, true)));
    }

    public static int indexOfType(final java.lang.Throwable throwable, final java.lang.Class<?> type, final int fromIndex) {
        return ((_returnReplacementOperatorHotSpot556.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot556.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot556.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (org.apache.commons.lang3.exception.ExceptionUtils.indexOf(throwable, type, fromIndex, true)));
    }

    private static int indexOf(final java.lang.Throwable throwable, final java.lang.Class<?> type, int fromIndex, final boolean subclass) {
        if ((throwable == null) || (type == null)) {
            return ((_returnReplacementOperatorHotSpot548.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot548.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot548.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
        } 
        if (fromIndex < 0) {
            fromIndex = 0;
        } 
        final java.lang.Throwable[] throwables = org.apache.commons.lang3.exception.ExceptionUtils.getThrowables(throwable);
        if (fromIndex >= (throwables.length)) {
            return ((_returnReplacementOperatorHotSpot549.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot549.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot549.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
        } 
        if (subclass) {
            for (int i = fromIndex ; i < (throwables.length) ; i++) {
                if (type.isAssignableFrom(throwables[i].getClass())) {
                    return ((_returnReplacementOperatorHotSpot550.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot550.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot550.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
                } 
            }
        } else {
            for (int i = fromIndex ; i < (throwables.length) ; i++) {
                if (type.equals(throwables[i].getClass())) {
                    return ((_returnReplacementOperatorHotSpot551.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot551.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot551.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
                } 
            }
        }
        return ((_returnReplacementOperatorHotSpot552.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot552.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot552.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
    }

    public static void printRootCauseStackTrace(final java.lang.Throwable throwable) {
        org.apache.commons.lang3.exception.ExceptionUtils.printRootCauseStackTrace(throwable, java.lang.System.err);
    }

    public static void printRootCauseStackTrace(final java.lang.Throwable throwable, final java.io.PrintStream stream) {
        if (throwable == null) {
            return ;
        } 
        if (stream == null) {
            throw new java.lang.IllegalArgumentException("The PrintStream must not be null");
        } 
        final java.lang.String[] trace = org.apache.commons.lang3.exception.ExceptionUtils.getRootCauseStackTrace(throwable);
        for (final java.lang.String element : trace) {
            stream.println(element);
        }
        stream.flush();
    }

    public static void printRootCauseStackTrace(final java.lang.Throwable throwable, final java.io.PrintWriter writer) {
        if (throwable == null) {
            return ;
        } 
        if (writer == null) {
            throw new java.lang.IllegalArgumentException("The PrintWriter must not be null");
        } 
        final java.lang.String[] trace = org.apache.commons.lang3.exception.ExceptionUtils.getRootCauseStackTrace(throwable);
        for (final java.lang.String element : trace) {
            writer.println(element);
        }
        writer.flush();
    }

    public static java.lang.String[] getRootCauseStackTrace(final java.lang.Throwable throwable) {
        if (throwable == null) {
            return ((_returnReplacementOperatorHotSpot562.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY));
        } 
        final java.lang.Throwable[] throwables = org.apache.commons.lang3.exception.ExceptionUtils.getThrowables(throwable);
        final int count = throwables.length;
        final java.util.List<java.lang.String> frames = new java.util.ArrayList<java.lang.String>();
        java.util.List<java.lang.String> nextTrace = org.apache.commons.lang3.exception.ExceptionUtils.getStackFrameList(throwables[(count - 1)]);
        for (int i = count ; (--i) >= 0 ; ) {
            final java.util.List<java.lang.String> trace = nextTrace;
            if (i != 0) {
                nextTrace = org.apache.commons.lang3.exception.ExceptionUtils.getStackFrameList(throwables[(i - 1)]);
                org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames(trace, nextTrace);
            } 
            if (i == (count - 1)) {
                frames.add(throwables[i].toString());
            } else {
                frames.add(((WRAPPED_MARKER) + (throwables[i].toString())));
            }
            for (int j = 0 ; j < (trace.size()) ; j++) {
                frames.add(trace.get(j));
            }
        }
        return ((_returnReplacementOperatorHotSpot563.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (frames.toArray(new java.lang.String[frames.size()])));
    }

    public static void removeCommonFrames(final java.util.List<java.lang.String> causeFrames, final java.util.List<java.lang.String> wrapperFrames) {
        if ((causeFrames == null) || (wrapperFrames == null)) {
            throw new java.lang.IllegalArgumentException("The List must not be null");
        } 
        int causeFrameIndex = (causeFrames.size()) - 1;
        int wrapperFrameIndex = (wrapperFrames.size()) - 1;
        while ((causeFrameIndex >= 0) && (wrapperFrameIndex >= 0)) {
            final java.lang.String causeFrame = causeFrames.get(causeFrameIndex);
            final java.lang.String wrapperFrame = wrapperFrames.get(wrapperFrameIndex);
            if (causeFrame.equals(wrapperFrame)) {
                causeFrames.remove(causeFrameIndex);
            } 
            causeFrameIndex--;
            wrapperFrameIndex--;
        }
    }

    public static java.lang.String getStackTrace(final java.lang.Throwable throwable) {
        final java.io.StringWriter sw = new java.io.StringWriter();
        final java.io.PrintWriter pw = new java.io.PrintWriter(sw , true);
        throwable.printStackTrace(pw);
        return ((_returnReplacementOperatorHotSpot560.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (sw.getBuffer().toString()));
    }

    public static java.lang.String[] getStackFrames(final java.lang.Throwable throwable) {
        if (throwable == null) {
            return ((_returnReplacementOperatorHotSpot565.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY));
        } 
        return ((_returnReplacementOperatorHotSpot566.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.exception.ExceptionUtils.getStackFrames(org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(throwable))));
    }

    static java.lang.String[] getStackFrames(final java.lang.String stackTrace) {
        final java.lang.String linebreak = org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR;
        final java.util.StringTokenizer frames = new java.util.StringTokenizer(stackTrace , linebreak);
        final java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
        while (frames.hasMoreTokens()) {
            list.add(frames.nextToken());
        }
        return ((_returnReplacementOperatorHotSpot564.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (list.toArray(new java.lang.String[list.size()])));
    }

    static java.util.List<java.lang.String> getStackFrameList(final java.lang.Throwable t) {
        final java.lang.String stackTrace = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(t);
        final java.lang.String linebreak = org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR;
        final java.util.StringTokenizer frames = new java.util.StringTokenizer(stackTrace , linebreak);
        final java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
        boolean traceStarted = false;
        while (frames.hasMoreTokens()) {
            final java.lang.String token = frames.nextToken();
            final int at = token.indexOf("at");
            if ((at != (-1)) && (token.substring(0, at).trim().isEmpty())) {
                traceStarted = true;
                list.add(token);
            } else if (traceStarted) {
                break;
            } 
        }
        return ((_returnReplacementOperatorHotSpot575.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (list));
    }

    public static java.lang.String getMessage(final java.lang.Throwable th) {
        if (th == null) {
            return ((_returnReplacementOperatorHotSpot557.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (""));
        } 
        final java.lang.String clsName = org.apache.commons.lang3.ClassUtils.getShortClassName(th, null);
        final java.lang.String msg = th.getMessage();
        return ((_returnReplacementOperatorHotSpot558.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((clsName + ": ") + (org.apache.commons.lang3.StringUtils.defaultString(msg))));
    }

    public static java.lang.String getRootCauseMessage(final java.lang.Throwable th) {
        java.lang.Throwable root = org.apache.commons.lang3.exception.ExceptionUtils.getRootCause(th);
        root = root == null ? th : root;
        return ((_returnReplacementOperatorHotSpot559.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.exception.ExceptionUtils.getMessage(root)));
    }

    public static <R>R rethrow(java.lang.Throwable throwable) {
        return ((_returnReplacementOperatorHotSpot545.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.exception.ExceptionUtils.<R, java.lang.RuntimeException>typeErasure(throwable)));
    }

    @java.lang.SuppressWarnings(value = "unchecked")
    private static <R, T extends java.lang.Throwable>R typeErasure(java.lang.Throwable throwable) throws T {
        throw ((T)(throwable));
    }

    public static <R>R wrapAndThrow(java.lang.Throwable throwable) {
        if (throwable instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException)(throwable));
        } 
        if (throwable instanceof java.lang.Error) {
            throw ((java.lang.Error)(throwable));
        } 
        throw new java.lang.reflect.UndeclaredThrowableException(throwable);
    }

    public static boolean hasCause(java.lang.Throwable chain, java.lang.Class<? extends java.lang.Throwable> type) {
        if (chain instanceof java.lang.reflect.UndeclaredThrowableException) {
            chain = chain.getCause();
        } 
        return ((_returnReplacementOperatorHotSpot546.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (type.isInstance(chain)));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot545 = metamutator.Selector.of(545,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot545");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot546 = metamutator.Selector.of(546,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot546");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot547 = metamutator.Selector.of(547,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot547");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot548 = metamutator.Selector.of(548,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot548");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot549 = metamutator.Selector.of(549,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot549");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot550 = metamutator.Selector.of(550,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot550");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot551 = metamutator.Selector.of(551,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot551");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot552 = metamutator.Selector.of(552,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot552");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot553 = metamutator.Selector.of(553,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot553");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot554 = metamutator.Selector.of(554,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot554");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot555 = metamutator.Selector.of(555,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot555");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot556 = metamutator.Selector.of(556,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot556");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot557 = metamutator.Selector.of(557,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot557");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot558 = metamutator.Selector.of(558,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot558");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot559 = metamutator.Selector.of(559,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot559");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot560 = metamutator.Selector.of(560,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot560");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot561 = metamutator.Selector.of(561,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot561");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot562 = metamutator.Selector.of(562,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot562");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot563 = metamutator.Selector.of(563,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot563");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot564 = metamutator.Selector.of(564,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot564");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot565 = metamutator.Selector.of(565,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot565");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot566 = metamutator.Selector.of(566,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot566");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot567 = metamutator.Selector.of(567,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot567");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot568 = metamutator.Selector.of(568,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot568");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot569 = metamutator.Selector.of(569,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot569");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot570 = metamutator.Selector.of(570,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot570");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot571 = metamutator.Selector.of(571,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot571");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot572 = metamutator.Selector.of(572,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot572");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot573 = metamutator.Selector.of(573,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot573");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot574 = metamutator.Selector.of(574,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot574");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot575 = metamutator.Selector.of(575,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot575");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot576 = metamutator.Selector.of(576,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperatorHotSpot576");
}

