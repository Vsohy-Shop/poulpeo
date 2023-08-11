package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.node.ModifierNodeElement;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.unit.Constraints;
import kotlin.jvm.internal.C12775o;
import p404of.C13089p;

/* renamed from: androidx.compose.ui.layout.LayoutModifierElement */
/* compiled from: LayoutModifier.kt */
final class LayoutModifierElement extends ModifierNodeElement<LayoutModifierImpl> {
    private final C13089p<MeasureScope, Measurable, Constraints, MeasureResult> measure;

    public LayoutModifierElement(C13089p<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> pVar) {
        C12775o.m28639i(pVar, "measure");
        this.measure = pVar;
    }

    public static /* synthetic */ LayoutModifierElement copy$default(LayoutModifierElement layoutModifierElement, C13089p<MeasureScope, Measurable, Constraints, MeasureResult> pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            pVar = layoutModifierElement.measure;
        }
        return layoutModifierElement.copy(pVar);
    }

    public final C13089p<MeasureScope, Measurable, Constraints, MeasureResult> component1() {
        return this.measure;
    }

    public final LayoutModifierElement copy(C13089p<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> pVar) {
        C12775o.m28639i(pVar, "measure");
        return new LayoutModifierElement(pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LayoutModifierElement) && C12775o.m28634d(this.measure, ((LayoutModifierElement) obj).measure)) {
            return true;
        }
        return false;
    }

    public final C13089p<MeasureScope, Measurable, Constraints, MeasureResult> getMeasure() {
        return this.measure;
    }

    public int hashCode() {
        return this.measure.hashCode();
    }

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "<this>");
        inspectorInfo.setName("layout");
        inspectorInfo.getProperties().set("measure", this.measure);
    }

    public String toString() {
        return "LayoutModifierElement(measure=" + this.measure + ')';
    }

    public LayoutModifierImpl create() {
        return new LayoutModifierImpl(this.measure);
    }

    public LayoutModifierImpl update(LayoutModifierImpl layoutModifierImpl) {
        C12775o.m28639i(layoutModifierImpl, "node");
        layoutModifierImpl.setMeasureBlock(this.measure);
        return layoutModifierImpl;
    }
}
