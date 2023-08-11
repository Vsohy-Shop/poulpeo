package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;

@ExperimentalFoundationApi
@Stable
/* compiled from: Pager.kt */
public interface PagerSnapDistance {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: Pager.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final PagerSnapDistance atMost(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new PagerSnapDistanceMaxPages(i);
            }
            throw new IllegalArgumentException(("pages should be greater than or equal to 0. You have used " + i + '.').toString());
        }
    }

    int calculateTargetPage(int i, int i2, float f, int i3, int i4);
}
