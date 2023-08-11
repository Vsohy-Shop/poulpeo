package p356hg;

import p331dg.C11828g0;

/* renamed from: hg.c */
/* compiled from: Mutex.kt */
public final class C12096c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C11828g0 f18932a = new C11828g0("NO_OWNER");

    /* renamed from: b */
    private static final C11828g0 f18933b = new C11828g0("ALREADY_LOCKED_BY_OWNER");

    /* renamed from: a */
    public static final C12088a m26295a(boolean z) {
        return new C12090b(z);
    }

    /* renamed from: b */
    public static /* synthetic */ C12088a m26296b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m26295a(z);
    }
}
