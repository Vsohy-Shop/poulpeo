package androidx.compose.p002ui.modifier;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.modifier.EmptyMap */
/* compiled from: ModifierLocalNode.kt */
public final class EmptyMap extends ModifierLocalMap {
    public static final EmptyMap INSTANCE = new EmptyMap();

    private EmptyMap() {
        super((DefaultConstructorMarker) null);
    }

    public boolean contains$ui_release(ModifierLocal<?> modifierLocal) {
        C12775o.m28639i(modifierLocal, "key");
        return false;
    }

    public <T> T get$ui_release(ModifierLocal<T> modifierLocal) {
        C12775o.m28639i(modifierLocal, "key");
        throw new IllegalStateException("".toString());
    }

    public <T> Void set$ui_release(ModifierLocal<T> modifierLocal, T t) {
        C12775o.m28639i(modifierLocal, "key");
        throw new IllegalStateException("".toString());
    }
}
