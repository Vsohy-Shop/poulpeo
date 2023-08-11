package p042bo.app;

import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import org.json.JSONException;
import org.json.JSONObject;
import p126j0.C8300j;

/* renamed from: bo.app.d0 */
public final class C3090d0 implements C3747v2 {

    /* renamed from: b */
    private String f1618b;

    public C3090d0(JSONObject jSONObject) {
        this.f1618b = jSONObject.getJSONObject("data").getString("event_name");
    }

    /* renamed from: a */
    public boolean mo28678a(C3766w2 w2Var) {
        if (!(w2Var instanceof C3106e0)) {
            return false;
        }
        C3106e0 e0Var = (C3106e0) w2Var;
        if (C8300j.m16493g(e0Var.mo28843f()) || !e0Var.mo28843f().equals(this.f1618b)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSONAPIResourceIdSerializer.FIELD_TYPE, "custom_event");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_name", this.f1618b);
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
