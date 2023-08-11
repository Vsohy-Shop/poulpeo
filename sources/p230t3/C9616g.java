package p230t3;

import p169n3.C8901b;
import p169n3.C8903d;

/* renamed from: t3.g */
/* compiled from: EventStoreModule_DbNameFactory */
public final class C9616g implements C8901b<String> {

    /* renamed from: t3.g$a */
    /* compiled from: EventStoreModule_DbNameFactory */
    private static final class C9617a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C9616g f14312a = new C9616g();
    }

    /* renamed from: a */
    public static C9616g m19967a() {
        return C9617a.f14312a;
    }

    /* renamed from: b */
    public static String m19968b() {
        return (String) C8903d.m18035c(C9614f.m19963a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public String get() {
        return m19968b();
    }
}
