package p042bo.app;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.m4 */
public final class C3436m4 implements C3463n2 {

    /* renamed from: c */
    public static final C3437a f2178c = new C3437a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final int f2179b;

    /* renamed from: bo.app.m4$a */
    public static final class C3437a {
        public /* synthetic */ C3437a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3437a() {
        }
    }

    /* renamed from: bo.app.m4$b */
    static final class C3438b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3438b f2180b = new C3438b();

        C3438b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Could not convert ReEligibilityConfig to JSON";
        }
    }

    public C3436m4(int i) {
        this.f2179b = i;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            return new JSONObject().put("re_eligibility", this.f2179b);
        } catch (JSONException e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3438b.f2180b, 4, (Object) null);
            return null;
        }
    }

    /* renamed from: o */
    public boolean mo29351o() {
        if (this.f2179b == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public Integer mo29352q() {
        int i = this.f2179b;
        if (i > 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    /* renamed from: s */
    public boolean mo29353s() {
        if (this.f2179b == -1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3436m4(JSONObject jSONObject) {
        this(jSONObject.optInt("re_eligibility", -1));
        C12775o.m28639i(jSONObject, "json");
    }
}
