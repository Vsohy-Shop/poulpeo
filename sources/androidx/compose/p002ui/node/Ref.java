package androidx.compose.p002ui.node;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.node.Ref */
/* compiled from: Ref.kt */
public final class Ref<T> {
    public static final int $stable = 8;
    private T value;

    public final T getValue() {
        return this.value;
    }

    public final void setValue(T t) {
        this.value = t;
    }
}
