package p466yf;

import java.util.concurrent.Future;
import p336ef.C11921v;

/* renamed from: yf.k */
/* compiled from: Future.kt */
final class C13989k extends C13994l {

    /* renamed from: b */
    private final Future<?> f22919b;

    public C13989k(Future<?> future) {
        this.f22919b = future;
    }

    /* renamed from: d */
    public void mo49455d(Throwable th) {
        if (th != null) {
            this.f22919b.cancel(false);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo49455d((Throwable) obj);
        return C11921v.f18618a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f22919b + ']';
    }
}
