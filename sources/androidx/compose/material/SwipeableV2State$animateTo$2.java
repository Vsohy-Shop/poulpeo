package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DragScope;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12757e0;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.material.SwipeableV2State$animateTo$2", mo50610f = "SwipeableV2.kt", mo50611l = {338}, mo50612m = "invokeSuspend")
/* compiled from: SwipeableV2.kt */
final class SwipeableV2State$animateTo$2 extends C12746l implements C13088o<DragScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ Float $targetOffset;
    final /* synthetic */ T $targetValue;
    final /* synthetic */ float $velocity;
    int label;
    final /* synthetic */ SwipeableV2State<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableV2State$animateTo$2(SwipeableV2State<T> swipeableV2State, T t, Float f, float f2, C12074d<? super SwipeableV2State$animateTo$2> dVar) {
        super(2, dVar);
        this.this$0 = swipeableV2State;
        this.$targetValue = t;
        this.$targetOffset = f;
        this.$velocity = f2;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new SwipeableV2State$animateTo$2(this.this$0, this.$targetValue, this.$targetOffset, this.$velocity, dVar);
    }

    public final Object invoke(DragScope dragScope, C12074d<? super C11921v> dVar) {
        return ((SwipeableV2State$animateTo$2) create(dragScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        float f;
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            this.this$0.setAnimationTarget(this.$targetValue);
            final C12757e0 e0Var = new C12757e0();
            Float offset = this.this$0.getOffset();
            if (offset != null) {
                f = offset.floatValue();
            } else {
                f = 0.0f;
            }
            e0Var.f20408b = f;
            float floatValue = this.$targetOffset.floatValue();
            float f2 = this.$velocity;
            AnimationSpec<Float> animationSpec$material_release = this.this$0.getAnimationSpec$material_release();
            final SwipeableV2State<T> swipeableV2State = this.this$0;
            C08061 r8 = new C13088o<Float, Float, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                    return C11921v.f18618a;
                }

                public final void invoke(float f, float f2) {
                    swipeableV2State.setOffset(Float.valueOf(f));
                    e0Var.f20408b = f;
                    swipeableV2State.setLastVelocity(f2);
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animate(f, floatValue, f2, animationSpec$material_release, r8, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.setLastVelocity(0.0f);
        return C11921v.f18618a;
    }
}
