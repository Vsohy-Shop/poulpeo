package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.AlignmentLine;
import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.p002ui.unit.TextUnitKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

/* compiled from: AlignmentLine.kt */
final class AlignmentLineOffsetTextUnit extends InspectorValueInfo implements LayoutModifier {
    private final long after;
    private final AlignmentLine alignmentLine;
    private final long before;

    public /* synthetic */ AlignmentLineOffsetTextUnit(AlignmentLine alignmentLine2, long j, long j2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignmentLine2, j, j2, function1);
    }

    public boolean equals(Object obj) {
        AlignmentLineOffsetTextUnit alignmentLineOffsetTextUnit;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlignmentLineOffsetTextUnit) {
            alignmentLineOffsetTextUnit = (AlignmentLineOffsetTextUnit) obj;
        } else {
            alignmentLineOffsetTextUnit = null;
        }
        if (alignmentLineOffsetTextUnit == null) {
            return false;
        }
        if (!C12775o.m28634d(this.alignmentLine, alignmentLineOffsetTextUnit.alignmentLine) || !TextUnit.m38646equalsimpl0(this.before, alignmentLineOffsetTextUnit.before) || !TextUnit.m38646equalsimpl0(this.after, alignmentLineOffsetTextUnit.after)) {
            return false;
        }
        return true;
    }

    /* renamed from: getAfter-XSAIIZE  reason: not valid java name */
    public final long m33172getAfterXSAIIZE() {
        return this.after;
    }

    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-XSAIIZE  reason: not valid java name */
    public final long m33173getBeforeXSAIIZE() {
        return this.before;
    }

    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + TextUnit.m38650hashCodeimpl(this.before)) * 31) + TextUnit.m38650hashCodeimpl(this.after);
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33174measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        float f;
        float f2;
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        AlignmentLine alignmentLine2 = this.alignmentLine;
        if (!TextUnitKt.m38667isUnspecifiedR2X_6o(this.before)) {
            f = measureScope.m38444toDpGaN1DYA(this.before);
        } else {
            f = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        float f3 = f;
        if (!TextUnitKt.m38667isUnspecifiedR2X_6o(this.after)) {
            f2 = measureScope.m38444toDpGaN1DYA(this.after);
        } else {
            f2 = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        return AlignmentLineKt.m33160alignmentLineOffsetMeasuretjqqzMA(measureScope, alignmentLine2, f3, f2, measurable, j);
    }

    public String toString() {
        return "AlignmentLineOffset(alignmentLine=" + this.alignmentLine + ", before=" + TextUnit.m38656toStringimpl(this.before) + ", after=" + TextUnit.m38656toStringimpl(this.after) + ')';
    }

    private AlignmentLineOffsetTextUnit(AlignmentLine alignmentLine2, long j, long j2, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        this.alignmentLine = alignmentLine2;
        this.before = j;
        this.after = j2;
    }
}
