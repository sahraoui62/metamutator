package org.apache.commons.lang3;


public final class Range<T> implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private final java.util.Comparator<T> comparator;

    private final T minimum;

    private final T maximum;

    private transient int hashCode;

    private transient java.lang.String toString;

    public static <T extends java.lang.Comparable<T>>org.apache.commons.lang3.Range<T> is(final T element) {
        return ((_returnReplacementOperator2906.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Range.between(element, element, null)));
    }

    public static <T>org.apache.commons.lang3.Range<T> is(final T element, final java.util.Comparator<T> comparator) {
        return ((_returnReplacementOperator2908.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Range.between(element, element, comparator)));
    }

    public static <T extends java.lang.Comparable<T>>org.apache.commons.lang3.Range<T> between(final T fromInclusive, final T toInclusive) {
        return ((_returnReplacementOperator2905.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Range.between(fromInclusive, toInclusive, null)));
    }

    public static <T>org.apache.commons.lang3.Range<T> between(final T fromInclusive, final T toInclusive, final java.util.Comparator<T> comparator) {
        return ((_returnReplacementOperator2907.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.Range<T>(fromInclusive , toInclusive , comparator)));
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
        return ((_returnReplacementOperator2910.is("NULL")) ? ( null ) : (minimum));
    }

    public T getMaximum() {
        return ((_returnReplacementOperator2909.is("NULL")) ? ( null ) : (maximum));
    }

    public java.util.Comparator<T> getComparator() {
        return ((_returnReplacementOperator2939.is("NULL")) ? ( null ) : (comparator));
    }

    public boolean isNaturalOrdering() {
        return ((_returnReplacementOperator2928.is("NULL")) ? ( null ) : ((comparator) == (org.apache.commons.lang3.Range.ComparableComparator.INSTANCE)));
    }

    public boolean contains(final T element) {
        if (element == null) {
            return ((_returnReplacementOperator2911.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator2912.is("NULL")) ? ( null ) : (((comparator.compare(element, minimum)) > (-1)) && ((comparator.compare(element, maximum)) < 1)));
    }

    public boolean isAfter(final T element) {
        if (element == null) {
            return ((_returnReplacementOperator2918.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator2919.is("NULL")) ? ( null ) : ((comparator.compare(element, minimum)) < 0));
    }

    public boolean isStartedBy(final T element) {
        if (element == null) {
            return ((_returnReplacementOperator2931.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator2932.is("NULL")) ? ( null ) : ((comparator.compare(element, minimum)) == 0));
    }

    public boolean isEndedBy(final T element) {
        if (element == null) {
            return ((_returnReplacementOperator2926.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator2927.is("NULL")) ? ( null ) : ((comparator.compare(element, maximum)) == 0));
    }

    public boolean isBefore(final T element) {
        if (element == null) {
            return ((_returnReplacementOperator2922.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator2923.is("NULL")) ? ( null ) : ((comparator.compare(element, maximum)) > 0));
    }

    public int elementCompareTo(final T element) {
        if (element == null) {
            throw new java.lang.NullPointerException("Element is null");
        } 
        if (isAfter(element)) {
            return ((_returnReplacementOperator2933.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2933.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2933.is("ZERO")) ? ( 0 ) : (-1));
        } else if (isBefore(element)) {
            return ((_returnReplacementOperator2934.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2934.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2934.is("ZERO")) ? ( 0 ) : (1));
        } else {
            return ((_returnReplacementOperator2935.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2935.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2935.is("ZERO")) ? ( 0 ) : (0));
        }
    }

    public boolean containsRange(final org.apache.commons.lang3.Range<T> otherRange) {
        if (otherRange == null) {
            return ((_returnReplacementOperator2913.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator2914.is("NULL")) ? ( null ) : ((contains(otherRange.minimum)) && (contains(otherRange.maximum))));
    }

    public boolean isAfterRange(final org.apache.commons.lang3.Range<T> otherRange) {
        if (otherRange == null) {
            return ((_returnReplacementOperator2920.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator2921.is("NULL")) ? ( null ) : (isAfter(otherRange.maximum)));
    }

    public boolean isOverlappedBy(final org.apache.commons.lang3.Range<T> otherRange) {
        if (otherRange == null) {
            return ((_returnReplacementOperator2929.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator2930.is("NULL")) ? ( null ) : (((otherRange.contains(minimum)) || (otherRange.contains(maximum))) || (contains(otherRange.minimum))));
    }

    public boolean isBeforeRange(final org.apache.commons.lang3.Range<T> otherRange) {
        if (otherRange == null) {
            return ((_returnReplacementOperator2924.is("NULL")) ? ( null ) : (false));
        } 
        return ((_returnReplacementOperator2925.is("NULL")) ? ( null ) : (isBefore(otherRange.minimum)));
    }

    public org.apache.commons.lang3.Range<T> intersectionWith(final org.apache.commons.lang3.Range<T> other) {
        if (!(isOverlappedBy(other))) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot calculate intersection with non-overlapping range %s", other));
        } 
        if (equals(other)) {
            return ((_returnReplacementOperator2940.is("NULL")) ? ( null ) : (this));
        } 
        final T min = (getComparator().compare(minimum, other.minimum)) < 0 ? other.minimum : minimum;
        final T max = (getComparator().compare(maximum, other.maximum)) < 0 ? maximum : other.maximum;
        return ((_returnReplacementOperator2941.is("NULL")) ? ( null ) : (org.apache.commons.lang3.Range.between(min, max, getComparator())));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == (this)) {
            return ((_returnReplacementOperator2915.is("NULL")) ? ( null ) : (true));
        } else if ((obj == null) || ((obj.getClass()) != (getClass()))) {
            return ((_returnReplacementOperator2916.is("NULL")) ? ( null ) : (false));
        } else {
            @java.lang.SuppressWarnings(value = "unchecked")
            final org.apache.commons.lang3.Range<T> range = ((org.apache.commons.lang3.Range<T>)(obj));
            return ((_returnReplacementOperator2917.is("NULL")) ? ( null ) : ((minimum.equals(range.minimum)) && (maximum.equals(range.maximum))));
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
        return ((_returnReplacementOperator2936.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2936.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2936.is("ZERO")) ? ( 0 ) : (result));
    }

    @java.lang.Override
    public java.lang.String toString() {
        if ((toString) == null) {
            toString = ((("[" + (minimum)) + "..") + (maximum)) + "]";
        } 
        return ((_returnReplacementOperator2937.is("NULL")) ? ( null ) : (toString));
    }

    public java.lang.String toString(final java.lang.String format) {
        return ((_returnReplacementOperator2938.is("NULL")) ? ( null ) : (java.lang.String.format(format, minimum, maximum, comparator)));
    }

    @java.lang.SuppressWarnings(value = { "rawtypes" , "unchecked" })
    private enum ComparableComparator implements java.util.Comparator {
INSTANCE;
        @java.lang.Override
        public int compare(final java.lang.Object obj1, final java.lang.Object obj2) {
            return ((_returnReplacementOperator2904.is("INT_MIN")) ? ( -2147483647 ) : (_returnReplacementOperator2904.is("INT_MAX")) ? ( 2147483646 ) : (_returnReplacementOperator2904.is("ZERO")) ? ( 0 ) : (((java.lang.Comparable)(obj1)).compareTo(obj2)));
        }
    }

    private static final metamutator.Selector _returnReplacementOperator2904 = metamutator.Selector.of(2904,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).id("_returnReplacementOperator2904");

    private static final metamutator.Selector _returnReplacementOperator2905 = metamutator.Selector.of(2905,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2905");

    private static final metamutator.Selector _returnReplacementOperator2906 = metamutator.Selector.of(2906,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2906");

    private static final metamutator.Selector _returnReplacementOperator2907 = metamutator.Selector.of(2907,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2907");

    private static final metamutator.Selector _returnReplacementOperator2908 = metamutator.Selector.of(2908,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2908");

    private static final metamutator.Selector _returnReplacementOperator2909 = metamutator.Selector.of(2909,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2909");

    private static final metamutator.Selector _returnReplacementOperator2910 = metamutator.Selector.of(2910,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2910");

    private static final metamutator.Selector _returnReplacementOperator2911 = metamutator.Selector.of(2911,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2911");

    private static final metamutator.Selector _returnReplacementOperator2912 = metamutator.Selector.of(2912,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2912");

    private static final metamutator.Selector _returnReplacementOperator2913 = metamutator.Selector.of(2913,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2913");

    private static final metamutator.Selector _returnReplacementOperator2914 = metamutator.Selector.of(2914,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2914");

    private static final metamutator.Selector _returnReplacementOperator2915 = metamutator.Selector.of(2915,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2915");

    private static final metamutator.Selector _returnReplacementOperator2916 = metamutator.Selector.of(2916,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2916");

    private static final metamutator.Selector _returnReplacementOperator2917 = metamutator.Selector.of(2917,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2917");

    private static final metamutator.Selector _returnReplacementOperator2918 = metamutator.Selector.of(2918,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2918");

    private static final metamutator.Selector _returnReplacementOperator2919 = metamutator.Selector.of(2919,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2919");

    private static final metamutator.Selector _returnReplacementOperator2920 = metamutator.Selector.of(2920,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2920");

    private static final metamutator.Selector _returnReplacementOperator2921 = metamutator.Selector.of(2921,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2921");

    private static final metamutator.Selector _returnReplacementOperator2922 = metamutator.Selector.of(2922,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2922");

    private static final metamutator.Selector _returnReplacementOperator2923 = metamutator.Selector.of(2923,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2923");

    private static final metamutator.Selector _returnReplacementOperator2924 = metamutator.Selector.of(2924,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2924");

    private static final metamutator.Selector _returnReplacementOperator2925 = metamutator.Selector.of(2925,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2925");

    private static final metamutator.Selector _returnReplacementOperator2926 = metamutator.Selector.of(2926,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2926");

    private static final metamutator.Selector _returnReplacementOperator2927 = metamutator.Selector.of(2927,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2927");

    private static final metamutator.Selector _returnReplacementOperator2928 = metamutator.Selector.of(2928,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2928");

    private static final metamutator.Selector _returnReplacementOperator2929 = metamutator.Selector.of(2929,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2929");

    private static final metamutator.Selector _returnReplacementOperator2930 = metamutator.Selector.of(2930,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2930");

    private static final metamutator.Selector _returnReplacementOperator2931 = metamutator.Selector.of(2931,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2931");

    private static final metamutator.Selector _returnReplacementOperator2932 = metamutator.Selector.of(2932,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2932");

    private static final metamutator.Selector _returnReplacementOperator2933 = metamutator.Selector.of(2933,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2933");

    private static final metamutator.Selector _returnReplacementOperator2934 = metamutator.Selector.of(2934,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2934");

    private static final metamutator.Selector _returnReplacementOperator2935 = metamutator.Selector.of(2935,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2935");

    private static final metamutator.Selector _returnReplacementOperator2936 = metamutator.Selector.of(2936,new String[]{"INIT","INT_MIN","INT_MAX","ZERO"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2936");

    private static final metamutator.Selector _returnReplacementOperator2937 = metamutator.Selector.of(2937,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2937");

    private static final metamutator.Selector _returnReplacementOperator2938 = metamutator.Selector.of(2938,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2938");

    private static final metamutator.Selector _returnReplacementOperator2939 = metamutator.Selector.of(2939,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2939");

    private static final metamutator.Selector _returnReplacementOperator2940 = metamutator.Selector.of(2940,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2940");

    private static final metamutator.Selector _returnReplacementOperator2941 = metamutator.Selector.of(2941,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.Range.class).id("_returnReplacementOperator2941");
}

