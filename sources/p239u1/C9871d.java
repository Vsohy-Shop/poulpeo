package p239u1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p294z1.C10790i;

/* renamed from: u1.d */
/* compiled from: ModelToResourceClassCache */
public class C9871d {

    /* renamed from: a */
    private final AtomicReference<C10790i> f14758a = new AtomicReference<>();

    /* renamed from: b */
    private final ArrayMap<C10790i, List<Class<?>>> f14759b = new ArrayMap<>();

    @Nullable
    /* renamed from: a */
    public List<Class<?>> mo44394a(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3) {
        List<Class<?>> list;
        C10790i andSet = this.f14758a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new C10790i(cls, cls2, cls3);
        } else {
            andSet.mo45709a(cls, cls2, cls3);
        }
        synchronized (this.f14759b) {
            list = this.f14759b.get(andSet);
        }
        this.f14758a.set(andSet);
        return list;
    }

    /* renamed from: b */
    public void mo44395b(@NonNull Class<?> cls, @NonNull Class<?> cls2, @NonNull Class<?> cls3, @NonNull List<Class<?>> list) {
        synchronized (this.f14759b) {
            this.f14759b.put(new C10790i(cls, cls2, cls3), list);
        }
    }
}
