package androidx.compose.material3;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Slider.kt */
final class SliderKt$SliderImpl$2$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ int $thumbOffsetX;
    final /* synthetic */ int $thumbOffsetY;
    final /* synthetic */ Placeable $thumbPlaceable;
    final /* synthetic */ int $trackOffsetX;
    final /* synthetic */ int $trackOffsetY;
    final /* synthetic */ Placeable $trackPlaceable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$SliderImpl$2$measure$1(Placeable placeable, int i, int i2, Placeable placeable2, int i3, int i4) {
        super(1);
        this.$trackPlaceable = placeable;
        this.$trackOffsetX = i;
        this.$trackOffsetY = i2;
        this.$thumbPlaceable = placeable2;
        this.$thumbOffsetX = i3;
        this.$thumbOffsetY = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.placeRelative$default(placementScope2, this.$trackPlaceable, this.$trackOffsetX, this.$trackOffsetY, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.placeRelative$default(placementScope2, this.$thumbPlaceable, this.$thumbOffsetX, this.$thumbOffsetY, 0.0f, 4, (Object) null);
    }
}
