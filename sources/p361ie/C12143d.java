package p361ie;

import java.util.concurrent.atomic.AtomicReference;
import p397ne.C13016b;

/* renamed from: ie.d */
/* compiled from: ReferenceDisposable */
abstract class C12143d<T> extends AtomicReference<T> implements C12141b {
    private static final long serialVersionUID = 6537757548749041217L;

    C12143d(T t) {
        super(C13016b.m29390d(t, "value is null"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo49585a(T t);

    public final void dispose() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            mo49585a(andSet);
        }
    }

    public final boolean isDisposed() {
        if (get() == null) {
            return true;
        }
        return false;
    }
}
