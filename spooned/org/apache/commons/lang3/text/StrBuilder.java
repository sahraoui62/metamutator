package org.apache.commons.lang3.text;


public class StrBuilder implements java.io.Serializable , java.lang.Appendable , java.lang.CharSequence , org.apache.commons.lang3.builder.Builder<java.lang.String> {
    static final int CAPACITY = 32;

    private static final long serialVersionUID = 7628716375283629643L;

    protected char[] buffer;

    protected int size;

    private java.lang.String newLine;

    private java.lang.String nullText;

    public StrBuilder() {
        this(CAPACITY);
    }

    public StrBuilder(int initialCapacity) {
        super();
        if (initialCapacity <= 0) {
            initialCapacity = CAPACITY;
        } 
        buffer = new char[initialCapacity];
    }

    public StrBuilder(final java.lang.String str) {
        super();
        if (str == null) {
            buffer = new char[CAPACITY];
        } else {
            buffer = new char[(str.length()) + (CAPACITY)];
            append(str);
        }
    }

    public java.lang.String getNewLineText() {
        return newLine;
    }

    public org.apache.commons.lang3.text.StrBuilder setNewLineText(final java.lang.String newLine) {
        this.newLine = newLine;
        return this;
    }

    public java.lang.String getNullText() {
        return nullText;
    }

    public org.apache.commons.lang3.text.StrBuilder setNullText(java.lang.String nullText) {
        if ((nullText != null) && (nullText.isEmpty())) {
            nullText = null;
        } 
        this.nullText = nullText;
        return this;
    }

    @java.lang.Override
    public int length() {
        return size;
    }

    public org.apache.commons.lang3.text.StrBuilder setLength(final int length) {
        if (length < 0) {
            throw new java.lang.StringIndexOutOfBoundsException(length);
        } 
        if (length < (size)) {
            size = length;
        } else if (length > (size)) {
            ensureCapacity(length);
            final int oldEnd = size;
            final int newEnd = length;
            size = length;
            for (int i = oldEnd ; i < newEnd ; i++) {
                buffer[i] = ' ';
            }
        } 
        return this;
    }

    public int capacity() {
        return buffer.length;
    }

    public org.apache.commons.lang3.text.StrBuilder ensureCapacity(final int capacity) {
        if (capacity > (buffer.length)) {
            final char[] old = buffer;
            buffer = new char[((_arithmeticOperatorHotSpot212.is("PLUS")) ? (capacity + 2) : (_arithmeticOperatorHotSpot212.is("MINUS")) ? (capacity - 2) : (_arithmeticOperatorHotSpot212.is("MUL")) ? (capacity * 2) :  (capacity / 2))];
            java.lang.System.arraycopy(old, 0, buffer, 0, size);
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder minimizeCapacity() {
        if ((buffer.length) > (length())) {
            final char[] old = buffer;
            buffer = new char[length()];
            java.lang.System.arraycopy(old, 0, buffer, 0, size);
        } 
        return this;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size) == 0;
    }

    public org.apache.commons.lang3.text.StrBuilder clear() {
        size = 0;
        return this;
    }

    @java.lang.Override
    public char charAt(final int index) {
        if ((index < 0) || (index >= (length()))) {
            throw new java.lang.StringIndexOutOfBoundsException(index);
        } 
        return buffer[index];
    }

    public org.apache.commons.lang3.text.StrBuilder setCharAt(final int index, final char ch) {
        if ((index < 0) || (index >= (length()))) {
            throw new java.lang.StringIndexOutOfBoundsException(index);
        } 
        buffer[index] = ch;
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder deleteCharAt(final int index) {
        if ((index < 0) || (index >= (size))) {
            throw new java.lang.StringIndexOutOfBoundsException(index);
        } 
        deleteImpl(index, ((_arithmeticOperatorHotSpot209.is("PLUS")) ? ((index + 1)) : (_arithmeticOperatorHotSpot209.is("MINUS")) ? ((index - 1)) : (_arithmeticOperatorHotSpot209.is("MUL")) ? ((index * 1)) :  ((index / 1))), 1);
        return this;
    }

    public char[] toCharArray() {
        if ((size) == 0) {
            return org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        } 
        final char[] chars = new char[size];
        java.lang.System.arraycopy(buffer, 0, chars, 0, size);
        return chars;
    }

    public char[] toCharArray(final int startIndex, int endIndex) {
        endIndex = validateRange(startIndex, endIndex);
        final int len = ((_arithmeticOperatorHotSpot145.is("PLUS")) ? (endIndex + startIndex) : (_arithmeticOperatorHotSpot145.is("MINUS")) ? (endIndex - startIndex) : (_arithmeticOperatorHotSpot145.is("MUL")) ? (endIndex * startIndex) :  (endIndex / startIndex));
        if (len == 0) {
            return org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        } 
        final char[] chars = new char[len];
        java.lang.System.arraycopy(buffer, startIndex, chars, 0, len);
        return chars;
    }

    public char[] getChars(char[] destination) {
        final int len = length();
        if ((destination == null) || ((destination.length) < len)) {
            destination = new char[len];
        } 
        java.lang.System.arraycopy(buffer, 0, destination, 0, len);
        return destination;
    }

    public void getChars(final int startIndex, final int endIndex, final char[] destination, final int destinationIndex) {
        if (startIndex < 0) {
            throw new java.lang.StringIndexOutOfBoundsException(startIndex);
        } 
        if ((endIndex < 0) || (endIndex > (length()))) {
            throw new java.lang.StringIndexOutOfBoundsException(endIndex);
        } 
        if (startIndex > endIndex) {
            throw new java.lang.StringIndexOutOfBoundsException("end < start");
        } 
        java.lang.System.arraycopy(buffer, startIndex, destination, destinationIndex, ((_arithmeticOperatorHotSpot243.is("PLUS")) ? ((endIndex + startIndex)) : (_arithmeticOperatorHotSpot243.is("MINUS")) ? ((endIndex - startIndex)) : (_arithmeticOperatorHotSpot243.is("MUL")) ? ((endIndex * startIndex)) :  ((endIndex / startIndex))));
    }

    public int readFrom(final java.lang.Readable readable) throws java.io.IOException {
        final int oldSize = size;
        if (readable instanceof java.io.Reader) {
            final java.io.Reader r = ((java.io.Reader)(readable));
            ensureCapacity(((_arithmeticOperatorHotSpot158.is("PLUS")) ? (((size) + 1)) : (_arithmeticOperatorHotSpot158.is("MINUS")) ? (((size) - 1)) : (_arithmeticOperatorHotSpot158.is("MUL")) ? (((size) * 1)) :  (((size) / 1))));
            int read;
            while ((read = r.read(buffer, size, ((_arithmeticOperatorHotSpot159.is("PLUS")) ? (((buffer.length) + (size))) : (_arithmeticOperatorHotSpot159.is("MINUS")) ? (((buffer.length) - (size))) : (_arithmeticOperatorHotSpot159.is("MUL")) ? (((buffer.length) * (size))) :  (((buffer.length) / (size)))))) != (-1)) {
                size += read;
                ensureCapacity(((_arithmeticOperatorHotSpot160.is("PLUS")) ? (((size) + 1)) : (_arithmeticOperatorHotSpot160.is("MINUS")) ? (((size) - 1)) : (_arithmeticOperatorHotSpot160.is("MUL")) ? (((size) * 1)) :  (((size) / 1))));
            }
        } else if (readable instanceof java.nio.CharBuffer) {
            final java.nio.CharBuffer cb = ((java.nio.CharBuffer)(readable));
            final int remaining = cb.remaining();
            ensureCapacity(((_arithmeticOperatorHotSpot161.is("PLUS")) ? (((size) + remaining)) : (_arithmeticOperatorHotSpot161.is("MINUS")) ? (((size) - remaining)) : (_arithmeticOperatorHotSpot161.is("MUL")) ? (((size) * remaining)) :  (((size) / remaining))));
            cb.get(buffer, size, remaining);
            size += remaining;
        } else {
            while (true) {
                ensureCapacity(((_arithmeticOperatorHotSpot162.is("PLUS")) ? (((size) + 1)) : (_arithmeticOperatorHotSpot162.is("MINUS")) ? (((size) - 1)) : (_arithmeticOperatorHotSpot162.is("MUL")) ? (((size) * 1)) :  (((size) / 1))));
                final java.nio.CharBuffer buf = java.nio.CharBuffer.wrap(buffer, size, ((_arithmeticOperatorHotSpot163.is("PLUS")) ? (((buffer.length) + (size))) : (_arithmeticOperatorHotSpot163.is("MINUS")) ? (((buffer.length) - (size))) : (_arithmeticOperatorHotSpot163.is("MUL")) ? (((buffer.length) * (size))) :  (((buffer.length) / (size)))));
                final int read = readable.read(buf);
                if (read == (-1)) {
                    break;
                } 
                size += read;
            }
        }
        return ((_arithmeticOperatorHotSpot164.is("PLUS")) ? ((size) + oldSize) : (_arithmeticOperatorHotSpot164.is("MINUS")) ? ((size) - oldSize) : (_arithmeticOperatorHotSpot164.is("MUL")) ? ((size) * oldSize) :  ((size) / oldSize));
    }

    public org.apache.commons.lang3.text.StrBuilder appendNewLine() {
        if ((newLine) == null) {
            append(org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR);
            return this;
        } 
        return append(newLine);
    }

    public org.apache.commons.lang3.text.StrBuilder appendNull() {
        if ((nullText) == null) {
            return this;
        } 
        return append(nullText);
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.Object obj) {
        if (obj == null) {
            return appendNull();
        } 
        if (obj instanceof java.lang.CharSequence) {
            return append(((java.lang.CharSequence)(obj)));
        } 
        return append(obj.toString());
    }

    @java.lang.Override
    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.CharSequence seq) {
        if (seq == null) {
            return appendNull();
        } 
        if (seq instanceof org.apache.commons.lang3.text.StrBuilder) {
            return append(((org.apache.commons.lang3.text.StrBuilder)(seq)));
        } 
        if (seq instanceof java.lang.StringBuilder) {
            return append(((java.lang.StringBuilder)(seq)));
        } 
        if (seq instanceof java.lang.StringBuffer) {
            return append(((java.lang.StringBuffer)(seq)));
        } 
        if (seq instanceof java.nio.CharBuffer) {
            return append(((java.nio.CharBuffer)(seq)));
        } 
        return append(seq.toString());
    }

    @java.lang.Override
    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.CharSequence seq, final int startIndex, final int length) {
        if (seq == null) {
            return appendNull();
        } 
        return append(seq.toString(), startIndex, length);
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.String str) {
        if (str == null) {
            return appendNull();
        } 
        final int strLen = str.length();
        if (strLen > 0) {
            final int len = length();
            ensureCapacity(((_arithmeticOperatorHotSpot176.is("PLUS")) ? ((len + strLen)) : (_arithmeticOperatorHotSpot176.is("MINUS")) ? ((len - strLen)) : (_arithmeticOperatorHotSpot176.is("MUL")) ? ((len * strLen)) :  ((len / strLen))));
            str.getChars(0, strLen, buffer, len);
            size += strLen;
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.String str, final int startIndex, final int length) {
        if (str == null) {
            return appendNull();
        } 
        if ((startIndex < 0) || (startIndex > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("startIndex must be valid");
        } 
        if ((length < 0) || (((_arithmeticOperatorHotSpot177.is("PLUS")) ? ((startIndex + length)) : (_arithmeticOperatorHotSpot177.is("MINUS")) ? ((startIndex - length)) : (_arithmeticOperatorHotSpot177.is("MUL")) ? ((startIndex * length)) :  ((startIndex / length))) > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("length must be valid");
        } 
        if (length > 0) {
            final int len = length();
            ensureCapacity(((_arithmeticOperatorHotSpot178.is("PLUS")) ? ((len + length)) : (_arithmeticOperatorHotSpot178.is("MINUS")) ? ((len - length)) : (_arithmeticOperatorHotSpot178.is("MUL")) ? ((len * length)) :  ((len / length))));
            str.getChars(startIndex, ((_arithmeticOperatorHotSpot179.is("PLUS")) ? ((startIndex + length)) : (_arithmeticOperatorHotSpot179.is("MINUS")) ? ((startIndex - length)) : (_arithmeticOperatorHotSpot179.is("MUL")) ? ((startIndex * length)) :  ((startIndex / length))), buffer, len);
            size += length;
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.String format, final java.lang.Object... objs) {
        return append(java.lang.String.format(format, objs));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.nio.CharBuffer buf) {
        if (buf == null) {
            return appendNull();
        } 
        if (buf.hasArray()) {
            final int length = buf.remaining();
            final int len = length();
            ensureCapacity(((_arithmeticOperatorHotSpot188.is("PLUS")) ? ((len + length)) : (_arithmeticOperatorHotSpot188.is("MINUS")) ? ((len - length)) : (_arithmeticOperatorHotSpot188.is("MUL")) ? ((len * length)) :  ((len / length))));
            java.lang.System.arraycopy(buf.array(), ((_arithmeticOperatorHotSpot189.is("PLUS")) ? (((buf.arrayOffset()) + (buf.position()))) : (_arithmeticOperatorHotSpot189.is("MINUS")) ? (((buf.arrayOffset()) - (buf.position()))) : (_arithmeticOperatorHotSpot189.is("MUL")) ? (((buf.arrayOffset()) * (buf.position()))) :  (((buf.arrayOffset()) / (buf.position())))), buffer, len, length);
            size += length;
        } else {
            append(buf.toString());
        }
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.nio.CharBuffer buf, final int startIndex, final int length) {
        if (buf == null) {
            return appendNull();
        } 
        if (buf.hasArray()) {
            final int totalLength = buf.remaining();
            if ((startIndex < 0) || (startIndex > totalLength)) {
                throw new java.lang.StringIndexOutOfBoundsException("startIndex must be valid");
            } 
            if ((length < 0) || (((_arithmeticOperatorHotSpot190.is("PLUS")) ? ((startIndex + length)) : (_arithmeticOperatorHotSpot190.is("MINUS")) ? ((startIndex - length)) : (_arithmeticOperatorHotSpot190.is("MUL")) ? ((startIndex * length)) :  ((startIndex / length))) > totalLength)) {
                throw new java.lang.StringIndexOutOfBoundsException("length must be valid");
            } 
            final int len = length();
            ensureCapacity(((_arithmeticOperatorHotSpot191.is("PLUS")) ? ((len + length)) : (_arithmeticOperatorHotSpot191.is("MINUS")) ? ((len - length)) : (_arithmeticOperatorHotSpot191.is("MUL")) ? ((len * length)) :  ((len / length))));
            java.lang.System.arraycopy(buf.array(), (((_arithmeticOperatorHotSpot192.is("PLUS")) ? (((buf.arrayOffset()) + (buf.position()))) : (_arithmeticOperatorHotSpot192.is("MINUS")) ? (((buf.arrayOffset()) - (buf.position()))) : (_arithmeticOperatorHotSpot192.is("MUL")) ? (((buf.arrayOffset()) * (buf.position()))) :  (((buf.arrayOffset()) / (buf.position())))) + startIndex), buffer, len, length);
            size += length;
        } else {
            append(buf.toString(), startIndex, length);
        }
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.StringBuffer str) {
        if (str == null) {
            return appendNull();
        } 
        final int strLen = str.length();
        if (strLen > 0) {
            final int len = length();
            ensureCapacity(((_arithmeticOperatorHotSpot180.is("PLUS")) ? ((len + strLen)) : (_arithmeticOperatorHotSpot180.is("MINUS")) ? ((len - strLen)) : (_arithmeticOperatorHotSpot180.is("MUL")) ? ((len * strLen)) :  ((len / strLen))));
            str.getChars(0, strLen, buffer, len);
            size += strLen;
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.StringBuffer str, final int startIndex, final int length) {
        if (str == null) {
            return appendNull();
        } 
        if ((startIndex < 0) || (startIndex > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("startIndex must be valid");
        } 
        if ((length < 0) || (((_arithmeticOperatorHotSpot181.is("PLUS")) ? ((startIndex + length)) : (_arithmeticOperatorHotSpot181.is("MINUS")) ? ((startIndex - length)) : (_arithmeticOperatorHotSpot181.is("MUL")) ? ((startIndex * length)) :  ((startIndex / length))) > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("length must be valid");
        } 
        if (length > 0) {
            final int len = length();
            ensureCapacity(((_arithmeticOperatorHotSpot182.is("PLUS")) ? ((len + length)) : (_arithmeticOperatorHotSpot182.is("MINUS")) ? ((len - length)) : (_arithmeticOperatorHotSpot182.is("MUL")) ? ((len * length)) :  ((len / length))));
            str.getChars(startIndex, ((_arithmeticOperatorHotSpot183.is("PLUS")) ? ((startIndex + length)) : (_arithmeticOperatorHotSpot183.is("MINUS")) ? ((startIndex - length)) : (_arithmeticOperatorHotSpot183.is("MUL")) ? ((startIndex * length)) :  ((startIndex / length))), buffer, len);
            size += length;
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.StringBuilder str) {
        if (str == null) {
            return appendNull();
        } 
        final int strLen = str.length();
        if (strLen > 0) {
            final int len = length();
            ensureCapacity(((_arithmeticOperatorHotSpot184.is("PLUS")) ? ((len + strLen)) : (_arithmeticOperatorHotSpot184.is("MINUS")) ? ((len - strLen)) : (_arithmeticOperatorHotSpot184.is("MUL")) ? ((len * strLen)) :  ((len / strLen))));
            str.getChars(0, strLen, buffer, len);
            size += strLen;
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.StringBuilder str, final int startIndex, final int length) {
        if (str == null) {
            return appendNull();
        } 
        if ((startIndex < 0) || (startIndex > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("startIndex must be valid");
        } 
        if ((length < 0) || (((_arithmeticOperatorHotSpot185.is("PLUS")) ? ((startIndex + length)) : (_arithmeticOperatorHotSpot185.is("MINUS")) ? ((startIndex - length)) : (_arithmeticOperatorHotSpot185.is("MUL")) ? ((startIndex * length)) :  ((startIndex / length))) > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("length must be valid");
        } 
        if (length > 0) {
            final int len = length();
            ensureCapacity(((_arithmeticOperatorHotSpot186.is("PLUS")) ? ((len + length)) : (_arithmeticOperatorHotSpot186.is("MINUS")) ? ((len - length)) : (_arithmeticOperatorHotSpot186.is("MUL")) ? ((len * length)) :  ((len / length))));
            str.getChars(startIndex, ((_arithmeticOperatorHotSpot187.is("PLUS")) ? ((startIndex + length)) : (_arithmeticOperatorHotSpot187.is("MINUS")) ? ((startIndex - length)) : (_arithmeticOperatorHotSpot187.is("MUL")) ? ((startIndex * length)) :  ((startIndex / length))), buffer, len);
            size += length;
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder append(final org.apache.commons.lang3.text.StrBuilder str) {
        if (str == null) {
            return appendNull();
        } 
        final int strLen = str.length();
        if (strLen > 0) {
            final int len = length();
            ensureCapacity(((_arithmeticOperatorHotSpot193.is("PLUS")) ? ((len + strLen)) : (_arithmeticOperatorHotSpot193.is("MINUS")) ? ((len - strLen)) : (_arithmeticOperatorHotSpot193.is("MUL")) ? ((len * strLen)) :  ((len / strLen))));
            java.lang.System.arraycopy(str.buffer, 0, buffer, len, strLen);
            size += strLen;
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder append(final org.apache.commons.lang3.text.StrBuilder str, final int startIndex, final int length) {
        if (str == null) {
            return appendNull();
        } 
        if ((startIndex < 0) || (startIndex > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("startIndex must be valid");
        } 
        if ((length < 0) || (((_arithmeticOperatorHotSpot194.is("PLUS")) ? ((startIndex + length)) : (_arithmeticOperatorHotSpot194.is("MINUS")) ? ((startIndex - length)) : (_arithmeticOperatorHotSpot194.is("MUL")) ? ((startIndex * length)) :  ((startIndex / length))) > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("length must be valid");
        } 
        if (length > 0) {
            final int len = length();
            ensureCapacity(((_arithmeticOperatorHotSpot195.is("PLUS")) ? ((len + length)) : (_arithmeticOperatorHotSpot195.is("MINUS")) ? ((len - length)) : (_arithmeticOperatorHotSpot195.is("MUL")) ? ((len * length)) :  ((len / length))));
            str.getChars(startIndex, ((_arithmeticOperatorHotSpot196.is("PLUS")) ? ((startIndex + length)) : (_arithmeticOperatorHotSpot196.is("MINUS")) ? ((startIndex - length)) : (_arithmeticOperatorHotSpot196.is("MUL")) ? ((startIndex * length)) :  ((startIndex / length))), buffer, len);
            size += length;
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder append(final char[] chars) {
        if (chars == null) {
            return appendNull();
        } 
        final int strLen = chars.length;
        if (strLen > 0) {
            final int len = length();
            ensureCapacity(((_arithmeticOperatorHotSpot173.is("PLUS")) ? ((len + strLen)) : (_arithmeticOperatorHotSpot173.is("MINUS")) ? ((len - strLen)) : (_arithmeticOperatorHotSpot173.is("MUL")) ? ((len * strLen)) :  ((len / strLen))));
            java.lang.System.arraycopy(chars, 0, buffer, len, strLen);
            size += strLen;
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder append(final char[] chars, final int startIndex, final int length) {
        if (chars == null) {
            return appendNull();
        } 
        if ((startIndex < 0) || (startIndex > (chars.length))) {
            throw new java.lang.StringIndexOutOfBoundsException(("Invalid startIndex: " + length));
        } 
        if ((length < 0) || (((_arithmeticOperatorHotSpot174.is("PLUS")) ? ((startIndex + length)) : (_arithmeticOperatorHotSpot174.is("MINUS")) ? ((startIndex - length)) : (_arithmeticOperatorHotSpot174.is("MUL")) ? ((startIndex * length)) :  ((startIndex / length))) > (chars.length))) {
            throw new java.lang.StringIndexOutOfBoundsException(("Invalid length: " + length));
        } 
        if (length > 0) {
            final int len = length();
            ensureCapacity(((_arithmeticOperatorHotSpot175.is("PLUS")) ? ((len + length)) : (_arithmeticOperatorHotSpot175.is("MINUS")) ? ((len - length)) : (_arithmeticOperatorHotSpot175.is("MUL")) ? ((len * length)) :  ((len / length))));
            java.lang.System.arraycopy(chars, startIndex, buffer, len, length);
            size += length;
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder append(final boolean value) {
        if (value) {
            ensureCapacity(((_arithmeticOperatorHotSpot170.is("PLUS")) ? (((size) + 4)) : (_arithmeticOperatorHotSpot170.is("MINUS")) ? (((size) - 4)) : (_arithmeticOperatorHotSpot170.is("MUL")) ? (((size) * 4)) :  (((size) / 4))));
            buffer[(size)++] = 't';
            buffer[(size)++] = 'r';
            buffer[(size)++] = 'u';
            buffer[(size)++] = 'e';
        } else {
            ensureCapacity(((_arithmeticOperatorHotSpot171.is("PLUS")) ? (((size) + 5)) : (_arithmeticOperatorHotSpot171.is("MINUS")) ? (((size) - 5)) : (_arithmeticOperatorHotSpot171.is("MUL")) ? (((size) * 5)) :  (((size) / 5))));
            buffer[(size)++] = 'f';
            buffer[(size)++] = 'a';
            buffer[(size)++] = 'l';
            buffer[(size)++] = 's';
            buffer[(size)++] = 'e';
        }
        return this;
    }

    @java.lang.Override
    public org.apache.commons.lang3.text.StrBuilder append(final char ch) {
        final int len = length();
        ensureCapacity(((_arithmeticOperatorHotSpot172.is("PLUS")) ? ((len + 1)) : (_arithmeticOperatorHotSpot172.is("MINUS")) ? ((len - 1)) : (_arithmeticOperatorHotSpot172.is("MUL")) ? ((len * 1)) :  ((len / 1))));
        buffer[(size)++] = ch;
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder append(final int value) {
        return append(java.lang.String.valueOf(value));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final long value) {
        return append(java.lang.String.valueOf(value));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final float value) {
        return append(java.lang.String.valueOf(value));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final double value) {
        return append(java.lang.String.valueOf(value));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.Object obj) {
        return append(obj).appendNewLine();
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.String str) {
        return append(str).appendNewLine();
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.String str, final int startIndex, final int length) {
        return append(str, startIndex, length).appendNewLine();
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.String format, final java.lang.Object... objs) {
        return append(format, objs).appendNewLine();
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.StringBuffer str) {
        return append(str).appendNewLine();
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.StringBuilder str) {
        return append(str).appendNewLine();
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.StringBuilder str, final int startIndex, final int length) {
        return append(str, startIndex, length).appendNewLine();
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.StringBuffer str, final int startIndex, final int length) {
        return append(str, startIndex, length).appendNewLine();
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final org.apache.commons.lang3.text.StrBuilder str) {
        return append(str).appendNewLine();
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final org.apache.commons.lang3.text.StrBuilder str, final int startIndex, final int length) {
        return append(str, startIndex, length).appendNewLine();
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final char[] chars) {
        return append(chars).appendNewLine();
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final char[] chars, final int startIndex, final int length) {
        return append(chars, startIndex, length).appendNewLine();
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final boolean value) {
        return append(value).appendNewLine();
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final char ch) {
        return append(ch).appendNewLine();
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final int value) {
        return append(value).appendNewLine();
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final long value) {
        return append(value).appendNewLine();
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final float value) {
        return append(value).appendNewLine();
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final double value) {
        return append(value).appendNewLine();
    }

    public <T>org.apache.commons.lang3.text.StrBuilder appendAll(final T... array) {
        if ((array != null) && ((array.length) > 0)) {
            for (final java.lang.Object element : array) {
                append(element);
            }
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder appendAll(final java.lang.Iterable<?> iterable) {
        if (iterable != null) {
            for (final java.lang.Object o : iterable) {
                append(o);
            }
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder appendAll(final java.util.Iterator<?> it) {
        if (it != null) {
            while (it.hasNext()) {
                append(it.next());
            }
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder appendWithSeparators(final java.lang.Object[] array, final java.lang.String separator) {
        if ((array != null) && ((array.length) > 0)) {
            @java.lang.SuppressWarnings(value = "deprecation")
            final java.lang.String sep = org.apache.commons.lang3.ObjectUtils.toString(separator);
            append(array[0]);
            for (int i = 1 ; i < (array.length) ; i++) {
                append(sep);
                append(array[i]);
            }
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder appendWithSeparators(final java.lang.Iterable<?> iterable, final java.lang.String separator) {
        if (iterable != null) {
            @java.lang.SuppressWarnings(value = "deprecation")
            final java.lang.String sep = org.apache.commons.lang3.ObjectUtils.toString(separator);
            final java.util.Iterator<?> it = iterable.iterator();
            while (it.hasNext()) {
                append(it.next());
                if (it.hasNext()) {
                    append(sep);
                } 
            }
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder appendWithSeparators(final java.util.Iterator<?> it, final java.lang.String separator) {
        if (it != null) {
            @java.lang.SuppressWarnings(value = "deprecation")
            final java.lang.String sep = org.apache.commons.lang3.ObjectUtils.toString(separator);
            while (it.hasNext()) {
                append(it.next());
                if (it.hasNext()) {
                    append(sep);
                } 
            }
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(final java.lang.String separator) {
        return appendSeparator(separator, null);
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(final java.lang.String standard, final java.lang.String defaultIfEmpty) {
        final java.lang.String str = isEmpty() ? defaultIfEmpty : standard;
        if (str != null) {
            append(str);
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(final char separator) {
        if ((size()) > 0) {
            append(separator);
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(final char standard, final char defaultIfEmpty) {
        if ((size()) > 0) {
            append(standard);
        } else {
            append(defaultIfEmpty);
        }
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(final java.lang.String separator, final int loopIndex) {
        if ((separator != null) && (loopIndex > 0)) {
            append(separator);
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(final char separator, final int loopIndex) {
        if (loopIndex > 0) {
            append(separator);
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder appendPadding(final int length, final char padChar) {
        if (length >= 0) {
            ensureCapacity(((_arithmeticOperatorHotSpot205.is("PLUS")) ? (((size) + length)) : (_arithmeticOperatorHotSpot205.is("MINUS")) ? (((size) - length)) : (_arithmeticOperatorHotSpot205.is("MUL")) ? (((size) * length)) :  (((size) / length))));
            for (int i = 0 ; i < length ; i++) {
                buffer[(size)++] = padChar;
            }
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder appendFixedWidthPadLeft(final java.lang.Object obj, final int width, final char padChar) {
        if (width > 0) {
            ensureCapacity(((_arithmeticOperatorHotSpot197.is("PLUS")) ? (((size) + width)) : (_arithmeticOperatorHotSpot197.is("MINUS")) ? (((size) - width)) : (_arithmeticOperatorHotSpot197.is("MUL")) ? (((size) * width)) :  (((size) / width))));
            java.lang.String str = obj == null ? getNullText() : obj.toString();
            if (str == null) {
                str = "";
            } 
            final int strLen = str.length();
            if (strLen >= width) {
                str.getChars(((_arithmeticOperatorHotSpot198.is("PLUS")) ? ((strLen + width)) : (_arithmeticOperatorHotSpot198.is("MINUS")) ? ((strLen - width)) : (_arithmeticOperatorHotSpot198.is("MUL")) ? ((strLen * width)) :  ((strLen / width))), strLen, buffer, size);
            } else {
                final int padLen = ((_arithmeticOperatorHotSpot199.is("PLUS")) ? (width + strLen) : (_arithmeticOperatorHotSpot199.is("MINUS")) ? (width - strLen) : (_arithmeticOperatorHotSpot199.is("MUL")) ? (width * strLen) :  (width / strLen));
                for (int i = 0 ; i < padLen ; i++) {
                    buffer[((_arithmeticOperatorHotSpot200.is("PLUS")) ? (((size) + i)) : (_arithmeticOperatorHotSpot200.is("MINUS")) ? (((size) - i)) : (_arithmeticOperatorHotSpot200.is("MUL")) ? (((size) * i)) :  (((size) / i)))] = padChar;
                }
                str.getChars(0, strLen, buffer, ((_arithmeticOperatorHotSpot201.is("PLUS")) ? (((size) + padLen)) : (_arithmeticOperatorHotSpot201.is("MINUS")) ? (((size) - padLen)) : (_arithmeticOperatorHotSpot201.is("MUL")) ? (((size) * padLen)) :  (((size) / padLen))));
            }
            size += width;
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder appendFixedWidthPadLeft(final int value, final int width, final char padChar) {
        return appendFixedWidthPadLeft(java.lang.String.valueOf(value), width, padChar);
    }

    public org.apache.commons.lang3.text.StrBuilder appendFixedWidthPadRight(final java.lang.Object obj, final int width, final char padChar) {
        if (width > 0) {
            ensureCapacity(((_arithmeticOperatorHotSpot202.is("PLUS")) ? (((size) + width)) : (_arithmeticOperatorHotSpot202.is("MINUS")) ? (((size) - width)) : (_arithmeticOperatorHotSpot202.is("MUL")) ? (((size) * width)) :  (((size) / width))));
            java.lang.String str = obj == null ? getNullText() : obj.toString();
            if (str == null) {
                str = "";
            } 
            final int strLen = str.length();
            if (strLen >= width) {
                str.getChars(0, width, buffer, size);
            } else {
                final int padLen = ((_arithmeticOperatorHotSpot203.is("PLUS")) ? (width + strLen) : (_arithmeticOperatorHotSpot203.is("MINUS")) ? (width - strLen) : (_arithmeticOperatorHotSpot203.is("MUL")) ? (width * strLen) :  (width / strLen));
                str.getChars(0, strLen, buffer, size);
                for (int i = 0 ; i < padLen ; i++) {
                    buffer[(((_arithmeticOperatorHotSpot204.is("PLUS")) ? (((size) + strLen)) : (_arithmeticOperatorHotSpot204.is("MINUS")) ? (((size) - strLen)) : (_arithmeticOperatorHotSpot204.is("MUL")) ? (((size) * strLen)) :  (((size) / strLen))) + i)] = padChar;
                }
            }
            size += width;
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder appendFixedWidthPadRight(final int value, final int width, final char padChar) {
        return appendFixedWidthPadRight(java.lang.String.valueOf(value), width, padChar);
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final java.lang.Object obj) {
        if (obj == null) {
            return insert(index, nullText);
        } 
        return insert(index, obj.toString());
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, java.lang.String str) {
        validateIndex(index);
        if (str == null) {
            str = nullText;
        } 
        if (str != null) {
            final int strLen = str.length();
            if (strLen > 0) {
                final int newSize = ((_arithmeticOperatorHotSpot229.is("PLUS")) ? ((size) + strLen) : (_arithmeticOperatorHotSpot229.is("MINUS")) ? ((size) - strLen) : (_arithmeticOperatorHotSpot229.is("MUL")) ? ((size) * strLen) :  ((size) / strLen));
                ensureCapacity(newSize);
                java.lang.System.arraycopy(buffer, index, buffer, ((_arithmeticOperatorHotSpot230.is("PLUS")) ? ((index + strLen)) : (_arithmeticOperatorHotSpot230.is("MINUS")) ? ((index - strLen)) : (_arithmeticOperatorHotSpot230.is("MUL")) ? ((index * strLen)) :  ((index / strLen))), ((_arithmeticOperatorHotSpot231.is("PLUS")) ? (((size) + index)) : (_arithmeticOperatorHotSpot231.is("MINUS")) ? (((size) - index)) : (_arithmeticOperatorHotSpot231.is("MUL")) ? (((size) * index)) :  (((size) / index))));
                size = newSize;
                str.getChars(0, strLen, buffer, index);
            } 
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final char[] chars) {
        validateIndex(index);
        if (chars == null) {
            return insert(index, nullText);
        } 
        final int len = chars.length;
        if (len > 0) {
            ensureCapacity(((_arithmeticOperatorHotSpot222.is("PLUS")) ? (((size) + len)) : (_arithmeticOperatorHotSpot222.is("MINUS")) ? (((size) - len)) : (_arithmeticOperatorHotSpot222.is("MUL")) ? (((size) * len)) :  (((size) / len))));
            java.lang.System.arraycopy(buffer, index, buffer, ((_arithmeticOperatorHotSpot223.is("PLUS")) ? ((index + len)) : (_arithmeticOperatorHotSpot223.is("MINUS")) ? ((index - len)) : (_arithmeticOperatorHotSpot223.is("MUL")) ? ((index * len)) :  ((index / len))), ((_arithmeticOperatorHotSpot224.is("PLUS")) ? (((size) + index)) : (_arithmeticOperatorHotSpot224.is("MINUS")) ? (((size) - index)) : (_arithmeticOperatorHotSpot224.is("MUL")) ? (((size) * index)) :  (((size) / index))));
            java.lang.System.arraycopy(chars, 0, buffer, index, len);
            size += len;
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final char[] chars, final int offset, final int length) {
        validateIndex(index);
        if (chars == null) {
            return insert(index, nullText);
        } 
        if ((offset < 0) || (offset > (chars.length))) {
            throw new java.lang.StringIndexOutOfBoundsException(("Invalid offset: " + offset));
        } 
        if ((length < 0) || (((_arithmeticOperatorHotSpot225.is("PLUS")) ? ((offset + length)) : (_arithmeticOperatorHotSpot225.is("MINUS")) ? ((offset - length)) : (_arithmeticOperatorHotSpot225.is("MUL")) ? ((offset * length)) :  ((offset / length))) > (chars.length))) {
            throw new java.lang.StringIndexOutOfBoundsException(("Invalid length: " + length));
        } 
        if (length > 0) {
            ensureCapacity(((_arithmeticOperatorHotSpot226.is("PLUS")) ? (((size) + length)) : (_arithmeticOperatorHotSpot226.is("MINUS")) ? (((size) - length)) : (_arithmeticOperatorHotSpot226.is("MUL")) ? (((size) * length)) :  (((size) / length))));
            java.lang.System.arraycopy(buffer, index, buffer, ((_arithmeticOperatorHotSpot227.is("PLUS")) ? ((index + length)) : (_arithmeticOperatorHotSpot227.is("MINUS")) ? ((index - length)) : (_arithmeticOperatorHotSpot227.is("MUL")) ? ((index * length)) :  ((index / length))), ((_arithmeticOperatorHotSpot228.is("PLUS")) ? (((size) + index)) : (_arithmeticOperatorHotSpot228.is("MINUS")) ? (((size) - index)) : (_arithmeticOperatorHotSpot228.is("MUL")) ? (((size) * index)) :  (((size) / index))));
            java.lang.System.arraycopy(chars, offset, buffer, index, length);
            size += length;
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder insert(int index, final boolean value) {
        validateIndex(index);
        if (value) {
            ensureCapacity(((_arithmeticOperatorHotSpot213.is("PLUS")) ? (((size) + 4)) : (_arithmeticOperatorHotSpot213.is("MINUS")) ? (((size) - 4)) : (_arithmeticOperatorHotSpot213.is("MUL")) ? (((size) * 4)) :  (((size) / 4))));
            java.lang.System.arraycopy(buffer, index, buffer, ((_arithmeticOperatorHotSpot214.is("PLUS")) ? ((index + 4)) : (_arithmeticOperatorHotSpot214.is("MINUS")) ? ((index - 4)) : (_arithmeticOperatorHotSpot214.is("MUL")) ? ((index * 4)) :  ((index / 4))), ((_arithmeticOperatorHotSpot215.is("PLUS")) ? (((size) + index)) : (_arithmeticOperatorHotSpot215.is("MINUS")) ? (((size) - index)) : (_arithmeticOperatorHotSpot215.is("MUL")) ? (((size) * index)) :  (((size) / index))));
            buffer[index++] = 't';
            buffer[index++] = 'r';
            buffer[index++] = 'u';
            buffer[index] = 'e';
            size += 4;
        } else {
            ensureCapacity(((_arithmeticOperatorHotSpot216.is("PLUS")) ? (((size) + 5)) : (_arithmeticOperatorHotSpot216.is("MINUS")) ? (((size) - 5)) : (_arithmeticOperatorHotSpot216.is("MUL")) ? (((size) * 5)) :  (((size) / 5))));
            java.lang.System.arraycopy(buffer, index, buffer, ((_arithmeticOperatorHotSpot217.is("PLUS")) ? ((index + 5)) : (_arithmeticOperatorHotSpot217.is("MINUS")) ? ((index - 5)) : (_arithmeticOperatorHotSpot217.is("MUL")) ? ((index * 5)) :  ((index / 5))), ((_arithmeticOperatorHotSpot218.is("PLUS")) ? (((size) + index)) : (_arithmeticOperatorHotSpot218.is("MINUS")) ? (((size) - index)) : (_arithmeticOperatorHotSpot218.is("MUL")) ? (((size) * index)) :  (((size) / index))));
            buffer[index++] = 'f';
            buffer[index++] = 'a';
            buffer[index++] = 'l';
            buffer[index++] = 's';
            buffer[index] = 'e';
            size += 5;
        }
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final char value) {
        validateIndex(index);
        ensureCapacity(((_arithmeticOperatorHotSpot219.is("PLUS")) ? (((size) + 1)) : (_arithmeticOperatorHotSpot219.is("MINUS")) ? (((size) - 1)) : (_arithmeticOperatorHotSpot219.is("MUL")) ? (((size) * 1)) :  (((size) / 1))));
        java.lang.System.arraycopy(buffer, index, buffer, ((_arithmeticOperatorHotSpot220.is("PLUS")) ? ((index + 1)) : (_arithmeticOperatorHotSpot220.is("MINUS")) ? ((index - 1)) : (_arithmeticOperatorHotSpot220.is("MUL")) ? ((index * 1)) :  ((index / 1))), ((_arithmeticOperatorHotSpot221.is("PLUS")) ? (((size) + index)) : (_arithmeticOperatorHotSpot221.is("MINUS")) ? (((size) - index)) : (_arithmeticOperatorHotSpot221.is("MUL")) ? (((size) * index)) :  (((size) / index))));
        buffer[index] = value;
        (size)++;
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final int value) {
        return insert(index, java.lang.String.valueOf(value));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final long value) {
        return insert(index, java.lang.String.valueOf(value));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final float value) {
        return insert(index, java.lang.String.valueOf(value));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final double value) {
        return insert(index, java.lang.String.valueOf(value));
    }

    private void deleteImpl(final int startIndex, final int endIndex, final int len) {
        java.lang.System.arraycopy(buffer, endIndex, buffer, startIndex, ((_arithmeticOperatorHotSpot242.is("PLUS")) ? (((size) + endIndex)) : (_arithmeticOperatorHotSpot242.is("MINUS")) ? (((size) - endIndex)) : (_arithmeticOperatorHotSpot242.is("MUL")) ? (((size) * endIndex)) :  (((size) / endIndex))));
        size -= len;
    }

    public org.apache.commons.lang3.text.StrBuilder delete(final int startIndex, int endIndex) {
        endIndex = validateRange(startIndex, endIndex);
        final int len = ((_arithmeticOperatorHotSpot206.is("PLUS")) ? (endIndex + startIndex) : (_arithmeticOperatorHotSpot206.is("MINUS")) ? (endIndex - startIndex) : (_arithmeticOperatorHotSpot206.is("MUL")) ? (endIndex * startIndex) :  (endIndex / startIndex));
        if (len > 0) {
            deleteImpl(startIndex, endIndex, len);
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder deleteAll(final char ch) {
        for (int i = 0 ; i < (size) ; i++) {
            if ((buffer[i]) == ch) {
                final int start = i;
                while ((++i) < (size)) {
                    if ((buffer[i]) != ch) {
                        break;
                    } 
                }
                final int len = ((_arithmeticOperatorHotSpot207.is("PLUS")) ? (i + start) : (_arithmeticOperatorHotSpot207.is("MINUS")) ? (i - start) : (_arithmeticOperatorHotSpot207.is("MUL")) ? (i * start) :  (i / start));
                deleteImpl(start, i, len);
                i -= len;
            } 
        }
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder deleteFirst(final char ch) {
        for (int i = 0 ; i < (size) ; i++) {
            if ((buffer[i]) == ch) {
                deleteImpl(i, ((_arithmeticOperatorHotSpot210.is("PLUS")) ? ((i + 1)) : (_arithmeticOperatorHotSpot210.is("MINUS")) ? ((i - 1)) : (_arithmeticOperatorHotSpot210.is("MUL")) ? ((i * 1)) :  ((i / 1))), 1);
                break;
            } 
        }
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder deleteAll(final java.lang.String str) {
        final int len = str == null ? 0 : str.length();
        if (len > 0) {
            int index = indexOf(str, 0);
            while (index >= 0) {
                deleteImpl(index, ((_arithmeticOperatorHotSpot208.is("PLUS")) ? ((index + len)) : (_arithmeticOperatorHotSpot208.is("MINUS")) ? ((index - len)) : (_arithmeticOperatorHotSpot208.is("MUL")) ? ((index * len)) :  ((index / len))), len);
                index = indexOf(str, index);
            }
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder deleteFirst(final java.lang.String str) {
        final int len = str == null ? 0 : str.length();
        if (len > 0) {
            final int index = indexOf(str, 0);
            if (index >= 0) {
                deleteImpl(index, ((_arithmeticOperatorHotSpot211.is("PLUS")) ? ((index + len)) : (_arithmeticOperatorHotSpot211.is("MINUS")) ? ((index - len)) : (_arithmeticOperatorHotSpot211.is("MUL")) ? ((index * len)) :  ((index / len))), len);
            } 
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder deleteAll(final org.apache.commons.lang3.text.StrMatcher matcher) {
        return replace(matcher, null, 0, size, -1);
    }

    public org.apache.commons.lang3.text.StrBuilder deleteFirst(final org.apache.commons.lang3.text.StrMatcher matcher) {
        return replace(matcher, null, 0, size, 1);
    }

    private void replaceImpl(final int startIndex, final int endIndex, final int removeLen, final java.lang.String insertStr, final int insertLen) {
        final int newSize = ((_arithmeticOperatorHotSpot244.is("PLUS")) ? (((size) + removeLen)) : (_arithmeticOperatorHotSpot244.is("MINUS")) ? (((size) - removeLen)) : (_arithmeticOperatorHotSpot244.is("MUL")) ? (((size) * removeLen)) :  (((size) / removeLen))) + insertLen;
        if (insertLen != removeLen) {
            ensureCapacity(newSize);
            java.lang.System.arraycopy(buffer, endIndex, buffer, ((_arithmeticOperatorHotSpot245.is("PLUS")) ? ((startIndex + insertLen)) : (_arithmeticOperatorHotSpot245.is("MINUS")) ? ((startIndex - insertLen)) : (_arithmeticOperatorHotSpot245.is("MUL")) ? ((startIndex * insertLen)) :  ((startIndex / insertLen))), ((_arithmeticOperatorHotSpot246.is("PLUS")) ? (((size) + endIndex)) : (_arithmeticOperatorHotSpot246.is("MINUS")) ? (((size) - endIndex)) : (_arithmeticOperatorHotSpot246.is("MUL")) ? (((size) * endIndex)) :  (((size) / endIndex))));
            size = newSize;
        } 
        if (insertLen > 0) {
            insertStr.getChars(0, insertLen, buffer, startIndex);
        } 
    }

    public org.apache.commons.lang3.text.StrBuilder replace(final int startIndex, int endIndex, final java.lang.String replaceStr) {
        endIndex = validateRange(startIndex, endIndex);
        final int insertLen = replaceStr == null ? 0 : replaceStr.length();
        replaceImpl(startIndex, endIndex, ((_arithmeticOperatorHotSpot232.is("PLUS")) ? ((endIndex + startIndex)) : (_arithmeticOperatorHotSpot232.is("MINUS")) ? ((endIndex - startIndex)) : (_arithmeticOperatorHotSpot232.is("MUL")) ? ((endIndex * startIndex)) :  ((endIndex / startIndex))), replaceStr, insertLen);
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder replaceAll(final char search, final char replace) {
        if (search != replace) {
            for (int i = 0 ; i < (size) ; i++) {
                if ((buffer[i]) == search) {
                    buffer[i] = replace;
                } 
            }
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder replaceFirst(final char search, final char replace) {
        if (search != replace) {
            for (int i = 0 ; i < (size) ; i++) {
                if ((buffer[i]) == search) {
                    buffer[i] = replace;
                    break;
                } 
            }
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder replaceAll(final java.lang.String searchStr, final java.lang.String replaceStr) {
        final int searchLen = searchStr == null ? 0 : searchStr.length();
        if (searchLen > 0) {
            final int replaceLen = replaceStr == null ? 0 : replaceStr.length();
            int index = indexOf(searchStr, 0);
            while (index >= 0) {
                replaceImpl(index, ((_arithmeticOperatorHotSpot233.is("PLUS")) ? ((index + searchLen)) : (_arithmeticOperatorHotSpot233.is("MINUS")) ? ((index - searchLen)) : (_arithmeticOperatorHotSpot233.is("MUL")) ? ((index * searchLen)) :  ((index / searchLen))), searchLen, replaceStr, replaceLen);
                index = indexOf(searchStr, ((_arithmeticOperatorHotSpot234.is("PLUS")) ? ((index + replaceLen)) : (_arithmeticOperatorHotSpot234.is("MINUS")) ? ((index - replaceLen)) : (_arithmeticOperatorHotSpot234.is("MUL")) ? ((index * replaceLen)) :  ((index / replaceLen))));
            }
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder replaceFirst(final java.lang.String searchStr, final java.lang.String replaceStr) {
        final int searchLen = searchStr == null ? 0 : searchStr.length();
        if (searchLen > 0) {
            final int index = indexOf(searchStr, 0);
            if (index >= 0) {
                final int replaceLen = replaceStr == null ? 0 : replaceStr.length();
                replaceImpl(index, ((_arithmeticOperatorHotSpot235.is("PLUS")) ? ((index + searchLen)) : (_arithmeticOperatorHotSpot235.is("MINUS")) ? ((index - searchLen)) : (_arithmeticOperatorHotSpot235.is("MUL")) ? ((index * searchLen)) :  ((index / searchLen))), searchLen, replaceStr, replaceLen);
            } 
        } 
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder replaceAll(final org.apache.commons.lang3.text.StrMatcher matcher, final java.lang.String replaceStr) {
        return replace(matcher, replaceStr, 0, size, -1);
    }

    public org.apache.commons.lang3.text.StrBuilder replaceFirst(final org.apache.commons.lang3.text.StrMatcher matcher, final java.lang.String replaceStr) {
        return replace(matcher, replaceStr, 0, size, 1);
    }

    public org.apache.commons.lang3.text.StrBuilder replace(final org.apache.commons.lang3.text.StrMatcher matcher, final java.lang.String replaceStr, final int startIndex, int endIndex, final int replaceCount) {
        endIndex = validateRange(startIndex, endIndex);
        return replaceImpl(matcher, replaceStr, startIndex, endIndex, replaceCount);
    }

    private org.apache.commons.lang3.text.StrBuilder replaceImpl(final org.apache.commons.lang3.text.StrMatcher matcher, final java.lang.String replaceStr, final int from, int to, int replaceCount) {
        if ((matcher == null) || ((size) == 0)) {
            return this;
        } 
        final int replaceLen = replaceStr == null ? 0 : replaceStr.length();
        final char[] buf = buffer;
        for (int i = from ; (i < to) && (replaceCount != 0) ; i++) {
            final int removeLen = matcher.isMatch(buf, i, from, to);
            if (removeLen > 0) {
                replaceImpl(i, ((_arithmeticOperatorHotSpot236.is("PLUS")) ? ((i + removeLen)) : (_arithmeticOperatorHotSpot236.is("MINUS")) ? ((i - removeLen)) : (_arithmeticOperatorHotSpot236.is("MUL")) ? ((i * removeLen)) :  ((i / removeLen))), removeLen, replaceStr, replaceLen);
                to = ((_arithmeticOperatorHotSpot237.is("PLUS")) ? ((to + removeLen)) : (_arithmeticOperatorHotSpot237.is("MINUS")) ? ((to - removeLen)) : (_arithmeticOperatorHotSpot237.is("MUL")) ? ((to * removeLen)) :  ((to / removeLen))) + replaceLen;
                i = ((_arithmeticOperatorHotSpot238.is("PLUS")) ? ((i + replaceLen)) : (_arithmeticOperatorHotSpot238.is("MINUS")) ? ((i - replaceLen)) : (_arithmeticOperatorHotSpot238.is("MUL")) ? ((i * replaceLen)) :  ((i / replaceLen))) - 1;
                if (replaceCount > 0) {
                    replaceCount--;
                } 
            } 
        }
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder reverse() {
        if ((size) == 0) {
            return this;
        } 
        final int half = ((_arithmeticOperatorHotSpot239.is("PLUS")) ? ((size) + 2) : (_arithmeticOperatorHotSpot239.is("MINUS")) ? ((size) - 2) : (_arithmeticOperatorHotSpot239.is("MUL")) ? ((size) * 2) :  ((size) / 2));
        final char[] buf = buffer;
        for (int leftIdx = 0, rightIdx = ((_arithmeticOperatorHotSpot240.is("PLUS")) ? ((size) + 1) : (_arithmeticOperatorHotSpot240.is("MINUS")) ? ((size) - 1) : (_arithmeticOperatorHotSpot240.is("MUL")) ? ((size) * 1) :  ((size) / 1)) ; leftIdx < half ; leftIdx++ , rightIdx--) {
            final char swap = buf[leftIdx];
            buf[leftIdx] = buf[rightIdx];
            buf[rightIdx] = swap;
        }
        return this;
    }

    public org.apache.commons.lang3.text.StrBuilder trim() {
        if ((size) == 0) {
            return this;
        } 
        int len = size;
        final char[] buf = buffer;
        int pos = 0;
        while ((pos < len) && ((buf[pos]) <= ' ')) {
            pos++;
        }
        while ((pos < len) && ((buf[((_arithmeticOperatorHotSpot241.is("PLUS")) ? ((len + 1)) : (_arithmeticOperatorHotSpot241.is("MINUS")) ? ((len - 1)) : (_arithmeticOperatorHotSpot241.is("MUL")) ? ((len * 1)) :  ((len / 1)))]) <= ' ')) {
            len--;
        }
        if (len < (size)) {
            delete(len, size);
        } 
        if (pos > 0) {
            delete(0, pos);
        } 
        return this;
    }

    public boolean startsWith(final java.lang.String str) {
        if (str == null) {
            return false;
        } 
        final int len = str.length();
        if (len == 0) {
            return true;
        } 
        if (len > (size)) {
            return false;
        } 
        for (int i = 0 ; i < len ; i++) {
            if ((buffer[i]) != (str.charAt(i))) {
                return false;
            } 
        }
        return true;
    }

    public boolean endsWith(final java.lang.String str) {
        if (str == null) {
            return false;
        } 
        final int len = str.length();
        if (len == 0) {
            return true;
        } 
        if (len > (size)) {
            return false;
        } 
        int pos = ((_arithmeticOperatorHotSpot142.is("PLUS")) ? ((size) + len) : (_arithmeticOperatorHotSpot142.is("MINUS")) ? ((size) - len) : (_arithmeticOperatorHotSpot142.is("MUL")) ? ((size) * len) :  ((size) / len));
        for (int i = 0 ; i < len ; i++ , pos++) {
            if ((buffer[pos]) != (str.charAt(i))) {
                return false;
            } 
        }
        return true;
    }

    @java.lang.Override
    public java.lang.CharSequence subSequence(final int startIndex, final int endIndex) {
        if (startIndex < 0) {
            throw new java.lang.StringIndexOutOfBoundsException(startIndex);
        } 
        if (endIndex > (size)) {
            throw new java.lang.StringIndexOutOfBoundsException(endIndex);
        } 
        if (startIndex > endIndex) {
            throw new java.lang.StringIndexOutOfBoundsException(((_arithmeticOperatorHotSpot165.is("PLUS")) ? ((endIndex + startIndex)) : (_arithmeticOperatorHotSpot165.is("MINUS")) ? ((endIndex - startIndex)) : (_arithmeticOperatorHotSpot165.is("MUL")) ? ((endIndex * startIndex)) :  ((endIndex / startIndex))));
        } 
        return substring(startIndex, endIndex);
    }

    public java.lang.String substring(final int start) {
        return substring(start, size);
    }

    public java.lang.String substring(final int startIndex, int endIndex) {
        endIndex = validateRange(startIndex, endIndex);
        return new java.lang.String(buffer , startIndex , ((_arithmeticOperatorHotSpot169.is("PLUS")) ? ((endIndex + startIndex)) : (_arithmeticOperatorHotSpot169.is("MINUS")) ? ((endIndex - startIndex)) : (_arithmeticOperatorHotSpot169.is("MUL")) ? ((endIndex * startIndex)) :  ((endIndex / startIndex))));
    }

    public java.lang.String leftString(final int length) {
        if (length <= 0) {
            return "";
        } else if (length >= (size)) {
            return new java.lang.String(buffer , 0 , size);
        } else {
            return new java.lang.String(buffer , 0 , length);
        }
    }

    public java.lang.String rightString(final int length) {
        if (length <= 0) {
            return "";
        } else if (length >= (size)) {
            return new java.lang.String(buffer , 0 , size);
        } else {
            return new java.lang.String(buffer , ((_arithmeticOperatorHotSpot168.is("PLUS")) ? (((size) + length)) : (_arithmeticOperatorHotSpot168.is("MINUS")) ? (((size) - length)) : (_arithmeticOperatorHotSpot168.is("MUL")) ? (((size) * length)) :  (((size) / length))) , length);
        }
    }

    public java.lang.String midString(int index, final int length) {
        if (index < 0) {
            index = 0;
        } 
        if ((length <= 0) || (index >= (size))) {
            return "";
        } 
        if ((size) <= ((_arithmeticOperatorHotSpot166.is("PLUS")) ? ((index + length)) : (_arithmeticOperatorHotSpot166.is("MINUS")) ? ((index - length)) : (_arithmeticOperatorHotSpot166.is("MUL")) ? ((index * length)) :  ((index / length)))) {
            return new java.lang.String(buffer , index , ((_arithmeticOperatorHotSpot167.is("PLUS")) ? (((size) + index)) : (_arithmeticOperatorHotSpot167.is("MINUS")) ? (((size) - index)) : (_arithmeticOperatorHotSpot167.is("MUL")) ? (((size) * index)) :  (((size) / index))));
        } 
        return new java.lang.String(buffer , index , length);
    }

    public boolean contains(final char ch) {
        final char[] thisBuf = buffer;
        for (int i = 0 ; i < (this.size) ; i++) {
            if ((thisBuf[i]) == ch) {
                return true;
            } 
        }
        return false;
    }

    public boolean contains(final java.lang.String str) {
        return (indexOf(str, 0)) >= 0;
    }

    public boolean contains(final org.apache.commons.lang3.text.StrMatcher matcher) {
        return (indexOf(matcher, 0)) >= 0;
    }

    public int indexOf(final char ch) {
        return indexOf(ch, 0);
    }

    public int indexOf(final char ch, int startIndex) {
        startIndex = startIndex < 0 ? 0 : startIndex;
        if (startIndex >= (size)) {
            return -1;
        } 
        final char[] thisBuf = buffer;
        for (int i = startIndex ; i < (size) ; i++) {
            if ((thisBuf[i]) == ch) {
                return i;
            } 
        }
        return -1;
    }

    public int indexOf(final java.lang.String str) {
        return indexOf(str, 0);
    }

    public int indexOf(final java.lang.String str, int startIndex) {
        startIndex = startIndex < 0 ? 0 : startIndex;
        if ((str == null) || (startIndex >= (size))) {
            return -1;
        } 
        final int strLen = str.length();
        if (strLen == 1) {
            return indexOf(str.charAt(0), startIndex);
        } 
        if (strLen == 0) {
            return startIndex;
        } 
        if (strLen > (size)) {
            return -1;
        } 
        final char[] thisBuf = buffer;
        final int len = ((_arithmeticOperatorHotSpot148.is("PLUS")) ? (((size) + strLen)) : (_arithmeticOperatorHotSpot148.is("MINUS")) ? (((size) - strLen)) : (_arithmeticOperatorHotSpot148.is("MUL")) ? (((size) * strLen)) :  (((size) / strLen))) + 1;
        outer : for (int i = startIndex ; i < len ; i++) {
            for (int j = 0 ; j < strLen ; j++) {
                if ((str.charAt(j)) != (thisBuf[((_arithmeticOperatorHotSpot149.is("PLUS")) ? ((i + j)) : (_arithmeticOperatorHotSpot149.is("MINUS")) ? ((i - j)) : (_arithmeticOperatorHotSpot149.is("MUL")) ? ((i * j)) :  ((i / j)))])) {
                    continue outer;
                } 
            }
            return i;
        }
        return -1;
    }

    public int indexOf(final org.apache.commons.lang3.text.StrMatcher matcher) {
        return indexOf(matcher, 0);
    }

    public int indexOf(final org.apache.commons.lang3.text.StrMatcher matcher, int startIndex) {
        startIndex = startIndex < 0 ? 0 : startIndex;
        if ((matcher == null) || (startIndex >= (size))) {
            return -1;
        } 
        final int len = size;
        final char[] buf = buffer;
        for (int i = startIndex ; i < len ; i++) {
            if ((matcher.isMatch(buf, i, startIndex, len)) > 0) {
                return i;
            } 
        }
        return -1;
    }

    public int lastIndexOf(final char ch) {
        return lastIndexOf(ch, ((_arithmeticOperatorHotSpot150.is("PLUS")) ? (((size) + 1)) : (_arithmeticOperatorHotSpot150.is("MINUS")) ? (((size) - 1)) : (_arithmeticOperatorHotSpot150.is("MUL")) ? (((size) * 1)) :  (((size) / 1))));
    }

    public int lastIndexOf(final char ch, int startIndex) {
        startIndex = startIndex >= (size) ? ((_arithmeticOperatorHotSpot151.is("PLUS")) ? ((size) + 1) : (_arithmeticOperatorHotSpot151.is("MINUS")) ? ((size) - 1) : (_arithmeticOperatorHotSpot151.is("MUL")) ? ((size) * 1) :  ((size) / 1)) : startIndex;
        if (startIndex < 0) {
            return -1;
        } 
        for (int i = startIndex ; i >= 0 ; i--) {
            if ((buffer[i]) == ch) {
                return i;
            } 
        }
        return -1;
    }

    public int lastIndexOf(final java.lang.String str) {
        return lastIndexOf(str, ((_arithmeticOperatorHotSpot152.is("PLUS")) ? (((size) + 1)) : (_arithmeticOperatorHotSpot152.is("MINUS")) ? (((size) - 1)) : (_arithmeticOperatorHotSpot152.is("MUL")) ? (((size) * 1)) :  (((size) / 1))));
    }

    public int lastIndexOf(final java.lang.String str, int startIndex) {
        startIndex = startIndex >= (size) ? ((_arithmeticOperatorHotSpot153.is("PLUS")) ? ((size) + 1) : (_arithmeticOperatorHotSpot153.is("MINUS")) ? ((size) - 1) : (_arithmeticOperatorHotSpot153.is("MUL")) ? ((size) * 1) :  ((size) / 1)) : startIndex;
        if ((str == null) || (startIndex < 0)) {
            return -1;
        } 
        final int strLen = str.length();
        if ((strLen > 0) && (strLen <= (size))) {
            if (strLen == 1) {
                return lastIndexOf(str.charAt(0), startIndex);
            } 
            outer : for (int i = ((_arithmeticOperatorHotSpot154.is("PLUS")) ? ((startIndex + strLen)) : (_arithmeticOperatorHotSpot154.is("MINUS")) ? ((startIndex - strLen)) : (_arithmeticOperatorHotSpot154.is("MUL")) ? ((startIndex * strLen)) :  ((startIndex / strLen))) + 1 ; i >= 0 ; i--) {
                for (int j = 0 ; j < strLen ; j++) {
                    if ((str.charAt(j)) != (buffer[((_arithmeticOperatorHotSpot155.is("PLUS")) ? ((i + j)) : (_arithmeticOperatorHotSpot155.is("MINUS")) ? ((i - j)) : (_arithmeticOperatorHotSpot155.is("MUL")) ? ((i * j)) :  ((i / j)))])) {
                        continue outer;
                    } 
                }
                return i;
            }
        } else if (strLen == 0) {
            return startIndex;
        } 
        return -1;
    }

    public int lastIndexOf(final org.apache.commons.lang3.text.StrMatcher matcher) {
        return lastIndexOf(matcher, size);
    }

    public int lastIndexOf(final org.apache.commons.lang3.text.StrMatcher matcher, int startIndex) {
        startIndex = startIndex >= (size) ? ((_arithmeticOperatorHotSpot156.is("PLUS")) ? ((size) + 1) : (_arithmeticOperatorHotSpot156.is("MINUS")) ? ((size) - 1) : (_arithmeticOperatorHotSpot156.is("MUL")) ? ((size) * 1) :  ((size) / 1)) : startIndex;
        if ((matcher == null) || (startIndex < 0)) {
            return -1;
        } 
        final char[] buf = buffer;
        final int endIndex = ((_arithmeticOperatorHotSpot157.is("PLUS")) ? (startIndex + 1) : (_arithmeticOperatorHotSpot157.is("MINUS")) ? (startIndex - 1) : (_arithmeticOperatorHotSpot157.is("MUL")) ? (startIndex * 1) :  (startIndex / 1));
        for (int i = startIndex ; i >= 0 ; i--) {
            if ((matcher.isMatch(buf, i, 0, endIndex)) > 0) {
                return i;
            } 
        }
        return -1;
    }

    public org.apache.commons.lang3.text.StrTokenizer asTokenizer() {
        return new StrBuilderTokenizer();
    }

    public java.io.Reader asReader() {
        return new StrBuilderReader();
    }

    public java.io.Writer asWriter() {
        return new StrBuilderWriter();
    }

    public void appendTo(final java.lang.Appendable appendable) throws java.io.IOException {
        if (appendable instanceof java.io.Writer) {
            ((java.io.Writer)(appendable)).write(buffer, 0, size);
        } else if (appendable instanceof java.lang.StringBuilder) {
            ((java.lang.StringBuilder)(appendable)).append(buffer, 0, size);
        } else if (appendable instanceof java.lang.StringBuffer) {
            ((java.lang.StringBuffer)(appendable)).append(buffer, 0, size);
        } else if (appendable instanceof java.nio.CharBuffer) {
            ((java.nio.CharBuffer)(appendable)).put(buffer, 0, size);
        } else {
            appendable.append(this);
        }
    }

    public boolean equalsIgnoreCase(final org.apache.commons.lang3.text.StrBuilder other) {
        if ((this) == other) {
            return true;
        } 
        if ((this.size) != (other.size)) {
            return false;
        } 
        final char[] thisBuf = this.buffer;
        final char[] otherBuf = other.buffer;
        for (int i = ((_arithmeticOperatorHotSpot144.is("PLUS")) ? ((size) + 1) : (_arithmeticOperatorHotSpot144.is("MINUS")) ? ((size) - 1) : (_arithmeticOperatorHotSpot144.is("MUL")) ? ((size) * 1) :  ((size) / 1)) ; i >= 0 ; i--) {
            final char c1 = thisBuf[i];
            final char c2 = otherBuf[i];
            if ((c1 != c2) && ((java.lang.Character.toUpperCase(c1)) != (java.lang.Character.toUpperCase(c2)))) {
                return false;
            } 
        }
        return true;
    }

    public boolean equals(final org.apache.commons.lang3.text.StrBuilder other) {
        if ((this) == other) {
            return true;
        } 
        if (other == null) {
            return false;
        } 
        if ((this.size) != (other.size)) {
            return false;
        } 
        final char[] thisBuf = this.buffer;
        final char[] otherBuf = other.buffer;
        for (int i = ((_arithmeticOperatorHotSpot143.is("PLUS")) ? ((size) + 1) : (_arithmeticOperatorHotSpot143.is("MINUS")) ? ((size) - 1) : (_arithmeticOperatorHotSpot143.is("MUL")) ? ((size) * 1) :  ((size) / 1)) ; i >= 0 ; i--) {
            if ((thisBuf[i]) != (otherBuf[i])) {
                return false;
            } 
        }
        return true;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        return (obj instanceof org.apache.commons.lang3.text.StrBuilder) && (equals(((org.apache.commons.lang3.text.StrBuilder)(obj))));
    }

    @java.lang.Override
    public int hashCode() {
        final char[] buf = buffer;
        int hash = 0;
        for (int i = ((_arithmeticOperatorHotSpot146.is("PLUS")) ? ((size) + 1) : (_arithmeticOperatorHotSpot146.is("MINUS")) ? ((size) - 1) : (_arithmeticOperatorHotSpot146.is("MUL")) ? ((size) * 1) :  ((size) / 1)) ; i >= 0 ; i--) {
            hash = ((_arithmeticOperatorHotSpot147.is("PLUS")) ? ((31 + hash)) : (_arithmeticOperatorHotSpot147.is("MINUS")) ? ((31 - hash)) : (_arithmeticOperatorHotSpot147.is("MUL")) ? ((31 * hash)) :  ((31 / hash))) + (buf[i]);
        }
        return hash;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return new java.lang.String(buffer , 0 , size);
    }

    public java.lang.StringBuffer toStringBuffer() {
        return new java.lang.StringBuffer(size).append(buffer, 0, size);
    }

    public java.lang.StringBuilder toStringBuilder() {
        return new java.lang.StringBuilder(size).append(buffer, 0, size);
    }

    @java.lang.Override
    public java.lang.String build() {
        return toString();
    }

    protected int validateRange(final int startIndex, int endIndex) {
        if (startIndex < 0) {
            throw new java.lang.StringIndexOutOfBoundsException(startIndex);
        } 
        if (endIndex > (size)) {
            endIndex = size;
        } 
        if (startIndex > endIndex) {
            throw new java.lang.StringIndexOutOfBoundsException("end < start");
        } 
        return endIndex;
    }

    protected void validateIndex(final int index) {
        if ((index < 0) || (index > (size))) {
            throw new java.lang.StringIndexOutOfBoundsException(index);
        } 
    }

    class StrBuilderTokenizer extends org.apache.commons.lang3.text.StrTokenizer {
        StrBuilderTokenizer() {
            super();
        }

        @java.lang.Override
        protected java.util.List<java.lang.String> tokenize(final char[] chars, final int offset, final int count) {
            if (chars == null) {
                return super.tokenize(org.apache.commons.lang3.text.StrBuilder.this.buffer, 0, org.apache.commons.lang3.text.StrBuilder.this.size());
            } 
            return super.tokenize(chars, offset, count);
        }

        @java.lang.Override
        public java.lang.String getContent() {
            final java.lang.String str = super.getContent();
            if (str == null) {
                return org.apache.commons.lang3.text.StrBuilder.this.toString();
            } 
            return str;
        }
    }

    class StrBuilderReader extends java.io.Reader {
        private int pos;

        private int mark;

        StrBuilderReader() {
            super();
        }

        @java.lang.Override
        public void close() {
        }

        @java.lang.Override
        public int read() {
            if ((ready()) == false) {
                return -1;
            } 
            return org.apache.commons.lang3.text.StrBuilder.this.charAt((pos)++);
        }

        @java.lang.Override
        public int read(final char[] b, final int off, int len) {
            if (((((off < 0) || (len < 0)) || (off > (b.length))) || (((_arithmeticOperatorHotSpot135.is("PLUS")) ? ((off + len)) : (_arithmeticOperatorHotSpot135.is("MINUS")) ? ((off - len)) : (_arithmeticOperatorHotSpot135.is("MUL")) ? ((off * len)) :  ((off / len))) > (b.length))) || (((_arithmeticOperatorHotSpot136.is("PLUS")) ? ((off + len)) : (_arithmeticOperatorHotSpot136.is("MINUS")) ? ((off - len)) : (_arithmeticOperatorHotSpot136.is("MUL")) ? ((off * len)) :  ((off / len))) < 0)) {
                throw new java.lang.IndexOutOfBoundsException();
            } 
            if (len == 0) {
                return 0;
            } 
            if ((pos) >= (org.apache.commons.lang3.text.StrBuilder.this.size())) {
                return -1;
            } 
            if (((_arithmeticOperatorHotSpot137.is("PLUS")) ? (((pos) + len)) : (_arithmeticOperatorHotSpot137.is("MINUS")) ? (((pos) - len)) : (_arithmeticOperatorHotSpot137.is("MUL")) ? (((pos) * len)) :  (((pos) / len))) > (size())) {
                len = ((_arithmeticOperatorHotSpot138.is("PLUS")) ? ((org.apache.commons.lang3.text.StrBuilder.this.size()) + (pos)) : (_arithmeticOperatorHotSpot138.is("MINUS")) ? ((org.apache.commons.lang3.text.StrBuilder.this.size()) - (pos)) : (_arithmeticOperatorHotSpot138.is("MUL")) ? ((org.apache.commons.lang3.text.StrBuilder.this.size()) * (pos)) :  ((org.apache.commons.lang3.text.StrBuilder.this.size()) / (pos)));
            } 
            org.apache.commons.lang3.text.StrBuilder.this.getChars(pos, ((_arithmeticOperatorHotSpot139.is("PLUS")) ? (((pos) + len)) : (_arithmeticOperatorHotSpot139.is("MINUS")) ? (((pos) - len)) : (_arithmeticOperatorHotSpot139.is("MUL")) ? (((pos) * len)) :  (((pos) / len))), b, off);
            pos += len;
            return len;
        }

        @java.lang.Override
        public long skip(long n) {
            if (((_arithmeticOperatorHotSpot140.is("PLUS")) ? (((pos) + n)) : (_arithmeticOperatorHotSpot140.is("MINUS")) ? (((pos) - n)) : (_arithmeticOperatorHotSpot140.is("MUL")) ? (((pos) * n)) :  (((pos) / n))) > (org.apache.commons.lang3.text.StrBuilder.this.size())) {
                n = ((_arithmeticOperatorHotSpot141.is("PLUS")) ? ((org.apache.commons.lang3.text.StrBuilder.this.size()) + (pos)) : (_arithmeticOperatorHotSpot141.is("MINUS")) ? ((org.apache.commons.lang3.text.StrBuilder.this.size()) - (pos)) : (_arithmeticOperatorHotSpot141.is("MUL")) ? ((org.apache.commons.lang3.text.StrBuilder.this.size()) * (pos)) :  ((org.apache.commons.lang3.text.StrBuilder.this.size()) / (pos)));
            } 
            if (n < 0) {
                return 0;
            } 
            pos += n;
            return n;
        }

        @java.lang.Override
        public boolean ready() {
            return (pos) < (org.apache.commons.lang3.text.StrBuilder.this.size());
        }

        @java.lang.Override
        public boolean markSupported() {
            return true;
        }

        @java.lang.Override
        public void mark(final int readAheadLimit) {
            mark = pos;
        }

        @java.lang.Override
        public void reset() {
            pos = mark;
        }
    }

    class StrBuilderWriter extends java.io.Writer {
        StrBuilderWriter() {
            super();
        }

        @java.lang.Override
        public void close() {
        }

        @java.lang.Override
        public void flush() {
        }

        @java.lang.Override
        public void write(final int c) {
            org.apache.commons.lang3.text.StrBuilder.this.append(((char)(c)));
        }

        @java.lang.Override
        public void write(final char[] cbuf) {
            org.apache.commons.lang3.text.StrBuilder.this.append(cbuf);
        }

        @java.lang.Override
        public void write(final char[] cbuf, final int off, final int len) {
            org.apache.commons.lang3.text.StrBuilder.this.append(cbuf, off, len);
        }

        @java.lang.Override
        public void write(final java.lang.String str) {
            org.apache.commons.lang3.text.StrBuilder.this.append(str);
        }

        @java.lang.Override
        public void write(final java.lang.String str, final int off, final int len) {
            org.apache.commons.lang3.text.StrBuilder.this.append(str, off, len);
        }
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot135 = metamutator.Selector.of(135,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot135");

    private static final metamutator.Selector _arithmeticOperatorHotSpot136 = metamutator.Selector.of(136,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot136");

    private static final metamutator.Selector _arithmeticOperatorHotSpot137 = metamutator.Selector.of(137,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot137");

    private static final metamutator.Selector _arithmeticOperatorHotSpot138 = metamutator.Selector.of(138,new String[]{"MINUS","PLUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot138");

    private static final metamutator.Selector _arithmeticOperatorHotSpot139 = metamutator.Selector.of(139,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot139");

    private static final metamutator.Selector _arithmeticOperatorHotSpot140 = metamutator.Selector.of(140,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot140");

    private static final metamutator.Selector _arithmeticOperatorHotSpot141 = metamutator.Selector.of(141,new String[]{"MINUS","PLUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot141");

    private static final metamutator.Selector _arithmeticOperatorHotSpot142 = metamutator.Selector.of(142,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot142");

    private static final metamutator.Selector _arithmeticOperatorHotSpot143 = metamutator.Selector.of(143,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot143");

    private static final metamutator.Selector _arithmeticOperatorHotSpot144 = metamutator.Selector.of(144,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot144");

    private static final metamutator.Selector _arithmeticOperatorHotSpot145 = metamutator.Selector.of(145,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot145");

    private static final metamutator.Selector _arithmeticOperatorHotSpot146 = metamutator.Selector.of(146,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot146");

    private static final metamutator.Selector _arithmeticOperatorHotSpot147 = metamutator.Selector.of(147,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot147");

    private static final metamutator.Selector _arithmeticOperatorHotSpot148 = metamutator.Selector.of(148,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot148");

    private static final metamutator.Selector _arithmeticOperatorHotSpot149 = metamutator.Selector.of(149,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot149");

    private static final metamutator.Selector _arithmeticOperatorHotSpot150 = metamutator.Selector.of(150,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot150");

    private static final metamutator.Selector _arithmeticOperatorHotSpot151 = metamutator.Selector.of(151,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot151");

    private static final metamutator.Selector _arithmeticOperatorHotSpot152 = metamutator.Selector.of(152,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot152");

    private static final metamutator.Selector _arithmeticOperatorHotSpot153 = metamutator.Selector.of(153,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot153");

    private static final metamutator.Selector _arithmeticOperatorHotSpot154 = metamutator.Selector.of(154,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot154");

    private static final metamutator.Selector _arithmeticOperatorHotSpot155 = metamutator.Selector.of(155,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot155");

    private static final metamutator.Selector _arithmeticOperatorHotSpot156 = metamutator.Selector.of(156,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot156");

    private static final metamutator.Selector _arithmeticOperatorHotSpot157 = metamutator.Selector.of(157,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot157");

    private static final metamutator.Selector _arithmeticOperatorHotSpot158 = metamutator.Selector.of(158,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot158");

    private static final metamutator.Selector _arithmeticOperatorHotSpot159 = metamutator.Selector.of(159,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot159");

    private static final metamutator.Selector _arithmeticOperatorHotSpot160 = metamutator.Selector.of(160,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot160");

    private static final metamutator.Selector _arithmeticOperatorHotSpot161 = metamutator.Selector.of(161,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot161");

    private static final metamutator.Selector _arithmeticOperatorHotSpot162 = metamutator.Selector.of(162,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot162");

    private static final metamutator.Selector _arithmeticOperatorHotSpot163 = metamutator.Selector.of(163,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot163");

    private static final metamutator.Selector _arithmeticOperatorHotSpot164 = metamutator.Selector.of(164,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot164");

    private static final metamutator.Selector _arithmeticOperatorHotSpot165 = metamutator.Selector.of(165,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot165");

    private static final metamutator.Selector _arithmeticOperatorHotSpot166 = metamutator.Selector.of(166,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot166");

    private static final metamutator.Selector _arithmeticOperatorHotSpot167 = metamutator.Selector.of(167,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot167");

    private static final metamutator.Selector _arithmeticOperatorHotSpot168 = metamutator.Selector.of(168,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot168");

    private static final metamutator.Selector _arithmeticOperatorHotSpot169 = metamutator.Selector.of(169,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot169");

    private static final metamutator.Selector _arithmeticOperatorHotSpot170 = metamutator.Selector.of(170,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot170");

    private static final metamutator.Selector _arithmeticOperatorHotSpot171 = metamutator.Selector.of(171,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot171");

    private static final metamutator.Selector _arithmeticOperatorHotSpot172 = metamutator.Selector.of(172,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot172");

    private static final metamutator.Selector _arithmeticOperatorHotSpot173 = metamutator.Selector.of(173,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot173");

    private static final metamutator.Selector _arithmeticOperatorHotSpot174 = metamutator.Selector.of(174,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot174");

    private static final metamutator.Selector _arithmeticOperatorHotSpot175 = metamutator.Selector.of(175,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot175");

    private static final metamutator.Selector _arithmeticOperatorHotSpot176 = metamutator.Selector.of(176,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot176");

    private static final metamutator.Selector _arithmeticOperatorHotSpot177 = metamutator.Selector.of(177,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot177");

    private static final metamutator.Selector _arithmeticOperatorHotSpot178 = metamutator.Selector.of(178,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot178");

    private static final metamutator.Selector _arithmeticOperatorHotSpot179 = metamutator.Selector.of(179,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot179");

    private static final metamutator.Selector _arithmeticOperatorHotSpot180 = metamutator.Selector.of(180,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot180");

    private static final metamutator.Selector _arithmeticOperatorHotSpot181 = metamutator.Selector.of(181,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot181");

    private static final metamutator.Selector _arithmeticOperatorHotSpot182 = metamutator.Selector.of(182,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot182");

    private static final metamutator.Selector _arithmeticOperatorHotSpot183 = metamutator.Selector.of(183,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot183");

    private static final metamutator.Selector _arithmeticOperatorHotSpot184 = metamutator.Selector.of(184,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot184");

    private static final metamutator.Selector _arithmeticOperatorHotSpot185 = metamutator.Selector.of(185,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot185");

    private static final metamutator.Selector _arithmeticOperatorHotSpot186 = metamutator.Selector.of(186,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot186");

    private static final metamutator.Selector _arithmeticOperatorHotSpot187 = metamutator.Selector.of(187,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot187");

    private static final metamutator.Selector _arithmeticOperatorHotSpot188 = metamutator.Selector.of(188,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot188");

    private static final metamutator.Selector _arithmeticOperatorHotSpot189 = metamutator.Selector.of(189,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot189");

    private static final metamutator.Selector _arithmeticOperatorHotSpot190 = metamutator.Selector.of(190,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot190");

    private static final metamutator.Selector _arithmeticOperatorHotSpot191 = metamutator.Selector.of(191,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot191");

    private static final metamutator.Selector _arithmeticOperatorHotSpot192 = metamutator.Selector.of(192,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot192");

    private static final metamutator.Selector _arithmeticOperatorHotSpot193 = metamutator.Selector.of(193,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot193");

    private static final metamutator.Selector _arithmeticOperatorHotSpot194 = metamutator.Selector.of(194,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot194");

    private static final metamutator.Selector _arithmeticOperatorHotSpot195 = metamutator.Selector.of(195,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot195");

    private static final metamutator.Selector _arithmeticOperatorHotSpot196 = metamutator.Selector.of(196,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot196");

    private static final metamutator.Selector _arithmeticOperatorHotSpot197 = metamutator.Selector.of(197,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot197");

    private static final metamutator.Selector _arithmeticOperatorHotSpot198 = metamutator.Selector.of(198,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot198");

    private static final metamutator.Selector _arithmeticOperatorHotSpot199 = metamutator.Selector.of(199,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot199");

    private static final metamutator.Selector _arithmeticOperatorHotSpot200 = metamutator.Selector.of(200,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot200");

    private static final metamutator.Selector _arithmeticOperatorHotSpot201 = metamutator.Selector.of(201,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot201");

    private static final metamutator.Selector _arithmeticOperatorHotSpot202 = metamutator.Selector.of(202,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot202");

    private static final metamutator.Selector _arithmeticOperatorHotSpot203 = metamutator.Selector.of(203,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot203");

    private static final metamutator.Selector _arithmeticOperatorHotSpot204 = metamutator.Selector.of(204,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot204");

    private static final metamutator.Selector _arithmeticOperatorHotSpot205 = metamutator.Selector.of(205,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot205");

    private static final metamutator.Selector _arithmeticOperatorHotSpot206 = metamutator.Selector.of(206,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot206");

    private static final metamutator.Selector _arithmeticOperatorHotSpot207 = metamutator.Selector.of(207,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot207");

    private static final metamutator.Selector _arithmeticOperatorHotSpot208 = metamutator.Selector.of(208,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot208");

    private static final metamutator.Selector _arithmeticOperatorHotSpot209 = metamutator.Selector.of(209,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot209");

    private static final metamutator.Selector _arithmeticOperatorHotSpot210 = metamutator.Selector.of(210,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot210");

    private static final metamutator.Selector _arithmeticOperatorHotSpot211 = metamutator.Selector.of(211,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot211");

    private static final metamutator.Selector _arithmeticOperatorHotSpot212 = metamutator.Selector.of(212,new String[]{"MUL","PLUS","MINUS","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot212");

    private static final metamutator.Selector _arithmeticOperatorHotSpot213 = metamutator.Selector.of(213,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot213");

    private static final metamutator.Selector _arithmeticOperatorHotSpot214 = metamutator.Selector.of(214,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot214");

    private static final metamutator.Selector _arithmeticOperatorHotSpot215 = metamutator.Selector.of(215,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot215");

    private static final metamutator.Selector _arithmeticOperatorHotSpot216 = metamutator.Selector.of(216,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot216");

    private static final metamutator.Selector _arithmeticOperatorHotSpot217 = metamutator.Selector.of(217,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot217");

    private static final metamutator.Selector _arithmeticOperatorHotSpot218 = metamutator.Selector.of(218,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot218");

    private static final metamutator.Selector _arithmeticOperatorHotSpot219 = metamutator.Selector.of(219,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot219");

    private static final metamutator.Selector _arithmeticOperatorHotSpot220 = metamutator.Selector.of(220,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot220");

    private static final metamutator.Selector _arithmeticOperatorHotSpot221 = metamutator.Selector.of(221,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot221");

    private static final metamutator.Selector _arithmeticOperatorHotSpot222 = metamutator.Selector.of(222,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot222");

    private static final metamutator.Selector _arithmeticOperatorHotSpot223 = metamutator.Selector.of(223,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot223");

    private static final metamutator.Selector _arithmeticOperatorHotSpot224 = metamutator.Selector.of(224,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot224");

    private static final metamutator.Selector _arithmeticOperatorHotSpot225 = metamutator.Selector.of(225,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot225");

    private static final metamutator.Selector _arithmeticOperatorHotSpot226 = metamutator.Selector.of(226,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot226");

    private static final metamutator.Selector _arithmeticOperatorHotSpot227 = metamutator.Selector.of(227,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot227");

    private static final metamutator.Selector _arithmeticOperatorHotSpot228 = metamutator.Selector.of(228,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot228");

    private static final metamutator.Selector _arithmeticOperatorHotSpot229 = metamutator.Selector.of(229,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot229");

    private static final metamutator.Selector _arithmeticOperatorHotSpot230 = metamutator.Selector.of(230,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot230");

    private static final metamutator.Selector _arithmeticOperatorHotSpot231 = metamutator.Selector.of(231,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot231");

    private static final metamutator.Selector _arithmeticOperatorHotSpot232 = metamutator.Selector.of(232,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot232");

    private static final metamutator.Selector _arithmeticOperatorHotSpot233 = metamutator.Selector.of(233,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot233");

    private static final metamutator.Selector _arithmeticOperatorHotSpot234 = metamutator.Selector.of(234,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot234");

    private static final metamutator.Selector _arithmeticOperatorHotSpot235 = metamutator.Selector.of(235,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot235");

    private static final metamutator.Selector _arithmeticOperatorHotSpot236 = metamutator.Selector.of(236,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot236");

    private static final metamutator.Selector _arithmeticOperatorHotSpot237 = metamutator.Selector.of(237,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot237");

    private static final metamutator.Selector _arithmeticOperatorHotSpot238 = metamutator.Selector.of(238,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot238");

    private static final metamutator.Selector _arithmeticOperatorHotSpot239 = metamutator.Selector.of(239,new String[]{"DIV","PLUS","MINUS","MUL"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot239");

    private static final metamutator.Selector _arithmeticOperatorHotSpot240 = metamutator.Selector.of(240,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot240");

    private static final metamutator.Selector _arithmeticOperatorHotSpot241 = metamutator.Selector.of(241,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot241");

    private static final metamutator.Selector _arithmeticOperatorHotSpot242 = metamutator.Selector.of(242,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot242");

    private static final metamutator.Selector _arithmeticOperatorHotSpot243 = metamutator.Selector.of(243,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot243");

    private static final metamutator.Selector _arithmeticOperatorHotSpot244 = metamutator.Selector.of(244,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot244");

    private static final metamutator.Selector _arithmeticOperatorHotSpot245 = metamutator.Selector.of(245,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot245");

    private static final metamutator.Selector _arithmeticOperatorHotSpot246 = metamutator.Selector.of(246,new String[]{"MINUS","PLUS","MUL","DIV"}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_arithmeticOperatorHotSpot246");
}

