package p453we;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p361ie.C12141b;
import p397ne.C12999a;

/* renamed from: we.a */
/* compiled from: AbstractDirectTask */
abstract class C13698a extends AtomicReference<Future<?>> implements C12141b {

    /* renamed from: d */
    protected static final FutureTask<Void> f22076d;

    /* renamed from: e */
    protected static final FutureTask<Void> f22077e;
    private static final long serialVersionUID = 1811839108042568751L;

    /* renamed from: b */
    protected final Runnable f22078b;

    /* renamed from: c */
    protected Thread f22079c;

    static {
        Runnable runnable = C12999a.f20801b;
        f22076d = new FutureTask<>(runnable, (Object) null);
        f22077e = new FutureTask<>(runnable, (Object) null);
    }

    C13698a(Runnable runnable) {
        this.f22078b = runnable;
    }

    /* renamed from: a */
    public final void mo53365a(Future<?> future) {
        Future future2;
        boolean z;
        do {
            future2 = (Future) get();
            if (future2 != f22076d) {
                if (future2 == f22077e) {
                    if (this.f22079c != Thread.currentThread()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    future.cancel(z);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    public final void dispose() {
        FutureTask<Void> futureTask;
        boolean z;
        Future future = (Future) get();
        if (future != f22076d && future != (futureTask = f22077e) && compareAndSet(future, futureTask) && future != null) {
            if (this.f22079c != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            future.cancel(z);
        }
    }

    public final boolean isDisposed() {
        Future future = (Future) get();
        if (future == f22076d || future == f22077e) {
            return true;
        }
        return false;
    }
}
