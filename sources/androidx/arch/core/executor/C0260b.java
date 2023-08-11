package androidx.arch.core.executor;

import java.util.concurrent.Executor;

/* renamed from: androidx.arch.core.executor.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0260b implements Executor {
    public final void execute(Runnable runnable) {
        ArchTaskExecutor.getInstance().executeOnDiskIO(runnable);
    }
}
