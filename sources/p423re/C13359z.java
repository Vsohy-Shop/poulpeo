package p423re;

import androidx.core.location.LocationRequestCompat;
import java.util.Collection;
import java.util.concurrent.Callable;
import p307af.C10885a;
import p341fe.C11949f;
import p341fe.C11952i;
import p341fe.C11965s;
import p341fe.C11966t;
import p361ie.C12141b;
import p369je.C12620a;
import p386lg.C12861c;
import p391me.C12937c;
import p397ne.C13016b;
import p403oe.C13065b;
import p465ye.C13925g;
import p471ze.C14107b;

/* renamed from: re.z */
/* compiled from: FlowableToListSingle */
public final class C13359z<T, U extends Collection<? super T>> extends C11965s<U> implements C13065b<U> {

    /* renamed from: b */
    final C11949f<T> f21406b;

    /* renamed from: c */
    final Callable<U> f21407c;

    /* renamed from: re.z$a */
    /* compiled from: FlowableToListSingle */
    static final class C13360a<T, U extends Collection<? super T>> implements C11952i<T>, C12141b {

        /* renamed from: b */
        final C11966t<? super U> f21408b;

        /* renamed from: c */
        C12861c f21409c;

        /* renamed from: d */
        U f21410d;

        C13360a(C11966t<? super U> tVar, U u) {
            this.f21408b = tVar;
            this.f21410d = u;
        }

        /* renamed from: b */
        public void mo50772b() {
            this.f21409c = C13925g.CANCELLED;
            this.f21408b.mo49277a(this.f21410d);
        }

        /* renamed from: d */
        public void mo50773d(T t) {
            this.f21410d.add(t);
        }

        public void dispose() {
            this.f21409c.cancel();
            this.f21409c = C13925g.CANCELLED;
        }

        /* renamed from: e */
        public void mo49220e(C12861c cVar) {
            if (C13925g.m32189i(this.f21409c, cVar)) {
                this.f21409c = cVar;
                this.f21408b.mo49278c(this);
                cVar.mo50776h(LocationRequestCompat.PASSIVE_INTERVAL);
            }
        }

        public boolean isDisposed() {
            if (this.f21409c == C13925g.CANCELLED) {
                return true;
            }
            return false;
        }

        public void onError(Throwable th) {
            this.f21410d = null;
            this.f21409c = C13925g.CANCELLED;
            this.f21408b.onError(th);
        }
    }

    public C13359z(C11949f<T> fVar) {
        this(fVar, C14107b.m32746b());
    }

    /* renamed from: d */
    public C11949f<U> mo50966d() {
        return C10885a.m23264k(new C13357y(this.f21406b, this.f21407c));
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo49275k(C11966t<? super U> tVar) {
        try {
            this.f21406b.mo49199H(new C13360a(tVar, (Collection) C13016b.m29390d(this.f21407c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C12620a.m28007b(th);
            C12937c.m29234h(th, tVar);
        }
    }

    public C13359z(C11949f<T> fVar, Callable<U> callable) {
        this.f21406b = fVar;
        this.f21407c = callable;
    }
}
