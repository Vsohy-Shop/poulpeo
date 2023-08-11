package p466yf;

import java.util.concurrent.Executor;
import p355hf.C12085h;

/* renamed from: yf.a1 */
/* compiled from: Executors.kt */
final class C13928a1 implements Executor {

    /* renamed from: b */
    public final C13971h0 f22846b;

    public C13928a1(C13971h0 h0Var) {
        this.f22846b = h0Var;
    }

    public void execute(Runnable runnable) {
        C13971h0 h0Var = this.f22846b;
        C12085h hVar = C12085h.f18916b;
        if (h0Var.isDispatchNeeded(hVar)) {
            this.f22846b.dispatch(hVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f22846b.toString();
    }
}
