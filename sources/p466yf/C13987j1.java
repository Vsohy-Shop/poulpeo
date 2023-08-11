package p466yf;

import java.util.concurrent.locks.LockSupport;
import p466yf.C13979i1;

/* renamed from: yf.j1 */
/* compiled from: EventLoop.kt */
public abstract class C13987j1 extends C13974h1 {
    /* access modifiers changed from: protected */
    /* renamed from: F0 */
    public abstract Thread mo53742F0();

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public void mo53771G0(long j, C13979i1.C13982c cVar) {
        C14019q0.f22942h.mo53762Q0(j, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H0 */
    public final void mo53772H0() {
        Thread F0 = mo53742F0();
        if (Thread.currentThread() != F0) {
            C13936c.m32231a();
            LockSupport.unpark(F0);
        }
    }
}
