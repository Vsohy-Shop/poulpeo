package androidx.compose.foundation.lazy.grid;

import androidx.compose.p002ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: LazyGridItemPlacementAnimator.kt */
final class ItemInfo {
    private int crossAxisOffset;
    private int crossAxisSize;
    private long notAnimatableDelta = IntOffset.Companion.m38596getZeronOccac();
    private final List<PlaceableInfo> placeables = new ArrayList();

    public ItemInfo(int i, int i2) {
        this.crossAxisSize = i;
        this.crossAxisOffset = i2;
    }

    public final int getCrossAxisOffset() {
        return this.crossAxisOffset;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* renamed from: getNotAnimatableDelta-nOcc-ac  reason: not valid java name */
    public final long m33453getNotAnimatableDeltanOccac() {
        return this.notAnimatableDelta;
    }

    public final List<PlaceableInfo> getPlaceables() {
        return this.placeables;
    }

    public final void setCrossAxisOffset(int i) {
        this.crossAxisOffset = i;
    }

    public final void setCrossAxisSize(int i) {
        this.crossAxisSize = i;
    }

    /* renamed from: setNotAnimatableDelta--gyyYBs  reason: not valid java name */
    public final void m33454setNotAnimatableDeltagyyYBs(long j) {
        this.notAnimatableDelta = j;
    }
}
