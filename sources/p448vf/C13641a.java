package p448vf;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C12775o;

/* renamed from: vf.a */
/* compiled from: SequencesJVM.kt */
public final class C13641a<T> implements C13650g<T> {

    /* renamed from: a */
    private final AtomicReference<C13650g<T>> f21977a;

    public C13641a(C13650g<? extends T> gVar) {
        C12775o.m28639i(gVar, "sequence");
        this.f21977a = new AtomicReference<>(gVar);
    }

    public Iterator<T> iterator() {
        C13650g andSet = this.f21977a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
