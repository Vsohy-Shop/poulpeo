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
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

/* compiled from: Size.kt */
final class UnspecifiedConstraintsModifier extends InspectorValueInfo implements LayoutModifier {
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ UnspecifiedConstraintsModifier(float f, float f2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, function1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsModifier)) {
            return false;
        }
        UnspecifiedConstraintsModifier unspecifiedConstraintsModifier = (UnspecifiedConstraintsModifier) obj;
        if (!C1232Dp.m38473equalsimpl0(this.minWidth, unspecifiedConstraintsModifier.minWidth) || !C1232Dp.m38473equalsimpl0(this.minHeight, unspecifiedConstraintsModifier.minHeight)) {
            return false;
        }
        return true;
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m33352getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public final float m33353getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    public int hashCode() {
        return (C1232Dp.m38474hashCodeimpl(this.minWidth) * 31) + C1232Dp.m38474hashCodeimpl(this.minHeight);
    }

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int i2;
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        int maxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i);
        if (!C1232Dp.m38473equalsimpl0(this.minHeight, C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM())) {
            i2 = intrinsicMeasureScope.m38443roundToPx0680j_4(this.minHeight);
        } else {
            i2 = 0;
        }
        return C13537l.m30877d(maxIntrinsicHeight, i2);
    }

    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int i2;
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i);
        if (!C1232Dp.m38473equalsimpl0(this.minWidth, C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM())) {
            i2 = intrinsicMeasureScope.m38443roundToPx0680j_4(this.minWidth);
        } else {
            i2 = 0;
        }
        return C13537l.m30877d(maxIntrinsicWidth, i2);
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33354measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int i;
        int i2;
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        float f = this.minWidth;
        C1232Dp.Companion companion = C1232Dp.Companion;
        if (C1232Dp.m38473equalsimpl0(f, companion.m38488getUnspecifiedD9Ej5fM()) || Constraints.m38414getMinWidthimpl(j) != 0) {
            i = Constraints.m38414getMinWidthimpl(j);
        } else {
            i = C13537l.m30877d(C13537l.m30882i(measureScope.m38443roundToPx0680j_4(this.minWidth), Constraints.m38412getMaxWidthimpl(j)), 0);
        }
        int r3 = Constraints.m38412getMaxWidthimpl(j);
        if (C1232Dp.m38473equalsimpl0(this.minHeight, companion.m38488getUnspecifiedD9Ej5fM()) || Constraints.m38413getMinHeightimpl(j) != 0) {
            i2 = Constraints.m38413getMinHeightimpl(j);
        } else {
            i2 = C13537l.m30877d(C13537l.m30882i(measureScope.m38443roundToPx0680j_4(this.minHeight), Constraints.m38411getMaxHeightimpl(j)), 0);
        }
        Placeable r9 = measurable.m37365measureBRTryo0(ConstraintsKt.Constraints(i, r3, i2, Constraints.m38411getMaxHeightimpl(j)));
        return MeasureScope.layout$default(measureScope, r9.getWidth(), r9.getHeight(), (Map) null, new UnspecifiedConstraintsModifier$measure$1(r9), 4, (Object) null);
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int i2;
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        int minIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(i);
        if (!C1232Dp.m38473equalsimpl0(this.minHeight, C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM())) {
            i2 = intrinsicMeasureScope.m38443roundToPx0680j_4(this.minHeight);
        } else {
            i2 = 0;
        }
        return C13537l.m30877d(minIntrinsicHeight, i2);
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        int i2;
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        int minIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(i);
        if (!C1232Dp.m38473equalsimpl0(this.minWidth, C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM())) {
            i2 = intrinsicMeasureScope.m38443roundToPx0680j_4(this.minWidth);
        } else {
            i2 = 0;
        }
        return C13537l.m30877d(minIntrinsicWidth, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UnspecifiedConstraintsModifier(float f, float f2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM() : f, (i & 2) != 0 ? C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM() : f2, function1, (DefaultConstructorMarker) null);
    }

    private UnspecifiedConstraintsModifier(float f, float f2, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        this.minWidth = f;
        this.minHeight = f2;
    }
}
