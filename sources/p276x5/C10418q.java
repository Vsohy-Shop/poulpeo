package p276x5;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: x5.q */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class C10418q implements Runnable {

    /* renamed from: b */
    final /* synthetic */ Task f15713b;

    /* renamed from: c */
    final /* synthetic */ C10419r f15714c;

    C10418q(C10419r rVar, Task task) {
        this.f15714c = rVar;
        this.f15713b = task;
    }

    public final void run() {
        try {
            Task task = (Task) this.f15714c.f15716b.mo39780a(this.f15713b);
            if (task == null) {
                this.f15714c.mo29406b(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C10408h.f15695b;
            task.mo35455f(executor, this.f15714c);
            task.mo35453d(executor, this.f15714c);
            task.mo35450a(executor, this.f15714c);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f15714c.f15717c.mo45101s((Exception) e.getCause());
            } else {
                this.f15714c.f15717c.mo45101s(e);
            }
        } catch (Exception e2) {
            this.f15714c.f15717c.mo45101s(e2);
        }
    }
}
