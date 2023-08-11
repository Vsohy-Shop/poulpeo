package p151l5;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import p153l7.C8749c;
import p153l7.C8751e;
import p163m7.C8832b;

/* renamed from: l5.w */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final class C8740w implements C8832b<C8740w> {

    /* renamed from: d */
    private static final C8749c<Object> f12581d = C8739v.f12580a;

    /* renamed from: e */
    public static final /* synthetic */ int f12582e = 0;

    /* renamed from: a */
    private final Map<Class<?>, C8749c<?>> f12583a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, C8751e<?>> f12584b = new HashMap();

    /* renamed from: c */
    private final C8749c<Object> f12585c = f12581d;

    @NonNull
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C8832b mo42878a(@NonNull Class cls, @NonNull C8749c cVar) {
        this.f12583a.put(cls, cVar);
        this.f12584b.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final C8741x mo42879b() {
        return new C8741x(new HashMap(this.f12583a), new HashMap(this.f12584b), this.f12585c);
    }
}
