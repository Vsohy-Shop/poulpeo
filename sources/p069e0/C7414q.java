package p069e0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p042bo.app.C3023b2;

/* renamed from: e0.q */
public abstract class C7414q extends C7392k implements C7363f {

    /* renamed from: E */
    public static final C7415a f10245E = new C7415a((DefaultConstructorMarker) null);

    /* renamed from: D */
    private String f10246D;

    /* renamed from: e0.q$a */
    public static final class C7415a {
        public /* synthetic */ C7415a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7415a() {
        }
    }

    public C7414q() {
    }

    /* renamed from: A */
    public JSONObject mo40985A() {
        JSONObject c0 = mo40988c0();
        if (c0 == null) {
            c0 = super.forJsonPut();
            try {
                c0.putOpt("zipped_assets_url", mo40984O());
            } catch (JSONException unused) {
            }
        }
        return c0;
    }

    /* renamed from: O */
    public String mo40984O() {
        return this.f10246D;
    }

    /* renamed from: W */
    public List<String> mo40955W() {
        ArrayList arrayList = new ArrayList();
        String O = mo40984O();
        if (O != null && (!C13754v.m31532t(O))) {
            arrayList.add(O);
        }
        return arrayList;
    }

    /* renamed from: u0 */
    public void mo41055u0(String str) {
        this.f10246D = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7414q(JSONObject jSONObject, C3023b2 b2Var) {
        super(jSONObject, b2Var);
        C12775o.m28639i(jSONObject, "jsonObject");
        C12775o.m28639i(b2Var, "brazeManager");
        String optString = jSONObject.optString("zipped_assets_url");
        C12775o.m28638h(optString, "it");
        if (!C13754v.m31532t(optString)) {
            mo41055u0(optString);
        }
    }
}
