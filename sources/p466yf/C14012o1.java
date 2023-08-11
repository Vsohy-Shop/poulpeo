package p466yf;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p331dg.C11819c;
import p336ef.C11921v;
import p355hf.C12079g;

/* renamed from: yf.o1 */
/* compiled from: Executors.kt */
public final class C14012o1 extends C14006n1 implements C14035u0 {

    /* renamed from: c */
    private final Executor f22939c;

    public C14012o1(Executor executor) {
        this.f22939c = executor;
        C11819c.m25428a(mo49424t0());
    }

    /* renamed from: u0 */
    private final void m32512u0(C12079g gVar, RejectedExecutionException rejectedExecutionException) {
        C13934b2.m32215c(gVar, C14000m1.m32454a("The task was rejected", rejectedExecutionException));
    }

    /* renamed from: v0 */
    private final ScheduledFuture<?> m32513v0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, C12079g gVar, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            m32512u0(gVar, e);
            return null;
        }
    }

    /* renamed from: b */
    public void mo49020b(long j, C14002n<? super C11921v> nVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor t0 = mo49424t0();
        ScheduledFuture<?> scheduledFuture = null;
        if (t0 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) t0;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = m32513v0(scheduledExecutorService, new C14025r2(this, nVar), nVar.getContext(), j);
        }
        if (scheduledFuture != null) {
            C13934b2.m32222j(nVar, scheduledFuture);
        } else {
            C14019q0.f22942h.mo49020b(j, nVar);
        }
    }

    /* renamed from: c */
    public C13943d1 mo49021c(long j, Runnable runnable, C12079g gVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor t0 = mo49424t0();
        ScheduledFuture<?> scheduledFuture = null;
        if (t0 instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) t0;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = m32513v0(scheduledExecutorService, runnable, gVar, j);
        }
        if (scheduledFuture != null) {
            return new C13938c1(scheduledFuture);
        }
        return C14019q0.f22942h.mo49021c(j, runnable, gVar);
    }

    public void close() {
        ExecutorService executorService;
        Executor t0 = mo49424t0();
        if (t0 instanceof ExecutorService) {
            executorService = (ExecutorService) t0;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public void dispatch(C12079g gVar, Runnable runnable) {
        try {
            Executor t0 = mo49424t0();
            C13936c.m32231a();
            t0.execute(runnable);
        } catch (RejectedExecutionException e) {
            C13936c.m32231a();
            m32512u0(gVar, e);
            C13933b1.m32211b().dispatch(gVar, runnable);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C14012o1) || ((C14012o1) obj).mo49424t0() != mo49424t0()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return System.identityHashCode(mo49424t0());
    }

    /* renamed from: t0 */
    public Executor mo49424t0() {
        return this.f22939c;
    }

    public String toString() {
        return mo49424t0().toString();
    }
}
