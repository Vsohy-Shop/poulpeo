package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.input.pointer.RequestDisallowInterceptTouchEvent */
/* compiled from: PointerInteropFilter.android.kt */
public final class RequestDisallowInterceptTouchEvent implements Function1<Boolean, C11921v> {
    public static final int $stable = 8;
    private PointerInteropFilter pointerInteropFilter;

    public final PointerInteropFilter getPointerInteropFilter$ui_release() {
        return this.pointerInteropFilter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C11921v.f18618a;
    }

    public final void setPointerInteropFilter$ui_release(PointerInteropFilter pointerInteropFilter2) {
        this.pointerInteropFilter = pointerInteropFilter2;
    }

    public void invoke(boolean z) {
        PointerInteropFilter pointerInteropFilter2 = this.pointerInteropFilter;
        if (pointerInteropFilter2 != null) {
            pointerInteropFilter2.setDisallowIntercept$ui_release(z);
        }
    }
}
