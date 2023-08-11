package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.AlignmentLine;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: AlignmentLine.kt */
final class AlignmentLineKt$alignmentLineOffsetMeasure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ AlignmentLine $alignmentLine;
    final /* synthetic */ float $before;
    final /* synthetic */ int $height;
    final /* synthetic */ int $paddingAfter;
    final /* synthetic */ int $paddingBefore;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ int $width;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AlignmentLineKt$alignmentLineOffsetMeasure$1(AlignmentLine alignmentLine, float f, int i, int i2, int i3, Placeable placeable, int i4) {
        super(1);
        this.$alignmentLine = alignmentLine;
        this.$before = f;
        this.$paddingBefore = i;
        this.$width = i2;
        this.$paddingAfter = i3;
        this.$placeable = placeable;
        this.$height = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        int i;
        int i2;
        C12775o.m28639i(placementScope, "$this$layout");
        int i3 = 0;
        if (AlignmentLineKt.getHorizontal(this.$alignmentLine)) {
            i = 0;
        } else {
            if (!C1232Dp.m38473equalsimpl0(this.$before, C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM())) {
                i2 = this.$paddingBefore;
            } else {
                i2 = (this.$width - this.$paddingAfter) - this.$placeable.getWidth();
            }
            i = i2;
        }
        if (AlignmentLineKt.getHorizontal(this.$alignmentLine)) {
            if (!C1232Dp.m38473equalsimpl0(this.$before, C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM())) {
                i3 = this.$paddingBefore;
            } else {
                i3 = (this.$height - this.$paddingAfter) - this.$placeable.getHeight();
            }
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, this.$placeable, i, i3, 0.0f, 4, (Object) null);
    }
}
