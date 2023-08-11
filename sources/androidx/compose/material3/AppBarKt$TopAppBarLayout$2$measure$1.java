package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Constraints;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: AppBar.kt */
final class AppBarKt$TopAppBarLayout$2$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ Placeable $actionIconsPlaceable;
    final /* synthetic */ long $constraints;
    final /* synthetic */ int $layoutHeight;
    final /* synthetic */ Placeable $navigationIconPlaceable;
    final /* synthetic */ MeasureScope $this_Layout;
    final /* synthetic */ int $titleBaseline;
    final /* synthetic */ int $titleBottomPadding;
    final /* synthetic */ Arrangement.Horizontal $titleHorizontalArrangement;
    final /* synthetic */ Placeable $titlePlaceable;
    final /* synthetic */ Arrangement.Vertical $titleVerticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppBarKt$TopAppBarLayout$2$measure$1(Placeable placeable, int i, Placeable placeable2, Arrangement.Horizontal horizontal, long j, Placeable placeable3, MeasureScope measureScope, Arrangement.Vertical vertical, int i2, int i3) {
        super(1);
        this.$navigationIconPlaceable = placeable;
        this.$layoutHeight = i;
        this.$titlePlaceable = placeable2;
        this.$titleHorizontalArrangement = horizontal;
        this.$constraints = j;
        this.$actionIconsPlaceable = placeable3;
        this.$this_Layout = measureScope;
        this.$titleVerticalArrangement = vertical;
        this.$titleBottomPadding = i2;
        this.$titleBaseline = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        int max;
        int i;
        int i2;
        int i3;
        int i4;
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable placeable = this.$navigationIconPlaceable;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (this.$layoutHeight - placeable.getHeight()) / 2, 0.0f, 4, (Object) null);
        Placeable placeable2 = this.$titlePlaceable;
        Arrangement.Horizontal horizontal = this.$titleHorizontalArrangement;
        Arrangement arrangement = Arrangement.INSTANCE;
        if (C12775o.m28634d(horizontal, arrangement.getCenter())) {
            max = (Constraints.m38412getMaxWidthimpl(this.$constraints) - this.$titlePlaceable.getWidth()) / 2;
        } else if (C12775o.m28634d(horizontal, arrangement.getEnd())) {
            max = (Constraints.m38412getMaxWidthimpl(this.$constraints) - this.$titlePlaceable.getWidth()) - this.$actionIconsPlaceable.getWidth();
        } else {
            max = Math.max(this.$this_Layout.m38443roundToPx0680j_4(AppBarKt.TopAppBarTitleInset), this.$navigationIconPlaceable.getWidth());
        }
        int i5 = max;
        Arrangement.Vertical vertical = this.$titleVerticalArrangement;
        if (C12775o.m28634d(vertical, arrangement.getCenter())) {
            i4 = (this.$layoutHeight - this.$titlePlaceable.getHeight()) / 2;
        } else if (C12775o.m28634d(vertical, arrangement.getBottom())) {
            if (this.$titleBottomPadding == 0) {
                i3 = this.$layoutHeight;
                i2 = this.$titlePlaceable.getHeight();
            } else {
                i3 = this.$layoutHeight - this.$titlePlaceable.getHeight();
                i2 = Math.max(0, (this.$titleBottomPadding - this.$titlePlaceable.getHeight()) + this.$titleBaseline);
            }
            i4 = i3 - i2;
        } else {
            i = 0;
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i5, i, 0.0f, 4, (Object) null);
            Placeable.PlacementScope.placeRelative$default(placementScope, this.$actionIconsPlaceable, Constraints.m38412getMaxWidthimpl(this.$constraints) - this.$actionIconsPlaceable.getWidth(), (this.$layoutHeight - this.$actionIconsPlaceable.getHeight()) / 2, 0.0f, 4, (Object) null);
        }
        i = i4;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i5, i, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.placeRelative$default(placementScope, this.$actionIconsPlaceable, Constraints.m38412getMaxWidthimpl(this.$constraints) - this.$actionIconsPlaceable.getWidth(), (this.$layoutHeight - this.$actionIconsPlaceable.getHeight()) / 2, 0.0f, 4, (Object) null);
    }
}
