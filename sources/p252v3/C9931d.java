package p252v3;

import p169n3.C8901b;
import p169n3.C8903d;

/* renamed from: v3.d */
/* compiled from: TimeModule_UptimeClockFactory */
public final class C9931d implements C8901b<C9927a> {

    /* renamed from: v3.d$a */
    /* compiled from: TimeModule_UptimeClockFactory */
    private static final class C9932a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C9931d f14930a = new C9931d();
    }

    /* renamed from: a */
    public static C9931d m20743a() {
        return C9932a.f14930a;
    }

    /* renamed from: c */
    public static C9927a m20744c() {
        return (C9927a) C8903d.m18035c(C9928b.m20738b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C9927a get() {
        return m20744c();
    }
}
