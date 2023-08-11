package com.rmn.api.p322v2.main.oauth;

import com.rmn.utils.UrlEscapeUtils;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.C13121c;
import okio.C13133f;
import p454wf.C13726d;
import p454wf.C13735j;

/* renamed from: com.rmn.api.v2.main.oauth.Oauth1SigningInterceptor */
/* compiled from: Oauth1SigningInterceptor.kt */
public final class Oauth1SigningInterceptor implements Interceptor {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String OAUTH_ACCESS_TOKEN = "oauth_token";
    private static final String OAUTH_CONSUMER_KEY = "oauth_consumer_key";
    private static final String OAUTH_NONCE = "oauth_nonce";
    private static final String OAUTH_SIGNATURE = "oauth_signature";
    private static final String OAUTH_SIGNATURE_METHOD = "oauth_signature_method";
    private static final String OAUTH_SIGNATURE_METHOD_VALUE = "HMAC-SHA1";
    private static final String OAUTH_TIMESTAMP = "oauth_timestamp";
    private static final String OAUTH_VERSION = "oauth_version";
    private static final String OAUTH_VERSION_VALUE = "1.0";
    private final String accessSecret;
    private final String accessToken;
    private final Clock clock;
    private final String consumerKey;
    private final String consumerSecret;
    private final Random random;

    /* renamed from: com.rmn.api.v2.main.oauth.Oauth1SigningInterceptor$Clock */
    /* compiled from: Oauth1SigningInterceptor.kt */
    public static final class Clock {
        public final String millis() {
            String l = Long.toString(System.currentTimeMillis() / 1000);
            C12775o.m28638h(l, "toString(System.currentTimeMillis() / 1000L)");
            return l;
        }
    }

    /* renamed from: com.rmn.api.v2.main.oauth.Oauth1SigningInterceptor$Companion */
    /* compiled from: Oauth1SigningInterceptor.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Oauth1SigningInterceptor(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, (Random) null, (Clock) null, 48, (DefaultConstructorMarker) null);
        C12775o.m28639i(str, "consumerKey");
        C12775o.m28639i(str2, "consumerSecret");
    }

    public Response intercept(Interceptor.Chain chain) {
        C12775o.m28639i(chain, "chain");
        return chain.proceed(signRequest(chain.request()));
    }

    public final Request signRequest(Request request) {
        String str;
        FormBody formBody;
        String str2;
        C12775o.m28639i(request, "request");
        byte[] bArr = new byte[32];
        this.random.nextBytes(bArr);
        String str3 = "";
        String f = new C13735j("\\W").mo53413f(C13133f.f20903e.mo52623e(Arrays.copyOf(bArr, 32)).mo52597a(), str3);
        String millis = this.clock.millis();
        String escape = UrlEscapeUtils.escape(this.consumerKey);
        String str4 = this.accessToken;
        if (str4 != null) {
            str = UrlEscapeUtils.escape(str4);
        } else {
            str = null;
        }
        TreeMap treeMap = new TreeMap();
        treeMap.put(OAUTH_CONSUMER_KEY, escape);
        if (str != null) {
            treeMap.put(OAUTH_ACCESS_TOKEN, str);
        }
        treeMap.put(OAUTH_NONCE, f);
        treeMap.put(OAUTH_TIMESTAMP, millis);
        treeMap.put(OAUTH_SIGNATURE_METHOD, OAUTH_SIGNATURE_METHOD_VALUE);
        treeMap.put(OAUTH_VERSION, OAUTH_VERSION_VALUE);
        HttpUrl url = request.url();
        int querySize = url.querySize();
        for (int i = 0; i < querySize; i++) {
            treeMap.put(UrlEscapeUtils.escape(url.queryParameterName(i)), UrlEscapeUtils.escape(url.queryParameterValue(i)));
        }
        RequestBody body = request.body();
        if (body instanceof FormBody) {
            formBody = (FormBody) body;
        } else {
            formBody = null;
        }
        if (formBody != null) {
            int size = formBody.size();
            for (int i2 = 0; i2 < size; i2++) {
                treeMap.put(UrlEscapeUtils.escape(formBody.name(i2)), UrlEscapeUtils.escape(formBody.value(i2)));
            }
        }
        C13121c cVar = new C13121c();
        cVar.mo52486F(request.method());
        cVar.writeByte(38);
        String escape2 = UrlEscapeUtils.escape(request.url().newBuilder().query((String) null).build().toString());
        C12775o.m28638h(escape2, "escape(request.url.newBu…null).build().toString())");
        cVar.mo52486F(escape2);
        cVar.writeByte(38);
        boolean z = true;
        for (Map.Entry entry : treeMap.entrySet()) {
            String str5 = (String) entry.getKey();
            String str6 = (String) entry.getValue();
            if (!z) {
                String escape3 = UrlEscapeUtils.escape("&");
                C12775o.m28638h(escape3, "escape(\"&\")");
                cVar.mo52486F(escape3);
            }
            String escape4 = UrlEscapeUtils.escape(str5);
            C12775o.m28638h(escape4, "escape(key)");
            cVar.mo52486F(escape4);
            String escape5 = UrlEscapeUtils.escape("=");
            C12775o.m28638h(escape5, "escape(\"=\")");
            cVar.mo52486F(escape5);
            String escape6 = UrlEscapeUtils.escape(str6);
            C12775o.m28638h(escape6, "escape(value)");
            cVar.mo52486F(escape6);
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(UrlEscapeUtils.escape(this.consumerSecret));
        sb.append('&');
        String str7 = this.accessSecret;
        if (str7 != null) {
            str2 = UrlEscapeUtils.escape(str7);
        } else {
            str2 = str3;
        }
        sb.append(str2);
        byte[] bytes = sb.toString().getBytes(C13726d.f22152b);
        C12775o.m28638h(bytes, "this as java.lang.String).getBytes(charset)");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "HmacSHA1");
        try {
            Mac instance = Mac.getInstance("HmacSHA1");
            C12775o.m28638h(instance, "getInstance(\"HmacSHA1\")");
            instance.init(secretKeySpec);
            byte[] doFinal = instance.doFinal(cVar.mo52548s());
            C13133f.C13134a aVar = C13133f.f20903e;
            C12775o.m28638h(doFinal, "result");
            String a = aVar.mo52623e(Arrays.copyOf(doFinal, doFinal.length)).mo52597a();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("OAuth ");
            sb2.append(OAUTH_CONSUMER_KEY);
            sb2.append("=\"");
            sb2.append(escape);
            sb2.append("\",");
            sb2.append(OAUTH_NONCE);
            sb2.append("=\"");
            sb2.append(f);
            sb2.append("\",");
            sb2.append(OAUTH_SIGNATURE);
            sb2.append("=\"");
            sb2.append(UrlEscapeUtils.escape(a));
            sb2.append("\", ");
            sb2.append(OAUTH_SIGNATURE_METHOD);
            sb2.append("=\"");
            sb2.append(OAUTH_SIGNATURE_METHOD_VALUE);
            sb2.append("\", ");
            sb2.append(OAUTH_TIMESTAMP);
            sb2.append("=\"");
            sb2.append(millis);
            sb2.append("\", ");
            if (str != null) {
                str3 = OAUTH_ACCESS_TOKEN + "=\"" + str + "\", ";
            }
            sb2.append(str3);
            sb2.append(OAUTH_VERSION);
            sb2.append("=\"");
            sb2.append(OAUTH_VERSION_VALUE);
            sb2.append('\"');
            return request.newBuilder().addHeader("Authorization", sb2.toString()).build();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        } catch (InvalidKeyException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Oauth1SigningInterceptor(String str, String str2, String str3, String str4, Random random2) {
        this(str, str2, str3, str4, random2, (Clock) null, 32, (DefaultConstructorMarker) null);
        C12775o.m28639i(str, "consumerKey");
        C12775o.m28639i(str2, "consumerSecret");
        C12775o.m28639i(random2, "random");
    }

    public Oauth1SigningInterceptor(String str, String str2, String str3, String str4, Random random2, Clock clock2) {
        C12775o.m28639i(str, "consumerKey");
        C12775o.m28639i(str2, "consumerSecret");
        C12775o.m28639i(random2, "random");
        C12775o.m28639i(clock2, "clock");
        this.consumerKey = str;
        this.consumerSecret = str2;
        this.accessToken = str3;
        this.accessSecret = str4;
        this.random = random2;
        this.clock = clock2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Oauth1SigningInterceptor(String str, String str2, String str3, String str4, Random random2, Clock clock2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? new SecureRandom() : random2, (i & 32) != 0 ? new Clock() : clock2);
    }
}
