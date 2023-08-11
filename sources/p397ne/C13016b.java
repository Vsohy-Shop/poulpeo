package p397ne;

import p384le.C12852c;

/* renamed from: ne.b */
/* compiled from: ObjectHelper */
public final class C13016b {

    /* renamed from: a */
    static final C12852c<Object, Object> f20816a = new C13017a();

    /* renamed from: ne.b$a */
    /* compiled from: ObjectHelper */
    static final class C13017a implements C12852c<Object, Object> {
        C13017a() {
        }
    }

    /* renamed from: a */
    public static int m29387a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m29388b(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m29389c(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static <T> T m29390d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: e */
    public static int m29391e(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }
}
