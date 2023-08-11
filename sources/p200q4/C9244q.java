package p200q4;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.C4719a.C4723d;
import com.google.android.gms.common.api.C4730b;
import com.google.android.gms.common.api.internal.C4742b;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p190p4.C9056e;

/* renamed from: q4.q */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9244q<O extends C4719a.C4723d> extends C9241n {
    @NotOnlyInitialized

    /* renamed from: c */
    private final C4730b<O> f13587c;

    public C9244q(C4730b<O> bVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f13587c = bVar;
    }

    /* renamed from: a */
    public final <A extends C4719a.C4721b, T extends C4742b<? extends C9056e, A>> T mo32427a(@NonNull T t) {
        return this.f13587c.mo32414n(t);
    }

    /* renamed from: c */
    public final Looper mo32428c() {
        return this.f13587c.mo32420t();
    }
}
