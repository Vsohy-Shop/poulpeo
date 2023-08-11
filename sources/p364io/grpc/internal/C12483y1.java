package p364io.grpc.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p111h6.C8016p;

/* renamed from: io.grpc.internal.y1 */
/* compiled from: Rescheduler */
final class C12483y1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ScheduledExecutorService f19947a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f19948b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Runnable f19949c;

    /* renamed from: d */
    private final C8016p f19950d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f19951e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f19952f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ScheduledFuture<?> f19953g;

    /* renamed from: io.grpc.internal.y1$b */
    /* compiled from: Rescheduler */
    private final class C12485b implements Runnable {
        private C12485b() {
        }

        public void run() {
            if (!C12483y1.this.f19952f) {
                ScheduledFuture unused = C12483y1.this.f19953g = null;
                return;
            }
            long e = C12483y1.this.m27597j();
            if (C12483y1.this.f19951e - e > 0) {
                C12483y1 y1Var = C12483y1.this;
                ScheduledFuture unused2 = y1Var.f19953g = y1Var.f19947a.schedule(new C12486c(), C12483y1.this.f19951e - e, TimeUnit.NANOSECONDS);
                return;
            }
            boolean unused3 = C12483y1.this.f19952f = false;
            ScheduledFuture unused4 = C12483y1.this.f19953g = null;
            C12483y1.this.f19949c.run();
        }
    }

    /* renamed from: io.grpc.internal.y1$c */
    /* compiled from: Rescheduler */
    private final class C12486c implements Runnable {
        private C12486c() {
        }

        public void run() {
            C12483y1.this.f19948b.execute(new C12485b());
        }
    }

    C12483y1(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, C8016p pVar) {
        this.f19949c = runnable;
        this.f19948b = executor;
        this.f19947a = scheduledExecutorService;
        this.f19950d = pVar;
        pVar.mo41849g();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public long m27597j() {
        return this.f19950d.mo41847d(TimeUnit.NANOSECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo50153i(boolean z) {
        ScheduledFuture<?> scheduledFuture;
        this.f19952f = false;
        if (z && (scheduledFuture = this.f19953g) != null) {
            scheduledFuture.cancel(false);
            this.f19953g = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo50154k(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        long j2 = m27597j() + nanos;
        this.f19952f = true;
        if (j2 - this.f19951e < 0 || this.f19953g == null) {
            ScheduledFuture<?> scheduledFuture = this.f19953g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f19953g = this.f19947a.schedule(new C12486c(), nanos, TimeUnit.NANOSECONDS);
        }
        this.f19951e = j2;
    }
}
