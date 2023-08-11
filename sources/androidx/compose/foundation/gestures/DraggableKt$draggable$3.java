package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.PointerInputChange;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: Draggable.kt */
final class DraggableKt$draggable$3 extends C12777p implements Function1<PointerInputChange, Boolean> {
    public static final DraggableKt$draggable$3 INSTANCE = new DraggableKt$draggable$3();

    DraggableKt$draggable$3() {
        super(1);
    }

    public final Boolean invoke(PointerInputChange pointerInputChange) {
        C12775o.m28639i(pointerInputChange, "it");
        return Boolean.TRUE;
    }
}
