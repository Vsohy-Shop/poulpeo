package androidx.compose.foundation.text.selection;

/* compiled from: TextPreparedSelection.kt */
public final class TextPreparedSelectionState {
    private Float cachedX;

    public final Float getCachedX() {
        return this.cachedX;
    }

    public final void resetCachedX() {
        this.cachedX = null;
    }

    public final void setCachedX(Float f) {
        this.cachedX = f;
    }
}
