package p448vf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p404of.C13074a;
import p412pf.C13212a;

/* renamed from: vf.f */
/* compiled from: Sequences.kt */
final class C13648f<T> implements C13650g<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C13074a<T> f21990a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Function1<T, T> f21991b;

    /* renamed from: vf.f$a */
    /* compiled from: Sequences.kt */
    public static final class C13649a implements Iterator<T>, C13212a {

        /* renamed from: b */
        private T f21992b;

        /* renamed from: c */
        private int f21993c = -2;

        /* renamed from: d */
        final /* synthetic */ C13648f<T> f21994d;

        C13649a(C13648f<T> fVar) {
            this.f21994d = fVar;
        }

        /* renamed from: a */
        private final void m31238a() {
            T t;
            int i;
            if (this.f21993c == -2) {
                t = this.f21994d.f21990a.invoke();
            } else {
                Function1 d = this.f21994d.f21991b;
                T t2 = this.f21992b;
                C12775o.m28636f(t2);
                t = d.invoke(t2);
            }
            this.f21992b = t;
            if (t == null) {
                i = 0;
            } else {
                i = 1;
            }
            this.f21993c = i;
        }

        public boolean hasNext() {
            if (this.f21993c < 0) {
                m31238a();
            }
            if (this.f21993c == 1) {
                return true;
            }
            return false;
        }

        public T next() {
            if (this.f21993c < 0) {
                m31238a();
            }
            if (this.f21993c != 0) {
                T t = this.f21992b;
                C12775o.m28637g(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f21993c = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C13648f(C13074a<? extends T> aVar, Function1<? super T, ? extends T> function1) {
        C12775o.m28639i(aVar, "getInitialValue");
        C12775o.m28639i(function1, "getNextValue");
        this.f21990a = aVar;
        this.f21991b = function1;
    }

    public Iterator<T> iterator() {
        return new C13649a(this);
    }
}
