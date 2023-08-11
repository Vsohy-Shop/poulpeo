package androidx.compose.animation;

import androidx.compose.animation.SizeAnimationModifier;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.p002ui.unit.IntSize;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.animation.SizeAnimationModifier$animateTo$data$1$1", mo50610f = "AnimationModifier.kt", mo50611l = {121}, mo50612m = "invokeSuspend")
/* compiled from: AnimationModifier.kt */
final class SizeAnimationModifier$animateTo$data$1$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ long $targetSize;
    final /* synthetic */ SizeAnimationModifier.AnimData $this_apply;
    int label;
    final /* synthetic */ SizeAnimationModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SizeAnimationModifier$animateTo$data$1$1(SizeAnimationModifier.AnimData animData, long j, SizeAnimationModifier sizeAnimationModifier, C12074d<? super SizeAnimationModifier$animateTo$data$1$1> dVar) {
        super(2, dVar);
        this.$this_apply = animData;
        this.$targetSize = j;
        this.this$0 = sizeAnimationModifier;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new SizeAnimationModifier$animateTo$data$1$1(this.$this_apply, this.$targetSize, this.this$0, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        C13088o<IntSize, IntSize, C11921v> listener;
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            Animatable<IntSize, AnimationVector2D> anim = this.$this_apply.getAnim();
            IntSize r4 = IntSize.m38620boximpl(this.$targetSize);
            AnimationSpec<IntSize> animSpec = this.this$0.getAnimSpec();
            this.label = 1;
            obj = Animatable.animateTo$default(anim, r4, animSpec, (Object) null, (Function1) null, this, 12, (Object) null);
            if (obj == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AnimationResult animationResult = (AnimationResult) obj;
        if (animationResult.getEndReason() == AnimationEndReason.Finished && (listener = this.this$0.getListener()) != null) {
            listener.invoke(IntSize.m38620boximpl(this.$this_apply.m32878getStartSizeYbymL2g()), animationResult.getEndState().getValue());
        }
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((SizeAnimationModifier$animateTo$data$1$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
