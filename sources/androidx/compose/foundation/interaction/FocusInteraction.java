package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

/* compiled from: FocusInteraction.kt */
public interface FocusInteraction extends Interaction {

    @StabilityInferred(parameters = 0)
    /* compiled from: FocusInteraction.kt */
    public static final class Focus implements FocusInteraction {
        public static final int $stable = 0;
    }

    @StabilityInferred(parameters = 0)
    /* compiled from: FocusInteraction.kt */
    public static final class Unfocus implements FocusInteraction {
        public static final int $stable = 0;
        private final Focus focus;

        public Unfocus(Focus focus2) {
            C12775o.m28639i(focus2, "focus");
            this.focus = focus2;
        }

        public final Focus getFocus() {
            return this.focus;
        }
    }
}
