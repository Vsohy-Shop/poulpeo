package kotlin.coroutines.jvm.internal;

import p355hf.C12074d;
import p355hf.C12079g;
import p355hf.C12085h;

/* renamed from: kotlin.coroutines.jvm.internal.j */
/* compiled from: ContinuationImpl.kt */
public abstract class C12744j extends C12734a {
    public C12744j(C12074d<Object> dVar) {
        super(dVar);
        boolean z;
        if (dVar != null) {
            if (dVar.getContext() == C12085h.f18916b) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public C12079g getContext() {
        return C12085h.f18916b;
    }
}
