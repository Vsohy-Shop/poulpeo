package p356hg;

import p331dg.C11828g0;

/* renamed from: hg.f */
/* compiled from: Semaphore.kt */
public final class C12102f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final int f18944a = C11834j0.m25489e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C11828g0 f18945b = new C11828g0("PERMIT");
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C11828g0 f18946c = new C11828g0("TAKEN");
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C11828g0 f18947d = new C11828g0("BROKEN");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C11828g0 f18948e = new C11828g0("CANCELLED");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final int f18949f = C11834j0.m25489e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, (Object) null);

    /* renamed from: a */
    public static final C12097d m26315a(int i, int i2) {
        return new C12098e(i, i2);
    }

    /* renamed from: b */
    public static /* synthetic */ C12097d m26316b(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m26315a(i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final C12103g m26324j(long j, C12103g gVar) {
        return new C12103g(j, gVar, 0);
    }
}
