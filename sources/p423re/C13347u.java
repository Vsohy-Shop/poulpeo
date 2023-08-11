package p423re;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicLong;
import p307af.C10885a;
import p341fe.C11949f;
import p341fe.C11952i;
import p364io.reactivex.exceptions.MissingBackpressureException;
import p386lg.C12860b;
import p386lg.C12861c;
import p465ye.C13925g;
import p471ze.C14109d;

/* renamed from: re.u */
/* compiled from: FlowableOnBackpressureError */
public final class C13347u<T> extends C13287a<T, T> {

    /* renamed from: re.u$a */
    /* compiled from: FlowableOnBackpressureError */
    static final class C13348a<T> extends AtomicLong implements C11952i<T>, C12861c {
        private static final long serialVersionUID = -3176480756392482682L;

        /* renamed from: b */
        final C12860b<? super T> f21373b;

        /* renamed from: c */
        C12861c f21374c;

        /* renamed from: d */
        boolean f21375d;

        C13348a(C12860b<? super T> bVar) {
            this.f21373b = bVar;
        }

        /* renamed from: b */
        public void mo50772b() {
            if (!this.f21375d) {
                this.f21375d = true;
                this.f21373b.mo50772b();
            }
        }

        public void cancel() {
            this.f21374c.cancel();
        }

        /* renamed from: d */
        public void mo50773d(T t) {
            if (!this.f21375d) {
                if (get() != 0) {
                    this.f21373b.mo50773d(t);
                    C14109d.m32754d(this, 1);
                    return;
                }
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }

        /* renamed from: e */
        public void mo49220e(C12861c cVar) {
            if (C13925g.m32189i(this.f21374c, cVar)) {
                this.f21374c = cVar;
                this.f21373b.mo49220e(this);
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
            if (this.f21375d) {
                C10885a.m23270q(th);
                return;
            }
            this.f21375d = true;
            this.f21373b.onError(th);
        }
    }

    public C13347u(C11949f<T> fVar) {
        super(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo49200I(C12860b<? super T> bVar) {
        this.f21182c.mo49199H(new C13348a(bVar));
    }
}
