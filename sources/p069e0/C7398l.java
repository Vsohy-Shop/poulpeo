package p069e0;

import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import kotlin.jvm.internal.C12775o;
import org.json.JSONException;
import org.json.JSONObject;
import p018a0.C2108f;
import p042bo.app.C3023b2;

/* renamed from: e0.l */
public final class C7398l extends C7414q {
    public C7398l() {
    }

    /* renamed from: A */
    public JSONObject forJsonPut() {
        JSONObject c0 = mo40988c0();
        if (c0 == null) {
            c0 = super.mo40985A();
            try {
                c0.put(JSONAPIResourceIdSerializer.FIELD_TYPE, mo40944I().name());
            } catch (JSONException unused) {
            }
        }
        return c0;
    }

    /* renamed from: I */
    public C2108f mo40944I() {
        return C2108f.HTML_FULL;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7398l(JSONObject jSONObject, C3023b2 b2Var) {
        super(jSONObject, b2Var);
        C12775o.m28639i(jSONObject, "jsonObject");
        C12775o.m28639i(b2Var, "brazeManager");
    }
}
