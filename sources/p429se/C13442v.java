package p429se;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p307af.C10885a;
import p341fe.C11953j;
import p341fe.C11955l;
import p341fe.C11957n;
import p361ie.C12141b;
import p369je.C12620a;
import p384le.C12854e;
import p391me.C12936b;
import p397ne.C13016b;
import p429se.C13423n;

/* renamed from: se.v */
/* compiled from: MaybeZipArray */
public final class C13442v<T, R> extends C11953j<R> {

    /* renamed from: b */
    final C11957n<? extends T>[] f21548b;

    /* renamed from: c */
    final C12854e<? super Object[], ? extends R> f21549c;

    /* renamed from: se.v$a */
    /* compiled from: MaybeZipArray */
    final class C13443a implements C12854e<T, R> {
        C13443a() {
        }

        public R apply(T t) {
            return C13016b.m29390d(C13442v.this.f21549c.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }

    /* renamed from: se.v$b */
    /* compiled from: MaybeZipArray */
    static final class C13444b<T, R> extends AtomicInteger implements C12141b {
        private static final long serialVersionUID = -5556924161382950569L;

        /* renamed from: b */
        final C11955l<? super R> f21551b;

        /* renamed from: c */
        final C12854e<? super Object[], ? extends R> f21552c;

        /* renamed from: d */
        final C13445c<T>[] f21553d;

        /* renamed from: e */
        final Object[] f21554e;

        C13444b(C11955l<? super R> lVar, int i, C12854e<? super Object[], ? extends R> eVar) {
            super(i);
            this.f21551b = lVar;
            this.f21552c = eVar;
            C13445c<T>[] cVarArr = new C13445c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new C13445c<>(this, i2);
            }
            this.f21553d = cVarArr;
            this.f21554e = new Object[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo53018a(int i) {
            C13445c<T>[] cVarArr = this.f21553d;
            int length = cVarArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2].mo53022d();
            }
            while (true) {
                i++;
                if (i < length) {
                    cVarArr[i].mo53022d();
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo53019b(int i) {
            if (getAndSet(0) > 0) {
                mo53018a(i);
                this.f21551b.mo49246b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo53020c(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                mo53018a(i);
                this.f21551b.onError(th);
                return;
            }
            C10885a.m23270q(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo53021d(T t, int i) {
            this.f21554e[i] = t;
            if (decrementAndGet() == 0) {
                try {
                    this.f21551b.mo49245a(C13016b.m29390d(this.f21552c.apply(this.f21554e), "The zipper returned a null value"));
                } catch (Throwable th) {
                    C12620a.m28007b(th);
                    this.f21551b.onError(th);
                }
            }
        }

        public void dispose() {
            if (getAndSet(0) > 0) {
                for (C13445c<T> d : this.f21553d) {
                    d.mo53022d();
                }
            }
        }

        public boolean isDisposed() {
            if (get() <= 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: se.v$c */
    /* compiled from: MaybeZipArray */
    static final class C13445c<T> extends AtomicReference<C12141b> implements C11955l<T> {
        private static final long serialVersionUID = 3323743579927613702L;

        /* renamed from: b */
        final C13444b<T, ?> f21555b;

        /* renamed from: c */
        final int f21556c;

        C13445c(C13444b<T, ?> bVar, int i) {
            this.f21555b = bVar;
            this.f21556c = i;
        }

        /* renamed from: a */
        public void mo49245a(T t) {
            this.f21555b.mo53021d(t, this.f21556c);
        }

        /* renamed from: b */
        public void mo49246b() {
            this.f21555b.mo53019b(this.f21556c);
        }

        /* renamed from: c */
        public void mo49247c(C12141b bVar) {
            C12936b.m29226f(this, bVar);
        }

        /* renamed from: d */
        public void mo53022d() {
            C12936b.m29221a(this);
        }

        public void onError(Throwable th) {
            this.f21555b.mo53020c(th, this.f21556c);
        }
    }

    public C13442v(C11957n<? extends T>[] nVarArr, C12854e<? super Object[], ? extends R> eVar) {
        this.f21548b = nVarArr;
        this.f21549c = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo49236u(C11955l<? super R> lVar) {
        C11957n<? extends T>[] nVarArr = this.f21548b;
        int length = nVarArr.length;
        int i = 0;
        if (length == 1) {
            nVarArr[0].mo49221a(new C13423n.C13424a(lVar, new C13443a()));
            return;
        }
        C13444b bVar = new C13444b(lVar, length, this.f21549c);
        lVar.mo49247c(bVar);
        while (i < length && !bVar.isDisposed()) {
            C11957n<? extends T> nVar = nVarArr[i];
            if (nVar == null) {
                bVar.mo53020c(new NullPointerException("One of the sources is null"), i);
                return;
            } else {
                nVar.mo49221a(bVar.f21553d[i]);
                i++;
            }
        }
    }
}
