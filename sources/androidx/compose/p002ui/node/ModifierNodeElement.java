package androidx.compose.p002ui.node;

import androidx.compose.p002ui.ActualKt;
import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.Modifier.Node;
import androidx.compose.p002ui.platform.InspectableValue;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.ValueElement;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p448vf.C13650g;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@SourceDebugExtension({"SMAP\nModifierNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierNodeElement.kt\nandroidx/compose/ui/node/ModifierNodeElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
/* renamed from: androidx.compose.ui.node.ModifierNodeElement */
/* compiled from: ModifierNodeElement.kt */
public abstract class ModifierNodeElement<N extends Modifier.Node> implements Modifier.Element, InspectableValue {
    public static final int $stable = 0;
    private InspectorInfo _inspectorValues;

    private final InspectorInfo getInspectorValues() {
        InspectorInfo inspectorInfo = this._inspectorValues;
        if (inspectorInfo != null) {
            return inspectorInfo;
        }
        InspectorInfo inspectorInfo2 = new InspectorInfo();
        inspectorInfo2.setName(C12764h0.m28586b(getClass()).mo50651a());
        inspectableProperties(inspectorInfo2);
        this._inspectorValues = inspectorInfo2;
        return inspectorInfo2;
    }

    public abstract N create();

    public abstract boolean equals(Object obj);

    public boolean getAutoInvalidate() {
        return true;
    }

    public final C13650g<ValueElement> getInspectableElements() {
        return getInspectorValues().getProperties();
    }

    public final String getNameFallback() {
        return getInspectorValues().getName();
    }

    public final Object getValueOverride() {
        return getInspectorValues().getValue();
    }

    public abstract int hashCode();

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "<this>");
        ActualKt.tryPopulateReflectively(inspectorInfo, this);
    }

    public abstract N update(N n);
}
