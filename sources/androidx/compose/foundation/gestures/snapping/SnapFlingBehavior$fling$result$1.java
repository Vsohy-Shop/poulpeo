package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", mo50610f = "SnapFlingBehavior.kt", mo50611l = {134, 136}, mo50612m = "invokeSuspend")
/* compiled from: SnapFlingBehavior.kt */
final class SnapFlingBehavior$fling$result$1 extends C12746l implements C13088o<C13995l0, C12074d<? super AnimationResult<Float, AnimationVector1D>>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ Function1<Float, C11921v> $onRemainingScrollOffsetUpdate;
    final /* synthetic */ ScrollScope $this_fling;
    int label;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapFlingBehavior$fling$result$1(float f, SnapFlingBehavior snapFlingBehavior, ScrollScope scrollScope, Function1<? super Float, C11921v> function1, C12074d<? super SnapFlingBehavior$fling$result$1> dVar) {
        super(2, dVar);
        this.$initialVelocity = f;
        this.this$0 = snapFlingBehavior;
        this.$this_fling = scrollScope;
        this.$onRemainingScrollOffsetUpdate = function1;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new SnapFlingBehavior$fling$result$1(this.$initialVelocity, this.this$0, this.$this_fling, this.$onRemainingScrollOffsetUpdate, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            if (Math.abs(this.$initialVelocity) <= Math.abs(this.this$0.velocityThreshold)) {
                SnapFlingBehavior snapFlingBehavior = this.this$0;
                ScrollScope scrollScope = this.$this_fling;
                float f = this.$initialVelocity;
                Function1<Float, C11921v> function1 = this.$onRemainingScrollOffsetUpdate;
                this.label = 1;
                obj = snapFlingBehavior.shortSnap(scrollScope, f, function1, this);
                if (obj == c) {
                    return c;
                }
            } else {
                SnapFlingBehavior snapFlingBehavior2 = this.this$0;
                ScrollScope scrollScope2 = this.$this_fling;
                float f2 = this.$initialVelocity;
                Function1<Float, C11921v> function12 = this.$onRemainingScrollOffsetUpdate;
                this.label = 2;
                obj = snapFlingBehavior2.longSnap(scrollScope2, f2, function12, this);
                if (obj == c) {
                    return c;
                }
                return (AnimationResult) obj;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else if (i == 2) {
            C11910n.m25701b(obj);
            return (AnimationResult) obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return (AnimationResult) obj;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super AnimationResult<Float, AnimationVector1D>> dVar) {
        return ((SnapFlingBehavior$fling$result$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
