package androidx.compose.foundation.lazy.layout;

/* compiled from: BeyondBoundsState.kt */
public interface BeyondBoundsState {
    int getFirstVisibleIndex();

    boolean getHasVisibleItems();

    int getItemCount();

    int getLastVisibleIndex();

    void remeasure();
}
