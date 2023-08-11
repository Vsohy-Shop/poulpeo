package androidx.compose.foundation.layout;

import androidx.compose.p002ui.modifier.ModifierLocalConsumer;
import androidx.compose.p002ui.modifier.ModifierLocalReadScope;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

@Stable
/* compiled from: WindowInsetsPadding.kt */
final class ConsumedInsetsModifier extends InspectorValueInfo implements ModifierLocalConsumer {
    private final Function1<WindowInsets, C11921v> block;
    private WindowInsets oldWindowInsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConsumedInsetsModifier(Function1<? super WindowInsets, C11921v> function1, Function1<? super InspectorInfo, C11921v> function12) {
        super(function12);
        C12775o.m28639i(function1, "block");
        C12775o.m28639i(function12, "inspectorInfo");
        this.block = function1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumedInsetsModifier)) {
            return false;
        }
        return C12775o.m28634d(((ConsumedInsetsModifier) obj).block, this.block);
    }

    public int hashCode() {
        return this.block.hashCode();
    }

    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        C12775o.m28639i(modifierLocalReadScope, "scope");
        WindowInsets windowInsets = (WindowInsets) modifierLocalReadScope.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
        if (!C12775o.m28634d(windowInsets, this.oldWindowInsets)) {
            this.oldWindowInsets = windowInsets;
            this.block.invoke(windowInsets);
        }
    }
}
