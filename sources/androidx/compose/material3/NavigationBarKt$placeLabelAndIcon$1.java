package androidx.compose.material3;

import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: NavigationBar.kt */
final class NavigationBarKt$placeLabelAndIcon$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ float $animationProgress;
    final /* synthetic */ int $containerWidth;
    final /* synthetic */ Placeable $iconPlaceable;
    final /* synthetic */ int $iconX;
    final /* synthetic */ Placeable $indicatorPlaceable;
    final /* synthetic */ Placeable $indicatorRipplePlaceable;
    final /* synthetic */ Placeable $labelPlaceable;
    final /* synthetic */ int $labelX;
    final /* synthetic */ int $labelY;
    final /* synthetic */ int $offset;
    final /* synthetic */ int $rippleX;
    final /* synthetic */ int $rippleY;
    final /* synthetic */ int $selectedIconY;
    final /* synthetic */ MeasureScope $this_placeLabelAndIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavigationBarKt$placeLabelAndIcon$1(Placeable placeable, boolean z, float f, Placeable placeable2, int i, int i2, int i3, Placeable placeable3, int i4, int i5, Placeable placeable4, int i6, int i7, int i8, MeasureScope measureScope) {
        super(1);
        this.$indicatorPlaceable = placeable;
        this.$alwaysShowLabel = z;
        this.$animationProgress = f;
        this.$labelPlaceable = placeable2;
        this.$labelX = i;
        this.$labelY = i2;
        this.$offset = i3;
        this.$iconPlaceable = placeable3;
        this.$iconX = i4;
        this.$selectedIconY = i5;
        this.$indicatorRipplePlaceable = placeable4;
        this.$rippleX = i6;
        this.$rippleY = i7;
        this.$containerWidth = i8;
        this.$this_placeLabelAndIcon = measureScope;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        if ((r8.$animationProgress == 0.0f) == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.p002ui.layout.Placeable.PlacementScope r9) {
        /*
            r8 = this;
            java.lang.String r0 = "$this$layout"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            androidx.compose.ui.layout.Placeable r2 = r8.$indicatorPlaceable
            if (r2 == 0) goto L_0x002a
            int r0 = r8.$containerWidth
            int r1 = r8.$selectedIconY
            androidx.compose.ui.layout.MeasureScope r3 = r8.$this_placeLabelAndIcon
            int r4 = r8.$offset
            int r5 = r2.getWidth()
            int r0 = r0 - r5
            int r0 = r0 / 2
            float r5 = androidx.compose.material3.NavigationBarKt.IndicatorVerticalPadding
            int r3 = r3.m38443roundToPx0680j_4(r5)
            int r1 = r1 - r3
            int r4 = r4 + r1
            r5 = 0
            r6 = 4
            r7 = 0
            r1 = r9
            r3 = r0
            androidx.compose.p002ui.layout.Placeable.PlacementScope.placeRelative$default(r1, r2, r3, r4, r5, r6, r7)
        L_0x002a:
            boolean r0 = r8.$alwaysShowLabel
            if (r0 != 0) goto L_0x003a
            float r0 = r8.$animationProgress
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0037
            r0 = 1
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            if (r0 != 0) goto L_0x004b
        L_0x003a:
            androidx.compose.ui.layout.Placeable r2 = r8.$labelPlaceable
            int r3 = r8.$labelX
            int r0 = r8.$labelY
            int r1 = r8.$offset
            int r4 = r0 + r1
            r5 = 0
            r6 = 4
            r7 = 0
            r1 = r9
            androidx.compose.p002ui.layout.Placeable.PlacementScope.placeRelative$default(r1, r2, r3, r4, r5, r6, r7)
        L_0x004b:
            androidx.compose.ui.layout.Placeable r2 = r8.$iconPlaceable
            int r3 = r8.$iconX
            int r0 = r8.$selectedIconY
            int r1 = r8.$offset
            int r4 = r0 + r1
            r5 = 0
            r6 = 4
            r7 = 0
            r1 = r9
            androidx.compose.p002ui.layout.Placeable.PlacementScope.placeRelative$default(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.layout.Placeable r2 = r8.$indicatorRipplePlaceable
            int r3 = r8.$rippleX
            int r0 = r8.$rippleY
            int r1 = r8.$offset
            int r4 = r0 + r1
            r1 = r9
            androidx.compose.p002ui.layout.Placeable.PlacementScope.placeRelative$default(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt$placeLabelAndIcon$1.invoke(androidx.compose.ui.layout.Placeable$PlacementScope):void");
    }
}
