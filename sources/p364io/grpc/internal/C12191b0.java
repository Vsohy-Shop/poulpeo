package p364io.grpc.internal;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import p111h6.C8012n;
import p364io.grpc.C12564o;
import p364io.grpc.C12594t;
import p364io.grpc.internal.C12343k2;
import p364io.grpc.internal.C12402r;
import p458xd.C13809k;
import p458xd.C13819p;
import p458xd.C13824r;

/* renamed from: io.grpc.internal.b0 */
/* compiled from: DelayedStream */
class C12191b0 implements C12398q {

    /* renamed from: a */
    private volatile boolean f19146a;

    /* renamed from: b */
    private C12402r f19147b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C12398q f19148c;

    /* renamed from: d */
    private C12594t f19149d;

    /* renamed from: e */
    private List<Runnable> f19150e = new ArrayList();

    /* renamed from: f */
    private C12206o f19151f;

    /* renamed from: g */
    private long f19152g;

    /* renamed from: h */
    private long f19153h;

    /* renamed from: i */
    private List<Runnable> f19154i = new ArrayList();

    /* renamed from: io.grpc.internal.b0$a */
    /* compiled from: DelayedStream */
    class C12192a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f19155b;

        C12192a(int i) {
            this.f19155b = i;
        }

        public void run() {
            C12191b0.this.f19148c.mo49716b(this.f19155b);
        }
    }

    /* renamed from: io.grpc.internal.b0$b */
    /* compiled from: DelayedStream */
    class C12193b implements Runnable {
        C12193b() {
        }

        public void run() {
            C12191b0.this.f19148c.mo49721l();
        }
    }

    /* renamed from: io.grpc.internal.b0$c */
    /* compiled from: DelayedStream */
    class C12194c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C13809k f19158b;

        C12194c(C13809k kVar) {
            this.f19158b = kVar;
        }

        public void run() {
            C12191b0.this.f19148c.mo49717e(this.f19158b);
        }
    }

    /* renamed from: io.grpc.internal.b0$d */
    /* compiled from: DelayedStream */
    class C12195d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ boolean f19160b;

        C12195d(boolean z) {
            this.f19160b = z;
        }

        public void run() {
            C12191b0.this.f19148c.mo49670o(this.f19160b);
        }
    }

    /* renamed from: io.grpc.internal.b0$e */
    /* compiled from: DelayedStream */
    class C12196e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C13824r f19162b;

        C12196e(C13824r rVar) {
            this.f19162b = rVar;
        }

        public void run() {
            C12191b0.this.f19148c.mo49669n(this.f19162b);
        }
    }

    /* renamed from: io.grpc.internal.b0$f */
    /* compiled from: DelayedStream */
    class C12197f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f19164b;

        C12197f(int i) {
            this.f19164b = i;
        }

        public void run() {
            C12191b0.this.f19148c.mo49661c(this.f19164b);
        }
    }

    /* renamed from: io.grpc.internal.b0$g */
    /* compiled from: DelayedStream */
    class C12198g implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f19166b;

        C12198g(int i) {
            this.f19166b = i;
        }

        public void run() {
            C12191b0.this.f19148c.mo49662d(this.f19166b);
        }
    }

    /* renamed from: io.grpc.internal.b0$h */
    /* compiled from: DelayedStream */
    class C12199h implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C13819p f19168b;

        C12199h(C13819p pVar) {
            this.f19168b = pVar;
        }

        public void run() {
            C12191b0.this.f19148c.mo49663f(this.f19168b);
        }
    }

    /* renamed from: io.grpc.internal.b0$i */
    /* compiled from: DelayedStream */
    class C12200i implements Runnable {
        C12200i() {
        }

        public void run() {
            C12191b0.this.m26644r();
        }
    }

    /* renamed from: io.grpc.internal.b0$j */
    /* compiled from: DelayedStream */
    class C12201j implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f19171b;

        C12201j(String str) {
            this.f19171b = str;
        }

        public void run() {
            C12191b0.this.f19148c.mo49719g(this.f19171b);
        }
    }

    /* renamed from: io.grpc.internal.b0$k */
    /* compiled from: DelayedStream */
    class C12202k implements Runnable {

        /* renamed from: b */
        final /* synthetic */ InputStream f19173b;

        C12202k(InputStream inputStream) {
            this.f19173b = inputStream;
        }

        public void run() {
            C12191b0.this.f19148c.mo49720k(this.f19173b);
        }
    }

    /* renamed from: io.grpc.internal.b0$l */
    /* compiled from: DelayedStream */
    class C12203l implements Runnable {
        C12203l() {
        }

        public void run() {
            C12191b0.this.f19148c.flush();
        }
    }

    /* renamed from: io.grpc.internal.b0$m */
    /* compiled from: DelayedStream */
    class C12204m implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12594t f19176b;

        C12204m(C12594t tVar) {
            this.f19176b = tVar;
        }

        public void run() {
            C12191b0.this.f19148c.mo49660a(this.f19176b);
        }
    }

    /* renamed from: io.grpc.internal.b0$n */
    /* compiled from: DelayedStream */
    class C12205n implements Runnable {
        C12205n() {
        }

        public void run() {
            C12191b0.this.f19148c.mo49665i();
        }
    }

    /* renamed from: io.grpc.internal.b0$o */
    /* compiled from: DelayedStream */
    private static class C12206o implements C12402r {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C12402r f19179a;

        /* renamed from: b */
        private volatile boolean f19180b;

        /* renamed from: c */
        private List<Runnable> f19181c = new ArrayList();

        /* renamed from: io.grpc.internal.b0$o$a */
        /* compiled from: DelayedStream */
        class C12207a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C12343k2.C12344a f19182b;

            C12207a(C12343k2.C12344a aVar) {
                this.f19182b = aVar;
            }

            public void run() {
                C12206o.this.f19179a.mo49737a(this.f19182b);
            }
        }

        /* renamed from: io.grpc.internal.b0$o$b */
        /* compiled from: DelayedStream */
        class C12208b implements Runnable {
            C12208b() {
            }

            public void run() {
                C12206o.this.f19179a.mo49739c();
            }
        }

        /* renamed from: io.grpc.internal.b0$o$c */
        /* compiled from: DelayedStream */
        class C12209c implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C12564o f19185b;

            C12209c(C12564o oVar) {
                this.f19185b = oVar;
            }

            public void run() {
                C12206o.this.f19179a.mo49738b(this.f19185b);
            }
        }

        /* renamed from: io.grpc.internal.b0$o$d */
        /* compiled from: DelayedStream */
        class C12210d implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C12594t f19187b;

            /* renamed from: c */
            final /* synthetic */ C12402r.C12403a f19188c;

            /* renamed from: d */
            final /* synthetic */ C12564o f19189d;

            C12210d(C12594t tVar, C12402r.C12403a aVar, C12564o oVar) {
                this.f19187b = tVar;
                this.f19188c = aVar;
                this.f19189d = oVar;
            }

            public void run() {
                C12206o.this.f19179a.mo49740d(this.f19187b, this.f19188c, this.f19189d);
            }
        }

        public C12206o(C12402r rVar) {
            this.f19179a = rVar;
        }

        /* renamed from: f */
        private void m26664f(Runnable runnable) {
            synchronized (this) {
                if (!this.f19180b) {
                    this.f19181c.add(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        /* renamed from: a */
        public void mo49737a(C12343k2.C12344a aVar) {
            if (this.f19180b) {
                this.f19179a.mo49737a(aVar);
            } else {
                m26664f(new C12207a(aVar));
            }
        }

        /* renamed from: b */
        public void mo49738b(C12564o oVar) {
            m26664f(new C12209c(oVar));
        }

        /* renamed from: c */
        public void mo49739c() {
            if (this.f19180b) {
                this.f19179a.mo49739c();
            } else {
                m26664f(new C12208b());
            }
        }

        /* renamed from: d */
        public void mo49740d(C12594t tVar, C12402r.C12403a aVar, C12564o oVar) {
            m26664f(new C12210d(tVar, aVar, oVar));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
            r0 = r1.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
            if (r0.hasNext() == false) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
            ((java.lang.Runnable) r0.next()).run();
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo49741g() {
            /*
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
            L_0x0005:
                monitor-enter(r3)
                java.util.List<java.lang.Runnable> r1 = r3.f19181c     // Catch:{ all -> 0x0034 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0034 }
                if (r1 == 0) goto L_0x0016
                r0 = 0
                r3.f19181c = r0     // Catch:{ all -> 0x0034 }
                r0 = 1
                r3.f19180b = r0     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0016:
                java.util.List<java.lang.Runnable> r1 = r3.f19181c     // Catch:{ all -> 0x0034 }
                r3.f19181c = r0     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                java.util.Iterator r0 = r1.iterator()
            L_0x001f:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x002f
                java.lang.Object r2 = r0.next()
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                r2.run()
                goto L_0x001f
            L_0x002f:
                r1.clear()
                r0 = r1
                goto L_0x0005
            L_0x0034:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12191b0.C12206o.mo49741g():void");
        }
    }

    C12191b0() {
    }

    /* renamed from: q */
    private void m26643q(Runnable runnable) {
        boolean z;
        if (this.f19147b != null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "May only be called after start");
        synchronized (this) {
            if (!this.f19146a) {
                this.f19150e.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r0.hasNext() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r0.mo49741g();
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m26644r() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0005:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f19150e     // Catch:{ all -> 0x003b }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x001d
            r0 = 0
            r3.f19150e = r0     // Catch:{ all -> 0x003b }
            r0 = 1
            r3.f19146a = r0     // Catch:{ all -> 0x003b }
            io.grpc.internal.b0$o r0 = r3.f19151f     // Catch:{ all -> 0x003b }
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x001c
            r0.mo49741g()
        L_0x001c:
            return
        L_0x001d:
            java.util.List<java.lang.Runnable> r1 = r3.f19150e     // Catch:{ all -> 0x003b }
            r3.f19150e = r0     // Catch:{ all -> 0x003b }
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            java.util.Iterator r0 = r1.iterator()
        L_0x0026:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0036
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L_0x0026
        L_0x0036:
            r1.clear()
            r0 = r1
            goto L_0x0005
        L_0x003b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12191b0.m26644r():void");
    }

    /* renamed from: s */
    private void m26645s(C12402r rVar) {
        for (Runnable run : this.f19154i) {
            run.run();
        }
        this.f19154i = null;
        this.f19148c.mo49667j(rVar);
    }

    /* renamed from: u */
    private void m26646u(C12398q qVar) {
        boolean z;
        C12398q qVar2 = this.f19148c;
        if (qVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15764w(z, "realStream already set to %s", qVar2);
        this.f19148c = qVar;
        this.f19153h = System.nanoTime();
    }

    /* renamed from: a */
    public void mo49660a(C12594t tVar) {
        boolean z;
        boolean z2 = true;
        if (this.f19147b != null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "May only be called after start");
        C8012n.m15756o(tVar, "reason");
        synchronized (this) {
            if (this.f19148c == null) {
                m26646u(C12378o1.f19670a);
                this.f19149d = tVar;
                z2 = false;
            }
        }
        if (z2) {
            m26643q(new C12204m(tVar));
            return;
        }
        m26644r();
        mo49709t(tVar);
        this.f19147b.mo49740d(tVar, C12402r.C12403a.PROCESSED, new C12564o());
    }

    /* renamed from: b */
    public void mo49716b(int i) {
        boolean z;
        if (this.f19147b != null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "May only be called after start");
        if (this.f19146a) {
            this.f19148c.mo49716b(i);
        } else {
            m26643q(new C12192a(i));
        }
    }

    /* renamed from: c */
    public void mo49661c(int i) {
        boolean z;
        if (this.f19147b == null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "May only be called before start");
        this.f19154i.add(new C12197f(i));
    }

    /* renamed from: d */
    public void mo49662d(int i) {
        boolean z;
        if (this.f19147b == null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "May only be called before start");
        this.f19154i.add(new C12198g(i));
    }

    /* renamed from: e */
    public void mo49717e(C13809k kVar) {
        boolean z;
        if (this.f19147b == null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "May only be called before start");
        C8012n.m15756o(kVar, "compressor");
        this.f19154i.add(new C12194c(kVar));
    }

    /* renamed from: f */
    public void mo49663f(C13819p pVar) {
        boolean z;
        if (this.f19147b == null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "May only be called before start");
        this.f19154i.add(new C12199h(pVar));
    }

    public void flush() {
        boolean z;
        if (this.f19147b != null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "May only be called after start");
        if (this.f19146a) {
            this.f19148c.flush();
        } else {
            m26643q(new C12203l());
        }
    }

    /* renamed from: g */
    public void mo49719g(String str) {
        boolean z;
        if (this.f19147b == null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "May only be called before start");
        C8012n.m15756o(str, "authority");
        this.f19154i.add(new C12201j(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo49664h(p364io.grpc.internal.C12460x0 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            io.grpc.internal.r r0 = r5.f19147b     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            return
        L_0x0007:
            io.grpc.internal.q r0 = r5.f19148c     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = "buffered_nanos"
            long r1 = r5.f19153h     // Catch:{ all -> 0x0036 }
            long r3 = r5.f19152g     // Catch:{ all -> 0x0036 }
            long r1 = r1 - r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0036 }
            r6.mo50128b(r0, r1)     // Catch:{ all -> 0x0036 }
            io.grpc.internal.q r0 = r5.f19148c     // Catch:{ all -> 0x0036 }
            r0.mo49664h(r6)     // Catch:{ all -> 0x0036 }
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "buffered_nanos"
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0036 }
            long r3 = r5.f19152g     // Catch:{ all -> 0x0036 }
            long r1 = r1 - r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0036 }
            r6.mo50128b(r0, r1)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "waiting_for_connection"
            r6.mo50127a(r0)     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            return
        L_0x0036:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12191b0.mo49664h(io.grpc.internal.x0):void");
    }

    /* renamed from: i */
    public void mo49665i() {
        boolean z;
        if (this.f19147b != null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "May only be called after start");
        m26643q(new C12205n());
    }

    public boolean isReady() {
        if (this.f19146a) {
            return this.f19148c.isReady();
        }
        return false;
    }

    /* renamed from: j */
    public void mo49667j(C12402r rVar) {
        boolean z;
        C12594t tVar;
        boolean z2;
        C8012n.m15756o(rVar, "listener");
        if (this.f19147b == null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "already started");
        synchronized (this) {
            tVar = this.f19149d;
            z2 = this.f19146a;
            if (!z2) {
                C12206o oVar = new C12206o(rVar);
                this.f19151f = oVar;
                rVar = oVar;
            }
            this.f19147b = rVar;
            this.f19152g = System.nanoTime();
        }
        if (tVar != null) {
            rVar.mo49740d(tVar, C12402r.C12403a.PROCESSED, new C12564o());
        } else if (z2) {
            m26645s(rVar);
        }
    }

    /* renamed from: k */
    public void mo49720k(InputStream inputStream) {
        boolean z;
        if (this.f19147b != null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "May only be called after start");
        C8012n.m15756o(inputStream, "message");
        if (this.f19146a) {
            this.f19148c.mo49720k(inputStream);
        } else {
            m26643q(new C12202k(inputStream));
        }
    }

    /* renamed from: l */
    public void mo49721l() {
        boolean z;
        if (this.f19147b == null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "May only be called before start");
        this.f19154i.add(new C12193b());
    }

    /* renamed from: n */
    public void mo49669n(C13824r rVar) {
        boolean z;
        if (this.f19147b == null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "May only be called before start");
        C8012n.m15756o(rVar, "decompressorRegistry");
        this.f19154i.add(new C12196e(rVar));
    }

    /* renamed from: o */
    public void mo49670o(boolean z) {
        boolean z2;
        if (this.f19147b == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C8012n.m15762u(z2, "May only be called before start");
        this.f19154i.add(new C12195d(z));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r3 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        m26645s(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return new p364io.grpc.internal.C12191b0.C12200i(r2);
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Runnable mo49722v(p364io.grpc.internal.C12398q r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            io.grpc.internal.q r0 = r2.f19148c     // Catch:{ all -> 0x0029 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            return r1
        L_0x0008:
            java.lang.String r0 = "stream"
            java.lang.Object r3 = p111h6.C8012n.m15756o(r3, r0)     // Catch:{ all -> 0x0029 }
            io.grpc.internal.q r3 = (p364io.grpc.internal.C12398q) r3     // Catch:{ all -> 0x0029 }
            r2.m26646u(r3)     // Catch:{ all -> 0x0029 }
            io.grpc.internal.r r3 = r2.f19147b     // Catch:{ all -> 0x0029 }
            if (r3 != 0) goto L_0x001c
            r2.f19150e = r1     // Catch:{ all -> 0x0029 }
            r0 = 1
            r2.f19146a = r0     // Catch:{ all -> 0x0029 }
        L_0x001c:
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            if (r3 != 0) goto L_0x0020
            return r1
        L_0x0020:
            r2.m26645s(r3)
            io.grpc.internal.b0$i r3 = new io.grpc.internal.b0$i
            r3.<init>()
            return r3
        L_0x0029:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12191b0.mo49722v(io.grpc.internal.q):java.lang.Runnable");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo49709t(C12594t tVar) {
    }
}
