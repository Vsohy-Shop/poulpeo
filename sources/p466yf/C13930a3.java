package p466yf;

import p355hf.C12079g;

/* renamed from: yf.a3 */
/* compiled from: Unconfined.kt */
public final class C13930a3 extends C13971h0 {

    /* renamed from: b */
    public static final C13930a3 f22848b = new C13930a3();

    private C13930a3() {
    }

    public void dispatch(C12079g gVar, Runnable runnable) {
        C13951e3 e3Var = (C13951e3) gVar.get(C13951e3.f22866c);
        if (e3Var != null) {
            e3Var.f22867b = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public boolean isDispatchNeeded(C12079g gVar) {
        return false;
    }

    public C13971h0 limitedParallelism(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
