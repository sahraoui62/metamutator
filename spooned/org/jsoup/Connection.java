package org.jsoup;


public interface Connection {
    enum Method {
GET(false), POST(true), PUT(true), DELETE(false), PATCH(true), HEAD(false), OPTIONS(false), TRACE(false);
        private final boolean hasBody;
        Method(boolean hasBody) {
            this.hasBody = hasBody;
        }
        public final boolean hasBody() {
            return hasBody;
        }
    }

    org.jsoup.Connection url(java.net.URL url);

    org.jsoup.Connection url(java.lang.String url);

    org.jsoup.Connection userAgent(java.lang.String userAgent);

    org.jsoup.Connection timeout(int millis);

    org.jsoup.Connection maxBodySize(int bytes);

    org.jsoup.Connection referrer(java.lang.String referrer);

    org.jsoup.Connection followRedirects(boolean followRedirects);

    org.jsoup.Connection method(org.jsoup.Connection.Method method);

    org.jsoup.Connection ignoreHttpErrors(boolean ignoreHttpErrors);

    org.jsoup.Connection ignoreContentType(boolean ignoreContentType);

    org.jsoup.Connection validateTLSCertificates(boolean value);

    org.jsoup.Connection data(java.lang.String key, java.lang.String value);

    org.jsoup.Connection data(java.lang.String key, java.lang.String filename, java.io.InputStream inputStream);

    org.jsoup.Connection data(java.util.Collection<org.jsoup.Connection.KeyVal> data);

    org.jsoup.Connection data(java.util.Map<java.lang.String, java.lang.String> data);

    org.jsoup.Connection data(java.lang.String... keyvals);

    org.jsoup.Connection header(java.lang.String name, java.lang.String value);

    org.jsoup.Connection cookie(java.lang.String name, java.lang.String value);

    org.jsoup.Connection cookies(java.util.Map<java.lang.String, java.lang.String> cookies);

    org.jsoup.Connection parser(org.jsoup.parser.Parser parser);

    org.jsoup.Connection postDataCharset(java.lang.String charset);

    org.jsoup.nodes.Document get() throws java.io.IOException;

    org.jsoup.nodes.Document post() throws java.io.IOException;

    org.jsoup.Connection.Response execute() throws java.io.IOException;

    org.jsoup.Connection.Request request();

    org.jsoup.Connection request(org.jsoup.Connection.Request request);

    org.jsoup.Connection.Response response();

    org.jsoup.Connection response(org.jsoup.Connection.Response response);

    interface Base<T extends org.jsoup.Connection.Base> {
        java.net.URL url();

        T url(java.net.URL url);

        org.jsoup.Connection.Method method();

        T method(org.jsoup.Connection.Method method);

        java.lang.String header(java.lang.String name);

        T header(java.lang.String name, java.lang.String value);

        boolean hasHeader(java.lang.String name);

        boolean hasHeaderWithValue(java.lang.String name, java.lang.String value);

        T removeHeader(java.lang.String name);

        java.util.Map<java.lang.String, java.lang.String> headers();

        java.lang.String cookie(java.lang.String name);

        T cookie(java.lang.String name, java.lang.String value);

        boolean hasCookie(java.lang.String name);

        T removeCookie(java.lang.String name);

        java.util.Map<java.lang.String, java.lang.String> cookies();
    }

    interface Request extends org.jsoup.Connection.Base<org.jsoup.Connection.Request> {
        int timeout();

        org.jsoup.Connection.Request timeout(int millis);

        int maxBodySize();

        org.jsoup.Connection.Request maxBodySize(int bytes);

        boolean followRedirects();

        org.jsoup.Connection.Request followRedirects(boolean followRedirects);

        boolean ignoreHttpErrors();

        org.jsoup.Connection.Request ignoreHttpErrors(boolean ignoreHttpErrors);

        boolean ignoreContentType();

        org.jsoup.Connection.Request ignoreContentType(boolean ignoreContentType);

        boolean validateTLSCertificates();

        void validateTLSCertificates(boolean value);

        org.jsoup.Connection.Request data(org.jsoup.Connection.KeyVal keyval);

        java.util.Collection<org.jsoup.Connection.KeyVal> data();

        org.jsoup.Connection.Request parser(org.jsoup.parser.Parser parser);

        org.jsoup.parser.Parser parser();

        org.jsoup.Connection.Request postDataCharset(java.lang.String charset);

        java.lang.String postDataCharset();
    }

    interface Response extends org.jsoup.Connection.Base<org.jsoup.Connection.Response> {
        int statusCode();

        java.lang.String statusMessage();

        java.lang.String charset();

        java.lang.String contentType();

        org.jsoup.nodes.Document parse() throws java.io.IOException;

        java.lang.String body();

        byte[] bodyAsBytes();
    }

    interface KeyVal {
        org.jsoup.Connection.KeyVal key(java.lang.String key);

        java.lang.String key();

        org.jsoup.Connection.KeyVal value(java.lang.String value);

        java.lang.String value();

        org.jsoup.Connection.KeyVal inputStream(java.io.InputStream inputStream);

        java.io.InputStream inputStream();

        boolean hasInputStream();
    }
}

