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
        return ((_returnReplacementOperatorHotSpot1263.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (newLine));
    }

    public org.apache.commons.lang3.text.StrBuilder setNewLineText(final java.lang.String newLine) {
        this.newLine = newLine;
        return ((_returnReplacementOperatorHotSpot1397.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public java.lang.String getNullText() {
        return ((_returnReplacementOperatorHotSpot1264.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (nullText));
    }

    public org.apache.commons.lang3.text.StrBuilder setNullText(java.lang.String nullText) {
        if ((nullText != null) && (nullText.isEmpty())) {
            nullText = null;
        } 
        this.nullText = nullText;
        return ((_returnReplacementOperatorHotSpot1398.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    @java.lang.Override
    public int length() {
        return ((_returnReplacementOperatorHotSpot1255.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1255.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1255.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (size));
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
        return ((_returnReplacementOperatorHotSpot1396.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public int capacity() {
        return ((_returnReplacementOperatorHotSpot1224.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1224.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1224.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (buffer.length));
    }

    public org.apache.commons.lang3.text.StrBuilder ensureCapacity(final int capacity) {
        if (capacity > (buffer.length)) {
            final char[] old = buffer;
            buffer = new char[capacity * 2];
            java.lang.System.arraycopy(old, 0, buffer, 0, size);
        } 
        return ((_returnReplacementOperatorHotSpot1368.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder minimizeCapacity() {
        if ((buffer.length) > (length())) {
            final char[] old = buffer;
            buffer = new char[length()];
            java.lang.System.arraycopy(old, 0, buffer, 0, size);
        } 
        return ((_returnReplacementOperatorHotSpot1382.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public int size() {
        return ((_returnReplacementOperatorHotSpot1257.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1257.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1257.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (size));
    }

    public boolean isEmpty() {
        return ((_returnReplacementOperatorHotSpot1212.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((size) == 0));
    }

    public org.apache.commons.lang3.text.StrBuilder clear() {
        size = 0;
        return ((_returnReplacementOperatorHotSpot1359.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    @java.lang.Override
    public char charAt(final int index) {
        if ((index < 0) || (index >= (length()))) {
            throw new java.lang.StringIndexOutOfBoundsException(index);
        } 
        return ((_returnReplacementOperatorHotSpot1218.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (buffer[index]));
    }

    public org.apache.commons.lang3.text.StrBuilder setCharAt(final int index, final char ch) {
        if ((index < 0) || (index >= (length()))) {
            throw new java.lang.StringIndexOutOfBoundsException(index);
        } 
        buffer[index] = ch;
        return ((_returnReplacementOperatorHotSpot1395.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder deleteCharAt(final int index) {
        if ((index < 0) || (index >= (size))) {
            throw new java.lang.StringIndexOutOfBoundsException(index);
        } 
        deleteImpl(index, (index + 1), 1);
        return ((_returnReplacementOperatorHotSpot1364.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public char[] toCharArray() {
        if ((size) == 0) {
            return ((_returnReplacementOperatorHotSpot1220.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY));
        } 
        final char[] chars = new char[size];
        java.lang.System.arraycopy(buffer, 0, chars, 0, size);
        return ((_returnReplacementOperatorHotSpot1221.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (chars));
    }

    public char[] toCharArray(final int startIndex, int endIndex) {
        endIndex = validateRange(startIndex, endIndex);
        final int len = endIndex - startIndex;
        if (len == 0) {
            return ((_returnReplacementOperatorHotSpot1222.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY));
        } 
        final char[] chars = new char[len];
        java.lang.System.arraycopy(buffer, startIndex, chars, 0, len);
        return ((_returnReplacementOperatorHotSpot1223.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (chars));
    }

    public char[] getChars(char[] destination) {
        final int len = length();
        if ((destination == null) || ((destination.length) < len)) {
            destination = new char[len];
        } 
        java.lang.System.arraycopy(buffer, 0, destination, 0, len);
        return ((_returnReplacementOperatorHotSpot1219.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (destination));
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
        java.lang.System.arraycopy(buffer, startIndex, destination, destinationIndex, (endIndex - startIndex));
    }

    public int readFrom(final java.lang.Readable readable) throws java.io.IOException {
        final int oldSize = size;
        if (readable instanceof java.io.Reader) {
            final java.io.Reader r = ((java.io.Reader)(readable));
            ensureCapacity(((size) + 1));
            int read;
            while ((read = r.read(buffer, size, ((buffer.length) - (size)))) != (-1)) {
                size += read;
                ensureCapacity(((size) + 1));
            }
        } else if (readable instanceof java.nio.CharBuffer) {
            final java.nio.CharBuffer cb = ((java.nio.CharBuffer)(readable));
            final int remaining = cb.remaining();
            ensureCapacity(((size) + remaining));
            cb.get(buffer, size, remaining);
            size += remaining;
        } else {
            while (true) {
                ensureCapacity(((size) + 1));
                final java.nio.CharBuffer buf = java.nio.CharBuffer.wrap(buffer, size, ((buffer.length) - (size)));
                final int read = readable.read(buf);
                if (read == (-1)) {
                    break;
                } 
                size += read;
            }
        }
        return ((_returnReplacementOperatorHotSpot1256.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1256.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1256.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : ((size) - oldSize));
    }

    public org.apache.commons.lang3.text.StrBuilder appendNewLine() {
        if ((newLine) == null) {
            append(org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR);
            return ((_returnReplacementOperatorHotSpot1327.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        return ((_returnReplacementOperatorHotSpot1328.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(newLine)));
    }

    public org.apache.commons.lang3.text.StrBuilder appendNull() {
        if ((nullText) == null) {
            return ((_returnReplacementOperatorHotSpot1329.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        return ((_returnReplacementOperatorHotSpot1330.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(nullText)));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.Object obj) {
        if (obj == null) {
            return ((_returnReplacementOperatorHotSpot1296.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (appendNull()));
        } 
        if (obj instanceof java.lang.CharSequence) {
            return ((_returnReplacementOperatorHotSpot1297.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(((java.lang.CharSequence)(obj)))));
        } 
        return ((_returnReplacementOperatorHotSpot1298.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(obj.toString())));
    }

    @java.lang.Override
    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.CharSequence seq) {
        if (seq == null) {
            return ((_returnReplacementOperatorHotSpot1288.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (appendNull()));
        } 
        if (seq instanceof org.apache.commons.lang3.text.StrBuilder) {
            return ((_returnReplacementOperatorHotSpot1289.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(((org.apache.commons.lang3.text.StrBuilder)(seq)))));
        } 
        if (seq instanceof java.lang.StringBuilder) {
            return ((_returnReplacementOperatorHotSpot1290.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(((java.lang.StringBuilder)(seq)))));
        } 
        if (seq instanceof java.lang.StringBuffer) {
            return ((_returnReplacementOperatorHotSpot1291.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(((java.lang.StringBuffer)(seq)))));
        } 
        if (seq instanceof java.nio.CharBuffer) {
            return ((_returnReplacementOperatorHotSpot1292.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(((java.nio.CharBuffer)(seq)))));
        } 
        return ((_returnReplacementOperatorHotSpot1293.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(seq.toString())));
    }

    @java.lang.Override
    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.CharSequence seq, final int startIndex, final int length) {
        if (seq == null) {
            return ((_returnReplacementOperatorHotSpot1294.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (appendNull()));
        } 
        return ((_returnReplacementOperatorHotSpot1295.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(seq.toString(), startIndex, length)));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot1299.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (appendNull()));
        } 
        final int strLen = str.length();
        if (strLen > 0) {
            final int len = length();
            ensureCapacity((len + strLen));
            str.getChars(0, strLen, buffer, len);
            size += strLen;
        } 
        return ((_returnReplacementOperatorHotSpot1300.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.String str, final int startIndex, final int length) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot1301.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (appendNull()));
        } 
        if ((startIndex < 0) || (startIndex > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("startIndex must be valid");
        } 
        if ((length < 0) || ((startIndex + length) > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("length must be valid");
        } 
        if (length > 0) {
            final int len = length();
            ensureCapacity((len + length));
            str.getChars(startIndex, (startIndex + length), buffer, len);
            size += length;
        } 
        return ((_returnReplacementOperatorHotSpot1302.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.String format, final java.lang.Object... objs) {
        return ((_returnReplacementOperatorHotSpot1303.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(java.lang.String.format(format, objs))));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.nio.CharBuffer buf) {
        if (buf == null) {
            return ((_returnReplacementOperatorHotSpot1312.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (appendNull()));
        } 
        if (buf.hasArray()) {
            final int length = buf.remaining();
            final int len = length();
            ensureCapacity((len + length));
            java.lang.System.arraycopy(buf.array(), ((buf.arrayOffset()) + (buf.position())), buffer, len, length);
            size += length;
        } else {
            append(buf.toString());
        }
        return ((_returnReplacementOperatorHotSpot1313.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.nio.CharBuffer buf, final int startIndex, final int length) {
        if (buf == null) {
            return ((_returnReplacementOperatorHotSpot1314.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (appendNull()));
        } 
        if (buf.hasArray()) {
            final int totalLength = buf.remaining();
            if ((startIndex < 0) || (startIndex > totalLength)) {
                throw new java.lang.StringIndexOutOfBoundsException("startIndex must be valid");
            } 
            if ((length < 0) || ((startIndex + length) > totalLength)) {
                throw new java.lang.StringIndexOutOfBoundsException("length must be valid");
            } 
            final int len = length();
            ensureCapacity((len + length));
            java.lang.System.arraycopy(buf.array(), (((buf.arrayOffset()) + (buf.position())) + startIndex), buffer, len, length);
            size += length;
        } else {
            append(buf.toString(), startIndex, length);
        }
        return ((_returnReplacementOperatorHotSpot1315.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.StringBuffer str) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot1304.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (appendNull()));
        } 
        final int strLen = str.length();
        if (strLen > 0) {
            final int len = length();
            ensureCapacity((len + strLen));
            str.getChars(0, strLen, buffer, len);
            size += strLen;
        } 
        return ((_returnReplacementOperatorHotSpot1305.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.StringBuffer str, final int startIndex, final int length) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot1306.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (appendNull()));
        } 
        if ((startIndex < 0) || (startIndex > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("startIndex must be valid");
        } 
        if ((length < 0) || ((startIndex + length) > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("length must be valid");
        } 
        if (length > 0) {
            final int len = length();
            ensureCapacity((len + length));
            str.getChars(startIndex, (startIndex + length), buffer, len);
            size += length;
        } 
        return ((_returnReplacementOperatorHotSpot1307.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.StringBuilder str) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot1308.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (appendNull()));
        } 
        final int strLen = str.length();
        if (strLen > 0) {
            final int len = length();
            ensureCapacity((len + strLen));
            str.getChars(0, strLen, buffer, len);
            size += strLen;
        } 
        return ((_returnReplacementOperatorHotSpot1309.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final java.lang.StringBuilder str, final int startIndex, final int length) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot1310.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (appendNull()));
        } 
        if ((startIndex < 0) || (startIndex > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("startIndex must be valid");
        } 
        if ((length < 0) || ((startIndex + length) > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("length must be valid");
        } 
        if (length > 0) {
            final int len = length();
            ensureCapacity((len + length));
            str.getChars(startIndex, (startIndex + length), buffer, len);
            size += length;
        } 
        return ((_returnReplacementOperatorHotSpot1311.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final org.apache.commons.lang3.text.StrBuilder str) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot1317.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (appendNull()));
        } 
        final int strLen = str.length();
        if (strLen > 0) {
            final int len = length();
            ensureCapacity((len + strLen));
            java.lang.System.arraycopy(str.buffer, 0, buffer, len, strLen);
            size += strLen;
        } 
        return ((_returnReplacementOperatorHotSpot1318.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final org.apache.commons.lang3.text.StrBuilder str, final int startIndex, final int length) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot1319.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (appendNull()));
        } 
        if ((startIndex < 0) || (startIndex > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("startIndex must be valid");
        } 
        if ((length < 0) || ((startIndex + length) > (str.length()))) {
            throw new java.lang.StringIndexOutOfBoundsException("length must be valid");
        } 
        if (length > 0) {
            final int len = length();
            ensureCapacity((len + length));
            str.getChars(startIndex, (startIndex + length), buffer, len);
            size += length;
        } 
        return ((_returnReplacementOperatorHotSpot1320.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final char[] chars) {
        if (chars == null) {
            return ((_returnReplacementOperatorHotSpot1281.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (appendNull()));
        } 
        final int strLen = chars.length;
        if (strLen > 0) {
            final int len = length();
            ensureCapacity((len + strLen));
            java.lang.System.arraycopy(chars, 0, buffer, len, strLen);
            size += strLen;
        } 
        return ((_returnReplacementOperatorHotSpot1282.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final char[] chars, final int startIndex, final int length) {
        if (chars == null) {
            return ((_returnReplacementOperatorHotSpot1283.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (appendNull()));
        } 
        if ((startIndex < 0) || (startIndex > (chars.length))) {
            throw new java.lang.StringIndexOutOfBoundsException(("Invalid startIndex: " + length));
        } 
        if ((length < 0) || ((startIndex + length) > (chars.length))) {
            throw new java.lang.StringIndexOutOfBoundsException(("Invalid length: " + length));
        } 
        if (length > 0) {
            final int len = length();
            ensureCapacity((len + length));
            java.lang.System.arraycopy(chars, startIndex, buffer, len, length);
            size += length;
        } 
        return ((_returnReplacementOperatorHotSpot1284.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final boolean value) {
        if (value) {
            ensureCapacity(((size) + 4));
            buffer[(size)++] = 't';
            buffer[(size)++] = 'r';
            buffer[(size)++] = 'u';
            buffer[(size)++] = 'e';
        } else {
            ensureCapacity(((size) + 5));
            buffer[(size)++] = 'f';
            buffer[(size)++] = 'a';
            buffer[(size)++] = 'l';
            buffer[(size)++] = 's';
            buffer[(size)++] = 'e';
        }
        return ((_returnReplacementOperatorHotSpot1279.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    @java.lang.Override
    public org.apache.commons.lang3.text.StrBuilder append(final char ch) {
        final int len = length();
        ensureCapacity((len + 1));
        buffer[(size)++] = ch;
        return ((_returnReplacementOperatorHotSpot1280.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final int value) {
        return ((_returnReplacementOperatorHotSpot1287.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(java.lang.String.valueOf(value))));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final long value) {
        return ((_returnReplacementOperatorHotSpot1316.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(java.lang.String.valueOf(value))));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final float value) {
        return ((_returnReplacementOperatorHotSpot1286.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(java.lang.String.valueOf(value))));
    }

    public org.apache.commons.lang3.text.StrBuilder append(final double value) {
        return ((_returnReplacementOperatorHotSpot1285.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(java.lang.String.valueOf(value))));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.Object obj) {
        return ((_returnReplacementOperatorHotSpot1348.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(obj).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.String str) {
        return ((_returnReplacementOperatorHotSpot1349.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(str).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.String str, final int startIndex, final int length) {
        return ((_returnReplacementOperatorHotSpot1350.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(str, startIndex, length).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.String format, final java.lang.Object... objs) {
        return ((_returnReplacementOperatorHotSpot1351.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(format, objs).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.StringBuffer str) {
        return ((_returnReplacementOperatorHotSpot1352.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(str).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.StringBuilder str) {
        return ((_returnReplacementOperatorHotSpot1354.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(str).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.StringBuilder str, final int startIndex, final int length) {
        return ((_returnReplacementOperatorHotSpot1355.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(str, startIndex, length).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final java.lang.StringBuffer str, final int startIndex, final int length) {
        return ((_returnReplacementOperatorHotSpot1353.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(str, startIndex, length).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final org.apache.commons.lang3.text.StrBuilder str) {
        return ((_returnReplacementOperatorHotSpot1357.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(str).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final org.apache.commons.lang3.text.StrBuilder str, final int startIndex, final int length) {
        return ((_returnReplacementOperatorHotSpot1358.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(str, startIndex, length).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final char[] chars) {
        return ((_returnReplacementOperatorHotSpot1343.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(chars).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final char[] chars, final int startIndex, final int length) {
        return ((_returnReplacementOperatorHotSpot1344.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(chars, startIndex, length).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final boolean value) {
        return ((_returnReplacementOperatorHotSpot1341.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(value).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final char ch) {
        return ((_returnReplacementOperatorHotSpot1342.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(ch).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final int value) {
        return ((_returnReplacementOperatorHotSpot1347.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(value).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final long value) {
        return ((_returnReplacementOperatorHotSpot1356.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(value).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final float value) {
        return ((_returnReplacementOperatorHotSpot1346.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(value).appendNewLine()));
    }

    public org.apache.commons.lang3.text.StrBuilder appendln(final double value) {
        return ((_returnReplacementOperatorHotSpot1345.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(value).appendNewLine()));
    }

    public <T>org.apache.commons.lang3.text.StrBuilder appendAll(final T... array) {
        if ((array != null) && ((array.length) > 0)) {
            for (final java.lang.Object element : array) {
                append(element);
            }
        } 
        return ((_returnReplacementOperatorHotSpot1192.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendAll(final java.lang.Iterable<?> iterable) {
        if (iterable != null) {
            for (final java.lang.Object o : iterable) {
                append(o);
            }
        } 
        return ((_returnReplacementOperatorHotSpot1321.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendAll(final java.util.Iterator<?> it) {
        if (it != null) {
            while (it.hasNext()) {
                append(it.next());
            }
        } 
        return ((_returnReplacementOperatorHotSpot1322.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
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
        return ((_returnReplacementOperatorHotSpot1339.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
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
        return ((_returnReplacementOperatorHotSpot1338.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
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
        return ((_returnReplacementOperatorHotSpot1340.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(final java.lang.String separator) {
        return ((_returnReplacementOperatorHotSpot1335.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (appendSeparator(separator, null)));
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(final java.lang.String standard, final java.lang.String defaultIfEmpty) {
        final java.lang.String str = isEmpty() ? defaultIfEmpty : standard;
        if (str != null) {
            append(str);
        } 
        return ((_returnReplacementOperatorHotSpot1337.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(final char separator) {
        if ((size()) > 0) {
            append(separator);
        } 
        return ((_returnReplacementOperatorHotSpot1332.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(final char standard, final char defaultIfEmpty) {
        if ((size()) > 0) {
            append(standard);
        } else {
            append(defaultIfEmpty);
        }
        return ((_returnReplacementOperatorHotSpot1333.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(final java.lang.String separator, final int loopIndex) {
        if ((separator != null) && (loopIndex > 0)) {
            append(separator);
        } 
        return ((_returnReplacementOperatorHotSpot1336.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendSeparator(final char separator, final int loopIndex) {
        if (loopIndex > 0) {
            append(separator);
        } 
        return ((_returnReplacementOperatorHotSpot1334.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendPadding(final int length, final char padChar) {
        if (length >= 0) {
            ensureCapacity(((size) + length));
            for (int i = 0 ; i < length ; i++) {
                buffer[(size)++] = padChar;
            }
        } 
        return ((_returnReplacementOperatorHotSpot1331.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendFixedWidthPadLeft(final java.lang.Object obj, final int width, final char padChar) {
        if (width > 0) {
            ensureCapacity(((size) + width));
            java.lang.String str = obj == null ? getNullText() : obj.toString();
            if (str == null) {
                str = "";
            } 
            final int strLen = str.length();
            if (strLen >= width) {
                str.getChars((strLen - width), strLen, buffer, size);
            } else {
                final int padLen = width - strLen;
                for (int i = 0 ; i < padLen ; i++) {
                    buffer[((size) + i)] = padChar;
                }
                str.getChars(0, strLen, buffer, ((size) + padLen));
            }
            size += width;
        } 
        return ((_returnReplacementOperatorHotSpot1324.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendFixedWidthPadLeft(final int value, final int width, final char padChar) {
        return ((_returnReplacementOperatorHotSpot1323.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (appendFixedWidthPadLeft(java.lang.String.valueOf(value), width, padChar)));
    }

    public org.apache.commons.lang3.text.StrBuilder appendFixedWidthPadRight(final java.lang.Object obj, final int width, final char padChar) {
        if (width > 0) {
            ensureCapacity(((size) + width));
            java.lang.String str = obj == null ? getNullText() : obj.toString();
            if (str == null) {
                str = "";
            } 
            final int strLen = str.length();
            if (strLen >= width) {
                str.getChars(0, width, buffer, size);
            } else {
                final int padLen = width - strLen;
                str.getChars(0, strLen, buffer, size);
                for (int i = 0 ; i < padLen ; i++) {
                    buffer[(((size) + strLen) + i)] = padChar;
                }
            }
            size += width;
        } 
        return ((_returnReplacementOperatorHotSpot1326.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder appendFixedWidthPadRight(final int value, final int width, final char padChar) {
        return ((_returnReplacementOperatorHotSpot1325.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (appendFixedWidthPadRight(java.lang.String.valueOf(value), width, padChar)));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final java.lang.Object obj) {
        if (obj == null) {
            return ((_returnReplacementOperatorHotSpot1378.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (insert(index, nullText)));
        } 
        return ((_returnReplacementOperatorHotSpot1379.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (insert(index, obj.toString())));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, java.lang.String str) {
        validateIndex(index);
        if (str == null) {
            str = nullText;
        } 
        if (str != null) {
            final int strLen = str.length();
            if (strLen > 0) {
                final int newSize = (size) + strLen;
                ensureCapacity(newSize);
                java.lang.System.arraycopy(buffer, index, buffer, (index + strLen), ((size) - index));
                size = newSize;
                str.getChars(0, strLen, buffer, index);
            } 
        } 
        return ((_returnReplacementOperatorHotSpot1380.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final char[] chars) {
        validateIndex(index);
        if (chars == null) {
            return ((_returnReplacementOperatorHotSpot1371.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (insert(index, nullText)));
        } 
        final int len = chars.length;
        if (len > 0) {
            ensureCapacity(((size) + len));
            java.lang.System.arraycopy(buffer, index, buffer, (index + len), ((size) - index));
            java.lang.System.arraycopy(chars, 0, buffer, index, len);
            size += len;
        } 
        return ((_returnReplacementOperatorHotSpot1372.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final char[] chars, final int offset, final int length) {
        validateIndex(index);
        if (chars == null) {
            return ((_returnReplacementOperatorHotSpot1373.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (insert(index, nullText)));
        } 
        if ((offset < 0) || (offset > (chars.length))) {
            throw new java.lang.StringIndexOutOfBoundsException(("Invalid offset: " + offset));
        } 
        if ((length < 0) || ((offset + length) > (chars.length))) {
            throw new java.lang.StringIndexOutOfBoundsException(("Invalid length: " + length));
        } 
        if (length > 0) {
            ensureCapacity(((size) + length));
            java.lang.System.arraycopy(buffer, index, buffer, (index + length), ((size) - index));
            java.lang.System.arraycopy(chars, offset, buffer, index, length);
            size += length;
        } 
        return ((_returnReplacementOperatorHotSpot1374.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(int index, final boolean value) {
        validateIndex(index);
        if (value) {
            ensureCapacity(((size) + 4));
            java.lang.System.arraycopy(buffer, index, buffer, (index + 4), ((size) - index));
            buffer[index++] = 't';
            buffer[index++] = 'r';
            buffer[index++] = 'u';
            buffer[index] = 'e';
            size += 4;
        } else {
            ensureCapacity(((size) + 5));
            java.lang.System.arraycopy(buffer, index, buffer, (index + 5), ((size) - index));
            buffer[index++] = 'f';
            buffer[index++] = 'a';
            buffer[index++] = 'l';
            buffer[index++] = 's';
            buffer[index] = 'e';
            size += 5;
        }
        return ((_returnReplacementOperatorHotSpot1369.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final char value) {
        validateIndex(index);
        ensureCapacity(((size) + 1));
        java.lang.System.arraycopy(buffer, index, buffer, (index + 1), ((size) - index));
        buffer[index] = value;
        (size)++;
        return ((_returnReplacementOperatorHotSpot1370.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final int value) {
        return ((_returnReplacementOperatorHotSpot1377.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (insert(index, java.lang.String.valueOf(value))));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final long value) {
        return ((_returnReplacementOperatorHotSpot1381.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (insert(index, java.lang.String.valueOf(value))));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final float value) {
        return ((_returnReplacementOperatorHotSpot1376.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (insert(index, java.lang.String.valueOf(value))));
    }

    public org.apache.commons.lang3.text.StrBuilder insert(final int index, final double value) {
        return ((_returnReplacementOperatorHotSpot1375.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (insert(index, java.lang.String.valueOf(value))));
    }

    private void deleteImpl(final int startIndex, final int endIndex, final int len) {
        java.lang.System.arraycopy(buffer, endIndex, buffer, startIndex, ((size) - endIndex));
        size -= len;
    }

    public org.apache.commons.lang3.text.StrBuilder delete(final int startIndex, int endIndex) {
        endIndex = validateRange(startIndex, endIndex);
        final int len = endIndex - startIndex;
        if (len > 0) {
            deleteImpl(startIndex, endIndex, len);
        } 
        return ((_returnReplacementOperatorHotSpot1360.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
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
                final int len = i - start;
                deleteImpl(start, i, len);
                i -= len;
            } 
        }
        return ((_returnReplacementOperatorHotSpot1361.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder deleteFirst(final char ch) {
        for (int i = 0 ; i < (size) ; i++) {
            if ((buffer[i]) == ch) {
                deleteImpl(i, (i + 1), 1);
                break;
            } 
        }
        return ((_returnReplacementOperatorHotSpot1365.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder deleteAll(final java.lang.String str) {
        final int len = str == null ? 0 : str.length();
        if (len > 0) {
            int index = indexOf(str, 0);
            while (index >= 0) {
                deleteImpl(index, (index + len), len);
                index = indexOf(str, index);
            }
        } 
        return ((_returnReplacementOperatorHotSpot1362.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder deleteFirst(final java.lang.String str) {
        final int len = str == null ? 0 : str.length();
        if (len > 0) {
            final int index = indexOf(str, 0);
            if (index >= 0) {
                deleteImpl(index, (index + len), len);
            } 
        } 
        return ((_returnReplacementOperatorHotSpot1366.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder deleteAll(final org.apache.commons.lang3.text.StrMatcher matcher) {
        return ((_returnReplacementOperatorHotSpot1363.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (replace(matcher, null, 0, size, -1)));
    }

    public org.apache.commons.lang3.text.StrBuilder deleteFirst(final org.apache.commons.lang3.text.StrMatcher matcher) {
        return ((_returnReplacementOperatorHotSpot1367.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (replace(matcher, null, 0, size, 1)));
    }

    private void replaceImpl(final int startIndex, final int endIndex, final int removeLen, final java.lang.String insertStr, final int insertLen) {
        final int newSize = ((size) - removeLen) + insertLen;
        if (insertLen != removeLen) {
            ensureCapacity(newSize);
            java.lang.System.arraycopy(buffer, endIndex, buffer, (startIndex + insertLen), ((size) - endIndex));
            size = newSize;
        } 
        if (insertLen > 0) {
            insertStr.getChars(0, insertLen, buffer, startIndex);
        } 
    }

    public org.apache.commons.lang3.text.StrBuilder replace(final int startIndex, int endIndex, final java.lang.String replaceStr) {
        endIndex = validateRange(startIndex, endIndex);
        final int insertLen = replaceStr == null ? 0 : replaceStr.length();
        replaceImpl(startIndex, endIndex, (endIndex - startIndex), replaceStr, insertLen);
        return ((_returnReplacementOperatorHotSpot1383.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder replaceAll(final char search, final char replace) {
        if (search != replace) {
            for (int i = 0 ; i < (size) ; i++) {
                if ((buffer[i]) == search) {
                    buffer[i] = replace;
                } 
            }
        } 
        return ((_returnReplacementOperatorHotSpot1385.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
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
        return ((_returnReplacementOperatorHotSpot1388.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder replaceAll(final java.lang.String searchStr, final java.lang.String replaceStr) {
        final int searchLen = searchStr == null ? 0 : searchStr.length();
        if (searchLen > 0) {
            final int replaceLen = replaceStr == null ? 0 : replaceStr.length();
            int index = indexOf(searchStr, 0);
            while (index >= 0) {
                replaceImpl(index, (index + searchLen), searchLen, replaceStr, replaceLen);
                index = indexOf(searchStr, (index + replaceLen));
            }
        } 
        return ((_returnReplacementOperatorHotSpot1386.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder replaceFirst(final java.lang.String searchStr, final java.lang.String replaceStr) {
        final int searchLen = searchStr == null ? 0 : searchStr.length();
        if (searchLen > 0) {
            final int index = indexOf(searchStr, 0);
            if (index >= 0) {
                final int replaceLen = replaceStr == null ? 0 : replaceStr.length();
                replaceImpl(index, (index + searchLen), searchLen, replaceStr, replaceLen);
            } 
        } 
        return ((_returnReplacementOperatorHotSpot1389.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder replaceAll(final org.apache.commons.lang3.text.StrMatcher matcher, final java.lang.String replaceStr) {
        return ((_returnReplacementOperatorHotSpot1387.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (replace(matcher, replaceStr, 0, size, -1)));
    }

    public org.apache.commons.lang3.text.StrBuilder replaceFirst(final org.apache.commons.lang3.text.StrMatcher matcher, final java.lang.String replaceStr) {
        return ((_returnReplacementOperatorHotSpot1390.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (replace(matcher, replaceStr, 0, size, 1)));
    }

    public org.apache.commons.lang3.text.StrBuilder replace(final org.apache.commons.lang3.text.StrMatcher matcher, final java.lang.String replaceStr, final int startIndex, int endIndex, final int replaceCount) {
        endIndex = validateRange(startIndex, endIndex);
        return ((_returnReplacementOperatorHotSpot1384.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (replaceImpl(matcher, replaceStr, startIndex, endIndex, replaceCount)));
    }

    private org.apache.commons.lang3.text.StrBuilder replaceImpl(final org.apache.commons.lang3.text.StrMatcher matcher, final java.lang.String replaceStr, final int from, int to, int replaceCount) {
        if ((matcher == null) || ((size) == 0)) {
            return ((_returnReplacementOperatorHotSpot1391.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        final int replaceLen = replaceStr == null ? 0 : replaceStr.length();
        final char[] buf = buffer;
        for (int i = from ; (i < to) && (replaceCount != 0) ; i++) {
            final int removeLen = matcher.isMatch(buf, i, from, to);
            if (removeLen > 0) {
                replaceImpl(i, (i + removeLen), removeLen, replaceStr, replaceLen);
                to = (to - removeLen) + replaceLen;
                i = (i + replaceLen) - 1;
                if (replaceCount > 0) {
                    replaceCount--;
                } 
            } 
        }
        return ((_returnReplacementOperatorHotSpot1392.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder reverse() {
        if ((size) == 0) {
            return ((_returnReplacementOperatorHotSpot1393.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        final int half = (size) / 2;
        final char[] buf = buffer;
        for (int leftIdx = 0, rightIdx = (size) - 1 ; leftIdx < half ; leftIdx++ , rightIdx--) {
            final char swap = buf[leftIdx];
            buf[leftIdx] = buf[rightIdx];
            buf[rightIdx] = swap;
        }
        return ((_returnReplacementOperatorHotSpot1394.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.text.StrBuilder trim() {
        if ((size) == 0) {
            return ((_returnReplacementOperatorHotSpot1399.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        int len = size;
        final char[] buf = buffer;
        int pos = 0;
        while ((pos < len) && ((buf[pos]) <= ' ')) {
            pos++;
        }
        while ((pos < len) && ((buf[(len - 1)]) <= ' ')) {
            len--;
        }
        if (len < (size)) {
            delete(len, size);
        } 
        if (pos > 0) {
            delete(0, pos);
        } 
        return ((_returnReplacementOperatorHotSpot1400.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public boolean startsWith(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot1213.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        final int len = str.length();
        if (len == 0) {
            return ((_returnReplacementOperatorHotSpot1214.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if (len > (size)) {
            return ((_returnReplacementOperatorHotSpot1215.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        for (int i = 0 ; i < len ; i++) {
            if ((buffer[i]) != (str.charAt(i))) {
                return ((_returnReplacementOperatorHotSpot1216.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperatorHotSpot1217.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    public boolean endsWith(final java.lang.String str) {
        if (str == null) {
            return ((_returnReplacementOperatorHotSpot1197.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        final int len = str.length();
        if (len == 0) {
            return ((_returnReplacementOperatorHotSpot1198.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if (len > (size)) {
            return ((_returnReplacementOperatorHotSpot1199.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        int pos = (size) - len;
        for (int i = 0 ; i < len ; i++ , pos++) {
            if ((buffer[pos]) != (str.charAt(i))) {
                return ((_returnReplacementOperatorHotSpot1200.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperatorHotSpot1201.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
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
            throw new java.lang.StringIndexOutOfBoundsException((endIndex - startIndex));
        } 
        return ((_returnReplacementOperatorHotSpot1261.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (substring(startIndex, endIndex)));
    }

    public java.lang.String substring(final int start) {
        return ((_returnReplacementOperatorHotSpot1274.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (substring(start, size)));
    }

    public java.lang.String substring(final int startIndex, int endIndex) {
        endIndex = validateRange(startIndex, endIndex);
        return ((_returnReplacementOperatorHotSpot1275.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.lang.String(buffer , startIndex , (endIndex - startIndex))));
    }

    public java.lang.String leftString(final int length) {
        if (length <= 0) {
            return ((_returnReplacementOperatorHotSpot1265.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (""));
        } else if (length >= (size)) {
            return ((_returnReplacementOperatorHotSpot1266.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.lang.String(buffer , 0 , size)));
        } else {
            return ((_returnReplacementOperatorHotSpot1267.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.lang.String(buffer , 0 , length)));
        }
    }

    public java.lang.String rightString(final int length) {
        if (length <= 0) {
            return ((_returnReplacementOperatorHotSpot1271.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (""));
        } else if (length >= (size)) {
            return ((_returnReplacementOperatorHotSpot1272.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.lang.String(buffer , 0 , size)));
        } else {
            return ((_returnReplacementOperatorHotSpot1273.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.lang.String(buffer , ((size) - length) , length)));
        }
    }

    public java.lang.String midString(int index, final int length) {
        if (index < 0) {
            index = 0;
        } 
        if ((length <= 0) || (index >= (size))) {
            return ((_returnReplacementOperatorHotSpot1268.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (""));
        } 
        if ((size) <= (index + length)) {
            return ((_returnReplacementOperatorHotSpot1269.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.lang.String(buffer , index , ((size) - index))));
        } 
        return ((_returnReplacementOperatorHotSpot1270.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.lang.String(buffer , index , length)));
    }

    public boolean contains(final char ch) {
        final char[] thisBuf = buffer;
        for (int i = 0 ; i < (this.size) ; i++) {
            if ((thisBuf[i]) == ch) {
                return ((_returnReplacementOperatorHotSpot1193.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
            } 
        }
        return ((_returnReplacementOperatorHotSpot1194.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
    }

    public boolean contains(final java.lang.String str) {
        return ((_returnReplacementOperatorHotSpot1195.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((indexOf(str, 0)) >= 0));
    }

    public boolean contains(final org.apache.commons.lang3.text.StrMatcher matcher) {
        return ((_returnReplacementOperatorHotSpot1196.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((indexOf(matcher, 0)) >= 0));
    }

    public int indexOf(final char ch) {
        return ((_returnReplacementOperatorHotSpot1226.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1226.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1226.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (indexOf(ch, 0)));
    }

    public int indexOf(final char ch, int startIndex) {
        startIndex = startIndex < 0 ? 0 : startIndex;
        if (startIndex >= (size)) {
            return ((_returnReplacementOperatorHotSpot1227.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1227.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1227.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
        } 
        final char[] thisBuf = buffer;
        for (int i = startIndex ; i < (size) ; i++) {
            if ((thisBuf[i]) == ch) {
                return ((_returnReplacementOperatorHotSpot1228.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1228.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1228.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot1229.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1229.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1229.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
    }

    public int indexOf(final java.lang.String str) {
        return ((_returnReplacementOperatorHotSpot1230.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1230.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1230.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (indexOf(str, 0)));
    }

    public int indexOf(final java.lang.String str, int startIndex) {
        startIndex = startIndex < 0 ? 0 : startIndex;
        if ((str == null) || (startIndex >= (size))) {
            return ((_returnReplacementOperatorHotSpot1231.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1231.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1231.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
        } 
        final int strLen = str.length();
        if (strLen == 1) {
            return ((_returnReplacementOperatorHotSpot1232.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1232.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1232.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (indexOf(str.charAt(0), startIndex)));
        } 
        if (strLen == 0) {
            return ((_returnReplacementOperatorHotSpot1233.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1233.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1233.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (startIndex));
        } 
        if (strLen > (size)) {
            return ((_returnReplacementOperatorHotSpot1234.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1234.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1234.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
        } 
        final char[] thisBuf = buffer;
        final int len = ((size) - strLen) + 1;
        outer : for (int i = startIndex ; i < len ; i++) {
            for (int j = 0 ; j < strLen ; j++) {
                if ((str.charAt(j)) != (thisBuf[(i + j)])) {
                    continue outer;
                } 
            }
            return ((_returnReplacementOperatorHotSpot1235.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1235.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1235.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
        }
        return ((_returnReplacementOperatorHotSpot1236.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1236.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1236.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
    }

    public int indexOf(final org.apache.commons.lang3.text.StrMatcher matcher) {
        return ((_returnReplacementOperatorHotSpot1237.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1237.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1237.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (indexOf(matcher, 0)));
    }

    public int indexOf(final org.apache.commons.lang3.text.StrMatcher matcher, int startIndex) {
        startIndex = startIndex < 0 ? 0 : startIndex;
        if ((matcher == null) || (startIndex >= (size))) {
            return ((_returnReplacementOperatorHotSpot1238.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1238.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1238.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
        } 
        final int len = size;
        final char[] buf = buffer;
        for (int i = startIndex ; i < len ; i++) {
            if ((matcher.isMatch(buf, i, startIndex, len)) > 0) {
                return ((_returnReplacementOperatorHotSpot1239.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1239.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1239.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot1240.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1240.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1240.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
    }

    public int lastIndexOf(final char ch) {
        return ((_returnReplacementOperatorHotSpot1241.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1241.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1241.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (lastIndexOf(ch, ((size) - 1))));
    }

    public int lastIndexOf(final char ch, int startIndex) {
        startIndex = startIndex >= (size) ? (size) - 1 : startIndex;
        if (startIndex < 0) {
            return ((_returnReplacementOperatorHotSpot1242.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1242.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1242.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
        } 
        for (int i = startIndex ; i >= 0 ; i--) {
            if ((buffer[i]) == ch) {
                return ((_returnReplacementOperatorHotSpot1243.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1243.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1243.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot1244.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1244.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1244.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
    }

    public int lastIndexOf(final java.lang.String str) {
        return ((_returnReplacementOperatorHotSpot1245.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1245.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1245.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (lastIndexOf(str, ((size) - 1))));
    }

    public int lastIndexOf(final java.lang.String str, int startIndex) {
        startIndex = startIndex >= (size) ? (size) - 1 : startIndex;
        if ((str == null) || (startIndex < 0)) {
            return ((_returnReplacementOperatorHotSpot1246.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1246.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1246.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
        } 
        final int strLen = str.length();
        if ((strLen > 0) && (strLen <= (size))) {
            if (strLen == 1) {
                return ((_returnReplacementOperatorHotSpot1247.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1247.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1247.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (lastIndexOf(str.charAt(0), startIndex)));
            } 
            outer : for (int i = (startIndex - strLen) + 1 ; i >= 0 ; i--) {
                for (int j = 0 ; j < strLen ; j++) {
                    if ((str.charAt(j)) != (buffer[(i + j)])) {
                        continue outer;
                    } 
                }
                return ((_returnReplacementOperatorHotSpot1248.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1248.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1248.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            }
        } else if (strLen == 0) {
            return ((_returnReplacementOperatorHotSpot1249.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1249.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1249.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (startIndex));
        } 
        return ((_returnReplacementOperatorHotSpot1250.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1250.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1250.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
    }

    public int lastIndexOf(final org.apache.commons.lang3.text.StrMatcher matcher) {
        return ((_returnReplacementOperatorHotSpot1251.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1251.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1251.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (lastIndexOf(matcher, size)));
    }

    public int lastIndexOf(final org.apache.commons.lang3.text.StrMatcher matcher, int startIndex) {
        startIndex = startIndex >= (size) ? (size) - 1 : startIndex;
        if ((matcher == null) || (startIndex < 0)) {
            return ((_returnReplacementOperatorHotSpot1252.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1252.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1252.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
        } 
        final char[] buf = buffer;
        final int endIndex = startIndex + 1;
        for (int i = startIndex ; i >= 0 ; i--) {
            if ((matcher.isMatch(buf, i, 0, endIndex)) > 0) {
                return ((_returnReplacementOperatorHotSpot1253.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1253.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1253.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (i));
            } 
        }
        return ((_returnReplacementOperatorHotSpot1254.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1254.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1254.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
    }

    public org.apache.commons.lang3.text.StrTokenizer asTokenizer() {
        return ((_returnReplacementOperatorHotSpot1401.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.text.StrBuilder.StrBuilderTokenizer()));
    }

    public java.io.Reader asReader() {
        return ((_returnReplacementOperatorHotSpot1259.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.text.StrBuilder.StrBuilderReader()));
    }

    public java.io.Writer asWriter() {
        return ((_returnReplacementOperatorHotSpot1260.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter()));
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
            return ((_returnReplacementOperatorHotSpot1208.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if ((this.size) != (other.size)) {
            return ((_returnReplacementOperatorHotSpot1209.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        final char[] thisBuf = this.buffer;
        final char[] otherBuf = other.buffer;
        for (int i = (size) - 1 ; i >= 0 ; i--) {
            final char c1 = thisBuf[i];
            final char c2 = otherBuf[i];
            if ((c1 != c2) && ((java.lang.Character.toUpperCase(c1)) != (java.lang.Character.toUpperCase(c2)))) {
                return ((_returnReplacementOperatorHotSpot1210.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperatorHotSpot1211.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    public boolean equals(final org.apache.commons.lang3.text.StrBuilder other) {
        if ((this) == other) {
            return ((_returnReplacementOperatorHotSpot1203.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
        } 
        if (other == null) {
            return ((_returnReplacementOperatorHotSpot1204.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        if ((this.size) != (other.size)) {
            return ((_returnReplacementOperatorHotSpot1205.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
        } 
        final char[] thisBuf = this.buffer;
        final char[] otherBuf = other.buffer;
        for (int i = (size) - 1 ; i >= 0 ; i--) {
            if ((thisBuf[i]) != (otherBuf[i])) {
                return ((_returnReplacementOperatorHotSpot1206.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (false));
            } 
        }
        return ((_returnReplacementOperatorHotSpot1207.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        return ((_returnReplacementOperatorHotSpot1202.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((obj instanceof org.apache.commons.lang3.text.StrBuilder) && (equals(((org.apache.commons.lang3.text.StrBuilder)(obj))))));
    }

    @java.lang.Override
    public int hashCode() {
        final char[] buf = buffer;
        int hash = 0;
        for (int i = (size) - 1 ; i >= 0 ; i--) {
            hash = (31 * hash) + (buf[i]);
        }
        return ((_returnReplacementOperatorHotSpot1225.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1225.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1225.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (hash));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return ((_returnReplacementOperatorHotSpot1276.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.lang.String(buffer , 0 , size)));
    }

    public java.lang.StringBuffer toStringBuffer() {
        return ((_returnReplacementOperatorHotSpot1277.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.lang.StringBuffer(size).append(buffer, 0, size)));
    }

    public java.lang.StringBuilder toStringBuilder() {
        return ((_returnReplacementOperatorHotSpot1278.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new java.lang.StringBuilder(size).append(buffer, 0, size)));
    }

    @java.lang.Override
    public java.lang.String build() {
        return ((_returnReplacementOperatorHotSpot1262.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (toString()));
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
        return ((_returnReplacementOperatorHotSpot1258.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1258.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1258.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (endIndex));
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
                return ((_returnReplacementOperatorHotSpot1190.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (super.tokenize(org.apache.commons.lang3.text.StrBuilder.this.buffer, 0, org.apache.commons.lang3.text.StrBuilder.this.size())));
            } 
            return ((_returnReplacementOperatorHotSpot1191.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (super.tokenize(chars, offset, count)));
        }

        @java.lang.Override
        public java.lang.String getContent() {
            final java.lang.String str = super.getContent();
            if (str == null) {
                return ((_returnReplacementOperatorHotSpot1188.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.StrBuilder.this.toString()));
            } 
            return ((_returnReplacementOperatorHotSpot1189.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (str));
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
                return ((_returnReplacementOperatorHotSpot1181.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1181.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1181.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
            } 
            return ((_returnReplacementOperatorHotSpot1182.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.text.StrBuilder.this.charAt((pos)++)));
        }

        @java.lang.Override
        public int read(final char[] b, final int off, int len) {
            if (((((off < 0) || (len < 0)) || (off > (b.length))) || ((off + len) > (b.length))) || ((off + len) < 0)) {
                throw new java.lang.IndexOutOfBoundsException();
            } 
            if (len == 0) {
                return ((_returnReplacementOperatorHotSpot1183.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1183.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1183.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
            } 
            if ((pos) >= (org.apache.commons.lang3.text.StrBuilder.this.size())) {
                return ((_returnReplacementOperatorHotSpot1184.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1184.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1184.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (-1));
            } 
            if (((pos) + len) > (size())) {
                len = (org.apache.commons.lang3.text.StrBuilder.this.size()) - (pos);
            } 
            org.apache.commons.lang3.text.StrBuilder.this.getChars(pos, ((pos) + len), b, off);
            pos += len;
            return ((_returnReplacementOperatorHotSpot1185.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1185.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1185.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (len));
        }

        @java.lang.Override
        public long skip(long n) {
            if (((pos) + n) > (org.apache.commons.lang3.text.StrBuilder.this.size())) {
                n = (org.apache.commons.lang3.text.StrBuilder.this.size()) - (pos);
            } 
            if (n < 0) {
                return ((_returnReplacementOperatorHotSpot1186.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN)) ? ( -2147483647 ) : (_returnReplacementOperatorHotSpot1186.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX)) ? ( 2147483646 ) : (_returnReplacementOperatorHotSpot1186.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO)) ? ( 0 ) : (0));
            } 
            pos += n;
            return ((_returnReplacementOperatorHotSpot1187.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (n));
        }

        @java.lang.Override
        public boolean ready() {
            return ((_returnReplacementOperatorHotSpot1180.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : ((pos) < (org.apache.commons.lang3.text.StrBuilder.this.size())));
        }

        @java.lang.Override
        public boolean markSupported() {
            return ((_returnReplacementOperatorHotSpot1179.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (true));
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

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1179 = metamutator.Selector.of(1179,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1179");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1180 = metamutator.Selector.of(1180,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1180");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1181 = metamutator.Selector.of(1181,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1181");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1182 = metamutator.Selector.of(1182,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1182");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1183 = metamutator.Selector.of(1183,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1183");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1184 = metamutator.Selector.of(1184,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1184");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1185 = metamutator.Selector.of(1185,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1185");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1186 = metamutator.Selector.of(1186,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).id("_returnReplacementOperatorHotSpot1186");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1187 = metamutator.Selector.of(1187,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1187");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1188 = metamutator.Selector.of(1188,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1188");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1189 = metamutator.Selector.of(1189,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1189");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1190 = metamutator.Selector.of(1190,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1190");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1191 = metamutator.Selector.of(1191,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot1191");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1192 = metamutator.Selector.of(1192,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1192");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1193 = metamutator.Selector.of(1193,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1193");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1194 = metamutator.Selector.of(1194,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1194");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1195 = metamutator.Selector.of(1195,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1195");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1196 = metamutator.Selector.of(1196,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1196");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1197 = metamutator.Selector.of(1197,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1197");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1198 = metamutator.Selector.of(1198,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1198");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1199 = metamutator.Selector.of(1199,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1199");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1200 = metamutator.Selector.of(1200,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1200");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1201 = metamutator.Selector.of(1201,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1201");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1202 = metamutator.Selector.of(1202,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1202");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1203 = metamutator.Selector.of(1203,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1203");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1204 = metamutator.Selector.of(1204,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1204");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1205 = metamutator.Selector.of(1205,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1205");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1206 = metamutator.Selector.of(1206,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1206");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1207 = metamutator.Selector.of(1207,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1207");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1208 = metamutator.Selector.of(1208,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1208");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1209 = metamutator.Selector.of(1209,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1209");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1210 = metamutator.Selector.of(1210,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1210");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1211 = metamutator.Selector.of(1211,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1211");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1212 = metamutator.Selector.of(1212,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1212");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1213 = metamutator.Selector.of(1213,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1213");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1214 = metamutator.Selector.of(1214,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1214");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1215 = metamutator.Selector.of(1215,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1215");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1216 = metamutator.Selector.of(1216,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1216");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1217 = metamutator.Selector.of(1217,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1217");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1218 = metamutator.Selector.of(1218,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1218");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1219 = metamutator.Selector.of(1219,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1219");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1220 = metamutator.Selector.of(1220,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1220");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1221 = metamutator.Selector.of(1221,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1221");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1222 = metamutator.Selector.of(1222,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1222");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1223 = metamutator.Selector.of(1223,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1223");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1224 = metamutator.Selector.of(1224,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1224");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1225 = metamutator.Selector.of(1225,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1225");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1226 = metamutator.Selector.of(1226,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1226");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1227 = metamutator.Selector.of(1227,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1227");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1228 = metamutator.Selector.of(1228,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1228");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1229 = metamutator.Selector.of(1229,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1229");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1230 = metamutator.Selector.of(1230,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1230");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1231 = metamutator.Selector.of(1231,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1231");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1232 = metamutator.Selector.of(1232,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1232");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1233 = metamutator.Selector.of(1233,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1233");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1234 = metamutator.Selector.of(1234,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1234");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1235 = metamutator.Selector.of(1235,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1235");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1236 = metamutator.Selector.of(1236,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1236");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1237 = metamutator.Selector.of(1237,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1237");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1238 = metamutator.Selector.of(1238,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1238");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1239 = metamutator.Selector.of(1239,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1239");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1240 = metamutator.Selector.of(1240,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1240");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1241 = metamutator.Selector.of(1241,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1241");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1242 = metamutator.Selector.of(1242,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1242");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1243 = metamutator.Selector.of(1243,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1243");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1244 = metamutator.Selector.of(1244,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1244");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1245 = metamutator.Selector.of(1245,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1245");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1246 = metamutator.Selector.of(1246,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1246");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1247 = metamutator.Selector.of(1247,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1247");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1248 = metamutator.Selector.of(1248,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1248");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1249 = metamutator.Selector.of(1249,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1249");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1250 = metamutator.Selector.of(1250,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1250");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1251 = metamutator.Selector.of(1251,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1251");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1252 = metamutator.Selector.of(1252,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1252");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1253 = metamutator.Selector.of(1253,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1253");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1254 = metamutator.Selector.of(1254,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1254");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1255 = metamutator.Selector.of(1255,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1255");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1256 = metamutator.Selector.of(1256,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1256");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1257 = metamutator.Selector.of(1257,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1257");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1258 = metamutator.Selector.of(1258,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MIN,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.INT_MAX,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_INT.ZERO}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1258");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1259 = metamutator.Selector.of(1259,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1259");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1260 = metamutator.Selector.of(1260,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1260");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1261 = metamutator.Selector.of(1261,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1261");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1262 = metamutator.Selector.of(1262,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1262");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1263 = metamutator.Selector.of(1263,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1263");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1264 = metamutator.Selector.of(1264,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1264");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1265 = metamutator.Selector.of(1265,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1265");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1266 = metamutator.Selector.of(1266,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1266");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1267 = metamutator.Selector.of(1267,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1267");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1268 = metamutator.Selector.of(1268,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1268");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1269 = metamutator.Selector.of(1269,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1269");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1270 = metamutator.Selector.of(1270,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1270");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1271 = metamutator.Selector.of(1271,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1271");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1272 = metamutator.Selector.of(1272,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1272");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1273 = metamutator.Selector.of(1273,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1273");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1274 = metamutator.Selector.of(1274,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1274");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1275 = metamutator.Selector.of(1275,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1275");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1276 = metamutator.Selector.of(1276,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1276");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1277 = metamutator.Selector.of(1277,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1277");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1278 = metamutator.Selector.of(1278,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1278");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1279 = metamutator.Selector.of(1279,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1279");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1280 = metamutator.Selector.of(1280,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1280");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1281 = metamutator.Selector.of(1281,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1281");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1282 = metamutator.Selector.of(1282,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1282");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1283 = metamutator.Selector.of(1283,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1283");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1284 = metamutator.Selector.of(1284,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1284");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1285 = metamutator.Selector.of(1285,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1285");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1286 = metamutator.Selector.of(1286,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1286");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1287 = metamutator.Selector.of(1287,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1287");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1288 = metamutator.Selector.of(1288,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1288");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1289 = metamutator.Selector.of(1289,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1289");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1290 = metamutator.Selector.of(1290,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1290");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1291 = metamutator.Selector.of(1291,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1291");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1292 = metamutator.Selector.of(1292,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1292");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1293 = metamutator.Selector.of(1293,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1293");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1294 = metamutator.Selector.of(1294,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1294");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1295 = metamutator.Selector.of(1295,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1295");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1296 = metamutator.Selector.of(1296,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1296");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1297 = metamutator.Selector.of(1297,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1297");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1298 = metamutator.Selector.of(1298,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1298");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1299 = metamutator.Selector.of(1299,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1299");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1300 = metamutator.Selector.of(1300,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1300");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1301 = metamutator.Selector.of(1301,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1301");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1302 = metamutator.Selector.of(1302,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1302");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1303 = metamutator.Selector.of(1303,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1303");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1304 = metamutator.Selector.of(1304,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1304");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1305 = metamutator.Selector.of(1305,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1305");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1306 = metamutator.Selector.of(1306,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1306");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1307 = metamutator.Selector.of(1307,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1307");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1308 = metamutator.Selector.of(1308,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1308");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1309 = metamutator.Selector.of(1309,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1309");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1310 = metamutator.Selector.of(1310,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1310");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1311 = metamutator.Selector.of(1311,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1311");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1312 = metamutator.Selector.of(1312,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1312");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1313 = metamutator.Selector.of(1313,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1313");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1314 = metamutator.Selector.of(1314,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1314");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1315 = metamutator.Selector.of(1315,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1315");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1316 = metamutator.Selector.of(1316,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1316");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1317 = metamutator.Selector.of(1317,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1317");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1318 = metamutator.Selector.of(1318,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1318");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1319 = metamutator.Selector.of(1319,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1319");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1320 = metamutator.Selector.of(1320,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1320");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1321 = metamutator.Selector.of(1321,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1321");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1322 = metamutator.Selector.of(1322,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1322");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1323 = metamutator.Selector.of(1323,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1323");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1324 = metamutator.Selector.of(1324,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1324");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1325 = metamutator.Selector.of(1325,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1325");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1326 = metamutator.Selector.of(1326,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1326");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1327 = metamutator.Selector.of(1327,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1327");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1328 = metamutator.Selector.of(1328,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1328");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1329 = metamutator.Selector.of(1329,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1329");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1330 = metamutator.Selector.of(1330,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1330");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1331 = metamutator.Selector.of(1331,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1331");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1332 = metamutator.Selector.of(1332,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1332");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1333 = metamutator.Selector.of(1333,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1333");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1334 = metamutator.Selector.of(1334,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1334");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1335 = metamutator.Selector.of(1335,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1335");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1336 = metamutator.Selector.of(1336,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1336");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1337 = metamutator.Selector.of(1337,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1337");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1338 = metamutator.Selector.of(1338,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1338");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1339 = metamutator.Selector.of(1339,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1339");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1340 = metamutator.Selector.of(1340,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1340");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1341 = metamutator.Selector.of(1341,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1341");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1342 = metamutator.Selector.of(1342,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1342");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1343 = metamutator.Selector.of(1343,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1343");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1344 = metamutator.Selector.of(1344,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1344");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1345 = metamutator.Selector.of(1345,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1345");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1346 = metamutator.Selector.of(1346,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1346");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1347 = metamutator.Selector.of(1347,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1347");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1348 = metamutator.Selector.of(1348,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1348");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1349 = metamutator.Selector.of(1349,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1349");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1350 = metamutator.Selector.of(1350,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1350");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1351 = metamutator.Selector.of(1351,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1351");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1352 = metamutator.Selector.of(1352,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1352");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1353 = metamutator.Selector.of(1353,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1353");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1354 = metamutator.Selector.of(1354,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1354");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1355 = metamutator.Selector.of(1355,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1355");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1356 = metamutator.Selector.of(1356,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1356");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1357 = metamutator.Selector.of(1357,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1357");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1358 = metamutator.Selector.of(1358,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1358");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1359 = metamutator.Selector.of(1359,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1359");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1360 = metamutator.Selector.of(1360,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1360");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1361 = metamutator.Selector.of(1361,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1361");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1362 = metamutator.Selector.of(1362,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1362");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1363 = metamutator.Selector.of(1363,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1363");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1364 = metamutator.Selector.of(1364,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1364");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1365 = metamutator.Selector.of(1365,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1365");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1366 = metamutator.Selector.of(1366,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1366");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1367 = metamutator.Selector.of(1367,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1367");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1368 = metamutator.Selector.of(1368,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1368");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1369 = metamutator.Selector.of(1369,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1369");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1370 = metamutator.Selector.of(1370,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1370");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1371 = metamutator.Selector.of(1371,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1371");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1372 = metamutator.Selector.of(1372,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1372");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1373 = metamutator.Selector.of(1373,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1373");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1374 = metamutator.Selector.of(1374,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1374");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1375 = metamutator.Selector.of(1375,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1375");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1376 = metamutator.Selector.of(1376,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1376");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1377 = metamutator.Selector.of(1377,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1377");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1378 = metamutator.Selector.of(1378,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1378");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1379 = metamutator.Selector.of(1379,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1379");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1380 = metamutator.Selector.of(1380,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1380");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1381 = metamutator.Selector.of(1381,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1381");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1382 = metamutator.Selector.of(1382,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1382");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1383 = metamutator.Selector.of(1383,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1383");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1384 = metamutator.Selector.of(1384,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1384");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1385 = metamutator.Selector.of(1385,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1385");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1386 = metamutator.Selector.of(1386,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1386");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1387 = metamutator.Selector.of(1387,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1387");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1388 = metamutator.Selector.of(1388,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1388");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1389 = metamutator.Selector.of(1389,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1389");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1390 = metamutator.Selector.of(1390,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1390");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1391 = metamutator.Selector.of(1391,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1391");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1392 = metamutator.Selector.of(1392,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1392");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1393 = metamutator.Selector.of(1393,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1393");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1394 = metamutator.Selector.of(1394,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1394");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1395 = metamutator.Selector.of(1395,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1395");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1396 = metamutator.Selector.of(1396,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1396");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1397 = metamutator.Selector.of(1397,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1397");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1398 = metamutator.Selector.of(1398,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1398");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1399 = metamutator.Selector.of(1399,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1399");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1400 = metamutator.Selector.of(1400,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1400");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot1401 = metamutator.Selector.of(1401,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.text.StrBuilder.class).id("_returnReplacementOperatorHotSpot1401");
}

