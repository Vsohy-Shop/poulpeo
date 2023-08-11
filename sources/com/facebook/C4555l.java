package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.autofill.HintConstants;
import androidx.browser.trusted.sharing.ShareTarget;
import com.adjust.sdk.Constants;
import com.facebook.C4570n;
import com.rmn.apiclient.impl.api.call.APIParams;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p198q2.C9138d0;
import p198q2.C9144e0;
import p198q2.C9191t;
import p198q2.C9194v;
import p198q2.C9212z;
import p251v2.C9925a;
import p454wf.C13726d;
import p454wf.C13735j;

/* renamed from: com.facebook.l */
/* compiled from: GraphRequest.kt */
public final class C4555l {

    /* renamed from: o */
    public static final String f4236o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final String f4237p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static String f4238q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final Pattern f4239r = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static volatile String f4240s;

    /* renamed from: t */
    public static final C4558c f4241t = new C4558c((DefaultConstructorMarker) null);

    /* renamed from: a */
    private C4509a f4242a;

    /* renamed from: b */
    private String f4243b;

    /* renamed from: c */
    private JSONObject f4244c;

    /* renamed from: d */
    private String f4245d;

    /* renamed from: e */
    private String f4246e;

    /* renamed from: f */
    private boolean f4247f;

    /* renamed from: g */
    private Bundle f4248g;

    /* renamed from: h */
    private Object f4249h;

    /* renamed from: i */
    private String f4250i;

    /* renamed from: j */
    private C4557b f4251j;

    /* renamed from: k */
    private C4576p f4252k;

    /* renamed from: l */
    private boolean f4253l;

    /* renamed from: m */
    private boolean f4254m;

    /* renamed from: n */
    private String f4255n;

    /* renamed from: com.facebook.l$a */
    /* compiled from: GraphRequest.kt */
    private static final class C4556a {

        /* renamed from: a */
        private final C4555l f4256a;

        /* renamed from: b */
        private final Object f4257b;

        public C4556a(C4555l lVar, Object obj) {
            C12775o.m28639i(lVar, "request");
            this.f4256a = lVar;
            this.f4257b = obj;
        }

        /* renamed from: a */
        public final C4555l mo31633a() {
            return this.f4256a;
        }

        /* renamed from: b */
        public final Object mo31634b() {
            return this.f4257b;
        }
    }

    /* renamed from: com.facebook.l$b */
    /* compiled from: GraphRequest.kt */
    public interface C4557b {
        void onCompleted(C4574o oVar);
    }

    /* renamed from: com.facebook.l$c */
    /* compiled from: GraphRequest.kt */
    public static final class C4558c {

        /* renamed from: com.facebook.l$c$a */
        /* compiled from: GraphRequest.kt */
        static final class C4559a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ ArrayList f4258b;

            /* renamed from: c */
            final /* synthetic */ C4570n f4259c;

            C4559a(ArrayList arrayList, C4570n nVar) {
                this.f4258b = arrayList;
                this.f4259c = nVar;
            }

            public final void run() {
                if (!C9925a.m20734d(this)) {
                    try {
                        if (!C9925a.m20734d(this)) {
                            Iterator it = this.f4258b.iterator();
                            while (it.hasNext()) {
                                Pair pair = (Pair) it.next();
                                Object obj = pair.second;
                                C12775o.m28638h(obj, "pair.second");
                                ((C4557b) pair.first).onCompleted((C4574o) obj);
                            }
                            for (C4570n.C4571a a : this.f4259c.mo31677A()) {
                                a.mo31557a(this.f4259c);
                            }
                        }
                    } catch (Throwable th) {
                        C9925a.m20732b(th, this);
                    }
                }
            }
        }

        private C4558c() {
        }

        public /* synthetic */ C4558c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: A */
        private final void m5659A(C4570n nVar, C9194v vVar, int i, URL url, OutputStream outputStream, boolean z) {
            C4565g gVar = new C4565g(outputStream, vVar, z);
            boolean z2 = false;
            if (i == 1) {
                C4555l u = nVar.get(0);
                HashMap hashMap = new HashMap();
                for (String next : u.mo31627s().keySet()) {
                    Object obj = u.mo31627s().get(next);
                    if (m5675t(obj)) {
                        C12775o.m28638h(next, "key");
                        hashMap.put(next, new C4556a(u, obj));
                    }
                }
                if (vVar != null) {
                    vVar.mo43475b("  Parameters:\n");
                }
                m5661D(u.mo31627s(), gVar, u);
                if (vVar != null) {
                    vVar.mo43475b("  Attachments:\n");
                }
                m5660C(hashMap, gVar);
                JSONObject o = u.mo31624o();
                if (o != null) {
                    String path = url.getPath();
                    C12775o.m28638h(path, "url.path");
                    m5678y(o, path, gVar);
                    return;
                }
                return;
            }
            String n = m5669n(nVar);
            if (n.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                gVar.mo31651a("batch_app_id", n);
                HashMap hashMap2 = new HashMap();
                m5662E(gVar, nVar, hashMap2);
                if (vVar != null) {
                    vVar.mo43475b("  Attachments:\n");
                }
                m5660C(hashMap2, gVar);
                return;
            }
            throw new FacebookException("App ID was not specified at the request or Settings.");
        }

        /* renamed from: C */
        private final void m5660C(Map<String, C4556a> map, C4565g gVar) {
            for (Map.Entry next : map.entrySet()) {
                if (C4555l.f4241t.m5675t(((C4556a) next.getValue()).mo31634b())) {
                    gVar.mo31668j((String) next.getKey(), ((C4556a) next.getValue()).mo31634b(), ((C4556a) next.getValue()).mo31633a());
                }
            }
        }

        /* renamed from: D */
        private final void m5661D(Bundle bundle, C4565g gVar, C4555l lVar) {
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (m5676u(obj)) {
                    C12775o.m28638h(next, "key");
                    gVar.mo31668j(next, obj, lVar);
                }
            }
        }

        /* renamed from: E */
        private final void m5662E(C4565g gVar, Collection<C4555l> collection, Map<String, C4556a> map) {
            JSONArray jSONArray = new JSONArray();
            for (C4555l e : collection) {
                e.m5622B(jSONArray, map);
            }
            gVar.mo31670l("batch", jSONArray, collection);
        }

        /* renamed from: G */
        private final void m5663G(HttpURLConnection httpURLConnection, boolean z) {
            if (z) {
                httpURLConnection.setRequestProperty("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                return;
            }
            httpURLConnection.setRequestProperty("Content-Type", m5670o());
        }

        /* renamed from: e */
        private final HttpURLConnection m5668e(URL url) {
            URLConnection openConnection = url.openConnection();
            if (openConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestProperty("User-Agent", m5671p());
                httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
                httpURLConnection.setChunkedStreamingMode(0);
                return httpURLConnection;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }

        /* renamed from: n */
        private final String m5669n(C4570n nVar) {
            String v = nVar.mo31706v();
            boolean z = true;
            if (v != null && (!nVar.isEmpty())) {
                return v;
            }
            Iterator it = nVar.iterator();
            while (it.hasNext()) {
                C4509a k = ((C4555l) it.next()).mo31622k();
                if (k != null) {
                    return k.mo31488c();
                }
            }
            String a = C4555l.f4238q;
            if (a != null) {
                if (a.length() <= 0) {
                    z = false;
                }
                if (z) {
                    return a;
                }
            }
            return FacebookSdk.getApplicationId();
        }

        /* renamed from: o */
        private final String m5670o() {
            C12770k0 k0Var = C12770k0.f20423a;
            String format = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{C4555l.f4237p}, 1));
            C12775o.m28638h(format, "java.lang.String.format(format, *args)");
            return format;
        }

        /* renamed from: p */
        private final String m5671p() {
            if (C4555l.f4240s == null) {
                C12770k0 k0Var = C12770k0.f20423a;
                String format = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "11.3.0"}, 2));
                C12775o.m28638h(format, "java.lang.String.format(format, *args)");
                C4555l.f4240s = format;
                String a = C9191t.m18821a();
                if (!C9138d0.m18618T(a)) {
                    String format2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{C4555l.f4240s, a}, 2));
                    C12775o.m28638h(format2, "java.lang.String.format(locale, format, *args)");
                    C4555l.f4240s = format2;
                }
            }
            return C4555l.f4240s;
        }

        /* renamed from: q */
        private final boolean m5672q(C4570n nVar) {
            for (C4570n.C4571a aVar : nVar.mo31677A()) {
                if (aVar instanceof C4570n.C4573c) {
                    return true;
                }
            }
            Iterator it = nVar.iterator();
            while (it.hasNext()) {
                if (((C4555l) it.next()).mo31623m() instanceof C4561e) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: r */
        private final boolean m5673r(C4570n nVar) {
            Iterator it = nVar.iterator();
            while (it.hasNext()) {
                C4555l lVar = (C4555l) it.next();
                Iterator<String> it2 = lVar.mo31627s().keySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (m5675t(lVar.mo31627s().get(it2.next()))) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        /* renamed from: s */
        private final boolean m5674s(String str) {
            Matcher matcher = C4555l.f4239r.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                C12775o.m28638h(str, "matcher.group(1)");
            }
            if (C13754v.m31525E(str, "me/", false, 2, (Object) null) || C13754v.m31525E(str, "/me/", false, 2, (Object) null)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public final boolean m5675t(Object obj) {
            if ((obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof C4562f)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public final boolean m5676u(Object obj) {
            if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: x */
        public final String m5677x(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (obj instanceof Date) {
                String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                C12775o.m28638h(format, "iso8601DateFormat.format(value)");
                return format;
            }
            throw new IllegalArgumentException("Unsupported parameter type.");
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
        /* renamed from: y */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void m5678y(org.json.JSONObject r10, java.lang.String r11, com.facebook.C4555l.C4560d r12) {
            /*
                r9 = this;
                boolean r0 = r9.m5674s(r11)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0023
                java.lang.String r4 = ":"
                r5 = 0
                r6 = 0
                r7 = 6
                r8 = 0
                r3 = r11
                int r0 = p454wf.C13755w.m31571W(r3, r4, r5, r6, r7, r8)
                java.lang.String r4 = "?"
                int r11 = p454wf.C13755w.m31571W(r3, r4, r5, r6, r7, r8)
                r3 = 3
                if (r0 <= r3) goto L_0x0023
                r3 = -1
                if (r11 == r3) goto L_0x0021
                if (r0 >= r11) goto L_0x0023
            L_0x0021:
                r11 = r1
                goto L_0x0024
            L_0x0023:
                r11 = r2
            L_0x0024:
                java.util.Iterator r0 = r10.keys()
            L_0x0028:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0053
                java.lang.Object r3 = r0.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r10.opt(r3)
                if (r11 == 0) goto L_0x0044
                java.lang.String r5 = "image"
                boolean r5 = p454wf.C13754v.m31530r(r3, r5, r1)
                if (r5 == 0) goto L_0x0044
                r5 = r1
                goto L_0x0045
            L_0x0044:
                r5 = r2
            L_0x0045:
                java.lang.String r6 = "key"
                kotlin.jvm.internal.C12775o.m28638h(r3, r6)
                java.lang.String r6 = "value"
                kotlin.jvm.internal.C12775o.m28638h(r4, r6)
                r9.m5679z(r3, r4, r12, r5)
                goto L_0x0028
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.C4555l.C4558c.m5678y(org.json.JSONObject, java.lang.String, com.facebook.l$d):void");
        }

        /* renamed from: z */
        private final void m5679z(String str, Object obj, C4560d dVar, boolean z) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        C12770k0 k0Var = C12770k0.f20423a;
                        String format = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        C12775o.m28638h(format, "java.lang.String.format(format, *args)");
                        Object opt = jSONObject.opt(next);
                        C12775o.m28638h(opt, "jsonObject.opt(propertyName)");
                        m5679z(format, opt, dVar, z);
                    }
                } else if (jSONObject.has("id")) {
                    String optString = jSONObject.optString("id");
                    C12775o.m28638h(optString, "jsonObject.optString(\"id\")");
                    m5679z(str, optString, dVar, z);
                } else if (jSONObject.has("url")) {
                    String optString2 = jSONObject.optString("url");
                    C12775o.m28638h(optString2, "jsonObject.optString(\"url\")");
                    m5679z(str, optString2, dVar, z);
                } else if (jSONObject.has("fbsdk:create_object")) {
                    String jSONObject2 = jSONObject.toString();
                    C12775o.m28638h(jSONObject2, "jsonObject.toString()");
                    m5679z(str, jSONObject2, dVar, z);
                }
            } else if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    C12770k0 k0Var2 = C12770k0.f20423a;
                    String format2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
                    C12775o.m28638h(format2, "java.lang.String.format(locale, format, *args)");
                    Object opt2 = jSONArray.opt(i);
                    C12775o.m28638h(opt2, "jsonArray.opt(i)");
                    m5679z(format2, opt2, dVar, z);
                }
            } else if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
                dVar.mo31651a(str, obj.toString());
            } else if (Date.class.isAssignableFrom(cls)) {
                String format3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                C12775o.m28638h(format3, "iso8601DateFormat.format(date)");
                dVar.mo31651a(str, format3);
            }
        }

        /* renamed from: B */
        public final void mo31635B(C4570n nVar, List<C4574o> list) {
            C12775o.m28639i(nVar, "requests");
            C12775o.m28639i(list, "responses");
            int size = nVar.size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                C4555l u = nVar.get(i);
                if (u.mo31623m() != null) {
                    arrayList.add(new Pair(u.mo31623m(), list.get(i)));
                }
            }
            if (arrayList.size() > 0) {
                C4559a aVar = new C4559a(arrayList, nVar);
                Handler z = nVar.mo31707z();
                if (z != null) {
                    z.post(aVar);
                } else {
                    aVar.run();
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00f2  */
        /* renamed from: F */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo31636F(com.facebook.C4570n r14, java.net.HttpURLConnection r15) {
            /*
                r13 = this;
                java.lang.String r0 = "requests"
                kotlin.jvm.internal.C12775o.m28639i(r14, r0)
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.C12775o.m28639i(r15, r0)
                q2.v r0 = new q2.v
                com.facebook.r r1 = com.facebook.C4579r.REQUESTS
                java.lang.String r2 = "Request"
                r0.<init>(r1, r2)
                int r10 = r14.size()
                boolean r11 = r13.m5673r(r14)
                r1 = 0
                r2 = 0
                r3 = 1
                if (r10 != r3) goto L_0x0029
                com.facebook.l r4 = r14.get(r1)
                com.facebook.p r4 = r4.mo31626r()
                goto L_0x002a
            L_0x0029:
                r4 = r2
            L_0x002a:
                if (r4 == 0) goto L_0x002d
                goto L_0x002f
            L_0x002d:
                com.facebook.p r4 = com.facebook.C4576p.f4293c
            L_0x002f:
                java.lang.String r5 = r4.name()
                r15.setRequestMethod(r5)
                r13.m5663G(r15, r11)
                java.net.URL r12 = r15.getURL()
                java.lang.String r5 = "Request:\n"
                r0.mo43475b(r5)
                java.lang.String r5 = "Id"
                java.lang.String r6 = r14.mo31678B()
                r0.mo43477d(r5, r6)
                java.lang.String r5 = "url"
                kotlin.jvm.internal.C12775o.m28638h(r12, r5)
                java.lang.String r5 = "URL"
                r0.mo43477d(r5, r12)
                java.lang.String r5 = r15.getRequestMethod()
                java.lang.String r6 = "connection.requestMethod"
                kotlin.jvm.internal.C12775o.m28638h(r5, r6)
                java.lang.String r6 = "Method"
                r0.mo43477d(r6, r5)
                java.lang.String r5 = "User-Agent"
                java.lang.String r6 = r15.getRequestProperty(r5)
                java.lang.String r7 = "connection.getRequestProperty(\"User-Agent\")"
                kotlin.jvm.internal.C12775o.m28638h(r6, r7)
                r0.mo43477d(r5, r6)
                java.lang.String r5 = "Content-Type"
                java.lang.String r6 = r15.getRequestProperty(r5)
                java.lang.String r7 = "connection.getRequestProperty(\"Content-Type\")"
                kotlin.jvm.internal.C12775o.m28638h(r6, r7)
                r0.mo43477d(r5, r6)
                int r5 = r14.mo31681H()
                r15.setConnectTimeout(r5)
                int r5 = r14.mo31681H()
                r15.setReadTimeout(r5)
                com.facebook.p r5 = com.facebook.C4576p.f4293c
                if (r4 != r5) goto L_0x0092
                r1 = r3
            L_0x0092:
                if (r1 != 0) goto L_0x0098
                r0.mo43478e()
                return
            L_0x0098:
                r15.setDoOutput(r3)
                java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00ef }
                java.io.OutputStream r15 = r15.getOutputStream()     // Catch:{ all -> 0x00ef }
                r1.<init>(r15)     // Catch:{ all -> 0x00ef }
                if (r11 == 0) goto L_0x00af
                java.util.zip.GZIPOutputStream r15 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x00ac }
                r15.<init>(r1)     // Catch:{ all -> 0x00ac }
                goto L_0x00b0
            L_0x00ac:
                r14 = move-exception
                r2 = r1
                goto L_0x00f0
            L_0x00af:
                r15 = r1
            L_0x00b0:
                boolean r1 = r13.m5672q(r14)     // Catch:{ all -> 0x00ec }
                if (r1 == 0) goto L_0x00db
                com.facebook.v r1 = new com.facebook.v     // Catch:{ all -> 0x00ec }
                android.os.Handler r2 = r14.mo31707z()     // Catch:{ all -> 0x00ec }
                r1.<init>(r2)     // Catch:{ all -> 0x00ec }
                r5 = 0
                r3 = r13
                r4 = r14
                r6 = r10
                r7 = r12
                r8 = r1
                r9 = r11
                r3.m5659A(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00ec }
                int r2 = r1.mo31793c()     // Catch:{ all -> 0x00ec }
                java.util.Map r5 = r1.mo31794k()     // Catch:{ all -> 0x00ec }
                com.facebook.w r1 = new com.facebook.w     // Catch:{ all -> 0x00ec }
                long r6 = (long) r2     // Catch:{ all -> 0x00ec }
                r2 = r1
                r3 = r15
                r4 = r14
                r2.<init>(r3, r4, r5, r6)     // Catch:{ all -> 0x00ec }
                r15 = r1
            L_0x00db:
                r1 = r13
                r2 = r14
                r3 = r0
                r4 = r10
                r5 = r12
                r6 = r15
                r7 = r11
                r1.m5659A(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00ec }
                r15.close()
                r0.mo43478e()
                return
            L_0x00ec:
                r14 = move-exception
                r2 = r15
                goto L_0x00f0
            L_0x00ef:
                r14 = move-exception
            L_0x00f0:
                if (r2 == 0) goto L_0x00f5
                r2.close()
            L_0x00f5:
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.C4555l.C4558c.mo31636F(com.facebook.n, java.net.HttpURLConnection):void");
        }

        /* renamed from: H */
        public final boolean mo31637H(C4555l lVar) {
            boolean z;
            C12775o.m28639i(lVar, "request");
            String x = lVar.mo31632x();
            if (x == null) {
                return true;
            }
            if (x.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            if (C13754v.m31525E(x, "v", false, 2, (Object) null)) {
                x = x.substring(1);
                C12775o.m28638h(x, "(this as java.lang.String).substring(startIndex)");
            }
            Object[] array = new C13735j("\\.").mo53415h(x, 0).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                if (strArr.length >= 2 && Integer.parseInt(strArr[0]) > 2) {
                    return true;
                }
                if (Integer.parseInt(strArr[0]) < 2 || Integer.parseInt(strArr[1]) < 4) {
                    return false;
                }
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        /* renamed from: I */
        public final HttpURLConnection mo31638I(C4570n nVar) {
            URL url;
            C12775o.m28639i(nVar, "requests");
            mo31639J(nVar);
            try {
                if (nVar.size() == 1) {
                    url = new URL(nVar.get(0).mo31631v());
                } else {
                    url = new URL(C9212z.m18914g());
                }
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = m5668e(url);
                    mo31636F(nVar, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e) {
                    C9138d0.m18651n(httpURLConnection);
                    throw new FacebookException("could not construct request body", e);
                } catch (JSONException e2) {
                    C9138d0.m18651n(httpURLConnection);
                    throw new FacebookException("could not construct request body", e2);
                }
            } catch (MalformedURLException e3) {
                throw new FacebookException("could not construct URL for request", e3);
            }
        }

        /* renamed from: J */
        public final void mo31639J(C4570n nVar) {
            C12775o.m28639i(nVar, "requests");
            Iterator it = nVar.iterator();
            while (it.hasNext()) {
                C4555l lVar = (C4555l) it.next();
                if (C4576p.f4292b == lVar.mo31626r()) {
                    C12775o.m28638h(lVar, "request");
                    if (mo31637H(lVar) && (!lVar.mo31627s().containsKey("fields") || C9138d0.m18618T(lVar.mo31627s().getString("fields")))) {
                        C9194v.C9195a aVar = C9194v.f13504f;
                        C4579r rVar = C4579r.DEVELOPER_ERRORS;
                        Object[] objArr = new Object[1];
                        String p = lVar.mo31625p();
                        if (p == null) {
                            p = "";
                        }
                        objArr[0] = p;
                        aVar.mo43481b(rVar, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", objArr);
                    }
                }
            }
        }

        /* renamed from: f */
        public final C4574o mo31640f(C4555l lVar) {
            C12775o.m28639i(lVar, "request");
            List<C4574o> i = mo31643i(lVar);
            if (i.size() == 1) {
                return i.get(0);
            }
            throw new FacebookException("invalid state: expected a single response");
        }

        /* renamed from: g */
        public final List<C4574o> mo31641g(C4570n nVar) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            List<C4574o> list;
            C12775o.m28639i(nVar, "requests");
            C9144e0.m18690i(nVar, "requests");
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = mo31638I(nVar);
                exc = null;
            } catch (Exception e) {
                exc = e;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                C9138d0.m18651n(httpURLConnection2);
                throw th;
            }
            if (httpURLConnection != null) {
                try {
                    list = mo31647m(httpURLConnection, nVar);
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection2 = httpURLConnection;
                    C9138d0.m18651n(httpURLConnection2);
                    throw th;
                }
            } else {
                List<C4574o> a = C4574o.f4283j.mo31713a(nVar.mo31679F(), (HttpURLConnection) null, new FacebookException((Throwable) exc));
                mo31635B(nVar, a);
                list = a;
            }
            C9138d0.m18651n(httpURLConnection);
            return list;
        }

        /* renamed from: h */
        public final List<C4574o> mo31642h(Collection<C4555l> collection) {
            C12775o.m28639i(collection, "requests");
            return mo31641g(new C4570n(collection));
        }

        /* renamed from: i */
        public final List<C4574o> mo31643i(C4555l... lVarArr) {
            C12775o.m28639i(lVarArr, "requests");
            return mo31642h(C12710p.m28405g0(lVarArr));
        }

        /* renamed from: j */
        public final C4568m mo31644j(C4570n nVar) {
            C12775o.m28639i(nVar, "requests");
            C9144e0.m18690i(nVar, "requests");
            C4568m mVar = new C4568m(nVar);
            mVar.executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
            return mVar;
        }

        /* renamed from: k */
        public final C4568m mo31645k(Collection<C4555l> collection) {
            C12775o.m28639i(collection, "requests");
            return mo31644j(new C4570n(collection));
        }

        /* renamed from: l */
        public final C4568m mo31646l(C4555l... lVarArr) {
            C12775o.m28639i(lVarArr, "requests");
            return mo31645k(C12710p.m28405g0(lVarArr));
        }

        /* renamed from: m */
        public final List<C4574o> mo31647m(HttpURLConnection httpURLConnection, C4570n nVar) {
            C12775o.m28639i(httpURLConnection, "connection");
            C12775o.m28639i(nVar, "requests");
            List<C4574o> f = C4574o.f4283j.mo31716f(httpURLConnection, nVar);
            C9138d0.m18651n(httpURLConnection);
            int size = nVar.size();
            if (size == f.size()) {
                mo31635B(nVar, f);
                C4527d.f4139g.mo31543e().mo31538f();
                return f;
            }
            C12770k0 k0Var = C12770k0.f20423a;
            String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(f.size()), Integer.valueOf(size)}, 2));
            C12775o.m28638h(format, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format);
        }

        /* renamed from: v */
        public final C4555l mo31648v(C4509a aVar, String str, C4557b bVar) {
            return new C4555l(aVar, str, (Bundle) null, (C4576p) null, bVar, (String) null, 32, (DefaultConstructorMarker) null);
        }

        /* renamed from: w */
        public final C4555l mo31649w(C4509a aVar, String str, JSONObject jSONObject, C4557b bVar) {
            C4555l lVar = new C4555l(aVar, str, (Bundle) null, C4576p.f4293c, bVar, (String) null, 32, (DefaultConstructorMarker) null);
            lVar.mo31615E(jSONObject);
            return lVar;
        }
    }

    /* renamed from: com.facebook.l$d */
    /* compiled from: GraphRequest.kt */
    private interface C4560d {
        /* renamed from: a */
        void mo31651a(String str, String str2);
    }

    /* renamed from: com.facebook.l$e */
    /* compiled from: GraphRequest.kt */
    public interface C4561e extends C4557b {
        /* renamed from: a */
        void mo31652a(long j, long j2);
    }

    /* renamed from: com.facebook.l$f */
    /* compiled from: GraphRequest.kt */
    public static final class C4562f<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<C4562f<?>> CREATOR = new C4563a();

        /* renamed from: d */
        public static final C4564b f4260d = new C4564b((DefaultConstructorMarker) null);

        /* renamed from: b */
        private final String f4261b;

        /* renamed from: c */
        private final RESOURCE f4262c;

        /* renamed from: com.facebook.l$f$a */
        /* compiled from: GraphRequest.kt */
        public static final class C4563a implements Parcelable.Creator<C4562f<?>> {
            C4563a() {
            }

            /* renamed from: a */
            public C4562f<?> createFromParcel(Parcel parcel) {
                C12775o.m28639i(parcel, APIParams.SOURCE);
                return new C4562f<>(parcel, (DefaultConstructorMarker) null);
            }

            /* renamed from: b */
            public C4562f<?>[] newArray(int i) {
                return new C4562f[i];
            }
        }

        /* renamed from: com.facebook.l$f$b */
        /* compiled from: GraphRequest.kt */
        public static final class C4564b {
            private C4564b() {
            }

            public /* synthetic */ C4564b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ C4562f(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        /* renamed from: a */
        public final String mo31653a() {
            return this.f4261b;
        }

        /* renamed from: b */
        public final RESOURCE mo31654b() {
            return this.f4262c;
        }

        public int describeContents() {
            return 1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C12775o.m28639i(parcel, "out");
            parcel.writeString(this.f4261b);
            parcel.writeParcelable(this.f4262c, i);
        }

        public C4562f(RESOURCE resource, String str) {
            this.f4261b = str;
            this.f4262c = resource;
        }

        private C4562f(Parcel parcel) {
            this.f4261b = parcel.readString();
            this.f4262c = parcel.readParcelable(FacebookSdk.getApplicationContext().getClassLoader());
        }
    }

    /* renamed from: com.facebook.l$g */
    /* compiled from: GraphRequest.kt */
    private static final class C4565g implements C4560d {

        /* renamed from: a */
        private boolean f4263a = true;

        /* renamed from: b */
        private final boolean f4264b;

        /* renamed from: c */
        private final OutputStream f4265c;

        /* renamed from: d */
        private final C9194v f4266d;

        public C4565g(OutputStream outputStream, C9194v vVar, boolean z) {
            C12775o.m28639i(outputStream, "outputStream");
            this.f4265c = outputStream;
            this.f4266d = vVar;
            this.f4264b = z;
        }

        /* renamed from: b */
        private final RuntimeException m5701b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        /* renamed from: a */
        public void mo31651a(String str, String str2) {
            C12775o.m28639i(str, "key");
            C12775o.m28639i(str2, "value");
            mo31664f(str, (String) null, (String) null);
            mo31667i("%s", str2);
            mo31669k();
            C9194v vVar = this.f4266d;
            if (vVar != null) {
                vVar.mo43477d("    " + str, str2);
            }
        }

        /* renamed from: c */
        public final void mo31661c(String str, Object... objArr) {
            C12775o.m28639i(str, "format");
            C12775o.m28639i(objArr, "args");
            if (!this.f4264b) {
                if (this.f4263a) {
                    OutputStream outputStream = this.f4265c;
                    Charset charset = C13726d.f22152b;
                    byte[] bytes = "--".getBytes(charset);
                    C12775o.m28638h(bytes, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    OutputStream outputStream2 = this.f4265c;
                    String b = C4555l.f4237p;
                    if (b != null) {
                        byte[] bytes2 = b.getBytes(charset);
                        C12775o.m28638h(bytes2, "(this as java.lang.String).getBytes(charset)");
                        outputStream2.write(bytes2);
                        OutputStream outputStream3 = this.f4265c;
                        byte[] bytes3 = "\r\n".getBytes(charset);
                        C12775o.m28638h(bytes3, "(this as java.lang.String).getBytes(charset)");
                        outputStream3.write(bytes3);
                        this.f4263a = false;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                OutputStream outputStream4 = this.f4265c;
                C12770k0 k0Var = C12770k0.f20423a;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
                C12775o.m28638h(format, "java.lang.String.format(format, *args)");
                Charset charset2 = C13726d.f22152b;
                if (format != null) {
                    byte[] bytes4 = format.getBytes(charset2);
                    C12775o.m28638h(bytes4, "(this as java.lang.String).getBytes(charset)");
                    outputStream4.write(bytes4);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            OutputStream outputStream5 = this.f4265c;
            C12770k0 k0Var2 = C12770k0.f20423a;
            Locale locale = Locale.US;
            Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
            String format2 = String.format(locale, str, Arrays.copyOf(copyOf2, copyOf2.length));
            C12775o.m28638h(format2, "java.lang.String.format(locale, format, *args)");
            String encode = URLEncoder.encode(format2, Constants.ENCODING);
            C12775o.m28638h(encode, "URLEncoder.encode(String… format, *args), \"UTF-8\")");
            Charset charset3 = C13726d.f22152b;
            if (encode != null) {
                byte[] bytes5 = encode.getBytes(charset3);
                C12775o.m28638h(bytes5, "(this as java.lang.String).getBytes(charset)");
                outputStream5.write(bytes5);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        /* renamed from: d */
        public final void mo31662d(String str, Bitmap bitmap) {
            C12775o.m28639i(str, "key");
            C12775o.m28639i(bitmap, "bitmap");
            mo31664f(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f4265c);
            mo31667i("", new Object[0]);
            mo31669k();
            C9194v vVar = this.f4266d;
            if (vVar != null) {
                vVar.mo43477d("    " + str, "<Image>");
            }
        }

        /* renamed from: e */
        public final void mo31663e(String str, byte[] bArr) {
            C12775o.m28639i(str, "key");
            C12775o.m28639i(bArr, "bytes");
            mo31664f(str, str, "content/unknown");
            this.f4265c.write(bArr);
            mo31667i("", new Object[0]);
            mo31669k();
            C9194v vVar = this.f4266d;
            if (vVar != null) {
                C12770k0 k0Var = C12770k0.f20423a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
                C12775o.m28638h(format, "java.lang.String.format(locale, format, *args)");
                vVar.mo43477d("    " + str, format);
            }
        }

        /* renamed from: f */
        public final void mo31664f(String str, String str2, String str3) {
            if (!this.f4264b) {
                mo31661c("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    mo31661c("; filename=\"%s\"", str2);
                }
                mo31667i("", new Object[0]);
                if (str3 != null) {
                    mo31667i("%s: %s", "Content-Type", str3);
                }
                mo31667i("", new Object[0]);
                return;
            }
            OutputStream outputStream = this.f4265c;
            C12770k0 k0Var = C12770k0.f20423a;
            String format = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
            C12775o.m28638h(format, "java.lang.String.format(format, *args)");
            Charset charset = C13726d.f22152b;
            if (format != null) {
                byte[] bytes = format.getBytes(charset);
                C12775o.m28638h(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        /* renamed from: g */
        public final void mo31665g(String str, Uri uri, String str2) {
            int i;
            C12775o.m28639i(str, "key");
            C12775o.m28639i(uri, "contentUri");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            mo31664f(str, str, str2);
            if (this.f4265c instanceof C4594v) {
                ((C4594v) this.f4265c).mo31792b(C9138d0.m18665u(uri));
                i = 0;
            } else {
                i = C9138d0.m18649m(FacebookSdk.getApplicationContext().getContentResolver().openInputStream(uri), this.f4265c) + 0;
            }
            mo31667i("", new Object[0]);
            mo31669k();
            C9194v vVar = this.f4266d;
            if (vVar != null) {
                C12770k0 k0Var = C12770k0.f20423a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                C12775o.m28638h(format, "java.lang.String.format(locale, format, *args)");
                vVar.mo43477d("    " + str, format);
            }
        }

        /* renamed from: h */
        public final void mo31666h(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int i;
            C12775o.m28639i(str, "key");
            C12775o.m28639i(parcelFileDescriptor, "descriptor");
            if (str2 == null) {
                str2 = "content/unknown";
            }
            mo31664f(str, str, str2);
            OutputStream outputStream = this.f4265c;
            if (outputStream instanceof C4594v) {
                ((C4594v) outputStream).mo31792b(parcelFileDescriptor.getStatSize());
                i = 0;
            } else {
                i = C9138d0.m18649m(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f4265c) + 0;
            }
            mo31667i("", new Object[0]);
            mo31669k();
            C9194v vVar = this.f4266d;
            if (vVar != null) {
                C12770k0 k0Var = C12770k0.f20423a;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                C12775o.m28638h(format, "java.lang.String.format(locale, format, *args)");
                vVar.mo43477d("    " + str, format);
            }
        }

        /* renamed from: i */
        public final void mo31667i(String str, Object... objArr) {
            C12775o.m28639i(str, "format");
            C12775o.m28639i(objArr, "args");
            mo31661c(str, Arrays.copyOf(objArr, objArr.length));
            if (!this.f4264b) {
                mo31661c("\r\n", new Object[0]);
            }
        }

        /* renamed from: j */
        public final void mo31668j(String str, Object obj, C4555l lVar) {
            C12775o.m28639i(str, "key");
            OutputStream outputStream = this.f4265c;
            if (outputStream instanceof C4597x) {
                if (outputStream != null) {
                    ((C4597x) outputStream).mo31791a(lVar);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.RequestOutputStream");
                }
            }
            C4558c cVar = C4555l.f4241t;
            if (cVar.m5676u(obj)) {
                mo31651a(str, cVar.m5677x(obj));
            } else if (obj instanceof Bitmap) {
                mo31662d(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                mo31663e(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                mo31665g(str, (Uri) obj, (String) null);
            } else if (obj instanceof ParcelFileDescriptor) {
                mo31666h(str, (ParcelFileDescriptor) obj, (String) null);
            } else if (obj instanceof C4562f) {
                C4562f fVar = (C4562f) obj;
                Parcelable b = fVar.mo31654b();
                String a = fVar.mo31653a();
                if (b instanceof ParcelFileDescriptor) {
                    mo31666h(str, (ParcelFileDescriptor) b, a);
                } else if (b instanceof Uri) {
                    mo31665g(str, (Uri) b, a);
                } else {
                    throw m5701b();
                }
            } else {
                throw m5701b();
            }
        }

        /* renamed from: k */
        public final void mo31669k() {
            if (!this.f4264b) {
                mo31667i("--%s", C4555l.f4237p);
                return;
            }
            OutputStream outputStream = this.f4265c;
            byte[] bytes = "&".getBytes(C13726d.f22152b);
            C12775o.m28638h(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        /* renamed from: l */
        public final void mo31670l(String str, JSONArray jSONArray, Collection<C4555l> collection) {
            C12775o.m28639i(str, "key");
            C12775o.m28639i(jSONArray, "requestJsonArray");
            C12775o.m28639i(collection, "requests");
            OutputStream outputStream = this.f4265c;
            if (!(outputStream instanceof C4597x)) {
                String jSONArray2 = jSONArray.toString();
                C12775o.m28638h(jSONArray2, "requestJsonArray.toString()");
                mo31651a(str, jSONArray2);
            } else if (outputStream != null) {
                C4597x xVar = (C4597x) outputStream;
                mo31664f(str, (String) null, (String) null);
                mo31661c("[", new Object[0]);
                int i = 0;
                for (C4555l a : collection) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    xVar.mo31791a(a);
                    if (i > 0) {
                        mo31661c(",%s", jSONObject.toString());
                    } else {
                        mo31661c("%s", jSONObject.toString());
                    }
                    i++;
                }
                mo31661c("]", new Object[0]);
                C9194v vVar = this.f4266d;
                if (vVar != null) {
                    String jSONArray3 = jSONArray.toString();
                    C12775o.m28638h(jSONArray3, "requestJsonArray.toString()");
                    vVar.mo43477d("    " + str, jSONArray3);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.RequestOutputStream");
            }
        }
    }

    /* renamed from: com.facebook.l$h */
    /* compiled from: GraphRequest.kt */
    static final class C4566h implements C4557b {

        /* renamed from: a */
        final /* synthetic */ C4557b f4267a;

        C4566h(C4557b bVar) {
            this.f4267a = bVar;
        }

        public final void onCompleted(C4574o oVar) {
            JSONObject jSONObject;
            JSONArray jSONArray;
            String str;
            String str2;
            String str3;
            C12775o.m28639i(oVar, "response");
            JSONObject c = oVar.mo31710c();
            if (c != null) {
                jSONObject = c.optJSONObject("__debug__");
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                jSONArray = jSONObject.optJSONArray("messages");
            } else {
                jSONArray = null;
            }
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        str = optJSONObject.optString("message");
                    } else {
                        str = null;
                    }
                    if (optJSONObject != null) {
                        str2 = optJSONObject.optString(JSONAPIResourceIdSerializer.FIELD_TYPE);
                    } else {
                        str2 = null;
                    }
                    if (optJSONObject != null) {
                        str3 = optJSONObject.optString("link");
                    } else {
                        str3 = null;
                    }
                    if (!(str == null || str2 == null)) {
                        C4579r rVar = C4579r.GRAPH_API_DEBUG_INFO;
                        if (C12775o.m28634d(str2, "warning")) {
                            rVar = C4579r.GRAPH_API_DEBUG_WARNING;
                        }
                        if (!C9138d0.m18618T(str3)) {
                            str = str + " Link: " + str3;
                        }
                        C9194v.f13504f.mo43482c(rVar, C4555l.f4236o, str);
                    }
                }
            }
            C4557b bVar = this.f4267a;
            if (bVar != null) {
                bVar.onCompleted(oVar);
            }
        }
    }

    /* renamed from: com.facebook.l$i */
    /* compiled from: GraphRequest.kt */
    public static final class C4567i implements C4560d {

        /* renamed from: a */
        final /* synthetic */ ArrayList f4268a;

        C4567i(ArrayList arrayList) {
            this.f4268a = arrayList;
        }

        /* renamed from: a */
        public void mo31651a(String str, String str2) {
            C12775o.m28639i(str, "key");
            C12775o.m28639i(str2, "value");
            ArrayList arrayList = this.f4268a;
            C12770k0 k0Var = C12770k0.f20423a;
            String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, Constants.ENCODING)}, 2));
            C12775o.m28638h(format, "java.lang.String.format(locale, format, *args)");
            arrayList.add(format);
        }
    }

    static {
        String simpleName = C4555l.class.getSimpleName();
        C12775o.m28638h(simpleName, "GraphRequest::class.java.simpleName");
        f4236o = simpleName;
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        C12775o.m28638h(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "buffer.toString()");
        f4237p = sb2;
    }

    public C4555l() {
        this((C4509a) null, (String) null, (Bundle) null, (C4576p) null, (C4557b) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* renamed from: A */
    public static final C4555l m5621A(C4509a aVar, String str, JSONObject jSONObject, C4557b bVar) {
        return f4241t.mo31649w(aVar, str, jSONObject, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m5622B(JSONArray jSONArray, Map<String, C4556a> map) {
        JSONObject jSONObject = new JSONObject();
        String str = this.f4245d;
        if (str != null) {
            jSONObject.put(HintConstants.AUTOFILL_HINT_NAME, str);
            jSONObject.put("omit_response_on_success", this.f4247f);
        }
        String str2 = this.f4246e;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String t = mo31628t();
        jSONObject.put("relative_url", t);
        jSONObject.put("method", this.f4252k);
        C4509a aVar = this.f4242a;
        if (aVar != null) {
            C9194v.f13504f.mo43484e(aVar.mo31500n());
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.f4248g.keySet()) {
            Object obj = this.f4248g.get(str3);
            if (f4241t.m5675t(obj)) {
                C12770k0 k0Var = C12770k0.f20423a;
                String format = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map.size())}, 2));
                C12775o.m28638h(format, "java.lang.String.format(locale, format, *args)");
                arrayList.add(format);
                map.put(format, new C4556a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.f4244c;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            f4241t.m5678y(jSONObject2, t, new C4567i(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    /* renamed from: J */
    private final boolean m5623J() {
        boolean z;
        boolean z2;
        String l = m5632l();
        if (l != null) {
            z = C13755w.m31552J(l, "|", false, 2, (Object) null);
        } else {
            z = false;
        }
        if (l == null || !C13754v.m31525E(l, "IG", false, 2, (Object) null) || z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 && m5636y()) {
            return true;
        }
        if (m5637z() || z) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private final void m5630g() {
        Bundle bundle = this.f4248g;
        if (this.f4253l || !m5623J()) {
            String l = m5632l();
            if (l != null) {
                bundle.putString("access_token", l);
            }
        } else {
            bundle.putString("access_token", m5633n());
        }
        if (!bundle.containsKey("access_token") && C9138d0.m18618T(FacebookSdk.getClientToken())) {
            Log.w(f4236o, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
        }
        bundle.putString("sdk", SystemMediaRouteProvider.PACKAGE_NAME);
        bundle.putString("format", "json");
        if (FacebookSdk.isLoggingBehaviorEnabled(C4579r.GRAPH_API_DEBUG_INFO)) {
            bundle.putString("debug", "info");
        } else if (FacebookSdk.isLoggingBehaviorEnabled(C4579r.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString("debug", "warning");
        }
    }

    /* renamed from: h */
    private final String m5631h(String str, boolean z) {
        if (!z && this.f4252k == C4576p.f4293c) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String next : this.f4248g.keySet()) {
            Object obj = this.f4248g.get(next);
            if (obj == null) {
                obj = "";
            }
            C4558c cVar = f4241t;
            if (cVar.m5676u(obj)) {
                buildUpon.appendQueryParameter(next, cVar.m5677x(obj).toString());
            } else if (this.f4252k != C4576p.f4292b) {
                C12770k0 k0Var = C12770k0.f20423a;
                String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                C12775o.m28638h(format, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(format);
            }
        }
        String builder = buildUpon.toString();
        C12775o.m28638h(builder, "uriBuilder.toString()");
        return builder;
    }

    /* renamed from: l */
    private final String m5632l() {
        C4509a aVar = this.f4242a;
        if (aVar != null) {
            if (!this.f4248g.containsKey("access_token")) {
                String n = aVar.mo31500n();
                C9194v.f13504f.mo43484e(n);
                return n;
            }
        } else if (!this.f4253l && !this.f4248g.containsKey("access_token")) {
            return m5633n();
        }
        return this.f4248g.getString("access_token");
    }

    /* renamed from: n */
    private final String m5633n() {
        String applicationId = FacebookSdk.getApplicationId();
        String clientToken = FacebookSdk.getClientToken();
        if (C9138d0.m18618T(applicationId) || C9138d0.m18618T(clientToken)) {
            C9138d0.m18626a0(f4236o, "Warning: Request without access token missing application ID or client token.");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (applicationId != null) {
            sb.append(applicationId);
            sb.append("|");
            if (clientToken != null) {
                sb.append(clientToken);
                return sb.toString();
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: q */
    private final String m5634q() {
        if (f4239r.matcher(this.f4243b).matches()) {
            return this.f4243b;
        }
        C12770k0 k0Var = C12770k0.f20423a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f4250i, this.f4243b}, 2));
        C12775o.m28638h(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: w */
    private final String m5635w(String str) {
        if (!m5637z()) {
            str = C9212z.m18913f();
        }
        C12770k0 k0Var = C12770k0.f20423a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{str, m5634q()}, 2));
        C12775o.m28638h(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: y */
    private final boolean m5636y() {
        if (this.f4243b == null) {
            return false;
        }
        String str = "^/?" + FacebookSdk.getApplicationId() + "/?.*";
        if (this.f4254m || Pattern.matches(str, this.f4243b)) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    private final boolean m5637z() {
        if (!C12775o.m28634d(FacebookSdk.getGraphDomain(), FacebookSdk.INSTAGRAM_COM)) {
            return true;
        }
        return !m5636y();
    }

    /* renamed from: C */
    public final void mo31613C(C4557b bVar) {
        if (FacebookSdk.isLoggingBehaviorEnabled(C4579r.GRAPH_API_DEBUG_INFO) || FacebookSdk.isLoggingBehaviorEnabled(C4579r.GRAPH_API_DEBUG_WARNING)) {
            this.f4251j = new C4566h(bVar);
        } else {
            this.f4251j = bVar;
        }
    }

    /* renamed from: D */
    public final void mo31614D(boolean z) {
        this.f4254m = z;
    }

    /* renamed from: E */
    public final void mo31615E(JSONObject jSONObject) {
        this.f4244c = jSONObject;
    }

    /* renamed from: F */
    public final void mo31616F(C4576p pVar) {
        if (this.f4255n == null || pVar == C4576p.f4292b) {
            if (pVar == null) {
                pVar = C4576p.f4292b;
            }
            this.f4252k = pVar;
            return;
        }
        throw new FacebookException("Can't change HTTP method on request with overridden URL.");
    }

    /* renamed from: G */
    public final void mo31617G(Bundle bundle) {
        C12775o.m28639i(bundle, "<set-?>");
        this.f4248g = bundle;
    }

    /* renamed from: H */
    public final void mo31618H(boolean z) {
        this.f4253l = z;
    }

    /* renamed from: I */
    public final void mo31619I(Object obj) {
        this.f4249h = obj;
    }

    /* renamed from: i */
    public final C4574o mo31620i() {
        return f4241t.mo31640f(this);
    }

    /* renamed from: j */
    public final C4568m mo31621j() {
        return f4241t.mo31646l(this);
    }

    /* renamed from: k */
    public final C4509a mo31622k() {
        return this.f4242a;
    }

    /* renamed from: m */
    public final C4557b mo31623m() {
        return this.f4251j;
    }

    /* renamed from: o */
    public final JSONObject mo31624o() {
        return this.f4244c;
    }

    /* renamed from: p */
    public final String mo31625p() {
        return this.f4243b;
    }

    /* renamed from: r */
    public final C4576p mo31626r() {
        return this.f4252k;
    }

    /* renamed from: s */
    public final Bundle mo31627s() {
        return this.f4248g;
    }

    /* renamed from: t */
    public final String mo31628t() {
        if (this.f4255n == null) {
            String w = m5635w(C9212z.m18914g());
            m5630g();
            Uri parse = Uri.parse(m5631h(w, true));
            C12770k0 k0Var = C12770k0.f20423a;
            C12775o.m28638h(parse, com.appboy.Constants.APPBOY_PUSH_DEEP_LINK_KEY);
            String format = String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
            C12775o.m28638h(format, "java.lang.String.format(format, *args)");
            return format;
        }
        throw new FacebookException("Can't override URL for a batch request");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.f4242a;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.f4243b);
        sb.append(", graphObject: ");
        sb.append(this.f4244c);
        sb.append(", httpMethod: ");
        sb.append(this.f4252k);
        sb.append(", parameters: ");
        sb.append(this.f4248g);
        sb.append("}");
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return sb2;
    }

    /* renamed from: u */
    public final Object mo31630u() {
        return this.f4249h;
    }

    /* renamed from: v */
    public final String mo31631v() {
        String str;
        String str2 = this.f4255n;
        if (str2 != null) {
            return String.valueOf(str2);
        }
        String str3 = this.f4243b;
        if (this.f4252k != C4576p.f4293c || str3 == null || !C13754v.m31529q(str3, "/videos", false, 2, (Object) null)) {
            str = C9212z.m18915h(FacebookSdk.getGraphDomain());
        } else {
            str = C9212z.m18916i();
        }
        String w = m5635w(str);
        m5630g();
        return m5631h(w, false);
    }

    /* renamed from: x */
    public final String mo31632x() {
        return this.f4250i;
    }

    public C4555l(C4509a aVar, String str, Bundle bundle, C4576p pVar, C4557b bVar) {
        this(aVar, str, bundle, pVar, bVar, (String) null, 32, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C4555l(com.facebook.C4509a r6, java.lang.String r7, android.os.Bundle r8, com.facebook.C4576p r9, com.facebook.C4555l.C4557b r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C4555l.<init>(com.facebook.a, java.lang.String, android.os.Bundle, com.facebook.p, com.facebook.l$b, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public C4555l(C4509a aVar, String str, Bundle bundle, C4576p pVar, C4557b bVar, String str2) {
        this.f4247f = true;
        this.f4242a = aVar;
        this.f4243b = str;
        this.f4250i = str2;
        mo31613C(bVar);
        mo31616F(pVar);
        if (bundle != null) {
            this.f4248g = new Bundle(bundle);
        } else {
            this.f4248g = new Bundle();
        }
        if (this.f4250i == null) {
            this.f4250i = FacebookSdk.getGraphApiVersion();
        }
    }
}
