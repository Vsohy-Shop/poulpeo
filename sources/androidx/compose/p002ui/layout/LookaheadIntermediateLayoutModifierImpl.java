package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13090q;

/* renamed from: androidx.compose.ui.layout.LookaheadIntermediateLayoutModifierImpl */
/* compiled from: IntermediateLayoutModifier.kt */
public final class LookaheadIntermediateLayoutModifierImpl extends InspectorValueInfo implements IntermediateLayoutModifier {
    private final C13090q<MeasureScope, Measurable, Constraints, IntSize, MeasureResult> measureBlock;
    private long targetSize = IntSize.Companion.m38633getZeroYbymL2g();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LookaheadIntermediateLayoutModifierImpl(C13090q<? super MeasureScope, ? super Measurable, ? super Constraints, ? super IntSize, ? extends MeasureResult> qVar, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        C12775o.m28639i(qVar, "measureBlock");
        C12775o.m28639i(function1, "inspectorInfo");
        this.measureBlock = qVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LookaheadIntermediateLayoutModifierImpl)) {
            return false;
        }
        LookaheadIntermediateLayoutModifierImpl lookaheadIntermediateLayoutModifierImpl = (LookaheadIntermediateLayoutModifierImpl) obj;
        if (!C12775o.m28634d(this.measureBlock, lookaheadIntermediateLayoutModifierImpl.measureBlock) || !IntSize.m38626equalsimpl0(m37353getTargetSizeYbymL2g(), lookaheadIntermediateLayoutModifierImpl.m37353getTargetSizeYbymL2g())) {
            return false;
        }
        return true;
    }

    public final C13090q<MeasureScope, Measurable, Constraints, IntSize, MeasureResult> getMeasureBlock() {
        return this.measureBlock;
    }

    /* renamed from: getTargetSize-YbymL2g  reason: not valid java name */
    public long m37353getTargetSizeYbymL2g() {
        return this.targetSize;
    }

    public int hashCode() {
        return (this.measureBlock.hashCode() * 31) + IntSize.m38629hashCodeimpl(m37353getTargetSizeYbymL2g());
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m37354measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        return this.measureBlock.invoke(measureScope, measurable, Constraints.m38400boximpl(j), IntSize.m38620boximpl(m37353getTargetSizeYbymL2g()));
    }

    /* renamed from: setTargetSize-ozmzZPI  reason: not valid java name */
    public void m37355setTargetSizeozmzZPI(long j) {
        this.targetSize = j;
    }
}
