package org.apache.commons.lang3;


public final class Range<T> implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private final java.util.Comparator<T> comparator;

    private final T minimum;

    private final T maximum;

    private transient int hashCode;

    private transient java.lang.String toString;

    public static <T extends java.lang.Comparable<T>>org.apache.commons.lang3.Range<T> is(final T element) {
        return ((_returnReplacementOperatorHotSpot2906.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Range.between(element, element, null)));
    }

    public static <T>org.apache.commons.lang3.Range<T> is(final T element, final java.util.Comparator<T> comparator) {
        return ((_returnReplacementOperatorHotSpot2908.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Range.between(element, element, comparator)));
    }

    public static <T extends java.lang.Comparable<T>>org.apache.commons.lang3.Range<T> between(final T fromInclusive, final T toInclusive) {
        return ((_returnReplacementOperatorHotSpot2905.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Range.between(fromInclusive, toInclusive, null)));
    }

    public static <T>org.apache.commons.lang3.Range<T> between(final T fromInclusive, final T toInclusive, final java.util.Comparator<T> comparator) {
        return ((_returnReplacementOperatorHotSpot2907.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.Range<T>(fromInclusive , toInclusive , comparator)));
    }

    @java.lang.SuppressWarnings(value = "unchecked")
    private Range(final T element1 ,final T element2 ,final java.util.Comparator<T> comp) {
        if ((element1 == null) || (element2 == null)) {
            throw new java.lang.IllegalArgumentException(((("Elements in a range must not be null: element1=" + element1) + ", element2=") + element2));
        } 
        if (comp == null) {
            this.comparator = org.apache.commons.lang3.Range.ComparableComparator.INSTANCE;
        } else {
            this.comparator = comp;
        }
        if ((this.comparator.compare(element1, element2)) < 1) {
            this.minimum = element1;
            this.maximum = element2;
        } else {
            this.minimum = element2;
            this.maximum = element1;
        }
    }

    public T getMinimum() {
        return ((_returnReplacementOperatorHotSpot2910.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (minimum));
    }

    public T getMaximum() {
        return ((_returnReplacementOperatorHotSpot2909.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (maximum));
    }

    public java.util.Comparator<T> getComparator() {
        return ((_returnReplacementOperatorHotSpot2939.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (comparator));
    }

    public boolean isNaturalOrdering() {
        return ((_returnReplacementOperatorHotSpot2928.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((comparator) == (org.apache.commons.lang3.Range.ComparableComparator.INSTANCE)));
    }

    public boolean contains(final T element) {
        if (element == null) {
            return ((_returnReplacementOperatorHotSpot2911.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperatorHotSpot2912.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((comparator.compare(element, minimum)) > (-1)) && ((comparator.compare(element, maximum)) < 1)));
    }

    public boolean isAfter(final T element) {
        if (element == null) {
            return ((_returnReplacementOperatorHotSpot2918.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperatorHotSpot2919.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((comparator.compare(element, minimum)) < 0));
    }

    public boolean isStartedBy(final T element) {
        if (element == null) {
            return ((_returnReplacementOperatorHotSpot2931.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperatorHotSpot2932.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((comparator.compare(element, minimum)) == 0));
    }

    public boolean isEndedBy(final T element) {
        if (element == null) {
            return ((_returnReplacementOperatorHotSpot2926.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperatorHotSpot2927.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((comparator.compare(element, maximum)) == 0));
    }

    public boolean isBefore(final T element) {
        if (element == null) {
            return ((_returnReplacementOperatorHotSpot2922.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperatorHotSpot2923.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((comparator.compare(element, maximum)) > 0));
    }

    public int elementCompareTo(final T element) {
        if (element == null) {
            throw new java.lang.NullPointerException("Element is null");
        } 
        if (isAfter(element)) {
            return ((_returnReplacementOperatorHotSpot2933.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2933.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2933.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
        } else if (isBefore(element)) {
            return ((_returnReplacementOperatorHotSpot2934.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2934.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2934.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (1));
        } else {
            return ((_returnReplacementOperatorHotSpot2935.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2935.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2935.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
        }
    }

    public boolean containsRange(final org.apache.commons.lang3.Range<T> otherRange) {
        if (otherRange == null) {
            return ((_returnReplacementOperatorHotSpot2913.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperatorHotSpot2914.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((contains(otherRange.minimum)) && (contains(otherRange.maximum))));
    }

    public boolean isAfterRange(final org.apache.commons.lang3.Range<T> otherRange) {
        if (otherRange == null) {
            return ((_returnReplacementOperatorHotSpot2920.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperatorHotSpot2921.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (isAfter(otherRange.maximum)));
    }

    public boolean isOverlappedBy(final org.apache.commons.lang3.Range<T> otherRange) {
        if (otherRange == null) {
            return ((_returnReplacementOperatorHotSpot2929.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperatorHotSpot2930.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((otherRange.contains(minimum)) || (otherRange.contains(maximum))) || (contains(otherRange.minimum))));
    }

    public boolean isBeforeRange(final org.apache.commons.lang3.Range<T> otherRange) {
        if (otherRange == null) {
            return ((_returnReplacementOperatorHotSpot2924.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperatorHotSpot2925.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (isBefore(otherRange.minimum)));
    }

    public org.apache.commons.lang3.Range<T> intersectionWith(final org.apache.commons.lang3.Range<T> other) {
        if (!(isOverlappedBy(other))) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot calculate intersection with non-overlapping range %s", other));
        } 
        if (equals(other)) {
            return ((_returnReplacementOperatorHotSpot2940.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        final T min = (getComparator().compare(minimum, other.minimum)) < 0 ? other.minimum : minimum;
        final T max = (getComparator().compare(maximum, other.maximum)) < 0 ? maximum : other.maximum;
        return ((_returnReplacementOperatorHotSpot2941.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Range.between(min, max, getComparator())));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == (this)) {
            return ((_returnReplacementOperatorHotSpot2915.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } else if ((obj == null) || ((obj.getClass()) != (getClass()))) {
            return ((_returnReplacementOperatorHotSpot2916.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } else {
            @java.lang.SuppressWarnings(value = "unchecked")
            final org.apache.commons.lang3.Range<T> range = ((org.apache.commons.lang3.Range<T>)(obj));
            return ((_returnReplacementOperatorHotSpot2917.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((minimum.equals(range.minimum)) && (maximum.equals(range.maximum))));
        }
    }

    @java.lang.Override
    public int hashCode() {
        int result = hashCode;
        if ((hashCode) == 0) {
            result = 17;
            result = (37 * result) + (getClass().hashCode());
            result = (37 * result) + (minimum.hashCode());
            result = (37 * result) + (maximum.hashCode());
            hashCode = result;
        } 
        return ((_returnReplacementOperatorHotSpot2936.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2936.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2936.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (result));
    }

    @java.lang.Override
    public java.lang.String toString() {
        if ((toString) == null) {
            toString = ((("[" + (minimum)) + "..") + (maximum)) + "]";
        } 
        return ((_returnReplacementOperatorHotSpot2937.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (toString));
    }

    public java.lang.String toString(final java.lang.String format) {
        return ((_returnReplacementOperatorHotSpot2938.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.String.format(format, minimum, maximum, comparator)));
    }

    @java.lang.SuppressWarnings(value = { "rawtypes" , "unchecked" })
    private enum ComparableComparator implements java.util.Comparator {
INSTANCE;
        @java.lang.Override
        public int compare(final java.lang.Object obj1, final java.lang.Object obj2) {
            return ((_returnReplacementOperatorHotSpot2904.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot2904.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot2904.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (((java.lang.Comparable)(obj1)).compareTo(obj2)));
        }
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2904 = metamutator.Selector.of(2904,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot2904");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2905 = metamutator.Selector.of(2905,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2905");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2906 = metamutator.Selector.of(2906,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2906");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2907 = metamutator.Selector.of(2907,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2907");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2908 = metamutator.Selector.of(2908,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2908");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2909 = metamutator.Selector.of(2909,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2909");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2910 = metamutator.Selector.of(2910,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2910");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2911 = metamutator.Selector.of(2911,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2911");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2912 = metamutator.Selector.of(2912,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2912");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2913 = metamutator.Selector.of(2913,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2913");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2914 = metamutator.Selector.of(2914,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2914");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2915 = metamutator.Selector.of(2915,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2915");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2916 = metamutator.Selector.of(2916,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2916");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2917 = metamutator.Selector.of(2917,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2917");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2918 = metamutator.Selector.of(2918,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2918");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2919 = metamutator.Selector.of(2919,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2919");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2920 = metamutator.Selector.of(2920,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2920");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2921 = metamutator.Selector.of(2921,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2921");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2922 = metamutator.Selector.of(2922,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2922");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2923 = metamutator.Selector.of(2923,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2923");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2924 = metamutator.Selector.of(2924,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2924");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2925 = metamutator.Selector.of(2925,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2925");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2926 = metamutator.Selector.of(2926,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2926");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2927 = metamutator.Selector.of(2927,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2927");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2928 = metamutator.Selector.of(2928,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2928");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2929 = metamutator.Selector.of(2929,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2929");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2930 = metamutator.Selector.of(2930,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2930");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2931 = metamutator.Selector.of(2931,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2931");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2932 = metamutator.Selector.of(2932,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2932");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2933 = metamutator.Selector.of(2933,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2933");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2934 = metamutator.Selector.of(2934,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2934");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2935 = metamutator.Selector.of(2935,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2935");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2936 = metamutator.Selector.of(2936,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2936");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2937 = metamutator.Selector.of(2937,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2937");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2938 = metamutator.Selector.of(2938,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2938");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2939 = metamutator.Selector.of(2939,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2939");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2940 = metamutator.Selector.of(2940,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2940");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2941 = metamutator.Selector.of(2941,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperatorHotSpot2941");
}

