package androidx.compose.material;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: SwipeableV2.kt */
final class SwipeableV2State$draggableState$1 extends C12777p implements Function1<Float, C11921v> {
    final /* synthetic */ SwipeableV2State<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableV2State$draggableState$1(SwipeableV2State<T> swipeableV2State) {
        super(1);
        this.this$0 = swipeableV2State;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return C11921v.f18618a;
    }

    public final void invoke(float f) {
        SwipeableV2State<T> swipeableV2State = this.this$0;
        Float offset = swipeableV2State.getOffset();
        swipeableV2State.setOffset(Float.valueOf(C13537l.m30885l((offset != null ? offset.floatValue() : 0.0f) + f, this.this$0.getMinOffset(), this.this$0.getMaxOffset())));
    }
}
