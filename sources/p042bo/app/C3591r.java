package p042bo.app;

import com.appboy.enums.SdkFlavor;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p031b0.C2806c;
import p126j0.C8266c;
import p126j0.C8278g;
import p270x.C10156b;
import p292z.C10732c;
import p404of.C13074a;

/* renamed from: bo.app.r */
public abstract class C3591r extends C3586q4 implements C3042c2 {

    /* renamed from: q */
    public static final C3592a f2429q = new C3592a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private Long f2430b;

    /* renamed from: c */
    private String f2431c;

    /* renamed from: d */
    private String f2432d;

    /* renamed from: e */
    private String f2433e;

    /* renamed from: f */
    private C3274j0 f2434f;

    /* renamed from: g */
    private String f2435g;

    /* renamed from: h */
    private String f2436h;

    /* renamed from: i */
    private SdkFlavor f2437i;

    /* renamed from: j */
    private C3025b4 f2438j;

    /* renamed from: k */
    private C2995a4 f2439k;

    /* renamed from: l */
    private C3294k f2440l;

    /* renamed from: m */
    private String f2441m;

    /* renamed from: n */
    private String f2442n;

    /* renamed from: o */
    private EnumSet<C10732c> f2443o;

    /* renamed from: p */
    private final boolean f2444p;

    /* renamed from: bo.app.r$a */
    public static final class C3592a {
        public /* synthetic */ C3592a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3592a() {
        }
    }

    /* renamed from: bo.app.r$b */
    static final class C3593b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3593b f2445b = new C3593b();

        C3593b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Trigger dispatch completed. Alerting subscribers.";
        }
    }

    /* renamed from: bo.app.r$c */
    static final class C3594c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2446b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3594c(String str) {
            super(0);
            this.f2446b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Error occurred while executing Braze request: ", this.f2446b);
        }
    }

    /* renamed from: bo.app.r$d */
    static final class C3595d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3595d f2447b = new C3595d();

        C3595d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "******************************************************************";
        }
    }

    /* renamed from: bo.app.r$e */
    static final class C3596e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3596e f2448b = new C3596e();

        C3596e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "**                        !! WARNING !!                         **";
        }
    }

    /* renamed from: bo.app.r$f */
    static final class C3597f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3597f f2449b = new C3597f();

        C3597f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "**  The current API key/endpoint combination is invalid. This   **";
        }
    }

    /* renamed from: bo.app.r$g */
    static final class C3598g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3598g f2450b = new C3598g();

        C3598g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "** is potentially an integration error. Please ensure that your **";
        }
    }

    /* renamed from: bo.app.r$h */
    static final class C3599h extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3599h f2451b = new C3599h();

        C3599h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "**     API key AND custom endpoint information are correct.     **";
        }
    }

    /* renamed from: bo.app.r$i */
    static final class C3600i extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3591r f2452b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3600i(C3591r rVar) {
            super(0);
            this.f2452b = rVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q(">> API key    : ", this.f2452b.mo29546n());
        }
    }

    /* renamed from: bo.app.r$j */
    static final class C3601j extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3591r f2453b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3601j(C3591r rVar) {
            super(0);
            this.f2453b = rVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q(">> Request Uri: ", this.f2453b.mo29439h());
        }
    }

    /* renamed from: bo.app.r$k */
    static final class C3602k extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3602k f2454b = new C3602k();

        C3602k() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "******************************************************************";
        }
    }

    /* renamed from: bo.app.r$l */
    static final class C3603l extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3603l f2455b = new C3603l();

        C3603l() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while retrieving parameters. Returning null.";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C3591r(C3753v4 v4Var) {
        super(v4Var);
        C12775o.m28639i(v4Var, "requestTarget");
    }

    /* renamed from: a */
    public boolean mo29437a(C3584q2 q2Var) {
        C12775o.m28639i(q2Var, "responseError");
        return false;
    }

    /* renamed from: b */
    public void mo28690b(String str) {
        this.f2431c = str;
    }

    /* renamed from: c */
    public void mo28692c(String str) {
        this.f2435g = str;
    }

    /* renamed from: d */
    public C3025b4 mo28693d() {
        return this.f2438j;
    }

    /* renamed from: e */
    public void mo28696e(String str) {
        this.f2436h = str;
    }

    /* renamed from: f */
    public void mo28698f(String str) {
        this.f2432d = str;
    }

    /* renamed from: g */
    public void mo28699g(String str) {
        this.f2433e = str;
    }

    /* renamed from: h */
    public C3753v4 mo29439h() {
        return new C3753v4(C10156b.f15345m.mo44808d(this.f2422a.mo29750a()));
    }

    /* renamed from: i */
    public EnumSet<C10732c> mo28700i() {
        return this.f2443o;
    }

    /* renamed from: j */
    public Long mo28701j() {
        return this.f2430b;
    }

    /* renamed from: k */
    public String mo28702k() {
        return this.f2441m;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062 A[Catch:{ JSONException -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071 A[Catch:{ JSONException -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072 A[Catch:{ JSONException -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087 A[Catch:{ JSONException -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0088 A[Catch:{ JSONException -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009d A[Catch:{ JSONException -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e A[Catch:{ JSONException -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b7 A[Catch:{ JSONException -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8 A[Catch:{ JSONException -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c7 A[Catch:{ JSONException -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c8 A[Catch:{ JSONException -> 0x00d4 }] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo28608l() {
        /*
            r9 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r9.mo29547o()     // Catch:{ JSONException -> 0x00d4 }
            if (r1 == 0) goto L_0x0014
            java.lang.String r1 = "device_id"
            java.lang.String r2 = r9.mo29547o()     // Catch:{ JSONException -> 0x00d4 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00d4 }
        L_0x0014:
            java.lang.Long r1 = r9.mo28701j()     // Catch:{ JSONException -> 0x00d4 }
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = "time"
            java.lang.Long r2 = r9.mo28701j()     // Catch:{ JSONException -> 0x00d4 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00d4 }
        L_0x0023:
            java.lang.String r1 = r9.mo29546n()     // Catch:{ JSONException -> 0x00d4 }
            if (r1 == 0) goto L_0x0032
            java.lang.String r1 = "api_key"
            java.lang.String r2 = r9.mo29546n()     // Catch:{ JSONException -> 0x00d4 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00d4 }
        L_0x0032:
            java.lang.String r1 = r9.mo29551s()     // Catch:{ JSONException -> 0x00d4 }
            if (r1 == 0) goto L_0x0041
            java.lang.String r1 = "sdk_version"
            java.lang.String r2 = r9.mo29551s()     // Catch:{ JSONException -> 0x00d4 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00d4 }
        L_0x0041:
            java.lang.String r1 = r9.mo29549q()     // Catch:{ JSONException -> 0x00d4 }
            if (r1 == 0) goto L_0x0050
            java.lang.String r1 = "app_version"
            java.lang.String r2 = r9.mo29549q()     // Catch:{ JSONException -> 0x00d4 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00d4 }
        L_0x0050:
            java.lang.String r1 = r9.mo29548p()     // Catch:{ JSONException -> 0x00d4 }
            if (r1 == 0) goto L_0x005f
            boolean r1 = p454wf.C13754v.m31532t(r1)     // Catch:{ JSONException -> 0x00d4 }
            if (r1 == 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r1 = 0
            goto L_0x0060
        L_0x005f:
            r1 = 1
        L_0x0060:
            if (r1 != 0) goto L_0x006b
            java.lang.String r1 = "app_version_code"
            java.lang.String r2 = r9.mo29548p()     // Catch:{ JSONException -> 0x00d4 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00d4 }
        L_0x006b:
            bo.app.j0 r1 = r9.mo28697f()     // Catch:{ JSONException -> 0x00d4 }
            if (r1 != 0) goto L_0x0072
            goto L_0x0081
        L_0x0072:
            boolean r2 = r1.mo28586e()     // Catch:{ JSONException -> 0x00d4 }
            if (r2 != 0) goto L_0x0081
            java.lang.String r2 = "device"
            org.json.JSONObject r1 = r1.forJsonPut()     // Catch:{ JSONException -> 0x00d4 }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00d4 }
        L_0x0081:
            bo.app.b4 r1 = r9.mo28693d()     // Catch:{ JSONException -> 0x00d4 }
            if (r1 != 0) goto L_0x0088
            goto L_0x0097
        L_0x0088:
            boolean r2 = r1.mo28586e()     // Catch:{ JSONException -> 0x00d4 }
            if (r2 != 0) goto L_0x0097
            java.lang.String r2 = "attributes"
            org.json.JSONArray r1 = r1.forJsonPut()     // Catch:{ JSONException -> 0x00d4 }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00d4 }
        L_0x0097:
            bo.app.k r1 = r9.mo28695e()     // Catch:{ JSONException -> 0x00d4 }
            if (r1 != 0) goto L_0x009e
            goto L_0x00b1
        L_0x009e:
            boolean r2 = r1.mo28586e()     // Catch:{ JSONException -> 0x00d4 }
            if (r2 != 0) goto L_0x00b1
            java.lang.String r2 = "events"
            java.util.Set r1 = r1.mo29168b()     // Catch:{ JSONException -> 0x00d4 }
            org.json.JSONArray r1 = p126j0.C8278g.m16448b(r1)     // Catch:{ JSONException -> 0x00d4 }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00d4 }
        L_0x00b1:
            com.appboy.enums.SdkFlavor r1 = r9.mo29550r()     // Catch:{ JSONException -> 0x00d4 }
            if (r1 != 0) goto L_0x00b8
            goto L_0x00c1
        L_0x00b8:
            java.lang.String r2 = "sdk_flavor"
            java.lang.String r1 = r1.forJsonPut()     // Catch:{ JSONException -> 0x00d4 }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00d4 }
        L_0x00c1:
            java.util.EnumSet r1 = r9.mo28700i()     // Catch:{ JSONException -> 0x00d4 }
            if (r1 != 0) goto L_0x00c8
            goto L_0x00d3
        L_0x00c8:
            java.lang.String r2 = "sdk_metadata"
            z.c$a r3 = p292z.C10732c.f16393c     // Catch:{ JSONException -> 0x00d4 }
            org.json.JSONArray r1 = r3.mo45658a(r1)     // Catch:{ JSONException -> 0x00d4 }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00d4 }
        L_0x00d3:
            return r0
        L_0x00d4:
            r0 = move-exception
            r4 = r0
            j0.c r1 = p126j0.C8266c.f11641a
            j0.c$a r3 = p126j0.C8266c.C8267a.f11651g
            bo.app.r$l r6 = p042bo.app.C3591r.C3603l.f2455b
            r5 = 0
            r7 = 4
            r8 = 0
            r2 = r9
            p126j0.C8266c.m16396e(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3591r.mo28608l():org.json.JSONObject");
    }

    /* renamed from: m */
    public C3765w1 mo29440m() {
        return new C3091d1((int) TimeUnit.MINUTES.toMillis(5), 0, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: n */
    public String mo29546n() {
        return this.f2432d;
    }

    /* renamed from: o */
    public String mo29547o() {
        return this.f2431c;
    }

    /* renamed from: p */
    public String mo29548p() {
        return this.f2436h;
    }

    /* renamed from: q */
    public String mo29549q() {
        return this.f2435g;
    }

    /* renamed from: r */
    public SdkFlavor mo29550r() {
        return this.f2437i;
    }

    /* renamed from: s */
    public String mo29551s() {
        return this.f2433e;
    }

    public String toString() {
        return C8278g.m16456j(mo28608l());
    }

    /* renamed from: a */
    public void mo28688a(Long l) {
        this.f2430b = l;
    }

    /* renamed from: b */
    public boolean mo28606b() {
        ArrayList<C3223i2> arrayList = new ArrayList<>();
        arrayList.add(mo28697f());
        arrayList.add(mo28693d());
        arrayList.add(mo28695e());
        for (C3223i2 i2Var : arrayList) {
            if (i2Var != null && !i2Var.mo28586e()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public C2995a4 mo28691c() {
        return this.f2439k;
    }

    /* renamed from: d */
    public void mo28694d(String str) {
        this.f2441m = str;
    }

    /* renamed from: e */
    public C3294k mo28695e() {
        return this.f2440l;
    }

    /* renamed from: f */
    public C3274j0 mo28697f() {
        return this.f2434f;
    }

    /* renamed from: g */
    public boolean mo28607g() {
        return this.f2444p;
    }

    /* renamed from: a */
    public void mo28685a(C3274j0 j0Var) {
        this.f2434f = j0Var;
    }

    /* renamed from: a */
    public void mo28687a(SdkFlavor sdkFlavor) {
        this.f2437i = sdkFlavor;
    }

    /* renamed from: a */
    public void mo28684a(C3025b4 b4Var) {
        this.f2438j = b4Var;
    }

    /* renamed from: a */
    public void mo28686a(C3294k kVar) {
        this.f2440l = kVar;
    }

    /* renamed from: a */
    public String mo28603a() {
        return this.f2442n;
    }

    /* renamed from: a */
    public void mo28605a(String str) {
        this.f2442n = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0.mo28590y() == true) goto L_0x0015;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29438b(p042bo.app.C3285j2 r11) {
        /*
            r10 = this;
            java.lang.String r0 = "internalPublisher"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            bo.app.a4 r0 = r10.mo28691c()
            if (r0 != 0) goto L_0x000c
            goto L_0x0014
        L_0x000c:
            boolean r0 = r0.mo28590y()
            r1 = 1
            if (r0 != r1) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            if (r1 == 0) goto L_0x002e
            j0.c r2 = p126j0.C8266c.f11641a
            bo.app.r$b r7 = p042bo.app.C3591r.C3593b.f2445b
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 7
            r9 = 0
            r3 = r10
            p126j0.C8266c.m16396e(r2, r3, r4, r5, r6, r7, r8, r9)
            bo.app.e6 r0 = new bo.app.e6
            r0.<init>(r10)
            java.lang.Class<bo.app.e6> r1 = p042bo.app.C3130e6.class
            r11.mo29152a(r0, r1)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3591r.mo29438b(bo.app.j2):void");
    }

    /* renamed from: a */
    public void mo28689a(EnumSet<C10732c> enumSet) {
        this.f2443o = enumSet;
    }

    /* renamed from: a */
    public void mo29436a(C3285j2 j2Var, C3285j2 j2Var2, C3584q2 q2Var) {
        C12775o.m28639i(j2Var, "internalPublisher");
        C12775o.m28639i(j2Var2, "externalPublisher");
        C12775o.m28639i(q2Var, "responseError");
        String a = q2Var.mo28922a();
        C8266c cVar = C8266c.f11641a;
        C8266c.C8267a aVar = C8266c.C8267a.f11651g;
        C8266c.m16396e(cVar, this, aVar, (Throwable) null, false, new C3594c(a), 6, (Object) null);
        if (q2Var instanceof C3316k3) {
            j2Var.mo29152a(q2Var, C3316k3.class);
            C8266c cVar2 = cVar;
            C8266c.C8267a aVar2 = aVar;
            C8266c.m16396e(cVar2, this, aVar2, (Throwable) null, false, C3595d.f2447b, 6, (Object) null);
            C8266c.m16396e(cVar2, this, aVar2, (Throwable) null, false, C3596e.f2448b, 6, (Object) null);
            C8266c.m16396e(cVar2, this, aVar2, (Throwable) null, false, C3597f.f2449b, 6, (Object) null);
            C8266c.m16396e(cVar2, this, aVar2, (Throwable) null, false, C3598g.f2450b, 6, (Object) null);
            C8266c.m16396e(cVar2, this, aVar2, (Throwable) null, false, C3599h.f2451b, 6, (Object) null);
            C8266c.m16396e(cVar2, this, aVar2, (Throwable) null, false, new C3600i(this), 6, (Object) null);
            C8266c.m16396e(cVar2, this, aVar2, (Throwable) null, false, new C3601j(this), 6, (Object) null);
            C8266c.m16396e(cVar2, this, aVar2, (Throwable) null, false, C3602k.f2454b, 6, (Object) null);
        }
        if (q2Var instanceof C3789x4) {
            j2Var2.mo29152a(new C2806c((C3789x4) q2Var), C2806c.class);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0.mo28590y() == true) goto L_0x0015;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29435a(p042bo.app.C3285j2 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "internalPublisher"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            bo.app.a4 r0 = r2.mo28691c()
            if (r0 != 0) goto L_0x000c
            goto L_0x0014
        L_0x000c:
            boolean r0 = r0.mo28590y()
            r1 = 1
            if (r0 != r1) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            if (r1 == 0) goto L_0x0021
            bo.app.f6 r0 = new bo.app.f6
            r0.<init>(r2)
            java.lang.Class<bo.app.f6> r1 = p042bo.app.C3153f6.class
            r3.mo29152a(r0, r1)
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3591r.mo29435a(bo.app.j2):void");
    }

    /* renamed from: a */
    public void mo28617a(Map<String, String> map) {
        C12775o.m28639i(map, "existingHeaders");
        map.put("X-Braze-Api-Key", mo29546n());
        String k = mo28702k();
        if (!(k == null || k.length() == 0)) {
            map.put("X-Braze-Auth-Signature", mo28702k());
        }
    }
}
