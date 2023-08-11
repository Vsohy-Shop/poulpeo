package p336ef;

import kotlin.jvm.internal.C12775o;

/* renamed from: ef.x */
/* compiled from: UnsignedUtils.kt */
public final class C11923x {
    /* renamed from: a */
    public static final int m25721a(long j, long j2) {
        return C12775o.m28642l(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    /* renamed from: b */
    public static final double m25722b(long j) {
        return (((double) (j >>> 11)) * ((double) 2048)) + ((double) (j & 2047));
    }

    /* renamed from: c */
    public static final String m25723c(long j) {
        return m25724d(j, 10);
    }

    /* renamed from: d */
    public static final String m25724d(long j, int i) {
        if (j >= 0) {
            String l = Long.toString(j, C13724b.m31415a(i));
            C12775o.m28638h(l, "toString(this, checkRadix(radix))");
            return l;
        }
        long j2 = (long) i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String l2 = Long.toString(j3, C13724b.m31415a(i));
        C12775o.m28638h(l2, "toString(this, checkRadix(radix))");
        sb.append(l2);
        String l3 = Long.toString(j4, C13724b.m31415a(i));
        C12775o.m28638h(l3, "toString(this, checkRadix(radix))");
        sb.append(l3);
        return sb.toString();
    }
}
