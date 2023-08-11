package p466yf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;

/* renamed from: yf.w1 */
/* compiled from: JobSupport.kt */
final class C14046w1 extends C14060z1 {

    /* renamed from: g */
    private static final AtomicIntegerFieldUpdater f22959g = AtomicIntegerFieldUpdater.newUpdater(C14046w1.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: f */
    private final Function1<Throwable, C11921v> f22960f;

    public C14046w1(Function1<? super Throwable, C11921v> function1) {
        this.f22960f = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo53691s((Throwable) obj);
        return C11921v.f18618a;
    }

    /* renamed from: s */
    public void mo53691s(Throwable th) {
        if (f22959g.compareAndSet(this, 0, 1)) {
            this.f22960f.invoke(th);
        }
    }
}
