package p343fg;

import p331dg.C11847o;
import p355hf.C12079g;
import p466yf.C13971h0;

/* renamed from: fg.m */
/* compiled from: Dispatcher.kt */
final class C12003m extends C13971h0 {

    /* renamed from: b */
    public static final C12003m f18762b = new C12003m();

    private C12003m() {
    }

    public void dispatch(C12079g gVar, Runnable runnable) {
        C11993c.f18743h.mo49427v0(runnable, C12002l.f18761h, false);
    }

    public void dispatchYield(C12079g gVar, Runnable runnable) {
        C11993c.f18743h.mo49427v0(runnable, C12002l.f18761h, true);
    }

    public C13971h0 limitedParallelism(int i) {
        C11847o.m25529a(i);
        if (i >= C12002l.f18757d) {
            return this;
        }
        return super.limitedParallelism(i);
    }
}
