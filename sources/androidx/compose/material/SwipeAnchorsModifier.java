package androidx.compose.material;

import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.OnRemeasuredModifier;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

@Stable
/* compiled from: SwipeableV2.kt */
final class SwipeAnchorsModifier extends InspectorValueInfo implements LayoutModifier, OnRemeasuredModifier {
    private float lastDensity = -1.0f;
    private float lastFontScale = -1.0f;
    private final Function1<Density, C11921v> onDensityChanged;
    private final Function1<IntSize, C11921v> onSizeChanged;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeAnchorsModifier(Function1<? super Density, C11921v> function1, Function1<? super IntSize, C11921v> function12, Function1<? super InspectorInfo, C11921v> function13) {
        super(function13);
        C12775o.m28639i(function1, "onDensityChanged");
        C12775o.m28639i(function12, "onSizeChanged");
        C12775o.m28639i(function13, "inspectorInfo");
        this.onDensityChanged = function1;
        this.onSizeChanged = function12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r1 == false) goto L_0x0029;
     */
    /* renamed from: measure-3p2s80s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.p002ui.layout.MeasureResult m34135measure3p2s80s(androidx.compose.p002ui.layout.MeasureScope r8, androidx.compose.p002ui.layout.Measurable r9, long r10) {
        /*
            r7 = this;
            java.lang.String r0 = "$this$measure"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            java.lang.String r0 = "measurable"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            float r0 = r8.getDensity()
            float r1 = r7.lastDensity
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0018
            r0 = r1
            goto L_0x0019
        L_0x0018:
            r0 = r2
        L_0x0019:
            if (r0 == 0) goto L_0x0029
            float r0 = r8.getFontScale()
            float r3 = r7.lastFontScale
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r1 = r2
        L_0x0027:
            if (r1 != 0) goto L_0x0046
        L_0x0029:
            kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, ef.v> r0 = r7.onDensityChanged
            float r1 = r8.getDensity()
            float r2 = r8.getFontScale()
            androidx.compose.ui.unit.Density r1 = androidx.compose.p002ui.unit.DensityKt.Density(r1, r2)
            r0.invoke(r1)
            float r0 = r8.getDensity()
            r7.lastDensity = r0
            float r0 = r8.getFontScale()
            r7.lastFontScale = r0
        L_0x0046:
            androidx.compose.ui.layout.Placeable r9 = r9.m37365measureBRTryo0(r10)
            int r1 = r9.getWidth()
            int r2 = r9.getHeight()
            r3 = 0
            androidx.compose.material.SwipeAnchorsModifier$measure$1 r4 = new androidx.compose.material.SwipeAnchorsModifier$measure$1
            r4.<init>(r9)
            r5 = 4
            r6 = 0
            r0 = r8
            androidx.compose.ui.layout.MeasureResult r8 = androidx.compose.p002ui.layout.MeasureScope.layout$default(r0, r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeAnchorsModifier.m34135measure3p2s80s(androidx.compose.ui.layout.MeasureScope, androidx.compose.ui.layout.Measurable, long):androidx.compose.ui.layout.MeasureResult");
    }

    /* renamed from: onRemeasured-ozmzZPI  reason: not valid java name */
    public void m34136onRemeasuredozmzZPI(long j) {
        this.onSizeChanged.invoke(IntSize.m38620boximpl(j));
    }

    public String toString() {
        return "SwipeAnchorsModifierImpl(updateDensity=" + this.onDensityChanged + ", onSizeChanged=" + this.onSizeChanged + ')';
    }
}
