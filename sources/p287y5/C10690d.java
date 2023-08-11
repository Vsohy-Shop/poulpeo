package p287y5;

import java.util.concurrent.ThreadFactory;

/* renamed from: y5.d */
final /* synthetic */ class C10690d implements ThreadFactory {

    /* renamed from: b */
    static final ThreadFactory f16276b = new C10690d();

    private C10690d() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "UpdateListenerExecutor");
    }
}
