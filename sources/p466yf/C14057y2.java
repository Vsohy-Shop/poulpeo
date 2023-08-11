package p466yf;

import p331dg.C11820c0;
import p355hf.C12074d;

/* renamed from: yf.y2 */
/* compiled from: Timeout.kt */
final class C14057y2<U, T extends U> extends C11820c0<T> implements Runnable {

    /* renamed from: f */
    public final long f22972f;

    public C14057y2(long j, C12074d<? super U> dVar) {
        super(dVar.getContext(), dVar);
        this.f22972f = j;
    }

    /* renamed from: l0 */
    public String mo53667l0() {
        return super.mo53667l0() + "(timeMillis=" + this.f22972f + ')';
    }

    public void run() {
        mo53725w(C14061z2.m32613a(this.f22972f, C14041v0.m32564b(getContext()), this));
    }
}
