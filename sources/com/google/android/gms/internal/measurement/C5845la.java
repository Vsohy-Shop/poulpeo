package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.la */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5845la {

    /* renamed from: a */
    private static final Class<?> f7055a;

    /* renamed from: b */
    private static final C6037xa<?, ?> f7056b = m9565C(false);

    /* renamed from: c */
    private static final C6037xa<?, ?> f7057c = m9565C(true);

    /* renamed from: d */
    private static final C6037xa<?, ?> f7058d = new C6069za();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f7055a = cls;
    }

    /* renamed from: A */
    static int m9563A(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C5707d8.m8988a(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m9564B(int i, List<Long> list, C5724e8 e8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e8Var.mo33922k(i, list, z);
        }
    }

    /* renamed from: C */
    private static C6037xa<?, ?> m9565C(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C6037xa) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    static int m9566D(List<?> list) {
        return list.size();
    }

    /* renamed from: E */
    static int m9567E(int i, List<C6018w7> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = size * C5707d8.m8987D(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            D += C5707d8.m8992x(list.get(i2));
        }
        return D;
    }

    /* renamed from: F */
    static int m9568F(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9569G(list) + (size * C5707d8.m8987D(i));
    }

    /* renamed from: G */
    static int m9569G(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6019w8) {
            C6019w8 w8Var = (C6019w8) list;
            i = 0;
            while (i2 < size) {
                i += C5707d8.m8994z(w8Var.mo34589d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5707d8.m8994z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    static int m9570H(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C5707d8.m8988a(i << 3) + 4);
    }

    /* renamed from: I */
    static int m9571I(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    static int m9572J(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C5707d8.m8988a(i << 3) + 8);
    }

    /* renamed from: K */
    static int m9573K(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    static int m9574L(int i, List<C6052y9> list, C5811ja jaVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C5707d8.m8993y(i, list.get(i3), jaVar);
        }
        return i2;
    }

    /* renamed from: M */
    static int m9575M(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9576N(list) + (size * C5707d8.m8987D(i));
    }

    /* renamed from: N */
    static int m9576N(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6019w8) {
            C6019w8 w8Var = (C6019w8) list;
            i = 0;
            while (i2 < size) {
                i += C5707d8.m8994z(w8Var.mo34589d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5707d8.m8994z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    static int m9577O(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m9578P(list) + (list.size() * C5707d8.m8987D(i));
    }

    /* renamed from: P */
    static int m9578P(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5860m9) {
            C5860m9 m9Var = (C5860m9) list;
            i = 0;
            while (i2 < size) {
                i += C5707d8.m8989b(m9Var.mo33702g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5707d8.m8989b(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    static int m9579Q(int i, Object obj, C5811ja jaVar) {
        if (!(obj instanceof C5742f9)) {
            return C5707d8.m8988a(i << 3) + C5707d8.m8985B((C6052y9) obj, jaVar);
        }
        int a = C5707d8.m8988a(i << 3);
        int a2 = ((C5742f9) obj).mo34014a();
        return a + C5707d8.m8988a(a2) + a2;
    }

    /* renamed from: R */
    static int m9580R(int i, List<?> list, C5811ja jaVar) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = C5707d8.m8987D(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C5742f9) {
                i2 = C5707d8.m8984A((C5742f9) obj);
            } else {
                i2 = C5707d8.m8985B((C6052y9) obj, jaVar);
            }
            D += i2;
        }
        return D;
    }

    /* renamed from: S */
    static int m9581S(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9582T(list) + (size * C5707d8.m8987D(i));
    }

    /* renamed from: T */
    static int m9582T(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6019w8) {
            C6019w8 w8Var = (C6019w8) list;
            i = 0;
            while (i2 < size) {
                int d = w8Var.mo34589d(i2);
                i += C5707d8.m8988a((d >> 31) ^ (d + d));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i3 = i + C5707d8.m8988a((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    static int m9583U(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9584V(list) + (size * C5707d8.m8987D(i));
    }

    /* renamed from: V */
    static int m9584V(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5860m9) {
            C5860m9 m9Var = (C5860m9) list;
            i = 0;
            while (i2 < size) {
                long g = m9Var.mo33702g(i2);
                i += C5707d8.m8989b((g >> 63) ^ (g + g));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + C5707d8.m8989b((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    static int m9585W(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int D = C5707d8.m8987D(i) * size;
        if (list instanceof C5776h9) {
            C5776h9 h9Var = (C5776h9) list;
            while (i4 < size) {
                Object f = h9Var.mo33777f(i4);
                if (f instanceof C6018w7) {
                    i3 = C5707d8.m8992x((C6018w7) f);
                } else {
                    i3 = C5707d8.m8986C((String) f);
                }
                D += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof C6018w7) {
                    i2 = C5707d8.m8992x((C6018w7) obj);
                } else {
                    i2 = C5707d8.m8986C((String) obj);
                }
                D += i2;
                i4++;
            }
        }
        return D;
    }

    /* renamed from: X */
    static int m9586X(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9587Y(list) + (size * C5707d8.m8987D(i));
    }

    /* renamed from: Y */
    static int m9587Y(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6019w8) {
            C6019w8 w8Var = (C6019w8) list;
            i = 0;
            while (i2 < size) {
                i += C5707d8.m8988a(w8Var.mo34589d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5707d8.m8988a(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    static int m9588Z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m9590a0(list) + (size * C5707d8.m8987D(i));
    }

    /* renamed from: a */
    public static C6037xa<?, ?> m9589a() {
        return f7057c;
    }

    /* renamed from: a0 */
    static int m9590a0(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5860m9) {
            C5860m9 m9Var = (C5860m9) list;
            i = 0;
            while (i2 < size) {
                i += C5707d8.m8989b(m9Var.mo33702g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5707d8.m8989b(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static C6037xa<?, ?> m9591b() {
        return f7058d;
    }

    /* renamed from: b0 */
    public static C6037xa<?, ?> m9592b0() {
        return f7056b;
    }

    /* renamed from: c */
    static <UT, UB> UB m9593c(int i, List<Integer> list, C6067z8 z8Var, UB ub, C6037xa<UT, UB> xaVar) {
        if (z8Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (z8Var.mo33746g(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m9594d(i, intValue, ub, xaVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!z8Var.mo33746g(intValue2)) {
                    ub = m9594d(i, intValue2, ub, xaVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: d */
    static <UT, UB> UB m9594d(int i, int i2, UB ub, C6037xa<UT, UB> xaVar) {
        if (ub == null) {
            ub = xaVar.mo34607e();
        }
        xaVar.mo34608f(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: e */
    static <T, FT extends C5859m8<FT>> void m9595e(C5809j8<FT> j8Var, T t, T t2) {
        j8Var.mo34123a(t2);
        throw null;
    }

    /* renamed from: f */
    static <T, UT, UB> void m9596f(C6037xa<UT, UB> xaVar, T t, T t2) {
        xaVar.mo34610h(t, xaVar.mo34606d(xaVar.mo34605c(t), xaVar.mo34605c(t2)));
    }

    /* renamed from: g */
    public static void m9597g(Class<?> cls) {
        Class<?> cls2;
        if (!C6003v8.class.isAssignableFrom(cls) && (cls2 = f7055a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    static boolean m9598h(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    static <T> void m9599i(C5956s9 s9Var, T t, T t2, long j) {
        C5778hb.m9374x(t, j, C5956s9.m9888b(C5778hb.m9361k(t, j), C5778hb.m9361k(t2, j)));
    }

    /* renamed from: j */
    public static void m9600j(int i, List<Boolean> list, C5724e8 e8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e8Var.mo33924n(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m9601k(int i, List<C6018w7> list, C5724e8 e8Var) {
        if (list != null && !list.isEmpty()) {
            e8Var.mo33926p(i, list);
        }
    }

    /* renamed from: l */
    public static void m9602l(int i, List<Double> list, C5724e8 e8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e8Var.mo33928r(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m9603m(int i, List<Integer> list, C5724e8 e8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e8Var.mo33931u(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m9604n(int i, List<Integer> list, C5724e8 e8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e8Var.mo33933w(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m9605o(int i, List<Long> list, C5724e8 e8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e8Var.mo33935y(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m9606p(int i, List<Float> list, C5724e8 e8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e8Var.mo33901A(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m9607q(int i, List<?> list, C5724e8 e8Var, C5811ja jaVar) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                e8Var.mo33902B(i, list.get(i2), jaVar);
            }
        }
    }

    /* renamed from: r */
    public static void m9608r(int i, List<Integer> list, C5724e8 e8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e8Var.mo33904D(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m9609s(int i, List<Long> list, C5724e8 e8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e8Var.mo33906F(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m9610t(int i, List<?> list, C5724e8 e8Var, C5811ja jaVar) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                e8Var.mo33907G(i, list.get(i2), jaVar);
            }
        }
    }

    /* renamed from: u */
    public static void m9611u(int i, List<Integer> list, C5724e8 e8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e8Var.mo33909I(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m9612v(int i, List<Long> list, C5724e8 e8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e8Var.mo33911K(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m9613w(int i, List<Integer> list, C5724e8 e8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e8Var.mo33913b(i, list, z);
        }
    }

    /* renamed from: x */
    public static void m9614x(int i, List<Long> list, C5724e8 e8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e8Var.mo33915d(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m9615y(int i, List<String> list, C5724e8 e8Var) {
        if (list != null && !list.isEmpty()) {
            e8Var.mo33918g(i, list);
        }
    }

    /* renamed from: z */
    public static void m9616z(int i, List<Integer> list, C5724e8 e8Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            e8Var.mo33920i(i, list, z);
        }
    }
}
