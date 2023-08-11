package androidx.lifecycle;

import androidx.compose.animation.core.C0344a;
import kotlin.jvm.internal.C12775o;
import p466yf.C13933b1;
import p466yf.C14039u2;
import p466yf.C14054y1;

/* compiled from: Lifecycle.kt */
public final class LifecycleKt {
    public static final LifecycleCoroutineScope getCoroutineScope(Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        C12775o.m28639i(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, C14039u2.m32561b((C14054y1) null, 1, (Object) null).plus(C13933b1.m32212c().mo49059t0()));
        } while (!C0344a.m496a(lifecycle.getInternalScopeRef(), (Object) null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.register();
        return lifecycleCoroutineScopeImpl;
    }
}
