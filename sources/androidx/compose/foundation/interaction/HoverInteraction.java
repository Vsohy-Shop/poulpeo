package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

/* compiled from: HoverInteraction.kt */
public interface HoverInteraction extends Interaction {

    @StabilityInferred(parameters = 0)
    /* compiled from: HoverInteraction.kt */
    public static final class Enter implements HoverInteraction {
        public static final int $stable = 0;
    }

    @StabilityInferred(parameters = 0)
    /* compiled from: HoverInteraction.kt */
    public static final class Exit implements HoverInteraction {
        public static final int $stable = 0;
        private final Enter enter;

        public Exit(Enter enter2) {
            C12775o.m28639i(enter2, "enter");
            this.enter = enter2;
        }

        public final Enter getEnter() {
            return this.enter;
        }
    }
}
