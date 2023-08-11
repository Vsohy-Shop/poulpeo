package okhttp3;

import androidx.autofill.HintConstants;
import androidx.browser.trusted.sharing.ShareTarget;
import com.rmn.apiclient.impl.api.call.APIIncludes;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import p336ef.C11906l;

/* compiled from: Request.kt */
public final class Request {
    private final RequestBody body;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Map<Class<?>, Object> tags;
    private final HttpUrl url;

    /* compiled from: Request.kt */
    public static class Builder {
        private RequestBody body;
        private Headers.Builder headers;
        private String method;
        private Map<Class<?>, Object> tags;
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = ShareTarget.METHOD_GET;
            this.headers = new Headers.Builder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    requestBody = Util.EMPTY_REQUEST;
                }
                return builder.delete(requestBody);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }

        public Builder addHeader(String str, String str2) {
            C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
            C12775o.m28639i(str2, "value");
            getHeaders$okhttp().add(str, str2);
            return this;
        }

        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public Builder cacheControl(CacheControl cacheControl) {
            boolean z;
            C12775o.m28639i(cacheControl, "cacheControl");
            String cacheControl2 = cacheControl.toString();
            if (cacheControl2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return removeHeader("Cache-Control");
            }
            return header("Cache-Control", cacheControl2);
        }

        public final Builder delete() {
            return delete$default(this, (RequestBody) null, 1, (Object) null);
        }

        public Builder get() {
            return method(ShareTarget.METHOD_GET, (RequestBody) null);
        }

        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMethod$okhttp() {
            return this.method;
        }

        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        public Builder head() {
            return method("HEAD", (RequestBody) null);
        }

        public Builder header(String str, String str2) {
            C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
            C12775o.m28639i(str2, "value");
            getHeaders$okhttp().set(str, str2);
            return this;
        }

        public Builder headers(Headers headers2) {
            C12775o.m28639i(headers2, "headers");
            setHeaders$okhttp(headers2.newBuilder());
            return this;
        }

        public Builder method(String str, RequestBody requestBody) {
            boolean z;
            C12775o.m28639i(str, "method");
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (requestBody == null) {
                    if (!(true ^ HttpMethod.requiresRequestBody(str))) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!HttpMethod.permitsRequestBody(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                setMethod$okhttp(str);
                setBody$okhttp(requestBody);
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public Builder patch(RequestBody requestBody) {
            C12775o.m28639i(requestBody, "body");
            return method("PATCH", requestBody);
        }

        public Builder post(RequestBody requestBody) {
            C12775o.m28639i(requestBody, "body");
            return method(ShareTarget.METHOD_POST, requestBody);
        }

        public Builder put(RequestBody requestBody) {
            C12775o.m28639i(requestBody, "body");
            return method("PUT", requestBody);
        }

        public Builder removeHeader(String str) {
            C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
            getHeaders$okhttp().removeAll(str);
            return this;
        }

        public final void setBody$okhttp(RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            C12775o.m28639i(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMethod$okhttp(String str) {
            C12775o.m28639i(str, "<set-?>");
            this.method = str;
        }

        public final void setTags$okhttp(Map<Class<?>, Object> map) {
            C12775o.m28639i(map, "<set-?>");
            this.tags = map;
        }

        public final void setUrl$okhttp(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        public Builder tag(Object obj) {
            return tag(Object.class, obj);
        }

        public Builder url(HttpUrl httpUrl) {
            C12775o.m28639i(httpUrl, "url");
            setUrl$okhttp(httpUrl);
            return this;
        }

        public Builder delete(RequestBody requestBody) {
            return method("DELETE", requestBody);
        }

        public <T> Builder tag(Class<? super T> cls, T t) {
            C12775o.m28639i(cls, JSONAPIResourceIdSerializer.FIELD_TYPE);
            if (t == null) {
                getTags$okhttp().remove(cls);
            } else {
                if (getTags$okhttp().isEmpty()) {
                    setTags$okhttp(new LinkedHashMap());
                }
                Map<Class<?>, Object> tags$okhttp = getTags$okhttp();
                Object cast = cls.cast(t);
                C12775o.m28636f(cast);
                tags$okhttp.put(cls, cast);
            }
            return this;
        }

        public Builder url(String str) {
            C12775o.m28639i(str, "url");
            if (C13754v.m31523C(str, "ws:", true)) {
                String substring = str.substring(3);
                C12775o.m28638h(substring, "this as java.lang.String).substring(startIndex)");
                str = C12775o.m28647q("http:", substring);
            } else if (C13754v.m31523C(str, "wss:", true)) {
                String substring2 = str.substring(4);
                C12775o.m28638h(substring2, "this as java.lang.String).substring(startIndex)");
                str = C12775o.m28647q("https:", substring2);
            }
            return url(HttpUrl.Companion.get(str));
        }

        public Builder(Request request) {
            Map<Class<?>, Object> map;
            C12775o.m28639i(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            if (request.getTags$okhttp().isEmpty()) {
                map = new LinkedHashMap<>();
            } else {
                map = C12716r0.m28430u(request.getTags$okhttp());
            }
            this.tags = map;
            this.headers = request.headers().newBuilder();
        }

        public Builder url(URL url2) {
            C12775o.m28639i(url2, "url");
            HttpUrl.Companion companion = HttpUrl.Companion;
            String url3 = url2.toString();
            C12775o.m28638h(url3, "url.toString()");
            return url(companion.get(url3));
        }
    }

    public Request(HttpUrl httpUrl, String str, Headers headers2, RequestBody requestBody, Map<Class<?>, ? extends Object> map) {
        C12775o.m28639i(httpUrl, "url");
        C12775o.m28639i(str, "method");
        C12775o.m28639i(headers2, "headers");
        C12775o.m28639i(map, APIIncludes.TAGS);
        this.url = httpUrl;
        this.method = str;
        this.headers = headers2;
        this.body = requestBody;
        this.tags = map;
    }

    /* renamed from: -deprecated_body  reason: not valid java name */
    public final RequestBody m38853deprecated_body() {
        return this.body;
    }

    /* renamed from: -deprecated_cacheControl  reason: not valid java name */
    public final CacheControl m38854deprecated_cacheControl() {
        return cacheControl();
    }

    /* renamed from: -deprecated_headers  reason: not valid java name */
    public final Headers m38855deprecated_headers() {
        return this.headers;
    }

    /* renamed from: -deprecated_method  reason: not valid java name */
    public final String m38856deprecated_method() {
        return this.method;
    }

    /* renamed from: -deprecated_url  reason: not valid java name */
    public final HttpUrl m38857deprecated_url() {
        return this.url;
    }

    public final RequestBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl parse = CacheControl.Companion.parse(this.headers);
        this.lazyCacheControl = parse;
        return parse;
    }

    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    public final String header(String str) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        return this.headers.get(str);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final String method() {
        return this.method;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final Object tag() {
        return tag(Object.class);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(method());
        sb.append(", url=");
        sb.append(url());
        if (headers().size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object next : headers()) {
                int i2 = i + 1;
                if (i < 0) {
                    C12726w.m28534u();
                }
                C11906l lVar = (C11906l) next;
                String str = (String) lVar.mo49109a();
                String str2 = (String) lVar.mo49110b();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        if (!getTags$okhttp().isEmpty()) {
            sb.append(", tags=");
            sb.append(getTags$okhttp());
        }
        sb.append('}');
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final HttpUrl url() {
        return this.url;
    }

    public final List<String> headers(String str) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        return this.headers.values(str);
    }

    public final <T> T tag(Class<? extends T> cls) {
        C12775o.m28639i(cls, JSONAPIResourceIdSerializer.FIELD_TYPE);
        return cls.cast(this.tags.get(cls));
    }
}
