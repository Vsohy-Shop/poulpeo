package p042bo.app;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p126j0.C8266c;

/* renamed from: bo.app.d6 */
public abstract class C3100d6 implements C3747v2 {

    /* renamed from: c */
    private static final String f1637c = C8266c.m16405n(C3100d6.class);

    /* renamed from: b */
    C3035c f1638b;

    public C3100d6(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("property_filters");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(new C3044c4(jSONArray2.getJSONObject(i2)));
            }
            arrayList.add(new C3813y3(arrayList2));
        }
        this.f1638b = new C3035c(arrayList);
    }

    /* renamed from: a */
    public boolean mo28678a(C3766w2 w2Var) {
        return this.f1638b.mo28678a(w2Var);
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("property_filters", this.f1638b.forJsonPut());
            jSONObject.put("data", jSONObject2);
        } catch (JSONException e) {
            C8266c.m16404m(f1637c, "Caught exception creating Json.", e);
        }
        return jSONObject;
    }
}
