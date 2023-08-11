package p364io.grpc.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p111h6.C8003j;
import p111h6.C8012n;
import p364io.grpc.C12167e;
import p364io.grpc.C12546k;
import p364io.grpc.C12594t;
import p458xd.C13813m;
import p458xd.C13814n;

/* renamed from: io.grpc.internal.r1 */
/* compiled from: PickFirstLoadBalancer */
final class C12416r1 extends C12546k {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12546k.C12551d f19789b;

    /* renamed from: c */
    private C12546k.C12556h f19790c;

    /* renamed from: io.grpc.internal.r1$a */
    /* compiled from: PickFirstLoadBalancer */
    class C12417a implements C12546k.C12558j {

        /* renamed from: a */
        final /* synthetic */ C12546k.C12556h f19791a;

        C12417a(C12546k.C12556h hVar) {
            this.f19791a = hVar;
        }

        /* renamed from: a */
        public void mo48963a(C13814n nVar) {
            C12416r1.this.m27368g(this.f19791a, nVar);
        }
    }

    /* renamed from: io.grpc.internal.r1$b */
    /* compiled from: PickFirstLoadBalancer */
    static /* synthetic */ class C12418b {

        /* renamed from: a */
        static final /* synthetic */ int[] f19793a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                xd.m[] r0 = p458xd.C13813m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19793a = r0
                xd.m r1 = p458xd.C13813m.IDLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19793a     // Catch:{ NoSuchFieldError -> 0x001d }
                xd.m r1 = p458xd.C13813m.CONNECTING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19793a     // Catch:{ NoSuchFieldError -> 0x0028 }
                xd.m r1 = p458xd.C13813m.READY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f19793a     // Catch:{ NoSuchFieldError -> 0x0033 }
                xd.m r1 = p458xd.C13813m.TRANSIENT_FAILURE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12416r1.C12418b.<clinit>():void");
        }
    }

    /* renamed from: io.grpc.internal.r1$c */
    /* compiled from: PickFirstLoadBalancer */
    private static final class C12419c extends C12546k.C12557i {

        /* renamed from: a */
        private final C12546k.C12552e f19794a;

        C12419c(C12546k.C12552e eVar) {
            this.f19794a = (C12546k.C12552e) C8012n.m15756o(eVar, "result");
        }

        /* renamed from: a */
        public C12546k.C12552e mo48964a(C12546k.C12553f fVar) {
            return this.f19794a;
        }

        public String toString() {
            return C8003j.m15722b(C12419c.class).mo41840d("result", this.f19794a).toString();
        }
    }

    /* renamed from: io.grpc.internal.r1$d */
    /* compiled from: PickFirstLoadBalancer */
    private final class C12420d extends C12546k.C12557i {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C12546k.C12556h f19795a;

        /* renamed from: b */
        private final AtomicBoolean f19796b = new AtomicBoolean(false);

        /* renamed from: io.grpc.internal.r1$d$a */
        /* compiled from: PickFirstLoadBalancer */
        class C12421a implements Runnable {
            C12421a() {
            }

            public void run() {
                C12420d.this.f19795a.mo49909e();
            }
        }

        C12420d(C12546k.C12556h hVar) {
            this.f19795a = (C12546k.C12556h) C8012n.m15756o(hVar, "subchannel");
        }

        /* renamed from: a */
        public C12546k.C12552e mo48964a(C12546k.C12553f fVar) {
            if (this.f19796b.compareAndSet(false, true)) {
                C12416r1.this.f19789b.mo49871c().execute(new C12421a());
            }
            return C12546k.C12552e.m27761g();
        }
    }

    C12416r1(C12546k.C12551d dVar) {
        this.f19789b = (C12546k.C12551d) C8012n.m15756o(dVar, "helper");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m27368g(C12546k.C12556h hVar, C13814n nVar) {
        C12546k.C12557i iVar;
        C12546k.C12557i iVar2;
        C13813m c = nVar.mo53469c();
        if (c != C13813m.SHUTDOWN) {
            if (nVar.mo53469c() == C13813m.TRANSIENT_FAILURE || nVar.mo53469c() == C13813m.IDLE) {
                this.f19789b.mo49872d();
            }
            int i = C12418b.f19793a[c.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    iVar = new C12419c(C12546k.C12552e.m27761g());
                } else if (i == 3) {
                    iVar2 = new C12419c(C12546k.C12552e.m27762h(hVar));
                } else if (i == 4) {
                    iVar = new C12419c(C12546k.C12552e.m27760f(nVar.mo53470d()));
                } else {
                    throw new IllegalArgumentException("Unsupported state:" + c);
                }
                this.f19789b.mo49873e(c, iVar);
            }
            iVar2 = new C12420d(hVar);
            iVar = iVar2;
            this.f19789b.mo49873e(c, iVar);
        }
    }

    /* renamed from: b */
    public void mo48959b(C12594t tVar) {
        C12546k.C12556h hVar = this.f19790c;
        if (hVar != null) {
            hVar.mo49910f();
            this.f19790c = null;
        }
        this.f19789b.mo49873e(C13813m.TRANSIENT_FAILURE, new C12419c(C12546k.C12552e.m27760f(tVar)));
    }

    /* renamed from: c */
    public void mo48960c(C12546k.C12554g gVar) {
        List<C12167e> a = gVar.mo50222a();
        C12546k.C12556h hVar = this.f19790c;
        if (hVar == null) {
            C12546k.C12556h a2 = this.f19789b.mo49869a(C12546k.C12548b.m27743c().mo50213e(a).mo50211b());
            a2.mo49911g(new C12417a(a2));
            this.f19790c = a2;
            this.f19789b.mo49873e(C13813m.CONNECTING, new C12419c(C12546k.C12552e.m27762h(a2)));
            a2.mo49909e();
            return;
        }
        hVar.mo49912h(a);
    }

    /* renamed from: d */
    public void mo48961d() {
        C12546k.C12556h hVar = this.f19790c;
        if (hVar != null) {
            hVar.mo49910f();
        }
    }
}
