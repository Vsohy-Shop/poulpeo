package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.p002ui.unit.Density;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", mo50610f = "SnapFlingBehavior.kt", mo50611l = {311}, mo50612m = "approach")
/* compiled from: SnapFlingBehavior.kt */
final class SnapFlingBehaviorKt$approach$1 extends C12737d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    SnapFlingBehaviorKt$approach$1(C12074d<? super SnapFlingBehaviorKt$approach$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.approach((ScrollScope) null, 0.0f, 0.0f, (ApproachAnimation<Float, AnimationVector1D>) null, (SnapLayoutInfoProvider) null, (Density) null, (Function1<? super Float, C11921v>) null, this);
    }
}
