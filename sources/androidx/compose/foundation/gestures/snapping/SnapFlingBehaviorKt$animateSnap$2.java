package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12757e0;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: SnapFlingBehavior.kt */
final class SnapFlingBehaviorKt$animateSnap$2 extends C12777p implements Function1<AnimationScope<Float, AnimationVector1D>, C11921v> {
    final /* synthetic */ float $cancelOffset;
    final /* synthetic */ C12757e0 $consumedUpToNow;
    final /* synthetic */ Function1<Float, C11921v> $onAnimationStep;
    final /* synthetic */ ScrollScope $this_animateSnap;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapFlingBehaviorKt$animateSnap$2(float f, C12757e0 e0Var, ScrollScope scrollScope, Function1<? super Float, C11921v> function1) {
        super(1);
        this.$cancelOffset = f;
        this.$consumedUpToNow = e0Var;
        this.$this_animateSnap = scrollScope;
        this.$onAnimationStep = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AnimationScope<Float, AnimationVector1D>) (AnimationScope) obj);
        return C11921v.f18618a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0046, code lost:
        if ((r0 == r6.getValue().floatValue()) == false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "$this$animateTo"
            kotlin.jvm.internal.C12775o.m28639i(r6, r0)
            java.lang.Object r0 = r6.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r1 = r5.$cancelOffset
            float r0 = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.coerceToTarget(r0, r1)
            kotlin.jvm.internal.e0 r1 = r5.$consumedUpToNow
            float r1 = r1.f20408b
            float r1 = r0 - r1
            androidx.compose.foundation.gestures.ScrollScope r2 = r5.$this_animateSnap
            float r2 = r2.scrollBy(r1)
            kotlin.jvm.functions.Function1<java.lang.Float, ef.v> r3 = r5.$onAnimationStep
            java.lang.Float r4 = java.lang.Float.valueOf(r2)
            r3.invoke(r4)
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            r3 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0048
            java.lang.Object r1 = r6.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0045
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 != 0) goto L_0x004b
        L_0x0048:
            r6.cancelAnimation()
        L_0x004b:
            kotlin.jvm.internal.e0 r6 = r5.$consumedUpToNow
            float r0 = r6.f20408b
            float r0 = r0 + r2
            r6.f20408b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$2.invoke(androidx.compose.animation.core.AnimationScope):void");
    }
}
