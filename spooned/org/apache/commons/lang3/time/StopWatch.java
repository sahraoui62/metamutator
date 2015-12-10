package org.apache.commons.lang3.time;


public class StopWatch {
    private static final long NANO_2_MILLIS = 1000000L;

    public static org.apache.commons.lang3.time.StopWatch createStarted() {
        org.apache.commons.lang3.time.StopWatch sw = new org.apache.commons.lang3.time.StopWatch();
        sw.start();
        return sw;
    }

    private enum State {
UNSTARTED {
            @java.lang.Override
            boolean isStarted() {
                return false;
            }

            @java.lang.Override
            boolean isStopped() {
                return true;
            }

            @java.lang.Override
            boolean isSuspended() {
                return false;
            }
        }, RUNNING {
            @java.lang.Override
            boolean isStarted() {
                return true;
            }

            @java.lang.Override
            boolean isStopped() {
                return false;
            }

            @java.lang.Override
            boolean isSuspended() {
                return false;
            }
        }, STOPPED {
            @java.lang.Override
            boolean isStarted() {
                return false;
            }

            @java.lang.Override
            boolean isStopped() {
                return true;
            }

            @java.lang.Override
            boolean isSuspended() {
                return false;
            }
        }, SUSPENDED {
            @java.lang.Override
            boolean isStarted() {
                return true;
            }

            @java.lang.Override
            boolean isStopped() {
                return false;
            }

            @java.lang.Override
            boolean isSuspended() {
                return true;
            }
        };
        abstract boolean isStarted();

        abstract boolean isStopped();

        abstract boolean isSuspended();
    }

    private enum SplitState {
SPLIT, UNSPLIT;    }

    private State runningState = State.UNSTARTED;

    private SplitState splitState = SplitState.UNSPLIT;

    private long startTime;

    private long startTimeMillis;

    private long stopTime;

    public StopWatch() {
        super();
    }

    public void start() {
        if ((this.runningState) == (State.STOPPED)) {
            throw new java.lang.IllegalStateException("Stopwatch must be reset before being restarted. ");
        } 
        if ((this.runningState) != (State.UNSTARTED)) {
            throw new java.lang.IllegalStateException("Stopwatch already started. ");
        } 
        this.startTime = java.lang.System.nanoTime();
        this.startTimeMillis = java.lang.System.currentTimeMillis();
        this.runningState = State.RUNNING;
    }

    public void stop() {
        if (((this.runningState) != (State.RUNNING)) && ((this.runningState) != (State.SUSPENDED))) {
            throw new java.lang.IllegalStateException("Stopwatch is not running. ");
        } 
        if ((this.runningState) == (State.RUNNING)) {
            this.stopTime = java.lang.System.nanoTime();
        } 
        this.runningState = State.STOPPED;
    }

    public void reset() {
        this.runningState = State.UNSTARTED;
        this.splitState = SplitState.UNSPLIT;
    }

    public void split() {
        if ((this.runningState) != (State.RUNNING)) {
            throw new java.lang.IllegalStateException("Stopwatch is not running. ");
        } 
        this.stopTime = java.lang.System.nanoTime();
        this.splitState = SplitState.SPLIT;
    }

    public void unsplit() {
        if ((this.splitState) != (SplitState.SPLIT)) {
            throw new java.lang.IllegalStateException("Stopwatch has not been split. ");
        } 
        this.splitState = SplitState.UNSPLIT;
    }

    public void suspend() {
        if ((this.runningState) != (State.RUNNING)) {
            throw new java.lang.IllegalStateException("Stopwatch must be running to suspend. ");
        } 
        this.stopTime = java.lang.System.nanoTime();
        this.runningState = State.SUSPENDED;
    }

    public void resume() {
        if ((this.runningState) != (State.SUSPENDED)) {
            throw new java.lang.IllegalStateException("Stopwatch must be suspended to resume. ");
        } 
        this.startTime += ((_arithmeticOperatorHotSpot348.is("PLUS")) ? ((java.lang.System.nanoTime()) + (this.stopTime)) : (_arithmeticOperatorHotSpot348.is("MINUS")) ? ((java.lang.System.nanoTime()) - (this.stopTime)) : (_arithmeticOperatorHotSpot348.is("MUL")) ? ((java.lang.System.nanoTime()) * (this.stopTime)) :  ((java.lang.System.nanoTime()) / (this.stopTime)));
        this.runningState = State.RUNNING;
    }

    public long getTime() {
        return ((_arithmeticOperatorHotSpot347.is("PLUS")) ? ((getNanoTime()) + (org.apache.commons.lang3.time.StopWatch.NANO_2_MILLIS)) : (_arithmeticOperatorHotSpot347.is("MINUS")) ? ((getNanoTime()) - (org.apache.commons.lang3.time.StopWatch.NANO_2_MILLIS)) : (_arithmeticOperatorHotSpot347.is("MUL")) ? ((getNanoTime()) * (org.apache.commons.lang3.time.StopWatch.NANO_2_MILLIS)) :  ((getNanoTime()) / (org.apache.commons.lang3.time.StopWatch.NANO_2_MILLIS)));
    }

    public long getNanoTime() {
        if (((this.runningState) == (State.STOPPED)) || ((this.runningState) == (State.SUSPENDED))) {
            return ((_arithmeticOperatorHotSpot343.is("PLUS")) ? ((this.stopTime) + (this.startTime)) : (_arithmeticOperatorHotSpot343.is("MINUS")) ? ((this.stopTime) - (this.startTime)) : (_arithmeticOperatorHotSpot343.is("MUL")) ? ((this.stopTime) * (this.startTime)) :  ((this.stopTime) / (this.startTime)));
        } else if ((this.runningState) == (State.UNSTARTED)) {
            return 0;
        } else if ((this.runningState) == (State.RUNNING)) {
            return ((_arithmeticOperatorHotSpot344.is("PLUS")) ? ((java.lang.System.nanoTime()) + (this.startTime)) : (_arithmeticOperatorHotSpot344.is("MINUS")) ? ((java.lang.System.nanoTime()) - (this.startTime)) : (_arithmeticOperatorHotSpot344.is("MUL")) ? ((java.lang.System.nanoTime()) * (this.startTime)) :  ((java.lang.System.nanoTime()) / (this.startTime)));
        } 
        throw new java.lang.RuntimeException("Illegal running state has occurred.");
    }

    public long getSplitTime() {
        return ((_arithmeticOperatorHotSpot346.is("PLUS")) ? ((getSplitNanoTime()) + (org.apache.commons.lang3.time.StopWatch.NANO_2_MILLIS)) : (_arithmeticOperatorHotSpot346.is("MINUS")) ? ((getSplitNanoTime()) - (org.apache.commons.lang3.time.StopWatch.NANO_2_MILLIS)) : (_arithmeticOperatorHotSpot346.is("MUL")) ? ((getSplitNanoTime()) * (org.apache.commons.lang3.time.StopWatch.NANO_2_MILLIS)) :  ((getSplitNanoTime()) / (org.apache.commons.lang3.time.StopWatch.NANO_2_MILLIS)));
    }

    public long getSplitNanoTime() {
        if ((this.splitState) != (SplitState.SPLIT)) {
            throw new java.lang.IllegalStateException("Stopwatch must be split to get the split time. ");
        } 
        return ((_arithmeticOperatorHotSpot345.is("PLUS")) ? ((this.stopTime) + (this.startTime)) : (_arithmeticOperatorHotSpot345.is("MINUS")) ? ((this.stopTime) - (this.startTime)) : (_arithmeticOperatorHotSpot345.is("MUL")) ? ((this.stopTime) * (this.startTime)) :  ((this.stopTime) / (this.startTime)));
    }

    public long getStartTime() {
        if ((this.runningState) == (State.UNSTARTED)) {
            throw new java.lang.IllegalStateException("Stopwatch has not been started");
        } 
        return this.startTimeMillis;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(getTime());
    }

    public java.lang.String toSplitString() {
        return org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(getSplitTime());
    }

    public boolean isStarted() {
        return runningState.isStarted();
    }

    public boolean isSuspended() {
        return runningState.isSuspended();
    }

    public boolean isStopped() {
        return runningState.isStopped();
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot343 = metamutator.Selector.of(343,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.time.StopWatch.class).id("_arithmeticOperatorHotSpot343");

    private static final metamutator.Selector _arithmeticOperatorHotSpot344 = metamutator.Selector.of(344,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.time.StopWatch.class).id("_arithmeticOperatorHotSpot344");

    private static final metamutator.Selector _arithmeticOperatorHotSpot345 = metamutator.Selector.of(345,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.time.StopWatch.class).id("_arithmeticOperatorHotSpot345");

    private static final metamutator.Selector _arithmeticOperatorHotSpot346 = metamutator.Selector.of(346,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.time.StopWatch.class).id("_arithmeticOperatorHotSpot346");

    private static final metamutator.Selector _arithmeticOperatorHotSpot347 = metamutator.Selector.of(347,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.time.StopWatch.class).id("_arithmeticOperatorHotSpot347");

    private static final metamutator.Selector _arithmeticOperatorHotSpot348 = metamutator.Selector.of(348,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.time.StopWatch.class).id("_arithmeticOperatorHotSpot348");
}

