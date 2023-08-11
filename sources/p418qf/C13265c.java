package p418qf;

/* renamed from: qf.c */
/* compiled from: MathJVM.kt */
class C13265c extends C13264b {
    /* renamed from: a */
    public static int m30132a(int i) {
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m30133b(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        } else if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        } else {
            if (d < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d);
        }
    }

    /* renamed from: c */
    public static int m30134c(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* renamed from: d */
    public static long m30135d(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* renamed from: e */
    public static long m30136e(float f) {
        return m30135d((double) f);
    }
}
