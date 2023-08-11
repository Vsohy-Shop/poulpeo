package androidx.compose.foundation.layout;

import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

@Stable
/* compiled from: WindowInsetsPadding.kt */
final class PaddingValuesConsumingModifier extends InsetsConsumingModifier {
    private final PaddingValues paddingValues;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaddingValuesConsumingModifier(PaddingValues paddingValues2, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1, (DefaultConstructorMarker) null);
        C12775o.m28639i(paddingValues2, "paddingValues");
        C12775o.m28639i(function1, "inspectorInfo");
        this.paddingValues = paddingValues2;
    }

    public WindowInsets calculateInsets(WindowInsets windowInsets) {
        C12775o.m28639i(windowInsets, "modifierLocalInsets");
        return WindowInsetsKt.add(WindowInsetsKt.asInsets(this.paddingValues), windowInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaddingValuesConsumingModifier)) {
            return false;
        }
        return C12775o.m28634d(((PaddingValuesConsumingModifier) obj).paddingValues, this.paddingValues);
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }
}
