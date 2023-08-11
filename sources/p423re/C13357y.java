package p423re;

import androidx.core.location.LocationRequestCompat;
import java.util.Collection;
import java.util.concurrent.Callable;
import p341fe.C11949f;
import p341fe.C11952i;
import p369je.C12620a;
import p386lg.C12860b;
import p386lg.C12861c;
import p397ne.C13016b;
import p465ye.C13921c;
import p465ye.C13922d;
import p465ye.C13925g;

/* renamed from: re.y */
/* compiled from: FlowableToList */
public final class C13357y<T, U extends Collection<? super T>> extends C13287a<T, U> {

    /* renamed from: d */
    final Callable<U> f21404d;

    /* renamed from: re.y$a */
    /* compiled from: FlowableToList */
    static final class C13358a<T, U extends Collection<? super T>> extends C13921c<U> implements C11952i<T>, C12861c {
        private static final long serialVersionUID = -8134157938864266736L;

        /* renamed from: d */
        C12861c f21405d;

        /* JADX WARNING: type inference failed for: r2v0, types: [T, U] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C13358a(p386lg.C12860b<? super U> r1, U r2) {
            /*
                r0 = this;
                r0.<init>(r1)
                r0.f22826c = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p423re.C13357y.C13358a.<init>(lg.b, java.util.Collection):void");
        }

        /* renamed from: b */
        public void mo50772b() {
            mo53657i(this.f22826c);
        }

        public void cancel() {
            super.cancel();
            this.f21405d.cancel();
        }

        /* renamed from: d */
        public void mo50773d(T t) {
            Collection collection = (Collection) this.f22826c;
            if (collection != null) {
                collection.add(t);
            }
        }

        /* renamed from: e */
        public void mo49220e(C12861c cVar) {
            if (C13925g.m32189i(this.f21405d, cVar)) {
                this.f21405d = cVar;
                this.f22825b.mo49220e(this);
                cVar.mo50776h(LocationRequestCompat.PASSIVE_INTERVAL);
            }
        }

        public void onError(Throwable th) {
            this.f22826c = null;
            this.f22825b.onError(th);
        }
    }

    public C13357y(C11949f<T> fVar, Callable<U> callable) {
        super(fVar);
        this.f21404d = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo49200I(C12860b<? super U> bVar) {
        try {
            this.f21182c.mo49199H(new C13358a(bVar, (Collection) C13016b.m29390d(this.f21404d.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C12620a.m28007b(th);
            C13922d.m32171b(th, bVar);
        }
    }
}
