package p099g6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: g6.n */
final class C7792n implements Executor {

    /* renamed from: b */
    private final Handler f10830b = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f10830b.post(runnable);
    }
}
