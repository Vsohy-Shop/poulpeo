package p460xf;

import kotlin.jvm.internal.C12775o;
import p436tf.C13533i;

/* renamed from: xf.c */
/* compiled from: Duration.kt */
public final class C13849c {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final long m31830b(long j) {
        return C13846a.m31825a((j << 1) + 1);
    }

    /* renamed from: c */
    private static final long m31831c(long j) {
        return C13846a.m31825a(j << 1);
    }

    /* renamed from: d */
    public static final long m31832d(long j, C13850d dVar) {
        C12775o.m28639i(dVar, "unit");
        C13850d dVar2 = C13850d.NANOSECONDS;
        long b = C13851e.m31836b(4611686018426999999L, dVar2, dVar);
        if (new C13533i(-b, b).mo53165r(j)) {
            return m31831c(C13851e.m31836b(j, dVar, dVar2));
        }
        return m31830b(C13537l.m30888o(C13851e.m31835a(j, dVar, C13850d.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }
}
