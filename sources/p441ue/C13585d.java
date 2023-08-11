package p441ue;

import java.util.concurrent.atomic.AtomicReference;
import p341fe.C11965s;
import p341fe.C11966t;
import p341fe.C11967u;
import p361ie.C12141b;
import p364io.reactivex.exceptions.CompositeException;
import p369je.C12620a;
import p384le.C12854e;
import p391me.C12936b;
import p397ne.C13016b;
import p411pe.C13211f;

/* renamed from: ue.d */
/* compiled from: SingleResumeNext */
public final class C13585d<T> extends C11965s<T> {

    /* renamed from: b */
    final C11967u<? extends T> f21847b;

    /* renamed from: c */
    final C12854e<? super Throwable, ? extends C11967u<? extends T>> f21848c;

    /* renamed from: ue.d$a */
    /* compiled from: SingleResumeNext */
    static final class C13586a<T> extends AtomicReference<C12141b> implements C11966t<T>, C12141b {
        private static final long serialVersionUID = -5314538511045349925L;

        /* renamed from: b */
        final C11966t<? super T> f21849b;

        /* renamed from: c */
        final C12854e<? super Throwable, ? extends C11967u<? extends T>> f21850c;

        C13586a(C11966t<? super T> tVar, C12854e<? super Throwable, ? extends C11967u<? extends T>> eVar) {
            this.f21849b = tVar;
            this.f21850c = eVar;
        }

        /* renamed from: a */
        public void mo49277a(T t) {
            this.f21849b.mo49277a(t);
        }

        /* renamed from: c */
        public void mo49278c(C12141b bVar) {
            if (C12936b.m29226f(this, bVar)) {
                this.f21849b.mo49278c(this);
            }
        }

        public void dispose() {
            C12936b.m29221a(this);
        }

        public boolean isDisposed() {
            return C12936b.m29222b((C12141b) get());
        }

        public void onError(Throwable th) {
            try {
                ((C11967u) C13016b.m29390d(this.f21850c.apply(th), "The nextFunction returned a null SingleSource.")).mo49269a(new C13211f(this, this.f21849b));
            } catch (Throwable th2) {
                C12620a.m28007b(th2);
                this.f21849b.onError(new CompositeException(th, th2));
            }
        }
    }

    public C13585d(C11967u<? extends T> uVar, C12854e<? super Throwable, ? extends C11967u<? extends T>> eVar) {
        this.f21847b = uVar;
        this.f21848c = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo49275k(C11966t<? super T> tVar) {
        this.f21847b.mo49269a(new C13586a(tVar, this.f21848c));
    }
}
