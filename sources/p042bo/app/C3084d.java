package p042bo.app;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;
import p057d0.C7208a;
import p069e0.C7358a;
import p126j0.C8278g;
import p404of.C13074a;

/* renamed from: bo.app.d */
public final class C3084d {

    /* renamed from: k */
    public static final C3089e f1603k = new C3089e((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final JSONObject f1604a;

    /* renamed from: b */
    private final Map<String, String> f1605b;

    /* renamed from: c */
    private final C3820z f1606c;

    /* renamed from: d */
    private final C7358a f1607d;

    /* renamed from: e */
    private final List<C3024b3> f1608e;

    /* renamed from: f */
    private final C3046c5 f1609f;

    /* renamed from: g */
    private final List<C7208a> f1610g;

    /* renamed from: h */
    private final JSONArray f1611h;

    /* renamed from: i */
    private final JSONArray f1612i;

    /* renamed from: j */
    private final C3584q2 f1613j;

    /* renamed from: bo.app.d$a */
    static final class C3085a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3084d f1614b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3085a(C3084d dVar) {
            super(0);
            this.f1614b = dVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Encountered Exception processing Content Cards response: ", this.f1614b.mo28801g());
        }
    }

    /* renamed from: bo.app.d$b */
    static final class C3086b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3084d f1615b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3086b(C3084d dVar) {
            super(0);
            this.f1615b = dVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Found " + this.f1615b.mo28804j().size() + " triggered actions in server response.";
        }
    }

    /* renamed from: bo.app.d$c */
    static final class C3087c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f1616b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3087c(JSONObject jSONObject) {
            super(0);
            this.f1616b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Got server config: ", C8278g.m16456j(this.f1616b));
        }
    }

    /* renamed from: bo.app.d$d */
    static final class C3088d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f1617b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3088d(JSONObject jSONObject) {
            super(0);
            this.f1617b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Encountered Exception processing server config: ", this.f1617b);
        }
    }

    /* renamed from: bo.app.d$e */
    public static final class C3089e {
        public /* synthetic */ C3089e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C3584q2 mo28809a(JSONObject jSONObject, C3042c2 c2Var) {
            C12775o.m28639i(jSONObject, "jsonObject");
            C12775o.m28639i(c2Var, "request");
            String i = C8278g.m16455i(jSONObject, MediaRouteProviderProtocol.SERVICE_DATA_ERROR);
            JSONObject optJSONObject = jSONObject.optJSONObject("auth_error");
            if (optJSONObject != null) {
                return new C3789x4(c2Var, optJSONObject.optInt("error_code", -1), C8278g.m16455i(optJSONObject, "reason"), i);
            } else if (C12775o.m28634d(i, "invalid_api_key")) {
                return new C3316k3(i, c2Var);
            } else {
                if (i != null) {
                    return new C3156g(i, c2Var);
                }
                return null;
            }
        }

        private C3089e() {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0081 A[SYNTHETIC, Splitter:B:14:0x0081] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3084d(p336ef.C11906l<? extends org.json.JSONObject, ? extends java.util.Map<java.lang.String, java.lang.String>> r11, p042bo.app.C3042c2 r12, p042bo.app.C3023b2 r13) {
        /*
            r10 = this;
            java.lang.String r0 = "responseData"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            java.lang.String r0 = "request"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            java.lang.String r0 = "brazeManager"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            r10.<init>()
            java.lang.Object r0 = r11.mo49111c()
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            r10.f1604a = r0
            java.lang.Object r11 = r11.mo49112d()
            java.util.Map r11 = (java.util.Map) r11
            r10.f1605b = r11
            java.lang.String r11 = "feed"
            org.json.JSONArray r11 = r0.optJSONArray(r11)
            r10.f1612i = r11
            bo.app.d$e r11 = f1603k
            bo.app.q2 r11 = r11.mo28809a(r0, r12)
            r10.f1613j = r11
            r1 = 0
            if (r11 != 0) goto L_0x0051
            boolean r11 = r12 instanceof p042bo.app.C3012b0
            if (r11 == 0) goto L_0x0051
            bo.app.z r11 = new bo.app.z     // Catch:{ Exception -> 0x003f }
            r11.<init>((org.json.JSONObject) r0)     // Catch:{ Exception -> 0x003f }
            goto L_0x0052
        L_0x003f:
            r11 = move-exception
            r5 = r11
            j0.c r2 = p126j0.C8266c.f11641a
            j0.c$a r4 = p126j0.C8266c.C8267a.f11651g
            bo.app.d$a r7 = new bo.app.d$a
            r7.<init>(r10)
            r6 = 0
            r8 = 4
            r9 = 0
            r3 = r10
            p126j0.C8266c.m16396e(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0051:
            r11 = r1
        L_0x0052:
            r10.f1606c = r11
            org.json.JSONObject r11 = r10.f1604a
            java.lang.String r12 = "triggers"
            org.json.JSONArray r11 = r11.optJSONArray(r12)
            bo.app.m6 r12 = p042bo.app.C3440m6.f2184a
            java.util.List r11 = r12.mo29357a((org.json.JSONArray) r11, (p042bo.app.C3023b2) r13)
            r10.f1608e = r11
            if (r11 == 0) goto L_0x0077
            j0.c r2 = p126j0.C8266c.f11641a
            j0.c$a r4 = p126j0.C8266c.C8267a.f11650f
            bo.app.d$b r7 = new bo.app.d$b
            r7.<init>(r10)
            r5 = 0
            r6 = 0
            r8 = 6
            r9 = 0
            r3 = r10
            p126j0.C8266c.m16396e(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0077:
            org.json.JSONObject r11 = r10.f1604a
            java.lang.String r12 = "config"
            org.json.JSONObject r11 = r11.optJSONObject(r12)
            if (r11 == 0) goto L_0x00b0
            bo.app.c5 r12 = new bo.app.c5     // Catch:{ Exception -> 0x009b }
            r12.<init>(r11)     // Catch:{ Exception -> 0x009b }
            j0.c r2 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x0098 }
            j0.c$a r4 = p126j0.C8266c.C8267a.f11650f     // Catch:{ Exception -> 0x0098 }
            r5 = 0
            r6 = 0
            bo.app.d$c r7 = new bo.app.d$c     // Catch:{ Exception -> 0x0098 }
            r7.<init>(r11)     // Catch:{ Exception -> 0x0098 }
            r8 = 6
            r9 = 0
            r3 = r10
            p126j0.C8266c.m16396e(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0098 }
            goto L_0x00b1
        L_0x0098:
            r0 = move-exception
            r5 = r0
            goto L_0x009f
        L_0x009b:
            r12 = move-exception
            r0 = r12
            r5 = r0
            r12 = r1
        L_0x009f:
            j0.c r2 = p126j0.C8266c.f11641a
            j0.c$a r4 = p126j0.C8266c.C8267a.f11651g
            bo.app.d$d r7 = new bo.app.d$d
            r7.<init>(r11)
            r6 = 0
            r8 = 4
            r9 = 0
            r3 = r10
            p126j0.C8266c.m16396e(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00b1
        L_0x00b0:
            r12 = r1
        L_0x00b1:
            r10.f1609f = r12
            org.json.JSONObject r11 = r10.f1604a
            java.lang.String r12 = "templated_message"
            org.json.JSONObject r11 = r11.optJSONObject(r12)
            bo.app.m6 r12 = p042bo.app.C3440m6.f2184a
            e0.a r11 = r12.mo29355a((org.json.JSONObject) r11, (p042bo.app.C3023b2) r13)
            r10.f1607d = r11
            org.json.JSONObject r11 = r10.f1604a
            java.lang.String r12 = "geofences"
            org.json.JSONArray r11 = r11.optJSONArray(r12)
            if (r11 == 0) goto L_0x00d1
            java.util.List r1 = p042bo.app.C3389l1.m3354a(r11)
        L_0x00d1:
            r10.f1610g = r1
            org.json.JSONObject r11 = r10.f1604a
            java.lang.String r12 = "feature_flags"
            org.json.JSONArray r11 = r11.optJSONArray(r12)
            r10.f1611h = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3084d.<init>(ef.l, bo.app.c2, bo.app.b2):void");
    }

    /* renamed from: a */
    public final C3820z mo28795a() {
        return this.f1606c;
    }

    /* renamed from: b */
    public final C3584q2 mo28796b() {
        return this.f1613j;
    }

    /* renamed from: c */
    public final JSONArray mo28797c() {
        return this.f1611h;
    }

    /* renamed from: d */
    public final JSONArray mo28798d() {
        return this.f1612i;
    }

    /* renamed from: e */
    public final List<C7208a> mo28799e() {
        return this.f1610g;
    }

    /* renamed from: f */
    public final Map<String, String> mo28800f() {
        return this.f1605b;
    }

    /* renamed from: g */
    public final JSONObject mo28801g() {
        return this.f1604a;
    }

    /* renamed from: h */
    public final C3046c5 mo28802h() {
        return this.f1609f;
    }

    /* renamed from: i */
    public final C7358a mo28803i() {
        return this.f1607d;
    }

    /* renamed from: j */
    public final List<C3024b3> mo28804j() {
        return this.f1608e;
    }
}
