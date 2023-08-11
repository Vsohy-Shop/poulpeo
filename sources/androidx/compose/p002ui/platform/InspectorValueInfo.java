package androidx.compose.p002ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p448vf.C13650g;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.platform.InspectorValueInfo */
/* compiled from: InspectableValue.kt */
public abstract class InspectorValueInfo implements InspectableValue {
    public static final int $stable = 8;
    private InspectorInfo _values;
    private final Function1<InspectorInfo, C11921v> info;

    public InspectorValueInfo(Function1<? super InspectorInfo, C11921v> function1) {
        C12775o.m28639i(function1, "info");
        this.info = function1;
    }

    private final InspectorInfo getValues() {
        InspectorInfo inspectorInfo = this._values;
        if (inspectorInfo == null) {
            inspectorInfo = new InspectorInfo();
            this.info.invoke(inspectorInfo);
        }
        this._values = inspectorInfo;
        return inspectorInfo;
    }

    public C13650g<ValueElement> getInspectableElements() {
        return getValues().getProperties();
    }

    public String getNameFallback() {
        return getValues().getName();
    }

    public Object getValueOverride() {
        return getValues().getValue();
    }
}
