package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.functions.Function1;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.animation.core.SuspendAnimationKt", mo50610f = "SuspendAnimation.kt", mo50611l = {233, 272}, mo50612m = "animate")
/* compiled from: SuspendAnimation.kt */
final class SuspendAnimationKt$animate$4<T, V extends AnimationVector> extends C12737d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    SuspendAnimationKt$animate$4(C12074d<? super SuspendAnimationKt$animate$4> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SuspendAnimationKt.animate((AnimationState) null, (Animation) null, 0, (Function1) null, this);
    }
}
