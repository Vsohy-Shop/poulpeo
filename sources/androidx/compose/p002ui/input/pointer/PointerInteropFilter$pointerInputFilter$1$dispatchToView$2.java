package androidx.compose.p002ui.input.pointer;

import android.view.MotionEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2 */
/* compiled from: PointerInteropFilter.android.kt */
final class PointerInteropFilter$pointerInputFilter$1$dispatchToView$2 extends C12777p implements Function1<MotionEvent, C11921v> {
    final /* synthetic */ PointerInteropFilter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PointerInteropFilter$pointerInputFilter$1$dispatchToView$2(PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.this$0 = pointerInteropFilter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MotionEvent) obj);
        return C11921v.f18618a;
    }

    public final void invoke(MotionEvent motionEvent) {
        C12775o.m28639i(motionEvent, "motionEvent");
        this.this$0.getOnTouchEvent().invoke(motionEvent);
    }
}
