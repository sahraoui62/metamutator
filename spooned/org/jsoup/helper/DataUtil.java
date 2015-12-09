package org.jsoup.helper;


public final class DataUtil {
    private static final java.util.regex.Pattern charsetPattern = java.util.regex.Pattern.compile("(?i)\\bcharset=\\s*(?:\"|\')?([^\\s,;\"\']*)");

    static final java.lang.String defaultCharset = "UTF-8";

    private static final int bufferSize = 131072;

    private static final int UNICODE_BOM = 65279;

    private static final char[] mimeBoundaryChars = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    static final int boundaryLength = 32;

    private DataUtil() {
    }

    public static org.jsoup.nodes.Document load(java.io.File in, java.lang.String charsetName, java.lang.String baseUri) throws java.io.IOException {
        java.nio.ByteBuffer byteData = org.jsoup.helper.DataUtil.readFileToByteBuffer(in);
        return org.jsoup.helper.DataUtil.parseByteData(byteData, charsetName, baseUri, org.jsoup.parser.Parser.htmlParser());
    }

    public static org.jsoup.nodes.Document load(java.io.InputStream in, java.lang.String charsetName, java.lang.String baseUri) throws java.io.IOException {
        java.nio.ByteBuffer byteData = org.jsoup.helper.DataUtil.readToByteBuffer(in);
        return org.jsoup.helper.DataUtil.parseByteData(byteData, charsetName, baseUri, org.jsoup.parser.Parser.htmlParser());
    }

    public static org.jsoup.nodes.Document load(java.io.InputStream in, java.lang.String charsetName, java.lang.String baseUri, org.jsoup.parser.Parser parser) throws java.io.IOException {
        java.nio.ByteBuffer byteData = org.jsoup.helper.DataUtil.readToByteBuffer(in);
        return org.jsoup.helper.DataUtil.parseByteData(byteData, charsetName, baseUri, parser);
    }

    static void crossStreams(final java.io.InputStream in, final java.io.OutputStream out) throws java.io.IOException {
        final byte[] buffer = new byte[bufferSize];
        int len;
        while ((len = in.read(buffer)) != (-1)) {
            out.write(buffer, 0, len);
        }
    }

    static org.jsoup.nodes.Document parseByteData(java.nio.ByteBuffer byteData, java.lang.String charsetName, java.lang.String baseUri, org.jsoup.parser.Parser parser) {
        java.lang.String docData;
        org.jsoup.nodes.Document doc = null;
        if (charsetName == null) {
            docData = java.nio.charset.Charset.forName(defaultCharset).decode(byteData).toString();
            doc = parser.parseInput(docData, baseUri);
            org.jsoup.nodes.Element meta = doc.select("meta[http-equiv=content-type], meta[charset]").first();
            if (meta != null) {
                java.lang.String foundCharset = null;
                if (meta.hasAttr("http-equiv")) {
                    foundCharset = org.jsoup.helper.DataUtil.getCharsetFromContentType(meta.attr("content"));
                } 
                if ((foundCharset == null) && (meta.hasAttr("charset"))) {
                    try {
                        if (java.nio.charset.Charset.isSupported(meta.attr("charset"))) {
                            foundCharset = meta.attr("charset");
                        } 
                    } catch (java.nio.charset.IllegalCharsetNameException e) {
                        foundCharset = null;
                    }
                } 
                if (((foundCharset != null) && ((foundCharset.length()) != 0)) && (!(foundCharset.equals(defaultCharset)))) {
                    foundCharset = foundCharset.trim().replaceAll("[\"\']", "");
                    charsetName = foundCharset;
                    byteData.rewind();
                    docData = java.nio.charset.Charset.forName(foundCharset).decode(byteData).toString();
                    doc = null;
                } 
            } 
        } else {
            org.jsoup.helper.Validate.notEmpty(charsetName, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
            docData = java.nio.charset.Charset.forName(charsetName).decode(byteData).toString();
        }
        if (((docData.length()) > 0) && ((docData.charAt(0)) == (UNICODE_BOM))) {
            byteData.rewind();
            docData = java.nio.charset.Charset.forName(defaultCharset).decode(byteData).toString();
            docData = docData.substring(1);
            charsetName = defaultCharset;
            doc = null;
        } 
        if (doc == null) {
            doc = parser.parseInput(docData, baseUri);
            doc.outputSettings().charset(charsetName);
        } 
        return doc;
    }

    static java.nio.ByteBuffer readToByteBuffer(java.io.InputStream inStream, int maxSize) throws java.io.IOException {
        org.jsoup.helper.Validate.isTrue((maxSize >= 0), "maxSize must be 0 (unlimited) or larger");
        final boolean capped = maxSize > 0;
        byte[] buffer = new byte[bufferSize];
        java.io.ByteArrayOutputStream outStream = new java.io.ByteArrayOutputStream(bufferSize);
        int read;
        int remaining = maxSize;
        while (true) {
            read = inStream.read(buffer);
            if (read == (-1))
                break;
            
            if (capped) {
                if (read > remaining) {
                    outStream.write(buffer, 0, remaining);
                    break;
                } 
                remaining -= read;
            } 
            outStream.write(buffer, 0, read);
        }
        return java.nio.ByteBuffer.wrap(outStream.toByteArray());
    }

    static java.nio.ByteBuffer readToByteBuffer(java.io.InputStream inStream) throws java.io.IOException {
        return org.jsoup.helper.DataUtil.readToByteBuffer(inStream, 0);
    }

    static java.nio.ByteBuffer readFileToByteBuffer(java.io.File file) throws java.io.IOException {
        java.io.RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new java.io.RandomAccessFile(file , "r");
            byte[] bytes = new byte[((int)(randomAccessFile.length()))];
            randomAccessFile.readFully(bytes);
            return java.nio.ByteBuffer.wrap(bytes);
        } finally {
            if (randomAccessFile != null)
                randomAccessFile.close();
            
        }
    }

    static java.nio.ByteBuffer emptyByteBuffer() {
        return java.nio.ByteBuffer.allocate(0);
    }

    static java.lang.String getCharsetFromContentType(java.lang.String contentType) {
        if (contentType == null)
            return null;
        
        java.util.regex.Matcher m = charsetPattern.matcher(contentType);
        if (m.find()) {
            java.lang.String charset = m.group(1).trim();
            charset = charset.replace("charset=", "");
            if ((charset.length()) == 0)
                return null;
            
            try {
                if (java.nio.charset.Charset.isSupported(charset))
                    return charset;
                
                charset = charset.toUpperCase(java.util.Locale.ENGLISH);
                if (java.nio.charset.Charset.isSupported(charset))
                    return charset;
                
            } catch (java.nio.charset.IllegalCharsetNameException e) {
                return null;
            }
        } 
        return null;
    }

    static java.lang.String mimeBoundary() {
        final java.lang.StringBuilder mime = new java.lang.StringBuilder(boundaryLength);
        final java.util.Random rand = new java.util.Random();
        for (int i = 0 ; i < (boundaryLength) ; i++) {
            mime.append(mimeBoundaryChars[rand.nextInt(mimeBoundaryChars.length)]);
        }
        return mime.toString();
    }
}

