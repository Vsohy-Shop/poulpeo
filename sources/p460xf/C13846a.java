package p460xf;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p436tf.C13533i;

/* renamed from: xf.a */
/* compiled from: Duration.kt */
public final class C13846a implements Comparable<C13846a> {

    /* renamed from: b */
    public static final C13847a f22355b = new C13847a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private static final long f22356c = m31825a(0);

    /* renamed from: d */
    private static final long f22357d = C13849c.m31830b(4611686018427387903L);

    /* renamed from: e */
    private static final long f22358e = C13849c.m31830b(-4611686018427387903L);

    /* renamed from: xf.a$a */
    /* compiled from: Duration.kt */
    public static final class C13847a {
        private C13847a() {
        }

        public /* synthetic */ C13847a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public static long m31825a(long j) {
        if (C13848b.m31828a()) {
            if (m31827c(j)) {
                if (!new C13533i(-4611686018426999999L, 4611686018426999999L).mo53165r(m31826b(j))) {
                    throw new AssertionError(m31826b(j) + " ns is out of nanoseconds range");
                }
            } else if (!new C13533i(-4611686018427387903L, 4611686018427387903L).mo53165r(m31826b(j))) {
                throw new AssertionError(m31826b(j) + " ms is out of milliseconds range");
            } else if (new C13533i(-4611686018426L, 4611686018426L).mo53165r(m31826b(j))) {
                throw new AssertionError(m31826b(j) + " ms is denormalized");
            }
        }
        return j;
    }

    /* renamed from: b */
    private static final long m31826b(long j) {
        return j >> 1;
    }

    /* renamed from: c */
    private static final boolean m31827c(long j) {
        if ((((int) j) & 1) == 0) {
            return true;
        }
        return false;
    }
}
