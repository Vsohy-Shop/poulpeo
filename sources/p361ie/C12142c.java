package p361ie;

import p391me.C12937c;
import p397ne.C12999a;
import p397ne.C13016b;

/* renamed from: ie.c */
/* compiled from: Disposables */
public final class C12142c {
    /* renamed from: a */
    public static C12141b m26480a() {
        return C12937c.INSTANCE;
    }

    /* renamed from: b */
    public static C12141b m26481b() {
        return m26482c(C12999a.f20801b);
    }

    /* renamed from: c */
    public static C12141b m26482c(Runnable runnable) {
        C13016b.m29390d(runnable, "run is null");
        return new C12144e(runnable);
    }
}
