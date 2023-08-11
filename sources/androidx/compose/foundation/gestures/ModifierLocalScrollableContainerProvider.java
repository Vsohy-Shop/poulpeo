package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.modifier.ModifierLocalProvider;
import androidx.compose.p002ui.modifier.ProvidableModifierLocal;

/* compiled from: Scrollable.kt */
final class ModifierLocalScrollableContainerProvider implements ModifierLocalProvider<Boolean> {
    public static final ModifierLocalScrollableContainerProvider INSTANCE = new ModifierLocalScrollableContainerProvider();
    private static final ProvidableModifierLocal<Boolean> key = ScrollableKt.getModifierLocalScrollableContainer();
    private static final boolean value = true;

    private ModifierLocalScrollableContainerProvider() {
    }

    public ProvidableModifierLocal<Boolean> getKey() {
        return key;
    }

    public Boolean getValue() {
        return Boolean.valueOf(value);
    }
}
