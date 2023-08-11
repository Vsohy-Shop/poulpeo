package p276x5;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: x5.a0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class C10395a0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ Task f15678b;

    /* renamed from: c */
    final /* synthetic */ C10397b0 f15679c;

    C10395a0(C10397b0 b0Var, Task task) {
        this.f15679c = b0Var;
        this.f15678b = task;
    }

    public final void run() {
        try {
            Task a = this.f15679c.f15681b.mo29941a(this.f15678b.mo35461l());
            if (a == null) {
                this.f15679c.mo29406b(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C10408h.f15695b;
            a.mo35455f(executor, this.f15679c);
            a.mo35453d(executor, this.f15679c);
            a.mo35450a(executor, this.f15679c);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f15679c.mo29406b((Exception) e.getCause());
            } else {
                this.f15679c.mo29406b(e);
            }
        } catch (CancellationException unused) {
            this.f15679c.onCanceled();
        } catch (Exception e2) {
            this.f15679c.mo29406b(e2);
        }
    }
}
