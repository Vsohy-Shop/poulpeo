package p364io.grpc.internal;

import androidx.core.app.NotificationCompat;
import com.google.common.util.concurrent.C6907e;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p111h6.C8012n;
import p111h6.C8016p;
import p364io.grpc.C12594t;
import p364io.grpc.internal.C12422s;

/* renamed from: io.grpc.internal.c1 */
/* compiled from: KeepAliveManager */
public class C12223c1 {

    /* renamed from: l */
    private static final long f19234l = TimeUnit.SECONDS.toNanos(10);

    /* renamed from: m */
    private static final long f19235m = TimeUnit.MILLISECONDS.toNanos(10);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ScheduledExecutorService f19236a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8016p f19237b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C12228d f19238c;

    /* renamed from: d */
    private final boolean f19239d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C12229e f19240e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ScheduledFuture<?> f19241f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ScheduledFuture<?> f19242g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Runnable f19243h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Runnable f19244i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final long f19245j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final long f19246k;

    /* renamed from: io.grpc.internal.c1$a */
    /* compiled from: KeepAliveManager */
    class C12224a implements Runnable {
        C12224a() {
        }

        public void run() {
            boolean z;
            synchronized (C12223c1.this) {
                C12229e a = C12223c1.this.f19240e;
                C12229e eVar = C12229e.DISCONNECTED;
                if (a != eVar) {
                    C12229e unused = C12223c1.this.f19240e = eVar;
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                C12223c1.this.f19238c.mo49772a();
            }
        }
    }

    /* renamed from: io.grpc.internal.c1$b */
    /* compiled from: KeepAliveManager */
    class C12225b implements Runnable {
        C12225b() {
        }

        public void run() {
            boolean z;
            synchronized (C12223c1.this) {
                ScheduledFuture unused = C12223c1.this.f19242g = null;
                C12229e a = C12223c1.this.f19240e;
                C12229e eVar = C12229e.PING_SCHEDULED;
                if (a == eVar) {
                    C12229e unused2 = C12223c1.this.f19240e = C12229e.PING_SENT;
                    C12223c1 c1Var = C12223c1.this;
                    ScheduledFuture unused3 = c1Var.f19241f = c1Var.f19236a.schedule(C12223c1.this.f19243h, C12223c1.this.f19246k, TimeUnit.NANOSECONDS);
                    z = true;
                } else {
                    if (C12223c1.this.f19240e == C12229e.PING_DELAYED) {
                        C12223c1 c1Var2 = C12223c1.this;
                        ScheduledExecutorService h = c1Var2.f19236a;
                        Runnable i = C12223c1.this.f19244i;
                        long j = C12223c1.this.f19245j;
                        C8016p k = C12223c1.this.f19237b;
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        ScheduledFuture unused4 = c1Var2.f19242g = h.schedule(i, j - k.mo41847d(timeUnit), timeUnit);
                        C12229e unused5 = C12223c1.this.f19240e = eVar;
                    }
                    z = false;
                }
            }
            if (z) {
                C12223c1.this.f19238c.mo49773b();
            }
        }
    }

    /* renamed from: io.grpc.internal.c1$d */
    /* compiled from: KeepAliveManager */
    public interface C12228d {
        /* renamed from: a */
        void mo49772a();

        /* renamed from: b */
        void mo49773b();
    }

    /* renamed from: io.grpc.internal.c1$e */
    /* compiled from: KeepAliveManager */
    private enum C12229e {
        IDLE,
        PING_SCHEDULED,
        PING_DELAYED,
        PING_SENT,
        IDLE_AND_PING_SENT,
        DISCONNECTED
    }

    public C12223c1(C12228d dVar, ScheduledExecutorService scheduledExecutorService, long j, long j2, boolean z) {
        this(dVar, scheduledExecutorService, C8016p.m15771c(), j, j2, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo49765l() {
        /*
            r5 = this;
            monitor-enter(r5)
            h6.p r0 = r5.f19237b     // Catch:{ all -> 0x004d }
            h6.p r0 = r0.mo41848f()     // Catch:{ all -> 0x004d }
            r0.mo41849g()     // Catch:{ all -> 0x004d }
            io.grpc.internal.c1$e r0 = r5.f19240e     // Catch:{ all -> 0x004d }
            io.grpc.internal.c1$e r1 = p364io.grpc.internal.C12223c1.C12229e.PING_SCHEDULED     // Catch:{ all -> 0x004d }
            if (r0 != r1) goto L_0x0015
            io.grpc.internal.c1$e r0 = p364io.grpc.internal.C12223c1.C12229e.PING_DELAYED     // Catch:{ all -> 0x004d }
            r5.f19240e = r0     // Catch:{ all -> 0x004d }
            goto L_0x004b
        L_0x0015:
            io.grpc.internal.c1$e r2 = p364io.grpc.internal.C12223c1.C12229e.PING_SENT     // Catch:{ all -> 0x004d }
            if (r0 == r2) goto L_0x001d
            io.grpc.internal.c1$e r2 = p364io.grpc.internal.C12223c1.C12229e.IDLE_AND_PING_SENT     // Catch:{ all -> 0x004d }
            if (r0 != r2) goto L_0x004b
        L_0x001d:
            java.util.concurrent.ScheduledFuture<?> r0 = r5.f19241f     // Catch:{ all -> 0x004d }
            r2 = 0
            if (r0 == 0) goto L_0x0025
            r0.cancel(r2)     // Catch:{ all -> 0x004d }
        L_0x0025:
            io.grpc.internal.c1$e r0 = r5.f19240e     // Catch:{ all -> 0x004d }
            io.grpc.internal.c1$e r3 = p364io.grpc.internal.C12223c1.C12229e.IDLE_AND_PING_SENT     // Catch:{ all -> 0x004d }
            if (r0 != r3) goto L_0x0031
            io.grpc.internal.c1$e r0 = p364io.grpc.internal.C12223c1.C12229e.IDLE     // Catch:{ all -> 0x004d }
            r5.f19240e = r0     // Catch:{ all -> 0x004d }
            monitor-exit(r5)
            return
        L_0x0031:
            r5.f19240e = r1     // Catch:{ all -> 0x004d }
            java.util.concurrent.ScheduledFuture<?> r0 = r5.f19242g     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0038
            r2 = 1
        L_0x0038:
            java.lang.String r0 = "There should be no outstanding pingFuture"
            p111h6.C8012n.m15762u(r2, r0)     // Catch:{ all -> 0x004d }
            java.util.concurrent.ScheduledExecutorService r0 = r5.f19236a     // Catch:{ all -> 0x004d }
            java.lang.Runnable r1 = r5.f19244i     // Catch:{ all -> 0x004d }
            long r2 = r5.f19245j     // Catch:{ all -> 0x004d }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x004d }
            java.util.concurrent.ScheduledFuture r0 = r0.schedule(r1, r2, r4)     // Catch:{ all -> 0x004d }
            r5.f19242g = r0     // Catch:{ all -> 0x004d }
        L_0x004b:
            monitor-exit(r5)
            return
        L_0x004d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12223c1.mo49765l():void");
    }

    /* renamed from: m */
    public synchronized void mo49766m() {
        C12229e eVar = this.f19240e;
        if (eVar == C12229e.IDLE) {
            this.f19240e = C12229e.PING_SCHEDULED;
            if (this.f19242g == null) {
                ScheduledExecutorService scheduledExecutorService = this.f19236a;
                Runnable runnable = this.f19244i;
                long j = this.f19245j;
                C8016p pVar = this.f19237b;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                this.f19242g = scheduledExecutorService.schedule(runnable, j - pVar.mo41847d(timeUnit), timeUnit);
            }
        } else if (eVar == C12229e.IDLE_AND_PING_SENT) {
            this.f19240e = C12229e.PING_SENT;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo49767n() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f19239d     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            io.grpc.internal.c1$e r0 = r2.f19240e     // Catch:{ all -> 0x0021 }
            io.grpc.internal.c1$e r1 = p364io.grpc.internal.C12223c1.C12229e.PING_SCHEDULED     // Catch:{ all -> 0x0021 }
            if (r0 == r1) goto L_0x0011
            io.grpc.internal.c1$e r1 = p364io.grpc.internal.C12223c1.C12229e.PING_DELAYED     // Catch:{ all -> 0x0021 }
            if (r0 != r1) goto L_0x0015
        L_0x0011:
            io.grpc.internal.c1$e r0 = p364io.grpc.internal.C12223c1.C12229e.IDLE     // Catch:{ all -> 0x0021 }
            r2.f19240e = r0     // Catch:{ all -> 0x0021 }
        L_0x0015:
            io.grpc.internal.c1$e r0 = r2.f19240e     // Catch:{ all -> 0x0021 }
            io.grpc.internal.c1$e r1 = p364io.grpc.internal.C12223c1.C12229e.PING_SENT     // Catch:{ all -> 0x0021 }
            if (r0 != r1) goto L_0x001f
            io.grpc.internal.c1$e r0 = p364io.grpc.internal.C12223c1.C12229e.IDLE_AND_PING_SENT     // Catch:{ all -> 0x0021 }
            r2.f19240e = r0     // Catch:{ all -> 0x0021 }
        L_0x001f:
            monitor-exit(r2)
            return
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12223c1.mo49767n():void");
    }

    /* renamed from: o */
    public synchronized void mo49768o() {
        if (this.f19239d) {
            mo49766m();
        }
    }

    /* renamed from: p */
    public synchronized void mo49769p() {
        C12229e eVar = this.f19240e;
        C12229e eVar2 = C12229e.DISCONNECTED;
        if (eVar != eVar2) {
            this.f19240e = eVar2;
            ScheduledFuture<?> scheduledFuture = this.f19241f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledFuture<?> scheduledFuture2 = this.f19242g;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                this.f19242g = null;
            }
        }
    }

    C12223c1(C12228d dVar, ScheduledExecutorService scheduledExecutorService, C8016p pVar, long j, long j2, boolean z) {
        this.f19240e = C12229e.IDLE;
        this.f19243h = new C12235d1(new C12224a());
        this.f19244i = new C12235d1(new C12225b());
        this.f19238c = (C12228d) C8012n.m15756o(dVar, "keepAlivePinger");
        this.f19236a = (ScheduledExecutorService) C8012n.m15756o(scheduledExecutorService, "scheduler");
        this.f19237b = (C8016p) C8012n.m15756o(pVar, NotificationCompat.CATEGORY_STOPWATCH);
        this.f19245j = j;
        this.f19246k = j2;
        this.f19239d = z;
        pVar.mo41848f().mo41849g();
    }

    /* renamed from: io.grpc.internal.c1$c */
    /* compiled from: KeepAliveManager */
    public static final class C12226c implements C12228d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C12447v f19249a;

        public C12226c(C12447v vVar) {
            this.f19249a = vVar;
        }

        /* renamed from: a */
        public void mo49772a() {
            this.f19249a.mo49698c(C12594t.f20198u.mo50310r("Keepalive failed. The connection is likely gone"));
        }

        /* renamed from: b */
        public void mo49773b() {
            this.f19249a.mo49978g(new C12227a(), C6907e.m11991a());
        }

        /* renamed from: io.grpc.internal.c1$c$a */
        /* compiled from: KeepAliveManager */
        class C12227a implements C12422s.C12423a {
            C12227a() {
            }

            /* renamed from: a */
            public void mo49774a(Throwable th) {
                C12226c.this.f19249a.mo49698c(C12594t.f20198u.mo50310r("Keepalive failed. The connection is likely gone"));
            }

            /* renamed from: b */
            public void mo49775b(long j) {
            }
        }
    }
}
