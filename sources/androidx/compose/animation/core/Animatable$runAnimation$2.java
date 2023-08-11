package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12755d0;
import kotlin.jvm.internal.C12775o;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.animation.core.Animatable$runAnimation$2", mo50610f = "Animatable.kt", mo50611l = {291}, mo50612m = "invokeSuspend")
/* compiled from: Animatable.kt */
final class Animatable$runAnimation$2 extends C12746l implements Function1<C12074d<? super AnimationResult<T, V>>, Object> {
    final /* synthetic */ Animation<T, V> $animation;
    final /* synthetic */ Function1<Animatable<T, V>, C11921v> $block;
    final /* synthetic */ T $initialVelocity;
    final /* synthetic */ long $startTime;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Animatable$runAnimation$2(Animatable<T, V> animatable, T t, Animation<T, V> animation, long j, Function1<? super Animatable<T, V>, C11921v> function1, C12074d<? super Animatable$runAnimation$2> dVar) {
        super(1, dVar);
        this.this$0 = animatable;
        this.$initialVelocity = t;
        this.$animation = animation;
        this.$startTime = j;
        this.$block = function1;
    }

    public final C12074d<C11921v> create(C12074d<?> dVar) {
        return new Animatable$runAnimation$2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, dVar);
    }

    public final Object invoke(C12074d<? super AnimationResult<T, V>> dVar) {
        return ((Animatable$runAnimation$2) create(dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        AnimationState animationState;
        C12755d0 d0Var;
        AnimationEndReason animationEndReason;
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            this.this$0.getInternalState$animation_core_release().setVelocityVector$animation_core_release((AnimationVector) this.this$0.getTypeConverter().getConvertToVector().invoke(this.$initialVelocity));
            this.this$0.setTargetValue(this.$animation.getTargetValue());
            this.this$0.setRunning(true);
            final AnimationState copy$default = AnimationStateKt.copy$default((AnimationState) this.this$0.getInternalState$animation_core_release(), (Object) null, (AnimationVector) null, 0, Long.MIN_VALUE, false, 23, (Object) null);
            final C12755d0 d0Var2 = new C12755d0();
            Animation<T, V> animation = this.$animation;
            long j = this.$startTime;
            final Animatable<T, V> animatable = this.this$0;
            final Function1<Animatable<T, V>, C11921v> function1 = this.$block;
            C03321 r6 = new Function1<AnimationScope<T, V>, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AnimationScope) obj);
                    return C11921v.f18618a;
                }

                public final void invoke(AnimationScope<T, V> animationScope) {
                    C12775o.m28639i(animationScope, "$this$animate");
                    SuspendAnimationKt.updateState(animationScope, animatable.getInternalState$animation_core_release());
                    Object access$clampToBounds = animatable.clampToBounds(animationScope.getValue());
                    if (!C12775o.m28634d(access$clampToBounds, animationScope.getValue())) {
                        animatable.getInternalState$animation_core_release().setValue$animation_core_release(access$clampToBounds);
                        copy$default.setValue$animation_core_release(access$clampToBounds);
                        Function1<Animatable<T, V>, C11921v> function1 = function1;
                        if (function1 != null) {
                            function1.invoke(animatable);
                        }
                        animationScope.cancelAnimation();
                        d0Var2.f20407b = true;
                        return;
                    }
                    Function1<Animatable<T, V>, C11921v> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(animatable);
                    }
                }
            };
            this.L$0 = copy$default;
            this.L$1 = d0Var2;
            this.label = 1;
            if (SuspendAnimationKt.animate(copy$default, animation, j, r6, this) == c) {
                return c;
            }
            animationState = copy$default;
            d0Var = d0Var2;
        } else if (i == 1) {
            d0Var = (C12755d0) this.L$1;
            animationState = (AnimationState) this.L$0;
            try {
                C11910n.m25701b(obj);
            } catch (CancellationException e) {
                this.this$0.endAnimation();
                throw e;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (d0Var.f20407b) {
            animationEndReason = AnimationEndReason.BoundReached;
        } else {
            animationEndReason = AnimationEndReason.Finished;
        }
        this.this$0.endAnimation();
        return new AnimationResult(animationState, animationEndReason);
    }
}
