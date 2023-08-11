package p429se;

import java.util.concurrent.atomic.AtomicReference;
import p307af.C10885a;
import p341fe.C11953j;
import p341fe.C11954k;
import p341fe.C11955l;
import p341fe.C11956m;
import p361ie.C12141b;
import p369je.C12620a;
import p391me.C12936b;

/* renamed from: se.c */
/* compiled from: MaybeCreate */
public final class C13403c<T> extends C11953j<T> {

    /* renamed from: b */
    final C11956m<T> f21478b;

    /* renamed from: se.c$a */
    /* compiled from: MaybeCreate */
    static final class C13404a<T> extends AtomicReference<C12141b> implements C11954k<T>, C12141b {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: b */
        final C11955l<? super T> f21479b;

        C13404a(C11955l<? super T> lVar) {
            this.f21479b = lVar;
        }

        /* renamed from: a */
        public void mo49242a(T t) {
            C12141b bVar;
            Object obj = get();
            C12936b bVar2 = C12936b.DISPOSED;
            if (obj != bVar2 && (bVar = (C12141b) getAndSet(bVar2)) != bVar2) {
                if (t == null) {
                    try {
                        this.f21479b.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                    } catch (Throwable th) {
                        if (bVar != null) {
                            bVar.dispose();
                        }
                        throw th;
                    }
                } else {
                    this.f21479b.mo49245a(t);
                }
                if (bVar != null) {
                    bVar.dispose();
                }
            }
        }

        /* renamed from: b */
        public void mo49243b() {
            C12141b bVar;
            Object obj = get();
            C12936b bVar2 = C12936b.DISPOSED;
            if (obj != bVar2 && (bVar = (C12141b) getAndSet(bVar2)) != bVar2) {
                try {
                    this.f21479b.mo49246b();
                } finally {
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            }
        }

        /* renamed from: c */
        public boolean mo53011c(Throwable th) {
            C12141b bVar;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Object obj = get();
            C12936b bVar2 = C12936b.DISPOSED;
            if (obj == bVar2 || (bVar = (C12141b) getAndSet(bVar2)) == bVar2) {
                return false;
            }
            try {
                this.f21479b.onError(th);
            } finally {
                if (bVar != null) {
                    bVar.dispose();
                }
            }
        }

        public void dispose() {
            C12936b.m29221a(this);
        }

        public boolean isDisposed() {
            return C12936b.m29222b((C12141b) get());
        }

        public void onError(Throwable th) {
            if (!mo53011c(th)) {
                C10885a.m23270q(th);
            }
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{C13404a.class.getSimpleName(), super.toString()});
        }
    }

    public C13403c(C11956m<T> mVar) {
        this.f21478b = mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo49236u(C11955l<? super T> lVar) {
        C13404a aVar = new C13404a(lVar);
        lVar.mo49247c(aVar);
        try {
            this.f21478b.mo29949a(aVar);
        } catch (Throwable th) {
            C12620a.m28007b(th);
            aVar.onError(th);
        }
    }
}
