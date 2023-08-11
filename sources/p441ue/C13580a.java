package p441ue;

import p341fe.C11965s;
import p341fe.C11966t;
import p341fe.C11967u;
import p361ie.C12141b;
import p364io.reactivex.exceptions.CompositeException;
import p369je.C12620a;
import p384le.C12853d;

/* renamed from: ue.a */
/* compiled from: SingleDoOnError */
public final class C13580a<T> extends C11965s<T> {

    /* renamed from: b */
    final C11967u<T> f21838b;

    /* renamed from: c */
    final C12853d<? super Throwable> f21839c;

    /* renamed from: ue.a$a */
    /* compiled from: SingleDoOnError */
    final class C13581a implements C11966t<T> {

        /* renamed from: b */
        private final C11966t<? super T> f21840b;

        C13581a(C11966t<? super T> tVar) {
            this.f21840b = tVar;
        }

        /* renamed from: a */
        public void mo49277a(T t) {
            this.f21840b.mo49277a(t);
        }

        /* renamed from: c */
        public void mo49278c(C12141b bVar) {
            this.f21840b.mo49278c(bVar);
        }

        public void onError(Throwable th) {
            try {
                C13580a.this.f21839c.accept(th);
            } catch (Throwable th2) {
                C12620a.m28007b(th2);
                th = new CompositeException(th, th2);
            }
            this.f21840b.onError(th);
        }
    }

    public C13580a(C11967u<T> uVar, C12853d<? super Throwable> dVar) {
        this.f21838b = uVar;
        this.f21839c = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo49275k(C11966t<? super T> tVar) {
        this.f21838b.mo49269a(new C13581a(tVar));
    }
}
