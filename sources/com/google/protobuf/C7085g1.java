package com.google.protobuf;

import com.google.protobuf.C7174t;
import com.google.protobuf.C7196z;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.g1 */
/* compiled from: SchemaUtil */
final class C7085g1 {

    /* renamed from: a */
    private static final Class<?> f9561a = m12997B();

    /* renamed from: b */
    private static final C7127k1<?, ?> f9562b = m12998C(false);

    /* renamed from: c */
    private static final C7127k1<?, ?> f9563c = m12998C(true);

    /* renamed from: d */
    private static final C7127k1<?, ?> f9564d = new C7133m1();

    /* renamed from: A */
    static <UT, UB> UB m12996A(int i, List<Integer> list, C7196z.C7201e eVar, UB ub, C7127k1<UT, UB> k1Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (eVar.mo40729a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m13007L(i, intValue, ub, k1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.mo40729a(intValue2)) {
                    ub = m13007L(i, intValue2, ub, k1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: B */
    private static Class<?> m12997B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    private static C7127k1<?, ?> m12998C(boolean z) {
        try {
            Class<?> D = m12999D();
            if (D == null) {
                return null;
            }
            return (C7127k1) D.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    private static Class<?> m12999D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    static <T, FT extends C7174t.C7176b<FT>> void m13000E(C7148p<FT> pVar, T t, T t2) {
        C7174t<FT> c = pVar.mo40617c(t2);
        if (!c.mo40649n()) {
            pVar.mo40618d(t).mo40654u(c);
        }
    }

    /* renamed from: F */
    static <T> void m13001F(C7126k0 k0Var, T t, T t2, long j) {
        C7142o1.m13523R(t, j, k0Var.mo40499a(C7142o1.m13508C(t, j), C7142o1.m13508C(t2, j)));
    }

    /* renamed from: G */
    static <T, UT, UB> void m13002G(C7127k1<UT, UB> k1Var, T t, T t2) {
        k1Var.mo40522p(t, k1Var.mo40517k(k1Var.mo40513g(t), k1Var.mo40513g(t2)));
    }

    /* renamed from: H */
    public static C7127k1<?, ?> m13003H() {
        return f9562b;
    }

    /* renamed from: I */
    public static C7127k1<?, ?> m13004I() {
        return f9563c;
    }

    /* renamed from: J */
    public static void m13005J(Class<?> cls) {
        Class<?> cls2;
        if (!C7186x.class.isAssignableFrom(cls) && (cls2 = f9561a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: K */
    static boolean m13006K(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    static <UT, UB> UB m13007L(int i, int i2, UB ub, C7127k1<UT, UB> k1Var) {
        if (ub == null) {
            ub = k1Var.mo40520n();
        }
        k1Var.mo40511e(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: M */
    public static C7127k1<?, ?> m13008M() {
        return f9564d;
    }

    /* renamed from: N */
    public static void m13009N(int i, List<Boolean> list, C7170r1 r1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            r1Var.mo40459B(i, list, z);
        }
    }

    /* renamed from: O */
    public static void m13010O(int i, List<C7086h> list, C7170r1 r1Var) {
        if (list != null && !list.isEmpty()) {
            r1Var.mo40472O(i, list);
        }
    }

    /* renamed from: P */
    public static void m13011P(int i, List<Double> list, C7170r1 r1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            r1Var.mo40470M(i, list, z);
        }
    }

    /* renamed from: Q */
    public static void m13012Q(int i, List<Integer> list, C7170r1 r1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            r1Var.mo40469L(i, list, z);
        }
    }

    /* renamed from: R */
    public static void m13013R(int i, List<Integer> list, C7170r1 r1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            r1Var.mo40458A(i, list, z);
        }
    }

    /* renamed from: S */
    public static void m13014S(int i, List<Long> list, C7170r1 r1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            r1Var.mo40496x(i, list, z);
        }
    }

    /* renamed from: T */
    public static void m13015T(int i, List<Float> list, C7170r1 r1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            r1Var.mo40475c(i, list, z);
        }
    }

    /* renamed from: U */
    public static void m13016U(int i, List<?> list, C7170r1 r1Var, C7076e1 e1Var) {
        if (list != null && !list.isEmpty()) {
            r1Var.mo40474b(i, list, e1Var);
        }
    }

    /* renamed from: V */
    public static void m13017V(int i, List<Integer> list, C7170r1 r1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            r1Var.mo40488p(i, list, z);
        }
    }

    /* renamed from: W */
    public static void m13018W(int i, List<Long> list, C7170r1 r1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            r1Var.mo40468K(i, list, z);
        }
    }

    /* renamed from: X */
    public static void m13019X(int i, List<?> list, C7170r1 r1Var, C7076e1 e1Var) {
        if (list != null && !list.isEmpty()) {
            r1Var.mo40473a(i, list, e1Var);
        }
    }

    /* renamed from: Y */
    public static void m13020Y(int i, List<Integer> list, C7170r1 r1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            r1Var.mo40497y(i, list, z);
        }
    }

    /* renamed from: Z */
    public static void m13021Z(int i, List<Long> list, C7170r1 r1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            r1Var.mo40480h(i, list, z);
        }
    }

    /* renamed from: a */
    static int m13022a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m12604V(i) + CodedOutputStream.m12585C(size);
        }
        return size * CodedOutputStream.m12612d(i, true);
    }

    /* renamed from: a0 */
    public static void m13023a0(int i, List<Integer> list, C7170r1 r1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            r1Var.mo40466I(i, list, z);
        }
    }

    /* renamed from: b */
    static int m13024b(List<?> list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m13025b0(int i, List<Long> list, C7170r1 r1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            r1Var.mo40462E(i, list, z);
        }
    }

    /* renamed from: c */
    static int m13026c(int i, List<C7086h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = size * CodedOutputStream.m12604V(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            V += CodedOutputStream.m12618h(list.get(i2));
        }
        return V;
    }

    /* renamed from: c0 */
    public static void m13027c0(int i, List<String> list, C7170r1 r1Var) {
        if (list != null && !list.isEmpty()) {
            r1Var.mo40485m(i, list);
        }
    }

    /* renamed from: d */
    static int m13028d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = m13030e(list);
        if (z) {
            return CodedOutputStream.m12604V(i) + CodedOutputStream.m12585C(e);
        }
        return e + (size * CodedOutputStream.m12604V(i));
    }

    /* renamed from: d0 */
    public static void m13029d0(int i, List<Integer> list, C7170r1 r1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            r1Var.mo40461D(i, list, z);
        }
    }

    /* renamed from: e */
    static int m13030e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7194y) {
            C7194y yVar = (C7194y) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m12623l(yVar.mo40724t(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m12623l(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e0 */
    public static void m13031e0(int i, List<Long> list, C7170r1 r1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            r1Var.mo40481i(i, list, z);
        }
    }

    /* renamed from: f */
    static int m13032f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m12604V(i) + CodedOutputStream.m12585C(size * 4);
        }
        return size * CodedOutputStream.m12624m(i, 0);
    }

    /* renamed from: g */
    static int m13033g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    static int m13034h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return CodedOutputStream.m12604V(i) + CodedOutputStream.m12585C(size * 8);
        }
        return size * CodedOutputStream.m12626o(i, 0);
    }

    /* renamed from: i */
    static int m13035i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    static int m13036j(int i, List<C7149p0> list, C7076e1 e1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.m12630s(i, list.get(i3), e1Var);
        }
        return i2;
    }

    /* renamed from: k */
    static int m13037k(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = m13038l(list);
        if (z) {
            return CodedOutputStream.m12604V(i) + CodedOutputStream.m12585C(l);
        }
        return l + (size * CodedOutputStream.m12604V(i));
    }

    /* renamed from: l */
    static int m13038l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7194y) {
            C7194y yVar = (C7194y) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m12634w(yVar.mo40724t(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m12634w(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m */
    static int m13039m(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int n = m13040n(list);
        if (z) {
            return CodedOutputStream.m12604V(i) + CodedOutputStream.m12585C(n);
        }
        return n + (list.size() * CodedOutputStream.m12604V(i));
    }

    /* renamed from: n */
    static int m13040n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7084g0) {
            C7084g0 g0Var = (C7084g0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m12636y(g0Var.mo40316t(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m12636y(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o */
    static int m13041o(int i, Object obj, C7076e1 e1Var) {
        if (obj instanceof C7067c0) {
            return CodedOutputStream.m12583A(i, (C7067c0) obj);
        }
        return CodedOutputStream.m12588F(i, (C7149p0) obj, e1Var);
    }

    /* renamed from: p */
    static int m13042p(int i, List<?> list, C7076e1 e1Var) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = CodedOutputStream.m12604V(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C7067c0) {
                i2 = CodedOutputStream.m12584B((C7067c0) obj);
            } else {
                i2 = CodedOutputStream.m12590H((C7149p0) obj, e1Var);
            }
            V += i2;
        }
        return V;
    }

    /* renamed from: q */
    static int m13043q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r = m13044r(list);
        if (z) {
            return CodedOutputStream.m12604V(i) + CodedOutputStream.m12585C(r);
        }
        return r + (size * CodedOutputStream.m12604V(i));
    }

    /* renamed from: r */
    static int m13044r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7194y) {
            C7194y yVar = (C7194y) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m12599Q(yVar.mo40724t(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m12599Q(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: s */
    static int m13045s(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = m13046t(list);
        if (z) {
            return CodedOutputStream.m12604V(i) + CodedOutputStream.m12585C(t);
        }
        return t + (size * CodedOutputStream.m12604V(i));
    }

    /* renamed from: t */
    static int m13046t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7084g0) {
            C7084g0 g0Var = (C7084g0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m12601S(g0Var.mo40316t(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m12601S(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: u */
    static int m13047u(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int V = CodedOutputStream.m12604V(i) * size;
        if (list instanceof C7075e0) {
            C7075e0 e0Var = (C7075e0) list;
            while (i4 < size) {
                Object C = e0Var.mo40214C(i4);
                if (C instanceof C7086h) {
                    i3 = CodedOutputStream.m12618h((C7086h) C);
                } else {
                    i3 = CodedOutputStream.m12603U((String) C);
                }
                V += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof C7086h) {
                    i2 = CodedOutputStream.m12618h((C7086h) obj);
                } else {
                    i2 = CodedOutputStream.m12603U((String) obj);
                }
                V += i2;
                i4++;
            }
        }
        return V;
    }

    /* renamed from: v */
    static int m13048v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = m13049w(list);
        if (z) {
            return CodedOutputStream.m12604V(i) + CodedOutputStream.m12585C(w);
        }
        return w + (size * CodedOutputStream.m12604V(i));
    }

    /* renamed from: w */
    static int m13049w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7194y) {
            C7194y yVar = (C7194y) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m12606X(yVar.mo40724t(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m12606X(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    static int m13050x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = m13051y(list);
        if (z) {
            return CodedOutputStream.m12604V(i) + CodedOutputStream.m12585C(y);
        }
        return y + (size * CodedOutputStream.m12604V(i));
    }

    /* renamed from: y */
    static int m13051y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7084g0) {
            C7084g0 g0Var = (C7084g0) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m12608Z(g0Var.mo40316t(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m12608Z(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    static <UT, UB> UB m13052z(int i, List<Integer> list, C7196z.C7200d<?> dVar, UB ub, C7127k1<UT, UB> k1Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (dVar.mo40728a(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m13007L(i, intValue, ub, k1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.mo40728a(intValue2) == null) {
                    ub = m13007L(i, intValue2, ub, k1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
