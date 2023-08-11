package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* compiled from: VectorConverters.kt */
final class TwoWayConverterImpl<T, V extends AnimationVector> implements TwoWayConverter<T, V> {
    private final Function1<V, T> convertFromVector;
    private final Function1<T, V> convertToVector;

    public TwoWayConverterImpl(Function1<? super T, ? extends V> function1, Function1<? super V, ? extends T> function12) {
        C12775o.m28639i(function1, "convertToVector");
        C12775o.m28639i(function12, "convertFromVector");
        this.convertToVector = function1;
        this.convertFromVector = function12;
    }

    public Function1<V, T> getConvertFromVector() {
        return this.convertFromVector;
    }

    public Function1<T, V> getConvertToVector() {
        return this.convertToVector;
    }
}
