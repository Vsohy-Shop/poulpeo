package p423re;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicLong;
import p307af.C10885a;
import p341fe.C11949f;
import p341fe.C11952i;
import p369je.C12620a;
import p384le.C12853d;
import p386lg.C12860b;
import p386lg.C12861c;
import p465ye.C13925g;
import p471ze.C14109d;

/* renamed from: re.t */
/* compiled from: FlowableOnBackpressureDrop */
public final class C13345t<T> extends C13287a<T, T> implements C12853d<T> {

    /* renamed from: d */
    final C12853d<? super T> f21368d = this;

    /* renamed from: re.t$a */
    /* compiled from: FlowableOnBackpressureDrop */
    static final class C13346a<T> extends AtomicLong implements C11952i<T>, C12861c {
        private static final long serialVersionUID = -6246093802440953054L;

        /* renamed from: b */
        final C12860b<? super T> f21369b;

        /* renamed from: c */
        final C12853d<? super T> f21370c;

        /* renamed from: d */
        C12861c f21371d;

        /* renamed from: e */
        boolean f21372e;

        C13346a(C12860b<? super T> bVar, C12853d<? super T> dVar) {
            this.f21369b = bVar;
            this.f21370c = dVar;
        }

        /* renamed from: b */
        public void mo50772b() {
            if (!this.f21372e) {
                this.f21372e = true;
                this.f21369b.mo50772b();
            }
        }

        public void cancel() {
            this.f21371d.cancel();
        }

        /* renamed from: d */
        public void mo50773d(T t) {
            if (!this.f21372e) {
                if (get() != 0) {
                    this.f21369b.mo50773d(t);
                    C14109d.m32754d(this, 1);
                    return;
                }
                try {
                    this.f21370c.accept(t);
                } catch (Throwable th) {
                    C12620a.m28007b(th);
                    cancel();
                    onError(th);
                }
            }
        }

        /* renamed from: e */
        public void mo49220e(C12861c cVar) {
            if (C13925g.m32189i(this.f21371d, cVar)) {
                this.f21371d = cVar;
                this.f21369b.mo49220e(this);
                cVar.mo50776h(LocationRequestCompat.PASSIVE_INTERVAL);
            }
        }

        /* renamed from: h */
        public void mo50776h(long j) {
            if (C13925g.m32188g(j)) {
                C14109d.m32751a(this, j);
            }
        }

        public void onError(Throwable th) {
            if (this.f21372e) {
                C10885a.m23270q(th);
                return;
            }
            this.f21372e = true;
            this.f21369b.onError(th);
        }
    }

    public C13345t(C11949f<T> fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo49200I(C12860b<? super T> bVar) {
        this.f21182c.mo49199H(new C13346a(bVar, this.f21368d));
    }

    public void accept(T t) {
    }
}
