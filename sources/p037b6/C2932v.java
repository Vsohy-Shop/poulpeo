package p037b6;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: b6.v */
final class C2932v extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f1331a;

    public C2932v(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f1331a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C2932v.class) {
            if (this == obj) {
                return true;
            }
            C2932v vVar = (C2932v) obj;
            if (this.f1331a == vVar.f1331a && get() == vVar.get()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1331a;
    }
}
