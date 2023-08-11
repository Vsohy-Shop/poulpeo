package p190p4;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import p190p4.C9056e;

/* renamed from: p4.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C9052b<R extends C9056e> {

    /* renamed from: p4.b$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C9053a {
        /* renamed from: a */
        void mo32523a(@NonNull Status status);
    }

    /* renamed from: b */
    public abstract void mo32435b(@NonNull C9053a aVar);

    @NonNull
    /* renamed from: c */
    public abstract R mo32436c(long j, @NonNull TimeUnit timeUnit);

    /* renamed from: d */
    public abstract void mo32437d();

    /* renamed from: e */
    public abstract void mo32438e(@NonNull C9057f<? super R> fVar);
}
