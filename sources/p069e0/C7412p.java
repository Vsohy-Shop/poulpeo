package p069e0;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p042bo.app.C3023b2;

/* renamed from: e0.p */
public abstract class C7412p extends C7364g implements C7362e {

    /* renamed from: E */
    public static final C7413a f10240E = new C7413a((DefaultConstructorMarker) null);

    /* renamed from: A */
    private Bitmap f10241A;

    /* renamed from: B */
    private boolean f10242B;

    /* renamed from: C */
    private String f10243C;

    /* renamed from: D */
    private String f10244D;

    /* renamed from: e0.p$a */
    public static final class C7413a {
        public /* synthetic */ C7413a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7413a() {
        }
    }

    protected C7412p() {
    }

    /* renamed from: A */
    public JSONObject mo40985A() {
        JSONObject c0 = mo40988c0();
        if (c0 == null) {
            c0 = super.forJsonPut();
            try {
                c0.putOpt("image_url", mo40979v());
            } catch (JSONException unused) {
            }
        }
        return c0;
    }

    /* renamed from: L */
    public void mo40947L(Map<String, String> map) {
        C12775o.m28639i(map, "remotePathToLocalAssetMap");
        if (!map.isEmpty()) {
            Object[] array = map.values().toArray(new String[0]);
            if (array != null) {
                mo40981x(((String[]) array)[0]);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    /* renamed from: W */
    public List<String> mo40955W() {
        ArrayList arrayList = new ArrayList();
        String v = mo40979v();
        if (v != null && (!C13754v.m31532t(v))) {
            arrayList.add(v);
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo40978a(boolean z) {
        this.f10242B = z;
    }

    /* renamed from: u0 */
    public boolean mo41053u0() {
        return this.f10242B;
    }

    /* renamed from: v */
    public String mo40979v() {
        return this.f10244D;
    }

    /* renamed from: v0 */
    public void mo41054v0(String str) {
        this.f10244D = str;
    }

    /* renamed from: w */
    public Bitmap mo40980w() {
        return this.f10241A;
    }

    /* renamed from: x */
    public void mo40981x(String str) {
        this.f10243C = str;
    }

    /* renamed from: y */
    public void mo40982y(Bitmap bitmap) {
        this.f10241A = bitmap;
    }

    /* renamed from: z */
    public String mo40983z() {
        return this.f10243C;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7412p(JSONObject jSONObject, C3023b2 b2Var) {
        super(jSONObject, b2Var, false, false, 12, (DefaultConstructorMarker) null);
        C12775o.m28639i(jSONObject, "jsonObject");
        C12775o.m28639i(b2Var, "brazeManager");
        mo41054v0(jSONObject.optString("image_url"));
    }
}
