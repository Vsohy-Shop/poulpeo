package p294z1;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: z1.e */
/* compiled from: Executors */
public final class C10784e {

    /* renamed from: a */
    private static final Executor f16498a = new C10785a();

    /* renamed from: b */
    private static final Executor f16499b = new C10786b();

    /* renamed from: z1.e$a */
    /* compiled from: Executors */
    class C10785a implements Executor {

        /* renamed from: b */
        private final Handler f16500b = new Handler(Looper.getMainLooper());

        C10785a() {
        }

        public void execute(@NonNull Runnable runnable) {
            this.f16500b.post(runnable);
        }
    }

    /* renamed from: z1.e$b */
    /* compiled from: Executors */
    class C10786b implements Executor {
        C10786b() {
        }

        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m22929a() {
        return f16499b;
    }

    /* renamed from: b */
    public static Executor m22930b() {
        return f16498a;
    }
}
