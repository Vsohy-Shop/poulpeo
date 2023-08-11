package p436tf;

import kotlin.jvm.internal.C12775o;
import p436tf.C13525d;

/* renamed from: tf.l */
/* compiled from: _Ranges.kt */
class C13537l extends C13536k {
    /* renamed from: c */
    public static float m30876c(float f, float f2) {
        if (f < f2) {
            return f2;
        }
        return f;
    }

    /* renamed from: d */
    public static int m30877d(int i, int i2) {
        if (i < i2) {
            return i2;
        }
        return i;
    }

    /* renamed from: e */
    public static long m30878e(long j, long j2) {
        if (j < j2) {
            return j2;
        }
        return j;
    }

    /* renamed from: f */
    public static <T extends Comparable<? super T>> T m30879f(T t, T t2) {
        C12775o.m28639i(t, "<this>");
        C12775o.m28639i(t2, "minimumValue");
        if (t.compareTo(t2) < 0) {
            return t2;
        }
        return t;
    }

    /* renamed from: g */
    public static double m30880g(double d, double d2) {
        if (d > d2) {
            return d2;
        }
        return d;
    }

    /* renamed from: h */
    public static float m30881h(float f, float f2) {
        if (f > f2) {
            return f2;
        }
        return f;
    }

    /* renamed from: i */
    public static int m30882i(int i, int i2) {
        if (i > i2) {
            return i2;
        }
        return i;
    }

    /* renamed from: j */
    public static long m30883j(long j, long j2) {
        if (j > j2) {
            return j2;
        }
        return j;
    }

    /* renamed from: k */
    public static double m30884k(double d, double d2, double d3) {
        if (d2 > d3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
        } else if (d < d2) {
            return d2;
        } else {
            if (d > d3) {
                return d3;
            }
            return d;
        }
    }

    /* renamed from: l */
    public static float m30885l(float f, float f2, float f3) {
        if (f2 > f3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
        } else if (f < f2) {
            return f2;
        } else {
            if (f > f3) {
                return f3;
            }
            return f;
        }
    }

    /* renamed from: m */
    public static int m30886m(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
        } else if (i < i2) {
            return i2;
        } else {
            if (i > i3) {
                return i3;
            }
            return i;
        }
    }

    /* renamed from: n */
    public static int m30887n(int i, C13523c<Integer> cVar) {
        C12775o.m28639i(cVar, "range");
        if (cVar instanceof C13522b) {
            return ((Number) m30889p(Integer.valueOf(i), (C13522b) cVar)).intValue();
        }
        if (cVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + cVar + '.');
        } else if (i < cVar.getStart().intValue()) {
            return cVar.getStart().intValue();
        } else {
            if (i > cVar.getEndInclusive().intValue()) {
                return cVar.getEndInclusive().intValue();
            }
            return i;
        }
    }

    /* renamed from: o */
    public static long m30888o(long j, long j2, long j3) {
        if (j2 > j3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
        } else if (j < j2) {
            return j2;
        } else {
            if (j > j3) {
                return j3;
            }
            return j;
        }
    }

    /* renamed from: p */
    public static <T extends Comparable<? super T>> T m30889p(T t, C13522b<T> bVar) {
        C12775o.m28639i(t, "<this>");
        C12775o.m28639i(bVar, "range");
        if (bVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + bVar + '.');
        } else if (bVar.mo53135b(t, bVar.getStart()) && !bVar.mo53135b(bVar.getStart(), t)) {
            return bVar.getStart();
        } else {
            if (!bVar.mo53135b(bVar.getEndInclusive(), t) || bVar.mo53135b(t, bVar.getEndInclusive())) {
                return t;
            }
            return bVar.getEndInclusive();
        }
    }

    /* renamed from: q */
    public static C13525d m30890q(int i, int i2) {
        return C13525d.f21766e.mo53152a(i, i2, -1);
    }

    /* renamed from: r */
    public static C13525d m30891r(C13525d dVar) {
        C12775o.m28639i(dVar, "<this>");
        return C13525d.f21766e.mo53152a(dVar.mo53148k(), dVar.mo53147j(), -dVar.mo53149q());
    }

    /* renamed from: s */
    public static C13525d m30892s(C13525d dVar, int i) {
        boolean z;
        C12775o.m28639i(dVar, "<this>");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13536k.m30874a(z, Integer.valueOf(i));
        C13525d.C13526a aVar = C13525d.f21766e;
        int j = dVar.mo53147j();
        int k = dVar.mo53148k();
        if (dVar.mo53149q() <= 0) {
            i = -i;
        }
        return aVar.mo53152a(j, k, i);
    }

    /* renamed from: t */
    public static C13528f m30893t(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C13528f.f21774f.mo53157a();
        }
        return new C13528f(i, i2 - 1);
    }
}
