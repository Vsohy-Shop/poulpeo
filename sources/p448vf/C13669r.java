package p448vf;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* renamed from: vf.r */
/* compiled from: Sequences.kt */
public final class C13669r<T, R> implements C13650g<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C13650g<T> f22015a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Function1<T, R> f22016b;

    /* renamed from: vf.r$a */
    /* compiled from: Sequences.kt */
    public static final class C13670a implements Iterator<R>, C13212a {

        /* renamed from: b */
        private final Iterator<T> f22017b;

        /* renamed from: c */
        final /* synthetic */ C13669r<T, R> f22018c;

        C13670a(C13669r<T, R> rVar) {
            this.f22018c = rVar;
            this.f22017b = rVar.f22015a.iterator();
        }

        public boolean hasNext() {
            return this.f22017b.hasNext();
        }

        public R next() {
            return this.f22018c.f22016b.invoke(this.f22017b.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C13669r(C13650g<? extends T> gVar, Function1<? super T, ? extends R> function1) {
        C12775o.m28639i(gVar, "sequence");
        C12775o.m28639i(function1, "transformer");
        this.f22015a = gVar;
        this.f22016b = function1;
    }

    public Iterator<R> iterator() {
        return new C13670a(this);
    }
}
