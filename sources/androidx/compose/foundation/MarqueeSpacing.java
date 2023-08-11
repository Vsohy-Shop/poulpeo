package androidx.compose.foundation;

import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Stable;

@ExperimentalFoundationApi
@Stable
/* compiled from: BasicMarquee.kt */
public interface MarqueeSpacing {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: BasicMarquee.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @ExperimentalFoundationApi
        public final MarqueeSpacing fractionOfContainer(float f) {
            return new MarqueeSpacing$Companion$fractionOfContainer$1(f);
        }
    }

    @ExperimentalFoundationApi
    int calculateSpacing(Density density, int i, int i2);
}
