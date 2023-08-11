package p231t4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import p190p4.C9052b;
import p190p4.C9056e;
import p276x5.C10406g;

/* renamed from: t4.o */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C9709o {

    /* renamed from: a */
    private static final C9703m0 f14508a = new C9694j0();

    /* renamed from: t4.o$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C9710a<R extends C9056e, T> {
        @Nullable
        /* renamed from: a */
        T mo31860a(@NonNull R r);
    }

    @NonNull
    /* renamed from: a */
    public static <R extends C9056e, T> Task<T> m20263a(@NonNull C9052b<R> bVar, @NonNull C9710a<R, T> aVar) {
        C9703m0 m0Var = f14508a;
        C10406g gVar = new C10406g();
        bVar.mo32435b(new C9697k0(bVar, gVar, aVar, m0Var));
        return gVar.mo45096a();
    }

    @NonNull
    /* renamed from: b */
    public static <R extends C9056e> Task<Void> m20264b(@NonNull C9052b<R> bVar) {
        return m20263a(bVar, new C9700l0());
    }
}
