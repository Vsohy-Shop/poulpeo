package p276x5;

import com.google.android.gms.tasks.Task;

/* renamed from: x5.u */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class C10422u implements Runnable {

    /* renamed from: b */
    final /* synthetic */ Task f15722b;

    /* renamed from: c */
    final /* synthetic */ C10423v f15723c;

    C10422u(C10423v vVar, Task task) {
        this.f15723c = vVar;
        this.f15722b = task;
    }

    public final void run() {
        synchronized (this.f15723c.f15725b) {
            C10423v vVar = this.f15723c;
            if (vVar.f15726c != null) {
                vVar.f15726c.mo28794a(this.f15722b);
            }
        }
    }
}
