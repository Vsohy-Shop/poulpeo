package p042bo.app;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import p404of.C13074a;

/* renamed from: bo.app.t1 */
public final class C3695t1 implements C3315k2 {

    /* renamed from: b */
    public static final C3696a f2603b = new C3696a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private static final int f2604c = ((int) TimeUnit.SECONDS.toMillis(15));

    /* renamed from: a */
    private final int f2605a;

    /* renamed from: bo.app.t1$a */
    public static final class C3696a {
        public /* synthetic */ C3696a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3696a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final InputStream m3908a(HttpURLConnection httpURLConnection) {
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode / 100 != 2) {
                throw new C3633r3("Bad HTTP response code from Braze: [" + responseCode + "] to url: " + httpURLConnection.getURL());
            } else if (C13754v.m31530r("gzip", httpURLConnection.getContentEncoding(), true)) {
                return new GZIPInputStream(httpURLConnection.getInputStream());
            } else {
                return new BufferedInputStream(httpURLConnection.getInputStream());
            }
        }
    }

    /* renamed from: bo.app.t1$b */
    static final class C3697b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ JSONException f2606b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3697b(JSONException jSONException) {
            super(0);
            this.f2606b = jSONException;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unable to parse json response from server. Response: [" + this.f2606b + ']';
        }
    }

    /* renamed from: bo.app.t1$c */
    static final class C3698c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ URL f2607b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3698c(URL url) {
            super(0);
            this.f2607b = url;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to get result from [" + this.f2607b + "].";
        }
    }

    public C3695t1(int i) {
        this.f2605a = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        p392mf.C12941b.m29245a(r2, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        throw r12;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p336ef.C11906l<org.json.JSONObject, java.util.Map<java.lang.String, java.lang.String>> mo29194a(p042bo.app.C3753v4 r10, java.util.Map<java.lang.String, java.lang.String> r11, org.json.JSONObject r12) {
        /*
            r9 = this;
            java.lang.String r0 = "requestTarget"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            java.lang.String r0 = "requestHeaders"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            r0 = 1337(0x539, float:1.874E-42)
            android.net.TrafficStats.setThreadStatsTag(r0)
            java.net.URL r10 = r10.mo29751b()
            r0 = 93
            java.net.HttpURLConnection r11 = r9.m3905a((java.net.URL) r10, (org.json.JSONObject) r12, (java.util.Map<java.lang.String, java.lang.String>) r11)     // Catch:{ IOException -> 0x0098, JSONException -> 0x0061 }
            bo.app.t1$a r12 = f2603b     // Catch:{ IOException -> 0x0098, JSONException -> 0x0061 }
            java.io.InputStream r12 = r12.m3908a(r11)     // Catch:{ IOException -> 0x0098, JSONException -> 0x0061 }
            java.nio.charset.Charset r1 = p454wf.C13726d.f22152b     // Catch:{ IOException -> 0x0098, JSONException -> 0x0061 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0098, JSONException -> 0x0061 }
            r2.<init>(r12, r1)     // Catch:{ IOException -> 0x0098, JSONException -> 0x0061 }
            boolean r12 = r2 instanceof java.io.BufferedReader     // Catch:{ IOException -> 0x0098, JSONException -> 0x0061 }
            if (r12 == 0) goto L_0x0032
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2     // Catch:{ IOException -> 0x0098, JSONException -> 0x0061 }
            goto L_0x003a
        L_0x0032:
            java.io.BufferedReader r12 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0098, JSONException -> 0x0061 }
            r1 = 8192(0x2000, float:1.14794E-41)
            r12.<init>(r2, r1)     // Catch:{ IOException -> 0x0098, JSONException -> 0x0061 }
            r2 = r12
        L_0x003a:
            java.lang.String r12 = p392mf.C12957k.m29276c(r2)     // Catch:{ all -> 0x005a }
            r1 = 0
            p392mf.C12941b.m29245a(r2, r1)     // Catch:{ IOException -> 0x0098, JSONException -> 0x0061 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ IOException -> 0x0098, JSONException -> 0x0061 }
            r1.<init>(r12)     // Catch:{ IOException -> 0x0098, JSONException -> 0x0061 }
            java.util.Map r11 = r11.getHeaderFields()     // Catch:{ IOException -> 0x0098, JSONException -> 0x0061 }
            java.lang.String r12 = "connection.headerFields"
            kotlin.jvm.internal.C12775o.m28638h(r11, r12)     // Catch:{ IOException -> 0x0098, JSONException -> 0x0061 }
            java.util.Map r11 = p042bo.app.C3745v1.m4014a((java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>) r11)     // Catch:{ IOException -> 0x0098, JSONException -> 0x0061 }
            ef.l r12 = new ef.l     // Catch:{ IOException -> 0x0098, JSONException -> 0x0061 }
            r12.<init>(r1, r11)     // Catch:{ IOException -> 0x0098, JSONException -> 0x0061 }
            return r12
        L_0x005a:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x005c }
        L_0x005c:
            r12 = move-exception
            p392mf.C12941b.m29245a(r2, r11)     // Catch:{ IOException -> 0x0098, JSONException -> 0x0061 }
            throw r12     // Catch:{ IOException -> 0x0098, JSONException -> 0x0061 }
        L_0x0061:
            r11 = move-exception
            j0.c r12 = p126j0.C8266c.f11641a
            j0.c$a r3 = p126j0.C8266c.C8267a.f11649e
            bo.app.t1$b r6 = new bo.app.t1$b
            r6.<init>(r11)
            r4 = 0
            r5 = 0
            r7 = 6
            r8 = 0
            r1 = r12
            r2 = r9
            p126j0.C8266c.m16396e(r1, r2, r3, r4, r5, r6, r7, r8)
            j0.c$a r3 = p126j0.C8266c.C8267a.f11651g
            bo.app.t1$c r6 = new bo.app.t1$c
            r6.<init>(r10)
            p126j0.C8266c.m16396e(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Failed to get result from ["
            r12.append(r1)
            r12.append(r10)
            r12.append(r0)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x0098:
            r11 = move-exception
            bo.app.r3 r12 = new bo.app.r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed request to ["
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = "], with message: ["
            r1.append(r10)
            java.lang.String r10 = r11.getMessage()
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = r1.toString()
            r12.<init>(r10, r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3695t1.mo29194a(bo.app.v4, java.util.Map, org.json.JSONObject):ef.l");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0075, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0076, code lost:
        p392mf.C12941b.m29245a(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0079, code lost:
        throw r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.net.HttpURLConnection m3905a(java.net.URL r3, org.json.JSONObject r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            r2 = this;
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "payload.toString()"
            kotlin.jvm.internal.C12775o.m28638h(r4, r0)
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r1 = "forName(charsetName)"
            kotlin.jvm.internal.C12775o.m28638h(r0, r1)
            byte[] r4 = r4.getBytes(r0)
            java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.C12775o.m28638h(r4, r0)
            bo.app.s6 r0 = p042bo.app.C3672s6.f2557a
            java.net.HttpURLConnection r3 = r0.mo29643a(r3)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x002b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.setRequestProperty(r1, r0)
            goto L_0x002b
        L_0x0047:
            int r5 = f2604c
            r3.setConnectTimeout(r5)
            int r5 = r2.f2605a
            r3.setReadTimeout(r5)
            r5 = 0
            r3.setUseCaches(r5)
            r3.setInstanceFollowRedirects(r5)
            java.lang.String r5 = "POST"
            r3.setRequestMethod(r5)
            r5 = 1
            r3.setDoOutput(r5)
            int r5 = r4.length
            r3.setFixedLengthStreamingMode(r5)
            java.io.OutputStream r5 = r3.getOutputStream()
            r5.write(r4)     // Catch:{ all -> 0x0073 }
            ef.v r4 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0073 }
            r4 = 0
            p392mf.C12941b.m29245a(r5, r4)
            return r3
        L_0x0073:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r4 = move-exception
            p392mf.C12941b.m29245a(r5, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3695t1.m3905a(java.net.URL, org.json.JSONObject, java.util.Map):java.net.HttpURLConnection");
    }
}
