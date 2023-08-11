package p411pe;

import java.util.concurrent.atomic.AtomicReference;
import p307af.C10885a;
import p341fe.C11946c;
import p361ie.C12141b;
import p364io.reactivex.exceptions.OnErrorNotImplementedException;
import p391me.C12936b;

/* renamed from: pe.e */
/* compiled from: EmptyCompletableObserver */
public final class C13210e extends AtomicReference<C12141b> implements C11946c, C12141b {
    private static final long serialVersionUID = -7545121636549663526L;

    /* renamed from: b */
    public void mo49188b() {
        lazySet(C12936b.DISPOSED);
    }

    /* renamed from: c */
    public void mo49189c(C12141b bVar) {
        C12936b.m29226f(this, bVar);
    }

    public void dispose() {
        C12936b.m29221a(this);
    }

    public boolean isDisposed() {
        if (get() == C12936b.DISPOSED) {
            return true;
        }
        return false;
    }

    public void onError(Throwable th) {
        lazySet(C12936b.DISPOSED);
        C10885a.m23270q(new OnErrorNotImplementedException(th));
    }
}
