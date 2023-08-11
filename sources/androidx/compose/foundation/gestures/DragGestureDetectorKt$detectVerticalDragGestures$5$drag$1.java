package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.PointerInputChange;
import kotlin.jvm.internal.C12757e0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: DragGestureDetector.kt */
final class DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1 extends C12777p implements C13088o<PointerInputChange, Float, C11921v> {
    final /* synthetic */ C12757e0 $overSlop;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1(C12757e0 e0Var) {
        super(2);
        this.$overSlop = e0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PointerInputChange) obj, ((Number) obj2).floatValue());
        return C11921v.f18618a;
    }

    public final void invoke(PointerInputChange pointerInputChange, float f) {
        C12775o.m28639i(pointerInputChange, "change");
        pointerInputChange.consume();
        this.$overSlop.f20408b = f;
    }
}
