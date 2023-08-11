package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.node.LayoutModifierNode;
import androidx.compose.p002ui.unit.Constraints;
import kotlin.jvm.internal.C12775o;
import p404of.C13089p;

/* renamed from: androidx.compose.ui.layout.LayoutModifierImpl */
/* compiled from: LayoutModifier.kt */
public final class LayoutModifierImpl extends Modifier.Node implements LayoutModifierNode {
    private C13089p<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> measureBlock;

    public LayoutModifierImpl(C13089p<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> pVar) {
        C12775o.m28639i(pVar, "measureBlock");
        this.measureBlock = pVar;
    }

    public final C13089p<MeasureScope, Measurable, Constraints, MeasureResult> getMeasureBlock() {
        return this.measureBlock;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m37350measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        return (MeasureResult) this.measureBlock.invoke(measureScope, measurable, Constraints.m38400boximpl(j));
    }

    public final void setMeasureBlock(C13089p<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> pVar) {
        C12775o.m28639i(pVar, "<set-?>");
        this.measureBlock = pVar;
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.measureBlock + ')';
    }
}
