package p276x5;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: x5.z */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class C10427z<TResult> implements C10399c0<TResult> {

    /* renamed from: a */
    private final Executor f15734a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f15735b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10402e<? super TResult> f15736c;

    public C10427z(@NonNull Executor executor, @NonNull C10402e<? super TResult> eVar) {
        this.f15734a = executor;
        this.f15736c = eVar;
    }

    /* renamed from: c */
    public final void mo45091c(@NonNull Task<TResult> task) {
        if (task.mo35465p()) {
            synchronized (this.f15735b) {
                if (this.f15736c != null) {
                    this.f15734a.execute(new C10426y(this, task));
                }
            }
        }
    }
}
