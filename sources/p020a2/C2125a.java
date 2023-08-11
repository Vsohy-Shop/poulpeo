package p020a2;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* renamed from: a2.a */
/* compiled from: FactoryPools */
public final class C2125a {

    /* renamed from: a */
    private static final C2132g<Object> f813a = new C2126a();

    /* renamed from: a2.a$b */
    /* compiled from: FactoryPools */
    class C2127b implements C2129d<List<T>> {
        C2127b() {
        }

        @NonNull
        /* renamed from: b */
        public List<T> mo23268a() {
            return new ArrayList();
        }
    }

    /* renamed from: a2.a$c */
    /* compiled from: FactoryPools */
    class C2128c implements C2132g<List<T>> {
        C2128c() {
        }

        /* renamed from: b */
        public void mo23267a(@NonNull List<T> list) {
            list.clear();
        }
    }

    /* renamed from: a2.a$d */
    /* compiled from: FactoryPools */
    public interface C2129d<T> {
        /* renamed from: a */
        T mo23268a();
    }

    /* renamed from: a2.a$e */
    /* compiled from: FactoryPools */
    private static final class C2130e<T> implements Pools.Pool<T> {

        /* renamed from: a */
        private final C2129d<T> f814a;

        /* renamed from: b */
        private final C2132g<T> f815b;

        /* renamed from: c */
        private final Pools.Pool<T> f816c;

        C2130e(@NonNull Pools.Pool<T> pool, @NonNull C2129d<T> dVar, @NonNull C2132g<T> gVar) {
            this.f816c = pool;
            this.f814a = dVar;
            this.f815b = gVar;
        }

        public T acquire() {
            T acquire = this.f816c.acquire();
            if (acquire == null) {
                acquire = this.f814a.mo23268a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + acquire.getClass());
                }
            }
            if (acquire instanceof C2131f) {
                ((C2131f) acquire).mo23271d().mo23272b(false);
            }
            return acquire;
        }

        public boolean release(@NonNull T t) {
            if (t instanceof C2131f) {
                ((C2131f) t).mo23271d().mo23272b(true);
            }
            this.f815b.mo23267a(t);
            return this.f816c.release(t);
        }
    }

    /* renamed from: a2.a$f */
    /* compiled from: FactoryPools */
    public interface C2131f {
        @NonNull
        /* renamed from: d */
        C2134c mo23271d();
    }

    /* renamed from: a2.a$g */
    /* compiled from: FactoryPools */
    public interface C2132g<T> {
        /* renamed from: a */
        void mo23267a(@NonNull T t);
    }

    @NonNull
    /* renamed from: a */
    private static <T extends C2131f> Pools.Pool<T> m1475a(@NonNull Pools.Pool<T> pool, @NonNull C2129d<T> dVar) {
        return m1476b(pool, dVar, m1477c());
    }

    @NonNull
    /* renamed from: b */
    private static <T> Pools.Pool<T> m1476b(@NonNull Pools.Pool<T> pool, @NonNull C2129d<T> dVar, @NonNull C2132g<T> gVar) {
        return new C2130e(pool, dVar, gVar);
    }

    @NonNull
    /* renamed from: c */
    private static <T> C2132g<T> m1477c() {
        return f813a;
    }

    @NonNull
    /* renamed from: d */
    public static <T extends C2131f> Pools.Pool<T> m1478d(int i, @NonNull C2129d<T> dVar) {
        return m1475a(new Pools.SynchronizedPool(i), dVar);
    }

    @NonNull
    /* renamed from: e */
    public static <T> Pools.Pool<List<T>> m1479e() {
        return m1480f(20);
    }

    @NonNull
    /* renamed from: f */
    public static <T> Pools.Pool<List<T>> m1480f(int i) {
        return m1476b(new Pools.SynchronizedPool(i), new C2127b(), new C2128c());
    }

    /* renamed from: a2.a$a */
    /* compiled from: FactoryPools */
    class C2126a implements C2132g<Object> {
        C2126a() {
        }

        /* renamed from: a */
        public void mo23267a(@NonNull Object obj) {
        }
    }
}
