package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p002ui.geometry.Offset;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12762g0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2", mo50610f = "TransformableState.kt", mo50611l = {182}, mo50612m = "invokeSuspend")
/* compiled from: TransformableState.kt */
final class TransformableStateKt$animatePanBy$2 extends C12746l implements C13088o<TransformScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ AnimationSpec<Offset> $animationSpec;
    final /* synthetic */ long $offset;
    final /* synthetic */ C12762g0 $previous;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransformableStateKt$animatePanBy$2(C12762g0 g0Var, long j, AnimationSpec<Offset> animationSpec, C12074d<? super TransformableStateKt$animatePanBy$2> dVar) {
        super(2, dVar);
        this.$previous = g0Var;
        this.$offset = j;
        this.$animationSpec = animationSpec;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        TransformableStateKt$animatePanBy$2 transformableStateKt$animatePanBy$2 = new TransformableStateKt$animatePanBy$2(this.$previous, this.$offset, this.$animationSpec, dVar);
        transformableStateKt$animatePanBy$2.L$0 = obj;
        return transformableStateKt$animatePanBy$2;
    }

    public final Object invoke(TransformScope transformScope, C12074d<? super C11921v> dVar) {
        return ((TransformableStateKt$animatePanBy$2) create(transformScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState animationState = new AnimationState(VectorConvertersKt.getVectorConverter(Offset.Companion), Offset.m35411boximpl(this.$previous.f20418b), (AnimationVector) null, 0, 0, false, 60, (DefaultConstructorMarker) null);
            Offset r4 = Offset.m35411boximpl(this.$offset);
            AnimationSpec<Offset> animationSpec = this.$animationSpec;
            final C12762g0 g0Var = this.$previous;
            C04381 r7 = new Function1<AnimationScope<Offset, AnimationVector2D>, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AnimationScope<Offset, AnimationVector2D>) (AnimationScope) obj);
                    return C11921v.f18618a;
                }

                public final void invoke(AnimationScope<Offset, AnimationVector2D> animationScope) {
                    C12775o.m28639i(animationScope, "$this$animateTo");
                    TransformScope.m33151transformByd4ec7I$default(transformScope, 0.0f, Offset.m35426minusMKHz9U(animationScope.getValue().m35432unboximpl(), g0Var.f20418b), 0.0f, 5, (Object) null);
                    g0Var.f20418b = animationScope.getValue().m35432unboximpl();
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(animationState, r4, animationSpec, false, r7, this, 4, (Object) null) == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11921v.f18618a;
    }
}
