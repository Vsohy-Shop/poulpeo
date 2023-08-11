package p459xe;

import java.util.concurrent.atomic.AtomicReference;
import p307af.C10885a;
import p341fe.C11952i;
import p361ie.C12141b;
import p364io.reactivex.exceptions.CompositeException;
import p369je.C12620a;
import p384le.C12850a;
import p384le.C12853d;
import p386lg.C12861c;
import p465ye.C13925g;

/* renamed from: xe.c */
/* compiled from: LambdaSubscriber */
public final class C13844c<T> extends AtomicReference<C12861c> implements C11952i<T>, C12861c, C12141b {
    private static final long serialVersionUID = -7251123623727029452L;

    /* renamed from: b */
    final C12853d<? super T> f22345b;

    /* renamed from: c */
    final C12853d<? super Throwable> f22346c;

    /* renamed from: d */
    final C12850a f22347d;

    /* renamed from: e */
    final C12853d<? super C12861c> f22348e;

    public C13844c(C12853d<? super T> dVar, C12853d<? super Throwable> dVar2, C12850a aVar, C12853d<? super C12861c> dVar3) {
        this.f22345b = dVar;
        this.f22346c = dVar2;
        this.f22347d = aVar;
        this.f22348e = dVar3;
    }

    /* renamed from: b */
    public void mo50772b() {
        Object obj = get();
        C13925g gVar = C13925g.CANCELLED;
        if (obj != gVar) {
            lazySet(gVar);
            try {
                this.f22347d.run();
            } catch (Throwable th) {
                C12620a.m28007b(th);
                C10885a.m23270q(th);
            }
        }
    }

    public void cancel() {
        C13925g.m32182a(this);
    }

    /* renamed from: d */
    public void mo50773d(T t) {
        if (!isDisposed()) {
            try {
                this.f22345b.accept(t);
            } catch (Throwable th) {
                C12620a.m28007b(th);
                ((C12861c) get()).cancel();
                onError(th);
            }
        }
    }

    public void dispose() {
        cancel();
    }

    /* renamed from: e */
    public void mo49220e(C12861c cVar) {
        if (C13925g.m32187f(this, cVar)) {
            try {
                this.f22348e.accept(this);
            } catch (Throwable th) {
                C12620a.m28007b(th);
                cVar.cancel();
                onError(th);
            }
        }
    }

    /* renamed from: h */
    public void mo50776h(long j) {
        ((C12861c) get()).mo50776h(j);
    }

    public boolean isDisposed() {
        if (get() == C13925g.CANCELLED) {
            return true;
        }
        return false;
    }

    public void onError(Throwable th) {
        Object obj = get();
        C13925g gVar = C13925g.CANCELLED;
        if (obj != gVar) {
            lazySet(gVar);
            try {
                this.f22346c.accept(th);
            } catch (Throwable th2) {
                C12620a.m28007b(th2);
                C10885a.m23270q(new CompositeException(th, th2));
            }
        } else {
            C10885a.m23270q(th);
        }
    }
}
