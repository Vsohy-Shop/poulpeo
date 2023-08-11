package p111h6;

import java.io.Serializable;

/* renamed from: h6.d */
/* compiled from: Equivalence */
public abstract class C7995d<T> {

    /* renamed from: h6.d$a */
    /* compiled from: Equivalence */
    static final class C7996a extends C7995d<Object> implements Serializable {

        /* renamed from: b */
        static final C7996a f11233b = new C7996a();
        private static final long serialVersionUID = 1;

        C7996a() {
        }

        private Object readResolve() {
            return f11233b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo41826a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo41827b(Object obj) {
            return obj.hashCode();
        }
    }

    /* renamed from: h6.d$b */
    /* compiled from: Equivalence */
    static final class C7997b extends C7995d<Object> implements Serializable {

        /* renamed from: b */
        static final C7997b f11234b = new C7997b();
        private static final long serialVersionUID = 1;

        C7997b() {
        }

        private Object readResolve() {
            return f11234b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo41826a(Object obj, Object obj2) {
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo41827b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected C7995d() {
    }

    /* renamed from: c */
    public static C7995d<Object> m15702c() {
        return C7996a.f11233b;
    }

    /* renamed from: f */
    public static C7995d<Object> m15703f() {
        return C7997b.f11234b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo41826a(T t, T t2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo41827b(T t);

    /* renamed from: d */
    public final boolean mo41828d(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return mo41826a(t, t2);
    }

    /* renamed from: e */
    public final int mo41829e(T t) {
        if (t == null) {
            return 0;
        }
        return mo41827b(t);
    }
}
