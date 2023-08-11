package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Size.kt */
final class WrapContentModifier$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ int $wrapperHeight;
    final /* synthetic */ int $wrapperWidth;
    final /* synthetic */ WrapContentModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WrapContentModifier$measure$1(WrapContentModifier wrapContentModifier, int i, Placeable placeable, int i2, MeasureScope measureScope) {
        super(1);
        this.this$0 = wrapContentModifier;
        this.$wrapperWidth = i;
        this.$placeable = placeable;
        this.$wrapperHeight = i2;
        this.$this_measure = measureScope;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.m37405place70tqf50$default(placementScope2, this.$placeable, ((IntOffset) this.this$0.alignmentCallback.invoke(IntSize.m38620boximpl(IntSizeKt.IntSize(this.$wrapperWidth - this.$placeable.getWidth(), this.$wrapperHeight - this.$placeable.getHeight())), this.$this_measure.getLayoutDirection())).m38595unboximpl(), 0.0f, 2, (Object) null);
    }
}
