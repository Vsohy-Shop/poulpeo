package p202q6;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: q6.d */
/* compiled from: Component */
public final class C9284d<T> {

    /* renamed from: a */
    private final Set<Class<? super T>> f13628a;

    /* renamed from: b */
    private final Set<C9307q> f13629b;

    /* renamed from: c */
    private final int f13630c;

    /* renamed from: d */
    private final int f13631d;

    /* renamed from: e */
    private final C9293h<T> f13632e;

    /* renamed from: f */
    private final Set<Class<?>> f13633f;

    /* renamed from: q6.d$b */
    /* compiled from: Component */
    public static class C9286b<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f13634a;

        /* renamed from: b */
        private final Set<C9307q> f13635b;

        /* renamed from: c */
        private int f13636c;

        /* renamed from: d */
        private int f13637d;

        /* renamed from: e */
        private C9293h<T> f13638e;

        /* renamed from: f */
        private Set<Class<?>> f13639f;

        /* access modifiers changed from: private */
        /* renamed from: g */
        public C9286b<T> m19080g() {
            this.f13637d = 1;
            return this;
        }

        /* renamed from: h */
        private C9286b<T> m19081h(int i) {
            boolean z;
            if (this.f13636c == 0) {
                z = true;
            } else {
                z = false;
            }
            C9316z.m19178d(z, "Instantiation type has already been set.");
            this.f13636c = i;
            return this;
        }

        /* renamed from: i */
        private void m19082i(Class<?> cls) {
            C9316z.m19175a(!this.f13634a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public C9286b<T> mo43572b(C9307q qVar) {
            C9316z.m19177c(qVar, "Null dependency");
            m19082i(qVar.mo43596c());
            this.f13635b.add(qVar);
            return this;
        }

        /* renamed from: c */
        public C9286b<T> mo43573c() {
            return m19081h(1);
        }

        /* renamed from: d */
        public C9284d<T> mo43574d() {
            boolean z;
            if (this.f13638e != null) {
                z = true;
            } else {
                z = false;
            }
            C9316z.m19178d(z, "Missing required property: factory.");
            return new C9284d(new HashSet(this.f13634a), new HashSet(this.f13635b), this.f13636c, this.f13637d, this.f13638e, this.f13639f);
        }

        /* renamed from: e */
        public C9286b<T> mo43575e() {
            return m19081h(2);
        }

        /* renamed from: f */
        public C9286b<T> mo43576f(C9293h<T> hVar) {
            this.f13638e = (C9293h) C9316z.m19177c(hVar, "Null factory");
            return this;
        }

        @SafeVarargs
        private C9286b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.f13634a = hashSet;
            this.f13635b = new HashSet();
            this.f13636c = 0;
            this.f13637d = 0;
            this.f13639f = new HashSet();
            C9316z.m19177c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> c : clsArr) {
                C9316z.m19177c(c, "Null interface");
            }
            Collections.addAll(this.f13634a, clsArr);
        }
    }

    /* renamed from: c */
    public static <T> C9286b<T> m19065c(Class<T> cls) {
        return new C9286b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: d */
    public static <T> C9286b<T> m19066d(Class<T> cls, Class<? super T>... clsArr) {
        return new C9286b<>(cls, clsArr);
    }

    /* renamed from: i */
    public static <T> C9284d<T> m19067i(T t, Class<T> cls) {
        return m19068j(cls).mo43576f(new C9282b(t)).mo43574d();
    }

    /* renamed from: j */
    public static <T> C9286b<T> m19068j(Class<T> cls) {
        return m19065c(cls).m19080g();
    }

    @SafeVarargs
    /* renamed from: p */
    public static <T> C9284d<T> m19071p(T t, Class<T> cls, Class<? super T>... clsArr) {
        return m19066d(cls, clsArr).mo43576f(new C9283c(t)).mo43574d();
    }

    /* renamed from: e */
    public Set<C9307q> mo43564e() {
        return this.f13629b;
    }

    /* renamed from: f */
    public C9293h<T> mo43565f() {
        return this.f13632e;
    }

    /* renamed from: g */
    public Set<Class<? super T>> mo43566g() {
        return this.f13628a;
    }

    /* renamed from: h */
    public Set<Class<?>> mo43567h() {
        return this.f13633f;
    }

    /* renamed from: k */
    public boolean mo43568k() {
        if (this.f13630c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo43569l() {
        if (this.f13630c == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean mo43570m() {
        if (this.f13631d == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f13628a.toArray()) + ">{" + this.f13630c + ", type=" + this.f13631d + ", deps=" + Arrays.toString(this.f13629b.toArray()) + "}";
    }

    private C9284d(Set<Class<? super T>> set, Set<C9307q> set2, int i, int i2, C9293h<T> hVar, Set<Class<?>> set3) {
        this.f13628a = Collections.unmodifiableSet(set);
        this.f13629b = Collections.unmodifiableSet(set2);
        this.f13630c = i;
        this.f13631d = i2;
        this.f13632e = hVar;
        this.f13633f = Collections.unmodifiableSet(set3);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ Object m19069n(Object obj, C9287e eVar) {
        return obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ Object m19070o(Object obj, C9287e eVar) {
        return obj;
    }
}
