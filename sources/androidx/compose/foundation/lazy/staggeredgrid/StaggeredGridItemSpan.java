package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
/* compiled from: LazyStaggeredGridSpan.kt */
public final class StaggeredGridItemSpan {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final StaggeredGridItemSpan FullLine = new StaggeredGridItemSpan(0);
    /* access modifiers changed from: private */
    public static final StaggeredGridItemSpan SingleLane = new StaggeredGridItemSpan(1);
    private final int value;

    /* compiled from: LazyStaggeredGridSpan.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StaggeredGridItemSpan getFullLine() {
            return StaggeredGridItemSpan.FullLine;
        }

        public final StaggeredGridItemSpan getSingleLane() {
            return StaggeredGridItemSpan.SingleLane;
        }
    }

    private StaggeredGridItemSpan(int i) {
        this.value = i;
    }

    public final int getValue$foundation_release() {
        return this.value;
    }
}
