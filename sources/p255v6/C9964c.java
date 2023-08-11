package p255v6;

import android.os.Process;

/* renamed from: v6.c */
/* compiled from: BackgroundPriorityRunnable */
public abstract class C9964c implements Runnable {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo44516a();

    public final void run() {
        Process.setThreadPriority(10);
        mo44516a();
    }
}
