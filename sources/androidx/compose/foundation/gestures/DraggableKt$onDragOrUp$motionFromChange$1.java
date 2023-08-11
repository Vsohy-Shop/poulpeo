package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.PointerEventKt;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: Draggable.kt */
final class DraggableKt$onDragOrUp$motionFromChange$1 extends C12777p implements Function1<PointerInputChange, Float> {
    public static final DraggableKt$onDragOrUp$motionFromChange$1 INSTANCE = new DraggableKt$onDragOrUp$motionFromChange$1();

    DraggableKt$onDragOrUp$motionFromChange$1() {
        super(1);
    }

    public final Float invoke(PointerInputChange pointerInputChange) {
        C12775o.m28639i(pointerInputChange, "it");
        return Float.valueOf(Offset.m35423getYimpl(PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange)));
    }
}
