package androidx.lifecycle;

import kotlin.jvm.internal.C12775o;

/* compiled from: LifecycleOwner.kt */
public final class LifecycleOwnerKt {
    public static final LifecycleCoroutineScope getLifecycleScope(LifecycleOwner lifecycleOwner) {
        C12775o.m28639i(lifecycleOwner, "<this>");
        return LifecycleKt.getCoroutineScope(lifecycleOwner.getLifecycle());
    }
}
