package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.IntrinsicMeasureScope;
import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.p002ui.unit.Density;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1024:1\n155#2:1025\n155#2:1026\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeModifier\n*L\n714#1:1025\n719#1:1026\n*E\n"})
/* compiled from: Size.kt */
final class SizeModifier extends InspectorValueInfo implements LayoutModifier {
    private final boolean enforceIncoming;
    private final float maxHeight;
    private final float maxWidth;
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ SizeModifier(float f, float f2, float f3, float f4, boolean z, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z, function1);
    }

    /* renamed from: getTargetConstraints-OenEA2s  reason: not valid java name */
    private final long m33349getTargetConstraintsOenEA2s(Density density) {
        int i;
        int i2;
        int i3;
        int d;
        float f = this.maxWidth;
        C1232Dp.Companion companion = C1232Dp.Companion;
        int i4 = 0;
        if (!C1232Dp.m38473equalsimpl0(f, companion.m38488getUnspecifiedD9Ej5fM())) {
            i = density.m38443roundToPx0680j_4(((C1232Dp) C13537l.m30879f(C1232Dp.m38466boximpl(this.maxWidth), C1232Dp.m38466boximpl(C1232Dp.m38468constructorimpl((float) 0)))).m38482unboximpl());
        } else {
            i = Integer.MAX_VALUE;
        }
        if (!C1232Dp.m38473equalsimpl0(this.maxHeight, companion.m38488getUnspecifiedD9Ej5fM())) {
            i2 = density.m38443roundToPx0680j_4(((C1232Dp) C13537l.m30879f(C1232Dp.m38466boximpl(this.maxHeight), C1232Dp.m38466boximpl(C1232Dp.m38468constructorimpl((float) 0)))).m38482unboximpl());
        } else {
            i2 = Integer.MAX_VALUE;
        }
        if (C1232Dp.m38473equalsimpl0(this.minWidth, companion.m38488getUnspecifiedD9Ej5fM()) || (i3 = C13537l.m30877d(C13537l.m30882i(density.m38443roundToPx0680j_4(this.minWidth), i), 0)) == Integer.MAX_VALUE) {
            i3 = 0;
        }
        if (!C1232Dp.m38473equalsimpl0(this.minHeight, companion.m38488getUnspecifiedD9Ej5fM()) && (d = C13537l.m30877d(C13537l.m30882i(density.m38443roundToPx0680j_4(this.minHeight), i2), 0)) != Integer.MAX_VALUE) {
            i4 = d;
        }
        return ConstraintsKt.Constraints(i3, i, i4, i2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SizeModifier)) {
            return false;
        }
        SizeModifier sizeModifier = (SizeModifier) obj;
        if (!C1232Dp.m38473equalsimpl0(this.minWidth, sizeModifier.minWidth) || !C1232Dp.m38473equalsimpl0(this.minHeight, sizeModifier.minHeight) || !C1232Dp.m38473equalsimpl0(this.maxWidth, sizeModifier.maxWidth) || !C1232Dp.m38473equalsimpl0(this.maxHeight, sizeModifier.maxHeight) || this.enforceIncoming != sizeModifier.enforceIncoming) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((C1232Dp.m38474hashCodeimpl(this.minWidth) * 31) + C1232Dp.m38474hashCodeimpl(this.minHeight)) * 31) + C1232Dp.m38474hashCodeimpl(this.maxWidth)) * 31) + C1232Dp.m38474hashCodeimpl(this.maxHeight)) * 31;
    }

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        long r0 = m33349getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m38409getHasFixedHeightimpl(r0)) {
            return Constraints.m38411getMaxHeightimpl(r0);
        }
        return ConstraintsKt.m38425constrainHeightK40F9xA(r0, intrinsicMeasurable.maxIntrinsicHeight(i));
    }

    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        long r0 = m33349getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m38410getHasFixedWidthimpl(r0)) {
            return Constraints.m38412getMaxWidthimpl(r0);
        }
        return ConstraintsKt.m38426constrainWidthK40F9xA(r0, intrinsicMeasurable.maxIntrinsicWidth(i));
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33350measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        long r0 = m33349getTargetConstraintsOenEA2s(measureScope);
        if (this.enforceIncoming) {
            j2 = ConstraintsKt.m38424constrainN9IONVI(j, r0);
        } else {
            float f = this.minWidth;
            C1232Dp.Companion companion = C1232Dp.Companion;
            if (!C1232Dp.m38473equalsimpl0(f, companion.m38488getUnspecifiedD9Ej5fM())) {
                i = Constraints.m38414getMinWidthimpl(r0);
            } else {
                i = C13537l.m30882i(Constraints.m38414getMinWidthimpl(j), Constraints.m38412getMaxWidthimpl(r0));
            }
            if (!C1232Dp.m38473equalsimpl0(this.maxWidth, companion.m38488getUnspecifiedD9Ej5fM())) {
                i2 = Constraints.m38412getMaxWidthimpl(r0);
            } else {
                i2 = C13537l.m30877d(Constraints.m38412getMaxWidthimpl(j), Constraints.m38414getMinWidthimpl(r0));
            }
            if (!C1232Dp.m38473equalsimpl0(this.minHeight, companion.m38488getUnspecifiedD9Ej5fM())) {
                i3 = Constraints.m38413getMinHeightimpl(r0);
            } else {
                i3 = C13537l.m30882i(Constraints.m38413getMinHeightimpl(j), Constraints.m38411getMaxHeightimpl(r0));
            }
            if (!C1232Dp.m38473equalsimpl0(this.maxHeight, companion.m38488getUnspecifiedD9Ej5fM())) {
                i4 = Constraints.m38411getMaxHeightimpl(r0);
            } else {
                i4 = C13537l.m30877d(Constraints.m38411getMaxHeightimpl(j), Constraints.m38413getMinHeightimpl(r0));
            }
            j2 = ConstraintsKt.Constraints(i, i2, i3, i4);
        }
        Placeable r9 = measurable.m37365measureBRTryo0(j2);
        return MeasureScope.layout$default(measureScope, r9.getWidth(), r9.getHeight(), (Map) null, new SizeModifier$measure$1(r9), 4, (Object) null);
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        long r0 = m33349getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m38409getHasFixedHeightimpl(r0)) {
            return Constraints.m38411getMaxHeightimpl(r0);
        }
        return ConstraintsKt.m38425constrainHeightK40F9xA(r0, intrinsicMeasurable.minIntrinsicHeight(i));
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        long r0 = m33349getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m38410getHasFixedWidthimpl(r0)) {
            return Constraints.m38412getMaxWidthimpl(r0);
        }
        return ConstraintsKt.m38426constrainWidthK40F9xA(r0, intrinsicMeasurable.minIntrinsicWidth(i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SizeModifier(float f, float f2, float f3, float f4, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM() : f, (i & 2) != 0 ? C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM() : f2, (i & 4) != 0 ? C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM() : f3, (i & 8) != 0 ? C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM() : f4, z, function1, (DefaultConstructorMarker) null);
    }

    private SizeModifier(float f, float f2, float f3, float f4, boolean z, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        this.minWidth = f;
        this.minHeight = f2;
        this.maxWidth = f3;
        this.maxHeight = f4;
        this.enforceIncoming = z;
    }
}
