package androidx.compose.p002ui.input.pointer;

import android.view.MotionEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.geometry.OffsetKt;
import kotlin.jvm.internal.C12775o;

@RequiresApi(29)
/* renamed from: androidx.compose.ui.input.pointer.MotionEventHelper */
/* compiled from: MotionEventAdapter.android.kt */
final class MotionEventHelper {
    public static final MotionEventHelper INSTANCE = new MotionEventHelper();

    private MotionEventHelper() {
    }

    @DoNotInline
    /* renamed from: toRawOffset-dBAh8RU  reason: not valid java name */
    public final long m37103toRawOffsetdBAh8RU(MotionEvent motionEvent, int i) {
        C12775o.m28639i(motionEvent, "motionEvent");
        return OffsetKt.Offset(motionEvent.getRawX(i), motionEvent.getRawY(i));
    }
}
