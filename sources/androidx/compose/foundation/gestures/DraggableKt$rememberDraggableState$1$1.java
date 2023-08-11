package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Draggable.kt */
final class DraggableKt$rememberDraggableState$1$1 extends C12777p implements Function1<Float, C11921v> {
    final /* synthetic */ State<Function1<Float, C11921v>> $onDeltaState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DraggableKt$rememberDraggableState$1$1(State<? extends Function1<? super Float, C11921v>> state) {
        super(1);
        this.$onDeltaState = state;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return C11921v.f18618a;
    }

    public final void invoke(float f) {
        this.$onDeltaState.getValue().invoke(Float.valueOf(f));
    }
}
