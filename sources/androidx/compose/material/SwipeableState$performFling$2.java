package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import java.util.Map;
import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.jvm.internal.C12775o;
import p314bg.C10967g;
import p336ef.C11921v;
import p355hf.C12074d;

/* compiled from: Swipeable.kt */
final class SwipeableState$performFling$2 implements C10967g<Map<Float, ? extends T>> {
    final /* synthetic */ float $velocity;
    final /* synthetic */ SwipeableState<T> this$0;

    SwipeableState$performFling$2(SwipeableState<T> swipeableState, float f) {
        this.this$0 = swipeableState;
        this.$velocity = f;
    }

    public final Object emit(Map<Float, ? extends T> map, C12074d<? super C11921v> dVar) {
        Float access$getOffset = SwipeableKt.getOffset(map, this.this$0.getCurrentValue());
        C12775o.m28636f(access$getOffset);
        float floatValue = access$getOffset.floatValue();
        Object obj = map.get(C12735b.m28559b(SwipeableKt.computeTarget(this.this$0.getOffset().getValue().floatValue(), floatValue, map.keySet(), this.this$0.getThresholds$material_release(), this.$velocity, this.this$0.getVelocityThreshold$material_release())));
        if (obj == null || !this.this$0.getConfirmStateChange$material_release().invoke(obj).booleanValue()) {
            SwipeableState<T> swipeableState = this.this$0;
            Object access$animateInternalToOffset = swipeableState.animateInternalToOffset(floatValue, swipeableState.getAnimationSpec$material_release(), dVar);
            return access$animateInternalToOffset == C12150d.m26492c() ? access$animateInternalToOffset : C11921v.f18618a;
        }
        Object animateTo$default = SwipeableState.animateTo$default(this.this$0, obj, (AnimationSpec) null, dVar, 2, (Object) null);
        return animateTo$default == C12150d.m26492c() ? animateTo$default : C11921v.f18618a;
    }
}
