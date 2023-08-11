package p411pe;

import java.util.concurrent.atomic.AtomicReference;
import p341fe.C11966t;
import p361ie.C12141b;
import p391me.C12936b;

/* renamed from: pe.f */
/* compiled from: ResumeSingleObserver */
public final class C13211f<T> implements C11966t<T> {

    /* renamed from: b */
    final AtomicReference<C12141b> f21020b;

    /* renamed from: c */
    final C11966t<? super T> f21021c;

    public C13211f(AtomicReference<C12141b> atomicReference, C11966t<? super T> tVar) {
        this.f21020b = atomicReference;
        this.f21021c = tVar;
    }

    /* renamed from: a */
    public void mo49277a(T t) {
        this.f21021c.mo49277a(t);
    }

    /* renamed from: c */
    public void mo49278c(C12141b bVar) {
        C12936b.m29223c(this.f21020b, bVar);
    }

    public void onError(Throwable th) {
        this.f21021c.onError(th);
    }
}
