package p276x5;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;

/* renamed from: x5.o */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class C10416o implements Runnable {

    /* renamed from: b */
    final /* synthetic */ Task f15708b;

    /* renamed from: c */
    final /* synthetic */ C10417p f15709c;

    C10416o(C10417p pVar, Task task) {
        this.f15709c = pVar;
        this.f15708b = task;
    }

    public final void run() {
        if (this.f15708b.mo35463n()) {
            this.f15709c.f15712c.mo45103u();
            return;
        }
        try {
            this.f15709c.f15712c.mo45102t(this.f15709c.f15711b.mo39780a(this.f15708b));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f15709c.f15712c.mo45101s((Exception) e.getCause());
            } else {
                this.f15709c.f15712c.mo45101s(e);
            }
        } catch (Exception e2) {
            this.f15709c.f15712c.mo45101s(e2);
        }
    }
}
