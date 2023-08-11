package androidx.compose.p002ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.p002ui.viewinterop.AndroidViewHolder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$3 */
/* compiled from: PointerInteropFilter.android.kt */
final class PointerInteropFilter_androidKt$pointerInteropFilter$3 extends C12777p implements Function1<MotionEvent, Boolean> {
    final /* synthetic */ AndroidViewHolder $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PointerInteropFilter_androidKt$pointerInteropFilter$3(AndroidViewHolder androidViewHolder) {
        super(1);
        this.$view = androidViewHolder;
    }

    public final Boolean invoke(MotionEvent motionEvent) {
        boolean z;
        C12775o.m28639i(motionEvent, "motionEvent");
        switch (motionEvent.getActionMasked()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                z = this.$view.dispatchTouchEvent(motionEvent);
                break;
            default:
                z = this.$view.dispatchGenericMotionEvent(motionEvent);
                break;
        }
        return Boolean.valueOf(z);
    }
}
