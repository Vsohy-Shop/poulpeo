package p239u1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p058d1.C7225j;

/* renamed from: u1.f */
/* compiled from: ResourceEncoderRegistry */
public class C9874f {

    /* renamed from: a */
    private final List<C9875a<?>> f14765a = new ArrayList();

    /* renamed from: u1.f$a */
    /* compiled from: ResourceEncoderRegistry */
    private static final class C9875a<T> {

        /* renamed from: a */
        private final Class<T> f14766a;

        /* renamed from: b */
        final C7225j<T> f14767b;

        C9875a(@NonNull Class<T> cls, @NonNull C7225j<T> jVar) {
            this.f14766a = cls;
            this.f14767b = jVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo44403a(@NonNull Class<?> cls) {
            return this.f14766a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> void mo44401a(@NonNull Class<Z> cls, @NonNull C7225j<Z> jVar) {
        this.f14765a.add(new C9875a(cls, jVar));
    }

    @Nullable
    /* renamed from: b */
    public synchronized <Z> C7225j<Z> mo44402b(@NonNull Class<Z> cls) {
        int size = this.f14765a.size();
        for (int i = 0; i < size; i++) {
            C9875a aVar = this.f14765a.get(i);
            if (aVar.mo44403a(cls)) {
                return aVar.f14767b;
            }
        }
        return null;
    }
}
