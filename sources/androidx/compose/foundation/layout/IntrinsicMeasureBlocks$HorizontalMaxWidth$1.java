package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13089p;

/* compiled from: RowColumnImpl.kt */
final class IntrinsicMeasureBlocks$HorizontalMaxWidth$1 extends C12777p implements C13089p<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> {
    public static final IntrinsicMeasureBlocks$HorizontalMaxWidth$1 INSTANCE = new IntrinsicMeasureBlocks$HorizontalMaxWidth$1();

    IntrinsicMeasureBlocks$HorizontalMaxWidth$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((List<? extends IntrinsicMeasurable>) (List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }

    public final Integer invoke(List<? extends IntrinsicMeasurable> list, int i, int i2) {
        C12775o.m28639i(list, "measurables");
        C04541 r2 = C04541.INSTANCE;
        C04552 r3 = C04552.INSTANCE;
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        return Integer.valueOf(RowColumnImplKt.intrinsicSize(list, r2, r3, i, i2, layoutOrientation, layoutOrientation));
    }
}
