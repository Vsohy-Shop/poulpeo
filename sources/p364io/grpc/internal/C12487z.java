package p364io.grpc.internal;

import androidx.core.app.NotificationCompat;
import androidx.core.location.LocationRequestCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p111h6.C8003j;
import p111h6.C8012n;
import p364io.grpc.C12564o;
import p364io.grpc.C12594t;
import p458xd.C13788e;
import p458xd.C13815o;
import p458xd.C13819p;

/* renamed from: io.grpc.internal.z */
/* compiled from: DelayedClientCall */
public class C12487z<ReqT, RespT> extends C13788e<ReqT, RespT> {

    /* renamed from: j */
    private static final Logger f19956j = Logger.getLogger(C12487z.class.getName());

    /* renamed from: k */
    private static final C13788e<Object, Object> f19957k = new C12495h();

    /* renamed from: a */
    private final ScheduledFuture<?> f19958a;

    /* renamed from: b */
    private final Executor f19959b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C13815o f19960c;

    /* renamed from: d */
    private volatile boolean f19961d;

    /* renamed from: e */
    private C13788e.C13789a<RespT> f19962e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C13788e<ReqT, RespT> f19963f;

    /* renamed from: g */
    private C12594t f19964g;

    /* renamed from: h */
    private List<Runnable> f19965h = new ArrayList();

    /* renamed from: i */
    private C12497j<RespT> f19966i;

    /* renamed from: io.grpc.internal.z$a */
    /* compiled from: DelayedClientCall */
    class C12488a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C13788e.C13789a f19967b;

        /* renamed from: c */
        final /* synthetic */ C12564o f19968c;

        C12488a(C13788e.C13789a aVar, C12564o oVar) {
            this.f19967b = aVar;
            this.f19968c = oVar;
        }

        public void run() {
            C12487z.this.f19963f.mo46138e(this.f19967b, this.f19968c);
        }
    }

    /* renamed from: io.grpc.internal.z$b */
    /* compiled from: DelayedClientCall */
    class C12489b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ StringBuilder f19970b;

        C12489b(StringBuilder sb) {
            this.f19970b = sb;
        }

        public void run() {
            C12487z.this.m27603j(C12594t.f20187j.mo50310r(this.f19970b.toString()), true);
        }
    }

    /* renamed from: io.grpc.internal.z$c */
    /* compiled from: DelayedClientCall */
    class C12490c extends C12459x {

        /* renamed from: c */
        final /* synthetic */ C12497j f19972c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12490c(C12497j jVar) {
            super(C12487z.this.f19960c);
            this.f19972c = jVar;
        }

        /* renamed from: a */
        public void mo49858a() {
            this.f19972c.mo50166g();
        }
    }

    /* renamed from: io.grpc.internal.z$d */
    /* compiled from: DelayedClientCall */
    class C12491d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12594t f19974b;

        C12491d(C12594t tVar) {
            this.f19974b = tVar;
        }

        public void run() {
            C12487z.this.f19963f.mo49848a(this.f19974b.mo50307o(), this.f19974b.mo50305m());
        }
    }

    /* renamed from: io.grpc.internal.z$e */
    /* compiled from: DelayedClientCall */
    class C12492e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Object f19976b;

        C12492e(Object obj) {
            this.f19976b = obj;
        }

        public void run() {
            C12487z.this.f19963f.mo49851d(this.f19976b);
        }
    }

    /* renamed from: io.grpc.internal.z$f */
    /* compiled from: DelayedClientCall */
    class C12493f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f19978b;

        C12493f(int i) {
            this.f19978b = i;
        }

        public void run() {
            C12487z.this.f19963f.mo49850c(this.f19978b);
        }
    }

    /* renamed from: io.grpc.internal.z$g */
    /* compiled from: DelayedClientCall */
    class C12494g implements Runnable {
        C12494g() {
        }

        public void run() {
            C12487z.this.f19963f.mo49849b();
        }
    }

    /* renamed from: io.grpc.internal.z$i */
    /* compiled from: DelayedClientCall */
    private final class C12496i extends C12459x {

        /* renamed from: c */
        final C13788e.C13789a<RespT> f19981c;

        /* renamed from: d */
        final C12594t f19982d;

        C12496i(C13788e.C13789a<RespT> aVar, C12594t tVar) {
            super(C12487z.this.f19960c);
            this.f19981c = aVar;
            this.f19982d = tVar;
        }

        /* renamed from: a */
        public void mo49858a() {
            this.f19981c.mo46134a(this.f19982d, new C12564o());
        }
    }

    /* renamed from: io.grpc.internal.z$j */
    /* compiled from: DelayedClientCall */
    private static final class C12497j<RespT> extends C13788e.C13789a<RespT> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C13788e.C13789a<RespT> f19984a;

        /* renamed from: b */
        private volatile boolean f19985b;

        /* renamed from: c */
        private List<Runnable> f19986c = new ArrayList();

        /* renamed from: io.grpc.internal.z$j$a */
        /* compiled from: DelayedClientCall */
        class C12498a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C12564o f19987b;

            C12498a(C12564o oVar) {
                this.f19987b = oVar;
            }

            public void run() {
                C12497j.this.f19984a.mo46135b(this.f19987b);
            }
        }

        /* renamed from: io.grpc.internal.z$j$b */
        /* compiled from: DelayedClientCall */
        class C12499b implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Object f19989b;

            C12499b(Object obj) {
                this.f19989b = obj;
            }

            public void run() {
                C12497j.this.f19984a.mo46136c(this.f19989b);
            }
        }

        /* renamed from: io.grpc.internal.z$j$c */
        /* compiled from: DelayedClientCall */
        class C12500c implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C12594t f19991b;

            /* renamed from: c */
            final /* synthetic */ C12564o f19992c;

            C12500c(C12594t tVar, C12564o oVar) {
                this.f19991b = tVar;
                this.f19992c = oVar;
            }

            public void run() {
                C12497j.this.f19984a.mo46134a(this.f19991b, this.f19992c);
            }
        }

        /* renamed from: io.grpc.internal.z$j$d */
        /* compiled from: DelayedClientCall */
        class C12501d implements Runnable {
            C12501d() {
            }

            public void run() {
                C12497j.this.f19984a.mo50165d();
            }
        }

        public C12497j(C13788e.C13789a<RespT> aVar) {
            this.f19984a = aVar;
        }

        /* renamed from: f */
        private void m27623f(Runnable runnable) {
            synchronized (this) {
                if (!this.f19985b) {
                    this.f19986c.add(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        /* renamed from: a */
        public void mo46134a(C12594t tVar, C12564o oVar) {
            m27623f(new C12500c(tVar, oVar));
        }

        /* renamed from: b */
        public void mo46135b(C12564o oVar) {
            if (this.f19985b) {
                this.f19984a.mo46135b(oVar);
            } else {
                m27623f(new C12498a(oVar));
            }
        }

        /* renamed from: c */
        public void mo46136c(RespT respt) {
            if (this.f19985b) {
                this.f19984a.mo46136c(respt);
            } else {
                m27623f(new C12499b(respt));
            }
        }

        /* renamed from: d */
        public void mo50165d() {
            if (this.f19985b) {
                this.f19984a.mo50165d();
            } else {
                m27623f(new C12501d());
            }
        }

        /* access modifiers changed from: package-private */
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
        public void mo50166g() {
            /*
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
            L_0x0005:
                monitor-enter(r3)
                java.util.List<java.lang.Runnable> r1 = r3.f19986c     // Catch:{ all -> 0x0034 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0034 }
                if (r1 == 0) goto L_0x0016
                r0 = 0
                r3.f19986c = r0     // Catch:{ all -> 0x0034 }
                r0 = 1
                r3.f19985b = r0     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0016:
                java.util.List<java.lang.Runnable> r1 = r3.f19986c     // Catch:{ all -> 0x0034 }
                r3.f19986c = r0     // Catch:{ all -> 0x0034 }
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
            throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12487z.C12497j.mo50166g():void");
        }
    }

    protected C12487z(Executor executor, ScheduledExecutorService scheduledExecutorService, C13819p pVar) {
        this.f19959b = (Executor) C8012n.m15756o(executor, "callExecutor");
        C8012n.m15756o(scheduledExecutorService, "scheduler");
        this.f19960c = C13815o.m31725e();
        this.f19958a = m27606m(scheduledExecutorService, pVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        m27604k(new p364io.grpc.internal.C12487z.C12491d(r2, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r4 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r2.f19959b.execute(new p364io.grpc.internal.C12487z.C12496i(r2, r4, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        m27605l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        mo49885i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m27603j(p364io.grpc.C12594t r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            xd.e<ReqT, RespT> r0 = r2.f19963f     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0010
            xd.e<java.lang.Object, java.lang.Object> r4 = f19957k     // Catch:{ all -> 0x0035 }
            r2.m27607o(r4)     // Catch:{ all -> 0x0035 }
            xd.e$a<RespT> r4 = r2.f19962e     // Catch:{ all -> 0x0035 }
            r2.f19964g = r3     // Catch:{ all -> 0x0035 }
            r0 = 0
            goto L_0x0016
        L_0x0010:
            if (r4 == 0) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            return
        L_0x0014:
            r0 = 1
            r4 = 0
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0022
            io.grpc.internal.z$d r4 = new io.grpc.internal.z$d
            r4.<init>(r3)
            r2.m27604k(r4)
            goto L_0x0031
        L_0x0022:
            if (r4 == 0) goto L_0x002e
            java.util.concurrent.Executor r0 = r2.f19959b
            io.grpc.internal.z$i r1 = new io.grpc.internal.z$i
            r1.<init>(r4, r3)
            r0.execute(r1)
        L_0x002e:
            r2.m27605l()
        L_0x0031:
            r2.mo49885i()
            return
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12487z.m27603j(io.grpc.t, boolean):void");
    }

    /* renamed from: k */
    private void m27604k(Runnable runnable) {
        synchronized (this) {
            if (!this.f19961d) {
                this.f19965h.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r0.hasNext() == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
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
        r3.f19959b.execute(new p364io.grpc.internal.C12487z.C12490c(r3, r0));
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m27605l() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0005:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f19965h     // Catch:{ all -> 0x0042 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x0024
            r0 = 0
            r3.f19965h = r0     // Catch:{ all -> 0x0042 }
            r0 = 1
            r3.f19961d = r0     // Catch:{ all -> 0x0042 }
            io.grpc.internal.z$j<RespT> r0 = r3.f19966i     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0023
            java.util.concurrent.Executor r1 = r3.f19959b
            io.grpc.internal.z$c r2 = new io.grpc.internal.z$c
            r2.<init>(r0)
            r1.execute(r2)
        L_0x0023:
            return
        L_0x0024:
            java.util.List<java.lang.Runnable> r1 = r3.f19965h     // Catch:{ all -> 0x0042 }
            r3.f19965h = r0     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            java.util.Iterator r0 = r1.iterator()
        L_0x002d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L_0x002d
        L_0x003d:
            r1.clear()
            r0 = r1
            goto L_0x0005
        L_0x0042:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12487z.m27605l():void");
    }

    /* renamed from: m */
    private ScheduledFuture<?> m27606m(ScheduledExecutorService scheduledExecutorService, C13819p pVar) {
        C13819p g = this.f19960c.mo53478g();
        if (pVar == null && g == null) {
            return null;
        }
        long j = LocationRequestCompat.PASSIVE_INTERVAL;
        if (pVar != null) {
            j = Math.min(LocationRequestCompat.PASSIVE_INTERVAL, pVar.mo53489i(TimeUnit.NANOSECONDS));
        }
        if (g != null) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (g.mo53489i(timeUnit) < j) {
                j = g.mo53489i(timeUnit);
                Logger logger = f19956j;
                if (logger.isLoggable(Level.FINE)) {
                    StringBuilder sb = new StringBuilder(String.format("Call timeout set to '%d' ns, due to context deadline.", new Object[]{Long.valueOf(j)}));
                    if (pVar == null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(String.format(" Explicit call timeout was '%d' ns.", new Object[]{Long.valueOf(pVar.mo53489i(timeUnit))}));
                    }
                    logger.fine(sb.toString());
                }
            }
        }
        long abs = Math.abs(j);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long nanos = abs / timeUnit2.toNanos(1);
        long abs2 = Math.abs(j) % timeUnit2.toNanos(1);
        StringBuilder sb2 = new StringBuilder();
        if (j < 0) {
            sb2.append("ClientCall started after deadline exceeded. Deadline exceeded after -");
        } else {
            sb2.append("Deadline exceeded after ");
        }
        sb2.append(nanos);
        sb2.append(String.format(Locale.US, ".%09d", new Object[]{Long.valueOf(abs2)}));
        sb2.append("s. ");
        return scheduledExecutorService.schedule(new C12489b(sb2), j, TimeUnit.NANOSECONDS);
    }

    /* renamed from: o */
    private void m27607o(C13788e<ReqT, RespT> eVar) {
        boolean z;
        C13788e<ReqT, RespT> eVar2 = this.f19963f;
        if (eVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15764w(z, "realCall already set to %s", eVar2);
        ScheduledFuture<?> scheduledFuture = this.f19958a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f19963f = eVar;
    }

    /* renamed from: a */
    public final void mo49848a(String str, Throwable th) {
        C12594t tVar;
        C12594t tVar2 = C12594t.f20184g;
        if (str != null) {
            tVar = tVar2.mo50310r(str);
        } else {
            tVar = tVar2.mo50310r("Call cancelled without message");
        }
        if (th != null) {
            tVar = tVar.mo50309q(th);
        }
        m27603j(tVar, false);
    }

    /* renamed from: b */
    public final void mo49849b() {
        m27604k(new C12494g());
    }

    /* renamed from: c */
    public final void mo49850c(int i) {
        if (this.f19961d) {
            this.f19963f.mo49850c(i);
        } else {
            m27604k(new C12493f(i));
        }
    }

    /* renamed from: d */
    public final void mo49851d(ReqT reqt) {
        if (this.f19961d) {
            this.f19963f.mo49851d(reqt);
        } else {
            m27604k(new C12492e(reqt));
        }
    }

    /* renamed from: e */
    public final void mo46138e(C13788e.C13789a<RespT> aVar, C12564o oVar) {
        boolean z;
        C12594t tVar;
        boolean z2;
        if (this.f19962e == null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "already started");
        synchronized (this) {
            this.f19962e = (C13788e.C13789a) C8012n.m15756o(aVar, "listener");
            tVar = this.f19964g;
            z2 = this.f19961d;
            if (!z2) {
                C12497j<RespT> jVar = new C12497j<>(aVar);
                this.f19966i = jVar;
                aVar = jVar;
            }
        }
        if (tVar != null) {
            this.f19959b.execute(new C12496i(aVar, tVar));
        } else if (z2) {
            this.f19963f.mo46138e(aVar, oVar);
        } else {
            m27604k(new C12488a(aVar, oVar));
        }
    }

    /* renamed from: n */
    public final void mo50157n(C13788e<ReqT, RespT> eVar) {
        synchronized (this) {
            if (this.f19963f == null) {
                m27607o((C13788e) C8012n.m15756o(eVar, NotificationCompat.CATEGORY_CALL));
                m27605l();
            }
        }
    }

    public String toString() {
        return C8003j.m15723c(this).mo41840d("realCall", this.f19963f).toString();
    }

    /* renamed from: io.grpc.internal.z$h */
    /* compiled from: DelayedClientCall */
    class C12495h extends C13788e<Object, Object> {
        C12495h() {
        }

        /* renamed from: b */
        public void mo49849b() {
        }

        /* renamed from: c */
        public void mo49850c(int i) {
        }

        /* renamed from: d */
        public void mo49851d(Object obj) {
        }

        /* renamed from: a */
        public void mo49848a(String str, Throwable th) {
        }

        /* renamed from: e */
        public void mo46138e(C13788e.C13789a<Object> aVar, C12564o oVar) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo49885i() {
    }
}
