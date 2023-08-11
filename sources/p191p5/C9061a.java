package p191p5;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.measurement.C6061z2;
import java.util.List;
import java.util.Map;
import p201q5.C9271r;

/* renamed from: p5.a */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
public class C9061a {

    /* renamed from: a */
    private final C6061z2 f13183a;

    /* renamed from: p5.a$a */
    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
    public interface C9062a extends C9271r {
    }

    public C9061a(C6061z2 z2Var) {
        this.f13183a = z2Var;
    }

    /* renamed from: a */
    public void mo43270a(@Size(max = 24, min = 1) @NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        this.f13183a.mo34654H(str, str2, bundle);
    }

    @WorkerThread
    @NonNull
    /* renamed from: b */
    public List<Bundle> mo43271b(@Nullable String str, @Size(max = 23, min = 1) @Nullable String str2) {
        return this.f13183a.mo34651B(str, str2);
    }

    @WorkerThread
    /* renamed from: c */
    public int mo43272c(@Size(min = 1) @NonNull String str) {
        return this.f13183a.mo34668q(str);
    }

    @WorkerThread
    @NonNull
    /* renamed from: d */
    public Map<String, Object> mo43273d(@Nullable String str, @Size(max = 24, min = 1) @Nullable String str2, boolean z) {
        return this.f13183a.mo34652C(str, str2, z);
    }

    /* renamed from: e */
    public void mo43274e(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f13183a.mo34657K(str, str2, bundle);
    }

    /* renamed from: f */
    public void mo43275f(@NonNull C9062a aVar) {
        this.f13183a.mo34660b(aVar);
    }

    /* renamed from: g */
    public void mo43276g(@NonNull Bundle bundle) {
        this.f13183a.mo34661c(bundle);
    }

    /* renamed from: h */
    public void mo43277h(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        this.f13183a.mo34667i(str, str2, obj, true);
    }

    /* renamed from: i */
    public final void mo43278i(boolean z) {
        this.f13183a.mo34663e(z);
    }
}
