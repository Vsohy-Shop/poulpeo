package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.x5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6032x5 {
    /* renamed from: a */
    public static double m10240a(double d) {
        int i;
        int i2;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || i == 0) {
            return d;
        }
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        return ((double) i2) * Math.floor(Math.abs(d));
    }

    /* renamed from: b */
    public static int m10241b(double d) {
        int i;
        int i2;
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        return (int) ((long) ((((double) i2) * Math.floor(Math.abs(d))) % 4.294967296E9d));
    }

    /* renamed from: c */
    public static int m10242c(C6015w4 w4Var) {
        int b = m10241b(w4Var.mo34575d("runtime.counter").mo33971y().doubleValue() + 1.0d);
        if (b <= 1000000) {
            w4Var.mo34578g("runtime.counter", new C5783i(Double.valueOf((double) b)));
            return b;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    /* renamed from: d */
    public static long m10243d(double d) {
        return ((long) m10241b(d)) & 4294967295L;
    }

    /* renamed from: e */
    public static C5867n0 m10244e(String str) {
        C5867n0 n0Var = null;
        if (str != null && !str.isEmpty()) {
            n0Var = C5867n0.m9659a(Integer.parseInt(str));
        }
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    /* renamed from: f */
    public static Object m10245f(C5914q qVar) {
        if (C5914q.f7290P.equals(qVar)) {
            return null;
        }
        if (C5914q.f7289O.equals(qVar)) {
            return "";
        }
        if (qVar instanceof C5866n) {
            return m10246g((C5866n) qVar);
        }
        if (qVar instanceof C5732f) {
            ArrayList arrayList = new ArrayList();
            Iterator<C5914q> it = ((C5732f) qVar).iterator();
            while (it.hasNext()) {
                Object f = m10245f(it.next());
                if (f != null) {
                    arrayList.add(f);
                }
            }
            return arrayList;
        } else if (!qVar.mo33971y().isNaN()) {
            return qVar.mo33971y();
        } else {
            return qVar.mo33956b();
        }
    }

    /* renamed from: g */
    public static Map<String, Object> m10246g(C5866n nVar) {
        HashMap hashMap = new HashMap();
        for (String next : nVar.mo34191a()) {
            Object f = m10245f(nVar.mo33964q(next));
            if (f != null) {
                hashMap.put(next, f);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    public static void m10247h(String str, int i, List<C5914q> list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: i */
    public static void m10248i(String str, int i, List<C5914q> list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: j */
    public static void m10249j(String str, int i, List<C5914q> list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: k */
    public static boolean m10250k(C5914q qVar) {
        if (qVar == null) {
            return false;
        }
        Double y = qVar.mo33971y();
        if (y.isNaN() || y.doubleValue() < 0.0d || !y.equals(Double.valueOf(Math.floor(y.doubleValue())))) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m10251l(C5914q qVar, C5914q qVar2) {
        if (!qVar.getClass().equals(qVar2.getClass())) {
            return false;
        }
        if ((qVar instanceof C5994v) || (qVar instanceof C5882o)) {
            return true;
        }
        if (qVar instanceof C5783i) {
            if (Double.isNaN(qVar.mo33971y().doubleValue()) || Double.isNaN(qVar2.mo33971y().doubleValue())) {
                return false;
            }
            return qVar.mo33971y().equals(qVar2.mo33971y());
        } else if (qVar instanceof C5978u) {
            return qVar.mo33956b().equals(qVar2.mo33956b());
        } else {
            if (qVar instanceof C5749g) {
                return qVar.mo33958d().equals(qVar2.mo33958d());
            }
            if (qVar == qVar2) {
                return true;
            }
            return false;
        }
    }
}
