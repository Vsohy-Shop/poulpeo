package p042bo.app;

import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import org.json.JSONException;
import org.json.JSONObject;
import p126j0.C8266c;
import p126j0.C8300j;

/* renamed from: bo.app.g4 */
public final class C3164g4 extends C3100d6 {

    /* renamed from: e */
    private static final String f1726e = C8266c.m16405n(C3164g4.class);

    /* renamed from: d */
    private String f1727d;

    public C3164g4(JSONObject jSONObject) {
        super(jSONObject);
        this.f1727d = jSONObject.getJSONObject("data").getString("product_id");
    }

    /* renamed from: a */
    public boolean mo28678a(C3766w2 w2Var) {
        if (!(w2Var instanceof C3150f4) || C8300j.m16493g(this.f1727d)) {
            return false;
        }
        C3150f4 f4Var = (C3150f4) w2Var;
        if (!C8300j.m16493g(f4Var.mo28916f()) && f4Var.mo28916f().equals(this.f1727d)) {
            return super.mo28678a(w2Var);
        }
        return false;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject e = super.forJsonPut();
        try {
            e.put(JSONAPIResourceIdSerializer.FIELD_TYPE, "purchase_property");
            JSONObject jSONObject = e.getJSONObject("data");
            jSONObject.put("product_id", this.f1727d);
            e.put("data", jSONObject);
        } catch (JSONException e2) {
            C8266c.m16404m(f1726e, "Caught exception creating Json.", e2);
        }
        return e;
    }
}
