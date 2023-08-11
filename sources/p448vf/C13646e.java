package p448vf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* renamed from: vf.e */
/* compiled from: Sequences.kt */
public final class C13646e<T> implements C13650g<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C13650g<T> f21983a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f21984b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Function1<T, Boolean> f21985c;

    /* renamed from: vf.e$a */
    /* compiled from: Sequences.kt */
    public static final class C13647a implements Iterator<T>, C13212a {

        /* renamed from: b */
        private final Iterator<T> f21986b;

        /* renamed from: c */
        private int f21987c = -1;

        /* renamed from: d */
        private T f21988d;

        /* renamed from: e */
        final /* synthetic */ C13646e<T> f21989e;

        C13647a(C13646e<T> eVar) {
            this.f21989e = eVar;
            this.f21986b = eVar.f21983a.iterator();
        }

        /* renamed from: a */
        private final void m31235a() {
            while (this.f21986b.hasNext()) {
                T next = this.f21986b.next();
                if (((Boolean) this.f21989e.f21985c.invoke(next)).booleanValue() == this.f21989e.f21984b) {
                    this.f21988d = next;
                    this.f21987c = 1;
                    return;
                }
            }
            this.f21987c = 0;
        }

        public boolean hasNext() {
            if (this.f21987c == -1) {
                m31235a();
            }
            if (this.f21987c == 1) {
                return true;
            }
            return false;
        }

        public T next() {
            if (this.f21987c == -1) {
                m31235a();
            }
            if (this.f21987c != 0) {
                T t = this.f21988d;
                this.f21988d = null;
                this.f21987c = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C13646e(C13650g<? extends T> gVar, boolean z, Function1<? super T, Boolean> function1) {
        C12775o.m28639i(gVar, "sequence");
        C12775o.m28639i(function1, "predicate");
        this.f21983a = gVar;
        this.f21984b = z;
        this.f21985c = function1;
    }

    public Iterator<T> iterator() {
        return new C13647a(this);
    }
}
