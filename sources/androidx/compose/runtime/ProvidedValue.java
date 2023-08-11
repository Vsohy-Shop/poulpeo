package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 1)
/* compiled from: Composer.kt */
public final class ProvidedValue<T> {
    public static final int $stable = 0;
    private final boolean canOverride;
    private final CompositionLocal<T> compositionLocal;
    private final T value;

    public ProvidedValue(CompositionLocal<T> compositionLocal2, T t, boolean z) {
        C12775o.m28639i(compositionLocal2, "compositionLocal");
        this.compositionLocal = compositionLocal2;
        this.value = t;
        this.canOverride = z;
    }

    public final boolean getCanOverride() {
        return this.canOverride;
    }

    public final CompositionLocal<T> getCompositionLocal() {
        return this.compositionLocal;
    }

    public final T getValue() {
        return this.value;
    }
}
