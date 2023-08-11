package p042bo.app;

import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import org.json.JSONException;
import org.json.JSONObject;
import p126j0.C8300j;

/* renamed from: bo.app.e4 */
public final class C3118e4 implements C3747v2 {

    /* renamed from: b */
    String f1665b;

    public C3118e4(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null && !optJSONObject.isNull("product_id")) {
            this.f1665b = optJSONObject.optString("product_id", (String) null);
        }
    }

    /* renamed from: a */
    public boolean mo28678a(C3766w2 w2Var) {
        if (!(w2Var instanceof C3150f4)) {
            return false;
        }
        if (C8300j.m16493g(this.f1665b)) {
            return true;
        }
        C3150f4 f4Var = (C3150f4) w2Var;
        if (C8300j.m16493g(f4Var.mo28916f()) || !f4Var.mo28916f().equals(this.f1665b)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSONAPIResourceIdSerializer.FIELD_TYPE, "purchase");
            if (this.f1665b != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("product_id", this.f1665b);
                jSONObject.putOpt("data", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
