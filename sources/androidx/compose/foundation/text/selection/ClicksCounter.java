package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.PointerEvent;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.C12775o;

/* compiled from: TextSelectionMouseDetector.kt */
final class ClicksCounter {
    private int clicks;
    private PointerInputChange prevClick;
    private final ViewConfiguration viewConfiguration;

    public ClicksCounter(ViewConfiguration viewConfiguration2) {
        C12775o.m28639i(viewConfiguration2, "viewConfiguration");
        this.viewConfiguration = viewConfiguration2;
    }

    public final int getClicks() {
        return this.clicks;
    }

    public final PointerInputChange getPrevClick() {
        return this.prevClick;
    }

    public final boolean positionIsTolerable(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        C12775o.m28639i(pointerInputChange, "prevClick");
        C12775o.m28639i(pointerInputChange2, "newClick");
        if (((double) Offset.m35420getDistanceimpl(Offset.m35426minusMKHz9U(pointerInputChange2.m37169getPositionF1C5BW0(), pointerInputChange.m37169getPositionF1C5BW0()))) < 100.0d) {
            return true;
        }
        return false;
    }

    public final void setClicks(int i) {
        this.clicks = i;
    }

    public final void setPrevClick(PointerInputChange pointerInputChange) {
        this.prevClick = pointerInputChange;
    }

    public final boolean timeIsTolerable(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        C12775o.m28639i(pointerInputChange, "prevClick");
        C12775o.m28639i(pointerInputChange2, "newClick");
        if (pointerInputChange2.getUptimeMillis() - pointerInputChange.getUptimeMillis() < this.viewConfiguration.getDoubleTapTimeoutMillis()) {
            return true;
        }
        return false;
    }

    public final void update(PointerEvent pointerEvent) {
        C12775o.m28639i(pointerEvent, NotificationCompat.CATEGORY_EVENT);
        PointerInputChange pointerInputChange = this.prevClick;
        PointerInputChange pointerInputChange2 = pointerEvent.getChanges().get(0);
        if (pointerInputChange == null || !timeIsTolerable(pointerInputChange, pointerInputChange2) || !positionIsTolerable(pointerInputChange, pointerInputChange2)) {
            this.clicks = 1;
        } else {
            this.clicks++;
        }
        this.prevClick = pointerInputChange2;
    }
}
