package com.facebook;

import android.util.Log;
import androidx.core.p004os.EnvironmentCompat;
import com.facebook.C4509a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import p198q2.C9138d0;
import p198q2.C9194v;

/* renamed from: com.facebook.o */
/* compiled from: GraphResponse.kt */
public final class C4574o {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String f4282i = C4574o.class.getCanonicalName();

    /* renamed from: j */
    public static final C4575a f4283j = new C4575a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final JSONObject f4284a;

    /* renamed from: b */
    private final JSONArray f4285b;

    /* renamed from: c */
    private final C4555l f4286c;

    /* renamed from: d */
    private final HttpURLConnection f4287d;

    /* renamed from: e */
    private final String f4288e;

    /* renamed from: f */
    private final JSONObject f4289f;

    /* renamed from: g */
    private final JSONArray f4290g;

    /* renamed from: h */
    private final C4550k f4291h;

    /* renamed from: com.facebook.o$a */
    /* compiled from: GraphResponse.kt */
    public static final class C4575a {
        private C4575a() {
        }

        public /* synthetic */ C4575a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final C4574o m5744b(C4555l lVar, HttpURLConnection httpURLConnection, Object obj, Object obj2) {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                C4550k a = C4550k.f4215q.mo31609a(jSONObject, obj2, httpURLConnection);
                if (a != null) {
                    Log.e(C4574o.f4282i, a.toString());
                    if (a.mo31596b() == 190 && C9138d0.m18615Q(lVar.mo31622k())) {
                        if (a.mo31602g() != 493) {
                            C4509a.f4119q.mo31518h((C4509a) null);
                        } else {
                            C4509a.C4512c cVar = C4509a.f4119q;
                            C4509a e = cVar.mo31515e();
                            if (e != null && !e.mo31502q()) {
                                cVar.mo31514d();
                            }
                        }
                    }
                    return new C4574o(lVar, httpURLConnection, a);
                }
                Object G = C9138d0.m18605G(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (G instanceof JSONObject) {
                    return new C4574o(lVar, httpURLConnection, G.toString(), (JSONObject) G);
                }
                if (G instanceof JSONArray) {
                    return new C4574o(lVar, httpURLConnection, G.toString(), (JSONArray) G);
                }
                obj = JSONObject.NULL;
                C12775o.m28638h(obj, "JSONObject.NULL");
            }
            if (obj == JSONObject.NULL) {
                return new C4574o(lVar, httpURLConnection, obj.toString(), (JSONObject) null);
            }
            throw new FacebookException("Got unexpected object type in response, class: " + obj.getClass().getSimpleName());
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.util.List<com.facebook.C4574o> m5745c(java.net.HttpURLConnection r9, java.util.List<com.facebook.C4555l> r10, java.lang.Object r11) {
            /*
                r8 = this;
                int r0 = r10.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 1
                r3 = 0
                if (r0 != r2) goto L_0x0051
                java.lang.Object r2 = r10.get(r3)
                com.facebook.l r2 = (com.facebook.C4555l) r2
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
                r4.<init>()     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
                java.lang.String r5 = "body"
                r4.put(r5, r11)     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
                if (r9 == 0) goto L_0x0024
                int r5 = r9.getResponseCode()     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
                goto L_0x0026
            L_0x0024:
                r5 = 200(0xc8, float:2.8E-43)
            L_0x0026:
                java.lang.String r6 = "code"
                r4.put(r6, r5)     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
                org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
                r5.<init>()     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
                r5.put(r4)     // Catch:{ JSONException -> 0x0043, IOException -> 0x0034 }
                goto L_0x0052
            L_0x0034:
                r4 = move-exception
                com.facebook.o r5 = new com.facebook.o
                com.facebook.k r6 = new com.facebook.k
                r6.<init>((java.net.HttpURLConnection) r9, (java.lang.Exception) r4)
                r5.<init>(r2, r9, r6)
                r1.add(r5)
                goto L_0x0051
            L_0x0043:
                r4 = move-exception
                com.facebook.o r5 = new com.facebook.o
                com.facebook.k r6 = new com.facebook.k
                r6.<init>((java.net.HttpURLConnection) r9, (java.lang.Exception) r4)
                r5.<init>(r2, r9, r6)
                r1.add(r5)
            L_0x0051:
                r5 = r11
            L_0x0052:
                boolean r2 = r5 instanceof org.json.JSONArray
                if (r2 == 0) goto L_0x00a0
                r2 = r5
                org.json.JSONArray r2 = (org.json.JSONArray) r2
                int r4 = r2.length()
                if (r4 != r0) goto L_0x00a0
                int r0 = r2.length()
            L_0x0063:
                if (r3 >= r0) goto L_0x009f
                java.lang.Object r2 = r10.get(r3)
                com.facebook.l r2 = (com.facebook.C4555l) r2
                r4 = r5
                org.json.JSONArray r4 = (org.json.JSONArray) r4     // Catch:{ JSONException -> 0x008e, FacebookException -> 0x007f }
                java.lang.Object r4 = r4.get(r3)     // Catch:{ JSONException -> 0x008e, FacebookException -> 0x007f }
                java.lang.String r6 = "obj"
                kotlin.jvm.internal.C12775o.m28638h(r4, r6)     // Catch:{ JSONException -> 0x008e, FacebookException -> 0x007f }
                com.facebook.o r4 = r8.m5744b(r2, r9, r4, r11)     // Catch:{ JSONException -> 0x008e, FacebookException -> 0x007f }
                r1.add(r4)     // Catch:{ JSONException -> 0x008e, FacebookException -> 0x007f }
                goto L_0x009c
            L_0x007f:
                r4 = move-exception
                com.facebook.o r6 = new com.facebook.o
                com.facebook.k r7 = new com.facebook.k
                r7.<init>((java.net.HttpURLConnection) r9, (java.lang.Exception) r4)
                r6.<init>(r2, r9, r7)
                r1.add(r6)
                goto L_0x009c
            L_0x008e:
                r4 = move-exception
                com.facebook.o r6 = new com.facebook.o
                com.facebook.k r7 = new com.facebook.k
                r7.<init>((java.net.HttpURLConnection) r9, (java.lang.Exception) r4)
                r6.<init>(r2, r9, r7)
                r1.add(r6)
            L_0x009c:
                int r3 = r3 + 1
                goto L_0x0063
            L_0x009f:
                return r1
            L_0x00a0:
                com.facebook.FacebookException r9 = new com.facebook.FacebookException
                java.lang.String r10 = "Unexpected number of results"
                r9.<init>((java.lang.String) r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.C4574o.C4575a.m5745c(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
        }

        /* renamed from: a */
        public final List<C4574o> mo31713a(List<C4555l> list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
            C12775o.m28639i(list, "requests");
            Iterable<C4555l> iterable = list;
            ArrayList arrayList = new ArrayList(C12728x.m28544v(iterable, 10));
            for (C4555l oVar : iterable) {
                arrayList.add(new C4574o(oVar, httpURLConnection, new C4550k(httpURLConnection, (Exception) facebookException)));
            }
            return arrayList;
        }

        /* renamed from: d */
        public final List<C4574o> mo31714d(InputStream inputStream, HttpURLConnection httpURLConnection, C4570n nVar) {
            C12775o.m28639i(nVar, "requests");
            String j0 = C9138d0.m18644j0(inputStream);
            C9194v.f13504f.mo43483d(C4579r.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(j0.length()), j0);
            return mo31715e(j0, httpURLConnection, nVar);
        }

        /* renamed from: e */
        public final List<C4574o> mo31715e(String str, HttpURLConnection httpURLConnection, C4570n nVar) {
            C12775o.m28639i(str, "responseString");
            C12775o.m28639i(nVar, "requests");
            Object nextValue = new JSONTokener(str).nextValue();
            C12775o.m28638h(nextValue, "resultObject");
            List<C4574o> c = m5745c(httpURLConnection, nVar, nextValue);
            C9194v.f13504f.mo43483d(C4579r.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", nVar.mo31678B(), Integer.valueOf(str.length()), c);
            return c;
        }

        /* renamed from: f */
        public final List<C4574o> mo31716f(HttpURLConnection httpURLConnection, C4570n nVar) {
            List<C4574o> a;
            C12775o.m28639i(httpURLConnection, "connection");
            C12775o.m28639i(nVar, "requests");
            InputStream inputStream = null;
            try {
                if (FacebookSdk.isFullyInitialized()) {
                    if (httpURLConnection.getResponseCode() >= 400) {
                        inputStream = httpURLConnection.getErrorStream();
                    } else {
                        inputStream = httpURLConnection.getInputStream();
                    }
                    a = mo31714d(inputStream, httpURLConnection, nVar);
                    C9138d0.m18637g(inputStream);
                    return a;
                }
                Log.e(C4574o.f4282i, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
            } catch (FacebookException e) {
                C9194v.f13504f.mo43483d(C4579r.REQUESTS, "Response", "Response <Error>: %s", e);
                a = mo31713a(nVar, httpURLConnection, e);
            } catch (Exception e2) {
                C9194v.f13504f.mo43483d(C4579r.REQUESTS, "Response", "Response <Error>: %s", e2);
                a = mo31713a(nVar, httpURLConnection, new FacebookException((Throwable) e2));
            } catch (Throwable th) {
                C9138d0.m18637g((Closeable) null);
                throw th;
            }
        }
    }

    public C4574o(C4555l lVar, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, C4550k kVar) {
        C12775o.m28639i(lVar, "request");
        this.f4286c = lVar;
        this.f4287d = httpURLConnection;
        this.f4288e = str;
        this.f4289f = jSONObject;
        this.f4290g = jSONArray;
        this.f4291h = kVar;
        this.f4284a = jSONObject;
        this.f4285b = jSONArray;
    }

    /* renamed from: b */
    public final C4550k mo31709b() {
        return this.f4291h;
    }

    /* renamed from: c */
    public final JSONObject mo31710c() {
        return this.f4289f;
    }

    /* renamed from: d */
    public final JSONObject mo31711d() {
        return this.f4284a;
    }

    public String toString() {
        String str;
        int i;
        try {
            C12770k0 k0Var = C12770k0.f20423a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f4287d;
            if (httpURLConnection != null) {
                i = httpURLConnection.getResponseCode();
            } else {
                i = 200;
            }
            objArr[0] = Integer.valueOf(i);
            str = String.format(locale, TimeModel.NUMBER_FORMAT, Arrays.copyOf(objArr, 1));
            C12775o.m28638h(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        String str2 = "{Response: " + " responseCode: " + str + ", graphObject: " + this.f4289f + ", error: " + this.f4291h + "}";
        C12775o.m28638h(str2, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C4574o(C4555l lVar, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(lVar, httpURLConnection, str, jSONObject, (JSONArray) null, (C4550k) null);
        C12775o.m28639i(lVar, "request");
        C12775o.m28639i(str, "rawResponse");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C4574o(C4555l lVar, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(lVar, httpURLConnection, str, (JSONObject) null, jSONArray, (C4550k) null);
        C12775o.m28639i(lVar, "request");
        C12775o.m28639i(str, "rawResponse");
        C12775o.m28639i(jSONArray, "graphObjects");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C4574o(C4555l lVar, HttpURLConnection httpURLConnection, C4550k kVar) {
        this(lVar, httpURLConnection, (String) null, (JSONObject) null, (JSONArray) null, kVar);
        C12775o.m28639i(lVar, "request");
        C12775o.m28639i(kVar, MediaRouteProviderProtocol.SERVICE_DATA_ERROR);
    }
}
