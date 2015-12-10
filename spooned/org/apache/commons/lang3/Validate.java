package org.apache.commons.lang3;


public class Validate {
    private static final java.lang.String DEFAULT_EXCLUSIVE_BETWEEN_EX_MESSAGE = "The value %s is not in the specified exclusive range of %s to %s";

    private static final java.lang.String DEFAULT_INCLUSIVE_BETWEEN_EX_MESSAGE = "The value %s is not in the specified inclusive range of %s to %s";

    private static final java.lang.String DEFAULT_MATCHES_PATTERN_EX = "The string %s does not match the pattern %s";

    private static final java.lang.String DEFAULT_IS_NULL_EX_MESSAGE = "The validated object is null";

    private static final java.lang.String DEFAULT_IS_TRUE_EX_MESSAGE = "The validated expression is false";

    private static final java.lang.String DEFAULT_NO_NULL_ELEMENTS_ARRAY_EX_MESSAGE = "The validated array contains null element at index: %d";

    private static final java.lang.String DEFAULT_NO_NULL_ELEMENTS_COLLECTION_EX_MESSAGE = "The validated collection contains null element at index: %d";

    private static final java.lang.String DEFAULT_NOT_BLANK_EX_MESSAGE = "The validated character sequence is blank";

    private static final java.lang.String DEFAULT_NOT_EMPTY_ARRAY_EX_MESSAGE = "The validated array is empty";

    private static final java.lang.String DEFAULT_NOT_EMPTY_CHAR_SEQUENCE_EX_MESSAGE = "The validated character sequence is empty";

    private static final java.lang.String DEFAULT_NOT_EMPTY_COLLECTION_EX_MESSAGE = "The validated collection is empty";

    private static final java.lang.String DEFAULT_NOT_EMPTY_MAP_EX_MESSAGE = "The validated map is empty";

    private static final java.lang.String DEFAULT_VALID_INDEX_ARRAY_EX_MESSAGE = "The validated array index is invalid: %d";

    private static final java.lang.String DEFAULT_VALID_INDEX_CHAR_SEQUENCE_EX_MESSAGE = "The validated character sequence index is invalid: %d";

    private static final java.lang.String DEFAULT_VALID_INDEX_COLLECTION_EX_MESSAGE = "The validated collection index is invalid: %d";

    private static final java.lang.String DEFAULT_VALID_STATE_EX_MESSAGE = "The validated state is false";

    private static final java.lang.String DEFAULT_IS_ASSIGNABLE_EX_MESSAGE = "Cannot assign a %s to a %s";

    private static final java.lang.String DEFAULT_IS_INSTANCE_OF_EX_MESSAGE = "Expected type: %s, actual: %s";

    public Validate() {
        super();
    }

    public static void isTrue(final boolean expression, final java.lang.String message, final long value) {
        if (expression == false) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(message, java.lang.Long.valueOf(value)));
        } 
    }

    public static void isTrue(final boolean expression, final java.lang.String message, final double value) {
        if (expression == false) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(message, java.lang.Double.valueOf(value)));
        } 
    }

    public static void isTrue(final boolean expression, final java.lang.String message, final java.lang.Object... values) {
        if (expression == false) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
        } 
    }

    public static void isTrue(final boolean expression) {
        if (expression == false) {
            throw new java.lang.IllegalArgumentException(DEFAULT_IS_TRUE_EX_MESSAGE);
        } 
    }

    public static <T>T notNull(final T object) {
        return ((_returnReplacementOperatorHotSpot3531.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Validate.notNull(object, org.apache.commons.lang3.Validate.DEFAULT_IS_NULL_EX_MESSAGE)));
    }

    public static <T>T notNull(final T object, final java.lang.String message, final java.lang.Object... values) {
        if (object == null) {
            throw new java.lang.NullPointerException(java.lang.String.format(message, values));
        } 
        return ((_returnReplacementOperatorHotSpot3532.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (object));
    }

    public static <T>T[] notEmpty(final T[] array, final java.lang.String message, final java.lang.Object... values) {
        if (array == null) {
            throw new java.lang.NullPointerException(java.lang.String.format(message, values));
        } 
        if ((array.length) == 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
        } 
        return ((_returnReplacementOperatorHotSpot3536.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static <T>T[] notEmpty(final T[] array) {
        return ((_returnReplacementOperatorHotSpot3535.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Validate.notEmpty(array, org.apache.commons.lang3.Validate.DEFAULT_NOT_EMPTY_ARRAY_EX_MESSAGE)));
    }

    public static <T extends java.util.Collection<?>>T notEmpty(final T collection, final java.lang.String message, final java.lang.Object... values) {
        if (collection == null) {
            throw new java.lang.NullPointerException(java.lang.String.format(message, values));
        } 
        if (collection.isEmpty()) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
        } 
        return ((_returnReplacementOperatorHotSpot3526.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (collection));
    }

    public static <T extends java.util.Collection<?>>T notEmpty(final T collection) {
        return ((_returnReplacementOperatorHotSpot3525.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Validate.notEmpty(collection, org.apache.commons.lang3.Validate.DEFAULT_NOT_EMPTY_COLLECTION_EX_MESSAGE)));
    }

    public static <T extends java.util.Map<?, ?>>T notEmpty(final T map, final java.lang.String message, final java.lang.Object... values) {
        if (map == null) {
            throw new java.lang.NullPointerException(java.lang.String.format(message, values));
        } 
        if (map.isEmpty()) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
        } 
        return ((_returnReplacementOperatorHotSpot3530.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (map));
    }

    public static <T extends java.util.Map<?, ?>>T notEmpty(final T map) {
        return ((_returnReplacementOperatorHotSpot3529.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Validate.notEmpty(map, org.apache.commons.lang3.Validate.DEFAULT_NOT_EMPTY_MAP_EX_MESSAGE)));
    }

    public static <T extends java.lang.CharSequence>T notEmpty(final T chars, final java.lang.String message, final java.lang.Object... values) {
        if (chars == null) {
            throw new java.lang.NullPointerException(java.lang.String.format(message, values));
        } 
        if ((chars.length()) == 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
        } 
        return ((_returnReplacementOperatorHotSpot3520.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (chars));
    }

    public static <T extends java.lang.CharSequence>T notEmpty(final T chars) {
        return ((_returnReplacementOperatorHotSpot3519.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Validate.notEmpty(chars, org.apache.commons.lang3.Validate.DEFAULT_NOT_EMPTY_CHAR_SEQUENCE_EX_MESSAGE)));
    }

    public static <T extends java.lang.CharSequence>T notBlank(final T chars, final java.lang.String message, final java.lang.Object... values) {
        if (chars == null) {
            throw new java.lang.NullPointerException(java.lang.String.format(message, values));
        } 
        if (org.apache.commons.lang3.StringUtils.isBlank(chars)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
        } 
        return ((_returnReplacementOperatorHotSpot3518.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (chars));
    }

    public static <T extends java.lang.CharSequence>T notBlank(final T chars) {
        return ((_returnReplacementOperatorHotSpot3517.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Validate.notBlank(chars, org.apache.commons.lang3.Validate.DEFAULT_NOT_BLANK_EX_MESSAGE)));
    }

    public static <T>T[] noNullElements(final T[] array, final java.lang.String message, final java.lang.Object... values) {
        org.apache.commons.lang3.Validate.notNull(array);
        for (int i = 0 ; i < (array.length) ; i++) {
            if ((array[i]) == null) {
                final java.lang.Object[] values2 = org.apache.commons.lang3.ArrayUtils.add(values, java.lang.Integer.valueOf(i));
                throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values2));
            } 
        }
        return ((_returnReplacementOperatorHotSpot3534.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static <T>T[] noNullElements(final T[] array) {
        return ((_returnReplacementOperatorHotSpot3533.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Validate.noNullElements(array, org.apache.commons.lang3.Validate.DEFAULT_NO_NULL_ELEMENTS_ARRAY_EX_MESSAGE)));
    }

    public static <T extends java.lang.Iterable<?>>T noNullElements(final T iterable, final java.lang.String message, final java.lang.Object... values) {
        org.apache.commons.lang3.Validate.notNull(iterable);
        int i = 0;
        for (final java.util.Iterator<?> it = iterable.iterator() ; it.hasNext() ; i++) {
            if ((it.next()) == null) {
                final java.lang.Object[] values2 = org.apache.commons.lang3.ArrayUtils.addAll(values, java.lang.Integer.valueOf(i));
                throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values2));
            } 
        }
        return ((_returnReplacementOperatorHotSpot3524.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (iterable));
    }

    public static <T extends java.lang.Iterable<?>>T noNullElements(final T iterable) {
        return ((_returnReplacementOperatorHotSpot3523.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Validate.noNullElements(iterable, org.apache.commons.lang3.Validate.DEFAULT_NO_NULL_ELEMENTS_COLLECTION_EX_MESSAGE)));
    }

    public static <T>T[] validIndex(final T[] array, final int index, final java.lang.String message, final java.lang.Object... values) {
        org.apache.commons.lang3.Validate.notNull(array);
        if ((index < 0) || (index >= (array.length))) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.String.format(message, values));
        } 
        return ((_returnReplacementOperatorHotSpot3538.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (array));
    }

    public static <T>T[] validIndex(final T[] array, final int index) {
        return ((_returnReplacementOperatorHotSpot3537.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Validate.validIndex(array, index, org.apache.commons.lang3.Validate.DEFAULT_VALID_INDEX_ARRAY_EX_MESSAGE, java.lang.Integer.valueOf(index))));
    }

    public static <T extends java.util.Collection<?>>T validIndex(final T collection, final int index, final java.lang.String message, final java.lang.Object... values) {
        org.apache.commons.lang3.Validate.notNull(collection);
        if ((index < 0) || (index >= (collection.size()))) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.String.format(message, values));
        } 
        return ((_returnReplacementOperatorHotSpot3528.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (collection));
    }

    public static <T extends java.util.Collection<?>>T validIndex(final T collection, final int index) {
        return ((_returnReplacementOperatorHotSpot3527.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Validate.validIndex(collection, index, org.apache.commons.lang3.Validate.DEFAULT_VALID_INDEX_COLLECTION_EX_MESSAGE, java.lang.Integer.valueOf(index))));
    }

    public static <T extends java.lang.CharSequence>T validIndex(final T chars, final int index, final java.lang.String message, final java.lang.Object... values) {
        org.apache.commons.lang3.Validate.notNull(chars);
        if ((index < 0) || (index >= (chars.length()))) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.String.format(message, values));
        } 
        return ((_returnReplacementOperatorHotSpot3522.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (chars));
    }

    public static <T extends java.lang.CharSequence>T validIndex(final T chars, final int index) {
        return ((_returnReplacementOperatorHotSpot3521.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.Validate.validIndex(chars, index, org.apache.commons.lang3.Validate.DEFAULT_VALID_INDEX_CHAR_SEQUENCE_EX_MESSAGE, java.lang.Integer.valueOf(index))));
    }

    public static void validState(final boolean expression) {
        if (expression == false) {
            throw new java.lang.IllegalStateException(DEFAULT_VALID_STATE_EX_MESSAGE);
        } 
    }

    public static void validState(final boolean expression, final java.lang.String message, final java.lang.Object... values) {
        if (expression == false) {
            throw new java.lang.IllegalStateException(java.lang.String.format(message, values));
        } 
    }

    public static void matchesPattern(final java.lang.CharSequence input, final java.lang.String pattern) {
        if ((java.util.regex.Pattern.matches(pattern, input)) == false) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(DEFAULT_MATCHES_PATTERN_EX, input, pattern));
        } 
    }

    public static void matchesPattern(final java.lang.CharSequence input, final java.lang.String pattern, final java.lang.String message, final java.lang.Object... values) {
        if ((java.util.regex.Pattern.matches(pattern, input)) == false) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
        } 
    }

    public static <T>void inclusiveBetween(final T start, final T end, final java.lang.Comparable<T> value) {
        if (((value.compareTo(start)) < 0) || ((value.compareTo(end)) > 0)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(DEFAULT_INCLUSIVE_BETWEEN_EX_MESSAGE, value, start, end));
        } 
    }

    public static <T>void inclusiveBetween(final T start, final T end, final java.lang.Comparable<T> value, final java.lang.String message, final java.lang.Object... values) {
        if (((value.compareTo(start)) < 0) || ((value.compareTo(end)) > 0)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
        } 
    }

    @java.lang.SuppressWarnings(value = "boxing")
    public static void inclusiveBetween(final long start, final long end, final long value) {
        if ((value < start) || (value > end)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(DEFAULT_INCLUSIVE_BETWEEN_EX_MESSAGE, value, start, end));
        } 
    }

    public static void inclusiveBetween(final long start, final long end, final long value, final java.lang.String message) {
        if ((value < start) || (value > end)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(message));
        } 
    }

    @java.lang.SuppressWarnings(value = "boxing")
    public static void inclusiveBetween(final double start, final double end, final double value) {
        if ((value < start) || (value > end)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(DEFAULT_INCLUSIVE_BETWEEN_EX_MESSAGE, value, start, end));
        } 
    }

    public static void inclusiveBetween(final double start, final double end, final double value, final java.lang.String message) {
        if ((value < start) || (value > end)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(message));
        } 
    }

    public static <T>void exclusiveBetween(final T start, final T end, final java.lang.Comparable<T> value) {
        if (((value.compareTo(start)) <= 0) || ((value.compareTo(end)) >= 0)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(DEFAULT_EXCLUSIVE_BETWEEN_EX_MESSAGE, value, start, end));
        } 
    }

    public static <T>void exclusiveBetween(final T start, final T end, final java.lang.Comparable<T> value, final java.lang.String message, final java.lang.Object... values) {
        if (((value.compareTo(start)) <= 0) || ((value.compareTo(end)) >= 0)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
        } 
    }

    @java.lang.SuppressWarnings(value = "boxing")
    public static void exclusiveBetween(final long start, final long end, final long value) {
        if ((value <= start) || (value >= end)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(DEFAULT_EXCLUSIVE_BETWEEN_EX_MESSAGE, value, start, end));
        } 
    }

    public static void exclusiveBetween(final long start, final long end, final long value, final java.lang.String message) {
        if ((value <= start) || (value >= end)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(message));
        } 
    }

    @java.lang.SuppressWarnings(value = "boxing")
    public static void exclusiveBetween(final double start, final double end, final double value) {
        if ((value <= start) || (value >= end)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(DEFAULT_EXCLUSIVE_BETWEEN_EX_MESSAGE, value, start, end));
        } 
    }

    public static void exclusiveBetween(final double start, final double end, final double value, final java.lang.String message) {
        if ((value <= start) || (value >= end)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(message));
        } 
    }

    public static void isInstanceOf(final java.lang.Class<?> type, final java.lang.Object obj) {
        if ((type.isInstance(obj)) == false) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(DEFAULT_IS_INSTANCE_OF_EX_MESSAGE, type.getName(), (obj == null ? "null" : obj.getClass().getName())));
        } 
    }

    public static void isInstanceOf(final java.lang.Class<?> type, final java.lang.Object obj, final java.lang.String message, final java.lang.Object... values) {
        if ((type.isInstance(obj)) == false) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
        } 
    }

    public static void isAssignableFrom(final java.lang.Class<?> superType, final java.lang.Class<?> type) {
        if ((superType.isAssignableFrom(type)) == false) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(DEFAULT_IS_ASSIGNABLE_EX_MESSAGE, (type == null ? "null" : type.getName()), superType.getName()));
        } 
    }

    public static void isAssignableFrom(final java.lang.Class<?> superType, final java.lang.Class<?> type, final java.lang.String message, final java.lang.Object... values) {
        if ((superType.isAssignableFrom(type)) == false) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(message, values));
        } 
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3517 = metamutator.Selector.of(3517,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3517");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3518 = metamutator.Selector.of(3518,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3518");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3519 = metamutator.Selector.of(3519,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3519");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3520 = metamutator.Selector.of(3520,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3520");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3521 = metamutator.Selector.of(3521,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3521");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3522 = metamutator.Selector.of(3522,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3522");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3523 = metamutator.Selector.of(3523,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3523");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3524 = metamutator.Selector.of(3524,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3524");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3525 = metamutator.Selector.of(3525,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3525");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3526 = metamutator.Selector.of(3526,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3526");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3527 = metamutator.Selector.of(3527,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3527");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3528 = metamutator.Selector.of(3528,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3528");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3529 = metamutator.Selector.of(3529,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3529");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3530 = metamutator.Selector.of(3530,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3530");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3531 = metamutator.Selector.of(3531,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3531");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3532 = metamutator.Selector.of(3532,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3532");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3533 = metamutator.Selector.of(3533,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3533");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3534 = metamutator.Selector.of(3534,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3534");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3535 = metamutator.Selector.of(3535,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3535");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3536 = metamutator.Selector.of(3536,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3536");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3537 = metamutator.Selector.of(3537,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3537");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot3538 = metamutator.Selector.of(3538,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.Validate.class).id("_returnReplacementOperatorHotSpot3538");
}

