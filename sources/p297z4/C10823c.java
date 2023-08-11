package p297z4;

import android.os.Process;

/* renamed from: z4.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C10823c implements Runnable {

    /* renamed from: b */
    private final Runnable f16581b;

    public C10823c(Runnable runnable, int i) {
        this.f16581b = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.f16581b.run();
    }
}
