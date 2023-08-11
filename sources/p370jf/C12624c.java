package p370jf;

/* renamed from: jf.c */
/* compiled from: progressionUtil.kt */
public final class C12624c {
    /* renamed from: a */
    private static final int m28011a(int i, int i2, int i3) {
        return m28015e(m28015e(i, i3) - m28015e(i2, i3), i3);
    }

    /* renamed from: b */
    private static final long m28012b(long j, long j2, long j3) {
        return m28016f(m28016f(j, j3) - m28016f(j2, j3), j3);
    }

    /* renamed from: c */
    public static final int m28013c(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            return i2 - m28011a(i2, i, i3);
        } else if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (i <= i2) {
            return i2;
        } else {
            return i2 + m28011a(i, i2, -i3);
        }
    }

    /* renamed from: d */
    public static final long m28014d(long j, long j2, long j3) {
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (i > 0) {
            if (j >= j2) {
                return j2;
            }
            return j2 - m28012b(j2, j, j3);
        } else if (i >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (j <= j2) {
            return j2;
        } else {
            return j2 + m28012b(j, j2, -j3);
        }
    }

    /* renamed from: e */
    private static final int m28015e(int i, int i2) {
        int i3 = i % i2;
        if (i3 >= 0) {
            return i3;
        }
        return i3 + i2;
    }

    /* renamed from: f */
    private static final long m28016f(long j, long j2) {
        long j3 = j % j2;
        if (j3 >= 0) {
            return j3;
        }
        return j3 + j2;
    }
}
