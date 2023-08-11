package p137k1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: k1.p */
/* compiled from: ModelLoaderRegistry */
public class C8479p {

    /* renamed from: a */
    private final C8484r f12074a;

    /* renamed from: b */
    private final C8480a f12075b;

    /* renamed from: k1.p$a */
    /* compiled from: ModelLoaderRegistry */
    private static class C8480a {

        /* renamed from: a */
        private final Map<Class<?>, C8481a<?>> f12076a = new HashMap();

        /* renamed from: k1.p$a$a */
        /* compiled from: ModelLoaderRegistry */
        private static class C8481a<Model> {

            /* renamed from: a */
            final List<C8476n<Model, ?>> f12077a;

            public C8481a(List<C8476n<Model, ?>> list) {
                this.f12077a = list;
            }
        }

        C8480a() {
        }

        /* renamed from: a */
        public void mo42514a() {
            this.f12076a.clear();
        }

        @Nullable
        /* renamed from: b */
        public <Model> List<C8476n<Model, ?>> mo42515b(Class<Model> cls) {
            C8481a aVar = this.f12076a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f12077a;
        }

        /* renamed from: c */
        public <Model> void mo42516c(Class<Model> cls, List<C8476n<Model, ?>> list) {
            if (this.f12076a.put(cls, new C8481a(list)) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    public C8479p(@NonNull Pools.Pool<List<Throwable>> pool) {
        this(new C8484r(pool));
    }

    @NonNull
    /* renamed from: b */
    private static <A> Class<A> m16979b(@NonNull A a) {
        return a.getClass();
    }

    @NonNull
    /* renamed from: e */
    private synchronized <A> List<C8476n<A, ?>> m16980e(@NonNull Class<A> cls) {
        List<C8476n<A, ?>> b;
        b = this.f12075b.mo42515b(cls);
        if (b == null) {
            b = Collections.unmodifiableList(this.f12074a.mo42519c(cls));
            this.f12075b.mo42516c(cls, b);
        }
        return b;
    }

    /* renamed from: a */
    public synchronized <Model, Data> void mo42511a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull C8478o<? extends Model, ? extends Data> oVar) {
        this.f12074a.mo42518b(cls, cls2, oVar);
        this.f12075b.mo42514a();
    }

    @NonNull
    /* renamed from: c */
    public synchronized List<Class<?>> mo42512c(@NonNull Class<?> cls) {
        return this.f12074a.mo42521g(cls);
    }

    @NonNull
    /* renamed from: d */
    public <A> List<C8476n<A, ?>> mo42513d(@NonNull A a) {
        List e = m16980e(m16979b(a));
        if (!e.isEmpty()) {
            int size = e.size();
            List<C8476n<A, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                C8476n nVar = (C8476n) e.get(i);
                if (nVar.mo42457a(a)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new Registry.NoModelLoaderAvailableException(a, e);
        }
        throw new Registry.NoModelLoaderAvailableException(a);
    }

    private C8479p(@NonNull C8484r rVar) {
        this.f12075b = new C8480a();
        this.f12074a = rVar;
    }
}
