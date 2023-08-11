package p423re;

import p341fe.C11949f;
import p341fe.C11958o;
import p341fe.C11961q;
import p361ie.C12141b;
import p386lg.C12860b;
import p386lg.C12861c;

/* renamed from: re.n */
/* compiled from: FlowableFromObservable */
public final class C13332n<T> extends C11949f<T> {

    /* renamed from: c */
    private final C11958o<T> f21326c;

    public C13332n(C11958o<T> oVar) {
        this.f21326c = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo49200I(C12860b<? super T> bVar) {
        this.f21326c.mo49249a(new C13333a(bVar));
    }

    /* renamed from: re.n$a */
    /* compiled from: FlowableFromObservable */
    static class C13333a<T> implements C11961q<T>, C12861c {

        /* renamed from: b */
        private final C12860b<? super T> f21327b;

        /* renamed from: c */
        private C12141b f21328c;

        C13333a(C12860b<? super T> bVar) {
            this.f21327b = bVar;
        }

        /* renamed from: b */
        public void mo46139b() {
            this.f21327b.mo50772b();
        }

        /* renamed from: c */
        public void mo46140c(C12141b bVar) {
            this.f21328c = bVar;
            this.f21327b.mo49220e(this);
        }

        public void cancel() {
            this.f21328c.dispose();
        }

        /* renamed from: d */
        public void mo46141d(T t) {
            this.f21327b.mo50773d(t);
        }

        public void onError(Throwable th) {
            this.f21327b.onError(th);
        }

        /* renamed from: h */
        public void mo50776h(long j) {
        }
    }
}
