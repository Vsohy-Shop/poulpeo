package p331dg;

import androidx.core.location.LocationRequestCompat;

/* renamed from: dg.j0 */
/* compiled from: SystemProps.common.kt */
final /* synthetic */ class C11834j0 {
    /* renamed from: a */
    public static final int m25485a(String str, int i, int i2, int i3) {
        return (int) C11830h0.m25462c(str, (long) i, (long) i2, (long) i3);
    }

    /* renamed from: b */
    public static final long m25486b(String str, long j, long j2, long j3) {
        String d = C11830h0.m25463d(str);
        if (d == null) {
            return j;
        }
        Long l = C13753u.m31519l(d);
        if (l != null) {
            long longValue = l.longValue();
            boolean z = false;
            if (j2 <= longValue && longValue <= j3) {
                z = true;
            }
            if (z) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d + '\'').toString());
    }

    /* renamed from: c */
    public static final String m25487c(String str, String str2) {
        String d = C11830h0.m25463d(str);
        if (d == null) {
            return str2;
        }
        return d;
    }

    /* renamed from: d */
    public static final boolean m25488d(String str, boolean z) {
        String d = C11830h0.m25463d(str);
        if (d != null) {
            return Boolean.parseBoolean(d);
        }
        return z;
    }

    /* renamed from: e */
    public static /* synthetic */ int m25489e(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return C11830h0.m25461b(str, i, i2, i3);
    }

    /* renamed from: f */
    public static /* synthetic */ long m25490f(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = LocationRequestCompat.PASSIVE_INTERVAL;
        }
        return C11830h0.m25462c(str, j, j4, j3);
    }
}
