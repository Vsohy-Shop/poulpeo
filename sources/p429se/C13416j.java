package p429se;

import p341fe.C11946c;
import p341fe.C11947d;
import p341fe.C11953j;
import p341fe.C11955l;
import p361ie.C12141b;
import p391me.C12936b;

/* renamed from: se.j */
/* compiled from: MaybeFromCompletable */
public final class C13416j<T> extends C11953j<T> {

    /* renamed from: b */
    final C11947d f21500b;

    /* renamed from: se.j$a */
    /* compiled from: MaybeFromCompletable */
    static final class C13417a<T> implements C11946c, C12141b {

        /* renamed from: b */
        final C11955l<? super T> f21501b;

        /* renamed from: c */
        C12141b f21502c;

        C13417a(C11955l<? super T> lVar) {
            this.f21501b = lVar;
        }

        /* renamed from: b */
        public void mo49188b() {
            this.f21502c = C12936b.DISPOSED;
            this.f21501b.mo49246b();
        }

        /* renamed from: c */
        public void mo49189c(C12141b bVar) {
            if (C12936b.m29227g(this.f21502c, bVar)) {
                this.f21502c = bVar;
                this.f21501b.mo49247c(this);
            }
        }

        public void dispose() {
            this.f21502c.dispose();
            this.f21502c = C12936b.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f21502c.isDisposed();
        }

        public void onError(Throwable th) {
            this.f21502c = C12936b.DISPOSED;
            this.f21501b.onError(th);
        }
    }

    public C13416j(C11947d dVar) {
        this.f21500b = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo49236u(C11955l<? super T> lVar) {
        this.f21500b.mo49177a(new C13417a(lVar));
    }
}
