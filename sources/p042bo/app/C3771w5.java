package p042bo.app;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import p018a0.C2106e;
import p069e0.C7358a;
import p126j0.C8266c;
import p126j0.C8273e;
import p404of.C13074a;

/* renamed from: bo.app.w5 */
public final class C3771w5 extends C3591r {

    /* renamed from: C */
    public static final C3772a f2734C = new C3772a((DefaultConstructorMarker) null);

    /* renamed from: A */
    private final C3091d1 f2735A;

    /* renamed from: B */
    private final boolean f2736B;

    /* renamed from: r */
    private final C3790x5 f2737r;

    /* renamed from: s */
    private final C3766w2 f2738s;

    /* renamed from: t */
    private final C3023b2 f2739t;

    /* renamed from: u */
    private final String f2740u;

    /* renamed from: v */
    private final long f2741v;

    /* renamed from: w */
    private final long f2742w;

    /* renamed from: x */
    private final long f2743x;

    /* renamed from: y */
    private final C3024b3 f2744y;

    /* renamed from: z */
    private C2995a4 f2745z;

    /* renamed from: bo.app.w5$a */
    public static final class C3772a {
        public /* synthetic */ C3772a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3772a() {
        }
    }

    /* renamed from: bo.app.w5$b */
    static final class C3773b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3773b f2746b = new C3773b();

        C3773b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Template request failed. Attempting to log in-app message template request failure.";
        }
    }

    /* renamed from: bo.app.w5$c */
    static final class C3774c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3774c f2747b = new C3774c();

        C3774c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Trigger ID not found. Not logging in-app message template request failure.";
        }
    }

    /* renamed from: bo.app.w5$d */
    static final class C3775d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3775d f2748b = new C3775d();

        C3775d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while retrieving parameters. Returning null.";
        }
    }

    /* renamed from: bo.app.w5$e */
    static final class C3776e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ long f2749b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3776e(long j) {
            super(0);
            this.f2749b = j;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Template request has not yet expired. It expires at time: " + this.f2749b + ". Proceeding with retry.";
        }
    }

    /* renamed from: bo.app.w5$f */
    static final class C3777f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ long f2750b;

        /* renamed from: c */
        final /* synthetic */ C3771w5 f2751c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3777f(long j, C3771w5 w5Var) {
            super(0);
            this.f2750b = j;
            this.f2751c = w5Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Template request expired at time: " + this.f2750b + " and is not eligible for a response retry. Not retrying or performing any fallback triggers. " + this.f2751c;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3771w5(java.lang.String r17, p042bo.app.C3790x5 r18, p042bo.app.C3766w2 r19, p042bo.app.C3023b2 r20, java.lang.String r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            java.lang.String r5 = "urlBase"
            kotlin.jvm.internal.C12775o.m28639i(r1, r5)
            java.lang.String r5 = "templatedTriggeredAction"
            kotlin.jvm.internal.C12775o.m28639i(r2, r5)
            java.lang.String r5 = "triggerEvent"
            kotlin.jvm.internal.C12775o.m28639i(r3, r5)
            java.lang.String r5 = "brazeManager"
            kotlin.jvm.internal.C12775o.m28639i(r4, r5)
            bo.app.v4 r5 = new bo.app.v4
            java.lang.String r6 = "template"
            java.lang.String r1 = kotlin.jvm.internal.C12775o.m28647q(r1, r6)
            r5.<init>((java.lang.String) r1)
            r0.<init>(r5)
            r0.f2737r = r2
            r0.f2738s = r3
            r0.f2739t = r4
            java.lang.String r1 = r18.mo29799z()
            r0.f2740u = r1
            bo.app.r2 r1 = r18.mo28657f()
            long r3 = r0.m4053a((p042bo.app.C3632r2) r1)
            r0.f2741v = r3
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES
            r5 = 1
            long r7 = r1.toMillis(r5)
            long r3 = java.lang.Math.min(r3, r7)
            r0.f2742w = r3
            long r7 = r18.mo29798A()
            r0.f2743x = r7
            r0.f2744y = r2
            bo.app.a4$a r1 = new bo.app.a4$a
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 15
            r15 = 0
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r2 = r21
            bo.app.a4$a r1 = r1.mo28597b((java.lang.String) r2)
            bo.app.a4 r1 = r1.mo28593a()
            r0.f2745z = r1
            bo.app.d1 r1 = new bo.app.d1
            int r2 = (int) r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r3 = r3.toMillis(r5)
            int r3 = (int) r3
            r1.<init>(r2, r3)
            r0.f2735A = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3771w5.<init>(java.lang.String, bo.app.x5, bo.app.w2, bo.app.b2, java.lang.String):void");
    }

    /* renamed from: a */
    public void mo28604a(C3285j2 j2Var, C3285j2 j2Var2, C3084d dVar) {
        C7358a aVar;
        C12775o.m28639i(j2Var, "internalPublisher");
        C12775o.m28639i(j2Var2, "externalPublisher");
        mo29440m().mo28814c();
        if (dVar == null) {
            aVar = null;
        } else {
            aVar = dVar.mo28803i();
        }
        if (aVar != null) {
            dVar.mo28803i().mo40947L(this.f2737r.mo29545y());
        } else {
            mo29774x();
        }
    }

    /* renamed from: b */
    public boolean mo28606b() {
        return this.f2736B;
    }

    /* renamed from: c */
    public C2995a4 mo28691c() {
        return this.f2745z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b A[Catch:{ JSONException -> 0x005d }] */
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
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "trigger_id"
            java.lang.String r4 = r10.f2740u     // Catch:{ JSONException -> 0x005d }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x005d }
            java.lang.String r3 = "trigger_event_type"
            bo.app.w2 r4 = r10.f2738s     // Catch:{ JSONException -> 0x005d }
            java.lang.String r4 = r4.mo28842d()     // Catch:{ JSONException -> 0x005d }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x005d }
            java.lang.String r3 = "data"
            bo.app.w2 r4 = r10.f2738s     // Catch:{ JSONException -> 0x005d }
            bo.app.x1 r4 = r4.mo29015a()     // Catch:{ JSONException -> 0x005d }
            if (r4 != 0) goto L_0x002b
            r4 = r1
            goto L_0x0031
        L_0x002b:
            java.lang.Object r4 = r4.forJsonPut()     // Catch:{ JSONException -> 0x005d }
            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch:{ JSONException -> 0x005d }
        L_0x0031:
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x005d }
            java.lang.String r3 = "template"
            r0.put(r3, r2)     // Catch:{ JSONException -> 0x005d }
            bo.app.a4 r2 = r10.mo28691c()     // Catch:{ JSONException -> 0x005d }
            if (r2 != 0) goto L_0x0040
            goto L_0x0048
        L_0x0040:
            boolean r2 = r2.mo28591z()     // Catch:{ JSONException -> 0x005d }
            r3 = 1
            if (r2 != r3) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r3 = 0
        L_0x0049:
            if (r3 == 0) goto L_0x005c
            java.lang.String r2 = "respond_with"
            bo.app.a4 r3 = r10.mo28691c()     // Catch:{ JSONException -> 0x005d }
            if (r3 != 0) goto L_0x0055
            r3 = r1
            goto L_0x0059
        L_0x0055:
            org.json.JSONObject r3 = r3.forJsonPut()     // Catch:{ JSONException -> 0x005d }
        L_0x0059:
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x005d }
        L_0x005c:
            return r0
        L_0x005d:
            r0 = move-exception
            r5 = r0
            j0.c r2 = p126j0.C8266c.f11641a
            j0.c$a r4 = p126j0.C8266c.C8267a.f11651g
            bo.app.w5$d r7 = p042bo.app.C3771w5.C3775d.f2748b
            r6 = 0
            r8 = 4
            r9 = 0
            r3 = r10
            p126j0.C8266c.m16396e(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3771w5.mo28608l():org.json.JSONObject");
    }

    /* renamed from: t */
    public C3091d1 mo29440m() {
        return this.f2735A;
    }

    /* renamed from: u */
    public final long mo29771u() {
        return this.f2743x;
    }

    /* renamed from: v */
    public final C3766w2 mo29772v() {
        return this.f2738s;
    }

    /* renamed from: w */
    public final C3024b3 mo29773w() {
        return this.f2744y;
    }

    /* renamed from: x */
    public final void mo29774x() {
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, C8266c.C8267a.I, (Throwable) null, false, C3773b.f2746b, 6, (Object) null);
        if (C13754v.m31532t(this.f2740u)) {
            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C3774c.f2747b, 7, (Object) null);
            return;
        }
        try {
            C3785x1 a = C3240j.f1842h.mo29066a(this.f2740u, C2106e.TEMPLATE_REQUEST);
            if (a != null) {
                this.f2739t.mo28641a(a);
            }
        } catch (JSONException e) {
            this.f2739t.mo28644b((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo29436a(C3285j2 j2Var, C3285j2 j2Var2, C3584q2 q2Var) {
        C12775o.m28639i(j2Var, "internalPublisher");
        C12775o.m28639i(j2Var2, "externalPublisher");
        C12775o.m28639i(q2Var, "responseError");
        super.mo29436a(j2Var, j2Var2, q2Var);
        mo29774x();
        if (q2Var instanceof C3156g) {
            j2Var.mo29152a(new C3563p6(this.f2738s, this.f2737r), C3563p6.class);
        }
    }

    /* renamed from: a */
    public boolean mo29437a(C3584q2 q2Var) {
        C12775o.m28639i(q2Var, "responseError");
        if (!(q2Var instanceof C3668s3) && !(q2Var instanceof C3789x4)) {
            return false;
        }
        long e = this.f2738s.mo29018e() + this.f2741v;
        if (C8273e.m16435h() < e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3776e(e), 6, (Object) null);
            return true;
        }
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3777f(e, this), 7, (Object) null);
        return false;
    }

    /* renamed from: a */
    private final long m4053a(C3632r2 r2Var) {
        if (r2Var.mo29594a() == -1) {
            return TimeUnit.SECONDS.toMillis((long) (r2Var.mo29596g() + 30));
        }
        return (long) r2Var.mo29594a();
    }
}
