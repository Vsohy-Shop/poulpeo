package p441ue;

import p341fe.C11949f;
import p341fe.C11966t;
import p341fe.C11967u;
import p361ie.C12141b;
import p386lg.C12860b;
import p391me.C12936b;
import p465ye.C13921c;

/* renamed from: ue.e */
/* compiled from: SingleToFlowable */
public final class C13587e<T> extends C11949f<T> {

    /* renamed from: c */
    final C11967u<? extends T> f21851c;

    /* renamed from: ue.e$a */
    /* compiled from: SingleToFlowable */
    static final class C13588a<T> extends C13921c<T> implements C11966t<T> {
        private static final long serialVersionUID = 187782011903685568L;

        /* renamed from: d */
        C12141b f21852d;

        C13588a(C12860b<? super T> bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public void mo49277a(T t) {
            mo53657i(t);
        }

        /* renamed from: c */
        public void mo49278c(C12141b bVar) {
            if (C12936b.m29227g(this.f21852d, bVar)) {
                this.f21852d = bVar;
                this.f22825b.mo49220e(this);
            }
        }

        public void cancel() {
            super.cancel();
            this.f21852d.dispose();
        }

        public void onError(Throwable th) {
            this.f22825b.onError(th);
        }
    }

    public C13587e(C11967u<? extends T> uVar) {
        this.f21851c = uVar;
    }

    /* renamed from: I */
    public void mo49200I(C12860b<? super T> bVar) {
        this.f21851c.mo49269a(new C13588a(bVar));
    }
}
