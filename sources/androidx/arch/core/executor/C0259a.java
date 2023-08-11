package androidx.arch.core.executor;

import java.util.concurrent.Executor;

/* renamed from: androidx.arch.core.executor.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0259a implements Executor {
    public final void execute(Runnable runnable) {
        ArchTaskExecutor.getInstance().postToMainThread(runnable);
    }
}
