package p042bo.app;

import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.a6 */
public final class C3000a6 extends C3591r {

    /* renamed from: v */
    public static final C3001a f1443v = new C3001a((DefaultConstructorMarker) null);

    /* renamed from: r */
    private final List<String> f1444r;

    /* renamed from: s */
    private final long f1445s;

    /* renamed from: t */
    private String f1446t;

    /* renamed from: u */
    private final boolean f1447u = true;

    /* renamed from: bo.app.a6$a */
    public static final class C3001a {
        public /* synthetic */ C3001a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3001a() {
        }
    }

    /* renamed from: bo.app.a6$b */
    static final class C3002b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3002b f1448b = new C3002b();

        C3002b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "TestUserDeviceLog executed successfully.";
        }
    }

    /* renamed from: bo.app.a6$c */
    static final class C3003c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3003c f1449b = new C3003c();

        C3003c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while retrieving parameters. Returning null.";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3000a6(String str, List<String> list, long j, String str2) {
        super(new C3753v4(C12775o.m28647q(str, "data")));
        C12775o.m28639i(str, "urlBase");
        C12775o.m28639i(list, "deviceLogs");
        this.f1444r = list;
        this.f1445s = j;
        this.f1446t = str2;
    }

    /* renamed from: a */
    public String mo28603a() {
        return this.f1446t;
    }

    /* renamed from: b */
    public boolean mo28606b() {
        if (!this.f1444r.isEmpty() || !super.mo28606b()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo28607g() {
        return this.f1447u;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026 A[Catch:{ JSONException -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037 A[Catch:{ JSONException -> 0x0051 }] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo28608l() {
        /*
            r10 = this;
            org.json.JSONObject r0 = super.mo28608l()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0051 }
            r2.<init>()     // Catch:{ JSONException -> 0x0051 }
            java.lang.String r3 = "time"
            long r4 = r10.f1445s     // Catch:{ JSONException -> 0x0051 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0051 }
            java.lang.String r3 = r10.mo28603a()     // Catch:{ JSONException -> 0x0051 }
            if (r3 == 0) goto L_0x0023
            boolean r3 = p454wf.C13754v.m31532t(r3)     // Catch:{ JSONException -> 0x0051 }
            if (r3 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r3 = 0
            goto L_0x0024
        L_0x0023:
            r3 = 1
        L_0x0024:
            if (r3 != 0) goto L_0x002f
            java.lang.String r3 = "user_id"
            java.lang.String r4 = r10.mo28603a()     // Catch:{ JSONException -> 0x0051 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0051 }
        L_0x002f:
            java.util.List<java.lang.String> r3 = r10.f1444r     // Catch:{ JSONException -> 0x0051 }
            boolean r3 = r3.isEmpty()     // Catch:{ JSONException -> 0x0051 }
            if (r3 != 0) goto L_0x0043
            java.lang.String r3 = "device_logs"
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0051 }
            java.util.List<java.lang.String> r5 = r10.f1444r     // Catch:{ JSONException -> 0x0051 }
            r4.<init>(r5)     // Catch:{ JSONException -> 0x0051 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0051 }
        L_0x0043:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0051 }
            r3.<init>()     // Catch:{ JSONException -> 0x0051 }
            r3.put(r2)     // Catch:{ JSONException -> 0x0051 }
            java.lang.String r2 = "test_user_data"
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x0051 }
            return r0
        L_0x0051:
            r0 = move-exception
            r5 = r0
            j0.c r2 = p126j0.C8266c.f11641a
            j0.c$a r4 = p126j0.C8266c.C8267a.f11649e
            bo.app.a6$c r7 = p042bo.app.C3000a6.C3003c.f1449b
            r6 = 0
            r8 = 4
            r9 = 0
            r3 = r10
            p126j0.C8266c.m16396e(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3000a6.mo28608l():org.json.JSONObject");
    }

    /* renamed from: a */
    public void mo28605a(String str) {
        this.f1446t = str;
    }

    /* renamed from: a */
    public void mo28604a(C3285j2 j2Var, C3285j2 j2Var2, C3084d dVar) {
        C12775o.m28639i(j2Var, "internalPublisher");
        C12775o.m28639i(j2Var2, "externalPublisher");
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3002b.f1448b, 7, (Object) null);
    }
}
