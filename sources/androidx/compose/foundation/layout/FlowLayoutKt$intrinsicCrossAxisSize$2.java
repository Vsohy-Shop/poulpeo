package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13089p;

/* compiled from: FlowLayout.kt */
final class FlowLayoutKt$intrinsicCrossAxisSize$2 extends C12777p implements C13089p<IntrinsicMeasurable, Integer, Integer, Integer> {
    final /* synthetic */ int[] $crossAxisSizes;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlowLayoutKt$intrinsicCrossAxisSize$2(int[] iArr) {
        super(3);
        this.$crossAxisSizes = iArr;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }

    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i, int i2) {
        C12775o.m28639i(intrinsicMeasurable, "$this$intrinsicCrossAxisSize");
        return Integer.valueOf(this.$crossAxisSizes[i]);
    }
}
