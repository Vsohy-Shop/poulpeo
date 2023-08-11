package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

/* compiled from: DragInteraction.kt */
public interface DragInteraction extends Interaction {

    @StabilityInferred(parameters = 0)
    /* compiled from: DragInteraction.kt */
    public static final class Cancel implements DragInteraction {
        public static final int $stable = 0;
        private final Start start;

        public Cancel(Start start2) {
            C12775o.m28639i(start2, "start");
            this.start = start2;
        }

        public final Start getStart() {
            return this.start;
        }
    }

    @StabilityInferred(parameters = 0)
    /* compiled from: DragInteraction.kt */
    public static final class Start implements DragInteraction {
        public static final int $stable = 0;
    }

    @StabilityInferred(parameters = 0)
    /* compiled from: DragInteraction.kt */
    public static final class Stop implements DragInteraction {
        public static final int $stable = 0;
        private final Start start;

        public Stop(Start start2) {
            C12775o.m28639i(start2, "start");
            this.start = start2;
        }

        public final Start getStart() {
            return this.start;
        }
    }
}
