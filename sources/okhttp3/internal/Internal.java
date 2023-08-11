package okhttp3.internal;

import androidx.autofill.HintConstants;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C12775o;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: internal.kt */
public final class Internal {
    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str) {
        C12775o.m28639i(builder, "builder");
        C12775o.m28639i(str, "line");
        return builder.addLenient$okhttp(str);
    }

    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z) {
        C12775o.m28639i(connectionSpec, "connectionSpec");
        C12775o.m28639i(sSLSocket, "sslSocket");
        connectionSpec.apply$okhttp(sSLSocket, z);
    }

    public static final Response cacheGet(Cache cache, Request request) {
        C12775o.m28639i(cache, "cache");
        C12775o.m28639i(request, "request");
        return cache.get$okhttp(request);
    }

    public static final String cookieToString(Cookie cookie, boolean z) {
        C12775o.m28639i(cookie, "cookie");
        return cookie.toString$okhttp(z);
    }

    public static final Cookie parseCookie(long j, HttpUrl httpUrl, String str) {
        C12775o.m28639i(httpUrl, "url");
        C12775o.m28639i(str, "setCookie");
        return Cookie.Companion.parse$okhttp(j, httpUrl, str);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str, String str2) {
        C12775o.m28639i(builder, "builder");
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(str2, "value");
        return builder.addLenient$okhttp(str, str2);
    }
}
