package p287y5;

import java.util.concurrent.ThreadFactory;

/* renamed from: y5.c */
final /* synthetic */ class C10689c implements ThreadFactory {

    /* renamed from: b */
    static final ThreadFactory f16275b = new C10689c();

    private C10689c() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AssetPackBackgroundExecutor");
    }
}
