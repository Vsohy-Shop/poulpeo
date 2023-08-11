package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.DragScope;
import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12757e0;
import kotlin.jvm.internal.C12775o;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", mo50610f = "Swipeable.kt", mo50611l = {223}, mo50612m = "invokeSuspend")
/* compiled from: Swipeable.kt */
final class SwipeableState$animateInternalToOffset$2 extends C12746l implements C13088o<DragScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ AnimationSpec<Float> $spec;
    final /* synthetic */ float $target;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableState$animateInternalToOffset$2(SwipeableState<T> swipeableState, float f, AnimationSpec<Float> animationSpec, C12074d<? super SwipeableState$animateInternalToOffset$2> dVar) {
        super(2, dVar);
        this.this$0 = swipeableState;
        this.$target = f;
        this.$spec = animationSpec;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        SwipeableState$animateInternalToOffset$2 swipeableState$animateInternalToOffset$2 = new SwipeableState$animateInternalToOffset$2(this.this$0, this.$target, this.$spec, dVar);
        swipeableState$animateInternalToOffset$2.L$0 = obj;
        return swipeableState$animateInternalToOffset$2;
    }

    public final Object invoke(DragScope dragScope, C12074d<? super C11921v> dVar) {
        return ((SwipeableState$animateInternalToOffset$2) create(dragScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final DragScope dragScope = (DragScope) this.L$0;
            final C12757e0 e0Var = new C12757e0();
            e0Var.f20408b = ((Number) this.this$0.absoluteOffset.getValue()).floatValue();
            this.this$0.animationTarget.setValue(C12735b.m28559b(this.$target));
            this.this$0.setAnimationRunning(true);
            Animatable Animatable$default = AnimatableKt.Animatable$default(e0Var.f20408b, 0.0f, 2, (Object) null);
            Float b = C12735b.m28559b(this.$target);
            AnimationSpec<Float> animationSpec = this.$spec;
            C08031 r8 = new Function1<Animatable<Float, AnimationVector1D>, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Animatable<Float, AnimationVector1D>) (Animatable) obj);
                    return C11921v.f18618a;
                }

                public final void invoke(Animatable<Float, AnimationVector1D> animatable) {
                    C12775o.m28639i(animatable, "$this$animateTo");
                    dragScope.dragBy(animatable.getValue().floatValue() - e0Var.f20408b);
                    e0Var.f20408b = animatable.getValue().floatValue();
                }
            };
            this.label = 1;
            if (Animatable.animateTo$default(Animatable$default, b, animationSpec, (Object) null, r8, this, 4, (Object) null) == c) {
                return c;
            }
        } else if (i == 1) {
            try {
                C11910n.m25701b(obj);
            } catch (Throwable th) {
                this.this$0.animationTarget.setValue(null);
                this.this$0.setAnimationRunning(false);
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.animationTarget.setValue(null);
        this.this$0.setAnimationRunning(false);
        return C11921v.f18618a;
    }
}
