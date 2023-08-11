package p276x5;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: x5.t */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class C10421t<TResult> implements C10399c0<TResult> {

    /* renamed from: a */
    private final Executor f15719a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f15720b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10396b f15721c;

    public C10421t(@NonNull Executor executor, @NonNull C10396b bVar) {
        this.f15719a = executor;
        this.f15721c = bVar;
    }

    /* renamed from: c */
    public final void mo45091c(@NonNull Task<TResult> task) {
        if (task.mo35463n()) {
            synchronized (this.f15720b) {
                if (this.f15721c != null) {
                    this.f15719a.execute(new C10420s(this));
                }
            }
        }
    }
}
