package p050c7;

import androidx.core.app.NotificationCompat;
import java.util.Locale;
import org.json.JSONObject;
import p064d7.C7278a;
import p064d7.C7279b;
import p064d7.C7280c;
import p064d7.C7282e;
import p255v6.C10015r;

/* renamed from: c7.h */
/* compiled from: SettingsV3JsonTransform */
class C3897h implements C3896g {
    C3897h() {
    }

    /* renamed from: b */
    private static C7278a m4413b(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String string = jSONObject2.getString(NotificationCompat.CATEGORY_STATUS);
        boolean equals = "new".equals(string);
        String string2 = jSONObject.getString("bundle_id");
        String string3 = jSONObject.getString("org_id");
        if (equals) {
            str = "https://update.crashlytics.com/spi/v1/platforms/android/apps";
        } else {
            str = String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", new Object[]{string2});
        }
        String str2 = str;
        Locale locale = Locale.US;
        return new C7278a(string, str2, String.format(locale, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", new Object[]{string2}), String.format(locale, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", new Object[]{string2}), string2, string3, jSONObject2.optBoolean("update_required", false), jSONObject2.optInt("report_upload_variant", 0), jSONObject2.optInt("native_report_upload_variant", 0));
    }

    /* renamed from: c */
    private static C7279b m4414c(JSONObject jSONObject) {
        return new C7279b(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    /* renamed from: d */
    private static C7280c m4415d() {
        return new C7280c(8, 4);
    }

    /* renamed from: e */
    private static long m4416e(C10015r rVar, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return rVar.mo44589a() + (j * 1000);
    }

    /* renamed from: a */
    public C7282e mo29935a(C10015r rVar, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new C7282e(m4416e(rVar, (long) optInt2, jSONObject), m4413b(jSONObject.getJSONObject("fabric"), jSONObject.getJSONObject("app")), m4415d(), m4414c(jSONObject.getJSONObject("features")), optInt, optInt2);
    }
}
