package p429se;

import p341fe.C11949f;
import p341fe.C11955l;
import p341fe.C11957n;
import p361ie.C12141b;
import p386lg.C12860b;
import p391me.C12936b;
import p465ye.C13921c;

/* renamed from: se.t */
/* compiled from: MaybeToFlowable */
public final class C13438t<T> extends C11949f<T> {

    /* renamed from: c */
    final C11957n<T> f21544c;

    /* renamed from: se.t$a */
    /* compiled from: MaybeToFlowable */
    static final class C13439a<T> extends C13921c<T> implements C11955l<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: d */
        C12141b f21545d;

        C13439a(C12860b<? super T> bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public void mo49245a(T t) {
            mo53657i(t);
        }

        /* renamed from: b */
        public void mo49246b() {
            this.f22825b.mo50772b();
        }

        /* renamed from: c */
        public void mo49247c(C12141b bVar) {
            if (C12936b.m29227g(this.f21545d, bVar)) {
                this.f21545d = bVar;
                this.f22825b.mo49220e(this);
            }
        }

        public void cancel() {
            super.cancel();
            this.f21545d.dispose();
        }

        public void onError(Throwable th) {
            this.f22825b.onError(th);
        }
    }

    public C13438t(C11957n<T> nVar) {
        this.f21544c = nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo49200I(C12860b<? super T> bVar) {
        this.f21544c.mo49221a(new C13439a(bVar));
    }
}
