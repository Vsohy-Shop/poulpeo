package p252v3;

import p169n3.C8901b;
import p169n3.C8903d;

/* renamed from: v3.c */
/* compiled from: TimeModule_EventClockFactory */
public final class C9929c implements C8901b<C9927a> {

    /* renamed from: v3.c$a */
    /* compiled from: TimeModule_EventClockFactory */
    private static final class C9930a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C9929c f14929a = new C9929c();
    }

    /* renamed from: a */
    public static C9929c m20739a() {
        return C9930a.f14929a;
    }

    /* renamed from: b */
    public static C9927a m20740b() {
        return (C9927a) C8903d.m18035c(C9928b.m20737a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public C9927a get() {
        return m20740b();
    }
}
