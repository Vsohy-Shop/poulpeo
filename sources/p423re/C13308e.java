package p423re;

import androidx.core.location.LocationRequestCompat;
import java.util.NoSuchElementException;
import p307af.C10885a;
import p341fe.C11949f;
import p341fe.C11952i;
import p386lg.C12860b;
import p386lg.C12861c;
import p465ye.C13921c;
import p465ye.C13925g;

/* renamed from: re.e */
/* compiled from: FlowableElementAt */
public final class C13308e<T> extends C13287a<T, T> {

    /* renamed from: d */
    final long f21233d;

    /* renamed from: e */
    final T f21234e;

    /* renamed from: f */
    final boolean f21235f;

    /* renamed from: re.e$a */
    /* compiled from: FlowableElementAt */
    static final class C13309a<T> extends C13921c<T> implements C11952i<T> {
        private static final long serialVersionUID = 4066607327284737757L;

        /* renamed from: d */
        final long f21236d;

        /* renamed from: e */
        final T f21237e;

        /* renamed from: f */
        final boolean f21238f;

        /* renamed from: g */
        C12861c f21239g;

        /* renamed from: h */
        long f21240h;

        /* renamed from: i */
        boolean f21241i;

        C13309a(C12860b<? super T> bVar, long j, T t, boolean z) {
            super(bVar);
            this.f21236d = j;
            this.f21237e = t;
            this.f21238f = z;
        }

        /* renamed from: b */
        public void mo50772b() {
            if (!this.f21241i) {
                this.f21241i = true;
                T t = this.f21237e;
                if (t != null) {
                    mo53657i(t);
                } else if (this.f21238f) {
                    this.f22825b.onError(new NoSuchElementException());
                } else {
                    this.f22825b.mo50772b();
                }
            }
        }

        public void cancel() {
            super.cancel();
            this.f21239g.cancel();
        }

        /* renamed from: d */
        public void mo50773d(T t) {
            if (!this.f21241i) {
                long j = this.f21240h;
                if (j == this.f21236d) {
                    this.f21241i = true;
                    this.f21239g.cancel();
                    mo53657i(t);
                    return;
                }
                this.f21240h = j + 1;
            }
        }

        /* renamed from: e */
        public void mo49220e(C12861c cVar) {
            if (C13925g.m32189i(this.f21239g, cVar)) {
                this.f21239g = cVar;
                this.f22825b.mo49220e(this);
                cVar.mo50776h(LocationRequestCompat.PASSIVE_INTERVAL);
            }
        }

        public void onError(Throwable th) {
            if (this.f21241i) {
                C10885a.m23270q(th);
                return;
            }
            this.f21241i = true;
            this.f22825b.onError(th);
        }
    }

    public C13308e(C11949f<T> fVar, long j, T t, boolean z) {
        super(fVar);
        this.f21233d = j;
        this.f21234e = t;
        this.f21235f = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo49200I(C12860b<? super T> bVar) {
        this.f21182c.mo49199H(new C13309a(bVar, this.f21233d, this.f21234e, this.f21235f));
    }
}
