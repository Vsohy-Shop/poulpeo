package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.AlignmentLine;
import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

/* compiled from: AlignmentLine.kt */
final class AlignmentLineOffsetDp extends InspectorValueInfo implements LayoutModifier {
    private final float after;
    private final AlignmentLine alignmentLine;
    private final float before;

    public /* synthetic */ AlignmentLineOffsetDp(AlignmentLine alignmentLine2, float f, float f2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignmentLine2, f, f2, function1);
    }

    public boolean equals(Object obj) {
        AlignmentLineOffsetDp alignmentLineOffsetDp;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlignmentLineOffsetDp) {
            alignmentLineOffsetDp = (AlignmentLineOffsetDp) obj;
        } else {
            alignmentLineOffsetDp = null;
        }
        if (alignmentLineOffsetDp == null) {
            return false;
        }
        if (!C12775o.m28634d(this.alignmentLine, alignmentLineOffsetDp.alignmentLine) || !C1232Dp.m38473equalsimpl0(this.before, alignmentLineOffsetDp.before) || !C1232Dp.m38473equalsimpl0(this.after, alignmentLineOffsetDp.after)) {
            return false;
        }
        return true;
    }

    /* renamed from: getAfter-D9Ej5fM  reason: not valid java name */
    public final float m33169getAfterD9Ej5fM() {
        return this.after;
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-D9Ej5fM  reason: not valid java name */
    public final float m33170getBeforeD9Ej5fM() {
        return this.before;
    }

    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + C1232Dp.m38474hashCodeimpl(this.before)) * 31) + C1232Dp.m38474hashCodeimpl(this.after);
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33171measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        return AlignmentLineKt.m33160alignmentLineOffsetMeasuretjqqzMA(measureScope, this.alignmentLine, this.before, this.after, measurable, j);
    }

    public String toString() {
        return "AlignmentLineOffset(alignmentLine=" + this.alignmentLine + ", before=" + C1232Dp.m38479toStringimpl(this.before) + ", after=" + C1232Dp.m38479toStringimpl(this.after) + ')';
    }

    private AlignmentLineOffsetDp(AlignmentLine alignmentLine2, float f, float f2, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        this.alignmentLine = alignmentLine2;
        this.before = f;
        this.after = f2;
        if (!((f >= 0.0f || C1232Dp.m38473equalsimpl0(f, C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM())) && (f2 >= 0.0f || C1232Dp.m38473equalsimpl0(f2, C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM())))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number".toString());
        }
    }
}
