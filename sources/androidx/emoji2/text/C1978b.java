package androidx.emoji2.text;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: androidx.emoji2.text.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1978b implements Executor {

    /* renamed from: b */
    public final /* synthetic */ Handler f549b;

    public /* synthetic */ C1978b(Handler handler) {
        this.f549b = handler;
    }

    public final void execute(Runnable runnable) {
        this.f549b.post(runnable);
    }
}
