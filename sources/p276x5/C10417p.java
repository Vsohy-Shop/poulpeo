package p276x5;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: x5.p */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class C10417p<TResult, TContinuationResult> implements C10399c0<TResult> {

    /* renamed from: a */
    private final Executor f15710a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C10394a<TResult, TContinuationResult> f15711b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10407g0<TContinuationResult> f15712c;

    public C10417p(@NonNull Executor executor, @NonNull C10394a<TResult, TContinuationResult> aVar, @NonNull C10407g0<TContinuationResult> g0Var) {
        this.f15710a = executor;
        this.f15711b = aVar;
        this.f15712c = g0Var;
    }

    /* renamed from: c */
    public final void mo45091c(@NonNull Task<TResult> task) {
        this.f15710a.execute(new C10416o(this, task));
    }
}
