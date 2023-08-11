package p042bo.app;

import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import org.json.JSONException;
import org.json.JSONObject;
import p126j0.C8300j;

/* renamed from: bo.app.i4 */
public final class C3235i4 implements C3747v2 {

    /* renamed from: b */
    private String f1838b;

    public C3235i4(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null && !optJSONObject.isNull("campaign_id")) {
            this.f1838b = optJSONObject.optString("campaign_id", (String) null);
        }
    }

    /* renamed from: a */
    public boolean mo28678a(C3766w2 w2Var) {
        if (!(w2Var instanceof C3288j4)) {
            return false;
        }
        if (C8300j.m16493g(this.f1838b)) {
            return true;
        }
        C3288j4 j4Var = (C3288j4) w2Var;
        if (C8300j.m16493g(j4Var.mo29159f()) || !j4Var.mo29159f().equals(this.f1838b)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSONAPIResourceIdSerializer.FIELD_TYPE, "push_click");
            if (this.f1838b != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("campaign_id", this.f1838b);
                jSONObject.putOpt("data", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
