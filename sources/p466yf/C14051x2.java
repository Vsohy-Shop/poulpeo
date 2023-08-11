package p466yf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;

/* renamed from: yf.x2 */
/* compiled from: Interruptible.kt */
final class C14051x2 implements Function1<Throwable, C11921v> {

    /* renamed from: e */
    private static final AtomicIntegerFieldUpdater f22965e = AtomicIntegerFieldUpdater.newUpdater(C14051x2.class, "_state");
    private volatile int _state;

    /* renamed from: b */
    private final C14054y1 f22966b;

    /* renamed from: c */
    private final Thread f22967c = Thread.currentThread();

    /* renamed from: d */
    private C13943d1 f22968d;

    public C14051x2(C14054y1 y1Var) {
        this.f22966b = y1Var;
    }

    /* renamed from: b */
    private final Void m32582b(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    /* renamed from: a */
    public final void mo53816a() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22965e;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m32582b(i);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f22965e.compareAndSet(this, i, 1)) {
                C13943d1 d1Var = this.f22968d;
                if (d1Var != null) {
                    d1Var.dispose();
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo53817c(Throwable th) {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f22965e;
        do {
            i = atomicIntegerFieldUpdater2.get(this);
            if (i == 0) {
                atomicIntegerFieldUpdater = f22965e;
            } else if (i != 1 && i != 2 && i != 3) {
                m32582b(i);
                throw new KotlinNothingValueException();
            } else {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.f22967c.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    /* renamed from: d */
    public final void mo53818d() {
        int i;
        this.f22968d = this.f22966b.mo53717k(true, true, this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22965e;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2 && i != 3) {
                    m32582b(i);
                    throw new KotlinNothingValueException();
                }
                return;
            }
        } while (!f22965e.compareAndSet(this, i, 0));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo53817c((Throwable) obj);
        return C11921v.f18618a;
    }
}
