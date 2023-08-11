package p106h1;

import android.util.Log;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p294z1.C10791j;

/* renamed from: h1.i */
/* compiled from: LruArrayPool */
public final class C7891i implements C7883b {

    /* renamed from: a */
    private final C7888g<C7892a, Object> f11022a = new C7888g<>();

    /* renamed from: b */
    private final C7893b f11023b = new C7893b();

    /* renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f11024c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, C7882a<?>> f11025d = new HashMap();

    /* renamed from: e */
    private final int f11026e;

    /* renamed from: f */
    private int f11027f;

    /* renamed from: h1.i$a */
    /* compiled from: LruArrayPool */
    private static final class C7892a implements C7898l {

        /* renamed from: a */
        private final C7893b f11028a;

        /* renamed from: b */
        int f11029b;

        /* renamed from: c */
        private Class<?> f11030c;

        C7892a(C7893b bVar) {
            this.f11028a = bVar;
        }

        /* renamed from: a */
        public void mo41615a() {
            this.f11028a.mo41599c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo41616b(int i, Class<?> cls) {
            this.f11029b = i;
            this.f11030c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7892a)) {
                return false;
            }
            C7892a aVar = (C7892a) obj;
            if (this.f11029b == aVar.f11029b && this.f11030c == aVar.f11030c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2 = this.f11029b * 31;
            Class<?> cls = this.f11030c;
            if (cls != null) {
                i = cls.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return "Key{size=" + this.f11029b + "array=" + this.f11030c + '}';
        }
    }

    /* renamed from: h1.i$b */
    /* compiled from: LruArrayPool */
    private static final class C7893b extends C7884c<C7892a> {
        C7893b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C7892a mo41597a() {
            return new C7892a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C7892a mo41621e(int i, Class<?> cls) {
            C7892a aVar = (C7892a) mo41598b();
            aVar.mo41616b(i, cls);
            return aVar;
        }
    }

    public C7891i(int i) {
        this.f11026e = i;
    }

    /* renamed from: e */
    private void m15456e(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> l = m15463l(cls);
        Integer num = l.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        } else if (num.intValue() == 1) {
            l.remove(Integer.valueOf(i));
        } else {
            l.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: f */
    private void m15457f() {
        m15458g(this.f11026e);
    }

    /* renamed from: g */
    private void m15458g(int i) {
        while (this.f11027f > i) {
            Object f = this.f11022a.mo41608f();
            C10791j.m22948d(f);
            C7882a h = m15459h(f);
            this.f11027f -= h.mo41589b(f) * h.mo41588a();
            m15456e(h.mo41589b(f), f.getClass());
            if (Log.isLoggable(h.getTag(), 2)) {
                Log.v(h.getTag(), "evicted: " + h.mo41589b(f));
            }
        }
    }

    /* renamed from: h */
    private <T> C7882a<T> m15459h(T t) {
        return m15460i(t.getClass());
    }

    /* renamed from: i */
    private <T> C7882a<T> m15460i(Class<T> cls) {
        C7882a<T> aVar = this.f11025d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new C7890h();
            } else if (cls.equals(byte[].class)) {
                aVar = new C7887f();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f11025d.put(cls, aVar);
        }
        return aVar;
    }

    @Nullable
    /* renamed from: j */
    private <T> T m15461j(C7892a aVar) {
        return this.f11022a.mo41606a(aVar);
    }

    /* renamed from: k */
    private <T> T m15462k(C7892a aVar, Class<T> cls) {
        C7882a<T> i = m15460i(cls);
        T j = m15461j(aVar);
        if (j != null) {
            this.f11027f -= i.mo41589b(j) * i.mo41588a();
            m15456e(i.mo41589b(j), cls);
        }
        if (j != null) {
            return j;
        }
        if (Log.isLoggable(i.getTag(), 2)) {
            Log.v(i.getTag(), "Allocated " + aVar.f11029b + " bytes");
        }
        return i.newArray(aVar.f11029b);
    }

    /* renamed from: l */
    private NavigableMap<Integer, Integer> m15463l(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f11024c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f11024c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: m */
    private boolean m15464m() {
        int i = this.f11027f;
        if (i == 0 || this.f11026e / i >= 2) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private boolean m15465n(int i) {
        if (i <= this.f11026e / 2) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private boolean m15466o(int i, Integer num) {
        if (num == null || (!m15464m() && num.intValue() > i * 8)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public synchronized void mo41592a(int i) {
        if (i >= 40) {
            try {
                mo41593b();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            m15458g(this.f11026e / 2);
        }
    }

    /* renamed from: b */
    public synchronized void mo41593b() {
        m15458g(0);
    }

    /* renamed from: c */
    public synchronized <T> T mo41594c(int i, Class<T> cls) {
        return m15462k(this.f11023b.mo41621e(i, cls), cls);
    }

    /* renamed from: d */
    public synchronized <T> T mo41595d(int i, Class<T> cls) {
        C7892a aVar;
        Integer ceilingKey = m15463l(cls).ceilingKey(Integer.valueOf(i));
        if (m15466o(i, ceilingKey)) {
            aVar = this.f11023b.mo41621e(ceilingKey.intValue(), cls);
        } else {
            aVar = this.f11023b.mo41621e(i, cls);
        }
        return m15462k(aVar, cls);
    }

    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        C7882a<?> i = m15460i(cls);
        int b = i.mo41589b(t);
        int a = i.mo41588a() * b;
        if (m15465n(a)) {
            C7892a e = this.f11023b.mo41621e(b, cls);
            this.f11022a.mo41607d(e, t);
            NavigableMap<Integer, Integer> l = m15463l(cls);
            Integer num = l.get(Integer.valueOf(e.f11029b));
            Integer valueOf = Integer.valueOf(e.f11029b);
            int i2 = 1;
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            l.put(valueOf, Integer.valueOf(i2));
            this.f11027f += a;
            m15457f();
        }
    }
}
