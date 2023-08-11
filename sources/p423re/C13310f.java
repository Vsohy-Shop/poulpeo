package p423re;

import androidx.core.location.LocationRequestCompat;
import p307af.C10885a;
import p341fe.C11949f;
import p341fe.C11952i;
import p341fe.C11953j;
import p341fe.C11955l;
import p361ie.C12141b;
import p386lg.C12861c;
import p403oe.C13065b;
import p465ye.C13925g;

/* renamed from: re.f */
/* compiled from: FlowableElementAtMaybe */
public final class C13310f<T> extends C11953j<T> implements C13065b<T> {

    /* renamed from: b */
    final C11949f<T> f21242b;

    /* renamed from: c */
    final long f21243c;

    /* renamed from: re.f$a */
    /* compiled from: FlowableElementAtMaybe */
    static final class C13311a<T> implements C11952i<T>, C12141b {

        /* renamed from: b */
        final C11955l<? super T> f21244b;

        /* renamed from: c */
        final long f21245c;

        /* renamed from: d */
        C12861c f21246d;

        /* renamed from: e */
        long f21247e;

        /* renamed from: f */
        boolean f21248f;

        C13311a(C11955l<? super T> lVar, long j) {
            this.f21244b = lVar;
            this.f21245c = j;
        }

        /* renamed from: b */
        public void mo50772b() {
            this.f21246d = C13925g.CANCELLED;
            if (!this.f21248f) {
                this.f21248f = true;
                this.f21244b.mo49246b();
            }
        }

        /* renamed from: d */
        public void mo50773d(T t) {
            if (!this.f21248f) {
                long j = this.f21247e;
                if (j == this.f21245c) {
                    this.f21248f = true;
                    this.f21246d.cancel();
                    this.f21246d = C13925g.CANCELLED;
                    this.f21244b.mo49245a(t);
                    return;
                }
                this.f21247e = j + 1;
            }
        }

        public void dispose() {
            this.f21246d.cancel();
            this.f21246d = C13925g.CANCELLED;
        }

        /* renamed from: e */
        public void mo49220e(C12861c cVar) {
            if (C13925g.m32189i(this.f21246d, cVar)) {
                this.f21246d = cVar;
                this.f21244b.mo49247c(this);
                cVar.mo50776h(LocationRequestCompat.PASSIVE_INTERVAL);
            }
        }

        public boolean isDisposed() {
            if (this.f21246d == C13925g.CANCELLED) {
                return true;
            }
            return false;
        }

        public void onError(Throwable th) {
            if (this.f21248f) {
                C10885a.m23270q(th);
                return;
            }
            this.f21248f = true;
            this.f21246d = C13925g.CANCELLED;
            this.f21244b.onError(th);
        }
    }

    public C13310f(C11949f<T> fVar, long j) {
        this.f21242b = fVar;
        this.f21243c = j;
    }

    /* renamed from: d */
    public C11949f<T> mo50966d() {
        return C10885a.m23264k(new C13308e(this.f21242b, this.f21243c, null, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo49236u(C11955l<? super T> lVar) {
        this.f21242b.mo49199H(new C13311a(lVar, this.f21243c));
    }
}
