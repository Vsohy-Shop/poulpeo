package p276x5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;

/* renamed from: x5.g */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
public class C10406g<TResult> {

    /* renamed from: a */
    private final C10407g0<TResult> f15687a = new C10407g0<>();

    @NonNull
    /* renamed from: a */
    public Task<TResult> mo45096a() {
        return this.f15687a;
    }

    /* renamed from: b */
    public void mo45097b(@NonNull Exception exc) {
        this.f15687a.mo45101s(exc);
    }

    /* renamed from: c */
    public void mo45098c(@Nullable TResult tresult) {
        this.f15687a.mo45102t(tresult);
    }

    /* renamed from: d */
    public boolean mo45099d(@NonNull Exception exc) {
        return this.f15687a.mo45104v(exc);
    }

    /* renamed from: e */
    public boolean mo45100e(@Nullable TResult tresult) {
        return this.f15687a.mo45105w(tresult);
    }
}
