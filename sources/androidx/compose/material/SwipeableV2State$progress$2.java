package androidx.compose.material;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: SwipeableV2.kt */
final class SwipeableV2State$progress$2 extends C12777p implements C13074a<Float> {
    final /* synthetic */ SwipeableV2State<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableV2State$progress$2(SwipeableV2State<T> swipeableV2State) {
        super(0);
        this.this$0 = swipeableV2State;
    }

    public final Float invoke() {
        Float f = this.this$0.getAnchors$material_release().get(this.this$0.getCurrentValue());
        float f2 = 0.0f;
        float floatValue = f != null ? f.floatValue() : 0.0f;
        Float f3 = this.this$0.getAnchors$material_release().get(this.this$0.getTargetValue());
        float floatValue2 = (f3 != null ? f3.floatValue() : 0.0f) - floatValue;
        if (Math.abs(floatValue2) > 1.0E-6f) {
            float requireOffset = (this.this$0.requireOffset() - floatValue) / floatValue2;
            if (requireOffset >= 1.0E-6f) {
                if (requireOffset <= 0.999999f) {
                    f2 = requireOffset;
                }
            }
            return Float.valueOf(f2);
        }
        f2 = 1.0f;
        return Float.valueOf(f2);
    }
}
