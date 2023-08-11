package okhttp3.internal.http;

import androidx.browser.trusted.sharing.ShareTarget;
import kotlin.jvm.internal.C12775o;

/* compiled from: HttpMethod.kt */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String str) {
        C12775o.m28639i(str, "method");
        if (C12775o.m28634d(str, ShareTarget.METHOD_GET) || C12775o.m28634d(str, "HEAD")) {
            return false;
        }
        return true;
    }

    public static final boolean requiresRequestBody(String str) {
        C12775o.m28639i(str, "method");
        if (C12775o.m28634d(str, ShareTarget.METHOD_POST) || C12775o.m28634d(str, "PUT") || C12775o.m28634d(str, "PATCH") || C12775o.m28634d(str, "PROPPATCH") || C12775o.m28634d(str, "REPORT")) {
            return true;
        }
        return false;
    }

    public final boolean invalidatesCache(String str) {
        C12775o.m28639i(str, "method");
        if (C12775o.m28634d(str, ShareTarget.METHOD_POST) || C12775o.m28634d(str, "PATCH") || C12775o.m28634d(str, "PUT") || C12775o.m28634d(str, "DELETE") || C12775o.m28634d(str, "MOVE")) {
            return true;
        }
        return false;
    }

    public final boolean redirectsToGet(String str) {
        C12775o.m28639i(str, "method");
        return !C12775o.m28634d(str, "PROPFIND");
    }

    public final boolean redirectsWithBody(String str) {
        C12775o.m28639i(str, "method");
        return C12775o.m28634d(str, "PROPFIND");
    }
}
