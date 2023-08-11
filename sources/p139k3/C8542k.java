package p139k3;

import java.util.concurrent.Executor;
import p169n3.C8901b;
import p169n3.C8903d;

/* renamed from: k3.k */
/* compiled from: ExecutionModule_ExecutorFactory */
public final class C8542k implements C8901b<Executor> {

    /* renamed from: k3.k$a */
    /* compiled from: ExecutionModule_ExecutorFactory */
    private static final class C8543a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C8542k f12202a = new C8542k();
    }

    /* renamed from: a */
    public static C8542k m17146a() {
        return C8543a.f12202a;
    }

    /* renamed from: b */
    public static Executor m17147b() {
        return (Executor) C8903d.m18035c(C8541j.m17145a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public Executor get() {
        return m17147b();
    }
}
