package p453we;

import androidx.compose.animation.core.C0344a;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p341fe.C11962r;
import p361ie.C12140a;
import p361ie.C12141b;
import p391me.C12937c;

/* renamed from: we.c */
/* compiled from: IoScheduler */
public final class C13703c extends C11962r {

    /* renamed from: d */
    static final C13709f f22094d;

    /* renamed from: e */
    static final C13709f f22095e;

    /* renamed from: f */
    private static final TimeUnit f22096f = TimeUnit.SECONDS;

    /* renamed from: g */
    static final C13706c f22097g;

    /* renamed from: h */
    static final C13704a f22098h;

    /* renamed from: b */
    final ThreadFactory f22099b;

    /* renamed from: c */
    final AtomicReference<C13704a> f22100c;

    /* renamed from: we.c$a */
    /* compiled from: IoScheduler */
    static final class C13704a implements Runnable {

        /* renamed from: b */
        private final long f22101b;

        /* renamed from: c */
        private final ConcurrentLinkedQueue<C13706c> f22102c;

        /* renamed from: d */
        final C12140a f22103d;

        /* renamed from: e */
        private final ScheduledExecutorService f22104e;

        /* renamed from: f */
        private final Future<?> f22105f;

        /* renamed from: g */
        private final ThreadFactory f22106g;

        C13704a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            long j2;
            ScheduledFuture<?> scheduledFuture;
            ScheduledExecutorService scheduledExecutorService;
            if (timeUnit != null) {
                j2 = timeUnit.toNanos(j);
            } else {
                j2 = 0;
            }
            long j3 = j2;
            this.f22101b = j3;
            this.f22102c = new ConcurrentLinkedQueue<>();
            this.f22103d = new C12140a();
            this.f22106g = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C13703c.f22095e);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j3, j3, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.f22104e = scheduledExecutorService;
            this.f22105f = scheduledFuture;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo53370a() {
            if (!this.f22102c.isEmpty()) {
                long c = mo53372c();
                Iterator<C13706c> it = this.f22102c.iterator();
                while (it.hasNext()) {
                    C13706c next = it.next();
                    if (next.mo53376g() > c) {
                        return;
                    }
                    if (this.f22102c.remove(next)) {
                        this.f22103d.mo49582b(next);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C13706c mo53371b() {
            if (this.f22103d.isDisposed()) {
                return C13703c.f22097g;
            }
            while (!this.f22102c.isEmpty()) {
                C13706c poll = this.f22102c.poll();
                if (poll != null) {
                    return poll;
                }
            }
            C13706c cVar = new C13706c(this.f22106g);
            this.f22103d.mo49583c(cVar);
            return cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo53372c() {
            return System.nanoTime();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo53373d(C13706c cVar) {
            cVar.mo53377h(mo53372c() + this.f22101b);
            this.f22102c.offer(cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo53374e() {
            this.f22103d.dispose();
            Future<?> future = this.f22105f;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f22104e;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        public void run() {
            mo53370a();
        }
    }

    /* renamed from: we.c$b */
    /* compiled from: IoScheduler */
    static final class C13705b extends C11962r.C11964b {

        /* renamed from: b */
        private final C12140a f22107b;

        /* renamed from: c */
        private final C13704a f22108c;

        /* renamed from: d */
        private final C13706c f22109d;

        /* renamed from: e */
        final AtomicBoolean f22110e = new AtomicBoolean();

        C13705b(C13704a aVar) {
            this.f22108c = aVar;
            this.f22107b = new C12140a();
            this.f22109d = aVar.mo53371b();
        }

        /* renamed from: c */
        public C12141b mo49268c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f22107b.isDisposed()) {
                return C12937c.INSTANCE;
            }
            return this.f22109d.mo53378d(runnable, j, timeUnit, this.f22107b);
        }

        public void dispose() {
            if (this.f22110e.compareAndSet(false, true)) {
                this.f22107b.dispose();
                this.f22108c.mo53373d(this.f22109d);
            }
        }

        public boolean isDisposed() {
            return this.f22110e.get();
        }
    }

    /* renamed from: we.c$c */
    /* compiled from: IoScheduler */
    static final class C13706c extends C13708e {

        /* renamed from: d */
        private long f22111d = 0;

        C13706c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        /* renamed from: g */
        public long mo53376g() {
            return this.f22111d;
        }

        /* renamed from: h */
        public void mo53377h(long j) {
            this.f22111d = j;
        }
    }

    static {
        C13706c cVar = new C13706c(new C13709f("RxCachedThreadSchedulerShutdown"));
        f22097g = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        C13709f fVar = new C13709f("RxCachedThreadScheduler", max);
        f22094d = fVar;
        f22095e = new C13709f("RxCachedWorkerPoolEvictor", max);
        C13704a aVar = new C13704a(0, (TimeUnit) null, fVar);
        f22098h = aVar;
        aVar.mo53374e();
    }

    public C13703c() {
        this(f22094d);
    }

    /* renamed from: a */
    public C11962r.C11964b mo49262a() {
        return new C13705b(this.f22100c.get());
    }

    /* renamed from: d */
    public void mo53369d() {
        C13704a aVar = new C13704a(60, f22096f, this.f22099b);
        if (!C0344a.m496a(this.f22100c, f22098h, aVar)) {
            aVar.mo53374e();
        }
    }

    public C13703c(ThreadFactory threadFactory) {
        this.f22099b = threadFactory;
        this.f22100c = new AtomicReference<>(f22098h);
        mo53369d();
    }
}
