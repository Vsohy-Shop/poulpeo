package p466yf;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12079g;

@SourceDebugExtension({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BlockingCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* renamed from: yf.f */
/* compiled from: Builders.kt */
final class C13953f<T> extends C13926a<T> {

    /* renamed from: e */
    private final Thread f22868e;

    /* renamed from: f */
    private final C13974h1 f22869f;

    public C13953f(C12079g gVar, Thread thread, C13974h1 h1Var) {
        super(gVar, true, true);
        this.f22868e = thread;
        this.f22869f = h1Var;
    }

    /* renamed from: L0 */
    public final T mo53697L0() {
        long j;
        C13936c.m32231a();
        try {
            C13974h1 h1Var = this.f22869f;
            C13932b0 b0Var = null;
            if (h1Var != null) {
                C13974h1.m32382z0(h1Var, false, 1, (Object) null);
            }
            while (!Thread.interrupted()) {
                C13974h1 h1Var2 = this.f22869f;
                if (h1Var2 != null) {
                    j = h1Var2.mo53751C0();
                } else {
                    j = LocationRequestCompat.PASSIVE_INTERVAL;
                }
                if (!mo53716j0()) {
                    C13936c.m32231a();
                    LockSupport.parkNanos(this, j);
                } else {
                    C13974h1 h1Var3 = this.f22869f;
                    if (h1Var3 != null) {
                        C13974h1.m32380u0(h1Var3, false, 1, (Object) null);
                    }
                    C13936c.m32231a();
                    T h = C13969g2.m32371h(mo53707T());
                    if (h instanceof C13932b0) {
                        b0Var = (C13932b0) h;
                    }
                    if (b0Var == null) {
                        return h;
                    }
                    throw b0Var.f22850a;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            mo53725w(interruptedException);
            throw interruptedException;
        } catch (Throwable th) {
            C13936c.m32231a();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public boolean mo48981b0() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo48982t(Object obj) {
        if (!C12775o.m28634d(Thread.currentThread(), this.f22868e)) {
            Thread thread = this.f22868e;
            C13936c.m32231a();
            LockSupport.unpark(thread);
        }
    }
}
