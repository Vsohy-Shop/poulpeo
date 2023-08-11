package p042bo.app;

import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.w3 */
public final class C3767w3 implements C3747v2 {
    /* renamed from: a */
    public boolean mo28678a(C3766w2 w2Var) {
        return w2Var instanceof C3788x3;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSONAPIResourceIdSerializer.FIELD_TYPE, "open");
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
