package p042bo.app;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.n1 */
public final class C3459n1 extends C3591r {

    /* renamed from: t */
    public static final C3460a f2231t = new C3460a((DefaultConstructorMarker) null);

    /* renamed from: r */
    private final C3785x1 f2232r;

    /* renamed from: s */
    private final boolean f2233s;

    /* renamed from: bo.app.n1$a */
    public static final class C3460a {
        public /* synthetic */ C3460a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3460a() {
        }
    }

    /* renamed from: bo.app.n1$b */
    static final class C3461b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3461b f2234b = new C3461b();

        C3461b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "GeofenceReportRequest executed successfully.";
        }
    }

    /* renamed from: bo.app.n1$c */
    static final class C3462c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3462c f2235b = new C3462c();

        C3462c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while creating geofence report request. Returning null.";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3459n1(String str, C3785x1 x1Var) {
        super(new C3753v4(C12775o.m28647q(str, "geofence/report")));
        C12775o.m28639i(str, "urlBase");
        C12775o.m28639i(x1Var, "geofenceEvent");
        this.f2232r = x1Var;
    }

    /* renamed from: a */
    public void mo28604a(C3285j2 j2Var, C3285j2 j2Var2, C3084d dVar) {
        C12775o.m28639i(j2Var, "internalPublisher");
        C12775o.m28639i(j2Var2, "externalPublisher");
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3461b.f2234b, 7, (Object) null);
    }

    /* renamed from: b */
    public boolean mo28606b() {
        return this.f2233s;
    }

    /* renamed from: l */
    public JSONObject mo28608l() {
        JSONObject l = super.mo28608l();
        if (l == null) {
            return null;
        }
        try {
            l.put("geofence_event", this.f2232r.forJsonPut());
            return l;
        } catch (JSONException e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, C3462c.f2235b, 4, (Object) null);
            return null;
        }
    }
}
