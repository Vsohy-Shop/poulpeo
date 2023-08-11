package okhttp3.internal.http;

import java.net.Proxy;
import kotlin.jvm.internal.C12775o;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* compiled from: RequestLine.kt */
public final class RequestLine {
    public static final RequestLine INSTANCE = new RequestLine();

    private RequestLine() {
    }

    private final boolean includeAuthorityInRequestLine(Request request, Proxy.Type type) {
        if (request.isHttps() || type != Proxy.Type.HTTP) {
            return false;
        }
        return true;
    }

    public final String get(Request request, Proxy.Type type) {
        C12775o.m28639i(request, "request");
        C12775o.m28639i(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.method());
        sb.append(' ');
        RequestLine requestLine = INSTANCE;
        if (requestLine.includeAuthorityInRequestLine(request, type)) {
            sb.append(request.url());
        } else {
            sb.append(requestLine.requestPath(request.url()));
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String requestPath(HttpUrl httpUrl) {
        C12775o.m28639i(httpUrl, "url");
        String encodedPath = httpUrl.encodedPath();
        String encodedQuery = httpUrl.encodedQuery();
        if (encodedQuery == null) {
            return encodedPath;
        }
        return encodedPath + '?' + encodedQuery;
    }
}
