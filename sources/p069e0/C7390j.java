package p069e0;

import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p018a0.C2108f;
import p042bo.app.C3023b2;
import p126j0.C8278g;

/* renamed from: e0.j */
public class C7390j extends C7392k {

    /* renamed from: G */
    public static final C7391a f10206G = new C7391a((DefaultConstructorMarker) null);

    /* renamed from: D */
    private JSONObject f10207D;

    /* renamed from: E */
    private Map<String, String> f10208E;

    /* renamed from: F */
    private List<String> f10209F;

    /* renamed from: e0.j$a */
    public static final class C7391a {
        public /* synthetic */ C7391a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7391a() {
        }
    }

    public C7390j() {
        this.f10208E = C12716r0.m28416g();
        this.f10209F = C12726w.m28524k();
        this.f10207D = new JSONObject();
        this.f10209F = C12726w.m28524k();
    }

    /* renamed from: A */
    public JSONObject forJsonPut() {
        JSONObject c0 = mo40988c0();
        if (c0 == null) {
            c0 = super.forJsonPut();
            try {
                c0.put(JSONAPIResourceIdSerializer.FIELD_TYPE, mo40944I().name());
            } catch (JSONException unused) {
            }
        }
        return c0;
    }

    /* renamed from: I */
    public C2108f mo40944I() {
        return C2108f.HTML;
    }

    /* renamed from: L */
    public void mo40947L(Map<String, String> map) {
        C12775o.m28639i(map, "remotePathToLocalAssetMap");
        this.f10208E = map;
    }

    /* renamed from: W */
    public List<String> mo40955W() {
        return this.f10209F;
    }

    /* renamed from: u0 */
    public Map<String, String> mo41026u0() {
        return this.f10208E;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C7390j(JSONObject jSONObject, C3023b2 b2Var) {
        this(jSONObject, b2Var, jSONObject.optJSONObject("message_fields"), C8278g.m16451e(jSONObject.optJSONArray("asset_urls")));
        C12775o.m28639i(jSONObject, "jsonObject");
        C12775o.m28639i(b2Var, "brazeManager");
    }

    private C7390j(JSONObject jSONObject, C3023b2 b2Var, JSONObject jSONObject2, List<String> list) {
        super(jSONObject, b2Var);
        this.f10208E = C12716r0.m28416g();
        List unused = C12726w.m28524k();
        this.f10207D = jSONObject2;
        this.f10209F = list;
    }
}
