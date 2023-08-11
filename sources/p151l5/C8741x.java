package p151l5;

import androidx.annotation.NonNull;
import java.io.OutputStream;
import java.util.Map;
import p153l7.C8749c;
import p153l7.C8751e;

/* renamed from: l5.x */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final class C8741x {

    /* renamed from: a */
    private final Map<Class<?>, C8749c<?>> f12586a;

    /* renamed from: b */
    private final Map<Class<?>, C8751e<?>> f12587b;

    /* renamed from: c */
    private final C8749c<Object> f12588c;

    C8741x(Map<Class<?>, C8749c<?>> map, Map<Class<?>, C8751e<?>> map2, C8749c<Object> cVar) {
        this.f12586a = map;
        this.f12587b = map2;
        this.f12588c = cVar;
    }

    /* renamed from: a */
    public final void mo42880a(@NonNull Object obj, @NonNull OutputStream outputStream) {
        new C8738u(outputStream, this.f12586a, this.f12587b, this.f12588c).mo42877j(obj);
    }
}
