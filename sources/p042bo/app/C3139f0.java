package p042bo.app;

import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import org.json.JSONException;
import org.json.JSONObject;
import p126j0.C8266c;
import p126j0.C8300j;

/* renamed from: bo.app.f0 */
public final class C3139f0 extends C3100d6 {

    /* renamed from: e */
    private static final String f1700e = C8266c.m16405n(C3139f0.class);

    /* renamed from: d */
    private String f1701d;

    public C3139f0(JSONObject jSONObject) {
        super(jSONObject);
        this.f1701d = jSONObject.getJSONObject("data").getString("event_name");
    }

    /* renamed from: a */
    public boolean mo28678a(C3766w2 w2Var) {
        if (!(w2Var instanceof C3106e0)) {
            return false;
        }
        C3106e0 e0Var = (C3106e0) w2Var;
        if (C8300j.m16493g(e0Var.mo28843f()) || !e0Var.mo28843f().equals(this.f1701d)) {
            return false;
        }
        return super.mo28678a(w2Var);
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject e = super.forJsonPut();
        try {
            e.put(JSONAPIResourceIdSerializer.FIELD_TYPE, "custom_event_property");
            JSONObject jSONObject = e.getJSONObject("data");
            jSONObject.put("event_name", this.f1701d);
            e.put("data", jSONObject);
        } catch (JSONException e2) {
            C8266c.m16404m(f1700e, "Caught exception creating CustomEventWithPropertiesTriggerCondition Json.", e2);
        }
        return e;
    }
}
