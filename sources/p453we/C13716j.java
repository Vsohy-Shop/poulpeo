package p453we;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p307af.C10885a;
import p341fe.C11962r;
import p361ie.C12140a;
import p361ie.C12141b;
import p391me.C12937c;

/* renamed from: we.j */
/* compiled from: SingleScheduler */
public final class C13716j extends C11962r {

    /* renamed from: d */
    static final C13709f f22130d = new C13709f("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: e */
    static final ScheduledExecutorService f22131e;

    /* renamed from: b */
    final ThreadFactory f22132b;

    /* renamed from: c */
    final AtomicReference<ScheduledExecutorService> f22133c;

    /* renamed from: we.j$a */
    /* compiled from: SingleScheduler */
    static final class C13717a extends C11962r.C11964b {

        /* renamed from: b */
        final ScheduledExecutorService f22134b;

        /* renamed from: c */
        final C12140a f22135c = new C12140a();

        /* renamed from: d */
        volatile boolean f22136d;

        C13717a(ScheduledExecutorService scheduledExecutorService) {
            this.f22134b = scheduledExecutorService;
        }

        /* renamed from: c */
        public C12141b mo49268c(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            if (this.f22136d) {
                return C12937c.INSTANCE;
            }
            C13712h hVar = new C13712h(C10885a.m23272s(runnable), this.f22135c);
            this.f22135c.mo49583c(hVar);
            if (j <= 0) {
                try {
                    future = this.f22134b.submit(hVar);
                } catch (RejectedExecutionException e) {
                    dispose();
                    C10885a.m23270q(e);
                    return C12937c.INSTANCE;
                }
            } else {
                future = this.f22134b.schedule(hVar, j, timeUnit);
            }
            hVar.mo53385a(future);
            return hVar;
        }

        public void dispose() {
            if (!this.f22136d) {
                this.f22136d = true;
                this.f22135c.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f22136d;
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f22131e = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    public C13716j() {
        this(f22130d);
    }

    /* renamed from: d */
    static ScheduledExecutorService m31399d(ThreadFactory threadFactory) {
        return C13713i.m31394a(threadFactory);
    }

    /* renamed from: a */
    public C11962r.C11964b mo49262a() {
        return new C13717a(this.f22133c.get());
    }

    /* renamed from: c */
    public C12141b mo49264c(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C13711g gVar = new C13711g(C10885a.m23272s(runnable));
        if (j <= 0) {
            try {
                future = this.f22133c.get().submit(gVar);
            } catch (RejectedExecutionException e) {
                C10885a.m23270q(e);
                return C12937c.INSTANCE;
            }
        } else {
            future = this.f22133c.get().schedule(gVar, j, timeUnit);
        }
        gVar.mo53365a(future);
        return gVar;
    }

    public C13716j(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f22133c = atomicReference;
        this.f22132b = threadFactory;
        atomicReference.lazySet(m31399d(threadFactory));
    }
}
