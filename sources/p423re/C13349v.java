package p423re;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p341fe.C11949f;
import p341fe.C11952i;
import p386lg.C12860b;
import p386lg.C12861c;
import p465ye.C13925g;
import p471ze.C14109d;

/* renamed from: re.v */
/* compiled from: FlowableOnBackpressureLatest */
public final class C13349v<T> extends C13287a<T, T> {

    /* renamed from: re.v$a */
    /* compiled from: FlowableOnBackpressureLatest */
    static final class C13350a<T> extends AtomicInteger implements C11952i<T>, C12861c {
        private static final long serialVersionUID = 163080509307634843L;

        /* renamed from: b */
        final C12860b<? super T> f21376b;

        /* renamed from: c */
        C12861c f21377c;

        /* renamed from: d */
        volatile boolean f21378d;

        /* renamed from: e */
        Throwable f21379e;

        /* renamed from: f */
        volatile boolean f21380f;

        /* renamed from: g */
        final AtomicLong f21381g = new AtomicLong();

        /* renamed from: h */
        final AtomicReference<T> f21382h = new AtomicReference<>();

        C13350a(C12860b<? super T> bVar) {
            this.f21376b = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo52976a(boolean z, boolean z2, C12860b<?> bVar, AtomicReference<T> atomicReference) {
            if (this.f21380f) {
                atomicReference.lazySet((Object) null);
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.f21379e;
                if (th != null) {
                    atomicReference.lazySet((Object) null);
                    bVar.onError(th);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    bVar.mo50772b();
                    return true;
                }
            }
        }

        /* renamed from: b */
        public void mo50772b() {
            this.f21378d = true;
            mo52977c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo52977c() {
            boolean z;
            boolean z2;
            if (getAndIncrement() == 0) {
                C12860b<? super T> bVar = this.f21376b;
                AtomicLong atomicLong = this.f21381g;
                AtomicReference<T> atomicReference = this.f21382h;
                int i = 1;
                do {
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z3 = this.f21378d;
                        T andSet = atomicReference.getAndSet((Object) null);
                        if (andSet == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!mo52976a(z3, z2, bVar, atomicReference)) {
                            if (z2) {
                                break;
                            }
                            bVar.mo50773d(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        boolean z4 = this.f21378d;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (mo52976a(z4, z, bVar, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        C14109d.m32754d(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        public void cancel() {
            if (!this.f21380f) {
                this.f21380f = true;
                this.f21377c.cancel();
                if (getAndIncrement() == 0) {
                    this.f21382h.lazySet((Object) null);
                }
            }
        }

        /* renamed from: d */
        public void mo50773d(T t) {
            this.f21382h.lazySet(t);
            mo52977c();
        }

        /* renamed from: e */
        public void mo49220e(C12861c cVar) {
            if (C13925g.m32189i(this.f21377c, cVar)) {
                this.f21377c = cVar;
                this.f21376b.mo49220e(this);
                cVar.mo50776h(LocationRequestCompat.PASSIVE_INTERVAL);
            }
        }

        /* renamed from: h */
        public void mo50776h(long j) {
            if (C13925g.m32188g(j)) {
                C14109d.m32751a(this.f21381g, j);
                mo52977c();
            }
        }

        public void onError(Throwable th) {
            this.f21379e = th;
            this.f21378d = true;
            mo52977c();
        }
    }

    public C13349v(C11949f<T> fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo49200I(C12860b<? super T> bVar) {
        this.f21182c.mo49199H(new C13350a(bVar));
    }
}
