package p276x5;

import com.google.android.gms.tasks.Task;

/* renamed from: x5.y */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class C10426y implements Runnable {

    /* renamed from: b */
    final /* synthetic */ Task f15732b;

    /* renamed from: c */
    final /* synthetic */ C10427z f15733c;

    C10426y(C10427z zVar, Task task) {
        this.f15733c = zVar;
        this.f15732b = task;
    }

    public final void run() {
        synchronized (this.f15733c.f15735b) {
            C10427z zVar = this.f15733c;
            if (zVar.f15736c != null) {
                zVar.f15736c.mo29368a(this.f15732b.mo35461l());
            }
        }
    }
}
