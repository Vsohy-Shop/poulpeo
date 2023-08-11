package p276x5;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: x5.b0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class C10397b0<TResult, TContinuationResult> implements C10402e<TContinuationResult>, C10400d, C10396b, C10399c0 {

    /* renamed from: a */
    private final Executor f15680a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C10404f<TResult, TContinuationResult> f15681b;

    /* renamed from: c */
    private final C10407g0<TContinuationResult> f15682c;

    public C10397b0(@NonNull Executor executor, @NonNull C10404f<TResult, TContinuationResult> fVar, @NonNull C10407g0<TContinuationResult> g0Var) {
        this.f15680a = executor;
        this.f15681b = fVar;
        this.f15682c = g0Var;
    }

    /* renamed from: a */
    public final void mo29368a(TContinuationResult tcontinuationresult) {
        this.f15682c.mo45102t(tcontinuationresult);
    }

    /* renamed from: b */
    public final void mo29406b(@NonNull Exception exc) {
        this.f15682c.mo45101s(exc);
    }

    /* renamed from: c */
    public final void mo45091c(@NonNull Task<TResult> task) {
        this.f15680a.execute(new C10395a0(this, task));
    }

    public final void onCanceled() {
        this.f15682c.mo45103u();
    }
}
