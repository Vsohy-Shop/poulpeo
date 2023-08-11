package androidx.compose.material;

import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Tab.kt */
final class TabKt$TabBaselineLayout$2$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ Integer $firstBaseline;
    final /* synthetic */ Placeable $iconPlaceable;
    final /* synthetic */ Integer $lastBaseline;
    final /* synthetic */ int $tabHeight;
    final /* synthetic */ int $tabWidth;
    final /* synthetic */ Placeable $textPlaceable;
    final /* synthetic */ MeasureScope $this_Layout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TabKt$TabBaselineLayout$2$measure$1(Placeable placeable, Placeable placeable2, MeasureScope measureScope, int i, int i2, Integer num, Integer num2) {
        super(1);
        this.$textPlaceable = placeable;
        this.$iconPlaceable = placeable2;
        this.$this_Layout = measureScope;
        this.$tabWidth = i;
        this.$tabHeight = i2;
        this.$firstBaseline = num;
        this.$lastBaseline = num2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        Placeable placeable;
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable placeable2 = this.$textPlaceable;
        if (placeable2 != null && (placeable = this.$iconPlaceable) != null) {
            MeasureScope measureScope = this.$this_Layout;
            int i = this.$tabWidth;
            int i2 = this.$tabHeight;
            Integer num = this.$firstBaseline;
            C12775o.m28636f(num);
            int intValue = num.intValue();
            Integer num2 = this.$lastBaseline;
            C12775o.m28636f(num2);
            TabKt.placeTextAndIcon(placementScope, measureScope, placeable2, placeable, i, i2, intValue, num2.intValue());
        } else if (placeable2 != null) {
            TabKt.placeTextOrIcon(placementScope, placeable2, this.$tabHeight);
        } else {
            Placeable placeable3 = this.$iconPlaceable;
            if (placeable3 != null) {
                TabKt.placeTextOrIcon(placementScope, placeable3, this.$tabHeight);
            }
        }
    }
}
