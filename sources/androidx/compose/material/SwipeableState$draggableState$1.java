package androidx.compose.material;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Swipeable.kt */
final class SwipeableState$draggableState$1 extends C12777p implements Function1<Float, C11921v> {
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableState$draggableState$1(SwipeableState<T> swipeableState) {
        super(1);
        this.this$0 = swipeableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return C11921v.f18618a;
    }

    public final void invoke(float f) {
        float floatValue = ((Number) this.this$0.absoluteOffset.getValue()).floatValue() + f;
        float l = C13537l.m30885l(floatValue, this.this$0.getMinBound$material_release(), this.this$0.getMaxBound$material_release());
        float f2 = floatValue - l;
        ResistanceConfig resistance$material_release = this.this$0.getResistance$material_release();
        this.this$0.offsetState.setValue(Float.valueOf(l + (resistance$material_release != null ? resistance$material_release.computeResistance(f2) : 0.0f)));
        this.this$0.overflowState.setValue(Float.valueOf(f2));
        this.this$0.absoluteOffset.setValue(Float.valueOf(floatValue));
    }
}
