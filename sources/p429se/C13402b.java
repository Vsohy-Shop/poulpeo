package p429se;

import java.util.concurrent.atomic.AtomicReference;
import p307af.C10885a;
import p341fe.C11955l;
import p361ie.C12141b;
import p364io.reactivex.exceptions.CompositeException;
import p369je.C12620a;
import p384le.C12850a;
import p384le.C12853d;
import p391me.C12936b;

/* renamed from: se.b */
/* compiled from: MaybeCallbackObserver */
public final class C13402b<T> extends AtomicReference<C12141b> implements C11955l<T>, C12141b {
    private static final long serialVersionUID = -6076952298809384986L;

    /* renamed from: b */
    final C12853d<? super T> f21475b;

    /* renamed from: c */
    final C12853d<? super Throwable> f21476c;

    /* renamed from: d */
    final C12850a f21477d;

    public C13402b(C12853d<? super T> dVar, C12853d<? super Throwable> dVar2, C12850a aVar) {
        this.f21475b = dVar;
        this.f21476c = dVar2;
        this.f21477d = aVar;
    }

    /* renamed from: a */
    public void mo49245a(T t) {
        lazySet(C12936b.DISPOSED);
        try {
            this.f21475b.accept(t);
        } catch (Throwable th) {
            C12620a.m28007b(th);
            C10885a.m23270q(th);
        }
    }

    /* renamed from: b */
    public void mo49246b() {
        lazySet(C12936b.DISPOSED);
        try {
            this.f21477d.run();
        } catch (Throwable th) {
            C12620a.m28007b(th);
            C10885a.m23270q(th);
        }
    }

    /* renamed from: c */
    public void mo49247c(C12141b bVar) {
        C12936b.m29226f(this, bVar);
    }

    public void dispose() {
        C12936b.m29221a(this);
    }

    public boolean isDisposed() {
        return C12936b.m29222b((C12141b) get());
    }

    public void onError(Throwable th) {
        lazySet(C12936b.DISPOSED);
        try {
            this.f21476c.accept(th);
        } catch (Throwable th2) {
            C12620a.m28007b(th2);
            C10885a.m23270q(new CompositeException(th, th2));
        }
    }
}
