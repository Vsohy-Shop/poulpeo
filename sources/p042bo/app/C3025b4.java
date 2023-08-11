package p042bo.app;

import kotlin.jvm.internal.C12775o;
import org.json.JSONArray;
import org.json.JSONObject;
import p057d0.C7213c;

/* renamed from: bo.app.b4 */
public final class C3025b4 implements C7213c<JSONArray>, C3223i2 {

    /* renamed from: b */
    private final JSONObject f1475b;

    /* renamed from: c */
    private final JSONArray f1476c;

    public C3025b4(JSONObject jSONObject) {
        C12775o.m28639i(jSONObject, "userObject");
        this.f1475b = jSONObject;
        this.f1476c = new JSONArray().put(jSONObject);
    }

    /* renamed from: e */
    public boolean mo28586e() {
        if (this.f1475b.length() == 0) {
            return true;
        }
        if (this.f1475b.length() != 1 || !this.f1475b.has("user_id")) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public JSONArray forJsonPut() {
        JSONArray jSONArray = this.f1476c;
        C12775o.m28638h(jSONArray, "jsonArrayForJsonPut");
        return jSONArray;
    }

    /* renamed from: w */
    public final JSONObject mo28662w() {
        return this.f1475b;
    }
}
