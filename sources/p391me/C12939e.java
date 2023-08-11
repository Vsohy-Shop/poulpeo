package p391me;

import java.util.concurrent.atomic.AtomicReference;
import p361ie.C12141b;

/* renamed from: me.e */
/* compiled from: SequentialDisposable */
public final class C12939e extends AtomicReference<C12141b> implements C12141b {
    private static final long serialVersionUID = -754898800686245608L;

    /* renamed from: a */
    public boolean mo50867a(C12141b bVar) {
        return C12936b.m29223c(this, bVar);
    }

    /* renamed from: b */
    public boolean mo50868b(C12141b bVar) {
        return C12936b.m29225e(this, bVar);
    }

    public void dispose() {
        C12936b.m29221a(this);
    }

    public boolean isDisposed() {
        return C12936b.m29222b((C12141b) get());
    }
}
