package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PressInteraction.kt */
public interface PressInteraction extends Interaction {

    @StabilityInferred(parameters = 0)
    /* compiled from: PressInteraction.kt */
    public static final class Cancel implements PressInteraction {
        public static final int $stable = 0;
        private final Press press;

        public Cancel(Press press2) {
            C12775o.m28639i(press2, "press");
            this.press = press2;
        }

        public final Press getPress() {
            return this.press;
        }
    }

    @StabilityInferred(parameters = 0)
    /* compiled from: PressInteraction.kt */
    public static final class Press implements PressInteraction {
        public static final int $stable = 0;
        private final long pressPosition;

        public /* synthetic */ Press(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* renamed from: getPressPosition-F1C5BW0  reason: not valid java name */
        public final long m33158getPressPositionF1C5BW0() {
            return this.pressPosition;
        }

        private Press(long j) {
            this.pressPosition = j;
        }
    }

    @StabilityInferred(parameters = 0)
    /* compiled from: PressInteraction.kt */
    public static final class Release implements PressInteraction {
        public static final int $stable = 0;
        private final Press press;

        public Release(Press press2) {
            C12775o.m28639i(press2, "press");
            this.press = press2;
        }

        public final Press getPress() {
            return this.press;
        }
    }
}
