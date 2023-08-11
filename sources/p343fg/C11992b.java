package p343fg;

import java.util.concurrent.Executor;
import p331dg.C11830h0;
import p355hf.C12079g;
import p355hf.C12085h;
import p466yf.C13971h0;
import p466yf.C14006n1;

/* renamed from: fg.b */
/* compiled from: Dispatcher.kt */
public final class C11992b extends C14006n1 implements Executor {

    /* renamed from: c */
    public static final C11992b f18741c = new C11992b();

    /* renamed from: d */
    private static final C13971h0 f18742d = C12003m.f18762b.limitedParallelism(C11834j0.m25489e("kotlinx.coroutines.io.parallelism", C13537l.m30877d(64, C11830h0.m25460a()), 0, 0, 12, (Object) null));

    private C11992b() {
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public void dispatch(C12079g gVar, Runnable runnable) {
        f18742d.dispatch(gVar, runnable);
    }

    public void dispatchYield(C12079g gVar, Runnable runnable) {
        f18742d.dispatchYield(gVar, runnable);
    }

    public void execute(Runnable runnable) {
        dispatch(C12085h.f18916b, runnable);
    }

    public C13971h0 limitedParallelism(int i) {
        return C12003m.f18762b.limitedParallelism(i);
    }

    public String toString() {
        return "Dispatchers.IO";
    }

    /* renamed from: t0 */
    public Executor mo49424t0() {
        return this;
    }
}
