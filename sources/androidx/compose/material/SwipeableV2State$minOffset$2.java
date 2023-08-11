package androidx.compose.material;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: SwipeableV2.kt */
final class SwipeableV2State$minOffset$2 extends C12777p implements C13074a<Float> {
    final /* synthetic */ SwipeableV2State<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableV2State$minOffset$2(SwipeableV2State<T> swipeableV2State) {
        super(0);
        this.this$0 = swipeableV2State;
    }

    public final Float invoke() {
        Float access$minOrNull = SwipeableV2Kt.minOrNull(this.this$0.getAnchors$material_release());
        return Float.valueOf(access$minOrNull != null ? access$minOrNull.floatValue() : Float.NEGATIVE_INFINITY);
    }
}
