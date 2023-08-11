package p042bo.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p031b0.C2816k;
import p126j0.C8266c;
import p126j0.C8273e;
import p126j0.C8275f;
import p270x.C10156b;
import p281y.C10606a;
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

/* renamed from: bo.app.t */
public final class C3676t {

    /* renamed from: l */
    public static final C3677a f2561l = new C3677a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final long f2562m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final long f2563n;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f2564a;

    /* renamed from: b */
    private final C3699t2 f2565b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3285j2 f2566c;

    /* renamed from: d */
    private final C3285j2 f2567d;

    /* renamed from: e */
    private final AlarmManager f2568e;

    /* renamed from: f */
    private final int f2569f;

    /* renamed from: g */
    private final boolean f2570g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ReentrantLock f2571h = new ReentrantLock();

    /* renamed from: i */
    private final String f2572i;

    /* renamed from: j */
    private C14054y1 f2573j = C13944d2.m32235b((C14054y1) null, 1, (Object) null);

    /* renamed from: k */
    private C3585q3 f2574k;

    /* renamed from: bo.app.t$a */
    public static final class C3677a {
        public /* synthetic */ C3677a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo29655a() {
            return C3676t.f2563n;
        }

        private C3677a() {
        }

        /* renamed from: a */
        public final boolean mo29657a(double d, double d2, int i, boolean z) {
            long h = C8273e.m16435h();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis((long) i);
            return !z ? timeUnit.toMillis((long) d2) + millis <= h : (timeUnit.toMillis((long) d) + millis) + mo29655a() <= h;
        }

        /* renamed from: a */
        public final long mo29656a(C3585q3 q3Var, int i, boolean z) {
            C12775o.m28639i(q3Var, "mutableSession");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis((long) i);
            if (!z) {
                return millis;
            }
            long millis2 = timeUnit.toMillis((long) q3Var.mo29010x());
            return Math.max(mo29655a(), (millis2 + millis) - C8273e.m16435h());
        }
    }

    /* renamed from: bo.app.t$b */
    static final class C3678b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3678b f2575b = new C3678b();

        C3678b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cancelling session seal alarm";
        }
    }

    /* renamed from: bo.app.t$c */
    static final class C3679c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3679c f2576b = new C3679c();

        C3679c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to cancel session seal alarm";
        }
    }

    /* renamed from: bo.app.t$d */
    static final class C3680d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ long f2577b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3680d(long j) {
            super(0);
            this.f2577b = j;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Creating a session seal alarm with a delay of " + this.f2577b + " ms";
        }
    }

    /* renamed from: bo.app.t$e */
    static final class C3681e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3681e f2578b = new C3681e();

        C3681e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to create session seal alarm";
        }
    }

    /* renamed from: bo.app.t$f */
    static final class C3682f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3585q3 f2579b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3682f(C3585q3 q3Var) {
            super(0);
            this.f2579b = q3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Clearing completely dispatched sealed session ", this.f2579b.mo29006n());
        }
    }

    /* renamed from: bo.app.t$g */
    static final class C3683g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3585q3 f2580b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3683g(C3585q3 q3Var) {
            super(0);
            this.f2580b = q3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("New session created with ID: ", this.f2580b.mo29006n());
        }
    }

    /* renamed from: bo.app.t$h */
    static final class C3684h extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3684h f2581b = new C3684h();

        C3684h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Getting the stored open session";
        }
    }

    /* renamed from: bo.app.t$i */
    static final class C3685i extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3585q3 f2582b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3685i(C3585q3 q3Var) {
            super(0);
            this.f2582b = q3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Checking if this session needs to be sealed: ", this.f2582b.mo29006n());
        }
    }

    /* renamed from: bo.app.t$j */
    static final class C3686j extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3585q3 f2583b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3686j(C3585q3 q3Var) {
            super(0);
            this.f2583b = q3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Session [" + this.f2583b.mo29006n() + "] being sealed because its end time is over the grace period. Session: " + this.f2583b;
        }
    }

    /* renamed from: bo.app.t$k */
    public static final class C3687k extends BroadcastReceiver {

        /* renamed from: a */
        final /* synthetic */ C3676t f2584a;

        /* renamed from: bo.app.t$k$a */
        static final class C3688a extends C12777p implements C13074a<String> {

            /* renamed from: b */
            public static final C3688a f2585b = new C3688a();

            C3688a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Session seal logic executing in broadcast";
            }
        }

        @C12739f(mo50609c = "com.braze.managers.BrazeSessionManager$sessionSealReceiver$1$onReceive$2", mo50610f = "BrazeSessionManager.kt", mo50611l = {}, mo50612m = "invokeSuspend")
        /* renamed from: bo.app.t$k$b */
        static final class C3689b extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

            /* renamed from: b */
            int f2586b;

            /* renamed from: c */
            private /* synthetic */ Object f2587c;

            /* renamed from: d */
            final /* synthetic */ C3676t f2588d;

            /* renamed from: e */
            final /* synthetic */ BroadcastReceiver.PendingResult f2589e;

            /* renamed from: bo.app.t$k$b$a */
            static final class C3690a extends C12777p implements C13074a<String> {

                /* renamed from: b */
                public static final C3690a f2590b = new C3690a();

                C3690a() {
                    super(0);
                }

                /* renamed from: a */
                public final String invoke() {
                    return "Failed to log throwable during seal session.";
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3689b(C3676t tVar, BroadcastReceiver.PendingResult pendingResult, C12074d<? super C3689b> dVar) {
                super(2, dVar);
                this.f2588d = tVar;
                this.f2589e = pendingResult;
            }

            /* renamed from: a */
            public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
                return ((C3689b) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
            }

            public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                C3689b bVar = new C3689b(this.f2588d, this.f2589e, dVar);
                bVar.f2587c = obj;
                return bVar;
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|9|10) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object unused = p362if.C12150d.m26492c()
                    int r0 = r8.f2586b
                    if (r0 != 0) goto L_0x0048
                    p336ef.C11910n.m25701b(r9)
                    java.lang.Object r9 = r8.f2587c
                    r1 = r9
                    yf.l0 r1 = (p466yf.C13995l0) r1
                    bo.app.t r9 = r8.f2588d
                    java.util.concurrent.locks.ReentrantLock r9 = r9.f2571h
                    bo.app.t r0 = r8.f2588d
                    r9.lock()
                    r0.m3872k()     // Catch:{ Exception -> 0x0020 }
                    goto L_0x0037
                L_0x001e:
                    r0 = move-exception
                    goto L_0x0044
                L_0x0020:
                    r3 = move-exception
                    bo.app.j2 r0 = r0.f2566c     // Catch:{ Exception -> 0x002b }
                    java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
                    r0.mo29152a(r3, r2)     // Catch:{ Exception -> 0x002b }
                    goto L_0x0037
                L_0x002b:
                    j0.c r0 = p126j0.C8266c.f11641a     // Catch:{ all -> 0x001e }
                    j0.c$a r2 = p126j0.C8266c.C8267a.f11649e     // Catch:{ all -> 0x001e }
                    r4 = 0
                    bo.app.t$k$b$a r5 = p042bo.app.C3676t.C3687k.C3689b.C3690a.f2590b     // Catch:{ all -> 0x001e }
                    r6 = 4
                    r7 = 0
                    p126j0.C8266c.m16396e(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x001e }
                L_0x0037:
                    ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x001e }
                    r9.unlock()
                    android.content.BroadcastReceiver$PendingResult r9 = r8.f2589e
                    r9.finish()
                    ef.v r9 = p336ef.C11921v.f18618a
                    return r9
                L_0x0044:
                    r9.unlock()
                    throw r0
                L_0x0048:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3676t.C3687k.C3689b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        C3687k(C3676t tVar) {
            this.f2584a = tVar;
        }

        public void onReceive(Context context, Intent intent) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(intent, "intent");
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, C3688a.f2585b, 6, (Object) null);
            C14054y1 unused = C13985j.m32422d(C10606a.f16162b, (C12079g) null, (C14004n0) null, new C3689b(this.f2584a, goAsync(), (C12074d<? super C3689b>) null), 3, (Object) null);
        }
    }

    @C12739f(mo50609c = "com.braze.managers.BrazeSessionManager$startSessionStopFlushTimer$1", mo50610f = "BrazeSessionManager.kt", mo50611l = {328}, mo50612m = "invokeSuspend")
    /* renamed from: bo.app.t$l */
    static final class C3691l extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: b */
        int f2591b;

        /* renamed from: c */
        private /* synthetic */ Object f2592c;

        /* renamed from: d */
        final /* synthetic */ C3676t f2593d;

        /* renamed from: bo.app.t$l$a */
        static final class C3692a extends C12777p implements C13074a<String> {

            /* renamed from: b */
            public static final C3692a f2594b = new C3692a();

            C3692a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Requesting data flush on internal session close flush timer.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3691l(C3676t tVar, C12074d<? super C3691l> dVar) {
            super(2, dVar);
            this.f2593d = tVar;
        }

        /* renamed from: a */
        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C3691l) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C3691l lVar = new C3691l(this.f2593d, dVar);
            lVar.f2592c = obj;
            return lVar;
        }

        public final Object invokeSuspend(Object obj) {
            C13995l0 l0Var;
            Object c = C12150d.m26492c();
            int i = this.f2591b;
            if (i == 0) {
                C11910n.m25701b(obj);
                C13995l0 l0Var2 = (C13995l0) this.f2592c;
                long a = C3676t.f2562m;
                this.f2592c = l0Var2;
                this.f2591b = 1;
                if (C14041v0.m32563a(a, this) == c) {
                    return c;
                }
                l0Var = l0Var2;
            } else if (i == 1) {
                C11910n.m25701b(obj);
                l0Var = (C13995l0) this.f2592c;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C8266c.m16396e(C8266c.f11641a, l0Var, (C8266c.C8267a) null, (Throwable) null, false, C3692a.f2594b, 7, (Object) null);
            C10156b.f15345m.mo44811g(this.f2593d.f2564a).mo44795l0();
            return C11921v.f18618a;
        }
    }

    /* renamed from: bo.app.t$m */
    static final class C3693m extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3585q3 f2595b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3693m(C3585q3 q3Var) {
            super(0);
            this.f2595b = q3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Closed session with id ", this.f2595b.mo29006n());
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f2562m = timeUnit.toMillis(10);
        f2563n = timeUnit.toMillis(10);
    }

    public C3676t(Context context, C3699t2 t2Var, C3285j2 j2Var, C3285j2 j2Var2, AlarmManager alarmManager, int i, boolean z) {
        C12775o.m28639i(context, "applicationContext");
        C12775o.m28639i(t2Var, "sessionStorageManager");
        C12775o.m28639i(j2Var, "internalEventPublisher");
        C12775o.m28639i(j2Var2, "externalEventPublisher");
        C12775o.m28639i(alarmManager, "alarmManager");
        this.f2564a = context;
        this.f2565b = t2Var;
        this.f2566c = j2Var;
        this.f2567d = j2Var2;
        this.f2568e = alarmManager;
        this.f2569f = i;
        this.f2570g = z;
        C3687k kVar = new C3687k(this);
        String q = C12775o.m28647q(context.getPackageName(), ".intent.BRAZE_SESSION_SHOULD_SEAL");
        this.f2572i = q;
        if (Build.VERSION.SDK_INT >= 33) {
            Intent unused = context.registerReceiver(kVar, new IntentFilter(q), 4);
        } else {
            context.registerReceiver(kVar, new IntentFilter(q));
        }
    }

    /* renamed from: e */
    private final void m3869e() {
        C3585q3 q3Var = this.f2574k;
        if (q3Var != null) {
            long a = f2561l.mo29656a(q3Var, this.f2569f, this.f2570g);
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3680d(a), 7, (Object) null);
            try {
                Intent intent = new Intent(this.f2572i);
                intent.putExtra("session_id", q3Var.toString());
                this.f2568e.set(1, C8273e.m16435h() + a, PendingIntent.getBroadcast(this.f2564a, 0, intent, C8275f.m16441b() | BasicMeasure.EXACTLY));
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3681e.f2578b, 4, (Object) null);
            }
        }
    }

    /* renamed from: f */
    private final boolean m3870f() {
        ReentrantLock reentrantLock = this.f2571h;
        reentrantLock.lock();
        try {
            m3872k();
            C3585q3 h = mo29649h();
            boolean z = false;
            if (h != null) {
                if (!h.mo29011y()) {
                    if (h.mo29009w() != null) {
                        h.mo29003a((Double) null);
                        z = true;
                    }
                    return z;
                }
            }
            m3871i();
            if (h != null) {
                if (h.mo29011y()) {
                    z = true;
                }
            }
            if (z) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3682f(h), 7, (Object) null);
                this.f2565b.mo29503a(h.mo29006n().toString());
            }
            z = true;
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: i */
    private final void m3871i() {
        C3585q3 q3Var = new C3585q3((C3289j5) null, 0.0d, (Double) null, false, 15, (DefaultConstructorMarker) null);
        this.f2574k = q3Var;
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C3683g(q3Var), 6, (Object) null);
        this.f2566c.mo29152a(new C3236i5(q3Var), C3236i5.class);
        this.f2567d.mo29152a(new C2816k(q3Var.mo29006n().toString(), C2816k.C2817a.SESSION_STARTED), C2816k.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m3872k() {
        C3289j5 j5Var;
        C3585q3 q3Var;
        ReentrantLock reentrantLock = this.f2571h;
        reentrantLock.lock();
        try {
            if (mo29649h() == null) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3684h.f2581b, 7, (Object) null);
                C3208h5 a = this.f2565b.mo29501a();
                if (a == null) {
                    q3Var = null;
                } else {
                    q3Var = a.mo29012z();
                }
                mo29646a(q3Var);
            }
            C3585q3 h = mo29649h();
            if (h != null) {
                C8266c cVar = C8266c.f11641a;
                C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, new C3685i(h), 7, (Object) null);
                Double w = h.mo29009w();
                if (w != null && !h.mo29011y()) {
                    if (f2561l.mo29657a(h.mo29010x(), w.doubleValue(), this.f2569f, this.f2570g)) {
                        C8266c.m16396e(cVar, this, C8266c.C8267a.I, (Throwable) null, false, new C3686j(h), 6, (Object) null);
                        mo29651l();
                        C3699t2 t2Var = this.f2565b;
                        C3585q3 h2 = mo29649h();
                        if (h2 == null) {
                            j5Var = null;
                        } else {
                            j5Var = h2.mo29006n();
                        }
                        t2Var.mo29503a(String.valueOf(j5Var));
                        mo29646a((C3585q3) null);
                    }
                }
                C11921v vVar = C11921v.f18618a;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: g */
    public final C3289j5 mo29648g() {
        C3289j5 j5Var;
        ReentrantLock reentrantLock = this.f2571h;
        reentrantLock.lock();
        try {
            m3872k();
            C3585q3 h = mo29649h();
            if (h == null) {
                j5Var = null;
            } else {
                j5Var = h.mo29006n();
            }
            return j5Var;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: h */
    public final C3585q3 mo29649h() {
        return this.f2574k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r1.mo29011y() == true) goto L_0x0015;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo29650j() {
        /*
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.f2571h
            r0.lock()
            bo.app.q3 r1 = r3.mo29649h()     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x000c
            goto L_0x0014
        L_0x000c:
            boolean r1 = r1.mo29011y()     // Catch:{ all -> 0x0019 }
            r2 = 1
            if (r1 != r2) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            r0.unlock()
            return r2
        L_0x0019:
            r1 = move-exception
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3676t.mo29650j():boolean");
    }

    /* renamed from: l */
    public final void mo29651l() {
        C3585q3 q3Var = this.f2574k;
        if (q3Var != null) {
            ReentrantLock reentrantLock = this.f2571h;
            reentrantLock.lock();
            try {
                q3Var.mo29543A();
                this.f2565b.mo29502a((C3208h5) q3Var);
                this.f2566c.mo29152a(new C3319k5(q3Var), C3319k5.class);
                this.f2567d.mo29152a(new C2816k(q3Var.mo29006n().toString(), C2816k.C2817a.SESSION_ENDED), C2816k.class);
                C11921v vVar = C11921v.f18618a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: m */
    public final void mo29652m() {
        ReentrantLock reentrantLock = this.f2571h;
        reentrantLock.lock();
        try {
            if (m3870f()) {
                C3585q3 h = mo29649h();
                if (h != null) {
                    this.f2565b.mo29502a((C3208h5) h);
                }
            }
            mo29647d();
            m3867c();
            this.f2566c.mo29152a(C3399l5.f2112b, C3399l5.class);
            C11921v vVar = C11921v.f18618a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: n */
    public final void mo29653n() {
        C14054y1.C14055a.m32600a(this.f2573j, (CancellationException) null, 1, (Object) null);
        this.f2573j = C13985j.m32422d(C10606a.f16162b, (C12079g) null, (C14004n0) null, new C3691l(this, (C12074d<? super C3691l>) null), 3, (Object) null);
    }

    /* renamed from: o */
    public final void mo29654o() {
        ReentrantLock reentrantLock = this.f2571h;
        reentrantLock.lock();
        try {
            m3870f();
            C3585q3 h = mo29649h();
            if (h != null) {
                h.mo29003a(Double.valueOf(C8273e.m16437j()));
                this.f2565b.mo29502a((C3208h5) h);
                mo29653n();
                m3869e();
                this.f2566c.mo29152a(C3466n5.f2240b, C3466n5.class);
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3693m(h), 7, (Object) null);
                C11921v vVar = C11921v.f18618a;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: c */
    private final void m3867c() {
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3678b.f2575b, 7, (Object) null);
        try {
            Intent intent = new Intent(this.f2572i);
            intent.putExtra("session_id", String.valueOf(this.f2574k));
            this.f2568e.cancel(PendingIntent.getBroadcast(this.f2564a, 0, intent, C8275f.m16441b() | BasicMeasure.EXACTLY));
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3679c.f2576b, 4, (Object) null);
        }
    }

    /* renamed from: d */
    public final void mo29647d() {
        C14054y1.C14055a.m32600a(this.f2573j, (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: a */
    public final void mo29646a(C3585q3 q3Var) {
        this.f2574k = q3Var;
    }
}
