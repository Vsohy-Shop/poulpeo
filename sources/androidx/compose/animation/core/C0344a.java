package androidx.compose.animation.core;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.compose.animation.core.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0344a {
    /* renamed from: a */
    public static /* synthetic */ boolean m496a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
