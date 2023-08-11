package androidx.compose.runtime;

import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import p404of.C13074a;

/* compiled from: ValueHolders.kt */
public final class LazyValueHolder<T> implements State<T> {
    private final Lazy current$delegate;

    public LazyValueHolder(C13074a<? extends T> aVar) {
        C12775o.m28639i(aVar, "valueProducer");
        this.current$delegate = C11901h.m25690b(aVar);
    }

    private final T getCurrent() {
        return this.current$delegate.getValue();
    }

    public T getValue() {
        return getCurrent();
    }
}
