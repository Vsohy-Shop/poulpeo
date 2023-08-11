package com.google.android.gms.internal.cast;

import java.util.List;

/* renamed from: com.google.android.gms.internal.cast.we */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5203we {

    /* renamed from: a */
    private static final Class f5582a;

    /* renamed from: b */
    private static final C5000kf f5583b = m7670z(false);

    /* renamed from: c */
    private static final C5000kf f5584c = m7670z(true);

    /* renamed from: d */
    private static final C5000kf f5585d = new C5034mf();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f5582a = cls;
    }

    /* renamed from: A */
    static int m7619A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C5099qc.m7393a(i << 3) + 1);
    }

    /* renamed from: B */
    static int m7620B(List list) {
        return list.size();
    }

    /* renamed from: C */
    static int m7621C(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = size * C5099qc.m7392D(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            D += C5099qc.m7397x((C4980jc) list.get(i2));
        }
        return D;
    }

    /* renamed from: D */
    static int m7622D(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m7623E(list) + (size * C5099qc.m7392D(i));
    }

    /* renamed from: E */
    static int m7623E(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4896ed) {
            C4896ed edVar = (C4896ed) list;
            i = 0;
            while (i2 < size) {
                i += C5099qc.m7399z(edVar.mo32770d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5099qc.m7399z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: F */
    static int m7624F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C5099qc.m7393a(i << 3) + 4);
    }

    /* renamed from: G */
    static int m7625G(List list) {
        return list.size() * 4;
    }

    /* renamed from: H */
    static int m7626H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C5099qc.m7393a(i << 3) + 8);
    }

    /* renamed from: I */
    static int m7627I(List list) {
        return list.size() * 8;
    }

    /* renamed from: J */
    static int m7628J(int i, List list, C5169ue ueVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C5099qc.m7398y(i, (C4982je) list.get(i3), ueVar);
        }
        return i2;
    }

    /* renamed from: K */
    static int m7629K(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m7630L(list) + (size * C5099qc.m7392D(i));
    }

    /* renamed from: L */
    static int m7630L(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4896ed) {
            C4896ed edVar = (C4896ed) list;
            i = 0;
            while (i2 < size) {
                i += C5099qc.m7399z(edVar.mo32770d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5099qc.m7399z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: M */
    static int m7631M(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m7632N(list) + (list.size() * C5099qc.m7392D(i));
    }

    /* renamed from: N */
    static int m7632N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5236yd) {
            C5236yd ydVar = (C5236yd) list;
            i = 0;
            while (i2 < size) {
                i += C5099qc.m7394b(ydVar.mo33068d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5099qc.m7394b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    static int m7633O(int i, Object obj, C5169ue ueVar) {
        if (!(obj instanceof C5083pd)) {
            return C5099qc.m7393a(i << 3) + C5099qc.m7390B((C4982je) obj, ueVar);
        }
        int a = C5099qc.m7393a(i << 3);
        int a2 = ((C5083pd) obj).mo32956a();
        return a + C5099qc.m7393a(a2) + a2;
    }

    /* renamed from: P */
    static int m7634P(int i, List list, C5169ue ueVar) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = C5099qc.m7392D(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C5083pd) {
                i2 = C5099qc.m7389A((C5083pd) obj);
            } else {
                i2 = C5099qc.m7390B((C4982je) obj, ueVar);
            }
            D += i2;
        }
        return D;
    }

    /* renamed from: Q */
    static int m7635Q(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m7636R(list) + (size * C5099qc.m7392D(i));
    }

    /* renamed from: R */
    static int m7636R(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4896ed) {
            C4896ed edVar = (C4896ed) list;
            i = 0;
            while (i2 < size) {
                int d = edVar.mo32770d(i2);
                i += C5099qc.m7393a((d >> 31) ^ (d + d));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + C5099qc.m7393a((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: S */
    static int m7637S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m7638T(list) + (size * C5099qc.m7392D(i));
    }

    /* renamed from: T */
    static int m7638T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5236yd) {
            C5236yd ydVar = (C5236yd) list;
            i = 0;
            while (i2 < size) {
                long d = ydVar.mo33068d(i2);
                i += C5099qc.m7394b((d >> 63) ^ (d + d));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + C5099qc.m7394b((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    static int m7639U(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int D = C5099qc.m7392D(i) * size;
        if (list instanceof C5117rd) {
            C5117rd rdVar = (C5117rd) list;
            while (i4 < size) {
                Object i5 = rdVar.mo32981i(i4);
                if (i5 instanceof C4980jc) {
                    i3 = C5099qc.m7397x((C4980jc) i5);
                } else {
                    i3 = C5099qc.m7391C((String) i5);
                }
                D += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof C4980jc) {
                    i2 = C5099qc.m7397x((C4980jc) obj);
                } else {
                    i2 = C5099qc.m7391C((String) obj);
                }
                D += i2;
                i4++;
            }
        }
        return D;
    }

    /* renamed from: V */
    static int m7640V(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m7641W(list) + (size * C5099qc.m7392D(i));
    }

    /* renamed from: W */
    static int m7641W(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4896ed) {
            C4896ed edVar = (C4896ed) list;
            i = 0;
            while (i2 < size) {
                i += C5099qc.m7393a(edVar.mo32770d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5099qc.m7393a(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: X */
    static int m7642X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m7643Y(list) + (size * C5099qc.m7392D(i));
    }

    /* renamed from: Y */
    static int m7643Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5236yd) {
            C5236yd ydVar = (C5236yd) list;
            i = 0;
            while (i2 < size) {
                i += C5099qc.m7394b(ydVar.mo33068d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5099qc.m7394b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    public static C5000kf m7644Z() {
        return f5583b;
    }

    /* renamed from: a */
    public static C5000kf m7645a() {
        return f5584c;
    }

    /* renamed from: b */
    public static C5000kf m7646b() {
        return f5585d;
    }

    /* renamed from: c */
    static void m7647c(C5167uc ucVar, Object obj, Object obj2) {
        ucVar.mo33019a(obj2);
        throw null;
    }

    /* renamed from: d */
    static void m7648d(C5000kf kfVar, Object obj, Object obj2) {
        kfVar.mo32857f(obj, kfVar.mo32855d(kfVar.mo32854c(obj), kfVar.mo32854c(obj2)));
    }

    /* renamed from: e */
    public static void m7649e(Class cls) {
        Class cls2;
        if (!C4878dd.class.isAssignableFrom(cls) && (cls2 = f5582a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: f */
    public static void m7650f(int i, List list, C4863cg cgVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            cgVar.mo32700k(i, list, z);
        }
    }

    /* renamed from: g */
    public static void m7651g(int i, List list, C4863cg cgVar) {
        if (list != null && !list.isEmpty()) {
            cgVar.mo32694e(i, list);
        }
    }

    /* renamed from: h */
    public static void m7652h(int i, List list, C4863cg cgVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            cgVar.mo32715z(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m7653i(int i, List list, C4863cg cgVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            cgVar.mo32692c(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m7654j(int i, List list, C4863cg cgVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            cgVar.mo32708s(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m7655k(int i, List list, C4863cg cgVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            cgVar.mo32714y(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m7656l(int i, List list, C4863cg cgVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            cgVar.mo32689H(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m7657m(int i, List list, C4863cg cgVar, C5169ue ueVar) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C5133sc) cgVar).mo32709t(i, list.get(i2), ueVar);
            }
        }
    }

    /* renamed from: n */
    public static void m7658n(int i, List list, C4863cg cgVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            cgVar.mo32695f(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m7659o(int i, List list, C4863cg cgVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            cgVar.mo32699j(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m7660p(int i, List list, C4863cg cgVar, C5169ue ueVar) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C5133sc) cgVar).mo32684C(i, list.get(i2), ueVar);
            }
        }
    }

    /* renamed from: q */
    public static void m7661q(int i, List list, C4863cg cgVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            cgVar.mo32686E(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m7662r(int i, List list, C4863cg cgVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            cgVar.mo32697h(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m7663s(int i, List list, C4863cg cgVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            cgVar.mo32706q(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m7664t(int i, List list, C4863cg cgVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            cgVar.mo32710u(i, list, z);
        }
    }

    /* renamed from: u */
    public static void m7665u(int i, List list, C4863cg cgVar) {
        if (list != null && !list.isEmpty()) {
            cgVar.mo32701l(i, list);
        }
    }

    /* renamed from: v */
    public static void m7666v(int i, List list, C4863cg cgVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            cgVar.mo32690a(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m7667w(int i, List list, C4863cg cgVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            cgVar.mo32703n(i, list, z);
        }
    }

    /* renamed from: x */
    static boolean m7668x(Object obj, Object obj2) {
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

    /* renamed from: y */
    static void m7669y(C4897ee eeVar, Object obj, Object obj2, long j) {
        C4879de deVar = (C4879de) C5187vf.m7585k(obj, j);
        C4879de deVar2 = (C4879de) C5187vf.m7585k(obj2, j);
        if (!deVar2.isEmpty()) {
            if (!deVar.mo32750e()) {
                deVar = deVar.mo32746a();
            }
            deVar.mo32748c(deVar2);
        }
        C5187vf.m7598x(obj, j, deVar);
    }

    /* renamed from: z */
    private static C5000kf m7670z(boolean z) {
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
            return (C5000kf) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }
}
