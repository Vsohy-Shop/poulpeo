package p042bo.app;

import android.app.AlarmManager;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.braze.configuration.C4218b;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p281y.C10606a;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* renamed from: bo.app.u6 */
public final class C3732u6 implements C3043c3 {

    /* renamed from: A */
    private final C3280j1 f2658A;

    /* renamed from: B */
    private final C2962a0 f2659B;

    /* renamed from: C */
    private final C3554p2 f2660C;

    /* renamed from: a */
    private final String f2661a;

    /* renamed from: b */
    private final String f2662b;

    /* renamed from: c */
    private final C3834z4 f2663c;

    /* renamed from: d */
    private final C3151f5 f2664d;

    /* renamed from: e */
    private final C3119e5 f2665e;

    /* renamed from: f */
    public C3704t6 f2666f;

    /* renamed from: g */
    public C3295k0 f2667g;

    /* renamed from: h */
    private final C3822z0 f2668h;

    /* renamed from: i */
    private final C3133f f2669i;

    /* renamed from: j */
    private final C3558p5 f2670j;

    /* renamed from: k */
    private final C3760w0 f2671k;

    /* renamed from: l */
    private final C3801y0 f2672l;

    /* renamed from: m */
    private final C3174h0 f2673m;

    /* renamed from: n */
    private final C3676t f2674n;

    /* renamed from: o */
    private final C3506o5 f2675o;

    /* renamed from: p */
    private final C2984a1 f2676p;

    /* renamed from: q */
    private final C3017b1 f2677q;

    /* renamed from: r */
    private final C3141f2 f2678r;

    /* renamed from: s */
    private final C3814y4 f2679s;

    /* renamed from: t */
    private final C3565q f2680t;

    /* renamed from: u */
    private final C2998a5 f2681u;

    /* renamed from: v */
    private final C3023b2 f2682v;

    /* renamed from: w */
    private final C3320k6 f2683w;

    /* renamed from: x */
    private final C3351l f2684x;

    /* renamed from: y */
    private final C3481o f2685y;

    /* renamed from: z */
    private final C3107e1 f2686z;

    @C12739f(mo50609c = "com.braze.managers.UserDependencyManager$requestClose$1", mo50610f = "UserDependencyManager.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: bo.app.u6$a */
    static final class C3733a extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: b */
        int f2687b;

        /* renamed from: c */
        private /* synthetic */ Object f2688c;

        /* renamed from: d */
        final /* synthetic */ C3732u6 f2689d;

        /* renamed from: bo.app.u6$a$a */
        static final class C3734a extends C12777p implements C13074a<String> {

            /* renamed from: b */
            public static final C3734a f2690b = new C3734a();

            C3734a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "User cache was locked, waiting.";
            }
        }

        /* renamed from: bo.app.u6$a$b */
        static final class C3735b extends C12777p implements C13074a<String> {

            /* renamed from: b */
            public static final C3735b f2691b = new C3735b();

            C3735b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "User cache notified. Continuing UserDependencyManager shutdown";
            }
        }

        /* renamed from: bo.app.u6$a$c */
        static final class C3736c extends C12777p implements C13074a<String> {

            /* renamed from: b */
            public static final C3736c f2692b = new C3736c();

            C3736c() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Device cache was locked, waiting.";
            }
        }

        /* renamed from: bo.app.u6$a$d */
        static final class C3737d extends C12777p implements C13074a<String> {

            /* renamed from: b */
            public static final C3737d f2693b = new C3737d();

            C3737d() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Device cache notified. Continuing UserDependencyManager shutdown";
            }
        }

        /* renamed from: bo.app.u6$a$e */
        static final class C3738e extends C12777p implements C13074a<String> {

            /* renamed from: b */
            public static final C3738e f2694b = new C3738e();

            C3738e() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Exception while shutting down dispatch manager. Continuing.";
            }
        }

        /* renamed from: bo.app.u6$a$f */
        static final class C3739f extends C12777p implements C13074a<String> {

            /* renamed from: b */
            public static final C3739f f2695b = new C3739f();

            C3739f() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Exception while stopping data sync. Continuing.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3733a(C3732u6 u6Var, C12074d<? super C3733a> dVar) {
            super(2, dVar);
            this.f2689d = u6Var;
        }

        /* renamed from: a */
        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C3733a) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C3733a aVar = new C3733a(this.f2689d, dVar);
            aVar.f2688c = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C12150d.m26492c();
            if (this.f2687b == 0) {
                C11910n.m25701b(obj);
                C13995l0 l0Var = (C13995l0) this.f2688c;
                try {
                    if (this.f2689d.mo28704b().mo28512b()) {
                        C8266c cVar = C8266c.f11641a;
                        C8266c.m16396e(cVar, l0Var, C8266c.C8267a.I, (Throwable) null, false, C3734a.f2690b, 6, (Object) null);
                        this.f2689d.mo28704b().mo28513c();
                        C8266c.m16396e(cVar, l0Var, (C8266c.C8267a) null, (Throwable) null, false, C3735b.f2691b, 7, (Object) null);
                    }
                    if (this.f2689d.mo28705c().mo28512b()) {
                        C8266c cVar2 = C8266c.f11641a;
                        C8266c.m16396e(cVar2, l0Var, C8266c.C8267a.I, (Throwable) null, false, C3736c.f2692b, 6, (Object) null);
                        this.f2689d.mo28705c().mo28513c();
                        C8266c.m16396e(cVar2, l0Var, (C8266c.C8267a) null, (Throwable) null, false, C3737d.f2693b, 7, (Object) null);
                    }
                    this.f2689d.mo28716n().mo28891a((C3285j2) this.f2689d.mo28713k());
                } catch (Exception e) {
                    C13995l0 l0Var2 = l0Var;
                    C8266c.m16396e(C8266c.f11641a, l0Var2, C8266c.C8267a.f11651g, e, false, C3738e.f2694b, 4, (Object) null);
                }
                try {
                    this.f2689d.mo28706d().mo28961f();
                } catch (Exception e2) {
                    C13995l0 l0Var3 = l0Var;
                    C8266c.m16396e(C8266c.f11641a, l0Var3, C8266c.C8267a.f11651g, e2, false, C3739f.f2695b, 4, (Object) null);
                }
                this.f2689d.mo28713k().mo29152a(new C3759w(), C3759w.class);
                return C11921v.f18618a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C3732u6(Context context, C3748v3 v3Var, C4218b bVar, C3285j2 j2Var, C3162g2 g2Var, C3429m2 m2Var, boolean z, boolean z2, C3030b6 b6Var) {
        Context context2 = context;
        C4218b bVar2 = bVar;
        C12775o.m28639i(context2, "applicationContext");
        C12775o.m28639i(v3Var, "offlineUserStorageProvider");
        C12775o.m28639i(bVar2, "configurationProvider");
        C12775o.m28639i(j2Var, "externalEventPublisher");
        C12775o.m28639i(g2Var, "deviceIdProvider");
        C12775o.m28639i(m2Var, "registrationDataProvider");
        C12775o.m28639i(b6Var, "testUserDeviceLoggingManager");
        String a = v3Var.mo29745a();
        this.f2661a = a;
        String iVar = bVar.getBrazeApiKey().toString();
        this.f2662b = iVar;
        C3834z4 z4Var = new C3834z4(context2);
        this.f2663c = z4Var;
        C3151f5 f5Var = new C3151f5(context2);
        this.f2664d = f5Var;
        this.f2665e = new C3119e5(context2, iVar, f5Var);
        this.f2668h = new C3822z0(z4Var);
        C3558p5 p5Var = new C3558p5(context2, a, iVar);
        this.f2670j = p5Var;
        C3760w0 w0Var = new C3760w0(p5Var, mo28713k());
        this.f2671k = w0Var;
        this.f2673m = new C3174h0(context2, mo28713k(), new C3157g0(context2));
        C3822z0 k = mo28713k();
        Object systemService = context2.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (systemService != null) {
            C3676t tVar = r1;
            AlarmManager alarmManager = (AlarmManager) systemService;
            C3834z4 z4Var2 = z4Var;
            String str = iVar;
            C3676t tVar2 = new C3676t(context, w0Var, k, j2Var, alarmManager, bVar.getSessionTimeoutSeconds(), bVar.isSessionStartBasedTimeoutEnabled());
            this.f2674n = tVar;
            C3506o5 o5Var = new C3506o5(context2, a, str);
            this.f2675o = o5Var;
            C2984a1 a1Var = new C2984a1(o5Var, mo28713k());
            this.f2676p = a1Var;
            this.f2677q = new C3017b1(a1Var);
            this.f2679s = new C3814y4(context2, a, str);
            this.f2680t = new C3565q(context2, mo28713k(), mo28707e());
            C2998a5 a5Var = new C2998a5(context2, a, str);
            this.f2681u = a5Var;
            Context context3 = context;
            C3519p pVar = r1;
            String str2 = a;
            C2998a5 a5Var2 = a5Var;
            C3519p pVar2 = new C3519p(context3, a, str, mo29733t(), mo28713k(), bVar, mo28707e(), mo28708f(), z2, mo29732s(), z4Var2);
            this.f2682v = pVar;
            this.f2683w = new C3320k6(context3, mo28715m(), mo28713k(), j2Var, bVar, str2, str);
            this.f2684x = new C3351l(context3, str, mo28715m(), bVar, mo28707e(), mo28713k());
            Context context4 = context;
            this.f2685y = new C3481o(context4, mo28715m(), bVar2);
            this.f2686z = new C3107e1(context4, str, mo28707e(), mo28715m());
            String str3 = str2;
            this.f2658A = new C3280j1(context4, str3, mo28715m());
            this.f2659B = new C2962a0(context, str3, str, mo28715m(), (String) null, 16, (DefaultConstructorMarker) null);
            C3634r4 r4Var = new C3634r4(C3726u1.m3972a(), mo28713k(), j2Var, mo28709g(), mo28707e(), mo28712j(), mo28715m());
            this.f2660C = r4Var;
            if (C12775o.m28634d(str3, "")) {
                Context context5 = context;
                mo29731a(new C3704t6(context5, m2Var, z4Var2, (String) null, (String) null, 24, (DefaultConstructorMarker) null));
                mo29730a(new C3295k0(context5, (String) null, (String) null, 6, (DefaultConstructorMarker) null));
            } else {
                mo29731a(new C3704t6(context, m2Var, z4Var2, str3, str));
                mo29730a(new C3295k0(context4, str3, str));
            }
            this.f2678r = new C3382l0(context4, bVar2, g2Var, mo28705c());
            C3571q0 q0Var = new C3571q0(mo28704b(), mo28720r(), bVar, mo28717o(), a5Var2, mo28713k());
            mo28706d().mo28956a(z2);
            this.f2669i = new C3133f(bVar, mo28713k(), r4Var, q0Var, z);
            C3801y0 y0Var = r1;
            C3801y0 y0Var2 = new C3801y0(context, mo28710h(), mo28716n(), mo28715m(), mo28704b(), mo28705c(), mo28714l(), mo28714l().mo29215f(), mo28708f(), mo28711i(), b6Var, j2Var, bVar, mo28712j(), a5Var2, mo28707e(), mo28718p());
            this.f2672l = y0Var;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
    }

    /* renamed from: a */
    public void mo29731a(C3704t6 t6Var) {
        C12775o.m28639i(t6Var, "<set-?>");
        this.f2666f = t6Var;
    }

    /* renamed from: b */
    public C3704t6 mo28704b() {
        C3704t6 t6Var = this.f2666f;
        if (t6Var != null) {
            return t6Var;
        }
        C12775o.m28656z("userCache");
        return null;
    }

    /* renamed from: c */
    public C3295k0 mo28705c() {
        C3295k0 k0Var = this.f2667g;
        if (k0Var != null) {
            return k0Var;
        }
        C12775o.m28656z("deviceCache");
        return null;
    }

    /* renamed from: d */
    public C3174h0 mo28706d() {
        return this.f2673m;
    }

    /* renamed from: e */
    public C3119e5 mo28707e() {
        return this.f2665e;
    }

    /* renamed from: f */
    public C3017b1 mo28708f() {
        return this.f2677q;
    }

    /* renamed from: g */
    public C3280j1 mo28709g() {
        return this.f2658A;
    }

    /* renamed from: h */
    public C3481o mo28710h() {
        return this.f2685y;
    }

    /* renamed from: i */
    public C3351l mo28711i() {
        return this.f2684x;
    }

    /* renamed from: j */
    public C2962a0 mo28712j() {
        return this.f2659B;
    }

    /* renamed from: k */
    public C3822z0 mo28713k() {
        return this.f2668h;
    }

    /* renamed from: l */
    public C3320k6 mo28714l() {
        return this.f2683w;
    }

    /* renamed from: m */
    public C3023b2 mo28715m() {
        return this.f2682v;
    }

    /* renamed from: n */
    public C3133f mo28716n() {
        return this.f2669i;
    }

    /* renamed from: o */
    public C3814y4 mo28717o() {
        return this.f2679s;
    }

    /* renamed from: p */
    public C3107e1 mo28718p() {
        return this.f2686z;
    }

    /* renamed from: q */
    public C3801y0 mo28719q() {
        return this.f2672l;
    }

    /* renamed from: r */
    public C3141f2 mo28720r() {
        return this.f2678r;
    }

    /* renamed from: s */
    public C3565q mo29732s() {
        return this.f2680t;
    }

    /* renamed from: t */
    public C3676t mo29733t() {
        return this.f2674n;
    }

    /* renamed from: a */
    public void mo29730a(C3295k0 k0Var) {
        C12775o.m28639i(k0Var, "<set-?>");
        this.f2667g = k0Var;
    }

    /* renamed from: a */
    public void mo28703a() {
        C14054y1 unused = C13985j.m32422d(C10606a.f16162b, (C12079g) null, (C14004n0) null, new C3733a(this, (C12074d<? super C3733a>) null), 3, (Object) null);
    }
}
