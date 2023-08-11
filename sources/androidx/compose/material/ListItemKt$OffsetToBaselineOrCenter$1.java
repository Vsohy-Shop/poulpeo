package androidx.compose.material;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.layout.AlignmentLineKt;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

/* compiled from: ListItem.kt */
final class ListItemKt$OffsetToBaselineOrCenter$1 implements MeasurePolicy {
    final /* synthetic */ float $offset;

    ListItemKt$OffsetToBaselineOrCenter$1(float f) {
        this.$offset = f;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m34040measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int i;
        int i2;
        C12775o.m28639i(measureScope, "$this$Layout");
        C12775o.m28639i(list, "measurables");
        Placeable r11 = ((Measurable) list.get(0)).m37365measureBRTryo0(Constraints.m38403copyZbe2FdA$default(j, 0, 0, 0, 0, 11, (Object) null));
        int i3 = r11.get(AlignmentLineKt.getFirstBaseline());
        if (i3 != Integer.MIN_VALUE) {
            i2 = measureScope.m38443roundToPx0680j_4(this.$offset) - i3;
            i = Math.max(Constraints.m38413getMinHeightimpl(j), r11.getHeight() + i2);
        } else {
            i = Math.max(Constraints.m38413getMinHeightimpl(j), r11.getHeight());
            i2 = IntOffset.m38587getYimpl(Alignment.Companion.getCenter().m35310alignKFBX0sM(IntSize.Companion.m38633getZeroYbymL2g(), IntSizeKt.IntSize(0, i - r11.getHeight()), measureScope.getLayoutDirection()));
        }
        return MeasureScope.layout$default(measureScope, r11.getWidth(), i, (Map) null, new ListItemKt$OffsetToBaselineOrCenter$1$measure$1(r11, i2), 4, (Object) null);
    }
}
