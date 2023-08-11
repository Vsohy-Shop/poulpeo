package p042bo.app;

import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p126j0.C8300j;

/* renamed from: bo.app.d3 */
public final class C3097d3 implements C3747v2 {

    /* renamed from: b */
    private String f1628b;

    /* renamed from: c */
    private Set<String> f1629c = new HashSet();

    public C3097d3(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.f1628b = jSONObject2.getString("id");
        JSONArray optJSONArray = jSONObject2.optJSONArray("buttons");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.f1629c.add(optJSONArray.getString(i));
            }
        }
    }

    /* renamed from: a */
    public boolean mo28678a(C3766w2 w2Var) {
        if (w2Var instanceof C3117e3) {
            C3117e3 e3Var = (C3117e3) w2Var;
            if (!C8300j.m16493g(e3Var.mo28856g()) && e3Var.mo28856g().equals(this.f1628b)) {
                if (this.f1629c.size() <= 0) {
                    return C8300j.m16493g(e3Var.mo28855f());
                }
                if (C8300j.m16493g(e3Var.mo28855f()) || !this.f1629c.contains(e3Var.mo28855f())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSONAPIResourceIdSerializer.FIELD_TYPE, "iam_click");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", this.f1628b);
            if (this.f1629c.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (String put : this.f1629c) {
                    jSONArray.put(put);
                }
                jSONObject2.put("buttons", jSONArray);
            }
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
