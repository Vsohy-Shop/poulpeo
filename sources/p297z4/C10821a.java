package p297z4;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import p141k5.C8567e;

/* renamed from: z4.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C10821a implements Executor {

    /* renamed from: b */
    private final Handler f16578b;

    public C10821a(@NonNull Looper looper) {
        this.f16578b = new C8567e(looper);
    }

    public final void execute(@NonNull Runnable runnable) {
        this.f16578b.post(runnable);
    }
}
