package androidx.compose.material3;

import androidx.compose.material3.tokens.BadgeTokens;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Badge.kt */
final class BadgeKt$BadgedBox$2$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ Placeable $anchorPlaceable;
    final /* synthetic */ Placeable $badgePlaceable;
    final /* synthetic */ MeasureScope $this_Layout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BadgeKt$BadgedBox$2$measure$1(Placeable placeable, MeasureScope measureScope, Placeable placeable2) {
        super(1);
        this.$badgePlaceable = placeable;
        this.$this_Layout = measureScope;
        this.$anchorPlaceable = placeable2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        boolean z = this.$badgePlaceable.getWidth() > this.$this_Layout.m38443roundToPx0680j_4(BadgeTokens.INSTANCE.m34777getSizeD9Ej5fM());
        float badgeWithContentHorizontalOffset = z ? BadgeKt.getBadgeWithContentHorizontalOffset() : BadgeKt.getBadgeOffset();
        float badgeWithContentVerticalOffset = z ? BadgeKt.getBadgeWithContentVerticalOffset() : BadgeKt.getBadgeOffset();
        Placeable.PlacementScope.placeRelative$default(placementScope, this.$anchorPlaceable, 0, 0, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.placeRelative$default(placementScope, this.$badgePlaceable, this.$anchorPlaceable.getWidth() + this.$this_Layout.m38443roundToPx0680j_4(badgeWithContentHorizontalOffset), ((-this.$badgePlaceable.getHeight()) / 2) + this.$this_Layout.m38443roundToPx0680j_4(badgeWithContentVerticalOffset), 0.0f, 4, (Object) null);
    }
}
