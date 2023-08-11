package androidx.compose.p002ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.p002ui.input.pointer.PointerInteropFilter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$3 */
/* compiled from: PointerInteropFilter.android.kt */
final class PointerInteropFilter$pointerInputFilter$1$dispatchToView$3 extends C12777p implements Function1<MotionEvent, C11921v> {
    final /* synthetic */ PointerInteropFilter$pointerInputFilter$1 this$0;
    final /* synthetic */ PointerInteropFilter this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PointerInteropFilter$pointerInputFilter$1$dispatchToView$3(PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1, PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.this$0 = pointerInteropFilter$pointerInputFilter$1;
        this.this$1 = pointerInteropFilter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MotionEvent) obj);
        return C11921v.f18618a;
    }

    public final void invoke(MotionEvent motionEvent) {
        PointerInteropFilter.DispatchToViewState dispatchToViewState;
        C12775o.m28639i(motionEvent, "motionEvent");
        if (motionEvent.getActionMasked() == 0) {
            PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1 = this.this$0;
            if (this.this$1.getOnTouchEvent().invoke(motionEvent).booleanValue()) {
                dispatchToViewState = PointerInteropFilter.DispatchToViewState.Dispatching;
            } else {
                dispatchToViewState = PointerInteropFilter.DispatchToViewState.NotDispatching;
            }
            pointerInteropFilter$pointerInputFilter$1.state = dispatchToViewState;
            return;
        }
        this.this$1.getOnTouchEvent().invoke(motionEvent);
    }
}
