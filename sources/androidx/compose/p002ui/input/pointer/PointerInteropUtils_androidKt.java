package androidx.compose.p002ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.p002ui.geometry.Offset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.input.pointer.PointerInteropUtils_androidKt */
/* compiled from: PointerInteropUtils.android.kt */
public final class PointerInteropUtils_androidKt {
    public static final void emptyCancelMotionEventScope(long j, Function1<? super MotionEvent, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        MotionEvent obtain = MotionEvent.obtain(j, j, 3, 0.0f, 0.0f, 0);
        obtain.setSource(0);
        C12775o.m28638h(obtain, "motionEvent");
        function1.invoke(obtain);
        obtain.recycle();
    }

    public static /* synthetic */ void emptyCancelMotionEventScope$default(long j, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            j = SystemClock.uptimeMillis();
        }
        emptyCancelMotionEventScope(j, function1);
    }

    /* renamed from: toCancelMotionEventScope-d-4ec7I  reason: not valid java name */
    public static final void m37228toCancelMotionEventScoped4ec7I(PointerEvent pointerEvent, long j, Function1<? super MotionEvent, C11921v> function1) {
        C12775o.m28639i(pointerEvent, "$this$toCancelMotionEventScope");
        C12775o.m28639i(function1, "block");
        m37230toMotionEventScopeubNVwUQ(pointerEvent, j, function1, true);
    }

    /* renamed from: toMotionEventScope-d-4ec7I  reason: not valid java name */
    public static final void m37229toMotionEventScoped4ec7I(PointerEvent pointerEvent, long j, Function1<? super MotionEvent, C11921v> function1) {
        C12775o.m28639i(pointerEvent, "$this$toMotionEventScope");
        C12775o.m28639i(function1, "block");
        m37230toMotionEventScopeubNVwUQ(pointerEvent, j, function1, false);
    }

    /* renamed from: toMotionEventScope-ubNVwUQ  reason: not valid java name */
    private static final void m37230toMotionEventScopeubNVwUQ(PointerEvent pointerEvent, long j, Function1<? super MotionEvent, C11921v> function1, boolean z) {
        MotionEvent motionEvent$ui_release = pointerEvent.getMotionEvent$ui_release();
        if (motionEvent$ui_release != null) {
            int action = motionEvent$ui_release.getAction();
            if (z) {
                motionEvent$ui_release.setAction(3);
            }
            motionEvent$ui_release.offsetLocation(-Offset.m35422getXimpl(j), -Offset.m35423getYimpl(j));
            function1.invoke(motionEvent$ui_release);
            motionEvent$ui_release.offsetLocation(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j));
            motionEvent$ui_release.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
    }
}
