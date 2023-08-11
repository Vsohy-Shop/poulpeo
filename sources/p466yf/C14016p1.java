package p466yf;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: yf.p1 */
/* compiled from: Executors.kt */
public final class C14016p1 {
    /* renamed from: a */
    public static final Executor m32521a(C13971h0 h0Var) {
        C14006n1 n1Var;
        Executor t0;
        if (h0Var instanceof C14006n1) {
            n1Var = (C14006n1) h0Var;
        } else {
            n1Var = null;
        }
        if (n1Var == null || (t0 = n1Var.mo49424t0()) == null) {
            return new C13928a1(h0Var);
        }
        return t0;
    }

    /* renamed from: b */
    public static final C14006n1 m32522b(ExecutorService executorService) {
        return new C14012o1(executorService);
    }
}
