package p276x5;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: x5.x */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class C10425x<TResult> implements C10399c0<TResult> {

    /* renamed from: a */
    private final Executor f15729a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f15730b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10400d f15731c;

    public C10425x(@NonNull Executor executor, @NonNull C10400d dVar) {
        this.f15729a = executor;
        this.f15731c = dVar;
    }

    /* renamed from: c */
    public final void mo45091c(@NonNull Task<TResult> task) {
        if (!task.mo35465p() && !task.mo35463n()) {
            synchronized (this.f15730b) {
                if (this.f15731c != null) {
                    this.f15729a.execute(new C10424w(this, task));
                }
            }
        }
    }
}
