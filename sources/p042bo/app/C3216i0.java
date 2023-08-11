package p042bo.app;

import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p042bo.app.C2995a4;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.i0 */
public final class C3216i0 extends C3591r {

    /* renamed from: t */
    public static final C3217a f1818t = new C3217a((DefaultConstructorMarker) null);

    /* renamed from: r */
    private C2995a4 f1819r;

    /* renamed from: s */
    private final boolean f1820s;

    /* renamed from: bo.app.i0$a */
    public static final class C3217a {
        public /* synthetic */ C3217a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3217a() {
        }
    }

    /* renamed from: bo.app.i0$b */
    static final class C3218b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3218b f1821b = new C3218b();

        C3218b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "DataSyncRequest executed successfully.";
        }
    }

    /* renamed from: bo.app.i0$c */
    static final class C3219c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3219c f1822b = new C3219c();

        C3219c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while retrieving parameters. Returning null.";
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3216i0(String str, C2995a4 a4Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new C2995a4.C2996a((String) null, (Boolean) null, (Boolean) null, (C3832z3) null, 15, (DefaultConstructorMarker) null).mo28593a() : a4Var);
    }

    /* renamed from: a */
    public void mo28604a(C3285j2 j2Var, C3285j2 j2Var2, C3084d dVar) {
        C12775o.m28639i(j2Var, "internalPublisher");
        C12775o.m28639i(j2Var2, "externalPublisher");
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3218b.f1821b, 7, (Object) null);
    }

    /* renamed from: b */
    public boolean mo28606b() {
        boolean z;
        C2995a4 c = mo28691c();
        if (c != null && c.mo28586e()) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !super.mo28606b()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public C2995a4 mo28691c() {
        return this.f1819r;
    }

    /* renamed from: g */
    public boolean mo28607g() {
        return this.f1820s;
    }

    /* renamed from: l */
    public JSONObject mo28608l() {
        JSONObject jSONObject;
        JSONObject l = super.mo28608l();
        if (l == null) {
            return null;
        }
        try {
            C2995a4 c = mo28691c();
            if (c == null) {
                jSONObject = null;
            } else {
                jSONObject = c.forJsonPut();
            }
            l.put("respond_with", jSONObject);
            return l;
        } catch (JSONException e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, C3219c.f1822b, 4, (Object) null);
            return null;
        }
    }

    /* renamed from: a */
    public void mo28617a(Map<String, String> map) {
        boolean z;
        C12775o.m28639i(map, "existingHeaders");
        super.mo28617a(map);
        C2995a4 c = mo28691c();
        boolean z2 = false;
        boolean z3 = true;
        if (!(c != null && c.mo28586e())) {
            C2995a4 c2 = mo28691c();
            if (c2 != null && c2.mo28589x()) {
                map.put("X-Braze-FeedRequest", "true");
                z = true;
            } else {
                z = false;
            }
            C2995a4 c3 = mo28691c();
            if (c3 != null && c3.mo28590y()) {
                z2 = true;
            }
            if (z2) {
                map.put("X-Braze-TriggersRequest", "true");
            } else {
                z3 = z;
            }
            if (z3) {
                map.put("X-Braze-DataRequest", "true");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3216i0(String str, C2995a4 a4Var) {
        super(new C3753v4(C12775o.m28647q(str, "data")));
        C12775o.m28639i(str, "urlBase");
        this.f1819r = a4Var;
        this.f1820s = true;
    }
}
