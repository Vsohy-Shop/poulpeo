package p198q2;

import com.facebook.FacebookSdk;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.C12775o;

/* renamed from: q2.u */
/* compiled from: LockOnGetVariable.kt */
public final class C9192u<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public T f13499a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public CountDownLatch f13500b;

    /* renamed from: q2.u$a */
    /* compiled from: LockOnGetVariable.kt */
    static final class C9193a<V> implements Callable {

        /* renamed from: b */
        final /* synthetic */ C9192u f13501b;

        /* renamed from: c */
        final /* synthetic */ Callable f13502c;

        C9193a(C9192u uVar, Callable callable) {
            this.f13501b = uVar;
            this.f13502c = callable;
        }

        /* renamed from: a */
        public final Void call() {
            try {
                this.f13501b.f13499a = this.f13502c.call();
            } finally {
                CountDownLatch a = this.f13501b.f13500b;
                if (a != null) {
                    a.countDown();
                }
            }
        }
    }

    public C9192u(T t) {
        this.f13499a = t;
    }

    /* renamed from: d */
    private final void m18825d() {
        CountDownLatch countDownLatch = this.f13500b;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: c */
    public final T mo43472c() {
        m18825d();
        return this.f13499a;
    }

    public C9192u(Callable<T> callable) {
        C12775o.m28639i(callable, "callable");
        this.f13500b = new CountDownLatch(1);
        FacebookSdk.getExecutor().execute(new FutureTask(new C9193a(this, callable)));
    }
}
