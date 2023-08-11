package p308ag;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: ag.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10903i {
    /* renamed from: a */
    public static /* synthetic */ boolean m23434a(AtomicReferenceArray atomicReferenceArray, int i, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }
}
