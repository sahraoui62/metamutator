package org.jsoup.helper;


public class HttpConnection implements org.jsoup.Connection {
    public static final java.lang.String CONTENT_ENCODING = "Content-Encoding";

    private static final java.lang.String CONTENT_TYPE = "Content-Type";

    private static final java.lang.String MULTIPART_FORM_DATA = "multipart/form-data";

    private static final java.lang.String FORM_URL_ENCODED = "application/x-www-form-urlencoded";

    public static org.jsoup.Connection connect(java.lang.String url) {
        org.jsoup.Connection con = new org.jsoup.helper.HttpConnection();
        con.url(url);
        return con;
    }

    public static org.jsoup.Connection connect(java.net.URL url) {
        org.jsoup.Connection con = new org.jsoup.helper.HttpConnection();
        con.url(url);
        return con;
    }

    private static java.lang.String encodeUrl(java.lang.String url) {
        if (url == null)
            return null;
        
        return url.replaceAll(" ", "%20");
    }

    private static java.lang.String encodeMimeName(java.lang.String val) {
        if (val == null)
            return null;
        
        return val.replaceAll("\"", "%22");
    }

    private org.jsoup.Connection.Request req;

    private org.jsoup.Connection.Response res;

    private HttpConnection() {
        req = new org.jsoup.helper.HttpConnection.Request();
        res = new org.jsoup.helper.HttpConnection.Response();
    }

    public org.jsoup.Connection url(java.net.URL url) {
        req.url(url);
        return this;
    }

    public org.jsoup.Connection url(java.lang.String url) {
        org.jsoup.helper.Validate.notEmpty(url, "Must supply a valid URL");
        try {
            req.url(new java.net.URL(org.jsoup.helper.HttpConnection.encodeUrl(url)));
        } catch (java.net.MalformedURLException e) {
            throw new java.lang.IllegalArgumentException(((_arithmeticOperatorHotSpot11.is("PLUS") ? (("Malformed URL: " + url))) : (_arithmeticOperatorHotSpot11.is("MINUS") ? (("Malformed URL: " - url))) : (_arithmeticOperatorHotSpot11.is("MUL") ? (("Malformed URL: " * url))) : (_arithmeticOperatorHotSpot11.is("DIV") ? (("Malformed URL: " / url)))) , e);
        }
        return this;
    }

    public org.jsoup.Connection userAgent(java.lang.String userAgent) {
        org.jsoup.helper.Validate.notNull(userAgent, "User agent must not be null");
        req.header("User-Agent", userAgent);
        return this;
    }

    public org.jsoup.Connection timeout(int millis) {
        req.timeout(millis);
        return this;
    }

    public org.jsoup.Connection maxBodySize(int bytes) {
        req.maxBodySize(bytes);
        return this;
    }

    public org.jsoup.Connection followRedirects(boolean followRedirects) {
        req.followRedirects(followRedirects);
        return this;
    }

    public org.jsoup.Connection referrer(java.lang.String referrer) {
        org.jsoup.helper.Validate.notNull(referrer, "Referrer must not be null");
        req.header("Referer", referrer);
        return this;
    }

    public org.jsoup.Connection method(org.jsoup.Connection.Method method) {
        req.method(method);
        return this;
    }

    public org.jsoup.Connection ignoreHttpErrors(boolean ignoreHttpErrors) {
        req.ignoreHttpErrors(ignoreHttpErrors);
        return this;
    }

    public org.jsoup.Connection ignoreContentType(boolean ignoreContentType) {
        req.ignoreContentType(ignoreContentType);
        return this;
    }

    public org.jsoup.Connection validateTLSCertificates(boolean value) {
        req.validateTLSCertificates(value);
        return this;
    }

    public org.jsoup.Connection data(java.lang.String key, java.lang.String value) {
        req.data(org.jsoup.helper.HttpConnection.KeyVal.create(key, value));
        return this;
    }

    public org.jsoup.Connection data(java.lang.String key, java.lang.String filename, java.io.InputStream inputStream) {
        req.data(org.jsoup.helper.HttpConnection.KeyVal.create(key, filename, inputStream));
        return this;
    }

    public org.jsoup.Connection data(java.util.Map<java.lang.String, java.lang.String> data) {
        org.jsoup.helper.Validate.notNull(data, "Data map must not be null");
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : data.entrySet()) {
            req.data(org.jsoup.helper.HttpConnection.KeyVal.create(entry.getKey(), entry.getValue()));
        }
        return this;
    }

    public org.jsoup.Connection data(java.lang.String... keyvals) {
        org.jsoup.helper.Validate.notNull(keyvals, "Data key value pairs must not be null");
        org.jsoup.helper.Validate.isTrue((((keyvals.length) % 2) == 0), "Must supply an even number of key value pairs");
        for (int i = 0 ; i < (keyvals.length) ; i += 2) {
            java.lang.String key = keyvals[i];
            java.lang.String value = keyvals[((_arithmeticOperatorHotSpot10.is("PLUS") ? ((i + 1))) : (_arithmeticOperatorHotSpot10.is("MINUS") ? ((i - 1))) : (_arithmeticOperatorHotSpot10.is("MUL") ? ((i * 1))) : (_arithmeticOperatorHotSpot10.is("DIV") ? ((i / 1))))];
            org.jsoup.helper.Validate.notEmpty(key, "Data key must not be empty");
            org.jsoup.helper.Validate.notNull(value, "Data value must not be null");
            req.data(org.jsoup.helper.HttpConnection.KeyVal.create(key, value));
        }
        return this;
    }

    public org.jsoup.Connection data(java.util.Collection<org.jsoup.Connection.KeyVal> data) {
        org.jsoup.helper.Validate.notNull(data, "Data collection must not be null");
        for (org.jsoup.Connection.KeyVal entry : data) {
            req.data(entry);
        }
        return this;
    }

    public org.jsoup.Connection header(java.lang.String name, java.lang.String value) {
        req.header(name, value);
        return this;
    }

    public org.jsoup.Connection cookie(java.lang.String name, java.lang.String value) {
        req.cookie(name, value);
        return this;
    }

    public org.jsoup.Connection cookies(java.util.Map<java.lang.String, java.lang.String> cookies) {
        org.jsoup.helper.Validate.notNull(cookies, "Cookie map must not be null");
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : cookies.entrySet()) {
            req.cookie(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public org.jsoup.Connection parser(org.jsoup.parser.Parser parser) {
        req.parser(parser);
        return this;
    }

    public org.jsoup.nodes.Document get() throws java.io.IOException {
        req.method(org.jsoup.Connection.Method.GET);
        execute();
        return res.parse();
    }

    public org.jsoup.nodes.Document post() throws java.io.IOException {
        req.method(org.jsoup.Connection.Method.POST);
        execute();
        return res.parse();
    }

    public org.jsoup.Connection.Response execute() throws java.io.IOException {
        res = org.jsoup.helper.HttpConnection.Response.execute(req);
        return res;
    }

    public org.jsoup.Connection.Request request() {
        return req;
    }

    public org.jsoup.Connection request(org.jsoup.Connection.Request request) {
        req = request;
        return this;
    }

    public org.jsoup.Connection.Response response() {
        return res;
    }

    public org.jsoup.Connection response(org.jsoup.Connection.Response response) {
        res = response;
        return this;
    }

    public org.jsoup.Connection postDataCharset(java.lang.String charset) {
        req.postDataCharset(charset);
        return this;
    }

    @java.lang.SuppressWarnings(value = { "unchecked" })
    private abstract static class Base<T extends org.jsoup.Connection.Base> implements org.jsoup.Connection.Base<T> {
        java.net.URL url;

        org.jsoup.Connection.Method method;

        java.util.Map<java.lang.String, java.lang.String> headers;

        java.util.Map<java.lang.String, java.lang.String> cookies;

        private Base() {
            headers = new java.util.LinkedHashMap<java.lang.String, java.lang.String>();
            cookies = new java.util.LinkedHashMap<java.lang.String, java.lang.String>();
        }

        public java.net.URL url() {
            return url;
        }

        public T url(java.net.URL url) {
            org.jsoup.helper.Validate.notNull(url, "URL must not be null");
            this.url = url;
            return ((T)(this));
        }

        public org.jsoup.Connection.Method method() {
            return method;
        }

        public T method(org.jsoup.Connection.Method method) {
            org.jsoup.helper.Validate.notNull(method, "Method must not be null");
            this.method = method;
            return ((T)(this));
        }

        public java.lang.String header(java.lang.String name) {
            org.jsoup.helper.Validate.notNull(name, "Header name must not be null");
            return getHeaderCaseInsensitive(name);
        }

        public T header(java.lang.String name, java.lang.String value) {
            org.jsoup.helper.Validate.notEmpty(name, "Header name must not be empty");
            org.jsoup.helper.Validate.notNull(value, "Header value must not be null");
            removeHeader(name);
            headers.put(name, value);
            return ((T)(this));
        }

        public boolean hasHeader(java.lang.String name) {
            org.jsoup.helper.Validate.notEmpty(name, "Header name must not be empty");
            return (getHeaderCaseInsensitive(name)) != null;
        }

        public boolean hasHeaderWithValue(java.lang.String name, java.lang.String value) {
            return (hasHeader(name)) && (header(name).equalsIgnoreCase(value));
        }

        public T removeHeader(java.lang.String name) {
            org.jsoup.helper.Validate.notEmpty(name, "Header name must not be empty");
            java.util.Map.Entry<java.lang.String, java.lang.String> entry = scanHeaders(name);
            if (entry != null)
                headers.remove(entry.getKey());
            
            return ((T)(this));
        }

        public java.util.Map<java.lang.String, java.lang.String> headers() {
            return headers;
        }

        private java.lang.String getHeaderCaseInsensitive(java.lang.String name) {
            org.jsoup.helper.Validate.notNull(name, "Header name must not be null");
            java.lang.String value = headers.get(name);
            if (value == null)
                value = headers.get(name.toLowerCase());
            
            if (value == null) {
                java.util.Map.Entry<java.lang.String, java.lang.String> entry = scanHeaders(name);
                if (entry != null)
                    value = entry.getValue();
                
            } 
            return value;
        }

        private java.util.Map.Entry<java.lang.String, java.lang.String> scanHeaders(java.lang.String name) {
            java.lang.String lc = name.toLowerCase();
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : headers.entrySet()) {
                if (entry.getKey().toLowerCase().equals(lc))
                    return entry;
                
            }
            return null;
        }

        public java.lang.String cookie(java.lang.String name) {
            org.jsoup.helper.Validate.notEmpty(name, "Cookie name must not be empty");
            return cookies.get(name);
        }

        public T cookie(java.lang.String name, java.lang.String value) {
            org.jsoup.helper.Validate.notEmpty(name, "Cookie name must not be empty");
            org.jsoup.helper.Validate.notNull(value, "Cookie value must not be null");
            cookies.put(name, value);
            return ((T)(this));
        }

        public boolean hasCookie(java.lang.String name) {
            org.jsoup.helper.Validate.notEmpty(name, "Cookie name must not be empty");
            return cookies.containsKey(name);
        }

        public T removeCookie(java.lang.String name) {
            org.jsoup.helper.Validate.notEmpty(name, "Cookie name must not be empty");
            cookies.remove(name);
            return ((T)(this));
        }

        public java.util.Map<java.lang.String, java.lang.String> cookies() {
            return cookies;
        }
    }

    public static class Request extends org.jsoup.helper.HttpConnection.Base<org.jsoup.Connection.Request> implements org.jsoup.Connection.Request {
        private int timeoutMilliseconds;

        private int maxBodySizeBytes;

        private boolean followRedirects;

        private java.util.Collection<org.jsoup.Connection.KeyVal> data;

        private boolean ignoreHttpErrors = false;

        private boolean ignoreContentType = false;

        private org.jsoup.parser.Parser parser;

        private boolean parserDefined = false;

        private boolean validateTSLCertificates = true;

        private java.lang.String postDataCharset = org.jsoup.helper.DataUtil.defaultCharset;

        private Request() {
            timeoutMilliseconds = 3000;
            maxBodySizeBytes = 1024 * 1024;
            followRedirects = true;
            data = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
            method = org.jsoup.Connection.Method.GET;
            headers.put("Accept-Encoding", "gzip");
            parser = org.jsoup.parser.Parser.htmlParser();
        }

        public int timeout() {
            return timeoutMilliseconds;
        }

        public org.jsoup.helper.HttpConnection.Request timeout(int millis) {
            org.jsoup.helper.Validate.isTrue((millis >= 0), "Timeout milliseconds must be 0 (infinite) or greater");
            timeoutMilliseconds = millis;
            return this;
        }

        public int maxBodySize() {
            return maxBodySizeBytes;
        }

        public org.jsoup.Connection.Request maxBodySize(int bytes) {
            org.jsoup.helper.Validate.isTrue((bytes >= 0), "maxSize must be 0 (unlimited) or larger");
            maxBodySizeBytes = bytes;
            return this;
        }

        public boolean followRedirects() {
            return followRedirects;
        }

        public org.jsoup.Connection.Request followRedirects(boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }

        public boolean ignoreHttpErrors() {
            return ignoreHttpErrors;
        }

        public boolean validateTLSCertificates() {
            return validateTSLCertificates;
        }

        public void validateTLSCertificates(boolean value) {
            validateTSLCertificates = value;
        }

        public org.jsoup.Connection.Request ignoreHttpErrors(boolean ignoreHttpErrors) {
            this.ignoreHttpErrors = ignoreHttpErrors;
            return this;
        }

        public boolean ignoreContentType() {
            return ignoreContentType;
        }

        public org.jsoup.Connection.Request ignoreContentType(boolean ignoreContentType) {
            this.ignoreContentType = ignoreContentType;
            return this;
        }

        public org.jsoup.helper.HttpConnection.Request data(org.jsoup.Connection.KeyVal keyval) {
            org.jsoup.helper.Validate.notNull(keyval, "Key val must not be null");
            data.add(keyval);
            return this;
        }

        public java.util.Collection<org.jsoup.Connection.KeyVal> data() {
            return data;
        }

        public org.jsoup.helper.HttpConnection.Request parser(org.jsoup.parser.Parser parser) {
            this.parser = parser;
            parserDefined = true;
            return this;
        }

        public org.jsoup.parser.Parser parser() {
            return parser;
        }

        public org.jsoup.Connection.Request postDataCharset(java.lang.String charset) {
            org.jsoup.helper.Validate.notNull(charset, "Charset must not be null");
            if (!(java.nio.charset.Charset.isSupported(charset)))
                throw new java.nio.charset.IllegalCharsetNameException(charset);
            
            this.postDataCharset = charset;
            return this;
        }

        public java.lang.String postDataCharset() {
            return postDataCharset;
        }
    }

    public static class Response extends org.jsoup.helper.HttpConnection.Base<org.jsoup.Connection.Response> implements org.jsoup.Connection.Response {
        private static final int MAX_REDIRECTS = 20;

        private static javax.net.ssl.SSLSocketFactory sslSocketFactory;

        private static final java.lang.String LOCATION = "Location";

        private int statusCode;

        private java.lang.String statusMessage;

        private java.nio.ByteBuffer byteData;

        private java.lang.String charset;

        private java.lang.String contentType;

        private boolean executed = false;

        private int numRedirects = 0;

        private org.jsoup.Connection.Request req;

        private static final java.util.regex.Pattern xmlContentTypeRxp = java.util.regex.Pattern.compile("(application|text)/\\w*\\+?xml.*");

        Response() {
            super();
        }

        private Response(org.jsoup.helper.HttpConnection.Response previousResponse) throws java.io.IOException {
            super();
            if (previousResponse != null) {
                numRedirects = (previousResponse.numRedirects) + 1;
                if ((numRedirects) >= (MAX_REDIRECTS))
                    throw new java.io.IOException(java.lang.String.format("Too many redirects occurred trying to load URL %s", previousResponse.url()));
                
            } 
        }

        static org.jsoup.helper.HttpConnection.Response execute(org.jsoup.Connection.Request req) throws java.io.IOException {
            return org.jsoup.helper.HttpConnection.Response.execute(req, null);
        }

        static org.jsoup.helper.HttpConnection.Response execute(org.jsoup.Connection.Request req, org.jsoup.helper.HttpConnection.Response previousResponse) throws java.io.IOException {
            org.jsoup.helper.Validate.notNull(req, "Request must not be null");
            java.lang.String protocol = req.url().getProtocol();
            if ((!(protocol.equals("http"))) && (!(protocol.equals("https"))))
                throw new java.net.MalformedURLException("Only http & https protocols supported");
            
            java.lang.String mimeBoundary = null;
            if ((!(req.method().hasBody())) && ((req.data().size()) > 0)) {
                org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl(req);
            } else if (req.method().hasBody()) {
                mimeBoundary = org.jsoup.helper.HttpConnection.Response.setOutputContentType(req);
            } 
            java.net.HttpURLConnection conn = org.jsoup.helper.HttpConnection.Response.createConnection(req);
            org.jsoup.helper.HttpConnection.Response res;
            try {
                conn.connect();
                if (conn.getDoOutput())
                    org.jsoup.helper.HttpConnection.Response.writePost(req, conn.getOutputStream(), mimeBoundary);
                
                int status = conn.getResponseCode();
                res = new org.jsoup.helper.HttpConnection.Response(previousResponse);
                res.setupFromConnection(conn, previousResponse);
                res.req = req;
                if ((res.hasHeader(LOCATION)) && (req.followRedirects())) {
                    req.method(org.jsoup.Connection.Method.GET);
                    req.data().clear();
                    java.lang.String location = res.header(LOCATION);
                    if (((location != null) && (location.startsWith("http:/"))) && ((location.charAt(6)) != '/'))
                        location = location.substring(6);
                    
                    req.url(org.jsoup.helper.StringUtil.resolve(req.url(), org.jsoup.helper.HttpConnection.encodeUrl(location)));
                    for (java.util.Map.Entry<java.lang.String, java.lang.String> cookie : res.cookies.entrySet()) {
                        req.cookie(cookie.getKey(), cookie.getValue());
                    }
                    return org.jsoup.helper.HttpConnection.Response.execute(req, res);
                } 
                if (((status < 200) || (status >= 400)) && (!(req.ignoreHttpErrors())))
                    throw new org.jsoup.HttpStatusException("HTTP error fetching URL" , status , req.url().toString());
                
                java.lang.String contentType = res.contentType();
                if ((((contentType != null) && (!(req.ignoreContentType()))) && (!(contentType.startsWith("text/")))) && (!(xmlContentTypeRxp.matcher(contentType).matches())))
                    throw new org.jsoup.UnsupportedMimeTypeException("Unhandled content type. Must be text/*, application/xml, or application/xhtml+xml" , contentType , req.url().toString());
                
                if ((contentType != null) && (xmlContentTypeRxp.matcher(contentType).matches())) {
                    if ((req instanceof org.jsoup.helper.HttpConnection.Request) && (!(((org.jsoup.helper.HttpConnection.Request)(req)).parserDefined))) {
                        req.parser(org.jsoup.parser.Parser.xmlParser());
                    } 
                } 
                res.charset = org.jsoup.helper.DataUtil.getCharsetFromContentType(res.contentType);
                if ((conn.getContentLength()) != 0) {
                    java.io.InputStream bodyStream = null;
                    java.io.InputStream dataStream = null;
                    try {
                        dataStream = (conn.getErrorStream()) != null ? conn.getErrorStream() : conn.getInputStream();
                        bodyStream = res.hasHeaderWithValue(org.jsoup.helper.HttpConnection.CONTENT_ENCODING, "gzip") ? new java.io.BufferedInputStream(new java.util.zip.GZIPInputStream(dataStream)) : new java.io.BufferedInputStream(dataStream);
                        res.byteData = org.jsoup.helper.DataUtil.readToByteBuffer(bodyStream, req.maxBodySize());
                    } finally {
                        if (bodyStream != null)
                            bodyStream.close();
                        
                        if (dataStream != null)
                            dataStream.close();
                        
                    }
                } else {
                    res.byteData = org.jsoup.helper.DataUtil.emptyByteBuffer();
                }
            } finally {
                conn.disconnect();
            }
            res.executed = true;
            return res;
        }

        public int statusCode() {
            return statusCode;
        }

        public java.lang.String statusMessage() {
            return statusMessage;
        }

        public java.lang.String charset() {
            return charset;
        }

        public java.lang.String contentType() {
            return contentType;
        }

        public org.jsoup.nodes.Document parse() throws java.io.IOException {
            org.jsoup.helper.Validate.isTrue(executed, "Request must be executed (with .execute(), .get(), or .post() before parsing response");
            org.jsoup.nodes.Document doc = org.jsoup.helper.DataUtil.parseByteData(byteData, charset, url.toExternalForm(), req.parser());
            byteData.rewind();
            charset = doc.outputSettings().charset().name();
            return doc;
        }

        public java.lang.String body() {
            org.jsoup.helper.Validate.isTrue(executed, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            java.lang.String body;
            if ((charset) == null)
                body = java.nio.charset.Charset.forName(org.jsoup.helper.DataUtil.defaultCharset).decode(byteData).toString();
            else
                body = java.nio.charset.Charset.forName(charset).decode(byteData).toString();
            
            byteData.rewind();
            return body;
        }

        public byte[] bodyAsBytes() {
            org.jsoup.helper.Validate.isTrue(executed, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            return byteData.array();
        }

        private static java.net.HttpURLConnection createConnection(org.jsoup.Connection.Request req) throws java.io.IOException {
            java.net.HttpURLConnection conn = ((java.net.HttpURLConnection)(req.url().openConnection()));
            conn.setRequestMethod(req.method().name());
            conn.setInstanceFollowRedirects(false);
            conn.setConnectTimeout(req.timeout());
            conn.setReadTimeout(req.timeout());
            if (conn instanceof javax.net.ssl.HttpsURLConnection) {
                if (!(req.validateTLSCertificates())) {
                    org.jsoup.helper.HttpConnection.Response.initUnSecureTSL();
                    ((javax.net.ssl.HttpsURLConnection)(conn)).setSSLSocketFactory(org.jsoup.helper.HttpConnection.Response.sslSocketFactory);
                    ((javax.net.ssl.HttpsURLConnection)(conn)).setHostnameVerifier(org.jsoup.helper.HttpConnection.Response.getInsecureVerifier());
                } 
            } 
            if (req.method().hasBody())
                conn.setDoOutput(true);
            
            if ((req.cookies().size()) > 0)
                conn.addRequestProperty("Cookie", org.jsoup.helper.HttpConnection.Response.getRequestCookieString(req));
            
            for (java.util.Map.Entry<java.lang.String, java.lang.String> header : req.headers().entrySet()) {
                conn.addRequestProperty(header.getKey(), header.getValue());
            }
            return conn;
        }

        private static javax.net.ssl.HostnameVerifier getInsecureVerifier() {
            return new javax.net.ssl.HostnameVerifier() {
                public boolean verify(java.lang.String urlHostName, javax.net.ssl.SSLSession session) {
                    return true;
                }
            };
        }

        private static synchronized void initUnSecureTSL() throws java.io.IOException {
            if ((org.jsoup.helper.HttpConnection.Response.sslSocketFactory) == null) {
                final javax.net.ssl.TrustManager[] trustAllCerts = new javax.net.ssl.TrustManager[]{ new javax.net.ssl.X509TrustManager() {
                    public void checkClientTrusted(final java.security.cert.X509Certificate[] chain, final java.lang.String authType) {
                    }

                    public void checkServerTrusted(final java.security.cert.X509Certificate[] chain, final java.lang.String authType) {
                    }

                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }
                } };
                final javax.net.ssl.SSLContext sslContext;
                try {
                    sslContext = javax.net.ssl.SSLContext.getInstance("SSL");
                    sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
                    org.jsoup.helper.HttpConnection.Response.sslSocketFactory = sslContext.getSocketFactory();
                } catch (java.security.NoSuchAlgorithmException e) {
                    throw new java.io.IOException("Can't create unsecure trust manager");
                } catch (java.security.KeyManagementException e) {
                    throw new java.io.IOException("Can't create unsecure trust manager");
                }
            } 
        }

        private void setupFromConnection(java.net.HttpURLConnection conn, org.jsoup.Connection.Response previousResponse) throws java.io.IOException {
            method = org.jsoup.Connection.Method.valueOf(conn.getRequestMethod());
            url = conn.getURL();
            statusCode = conn.getResponseCode();
            statusMessage = conn.getResponseMessage();
            contentType = conn.getContentType();
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> resHeaders = org.jsoup.helper.HttpConnection.Response.createHeaderMap(conn);
            processResponseHeaders(resHeaders);
            if (previousResponse != null) {
                for (java.util.Map.Entry<java.lang.String, java.lang.String> prevCookie : previousResponse.cookies().entrySet()) {
                    if (!(hasCookie(prevCookie.getKey())))
                        cookie(prevCookie.getKey(), prevCookie.getValue());
                    
                }
            } 
        }

        private static java.util.LinkedHashMap<java.lang.String, java.util.List<java.lang.String>> createHeaderMap(java.net.HttpURLConnection conn) {
            final java.util.LinkedHashMap<java.lang.String, java.util.List<java.lang.String>> headers = new java.util.LinkedHashMap<java.lang.String, java.util.List<java.lang.String>>();
            int i = 0;
            while (true) {
                final java.lang.String key = conn.getHeaderFieldKey(i);
                final java.lang.String val = conn.getHeaderField(i);
                if ((key == null) && (val == null))
                    break;
                
                i++;
                if ((key == null) || (val == null))
                    continue;
                
                if (headers.containsKey(key))
                    headers.get(key).add(val);
                else {
                    final java.util.ArrayList<java.lang.String> vals = new java.util.ArrayList<java.lang.String>();
                    vals.add(val);
                    headers.put(key, vals);
                }
            }
            return headers;
        }

        void processResponseHeaders(java.util.Map<java.lang.String, java.util.List<java.lang.String>> resHeaders) {
            for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : resHeaders.entrySet()) {
                java.lang.String name = entry.getKey();
                if (name == null)
                    continue;
                
                java.util.List<java.lang.String> values = entry.getValue();
                if (name.equalsIgnoreCase("Set-Cookie")) {
                    for (java.lang.String value : values) {
                        if (value == null)
                            continue;
                        
                        org.jsoup.parser.TokenQueue cd = new org.jsoup.parser.TokenQueue(value);
                        java.lang.String cookieName = cd.chompTo("=").trim();
                        java.lang.String cookieVal = cd.consumeTo(";").trim();
                        if ((cookieName.length()) > 0)
                            cookie(cookieName, cookieVal);
                        
                    }
                } else {
                    if ((values.size()) == 1)
                        header(name, values.get(0));
                    else if ((values.size()) > 1) {
                        java.lang.StringBuilder accum = new java.lang.StringBuilder();
                        for (int i = 0 ; i < (values.size()) ; i++) {
                            final java.lang.String val = values.get(i);
                            if (i != 0)
                                accum.append(", ");
                            
                            accum.append(val);
                        }
                        header(name, accum.toString());
                    } 
                }
            }
        }

        private static java.lang.String setOutputContentType(final org.jsoup.Connection.Request req) {
            boolean needsMulti = false;
            for (org.jsoup.Connection.KeyVal keyVal : req.data()) {
                if (keyVal.hasInputStream()) {
                    needsMulti = true;
                    break;
                } 
            }
            java.lang.String bound = null;
            if (needsMulti) {
                bound = org.jsoup.helper.DataUtil.mimeBoundary();
                req.header(org.jsoup.helper.HttpConnection.CONTENT_TYPE, (((_arithmeticOperatorHotSpot8.is("PLUS") ? (((org.jsoup.helper.HttpConnection.MULTIPART_FORM_DATA) + "; boundary="))) : (_arithmeticOperatorHotSpot8.is("MINUS") ? (((org.jsoup.helper.HttpConnection.MULTIPART_FORM_DATA) - "; boundary="))) : (_arithmeticOperatorHotSpot8.is("MUL") ? (((org.jsoup.helper.HttpConnection.MULTIPART_FORM_DATA) * "; boundary="))) : (_arithmeticOperatorHotSpot8.is("DIV") ? (((org.jsoup.helper.HttpConnection.MULTIPART_FORM_DATA) / "; boundary=")))) + bound));
            } else {
                req.header(org.jsoup.helper.HttpConnection.CONTENT_TYPE, (((_arithmeticOperatorHotSpot9.is("PLUS") ? (((org.jsoup.helper.HttpConnection.FORM_URL_ENCODED) + "; charset="))) : (_arithmeticOperatorHotSpot9.is("MINUS") ? (((org.jsoup.helper.HttpConnection.FORM_URL_ENCODED) - "; charset="))) : (_arithmeticOperatorHotSpot9.is("MUL") ? (((org.jsoup.helper.HttpConnection.FORM_URL_ENCODED) * "; charset="))) : (_arithmeticOperatorHotSpot9.is("DIV") ? (((org.jsoup.helper.HttpConnection.FORM_URL_ENCODED) / "; charset=")))) + (req.postDataCharset())));
            }
            return bound;
        }

        private static void writePost(final org.jsoup.Connection.Request req, final java.io.OutputStream outputStream, final java.lang.String bound) throws java.io.IOException {
            final java.util.Collection<org.jsoup.Connection.KeyVal> data = req.data();
            final java.io.BufferedWriter w = new java.io.BufferedWriter(new java.io.OutputStreamWriter(outputStream , org.jsoup.helper.DataUtil.defaultCharset));
            if (bound != null) {
                for (org.jsoup.Connection.KeyVal keyVal : data) {
                    w.write("--");
                    w.write(bound);
                    w.write("\r\n");
                    w.write("Content-Disposition: form-data; name=\"");
                    w.write(org.jsoup.helper.HttpConnection.encodeMimeName(keyVal.key()));
                    w.write("\"");
                    if (keyVal.hasInputStream()) {
                        w.write("; filename=\"");
                        w.write(org.jsoup.helper.HttpConnection.encodeMimeName(keyVal.value()));
                        w.write("\"\r\nContent-Type: application/octet-stream\r\n\r\n");
                        w.flush();
                        org.jsoup.helper.DataUtil.crossStreams(keyVal.inputStream(), outputStream);
                        outputStream.flush();
                    } else {
                        w.write("\r\n\r\n");
                        w.write(keyVal.value());
                    }
                    w.write("\r\n");
                }
                w.write("--");
                w.write(bound);
                w.write("--");
            } else {
                boolean first = true;
                for (org.jsoup.Connection.KeyVal keyVal : data) {
                    if (!first)
                        w.append('&');
                    else
                        first = false;
                    
                    w.write(java.net.URLEncoder.encode(keyVal.key(), req.postDataCharset()));
                    w.write('=');
                    w.write(java.net.URLEncoder.encode(keyVal.value(), req.postDataCharset()));
                }
            }
            w.close();
        }

        private static java.lang.String getRequestCookieString(org.jsoup.Connection.Request req) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            boolean first = true;
            for (java.util.Map.Entry<java.lang.String, java.lang.String> cookie : req.cookies().entrySet()) {
                if (!first)
                    sb.append("; ");
                else
                    first = false;
                
                sb.append(cookie.getKey()).append('=').append(cookie.getValue());
            }
            return sb.toString();
        }

        private static void serialiseRequestUrl(org.jsoup.Connection.Request req) throws java.io.IOException {
            java.net.URL in = req.url();
            java.lang.StringBuilder url = new java.lang.StringBuilder();
            boolean first = true;
            url.append(in.getProtocol()).append("://").append(in.getAuthority()).append(in.getPath()).append("?");
            if ((in.getQuery()) != null) {
                url.append(in.getQuery());
                first = false;
            } 
            for (org.jsoup.Connection.KeyVal keyVal : req.data()) {
                if (!first)
                    url.append('&');
                else
                    first = false;
                
                url.append(java.net.URLEncoder.encode(keyVal.key(), org.jsoup.helper.DataUtil.defaultCharset)).append('=').append(java.net.URLEncoder.encode(keyVal.value(), org.jsoup.helper.DataUtil.defaultCharset));
            }
            req.url(new java.net.URL(url.toString()));
            req.data().clear();
        }
    }

    public static class KeyVal implements org.jsoup.Connection.KeyVal {
        private java.lang.String key;

        private java.lang.String value;

        private java.io.InputStream stream;

        public static org.jsoup.helper.HttpConnection.KeyVal create(java.lang.String key, java.lang.String value) {
            return new org.jsoup.helper.HttpConnection.KeyVal().key(key).value(value);
        }

        public static org.jsoup.helper.HttpConnection.KeyVal create(java.lang.String key, java.lang.String filename, java.io.InputStream stream) {
            return new org.jsoup.helper.HttpConnection.KeyVal().key(key).value(filename).inputStream(stream);
        }

        private KeyVal() {
        }

        public org.jsoup.helper.HttpConnection.KeyVal key(java.lang.String key) {
            org.jsoup.helper.Validate.notEmpty(key, "Data key must not be empty");
            this.key = key;
            return this;
        }

        public java.lang.String key() {
            return key;
        }

        public org.jsoup.helper.HttpConnection.KeyVal value(java.lang.String value) {
            org.jsoup.helper.Validate.notNull(value, "Data value must not be null");
            this.value = value;
            return this;
        }

        public java.lang.String value() {
            return value;
        }

        public org.jsoup.helper.HttpConnection.KeyVal inputStream(java.io.InputStream inputStream) {
            org.jsoup.helper.Validate.notNull(value, "Data input stream must not be null");
            this.stream = inputStream;
            return this;
        }

        public java.io.InputStream inputStream() {
            return stream;
        }

        public boolean hasInputStream() {
            return (stream) != null;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return ((_arithmeticOperatorHotSpot7.is("PLUS") ? (((key) + "="))) : (_arithmeticOperatorHotSpot7.is("MINUS") ? (((key) - "="))) : (_arithmeticOperatorHotSpot7.is("MUL") ? (((key) * "="))) : (_arithmeticOperatorHotSpot7.is("DIV") ? (((key) / "=")))) + (value);
        }
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot7 = metamutator.Selector.of(7,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot7");

    private static final metamutator.Selector _arithmeticOperatorHotSpot8 = metamutator.Selector.of(8,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot8");

    private static final metamutator.Selector _arithmeticOperatorHotSpot9 = metamutator.Selector.of(9,new String[]{"PLUS","MINUS","MUL","DIV"}).id("_arithmeticOperatorHotSpot9");

    private static final metamutator.Selector _arithmeticOperatorHotSpot10 = metamutator.Selector.of(10,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.jsoup.helper.HttpConnection.class).id("_arithmeticOperatorHotSpot10");

    private static final metamutator.Selector _arithmeticOperatorHotSpot11 = metamutator.Selector.of(11,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.jsoup.helper.HttpConnection.class).id("_arithmeticOperatorHotSpot11");
}

