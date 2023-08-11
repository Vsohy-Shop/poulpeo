package p453we;

import java.util.concurrent.Callable;

/* renamed from: we.g */
/* compiled from: ScheduledDirectTask */
public final class C13711g extends C13698a implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public C13711g(Runnable runnable) {
        super(runnable);
    }

    /* renamed from: b */
    public Void call() {
        this.f22079c = Thread.currentThread();
        try {
            this.f22078b.run();
            return null;
        } finally {
            lazySet(C13698a.f22076d);
            this.f22079c = null;
        }
    }
}
