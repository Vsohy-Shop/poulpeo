package p021a3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p021a3.C2166l;
import p033b2.C2867m;
import p251v2.C9925a;

/* renamed from: a3.o */
/* compiled from: LoginLogger */
class C2180o {

    /* renamed from: d */
    private static final ScheduledExecutorService f933d = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: a */
    private final C2867m f934a;

    /* renamed from: b */
    private String f935b;

    /* renamed from: c */
    private String f936c;

    /* renamed from: a3.o$a */
    /* compiled from: LoginLogger */
    class C2181a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Bundle f937b;

        C2181a(Bundle bundle) {
            this.f937b = bundle;
        }

        public void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    C2180o.m1674a(C2180o.this).mo28392g("fb_mobile_login_heartbeat", this.f937b);
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    C2180o(Context context, String str) {
        PackageInfo packageInfo;
        this.f935b = str;
        this.f934a = new C2867m(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) != null) {
                this.f936c = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    static /* synthetic */ C2867m m1674a(C2180o oVar) {
        Class<C2180o> cls = C2180o.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return oVar.f934a;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: g */
    private void m1675g(String str) {
        if (!C9925a.m20734d(this)) {
            try {
                f933d.schedule(new C2181a(m1676k(str)), 5, TimeUnit.SECONDS);
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: k */
    static Bundle m1676k(String str) {
        Class<C2180o> cls = C2180o.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public String mo23443b() {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            return this.f935b;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: c */
    public void mo23444c(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6) {
        if (!C9925a.m20734d(this)) {
            try {
                Bundle k = m1676k(str);
                if (str3 != null) {
                    k.putString("2_result", str3);
                }
                if (str4 != null) {
                    k.putString("5_error_message", str4);
                }
                if (str5 != null) {
                    k.putString("4_error_code", str5);
                }
                if (map != null && !map.isEmpty()) {
                    k.putString("6_extras", new JSONObject(map).toString());
                }
                k.putString("3_method", str2);
                this.f934a.mo28392g(str6, k);
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: d */
    public void mo23445d(String str, String str2, String str3) {
        if (!C9925a.m20734d(this)) {
            try {
                Bundle k = m1676k(str);
                k.putString("3_method", str2);
                this.f934a.mo28392g(str3, k);
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: e */
    public void mo23446e(String str, String str2, String str3) {
        if (!C9925a.m20734d(this)) {
            try {
                Bundle k = m1676k(str);
                k.putString("3_method", str2);
                this.f934a.mo28392g(str3, k);
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: f */
    public void mo23447f(String str, Map<String, String> map, C2166l.C2172e.C2174b bVar, Map<String, String> map2, Exception exc, String str2) {
        JSONObject jSONObject;
        if (!C9925a.m20734d(this)) {
            try {
                Bundle k = m1676k(str);
                if (bVar != null) {
                    k.putString("2_result", bVar.mo23432a());
                }
                if (!(exc == null || exc.getMessage() == null)) {
                    k.putString("5_error_message", exc.getMessage());
                }
                if (!map.isEmpty()) {
                    jSONObject = new JSONObject(map);
                } else {
                    jSONObject = null;
                }
                if (map2 != null) {
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    try {
                        for (Map.Entry next : map2.entrySet()) {
                            jSONObject.put((String) next.getKey(), next.getValue());
                        }
                    } catch (JSONException unused) {
                    }
                }
                if (jSONObject != null) {
                    k.putString("6_extras", jSONObject.toString());
                }
                this.f934a.mo28392g(str2, k);
                if (bVar == C2166l.C2172e.C2174b.SUCCESS) {
                    m1675g(str);
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:3|4|5|6|(1:8)|9|(1:11)|12|13|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0074 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23448h(p021a3.C2166l.C2170d r6, java.lang.String r7) {
        /*
            r5 = this;
            boolean r0 = p251v2.C9925a.m20734d(r5)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r0 = r6.mo23399b()     // Catch:{ all -> 0x007b }
            android.os.Bundle r0 = m1676k(r0)     // Catch:{ all -> 0x007b }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0074 }
            r1.<init>()     // Catch:{ JSONException -> 0x0074 }
            java.lang.String r2 = "login_behavior"
            a3.k r3 = r6.mo23405g()     // Catch:{ JSONException -> 0x0074 }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0074 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0074 }
            java.lang.String r2 = "request_code"
            int r3 = p021a3.C2166l.m1599q()     // Catch:{ JSONException -> 0x0074 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0074 }
            java.lang.String r2 = "permissions"
            java.lang.String r3 = ","
            java.util.Set r4 = r6.mo23409l()     // Catch:{ JSONException -> 0x0074 }
            java.lang.String r3 = android.text.TextUtils.join(r3, r4)     // Catch:{ JSONException -> 0x0074 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0074 }
            java.lang.String r2 = "default_audience"
            a3.c r3 = r6.mo23401d()     // Catch:{ JSONException -> 0x0074 }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0074 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0074 }
            java.lang.String r2 = "isReauthorize"
            boolean r3 = r6.mo23414q()     // Catch:{ JSONException -> 0x0074 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0074 }
            java.lang.String r2 = r5.f936c     // Catch:{ JSONException -> 0x0074 }
            if (r2 == 0) goto L_0x0058
            java.lang.String r3 = "facebookVersion"
            r1.put(r3, r2)     // Catch:{ JSONException -> 0x0074 }
        L_0x0058:
            a3.s r2 = r6.mo23406h()     // Catch:{ JSONException -> 0x0074 }
            if (r2 == 0) goto L_0x006b
            java.lang.String r2 = "target_app"
            a3.s r6 = r6.mo23406h()     // Catch:{ JSONException -> 0x0074 }
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x0074 }
            r1.put(r2, r6)     // Catch:{ JSONException -> 0x0074 }
        L_0x006b:
            java.lang.String r6 = "6_extras"
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x0074 }
            r0.putString(r6, r1)     // Catch:{ JSONException -> 0x0074 }
        L_0x0074:
            b2.m r6 = r5.f934a     // Catch:{ all -> 0x007b }
            r1 = 0
            r6.mo28393h(r7, r1, r0)     // Catch:{ all -> 0x007b }
            return
        L_0x007b:
            r6 = move-exception
            p251v2.C9925a.m20732b(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p021a3.C2180o.mo23448h(a3.l$d, java.lang.String):void");
    }

    /* renamed from: i */
    public void mo23449i(String str, String str2) {
        if (!C9925a.m20734d(this)) {
            try {
                mo23450j(str, str2, "");
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: j */
    public void mo23450j(String str, String str2, String str3) {
        if (!C9925a.m20734d(this)) {
            try {
                Bundle k = m1676k("");
                k.putString("2_result", C2166l.C2172e.C2174b.ERROR.mo23432a());
                k.putString("5_error_message", str2);
                k.putString("3_method", str3);
                this.f934a.mo28392g(str, k);
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }
}
