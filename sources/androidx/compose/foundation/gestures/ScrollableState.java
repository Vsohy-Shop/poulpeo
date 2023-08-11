package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

/* compiled from: ScrollableState.kt */
public interface ScrollableState {

    /* compiled from: ScrollableState.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean getCanScrollBackward(ScrollableState scrollableState) {
            return ScrollableState.super.getCanScrollBackward();
        }

        @Deprecated
        public static boolean getCanScrollForward(ScrollableState scrollableState) {
            return ScrollableState.super.getCanScrollForward();
        }
    }

    static /* synthetic */ Object scroll$default(ScrollableState scrollableState, MutatePriority mutatePriority, C13088o oVar, C12074d dVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return scrollableState.scroll(mutatePriority, oVar, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
    }

    float dispatchRawDelta(float f);

    boolean getCanScrollBackward() {
        return true;
    }

    boolean getCanScrollForward() {
        return true;
    }

    boolean isScrollInProgress();

    Object scroll(MutatePriority mutatePriority, C13088o<? super ScrollScope, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super C11921v> dVar);
}
