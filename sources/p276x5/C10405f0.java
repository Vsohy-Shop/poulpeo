package p276x5;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import p181o5.C8998a;

/* renamed from: x5.f0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class C10405f0 implements Executor {

    /* renamed from: b */
    private final Handler f15686b = new C8998a(Looper.getMainLooper());

    public final void execute(@NonNull Runnable runnable) {
        this.f15686b.post(runnable);
    }
}
