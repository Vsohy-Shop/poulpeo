package androidx.compose.material;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: SwipeableV2.kt */
final class SwipeableV2State$targetValue$2 extends C12777p implements C13074a<T> {
    final /* synthetic */ SwipeableV2State<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableV2State$targetValue$2(SwipeableV2State<T> swipeableV2State) {
        super(0);
        this.this$0 = swipeableV2State;
    }

    public final T invoke() {
        T access$getAnimationTarget = this.this$0.getAnimationTarget();
        if (access$getAnimationTarget != null) {
            return access$getAnimationTarget;
        }
        SwipeableV2State<T> swipeableV2State = this.this$0;
        Float offset = swipeableV2State.getOffset();
        if (offset != null) {
            return swipeableV2State.computeTarget(offset.floatValue(), swipeableV2State.getCurrentValue(), 0.0f);
        }
        return swipeableV2State.getCurrentValue();
    }
}
