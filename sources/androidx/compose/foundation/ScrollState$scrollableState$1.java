package androidx.compose.foundation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: Scroll.kt */
final class ScrollState$scrollableState$1 extends C12777p implements Function1<Float, Float> {
    final /* synthetic */ ScrollState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollState$scrollableState$1(ScrollState scrollState) {
        super(1);
        this.this$0 = scrollState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }

    public final Float invoke(float f) {
        float value = ((float) this.this$0.getValue()) + f + this.this$0.accumulator;
        float l = C13537l.m30885l(value, 0.0f, (float) this.this$0.getMaxValue());
        boolean z = !(value == l);
        float value2 = l - ((float) this.this$0.getValue());
        int c = C13265c.m30134c(value2);
        ScrollState scrollState = this.this$0;
        scrollState.setValue(scrollState.getValue() + c);
        this.this$0.accumulator = value2 - ((float) c);
        if (z) {
            f = value2;
        }
        return Float.valueOf(f);
    }
}
