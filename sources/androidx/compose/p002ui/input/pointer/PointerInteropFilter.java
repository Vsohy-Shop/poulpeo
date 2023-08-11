package androidx.compose.p002ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.p002ui.ExperimentalComposeUiApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter */
/* compiled from: PointerInteropFilter.android.kt */
public final class PointerInteropFilter implements PointerInputModifier {
    private boolean disallowIntercept;
    public Function1<? super MotionEvent, Boolean> onTouchEvent;
    private final PointerInputFilter pointerInputFilter = new PointerInteropFilter$pointerInputFilter$1(this);
    private RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent;

    /* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState */
    /* compiled from: PointerInteropFilter.android.kt */
    private enum DispatchToViewState {
        Unknown,
        Dispatching,
        NotDispatching
    }

    public final boolean getDisallowIntercept$ui_release() {
        return this.disallowIntercept;
    }

    public final Function1<MotionEvent, Boolean> getOnTouchEvent() {
        Function1<? super MotionEvent, Boolean> function1 = this.onTouchEvent;
        if (function1 != null) {
            return function1;
        }
        C12775o.m28656z("onTouchEvent");
        return null;
    }

    public PointerInputFilter getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    public final RequestDisallowInterceptTouchEvent getRequestDisallowInterceptTouchEvent() {
        return this.requestDisallowInterceptTouchEvent;
    }

    public final void setDisallowIntercept$ui_release(boolean z) {
        this.disallowIntercept = z;
    }

    public final void setOnTouchEvent(Function1<? super MotionEvent, Boolean> function1) {
        C12775o.m28639i(function1, "<set-?>");
        this.onTouchEvent = function1;
    }

    public final void setRequestDisallowInterceptTouchEvent(RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent2) {
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent3 = this.requestDisallowInterceptTouchEvent;
        if (requestDisallowInterceptTouchEvent3 != null) {
            requestDisallowInterceptTouchEvent3.setPointerInteropFilter$ui_release((PointerInteropFilter) null);
        }
        this.requestDisallowInterceptTouchEvent = requestDisallowInterceptTouchEvent2;
        if (requestDisallowInterceptTouchEvent2 != null) {
            requestDisallowInterceptTouchEvent2.setPointerInteropFilter$ui_release(this);
        }
    }
}
