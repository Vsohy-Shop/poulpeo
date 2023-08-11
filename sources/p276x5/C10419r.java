package p276x5;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: x5.r */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class C10419r<TResult, TContinuationResult> implements C10402e<TContinuationResult>, C10400d, C10396b, C10399c0 {

    /* renamed from: a */
    private final Executor f15715a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C10394a<TResult, Task<TContinuationResult>> f15716b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10407g0<TContinuationResult> f15717c;

    public C10419r(@NonNull Executor executor, @NonNull C10394a<TResult, Task<TContinuationResult>> aVar, @NonNull C10407g0<TContinuationResult> g0Var) {
        this.f15715a = executor;
        this.f15716b = aVar;
        this.f15717c = g0Var;
    }

    /* renamed from: a */
    public final void mo29368a(TContinuationResult tcontinuationresult) {
        this.f15717c.mo45102t(tcontinuationresult);
    }

    /* renamed from: b */
    public final void mo29406b(@NonNull Exception exc) {
        this.f15717c.mo45101s(exc);
    }

    /* renamed from: c */
    public final void mo45091c(@NonNull Task<TResult> task) {
        this.f15715a.execute(new C10418q(this, task));
    }

    public final void onCanceled() {
        this.f15717c.mo45103u();
    }
}
