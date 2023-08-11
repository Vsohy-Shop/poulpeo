package p050c7;

import org.json.JSONObject;
import p064d7.C7282e;
import p255v6.C10015r;

/* renamed from: c7.f */
/* compiled from: SettingsJsonParser */
public class C3895f {

    /* renamed from: a */
    private final C10015r f2990a;

    C3895f(C10015r rVar) {
        this.f2990a = rVar;
    }

    /* renamed from: a */
    private static C3896g m4410a(int i) {
        if (i != 3) {
            return new C3890b();
        }
        return new C3897h();
    }

    /* renamed from: b */
    public C7282e mo29943b(JSONObject jSONObject) {
        return m4410a(jSONObject.getInt("settings_version")).mo29935a(this.f2990a, jSONObject);
    }
}
