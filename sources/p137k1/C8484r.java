package p137k1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p058d1.C7222g;
import p137k1.C8476n;
import p294z1.C10791j;

/* renamed from: k1.r */
/* compiled from: MultiModelLoaderFactory */
public class C8484r {

    /* renamed from: e */
    private static final C8487c f12087e = new C8487c();

    /* renamed from: f */
    private static final C8476n<Object, Object> f12088f = new C8485a();

    /* renamed from: a */
    private final List<C8486b<?, ?>> f12089a;

    /* renamed from: b */
    private final C8487c f12090b;

    /* renamed from: c */
    private final Set<C8486b<?, ?>> f12091c;

    /* renamed from: d */
    private final Pools.Pool<List<Throwable>> f12092d;

    /* renamed from: k1.r$a */
    /* compiled from: MultiModelLoaderFactory */
    private static class C8485a implements C8476n<Object, Object> {
        C8485a() {
        }

        /* renamed from: a */
        public boolean mo42457a(@NonNull Object obj) {
            return false;
        }

        @Nullable
        /* renamed from: b */
        public C8476n.C8477a<Object> mo42458b(@NonNull Object obj, int i, int i2, @NonNull C7222g gVar) {
            return null;
        }
    }

    /* renamed from: k1.r$b */
    /* compiled from: MultiModelLoaderFactory */
    private static class C8486b<Model, Data> {

        /* renamed from: a */
        private final Class<Model> f12093a;

        /* renamed from: b */
        final Class<Data> f12094b;

        /* renamed from: c */
        final C8478o<? extends Model, ? extends Data> f12095c;

        public C8486b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull C8478o<? extends Model, ? extends Data> oVar) {
            this.f12093a = cls;
            this.f12094b = cls2;
            this.f12095c = oVar;
        }

        /* renamed from: a */
        public boolean mo42522a(@NonNull Class<?> cls) {
            return this.f12093a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean mo42523b(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            if (!mo42522a(cls) || !this.f12094b.isAssignableFrom(cls2)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: k1.r$c */
    /* compiled from: MultiModelLoaderFactory */
    static class C8487c {
        C8487c() {
        }

        @NonNull
        /* renamed from: a */
        public <Model, Data> C8482q<Model, Data> mo42524a(@NonNull List<C8476n<Model, Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
            return new C8482q<>(list, pool);
        }
    }

    public C8484r(@NonNull Pools.Pool<List<Throwable>> pool) {
        this(pool, f12087e);
    }

    /* renamed from: a */
    private <Model, Data> void m16996a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull C8478o<? extends Model, ? extends Data> oVar, boolean z) {
        int i;
        C8486b bVar = new C8486b(cls, cls2, oVar);
        List<C8486b<?, ?>> list = this.f12089a;
        if (z) {
            i = list.size();
        } else {
            i = 0;
        }
        list.add(i, bVar);
    }

    @NonNull
    /* renamed from: e */
    private <Model, Data> C8476n<Model, Data> m16997e(@NonNull C8486b<?, ?> bVar) {
        return (C8476n) C10791j.m22948d(bVar.f12095c.mo42462b(this));
    }

    @NonNull
    /* renamed from: f */
    private static <Model, Data> C8476n<Model, Data> m16998f() {
        return f12088f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized <Model, Data> void mo42518b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull C8478o<? extends Model, ? extends Data> oVar) {
        m16996a(cls, cls2, oVar, true);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: c */
    public synchronized <Model> List<C8476n<Model, ?>> mo42519c(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C8486b next : this.f12089a) {
                if (!this.f12091c.contains(next)) {
                    if (next.mo42522a(cls)) {
                        this.f12091c.add(next);
                        arrayList.add(m16997e(next));
                        this.f12091c.remove(next);
                    }
                }
            }
        } catch (Throwable th) {
            this.f12091c.clear();
            throw th;
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: d */
    public synchronized <Model, Data> C8476n<Model, Data> mo42520d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C8486b next : this.f12089a) {
                if (this.f12091c.contains(next)) {
                    z = true;
                } else if (next.mo42523b(cls, cls2)) {
                    this.f12091c.add(next);
                    arrayList.add(m16997e(next));
                    this.f12091c.remove(next);
                }
            }
            if (arrayList.size() > 1) {
                return this.f12090b.mo42524a(arrayList, this.f12092d);
            } else if (arrayList.size() == 1) {
                return (C8476n) arrayList.get(0);
            } else if (z) {
                return m16998f();
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f12091c.clear();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: g */
    public synchronized List<Class<?>> mo42521g(@NonNull Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C8486b next : this.f12089a) {
            if (!arrayList.contains(next.f12094b) && next.mo42522a(cls)) {
                arrayList.add(next.f12094b);
            }
        }
        return arrayList;
    }

    @VisibleForTesting
    C8484r(@NonNull Pools.Pool<List<Throwable>> pool, @NonNull C8487c cVar) {
        this.f12089a = new ArrayList();
        this.f12091c = new HashSet();
        this.f12092d = pool;
        this.f12090b = cVar;
    }
}
