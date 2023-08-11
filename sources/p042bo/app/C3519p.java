package p042bo.app;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.appboy.Constants;
import com.braze.configuration.C4218b;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p042bo.app.C2995a4;
import p126j0.C8266c;
import p126j0.C8278g;
import p281y.C10606a;
import p336ef.C11906l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14041v0;
import p466yf.C14054y1;

/* renamed from: bo.app.p */
public final class C3519p implements C3023b2 {

    /* renamed from: s */
    public static final C3520a f2319s = new C3520a((DefaultConstructorMarker) null);

    /* renamed from: t */
    private static final String[] f2320t = {"android.os.deadsystemexception"};

    /* renamed from: a */
    private final String f2321a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3676t f2322b;

    /* renamed from: c */
    private final C3285j2 f2323c;

    /* renamed from: d */
    private final C4218b f2324d;

    /* renamed from: e */
    private final C3119e5 f2325e;

    /* renamed from: f */
    private final C3017b1 f2326f;

    /* renamed from: g */
    private boolean f2327g;

    /* renamed from: h */
    private final C3565q f2328h;

    /* renamed from: i */
    private final C3834z4 f2329i;

    /* renamed from: j */
    private final AtomicInteger f2330j = new AtomicInteger(0);

    /* renamed from: k */
    private final AtomicInteger f2331k = new AtomicInteger(0);

    /* renamed from: l */
    private final ReentrantLock f2332l = new ReentrantLock();

    /* renamed from: m */
    private final ReentrantLock f2333m = new ReentrantLock();

    /* renamed from: n */
    private C14054y1 f2334n = C13944d2.m32235b((C14054y1) null, 1, (Object) null);

    /* renamed from: o */
    private final C3781x0 f2335o;

    /* renamed from: p */
    private volatile String f2336p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final AtomicBoolean f2337q;

    /* renamed from: r */
    private Class<? extends Activity> f2338r;

    /* renamed from: bo.app.p$a */
    public static final class C3520a {
        public /* synthetic */ C3520a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3520a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final boolean m3598a(boolean z, C3785x1 x1Var) {
            if (!z) {
                return false;
            }
            if (x1Var.mo29052j() == C3040c1.PUSH_ACTION_BUTTON_CLICKED) {
                return !((C3206h4) x1Var).mo29001x();
            }
            if (x1Var.mo29052j() == C3040c1.PUSH_CLICKED || x1Var.mo29052j() == C3040c1.PUSH_STORY_PAGE_CLICK) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: bo.app.p$b */
    static final class C3521b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3521b f2339b = new C3521b();

        C3521b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "SDK is disabled. Not adding request to dispatch.";
        }
    }

    /* renamed from: bo.app.p$c */
    static final class C3522c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3522c f2340b = new C3522c();

        C3522c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "SDK is disabled. Not closing session.";
        }
    }

    /* renamed from: bo.app.p$d */
    static final class C3523d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Activity f2341b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3523d(Activity activity) {
            super(0);
            this.f2341b = activity;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Closed session with activity: ", this.f2341b.getLocalClassName());
        }
    }

    /* renamed from: bo.app.p$e */
    static final class C3524e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3524e f2342b = new C3524e();

        C3524e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "SDK is disabled. Not force closing session.";
        }
    }

    /* renamed from: bo.app.p$f */
    static final class C3525f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Throwable f2343b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3525f(Throwable th) {
            super(0);
            this.f2343b = th;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Not logging duplicate error: ", this.f2343b);
        }
    }

    /* renamed from: bo.app.p$g */
    static final class C3526g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3526g f2344b = new C3526g();

        C3526g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to log error.";
        }
    }

    /* renamed from: bo.app.p$h */
    static final class C3527h extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3785x1 f2345b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3527h(C3785x1 x1Var) {
            super(0);
            this.f2345b = x1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("SDK is disabled. Not logging event: ", this.f2345b);
        }
    }

    /* renamed from: bo.app.p$i */
    static final class C3528i extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3785x1 f2346b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3528i(C3785x1 x1Var) {
            super(0);
            this.f2346b = x1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Not processing event after validation failed: ", this.f2346b);
        }
    }

    /* renamed from: bo.app.p$j */
    static final class C3529j extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3785x1 f2347b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3529j(C3785x1 x1Var) {
            super(0);
            this.f2347b = x1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Not adding session id to event: ", C8278g.m16456j((JSONObject) this.f2347b.forJsonPut()));
        }
    }

    /* renamed from: bo.app.p$k */
    static final class C3530k extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3785x1 f2348b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3530k(C3785x1 x1Var) {
            super(0);
            this.f2348b = x1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Not adding user id to event: ", C8278g.m16456j((JSONObject) this.f2348b.forJsonPut()));
        }
    }

    /* renamed from: bo.app.p$l */
    static final class C3531l extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3785x1 f2349b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3531l(C3785x1 x1Var) {
            super(0);
            this.f2349b = x1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Attempting to log event: ", C8278g.m16456j((JSONObject) this.f2349b.forJsonPut()));
        }
    }

    /* renamed from: bo.app.p$m */
    static final class C3532m extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3532m f2350b = new C3532m();

        C3532m() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Publishing an internal push body clicked event for any awaiting triggers.";
        }
    }

    /* renamed from: bo.app.p$n */
    static final class C3533n extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3533n f2351b = new C3533n();

        C3533n() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Adding push click to dispatcher pending list";
        }
    }

    @C12739f(mo50609c = "com.braze.managers.BrazeManager$logEvent$3", mo50610f = "BrazeManager.kt", mo50611l = {237}, mo50612m = "invokeSuspend")
    /* renamed from: bo.app.p$o */
    static final class C3534o extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: b */
        int f2352b;

        /* renamed from: c */
        final /* synthetic */ C3519p f2353c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3534o(C3519p pVar, C12074d<? super C3534o> dVar) {
            super(2, dVar);
            this.f2353c = pVar;
        }

        /* renamed from: a */
        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C3534o) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C3534o(this.f2353c, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f2352b;
            if (i == 0) {
                C11910n.m25701b(obj);
                this.f2352b = 1;
                if (C14041v0.m32563a(1000, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f2353c.mo28642b();
            return C11921v.f18618a;
        }
    }

    /* renamed from: bo.app.p$p */
    static final class C3535p extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3535p f2354b = new C3535p();

        C3535p() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "SDK is disabled. Not opening session.";
        }
    }

    /* renamed from: bo.app.p$q */
    static final class C3536q extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3519p f2355b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3536q(C3519p pVar) {
            super(0);
            this.f2355b = pVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Completed the openSession call. Starting or continuing session ", this.f2355b.f2322b.mo29648g());
        }
    }

    /* renamed from: bo.app.p$r */
    static final class C3537r extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3537r f2356b = new C3537r();

        C3537r() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "SDK is disabled. Not opening session.";
        }
    }

    /* renamed from: bo.app.p$s */
    static final class C3538s extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Activity f2357b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3538s(Activity activity) {
            super(0);
            this.f2357b = activity;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Opened session with activity: ", this.f2357b.getLocalClassName());
        }
    }

    /* renamed from: bo.app.p$t */
    static final class C3539t extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3539t f2358b = new C3539t();

        C3539t() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to get local class name for activity when opening session";
        }
    }

    /* renamed from: bo.app.p$u */
    static final class C3540u extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3540u f2359b = new C3540u();

        C3540u() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Posting geofence report for geofence event.";
        }
    }

    /* renamed from: bo.app.p$v */
    static final class C3541v extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3541v f2360b = new C3541v();

        C3541v() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Posting feature flags refresh request.";
        }
    }

    /* renamed from: bo.app.p$w */
    static final class C3542w extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3542w f2361b = new C3542w();

        C3542w() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Posting geofence request for location.";
        }
    }

    /* renamed from: bo.app.p$x */
    static final class C3543x extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3519p f2362b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3543x(C3519p pVar) {
            super(0);
            this.f2362b = pVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Updated shouldRequestTriggersInNextRequest to: ", this.f2362b.f2337q);
        }
    }

    public C3519p(Context context, String str, String str2, C3676t tVar, C3285j2 j2Var, C4218b bVar, C3119e5 e5Var, C3017b1 b1Var, boolean z, C3565q qVar, C3834z4 z4Var) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str2, "apiKey");
        C12775o.m28639i(tVar, "sessionManager");
        C12775o.m28639i(j2Var, "internalEventPublisher");
        C12775o.m28639i(bVar, "configurationProvider");
        C12775o.m28639i(e5Var, "serverConfigStorageProvider");
        C12775o.m28639i(b1Var, "eventStorageManager");
        C12775o.m28639i(qVar, "messagingSessionManager");
        C12775o.m28639i(z4Var, "sdkEnablementProvider");
        this.f2321a = str;
        this.f2322b = tVar;
        this.f2323c = j2Var;
        this.f2324d = bVar;
        this.f2325e = e5Var;
        this.f2326f = b1Var;
        this.f2327g = z;
        this.f2328h = qVar;
        this.f2329i = z4Var;
        this.f2335o = new C3781x0(context, mo28631a(), str2);
        this.f2336p = "";
        this.f2337q = new AtomicBoolean(false);
    }

    /* renamed from: c */
    public boolean mo28646c() {
        return this.f2337q.get();
    }

    public void closeSession(Activity activity) {
        C12775o.m28639i(activity, "activity");
        if (this.f2329i.mo29850a()) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C3522c.f2340b, 6, (Object) null);
        } else if (this.f2338r == null || C12775o.m28634d(activity.getClass(), this.f2338r)) {
            this.f2328h.mo29514c();
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3523d(activity), 6, (Object) null);
            this.f2322b.mo29654o();
        }
    }

    /* renamed from: d */
    public void mo28648d() {
        if (this.f2329i.mo29850a()) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C3535p.f2354b, 6, (Object) null);
            return;
        }
        this.f2322b.mo29652m();
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C3536q(this), 6, (Object) null);
    }

    /* renamed from: e */
    public void mo28649e() {
        if (this.f2329i.mo29850a()) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C3524e.f2342b, 6, (Object) null);
            return;
        }
        this.f2338r = null;
        this.f2322b.mo29651l();
    }

    /* renamed from: f */
    public C3289j5 mo29463f() {
        return this.f2322b.mo29648g();
    }

    public void openSession(Activity activity) {
        C12775o.m28639i(activity, "activity");
        if (this.f2329i.mo29850a()) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C3537r.f2356b, 6, (Object) null);
            return;
        }
        mo28648d();
        this.f2338r = activity.getClass();
        this.f2328h.mo29513b();
        try {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3538s(activity), 6, (Object) null);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3539t.f2358b, 4, (Object) null);
        }
    }

    public void refreshFeatureFlags() {
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3541v.f2360b, 7, (Object) null);
        mo28635a((C3042c2) new C3159g1(this.f2324d.getBaseUrlForRequests()));
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    private final boolean m3575c(Throwable th) {
        ReentrantLock reentrantLock = this.f2333m;
        reentrantLock.lock();
        try {
            this.f2330j.getAndIncrement();
            if (!C12775o.m28634d(this.f2336p, th.getMessage()) || this.f2331k.get() <= 3 || this.f2330j.get() >= 100) {
                if (C12775o.m28634d(this.f2336p, th.getMessage())) {
                    this.f2331k.getAndIncrement();
                } else {
                    this.f2331k.set(0);
                }
                if (this.f2330j.get() >= 100) {
                    this.f2330j.set(0);
                }
                this.f2336p = th.getMessage();
                reentrantLock.unlock();
                return false;
            }
            reentrantLock.unlock();
            return true;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* renamed from: a */
    public String mo28631a() {
        return this.f2321a;
    }

    /* renamed from: b */
    public void mo28645b(boolean z) {
        this.f2327g = z;
    }

    /* renamed from: a */
    public void mo28640a(boolean z) {
        this.f2337q.set(z);
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3543x(this), 6, (Object) null);
    }

    /* renamed from: b */
    public void mo28644b(Throwable th) {
        C12775o.m28639i(th, "throwable");
        mo29462a(th, true);
    }

    /* renamed from: b */
    public void mo28642b() {
        mo28634a(new C2995a4.C2996a((String) null, (Boolean) null, (Boolean) null, (C3832z3) null, 15, (DefaultConstructorMarker) null));
    }

    /* renamed from: a */
    public boolean mo28641a(C3785x1 x1Var) {
        boolean z;
        C3785x1 x1Var2 = x1Var;
        C12775o.m28639i(x1Var2, NotificationCompat.CATEGORY_EVENT);
        boolean z2 = false;
        if (this.f2329i.mo29850a()) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C3527h(x1Var2), 6, (Object) null);
            return false;
        }
        ReentrantLock reentrantLock = this.f2332l;
        reentrantLock.lock();
        try {
            if (!this.f2335o.mo29787a(x1Var2)) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C3528i(x1Var2), 6, (Object) null);
                return false;
            }
            if (this.f2322b.mo29650j() || this.f2322b.mo29648g() == null) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3529j(x1Var2), 7, (Object) null);
                z = true;
            } else {
                x1Var2.mo29046a(this.f2322b.mo29648g());
                z = false;
            }
            String a = mo28631a();
            if (a == null || a.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                x1Var2.mo29047a(mo28631a());
            } else {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3530k(x1Var2), 7, (Object) null);
            }
            C8266c cVar = C8266c.f11641a;
            C8266c.m16396e(cVar, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3531l(x1Var2), 6, (Object) null);
            if (x1Var.mo29052j() == C3040c1.PUSH_CLICKED) {
                C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C3532m.f2350b, 7, (Object) null);
                mo29461a((C3317k4) x1Var2);
            }
            if (!x1Var.mo29048d()) {
                this.f2326f.mo28624a(x1Var2);
            }
            Class<C3497o0> cls = C3497o0.class;
            if (f2319s.m3598a(z, x1Var2)) {
                C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C3533n.f2351b, 7, (Object) null);
                this.f2323c.mo29152a(C3497o0.f2278e.mo29433b(x1Var2), cls);
            } else {
                this.f2323c.mo29152a(C3497o0.f2278e.mo29432a(x1Var2), cls);
            }
            if (x1Var.mo29052j() == C3040c1.SESSION_START) {
                this.f2323c.mo29152a(C3497o0.f2278e.mo29431a(x1Var.mo29054n()), cls);
            }
            C11921v vVar = C11921v.f18618a;
            reentrantLock.unlock();
            if (z) {
                C14054y1.C14055a.m32600a(this.f2334n, (CancellationException) null, 1, (Object) null);
                this.f2334n = C13985j.m32422d(C10606a.f16162b, (C12079g) null, (C14004n0) null, new C3534o(this, (C12074d<? super C3534o>) null), 3, (Object) null);
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    public void mo28643b(C3785x1 x1Var) {
        C12775o.m28639i(x1Var, "geofenceEvent");
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3540u.f2359b, 7, (Object) null);
        mo28635a((C3042c2) new C3459n1(this.f2324d.getBaseUrlForRequests(), x1Var));
    }

    /* renamed from: a */
    public void mo28638a(Throwable th) {
        C12775o.m28639i(th, "throwable");
        mo29462a(th, false);
    }

    /* renamed from: a */
    public void mo28634a(C2995a4.C2996a aVar) {
        C12775o.m28639i(aVar, "respondWithBuilder");
        C11906l<Long, Boolean> a = this.f2325e.mo28858a();
        if (a != null) {
            aVar.mo28592a(new C3832z3(a.mo49111c().longValue(), a.mo49112d().booleanValue()));
        }
        if (this.f2337q.get()) {
            aVar.mo28600c();
        }
        aVar.mo28595a(mo28631a());
        mo28635a((C3042c2) new C3216i0(this.f2324d.getBaseUrlForRequests(), aVar.mo28593a()));
        this.f2337q.set(false);
    }

    /* renamed from: a */
    public void mo28633a(C2993a2 a2Var) {
        C12775o.m28639i(a2Var, "location");
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3542w.f2361b, 7, (Object) null);
        mo28635a((C3042c2) new C3425m1(this.f2324d.getBaseUrlForRequests(), a2Var));
    }

    /* renamed from: a */
    public void mo28635a(C3042c2 c2Var) {
        C12775o.m28639i(c2Var, "request");
        if (this.f2329i.mo29850a()) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C3521b.f2339b, 6, (Object) null);
            return;
        }
        this.f2323c.mo29152a(C3497o0.f2278e.mo29430a(c2Var), C3497o0.class);
    }

    /* renamed from: a */
    public void mo28637a(C3790x5 x5Var, C3766w2 w2Var) {
        C12775o.m28639i(x5Var, "templatedTriggeredAction");
        C12775o.m28639i(w2Var, "triggerEvent");
        mo28635a((C3042c2) new C3771w5(this.f2324d.getBaseUrlForRequests(), x5Var, w2Var, this, mo28631a()));
    }

    /* renamed from: a */
    public void mo28636a(C3766w2 w2Var) {
        C12775o.m28639i(w2Var, "triggerEvent");
        this.f2323c.mo29152a(new C3237i6(w2Var), C3237i6.class);
    }

    /* renamed from: a */
    public void mo28639a(List<String> list, long j) {
        C12775o.m28639i(list, "deviceLogs");
        mo28635a((C3042c2) new C3000a6(this.f2324d.getBaseUrlForRequests(), list, j, mo28631a()));
    }

    /* renamed from: a */
    public void mo28632a(long j, long j2, int i) {
        mo28635a((C3042c2) new C3012b0(this.f2324d.getBaseUrlForRequests(), j, j2, mo28631a(), i));
    }

    /* renamed from: a */
    public final void mo29462a(Throwable th, boolean z) {
        C12775o.m28639i(th, "throwable");
        try {
            if (m3575c(th)) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C3525f(th), 6, (Object) null);
                return;
            }
            String th2 = th.toString();
            String[] strArr = f2320t;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                i++;
                Locale locale = Locale.US;
                C12775o.m28638h(locale, "US");
                String lowerCase = th2.toLowerCase(locale);
                C12775o.m28638h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (C13755w.m31552J(lowerCase, str, false, 2, (Object) null)) {
                    return;
                }
            }
            C3785x1 a = C3240j.f1842h.mo29073a(th, mo29463f(), z);
            if (a != null) {
                mo28641a(a);
            }
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3526g.f2344b, 4, (Object) null);
        }
    }

    /* renamed from: a */
    public final void mo29461a(C3317k4 k4Var) {
        C12775o.m28639i(k4Var, "notificationTrackingBrazeEvent");
        String optString = k4Var.mo29053k().optString(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY, "");
        C3285j2 j2Var = this.f2323c;
        C12775o.m28638h(optString, "campaignId");
        j2Var.mo29152a(new C3166g6(optString, k4Var), C3166g6.class);
    }
}
