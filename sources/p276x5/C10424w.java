package p276x5;

import com.google.android.gms.tasks.Task;
import p231t4.C9713p;

/* renamed from: x5.w */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class C10424w implements Runnable {

    /* renamed from: b */
    final /* synthetic */ Task f15727b;

    /* renamed from: c */
    final /* synthetic */ C10425x f15728c;

    C10424w(C10425x xVar, Task task) {
        this.f15728c = xVar;
        this.f15727b = task;
    }

    public final void run() {
        synchronized (this.f15728c.f15730b) {
            C10425x xVar = this.f15728c;
            if (xVar.f15731c != null) {
                xVar.f15731c.mo29406b((Exception) C9713p.m20275j(this.f15727b.mo35460k()));
            }
        }
    }
}
