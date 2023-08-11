package androidx.compose.p002ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.input.pointer.PointerInputEvent */
/* compiled from: PointerInputEvent.android.kt */
public final class PointerInputEvent {
    private final MotionEvent motionEvent;
    private final List<PointerInputEventData> pointers;
    private final long uptime;

    public PointerInputEvent(long j, List<PointerInputEventData> list, MotionEvent motionEvent2) {
        C12775o.m28639i(list, "pointers");
        C12775o.m28639i(motionEvent2, "motionEvent");
        this.uptime = j;
        this.pointers = list;
        this.motionEvent = motionEvent2;
    }

    public final MotionEvent getMotionEvent() {
        return this.motionEvent;
    }

    public final List<PointerInputEventData> getPointers() {
        return this.pointers;
    }

    public final long getUptime() {
        return this.uptime;
    }
}
