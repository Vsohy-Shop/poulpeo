package p069e0;

import android.graphics.Color;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p018a0.C2103b;
import p018a0.C2108f;
import p018a0.C2110h;
import p018a0.C2111i;
import p042bo.app.C3023b2;
import p042bo.app.C3204h3;
import p126j0.C8266c;
import p126j0.C8278g;
import p404of.C13074a;

/* renamed from: e0.o */
public final class C7408o extends C7412p {

    /* renamed from: H */
    public static final C7409a f10235H = new C7409a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private C2110h f10236F;

    /* renamed from: G */
    private int f10237G;

    /* renamed from: e0.o$a */
    public static final class C7409a {
        public /* synthetic */ C7409a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7409a() {
        }
    }

    /* renamed from: e0.o$b */
    static final class C7410b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7410b f10238g = new C7410b();

        C7410b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot apply dark theme with a null themes wrapper";
        }
    }

    /* renamed from: e0.o$c */
    static final class C7411c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7411c f10239g = new C7411c();

        C7411c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Error creating JSON.";
        }
    }

    public C7408o() {
        this.f10236F = C2110h.BOTTOM;
        this.f10237G = Color.parseColor("#9B9B9B");
        mo41000q0(C2111i.START);
    }

    /* renamed from: A */
    public JSONObject forJsonPut() {
        JSONObject c0 = mo40988c0();
        if (c0 == null) {
            c0 = super.mo40985A();
            try {
                c0.put("slide_from", this.f10236F.toString());
                c0.put("close_btn_color", this.f10237G);
                c0.put(JSONAPIResourceIdSerializer.FIELD_TYPE, mo40944I().name());
            } catch (JSONException e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C7411c.f10239g, 4, (Object) null);
            }
        }
        return c0;
    }

    /* renamed from: I */
    public C2108f mo40944I() {
        return C2108f.SLIDEUP;
    }

    /* renamed from: e */
    public void mo40977e() {
        super.mo40977e();
        C3204h3 Z = mo40987Z();
        if (Z == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.D, (Throwable) null, false, C7410b.f10238g, 6, (Object) null);
            return;
        }
        Integer b = Z.mo28992b();
        if ((b == null || b.intValue() != -1) && Z.mo28992b() != null) {
            this.f10237G = Z.mo28992b().intValue();
        }
    }

    /* renamed from: w0 */
    public final int mo41049w0() {
        return this.f10237G;
    }

    /* renamed from: x0 */
    public final C2110h mo41050x0() {
        return this.f10236F;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C7408o(JSONObject jSONObject, C3023b2 b2Var) {
        this(jSONObject, b2Var, (C2110h) C8278g.m16459m(jSONObject, "slide_from", C2110h.class, C2110h.BOTTOM), jSONObject.optInt("close_btn_color"));
        C12775o.m28639i(jSONObject, "jsonObject");
        C12775o.m28639i(b2Var, "brazeManager");
    }

    private C7408o(JSONObject jSONObject, C3023b2 b2Var, C2110h hVar, int i) {
        super(jSONObject, b2Var);
        this.f10236F = C2110h.BOTTOM;
        this.f10237G = Color.parseColor("#9B9B9B");
        if (hVar != null) {
            this.f10236F = hVar;
        }
        this.f10237G = i;
        mo40992i0((C2103b) C8278g.m16459m(jSONObject, "crop_type", C2103b.class, C2103b.FIT_CENTER));
        mo41000q0((C2111i) C8278g.m16459m(jSONObject, "text_align_message", C2111i.class, C2111i.START));
    }
}
