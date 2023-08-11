package p042bo.app;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p057d0.C7213c;

/* renamed from: bo.app.a4 */
public final class C2995a4 implements C7213c<JSONObject>, C3223i2 {

    /* renamed from: f */
    public static final C2997b f1432f = new C2997b((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final String f1433b;

    /* renamed from: c */
    private final Boolean f1434c;

    /* renamed from: d */
    private final Boolean f1435d;

    /* renamed from: e */
    private final C3832z3 f1436e;

    /* renamed from: bo.app.a4$a */
    public static final class C2996a {

        /* renamed from: a */
        private String f1437a;

        /* renamed from: b */
        private Boolean f1438b;

        /* renamed from: c */
        private Boolean f1439c;

        /* renamed from: d */
        private C3832z3 f1440d;

        public C2996a(String str, Boolean bool, Boolean bool2, C3832z3 z3Var) {
            this.f1437a = str;
            this.f1438b = bool;
            this.f1439c = bool2;
            this.f1440d = z3Var;
        }

        /* renamed from: a */
        public final void mo28595a(String str) {
            this.f1437a = str;
        }

        /* renamed from: b */
        public final void mo28599b(Boolean bool) {
            this.f1439c = bool;
        }

        /* renamed from: c */
        public final C2996a mo28600c() {
            mo28599b(Boolean.TRUE);
            return this;
        }

        /* renamed from: a */
        public final void mo28594a(Boolean bool) {
            this.f1438b = bool;
        }

        /* renamed from: b */
        public final void mo28598b(C3832z3 z3Var) {
            this.f1440d = z3Var;
        }

        /* renamed from: a */
        public final C2996a mo28592a(C3832z3 z3Var) {
            C12775o.m28639i(z3Var, "outboundConfigParams");
            mo28598b(z3Var);
            return this;
        }

        /* renamed from: b */
        public final C2996a mo28597b(String str) {
            mo28595a(str);
            return this;
        }

        /* renamed from: a */
        public final C2995a4 mo28593a() {
            return new C2995a4(this.f1437a, this.f1438b, this.f1439c, this.f1440d, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public final C2996a mo28596b() {
            mo28594a(Boolean.TRUE);
            return this;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C2996a(String str, Boolean bool, Boolean bool2, C3832z3 z3Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : z3Var);
        }
    }

    /* renamed from: bo.app.a4$b */
    public static final class C2997b {
        public /* synthetic */ C2997b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2997b() {
        }
    }

    public /* synthetic */ C2995a4(String str, Boolean bool, Boolean bool2, C3832z3 z3Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bool, bool2, z3Var);
    }

    /* renamed from: e */
    public boolean mo28586e() {
        C3832z3 z3Var;
        JSONObject v = forJsonPut();
        if (v.length() == 0) {
            return true;
        }
        if (this.f1434c == null && this.f1435d == null && (z3Var = this.f1436e) != null) {
            return z3Var.mo28586e();
        }
        if (v.length() == 1) {
            return v.has("user_id");
        }
        return false;
    }

    /* renamed from: v */
    public JSONObject forJsonPut() {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        String str = this.f1433b;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            jSONObject.put("user_id", this.f1433b);
        }
        Boolean bool = this.f1434c;
        if (bool != null) {
            jSONObject.put("feed", bool.booleanValue());
        }
        Boolean bool2 = this.f1435d;
        if (bool2 != null) {
            jSONObject.put("triggers", bool2.booleanValue());
        }
        C3832z3 z3Var = this.f1436e;
        if (z3Var != null) {
            jSONObject.put("config", z3Var.forJsonPut());
        }
        return jSONObject;
    }

    /* renamed from: w */
    public final boolean mo28588w() {
        if (this.f1436e != null) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final boolean mo28589x() {
        if (this.f1434c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public final boolean mo28590y() {
        if (this.f1435d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public final boolean mo28591z() {
        boolean z;
        String str = this.f1433b;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    private C2995a4(String str, Boolean bool, Boolean bool2, C3832z3 z3Var) {
        this.f1433b = str;
        this.f1434c = bool;
        this.f1435d = bool2;
        this.f1436e = z3Var;
    }
}
