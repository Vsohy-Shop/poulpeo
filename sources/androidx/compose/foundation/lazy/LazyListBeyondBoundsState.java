package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.BeyondBoundsState;
import androidx.compose.p002ui.layout.Remeasurement;
import kotlin.jvm.internal.C12775o;

/* compiled from: LazyListBeyondBoundsModifier.kt */
public final class LazyListBeyondBoundsState implements BeyondBoundsState {
    private final LazyListState state;

    public LazyListBeyondBoundsState(LazyListState lazyListState) {
        C12775o.m28639i(lazyListState, "state");
        this.state = lazyListState;
    }

    public int getFirstVisibleIndex() {
        return this.state.getFirstVisibleItemIndex();
    }

    public boolean getHasVisibleItems() {
        return !this.state.getLayoutInfo().getVisibleItemsInfo().isEmpty();
    }

    public int getItemCount() {
        return this.state.getLayoutInfo().getTotalItemsCount();
    }

    public int getLastVisibleIndex() {
        return ((LazyListItemInfo) C12686e0.m28231j0(this.state.getLayoutInfo().getVisibleItemsInfo())).getIndex();
    }

    public final LazyListState getState() {
        return this.state;
    }

    public void remeasure() {
        Remeasurement remeasurement$foundation_release = this.state.getRemeasurement$foundation_release();
        if (remeasurement$foundation_release != null) {
            remeasurement$foundation_release.forceRemeasure();
        }
    }
}
