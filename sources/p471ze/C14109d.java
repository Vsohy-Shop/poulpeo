package p471ze;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicLong;
import p307af.C10885a;

/* renamed from: ze.d */
/* compiled from: BackpressureHelper */
public final class C14109d {
    /* renamed from: a */
    public static long m32751a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == LocationRequestCompat.PASSIVE_INTERVAL) {
                return LocationRequestCompat.PASSIVE_INTERVAL;
            }
        } while (!atomicLong.compareAndSet(j2, m32753c(j2, j)));
        return j2;
    }

    /* renamed from: b */
    public static long m32752b(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j2 == LocationRequestCompat.PASSIVE_INTERVAL) {
                return LocationRequestCompat.PASSIVE_INTERVAL;
            }
        } while (!atomicLong.compareAndSet(j2, m32753c(j2, j)));
        return j2;
    }

    /* renamed from: c */
    public static long m32753c(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return LocationRequestCompat.PASSIVE_INTERVAL;
        }
        return j3;
    }

    /* renamed from: d */
    public static long m32754d(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == LocationRequestCompat.PASSIVE_INTERVAL) {
                return LocationRequestCompat.PASSIVE_INTERVAL;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                C10885a.m23270q(new IllegalStateException("More produced than requested: " + j3));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }
}
