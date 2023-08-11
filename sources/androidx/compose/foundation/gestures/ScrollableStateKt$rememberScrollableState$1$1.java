package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: ScrollableState.kt */
final class ScrollableStateKt$rememberScrollableState$1$1 extends C12777p implements Function1<Float, Float> {
    final /* synthetic */ State<Function1<Float, Float>> $lambdaState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollableStateKt$rememberScrollableState$1$1(State<? extends Function1<? super Float, Float>> state) {
        super(1);
        this.$lambdaState = state;
    }

    public final Float invoke(float f) {
        return (Float) this.$lambdaState.getValue().invoke(Float.valueOf(f));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }
}
