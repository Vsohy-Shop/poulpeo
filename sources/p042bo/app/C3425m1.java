package p042bo.app;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.m1 */
public final class C3425m1 extends C3591r {

    /* renamed from: t */
    public static final C3426a f2159t = new C3426a((DefaultConstructorMarker) null);

    /* renamed from: r */
    private final C3785x1 f2160r;

    /* renamed from: s */
    private final boolean f2161s;

    /* renamed from: bo.app.m1$a */
    public static final class C3426a {
        public /* synthetic */ C3426a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3426a() {
        }
    }

    /* renamed from: bo.app.m1$b */
    static final class C3427b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3427b f2162b = new C3427b();

        C3427b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "GeofenceRefreshRequest executed successfully.";
        }
    }

    /* renamed from: bo.app.m1$c */
    static final class C3428c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3428c f2163b = new C3428c();

        C3428c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while creating geofence refresh request. Returning null.";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3425m1(String str, C2993a2 a2Var) {
        super(new C3753v4(C12775o.m28647q(str, "geofence/request")));
        C12775o.m28639i(str, "urlBase");
        C12775o.m28639i(a2Var, "location");
        this.f2160r = C3240j.f1842h.mo29061a(a2Var);
    }

    /* renamed from: a */
    public void mo28604a(C3285j2 j2Var, C3285j2 j2Var2, C3084d dVar) {
        C12775o.m28639i(j2Var, "internalPublisher");
        C12775o.m28639i(j2Var2, "externalPublisher");
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3427b.f2162b, 7, (Object) null);
    }

    /* renamed from: b */
    public boolean mo28606b() {
        return this.f2161s;
    }

    /* renamed from: l */
    public JSONObject mo28608l() {
        JSONObject l = super.mo28608l();
        if (l == null) {
            return null;
        }
        try {
            C3785x1 x1Var = this.f2160r;
            if (x1Var != null) {
                l.put("location_event", x1Var.forJsonPut());
            }
            return l;
        } catch (JSONException e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, C3428c.f2163b, 4, (Object) null);
            return null;
        }
    }
}
