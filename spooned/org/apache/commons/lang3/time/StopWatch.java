package org.apache.commons.lang3.time;


public class StopWatch {
    private static final long NANO_2_MILLIS = 1000000L;

    public static org.apache.commons.lang3.time.StopWatch createStarted() {
        org.apache.commons.lang3.time.StopWatch sw = new org.apache.commons.lang3.time.StopWatch();
        sw.start();
        return ((_returnReplacementOperatorHotSpot1858.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (sw));
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
        this.startTime += (java.lang.System.nanoTime()) - (this.stopTime);
        this.runningState = State.RUNNING;
    }

    public long getTime() {
        return ((_returnReplacementOperatorHotSpot1857.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((getNanoTime()) / (org.apache.commons.lang3.time.StopWatch.NANO_2_MILLIS)));
    }

    public long getNanoTime() {
        if (((this.runningState) == (State.STOPPED)) || ((this.runningState) == (State.SUSPENDED))) {
            return ((_returnReplacementOperatorHotSpot1851.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((this.stopTime) - (this.startTime)));
        } else if ((this.runningState) == (State.UNSTARTED)) {
            return ((_returnReplacementOperatorHotSpot1852.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1852.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1852.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
        } else if ((this.runningState) == (State.RUNNING)) {
            return ((_returnReplacementOperatorHotSpot1853.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((java.lang.System.nanoTime()) - (this.startTime)));
        } 
        throw new java.lang.RuntimeException("Illegal running state has occurred.");
    }

    public long getSplitTime() {
        return ((_returnReplacementOperatorHotSpot1855.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((getSplitNanoTime()) / (org.apache.commons.lang3.time.StopWatch.NANO_2_MILLIS)));
    }

    public long getSplitNanoTime() {
        if ((this.splitState) != (SplitState.SPLIT)) {
            throw new java.lang.IllegalStateException("Stopwatch must be split to get the split time. ");
        } 
        return ((_returnReplacementOperatorHotSpot1854.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((this.stopTime) - (this.startTime)));
    }

    public long getStartTime() {
        if ((this.runningState) == (State.UNSTARTED)) {
            throw new java.lang.IllegalStateException("Stopwatch has not been started");
        } 
        return ((_returnReplacementOperatorHotSpot1856.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this.startTimeMillis));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperatorHotSpot1850.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(getTime())));
    }

    public java.lang.String toSplitString() {
        return ((_returnReplacementOperatorHotSpot1849.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.time.DurationFormatUtils.formatDurationHMS(getSplitTime())));
    }

    public boolean isStarted() {
        return ((_returnReplacementOperatorHotSpot1846.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (runningState.isStarted()));
    }

    public boolean isSuspended() {
        return ((_returnReplacementOperatorHotSpot1848.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (runningState.isSuspended()));
    }

    public boolean isStopped() {
        return ((_returnReplacementOperatorHotSpot1847.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (runningState.isStopped()));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1846 = metamutator.Selector.of(1846,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.StopWatch.class).id("_returnReplacementOperatorHotSpot1846");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1847 = metamutator.Selector.of(1847,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.StopWatch.class).id("_returnReplacementOperatorHotSpot1847");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1848 = metamutator.Selector.of(1848,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.StopWatch.class).id("_returnReplacementOperatorHotSpot1848");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1849 = metamutator.Selector.of(1849,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.StopWatch.class).id("_returnReplacementOperatorHotSpot1849");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1850 = metamutator.Selector.of(1850,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.StopWatch.class).id("_returnReplacementOperatorHotSpot1850");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1851 = metamutator.Selector.of(1851,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.StopWatch.class).id("_returnReplacementOperatorHotSpot1851");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1852 = metamutator.Selector.of(1852,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.time.StopWatch.class).id("_returnReplacementOperatorHotSpot1852");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1853 = metamutator.Selector.of(1853,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.StopWatch.class).id("_returnReplacementOperatorHotSpot1853");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1854 = metamutator.Selector.of(1854,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.StopWatch.class).id("_returnReplacementOperatorHotSpot1854");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1855 = metamutator.Selector.of(1855,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.StopWatch.class).id("_returnReplacementOperatorHotSpot1855");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1856 = metamutator.Selector.of(1856,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.StopWatch.class).id("_returnReplacementOperatorHotSpot1856");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1857 = metamutator.Selector.of(1857,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.StopWatch.class).id("_returnReplacementOperatorHotSpot1857");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1858 = metamutator.Selector.of(1858,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.time.StopWatch.class).id("_returnReplacementOperatorHotSpot1858");
}

