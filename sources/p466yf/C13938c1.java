package p466yf;

import java.util.concurrent.Future;

/* renamed from: yf.c1 */
/* compiled from: Executors.kt */
final class C13938c1 implements C13943d1 {

    /* renamed from: b */
    private final Future<?> f22858b;

    public C13938c1(Future<?> future) {
        this.f22858b = future;
    }

    public void dispose() {
        this.f22858b.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f22858b + ']';
    }
}
