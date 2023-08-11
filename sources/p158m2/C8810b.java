package p158m2;

import android.content.SharedPreferences;
import com.facebook.FacebookSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12775o;
import p198q2.C9138d0;
import p251v2.C9925a;

/* renamed from: m2.b */
/* compiled from: PredictionHistoryManager.kt */
public final class C8810b {

    /* renamed from: a */
    private static final Map<String, String> f12768a = new LinkedHashMap();

    /* renamed from: b */
    private static SharedPreferences f12769b;

    /* renamed from: c */
    private static final AtomicBoolean f12770c = new AtomicBoolean(false);

    /* renamed from: d */
    public static final C8810b f12771d = new C8810b();

    private C8810b() {
    }

    /* renamed from: a */
    public static final void m17844a(String str, String str2) {
        Class<C8810b> cls = C8810b.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(str, "pathID");
                C12775o.m28639i(str2, "predictedEvent");
                if (!f12770c.get()) {
                    f12771d.m17846c();
                }
                Map<String, String> map = f12768a;
                map.put(str, str2);
                SharedPreferences sharedPreferences = f12769b;
                if (sharedPreferences == null) {
                    C12775o.m28656z("shardPreferences");
                }
                sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", C9138d0.m18630c0(C12716r0.m28427r(map))).apply();
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:3|4|5|6|7|(1:9)|17|10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0038 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m17845b(android.view.View r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "text"
            java.lang.Class<m2.b> r1 = p158m2.C8810b.class
            boolean r2 = p251v2.C9925a.m20734d(r1)
            r3 = 0
            if (r2 == 0) goto L_0x000c
            return r3
        L_0x000c:
            java.lang.String r2 = "view"
            kotlin.jvm.internal.C12775o.m28639i(r4, r2)     // Catch:{ all -> 0x0041 }
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)     // Catch:{ all -> 0x0041 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0041 }
            r2.<init>()     // Catch:{ all -> 0x0041 }
            r2.put(r0, r5)     // Catch:{ JSONException -> 0x0038 }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0038 }
            r5.<init>()     // Catch:{ JSONException -> 0x0038 }
        L_0x0021:
            if (r4 == 0) goto L_0x0033
            java.lang.Class r0 = r4.getClass()     // Catch:{ JSONException -> 0x0038 }
            java.lang.String r0 = r0.getSimpleName()     // Catch:{ JSONException -> 0x0038 }
            r5.put(r0)     // Catch:{ JSONException -> 0x0038 }
            android.view.ViewGroup r4 = p071e2.C7454f.m14607j(r4)     // Catch:{ JSONException -> 0x0038 }
            goto L_0x0021
        L_0x0033:
            java.lang.String r4 = "classname"
            r2.put(r4, r5)     // Catch:{ JSONException -> 0x0038 }
        L_0x0038:
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x0041 }
            java.lang.String r4 = p198q2.C9138d0.m18668v0(r4)     // Catch:{ all -> 0x0041 }
            return r4
        L_0x0041:
            r4 = move-exception
            p251v2.C9925a.m20732b(r4, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p158m2.C8810b.m17845b(android.view.View, java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    private final void m17846c() {
        String str = "";
        if (!C9925a.m20734d(this)) {
            try {
                AtomicBoolean atomicBoolean = f12770c;
                if (!atomicBoolean.get()) {
                    SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
                    C12775o.m28638h(sharedPreferences, "FacebookSdk.getApplicati…RE, Context.MODE_PRIVATE)");
                    f12769b = sharedPreferences;
                    Map<String, String> map = f12768a;
                    if (sharedPreferences == null) {
                        C12775o.m28656z("shardPreferences");
                    }
                    String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", str);
                    if (string != null) {
                        str = string;
                    }
                    C12775o.m28638h(str, "shardPreferences.getStri…EVENTS_HISTORY, \"\") ?: \"\"");
                    map.putAll(C9138d0.m18623Y(str));
                    atomicBoolean.set(true);
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: d */
    public static final String m17847d(String str) {
        Class<C8810b> cls = C8810b.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(str, "pathID");
            Map<String, String> map = f12768a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return null;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }
}
