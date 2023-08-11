package p042bo.app;

import androidx.core.app.NotificationCompat;
import com.appboy.Constants;
import com.braze.configuration.C4218b;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p126j0.C8273e;
import p126j0.C8278g;
import p270x.C10156b;
import p308ag.C10886a;
import p308ag.C10894d;
import p308ag.C10898g;
import p308ag.C10899h;
import p355hf.C12074d;
import p404of.C13074a;

/* renamed from: bo.app.q0 */
public final class C3571q0 implements C3203h2 {

    /* renamed from: j */
    public static final C3572a f2398j = new C3572a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C3704t6 f2399a;

    /* renamed from: b */
    private final C3141f2 f2400b;

    /* renamed from: c */
    private final C4218b f2401c;

    /* renamed from: d */
    private final C3814y4 f2402d;

    /* renamed from: e */
    private final C2998a5 f2403e;

    /* renamed from: f */
    private final C10894d<C3042c2> f2404f = C10898g.m23419b(1000, (C10886a) null, (Function1) null, 6, (Object) null);

    /* renamed from: g */
    private final ConcurrentHashMap<String, C3785x1> f2405g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private final ConcurrentHashMap<String, C3785x1> f2406h = new ConcurrentHashMap<>();

    /* renamed from: i */
    private final AtomicInteger f2407i = new AtomicInteger(0);

    /* renamed from: bo.app.q0$a */
    public static final class C3572a {

        /* renamed from: bo.app.q0$a$a */
        static final class C3573a extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ C3814y4 f2408b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3573a(C3814y4 y4Var) {
                super(0);
                this.f2408b = y4Var;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Adding SDK Auth token to request '" + this.f2408b.mo29828a() + '\'';
            }
        }

        /* renamed from: bo.app.q0$a$b */
        static final class C3574b extends C12777p implements C13074a<String> {

            /* renamed from: b */
            public static final C3574b f2409b = new C3574b();

            C3574b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "SDK Auth is disabled, not adding token to request";
            }
        }

        public /* synthetic */ C3572a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo29529a(C3141f2 f2Var, C4218b bVar, C3814y4 y4Var, C3042c2 c2Var) {
            C12775o.m28639i(f2Var, "deviceDataProvider");
            C12775o.m28639i(bVar, "configurationProvider");
            C12775o.m28639i(y4Var, "sdkAuthenticationCache");
            C12775o.m28639i(c2Var, "brazeRequest");
            String deviceId = f2Var.getDeviceId();
            if (deviceId != null) {
                c2Var.mo28690b(deviceId);
            }
            c2Var.mo28698f(bVar.getBrazeApiKey().toString());
            c2Var.mo28699g(Constants.APPBOY_SDK_VERSION);
            c2Var.mo28688a(Long.valueOf(C8273e.m16436i()));
            if (bVar.isSdkAuthenticationEnabled()) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3573a(y4Var), 6, (Object) null);
                c2Var.mo28694d(y4Var.mo29828a());
                return;
            }
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, C3574b.f2409b, 6, (Object) null);
        }

        private C3572a() {
        }
    }

    /* renamed from: bo.app.q0$b */
    static final class C3575b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3575b f2410b = new C3575b();

        C3575b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Network requests are offline, not adding request to queue.";
        }
    }

    /* renamed from: bo.app.q0$c */
    static final class C3576c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3042c2 f2411b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3576c(C3042c2 c2Var) {
            super(0);
            this.f2411b = c2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("A maximum of 5 invalid api key errors reached. Device data will remain unaffected after dropping this request ", this.f2411b);
        }
    }

    /* renamed from: bo.app.q0$d */
    static final class C3577d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2412b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3577d(String str) {
            super(0);
            this.f2412b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Added request to dispatcher with parameters: \n", this.f2412b);
        }
    }

    /* renamed from: bo.app.q0$e */
    static final class C3578e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2413b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3578e(String str) {
            super(0);
            this.f2413b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Could not add request to dispatcher as queue is full or closed. Marking as complete. Incoming Request: \n", this.f2413b);
        }
    }

    /* renamed from: bo.app.q0$f */
    static final class C3579f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3785x1 f2414b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3579f(C3785x1 x1Var) {
            super(0);
            this.f2414b = x1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Event dispatched: " + this.f2414b.forJsonPut() + " with uid: " + this.f2414b.mo29055r();
        }
    }

    /* renamed from: bo.app.q0$g */
    static final class C3580g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3580g f2415b = new C3580g();

        C3580g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Max number of events per dispatch reached: 32 . No more events will be included in this dispatch";
        }
    }

    /* renamed from: bo.app.q0$h */
    static final class C3581h extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3581h f2416b = new C3581h();

        C3581h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Flushing pending events to dispatcher map";
        }
    }

    @C12739f(mo50609c = "com.braze.dispatch.DispatchManager", mo50610f = "DispatchManager.kt", mo50611l = {168}, mo50612m = "takeRequest")
    /* renamed from: bo.app.q0$i */
    static final class C3582i extends C12737d {

        /* renamed from: b */
        Object f2417b;

        /* renamed from: c */
        /* synthetic */ Object f2418c;

        /* renamed from: d */
        final /* synthetic */ C3571q0 f2419d;

        /* renamed from: e */
        int f2420e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3582i(C3571q0 q0Var, C12074d<? super C3582i> dVar) {
            super(dVar);
            this.f2419d = q0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f2418c = obj;
            this.f2420e |= Integer.MIN_VALUE;
            return this.f2419d.mo29520a((C12074d<? super C3042c2>) this);
        }
    }

    public C3571q0(C3704t6 t6Var, C3141f2 f2Var, C4218b bVar, C3814y4 y4Var, C2998a5 a5Var, C3285j2 j2Var) {
        C12775o.m28639i(t6Var, "userCache");
        C12775o.m28639i(f2Var, "deviceDataProvider");
        C12775o.m28639i(bVar, "configurationProvider");
        C12775o.m28639i(y4Var, "sdkAuthenticationCache");
        C12775o.m28639i(a5Var, "sdkMetadataCache");
        C12775o.m28639i(j2Var, "internalEventPublisher");
        this.f2399a = t6Var;
        this.f2400b = f2Var;
        this.f2401c = bVar;
        this.f2402d = y4Var;
        this.f2403e = a5Var;
        j2Var.mo29153a(new C3403l7(this), C3316k3.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m3656a(C3571q0 q0Var, C3316k3 k3Var) {
        C12775o.m28639i(q0Var, "this$0");
        C12775o.m28639i(k3Var, "it");
        q0Var.f2407i.incrementAndGet();
    }

    /* renamed from: c */
    public final boolean mo29527c() {
        return C10156b.f15345m.mo44812h();
    }

    /* renamed from: d */
    public final C3042c2 mo29528d() {
        C3042c2 c2Var = (C3042c2) C10899h.m23425f(this.f2404f.mo45885d());
        if (c2Var == null) {
            return null;
        }
        mo29524b(c2Var);
        return c2Var;
    }

    /* renamed from: a */
    public final synchronized C3294k mo29519a() {
        LinkedHashSet linkedHashSet;
        Collection<C3785x1> values = this.f2405g.values();
        C12775o.m28638h(values, "brazeEventMap.values");
        linkedHashSet = new LinkedHashSet();
        Iterator<C3785x1> it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C3785x1 next = it.next();
            C12775o.m28638h(next, NotificationCompat.CATEGORY_EVENT);
            linkedHashSet.add(next);
            values.remove(next);
            C8266c cVar = C8266c.f11641a;
            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, new C3579f(next), 7, (Object) null);
            if (linkedHashSet.size() >= 32) {
                C8266c.m16396e(cVar, this, C8266c.C8267a.I, (Throwable) null, false, C3580g.f2415b, 6, (Object) null);
                break;
            }
        }
        return new C3294k(linkedHashSet);
    }

    /* renamed from: b */
    public synchronized void mo29525b(C3785x1 x1Var) {
        C12775o.m28639i(x1Var, NotificationCompat.CATEGORY_EVENT);
        this.f2406h.putIfAbsent(x1Var.mo29055r(), x1Var);
    }

    /* renamed from: b */
    public final boolean mo29526b() {
        return !this.f2404f.isEmpty();
    }

    /* renamed from: b */
    public final synchronized C3042c2 mo29524b(C3042c2 c2Var) {
        C12775o.m28639i(c2Var, "brazeRequest");
        c2Var.mo28605a(this.f2399a.mo29701f());
        f2398j.mo29529a(this.f2400b, this.f2401c, this.f2402d, c2Var);
        if (c2Var.mo28607g()) {
            mo29521a(c2Var);
        }
        return c2Var;
    }

    /* renamed from: a */
    public synchronized void mo29523a(C3289j5 j5Var) {
        C12775o.m28639i(j5Var, "sessionId");
        if (!this.f2406h.isEmpty()) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3581h.f2416b, 7, (Object) null);
            Collection<C3785x1> values = this.f2406h.values();
            C12775o.m28638h(values, "pendingBrazeEventMap.values");
            for (C3785x1 a : values) {
                a.mo29046a(j5Var);
            }
            this.f2405g.putAll(this.f2406h);
            this.f2406h.clear();
        }
    }

    /* renamed from: a */
    public synchronized void mo28894a(C3785x1 x1Var) {
        C12775o.m28639i(x1Var, NotificationCompat.CATEGORY_EVENT);
        this.f2405g.putIfAbsent(x1Var.mo29055r(), x1Var);
    }

    /* renamed from: a */
    public void mo29522a(C3285j2 j2Var, C3042c2 c2Var) {
        C12775o.m28639i(j2Var, "internalEventPublisher");
        C12775o.m28639i(c2Var, "request");
        if (mo29527c()) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C3575b.f2410b, 6, (Object) null);
        } else if (this.f2407i.get() >= 5) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C3576c(c2Var), 6, (Object) null);
        } else {
            String j = C8278g.m16456j(c2Var.mo28608l());
            c2Var.mo29435a(j2Var);
            if (C10899h.m23428i(this.f2404f.mo45894m(c2Var))) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3577d(j), 6, (Object) null);
                return;
            }
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, (Throwable) null, false, new C3578e(j), 6, (Object) null);
            c2Var.mo29438b(j2Var);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo29520a(p355hf.C12074d<? super p042bo.app.C3042c2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p042bo.app.C3571q0.C3582i
            if (r0 == 0) goto L_0x0013
            r0 = r5
            bo.app.q0$i r0 = (p042bo.app.C3571q0.C3582i) r0
            int r1 = r0.f2420e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f2420e = r1
            goto L_0x0018
        L_0x0013:
            bo.app.q0$i r0 = new bo.app.q0$i
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f2418c
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.f2420e
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f2417b
            bo.app.q0 r0 = (p042bo.app.C3571q0) r0
            p336ef.C11910n.m25701b(r5)
            goto L_0x0046
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            p336ef.C11910n.m25701b(r5)
            ag.d<bo.app.c2> r5 = r4.f2404f
            r0.f2417b = r4
            r0.f2420e = r3
            java.lang.Object r5 = r5.mo45883b(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r0 = r4
        L_0x0046:
            bo.app.c2 r5 = (p042bo.app.C3042c2) r5
            bo.app.c2 r5 = r0.mo29524b((p042bo.app.C3042c2) r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3571q0.mo29520a(hf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo29521a(p042bo.app.C3042c2 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "brazeRequest"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)     // Catch:{ all -> 0x0066 }
            bo.app.f2 r0 = r2.f2400b     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = r0.mo28908c()     // Catch:{ all -> 0x0066 }
            r3.mo28692c(r0)     // Catch:{ all -> 0x0066 }
            com.braze.configuration.b r0 = r2.f2401c     // Catch:{ all -> 0x0066 }
            com.appboy.enums.SdkFlavor r0 = r0.getSdkFlavor()     // Catch:{ all -> 0x0066 }
            r3.mo28687a((com.appboy.enums.SdkFlavor) r0)     // Catch:{ all -> 0x0066 }
            bo.app.f2 r0 = r2.f2400b     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = r0.mo28904a()     // Catch:{ all -> 0x0066 }
            r3.mo28696e(r0)     // Catch:{ all -> 0x0066 }
            bo.app.f2 r0 = r2.f2400b     // Catch:{ all -> 0x0066 }
            bo.app.j0 r0 = r0.mo28907b()     // Catch:{ all -> 0x0066 }
            r3.mo28685a((p042bo.app.C3274j0) r0)     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x002d
            goto L_0x0035
        L_0x002d:
            boolean r0 = r0.mo29124v()     // Catch:{ all -> 0x0066 }
            r1 = 1
            if (r0 != r1) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            if (r1 == 0) goto L_0x003d
            bo.app.t6 r0 = r2.f2399a     // Catch:{ all -> 0x0066 }
            r0.mo29705h()     // Catch:{ all -> 0x0066 }
        L_0x003d:
            bo.app.t6 r0 = r2.f2399a     // Catch:{ all -> 0x0066 }
            java.lang.Object r0 = r0.mo28509a()     // Catch:{ all -> 0x0066 }
            bo.app.b4 r0 = (p042bo.app.C3025b4) r0     // Catch:{ all -> 0x0066 }
            r3.mo28684a((p042bo.app.C3025b4) r0)     // Catch:{ all -> 0x0066 }
            bo.app.k r0 = r2.mo29519a()     // Catch:{ all -> 0x0066 }
            r3.mo28686a((p042bo.app.C3294k) r0)     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.mo29167a()     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0064
            bo.app.a5 r0 = r2.f2403e     // Catch:{ all -> 0x0066 }
            com.braze.configuration.b r1 = r2.f2401c     // Catch:{ all -> 0x0066 }
            java.util.EnumSet r1 = r1.getSdkMetadata()     // Catch:{ all -> 0x0066 }
            java.util.EnumSet r0 = r0.mo28602b(r1)     // Catch:{ all -> 0x0066 }
            r3.mo28689a((java.util.EnumSet<p292z.C10732c>) r0)     // Catch:{ all -> 0x0066 }
        L_0x0064:
            monitor-exit(r2)
            return
        L_0x0066:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3571q0.mo29521a(bo.app.c2):void");
    }
}
