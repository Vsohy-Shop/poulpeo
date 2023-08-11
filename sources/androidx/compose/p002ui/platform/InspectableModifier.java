package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.platform.InspectableModifier */
/* compiled from: InspectableValue.kt */
public final class InspectableModifier extends InspectorValueInfo implements Modifier.Element {
    public static final int $stable = 0;
    private final End end = new End();

    /* renamed from: androidx.compose.ui.platform.InspectableModifier$End */
    /* compiled from: InspectableValue.kt */
    public final class End implements Modifier.Element {
        public End() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InspectableModifier(Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        C12775o.m28639i(function1, "inspectorInfo");
    }

    public final End getEnd() {
        return this.end;
    }
}
