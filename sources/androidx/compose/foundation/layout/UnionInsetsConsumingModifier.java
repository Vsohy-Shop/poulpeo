package androidx.compose.foundation.layout;

import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

@Stable
/* compiled from: WindowInsetsPadding.kt */
final class UnionInsetsConsumingModifier extends InsetsConsumingModifier {
    private final WindowInsets insets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UnionInsetsConsumingModifier(WindowInsets windowInsets, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1, (DefaultConstructorMarker) null);
        C12775o.m28639i(windowInsets, "insets");
        C12775o.m28639i(function1, "inspectorInfo");
        this.insets = windowInsets;
    }

    public WindowInsets calculateInsets(WindowInsets windowInsets) {
        C12775o.m28639i(windowInsets, "modifierLocalInsets");
        return WindowInsetsKt.union(this.insets, windowInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnionInsetsConsumingModifier)) {
            return false;
        }
        return C12775o.m28634d(((UnionInsetsConsumingModifier) obj).insets, this.insets);
    }

    public int hashCode() {
        return this.insets.hashCode();
    }
}
