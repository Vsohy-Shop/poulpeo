package p276x5;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: x5.v */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class C10423v<TResult> implements C10399c0<TResult> {

    /* renamed from: a */
    private final Executor f15724a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f15725b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10398c<TResult> f15726c;

    public C10423v(@NonNull Executor executor, @NonNull C10398c<TResult> cVar) {
        this.f15724a = executor;
        this.f15726c = cVar;
    }

    /* renamed from: c */
    public final void mo45091c(@NonNull Task<TResult> task) {
        synchronized (this.f15725b) {
            if (this.f15726c != null) {
                this.f15724a.execute(new C10422u(this, task));
            }
        }
    }
}
