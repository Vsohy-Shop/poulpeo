package p050c7;

import androidx.core.app.NotificationCompat;
import org.json.JSONObject;
import p064d7.C7278a;
import p064d7.C7279b;
import p064d7.C7280c;
import p064d7.C7281d;
import p064d7.C7282e;
import p255v6.C10015r;

/* renamed from: c7.b */
/* compiled from: DefaultSettingsJsonTransform */
class C3890b implements C3896g {
    C3890b() {
    }

    /* renamed from: b */
    private static C7278a m4382b(JSONObject jSONObject) {
        return new C7278a(jSONObject.getString(NotificationCompat.CATEGORY_STATUS), jSONObject.getString("url"), jSONObject.getString("reports_url"), jSONObject.getString("ndk_reports_url"), jSONObject.optBoolean("update_required", false));
    }

    /* renamed from: c */
    private static C7279b m4383c(JSONObject jSONObject) {
        return new C7279b(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    /* renamed from: d */
    private static C7280c m4384d(JSONObject jSONObject) {
        return new C7280c(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* renamed from: e */
    static C7281d m4385e(C10015r rVar) {
        JSONObject jSONObject = new JSONObject();
        return new C7282e(m4386f(rVar, 3600, jSONObject), (C7278a) null, m4384d(jSONObject), m4383c(jSONObject), 0, 3600);
    }

    /* renamed from: f */
    private static long m4386f(C10015r rVar, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return rVar.mo44589a() + (j * 1000);
    }

    /* renamed from: a */
    public C7282e mo29935a(C10015r rVar, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new C7282e(m4386f(rVar, (long) optInt2, jSONObject), m4382b(jSONObject.getJSONObject("app")), m4384d(jSONObject.getJSONObject("session")), m4383c(jSONObject.getJSONObject("features")), optInt, optInt2);
    }
}
