package androidx.compose.p002ui.modifier;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.modifier.ModifierLocalMap */
/* compiled from: ModifierLocalNode.kt */
public abstract class ModifierLocalMap {
    public static final int $stable = 0;

    public /* synthetic */ ModifierLocalMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean contains$ui_release(ModifierLocal<?> modifierLocal);

    public abstract <T> T get$ui_release(ModifierLocal<T> modifierLocal);

    public abstract <T> void set$ui_release(ModifierLocal<T> modifierLocal, T t);

    private ModifierLocalMap() {
    }
}
