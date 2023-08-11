package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", mo50610f = "SnapFlingBehavior.kt", mo50611l = {451}, mo50612m = "animateSnap")
/* compiled from: SnapFlingBehavior.kt */
final class SnapFlingBehaviorKt$animateSnap$1 extends C12737d {
    float F$0;
    float F$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    SnapFlingBehaviorKt$animateSnap$1(C12074d<? super SnapFlingBehaviorKt$animateSnap$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.animateSnap((ScrollScope) null, 0.0f, 0.0f, (AnimationState<Float, AnimationVector1D>) null, (AnimationSpec<Float>) null, (Function1<? super Float, C11921v>) null, this);
    }
}
