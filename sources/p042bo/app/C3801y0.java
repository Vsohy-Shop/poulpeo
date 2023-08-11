package p042bo.app;

import android.content.Context;
import com.braze.configuration.C4218b;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p031b0.C2809e;
import p031b0.C2811f;
import p031b0.C2813h;
import p042bo.app.C2995a4;
import p069e0.C7358a;
import p126j0.C8266c;
import p126j0.C8273e;
import p270x.C10156b;
import p270x.C10299e;
import p281y.C10606a;
import p292z.C10732c;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p466yf.C14054y1;

/* renamed from: bo.app.y0 */
public final class C3801y0 {

    /* renamed from: a */
    private final Context f2781a;

    /* renamed from: b */
    private final C3393l2 f2782b;

    /* renamed from: c */
    private final C3203h2 f2783c;

    /* renamed from: d */
    public final C3023b2 f2784d;

    /* renamed from: e */
    private final C3704t6 f2785e;

    /* renamed from: f */
    private final C3295k0 f2786f;

    /* renamed from: g */
    private final C3787x2 f2787g;

    /* renamed from: h */
    private final C2994a3 f2788h;

    /* renamed from: i */
    private final C3017b1 f2789i;

    /* renamed from: j */
    private final C3351l f2790j;

    /* renamed from: k */
    private final C3030b6 f2791k;

    /* renamed from: l */
    private final C3285j2 f2792l;

    /* renamed from: m */
    private final C4218b f2793m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C2962a0 f2794n;

    /* renamed from: o */
    private final C2998a5 f2795o;

    /* renamed from: p */
    private final C3119e5 f2796p;

    /* renamed from: q */
    private final C3107e1 f2797q;

    /* renamed from: r */
    public final AtomicBoolean f2798r = new AtomicBoolean(false);

    /* renamed from: s */
    private final AtomicBoolean f2799s = new AtomicBoolean(false);

    /* renamed from: t */
    private C3166g6 f2800t;

    /* renamed from: u */
    private C14054y1 f2801u;

    /* renamed from: bo.app.y0$a */
    static final class C3802a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3802a f2802b = new C3802a();

        C3802a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to log error.";
        }
    }

    /* renamed from: bo.app.y0$b */
    static final class C3803b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3024b3 f2803b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3803b(C3024b3 b3Var) {
            super(0);
            this.f2803b = b3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Could not publish in-app message with trigger action id: ", this.f2803b.getId());
        }
    }

    /* renamed from: bo.app.y0$c */
    static final class C3804c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3804c f2804b = new C3804c();

        C3804c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Requesting trigger refresh.";
        }
    }

    /* renamed from: bo.app.y0$d */
    static final class C3805d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ long f2805b;

        /* renamed from: c */
        final /* synthetic */ int f2806c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3805d(long j, int i) {
            super(0);
            this.f2805b = j;
            this.f2806c = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return "ContentCardRetryEvent received. timeInMS: " + this.f2805b + ", retryCount: " + this.f2806c;
        }
    }

    @C12739f(mo50609c = "com.braze.events.EventListenerFactory$retryContentCardsEventSubscriber$1$2", mo50610f = "EventListenerFactory.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: bo.app.y0$e */
    static final class C3806e extends C12746l implements Function1<C12074d<? super C11921v>, Object> {

        /* renamed from: b */
        int f2807b;

        /* renamed from: c */
        final /* synthetic */ C3801y0 f2808c;

        /* renamed from: d */
        final /* synthetic */ int f2809d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3806e(C3801y0 y0Var, int i, C12074d<? super C3806e> dVar) {
            super(1, dVar);
            this.f2808c = y0Var;
            this.f2809d = i;
        }

        /* renamed from: a */
        public final Object invoke(C12074d<? super C11921v> dVar) {
            return ((C3806e) create(dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final C12074d<C11921v> create(C12074d<?> dVar) {
            return new C3806e(this.f2808c, this.f2809d, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C12150d.m26492c();
            if (this.f2807b == 0) {
                C11910n.m25701b(obj);
                C3801y0 y0Var = this.f2808c;
                y0Var.f2784d.mo28632a(y0Var.f2794n.mo28537e(), this.f2808c.f2794n.mo28539f(), this.f2809d);
                return C11921v.f18618a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: bo.app.y0$f */
    static final class C3807f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3807f f2810b = new C3807f();

        C3807f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Session start event for new session received.";
        }
    }

    /* renamed from: bo.app.y0$g */
    static final class C3808g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3808g f2811b = new C3808g();

        C3808g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Not automatically requesting Braze Geofence refresh on session created event due to configuration.";
        }
    }

    /* renamed from: bo.app.y0$h */
    static final class C3809h extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3809h f2812b = new C3809h();

        C3809h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to log the storage exception.";
        }
    }

    /* renamed from: bo.app.y0$i */
    static final class C3810i extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3810i f2813b = new C3810i();

        C3810i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Requesting trigger update due to trigger-eligible push click event";
        }
    }

    public C3801y0(Context context, C3393l2 l2Var, C3203h2 h2Var, C3023b2 b2Var, C3704t6 t6Var, C3295k0 k0Var, C3787x2 x2Var, C2994a3 a3Var, C3017b1 b1Var, C3351l lVar, C3030b6 b6Var, C3285j2 j2Var, C4218b bVar, C2962a0 a0Var, C2998a5 a5Var, C3119e5 e5Var, C3107e1 e1Var) {
        Context context2 = context;
        C3393l2 l2Var2 = l2Var;
        C3203h2 h2Var2 = h2Var;
        C3023b2 b2Var2 = b2Var;
        C3704t6 t6Var2 = t6Var;
        C3295k0 k0Var2 = k0Var;
        C3787x2 x2Var2 = x2Var;
        C2994a3 a3Var2 = a3Var;
        C3017b1 b1Var2 = b1Var;
        C3351l lVar2 = lVar;
        C3030b6 b6Var2 = b6Var;
        C3285j2 j2Var2 = j2Var;
        C4218b bVar2 = bVar;
        C2962a0 a0Var2 = a0Var;
        C3119e5 e5Var2 = e5Var;
        C12775o.m28639i(context2, "applicationContext");
        C12775o.m28639i(l2Var2, "locationManager");
        C12775o.m28639i(h2Var2, "dispatchManager");
        C12775o.m28639i(b2Var2, "brazeManager");
        C12775o.m28639i(t6Var2, "userCache");
        C12775o.m28639i(k0Var2, "deviceCache");
        C12775o.m28639i(x2Var2, "triggerManager");
        C12775o.m28639i(a3Var2, "triggerReEligibilityManager");
        C12775o.m28639i(b1Var2, "eventStorageManager");
        C12775o.m28639i(lVar2, "geofenceManager");
        C12775o.m28639i(b6Var2, "testUserDeviceLoggingManager");
        C12775o.m28639i(j2Var2, "externalEventPublisher");
        C12775o.m28639i(bVar2, "configurationProvider");
        C12775o.m28639i(a0Var2, "contentCardsStorageProvider");
        C12775o.m28639i(a5Var, "sdkMetadataCache");
        C12775o.m28639i(e5Var, "serverConfigStorageProvider");
        C12775o.m28639i(e1Var, "featureFlagsManager");
        this.f2781a = context2;
        this.f2782b = l2Var2;
        this.f2783c = h2Var2;
        this.f2784d = b2Var2;
        this.f2785e = t6Var2;
        this.f2786f = k0Var2;
        this.f2787g = x2Var2;
        this.f2788h = a3Var2;
        this.f2789i = b1Var2;
        this.f2790j = lVar2;
        this.f2791k = b6Var2;
        this.f2792l = j2Var2;
        this.f2793m = bVar2;
        this.f2794n = a0Var2;
        this.f2795o = a5Var;
        this.f2796p = e5Var;
        this.f2797q = e1Var;
    }

    /* renamed from: s */
    public final void mo29817s() {
        if (this.f2798r.compareAndSet(true, false)) {
            this.f2787g.mo29206a((C3766w2) new C3788x3());
        }
    }

    /* renamed from: t */
    public final void mo29818t() {
        if (this.f2784d.mo28646c()) {
            this.f2798r.set(true);
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3804c.f2804b, 7, (Object) null);
            this.f2784d.mo28634a(new C2995a4.C2996a((String) null, (Boolean) null, (Boolean) null, (C3832z3) null, 15, (DefaultConstructorMarker) null).mo28600c());
            this.f2784d.mo28640a(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4130a(C3801y0 y0Var, C3604r0 r0Var) {
        C12775o.m28639i(y0Var, "this$0");
        C12775o.m28639i(r0Var, "$dstr$brazeRequest");
        C3042c2 a = r0Var.mo29564a();
        C3274j0 f = a.mo28697f();
        boolean z = true;
        if (f != null) {
            y0Var.f2786f.mo28510a(f, true);
        }
        C3025b4 d = a.mo28693d();
        if (d != null) {
            y0Var.mo29815q().mo28510a(d, true);
        }
        C3294k e = a.mo28695e();
        if (e != null) {
            y0Var.f2789i.mo28625a((Set<? extends C3785x1>) e.mo29168b());
        }
        C2995a4 c = a.mo28691c();
        if (c != null && c.mo28590y()) {
            y0Var.f2784d.mo28640a(false);
        }
        EnumSet<C10732c> i = a.mo28700i();
        if (i != null) {
            y0Var.f2795o.mo28601a(i);
        }
        C2995a4 c2 = a.mo28691c();
        if (c2 == null || !c2.mo28588w()) {
            z = false;
        }
        if (z) {
            y0Var.f2796p.mo28878t();
        }
    }

    /* renamed from: g */
    private final C2811f<C3555p3> m4141g() {
        return new C3779w7(this);
    }

    /* renamed from: h */
    private final C2811f<C3780x> m4143h() {
        return new C3758v7(this);
    }

    /* renamed from: i */
    private final C2811f<C3099d5> m4145i() {
        return new C3799x7(this);
    }

    /* renamed from: k */
    private final C2811f<C3319k5> m4148k() {
        return new C3102d8(this);
    }

    /* renamed from: l */
    private final C2811f<C3638r5> m4150l() {
        return new C3214h8(this);
    }

    /* renamed from: n */
    private final C2811f<C3237i6> m4153n() {
        return new C3717t7(this);
    }

    /* renamed from: o */
    private final C2811f<C3563p6> m4155o() {
        return new C3819y7(this);
    }

    /* renamed from: b */
    public final C2811f<C3544p0> mo29807b() {
        return new C3155f8(this);
    }

    /* renamed from: c */
    public final C2811f<C3604r0> mo29808c() {
        return new C3239i8(this);
    }

    /* renamed from: d */
    public final C2811f<C3140f1> mo29809d() {
        return new C3132e8(this);
    }

    /* renamed from: e */
    public final C2811f<C3583q1> mo29810e() {
        return new C3005a8(this);
    }

    /* renamed from: f */
    public final C2811f<C3163g3> mo29811f() {
        return new C3083c8(this);
    }

    /* renamed from: j */
    public final C2811f<C3236i5> mo29812j() {
        return new C3293j8(this);
    }

    /* renamed from: m */
    public final C2811f<C3166g6> mo29813m() {
        return new C3034b8(this);
    }

    /* renamed from: p */
    public final C2811f<C3639r6> mo29814p() {
        return new C3839z7(this);
    }

    /* renamed from: q */
    public final C3704t6 mo29815q() {
        return this.f2785e;
    }

    /* renamed from: r */
    public final void mo29816r() {
        C3166g6 g6Var;
        if (this.f2799s.compareAndSet(true, false) && (g6Var = this.f2800t) != null) {
            this.f2787g.mo29206a((C3766w2) new C3288j4(g6Var.mo28943a(), g6Var.mo28944b()));
            this.f2800t = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4126a(C3801y0 y0Var, C3544p0 p0Var) {
        C12775o.m28639i(y0Var, "this$0");
        C12775o.m28639i(p0Var, "$dstr$brazeRequest");
        C3042c2 a = p0Var.mo29487a();
        C2995a4 c = a.mo28691c();
        boolean z = false;
        if (c != null && c.mo28590y()) {
            y0Var.mo29817s();
            y0Var.mo29816r();
            y0Var.f2784d.mo28640a(true);
        }
        C3274j0 f = a.mo28697f();
        if (f != null) {
            y0Var.f2786f.mo28510a(f, false);
        }
        C3025b4 d = a.mo28693d();
        if (d != null) {
            y0Var.mo29815q().mo28510a(d, false);
            if (d.mo28662w().has("push_token")) {
                y0Var.mo29815q().mo29705h();
                y0Var.f2786f.mo29174e();
            }
        }
        C3294k e = a.mo28695e();
        if (e != null) {
            for (C3785x1 a2 : e.mo29168b()) {
                y0Var.f2783c.mo28894a(a2);
            }
        }
        C2995a4 c2 = a.mo28691c();
        if (c2 != null && c2.mo28588w()) {
            z = true;
        }
        if (z) {
            y0Var.f2796p.mo28878t();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4123a(C3801y0 y0Var, C3236i5 i5Var) {
        C3801y0 y0Var2 = y0Var;
        C12775o.m28639i(y0Var2, "this$0");
        C12775o.m28639i(i5Var, "it");
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, y0Var, (C8266c.C8267a) null, (Throwable) null, false, C3807f.f2810b, 7, (Object) null);
        C3785x1 a = C3240j.f1842h.mo29062a(i5Var.mo29037a().mo29006n());
        if (a != null) {
            a.mo29046a(i5Var.mo29037a().mo29006n());
        }
        if (a != null) {
            y0Var2.f2784d.mo28641a(a);
        }
        y0Var2.f2782b.mo29310a();
        y0Var2.f2784d.mo28640a(true);
        y0Var2.f2785e.mo29705h();
        y0Var2.f2786f.mo29174e();
        y0Var.mo29818t();
        if (y0Var2.f2793m.isAutomaticGeofenceRequestsEnabled()) {
            C10299e.m21650j(y0Var2.f2781a, false);
        } else {
            C8266c.m16396e(cVar, y0Var, (C8266c.C8267a) null, (Throwable) null, false, C3808g.f2811b, 7, (Object) null);
        }
        C3023b2.m2597a(y0Var2.f2784d, y0Var2.f2794n.mo28537e(), y0Var2.f2794n.mo28539f(), 0, 4, (Object) null);
        if (y0Var2.f2796p.mo28874o()) {
            y0Var2.f2797q.mo28846c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4127a(C3801y0 y0Var, C3555p3 p3Var) {
        C12775o.m28639i(y0Var, "this$0");
        C12775o.m28639i(p3Var, "it");
        y0Var.f2784d.mo28640a(true);
        y0Var.mo29818t();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4125a(C3801y0 y0Var, C3319k5 k5Var) {
        C12775o.m28639i(y0Var, "this$0");
        C12775o.m28639i(k5Var, "message");
        y0Var.m4118a(k5Var);
        C10156b.f15345m.mo44811g(y0Var.f2781a).mo44795l0();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4119a(C3801y0 y0Var, C3099d5 d5Var) {
        C12775o.m28639i(y0Var, "this$0");
        C12775o.m28639i(d5Var, "$dstr$serverConfig");
        C3046c5 a = d5Var.mo28824a();
        y0Var.f2790j.mo29253a(a);
        y0Var.f2791k.mo28669a(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4129a(C3801y0 y0Var, C3583q1 q1Var) {
        C12775o.m28639i(y0Var, "this$0");
        C12775o.m28639i(q1Var, "$dstr$geofences");
        y0Var.f2790j.mo29254a(q1Var.mo29539a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4120a(C3801y0 y0Var, C3140f1 f1Var) {
        C12775o.m28639i(y0Var, "this$0");
        C12775o.m28639i(f1Var, "$dstr$featureFlags");
        y0Var.f2792l.mo29152a(y0Var.f2797q.mo28844a(f1Var.mo28900a()), C2809e.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4122a(C3801y0 y0Var, C3166g6 g6Var) {
        C12775o.m28639i(y0Var, "this$0");
        C12775o.m28639i(g6Var, "message");
        y0Var.f2799s.set(true);
        y0Var.f2800t = g6Var;
        C8266c.m16396e(C8266c.f11641a, y0Var, C8266c.C8267a.I, (Throwable) null, false, C3810i.f2813b, 6, (Object) null);
        y0Var.f2784d.mo28634a(new C2995a4.C2996a((String) null, (Boolean) null, (Boolean) null, (C3832z3) null, 15, (DefaultConstructorMarker) null).mo28600c());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4132a(C3801y0 y0Var, C3639r6 r6Var) {
        C12775o.m28639i(y0Var, "this$0");
        C12775o.m28639i(r6Var, "$dstr$triggeredActions");
        y0Var.f2787g.mo28762a(r6Var.mo29604a());
        y0Var.mo29817s();
        y0Var.mo29816r();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4124a(C3801y0 y0Var, C3237i6 i6Var) {
        C12775o.m28639i(y0Var, "this$0");
        C12775o.m28639i(i6Var, "$dstr$triggerEvent");
        y0Var.f2787g.mo29206a(i6Var.mo29041a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4121a(C3801y0 y0Var, C3163g3 g3Var) {
        C12775o.m28639i(y0Var, "this$0");
        C12775o.m28639i(g3Var, "$dstr$triggerEvent$triggeredAction$inAppMessage$userId");
        C3766w2 a = g3Var.mo28932a();
        C3024b3 b = g3Var.mo28933b();
        C7358a c = g3Var.mo28934c();
        String d = g3Var.mo28935d();
        synchronized (y0Var.f2788h) {
            if (y0Var.f2788h.mo28585b(b)) {
                y0Var.f2792l.mo29152a(new C2813h(a, b, c, d), C2813h.class);
                y0Var.f2788h.mo28584a(b, C8273e.m16436i());
                y0Var.f2787g.mo29205a(C8273e.m16436i());
            } else {
                C8266c.m16396e(C8266c.f11641a, y0Var, (C8266c.C8267a) null, (Throwable) null, false, new C3803b(b), 7, (Object) null);
            }
            C11921v vVar = C11921v.f18618a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4128a(C3801y0 y0Var, C3563p6 p6Var) {
        C12775o.m28639i(y0Var, "this$0");
        C12775o.m28639i(p6Var, "$dstr$originalTriggerEvent$failedTriggeredAction");
        y0Var.f2787g.mo29207a(p6Var.mo29507a(), p6Var.mo29508b());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4134a(C3801y0 y0Var, C3780x xVar) {
        C12775o.m28639i(y0Var, "this$0");
        C12775o.m28639i(xVar, "$dstr$timeInMs$retryCount");
        long a = xVar.mo29780a();
        int b = xVar.mo29781b();
        C8266c.m16396e(C8266c.f11641a, y0Var, C8266c.C8267a.f11650f, (Throwable) null, false, new C3805d(a, b), 6, (Object) null);
        C14054y1 y1Var = y0Var.f2801u;
        if (y1Var != null) {
            C14054y1.C14055a.m32600a(y1Var, (CancellationException) null, 1, (Object) null);
        }
        y0Var.f2801u = C10606a.m22557b(C10606a.f16162b, Long.valueOf(a), (C12079g) null, new C3806e(y0Var, b, (C12074d<? super C3806e>) null), 2, (Object) null);
    }

    /* renamed from: a */
    private final C2811f<C3759w> m4116a() {
        return new C3168g8(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4133a(C3801y0 y0Var, C3759w wVar) {
        C12775o.m28639i(y0Var, "this$0");
        C12775o.m28639i(wVar, "it");
        C14054y1 y1Var = y0Var.f2801u;
        if (y1Var != null) {
            C14054y1.C14055a.m32600a(y1Var, (CancellationException) null, 1, (Object) null);
        }
        y0Var.f2801u = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4131a(C3801y0 y0Var, C3638r5 r5Var) {
        C12775o.m28639i(y0Var, "this$0");
        C12775o.m28639i(r5Var, "storageException");
        try {
            y0Var.f2784d.mo28638a((Throwable) r5Var);
        } catch (Exception e) {
            C3801y0 y0Var2 = y0Var;
            C8266c.m16396e(C8266c.f11641a, y0Var2, C8266c.C8267a.f11649e, e, false, C3809h.f2812b, 4, (Object) null);
        }
    }

    /* renamed from: a */
    public final void mo29806a(C3285j2 j2Var) {
        C12775o.m28639i(j2Var, "eventMessenger");
        j2Var.mo29153a(mo29807b(), C3544p0.class);
        j2Var.mo29153a(mo29808c(), C3604r0.class);
        j2Var.mo29153a(mo29812j(), C3236i5.class);
        j2Var.mo29153a(m4148k(), C3319k5.class);
        j2Var.mo29153a(mo29813m(), C3166g6.class);
        j2Var.mo29153a(m4145i(), C3099d5.class);
        j2Var.mo29153a(mo29805a((Semaphore) null), Throwable.class);
        j2Var.mo29153a(m4150l(), C3638r5.class);
        j2Var.mo29153a(mo29814p(), C3639r6.class);
        j2Var.mo29153a(m4141g(), C3555p3.class);
        j2Var.mo29153a(mo29810e(), C3583q1.class);
        j2Var.mo29153a(mo29809d(), C3140f1.class);
        j2Var.mo29153a(m4153n(), C3237i6.class);
        j2Var.mo29153a(mo29811f(), C3163g3.class);
        j2Var.mo29153a(m4155o(), C3563p6.class);
        j2Var.mo29153a(m4143h(), C3780x.class);
        j2Var.mo29153a(m4116a(), C3759w.class);
    }

    /* renamed from: a */
    public final C2811f<Throwable> mo29805a(Semaphore semaphore) {
        return new C3740u7(this, semaphore);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4135a(C3801y0 y0Var, Semaphore semaphore, Throwable th) {
        C12775o.m28639i(y0Var, "this$0");
        if (th != null) {
            try {
                y0Var.f2784d.mo28644b(th);
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, y0Var, C8266c.C8267a.f11649e, e, false, C3802a.f2802b, 4, (Object) null);
                if (semaphore == null) {
                    return;
                }
            } catch (Throwable th2) {
                if (semaphore != null) {
                    semaphore.release();
                }
                throw th2;
            }
        }
        if (semaphore == null) {
            return;
        }
        semaphore.release();
    }

    /* renamed from: a */
    private final void m4118a(C3319k5 k5Var) {
        C3208h5 a = k5Var.mo29201a();
        C3785x1 a2 = C3240j.f1842h.mo29060a(a.mo29008v());
        if (a2 != null) {
            a2.mo29046a(a.mo29006n());
            this.f2784d.mo28641a(a2);
        }
    }
}
