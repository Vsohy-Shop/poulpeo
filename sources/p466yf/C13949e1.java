package p466yf;

import p336ef.C11921v;

/* renamed from: yf.e1 */
/* compiled from: CancellableContinuation.kt */
final class C13949e1 extends C13994l {

    /* renamed from: b */
    private final C13943d1 f22864b;

    public C13949e1(C13943d1 d1Var) {
        this.f22864b = d1Var;
    }

    /* renamed from: d */
    public void mo49455d(Throwable th) {
        this.f22864b.dispose();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo49455d((Throwable) obj);
        return C11921v.f18618a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f22864b + ']';
    }
}
