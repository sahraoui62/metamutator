package org.apache.commons.lang3.exception;


public class ExceptionUtils {
    static final java.lang.String WRAPPED_MARKER = " [wrapped] ";

    private static final java.lang.String[] CAUSE_METHOD_NAMES = new java.lang.String[]{ "getCause" , "getNextException" , "getTargetException" , "getException" , "getSourceException" , "getRootCause" , "getCausedByException" , "getNested" , "getLinkedException" , "getNestedException" , "getLinkedCause" , "getThrowable" };

    public ExceptionUtils() {
        super();
    }

    @java.lang.Deprecated
    public static java.lang.String[] getDefaultCauseMethodNames() {
        return ((_returnReplacementOperator561.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.clone(org.apache.commons.lang3.exception.ExceptionUtils.CAUSE_METHOD_NAMES)));
    }

    @java.lang.Deprecated
    public static java.lang.Throwable getCause(final java.lang.Throwable throwable) {
        return ((_returnReplacementOperator567.is("NULL")) ? ( null ) : (org.apache.commons.lang3.exception.ExceptionUtils.getCause(throwable, org.apache.commons.lang3.exception.ExceptionUtils.CAUSE_METHOD_NAMES)));
    }

    @java.lang.Deprecated
    public static java.lang.Throwable getCause(final java.lang.Throwable throwable, java.lang.String[] methodNames) {
        if (throwable == null) {
            return ((_returnReplacementOperator568.is("NULL")) ? ( null ) : (null));
        } 
        if (methodNames == null) {
            methodNames = CAUSE_METHOD_NAMES;
        } 
        for (final java.lang.String methodName : methodNames) {
            if (methodName != null) {
                final java.lang.Throwable cause = org.apache.commons.lang3.exception.ExceptionUtils.getCauseUsingMethodName(throwable, methodName);
                if (cause != null) {
                    return ((_returnReplacementOperator569.is("NULL")) ? ( null ) : (cause));
                } 
            } 
        }
        return ((_returnReplacementOperator570.is("NULL")) ? ( null ) : (null));
    }

    public static java.lang.Throwable getRootCause(final java.lang.Throwable throwable) {
        final java.util.List<java.lang.Throwable> list = org.apache.commons.lang3.exception.ExceptionUtils.getThrowableList(throwable);
        return ((_returnReplacementOperator573.is("NULL")) ? ( null ) : ((list.size()) < 2 ? null : ((java.lang.Throwable)(list.get(((list.size()) - 1))))));
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
                return ((_returnReplacementOperator571.is("NULL")) ? ( null ) : (((java.lang.Throwable)(method.invoke(throwable)))));
            } catch (final java.lang.IllegalAccessException ignored) {
            } catch (final java.lang.IllegalArgumentException ignored) {
            } catch (final java.lang.reflect.InvocationTargetException ignored) {
            }
        } 
        return ((_returnReplacementOperator572.is("NULL")) ? ( null ) : (null));
    }

    public static int getThrowableCount(final java.lang.Throwable throwable) {
        return ((_returnReplacementOperator547.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator547.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator547.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.exception.ExceptionUtils.getThrowableList(throwable).size()));
    }

    public static java.lang.Throwable[] getThrowables(final java.lang.Throwable throwable) {
        final java.util.List<java.lang.Throwable> list = org.apache.commons.lang3.exception.ExceptionUtils.getThrowableList(throwable);
        return ((_returnReplacementOperator574.is("NULL")) ? ( null ) : (list.toArray(new java.lang.Throwable[list.size()])));
    }

    public static java.util.List<java.lang.Throwable> getThrowableList(java.lang.Throwable throwable) {
        final java.util.List<java.lang.Throwable> list = new java.util.ArrayList<java.lang.Throwable>();
        while ((throwable != null) && ((list.contains(throwable)) == false)) {
            list.add(throwable);
            throwable = org.apache.commons.lang3.exception.ExceptionUtils.getCause(throwable);
        }
        return ((_returnReplacementOperator576.is("NULL")) ? ( null ) : (list));
    }

    public static int indexOfThrowable(final java.lang.Throwable throwable, final java.lang.Class<?> clazz) {
        return ((_returnReplacementOperator553.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator553.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator553.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.exception.ExceptionUtils.indexOf(throwable, clazz, 0, false)));
    }

    public static int indexOfThrowable(final java.lang.Throwable throwable, final java.lang.Class<?> clazz, final int fromIndex) {
        return ((_returnReplacementOperator554.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator554.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator554.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.exception.ExceptionUtils.indexOf(throwable, clazz, fromIndex, false)));
    }

    public static int indexOfType(final java.lang.Throwable throwable, final java.lang.Class<?> type) {
        return ((_returnReplacementOperator555.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator555.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator555.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.exception.ExceptionUtils.indexOf(throwable, type, 0, true)));
    }

    public static int indexOfType(final java.lang.Throwable throwable, final java.lang.Class<?> type, final int fromIndex) {
        return ((_returnReplacementOperator556.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator556.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator556.is("ZERO")) ? ( 0 ) : (org.apache.commons.lang3.exception.ExceptionUtils.indexOf(throwable, type, fromIndex, true)));
    }

    private static int indexOf(final java.lang.Throwable throwable, final java.lang.Class<?> type, int fromIndex, final boolean subclass) {
        if ((throwable == null) || (type == null)) {
            return ((_returnReplacementOperator548.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator548.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator548.is("ZERO")) ? ( 0 ) : (-1));
        } 
        if (fromIndex < 0) {
            fromIndex = 0;
        } 
        final java.lang.Throwable[] throwables = org.apache.commons.lang3.exception.ExceptionUtils.getThrowables(throwable);
        if (fromIndex >= (throwables.length)) {
            return ((_returnReplacementOperator549.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator549.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator549.is("ZERO")) ? ( 0 ) : (-1));
        } 
        if (subclass) {
            for (int i = fromIndex ; i < (throwables.length) ; i++) {
                if (type.isAssignableFrom(throwables[i].getClass())) {
                    return ((_returnReplacementOperator550.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator550.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator550.is("ZERO")) ? ( 0 ) : (i));
                } 
            }
        } else {
            for (int i = fromIndex ; i < (throwables.length) ; i++) {
                if (type.equals(throwables[i].getClass())) {
                    return ((_returnReplacementOperator551.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator551.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator551.is("ZERO")) ? ( 0 ) : (i));
                } 
            }
        }
        return ((_returnReplacementOperator552.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator552.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator552.is("ZERO")) ? ( 0 ) : (-1));
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
            return ((_returnReplacementOperator562.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY));
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
        return ((_returnReplacementOperator563.is("NULL")) ? ( null ) : (frames.toArray(new java.lang.String[frames.size()])));
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
        return ((_returnReplacementOperator560.is("NULL")) ? ( null ) : (sw.getBuffer().toString()));
    }

    public static java.lang.String[] getStackFrames(final java.lang.Throwable throwable) {
        if (throwable == null) {
            return ((_returnReplacementOperator565.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY));
        } 
        return ((_returnReplacementOperator566.is("NULL")) ? ( null ) : (org.apache.commons.lang3.exception.ExceptionUtils.getStackFrames(org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(throwable))));
    }

    static java.lang.String[] getStackFrames(final java.lang.String stackTrace) {
        final java.lang.String linebreak = org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR;
        final java.util.StringTokenizer frames = new java.util.StringTokenizer(stackTrace , linebreak);
        final java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
        while (frames.hasMoreTokens()) {
            list.add(frames.nextToken());
        }
        return ((_returnReplacementOperator564.is("NULL")) ? ( null ) : (list.toArray(new java.lang.String[list.size()])));
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
        return ((_returnReplacementOperator575.is("NULL")) ? ( null ) : (list));
    }

    public static java.lang.String getMessage(final java.lang.Throwable th) {
        if (th == null) {
            return ((_returnReplacementOperator557.is("NULL")) ? ( null ) : (""));
        } 
        final java.lang.String clsName = org.apache.commons.lang3.ClassUtils.getShortClassName(th, null);
        final java.lang.String msg = th.getMessage();
        return ((_returnReplacementOperator558.is("NULL")) ? ( null ) : ((clsName + ": ") + (org.apache.commons.lang3.StringUtils.defaultString(msg))));
    }

    public static java.lang.String getRootCauseMessage(final java.lang.Throwable th) {
        java.lang.Throwable root = org.apache.commons.lang3.exception.ExceptionUtils.getRootCause(th);
        root = root == null ? th : root;
        return ((_returnReplacementOperator559.is("NULL")) ? ( null ) : (org.apache.commons.lang3.exception.ExceptionUtils.getMessage(root)));
    }

    public static <R>R rethrow(java.lang.Throwable throwable) {
        return ((_returnReplacementOperator545.is("NULL")) ? ( null ) : (org.apache.commons.lang3.exception.ExceptionUtils.<R, java.lang.RuntimeException>typeErasure(throwable)));
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
        return ((_returnReplacementOperator546.is("NULL")) ? ( null ) : (type.isInstance(chain)));
    }

    private static final metamutator.Selector _returnReplacementOperator545 = metamutator.Selector.of(545,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator545");

    private static final metamutator.Selector _returnReplacementOperator546 = metamutator.Selector.of(546,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator546");

    private static final metamutator.Selector _returnReplacementOperator547 = metamutator.Selector.of(547,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator547");

    private static final metamutator.Selector _returnReplacementOperator548 = metamutator.Selector.of(548,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator548");

    private static final metamutator.Selector _returnReplacementOperator549 = metamutator.Selector.of(549,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator549");

    private static final metamutator.Selector _returnReplacementOperator550 = metamutator.Selector.of(550,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator550");

    private static final metamutator.Selector _returnReplacementOperator551 = metamutator.Selector.of(551,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator551");

    private static final metamutator.Selector _returnReplacementOperator552 = metamutator.Selector.of(552,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator552");

    private static final metamutator.Selector _returnReplacementOperator553 = metamutator.Selector.of(553,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator553");

    private static final metamutator.Selector _returnReplacementOperator554 = metamutator.Selector.of(554,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator554");

    private static final metamutator.Selector _returnReplacementOperator555 = metamutator.Selector.of(555,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator555");

    private static final metamutator.Selector _returnReplacementOperator556 = metamutator.Selector.of(556,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator556");

    private static final metamutator.Selector _returnReplacementOperator557 = metamutator.Selector.of(557,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator557");

    private static final metamutator.Selector _returnReplacementOperator558 = metamutator.Selector.of(558,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator558");

    private static final metamutator.Selector _returnReplacementOperator559 = metamutator.Selector.of(559,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator559");

    private static final metamutator.Selector _returnReplacementOperator560 = metamutator.Selector.of(560,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator560");

    private static final metamutator.Selector _returnReplacementOperator561 = metamutator.Selector.of(561,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator561");

    private static final metamutator.Selector _returnReplacementOperator562 = metamutator.Selector.of(562,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator562");

    private static final metamutator.Selector _returnReplacementOperator563 = metamutator.Selector.of(563,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator563");

    private static final metamutator.Selector _returnReplacementOperator564 = metamutator.Selector.of(564,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator564");

    private static final metamutator.Selector _returnReplacementOperator565 = metamutator.Selector.of(565,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator565");

    private static final metamutator.Selector _returnReplacementOperator566 = metamutator.Selector.of(566,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator566");

    private static final metamutator.Selector _returnReplacementOperator567 = metamutator.Selector.of(567,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator567");

    private static final metamutator.Selector _returnReplacementOperator568 = metamutator.Selector.of(568,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator568");

    private static final metamutator.Selector _returnReplacementOperator569 = metamutator.Selector.of(569,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator569");

    private static final metamutator.Selector _returnReplacementOperator570 = metamutator.Selector.of(570,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator570");

    private static final metamutator.Selector _returnReplacementOperator571 = metamutator.Selector.of(571,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator571");

    private static final metamutator.Selector _returnReplacementOperator572 = metamutator.Selector.of(572,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator572");

    private static final metamutator.Selector _returnReplacementOperator573 = metamutator.Selector.of(573,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator573");

    private static final metamutator.Selector _returnReplacementOperator574 = metamutator.Selector.of(574,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator574");

    private static final metamutator.Selector _returnReplacementOperator575 = metamutator.Selector.of(575,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator575");

    private static final metamutator.Selector _returnReplacementOperator576 = metamutator.Selector.of(576,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.exception.ExceptionUtils.class).id("_returnReplacementOperator576");
}

