package p453we;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p307af.C10885a;
import p341fe.C11962r;
import p361ie.C12141b;
import p391me.C12935a;
import p391me.C12937c;

/* renamed from: we.e */
/* compiled from: NewThreadWorker */
public class C13708e extends C11962r.C11964b {

    /* renamed from: b */
    private final ScheduledExecutorService f22114b;

    /* renamed from: c */
    volatile boolean f22115c;

    public C13708e(ThreadFactory threadFactory) {
        this.f22114b = C13713i.m31394a(threadFactory);
    }

    /* renamed from: b */
    public C12141b mo49267b(Runnable runnable) {
        return mo49268c(runnable, 0, (TimeUnit) null);
    }

    /* renamed from: c */
    public C12141b mo49268c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f22115c) {
            return C12937c.INSTANCE;
        }
        return mo53378d(runnable, j, timeUnit, (C12935a) null);
    }

    /* renamed from: d */
    public C13712h mo53378d(Runnable runnable, long j, TimeUnit timeUnit, C12935a aVar) {
        Future future;
        C13712h hVar = new C13712h(C10885a.m23272s(runnable), aVar);
        if (aVar != null && !aVar.mo49583c(hVar)) {
            return hVar;
        }
        if (j <= 0) {
            try {
                future = this.f22114b.submit(hVar);
            } catch (RejectedExecutionException e) {
                if (aVar != null) {
                    aVar.mo49582b(hVar);
                }
                C10885a.m23270q(e);
            }
        } else {
            future = this.f22114b.schedule(hVar, j, timeUnit);
        }
        hVar.mo53385a(future);
        return hVar;
    }

    public void dispose() {
        if (!this.f22115c) {
            this.f22115c = true;
            this.f22114b.shutdownNow();
        }
    }

    /* renamed from: e */
    public C12141b mo53379e(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C13711g gVar = new C13711g(C10885a.m23272s(runnable));
        if (j <= 0) {
            try {
                future = this.f22114b.submit(gVar);
            } catch (RejectedExecutionException e) {
                C10885a.m23270q(e);
                return C12937c.INSTANCE;
            }
        } else {
            future = this.f22114b.schedule(gVar, j, timeUnit);
        }
        gVar.mo53365a(future);
        return gVar;
    }

    /* renamed from: f */
    public void mo53380f() {
        if (!this.f22115c) {
            this.f22115c = true;
            this.f22114b.shutdown();
        }
    }

    public boolean isDisposed() {
        return this.f22115c;
    }
}
