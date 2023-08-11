package p294z1;

import android.os.SystemClock;

/* renamed from: z1.f */
/* compiled from: LogTime */
public final class C10787f {

    /* renamed from: a */
    private static final double f16501a = (1.0d / Math.pow(10.0d, 6.0d));

    /* renamed from: a */
    public static double m22931a(long j) {
        return ((double) (m22932b() - j)) * f16501a;
    }

    /* renamed from: b */
    public static long m22932b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
