package p239u1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p058d1.C7217d;

/* renamed from: u1.a */
/* compiled from: EncoderRegistry */
public class C9867a {

    /* renamed from: a */
    private final List<C9868a<?>> f14751a = new ArrayList();

    /* renamed from: u1.a$a */
    /* compiled from: EncoderRegistry */
    private static final class C9868a<T> {

        /* renamed from: a */
        private final Class<T> f14752a;

        /* renamed from: b */
        final C7217d<T> f14753b;

        C9868a(@NonNull Class<T> cls, @NonNull C7217d<T> dVar) {
            this.f14752a = cls;
            this.f14753b = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo44388a(@NonNull Class<?> cls) {
            return this.f14752a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> void mo44386a(@NonNull Class<T> cls, @NonNull C7217d<T> dVar) {
        this.f14751a.add(new C9868a(cls, dVar));
    }

    @Nullable
    /* renamed from: b */
    public synchronized <T> C7217d<T> mo44387b(@NonNull Class<T> cls) {
        for (C9868a next : this.f14751a) {
            if (next.mo44388a(cls)) {
                return next.f14753b;
            }
        }
        return null;
    }
}
