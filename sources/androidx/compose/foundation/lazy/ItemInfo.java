package androidx.compose.foundation.lazy;

import androidx.compose.p002ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: LazyListItemPlacementAnimator.kt */
final class ItemInfo {
    private long notAnimatableDelta = IntOffset.Companion.m38596getZeronOccac();
    private final List<PlaceableInfo> placeables = new ArrayList();

    /* renamed from: getNotAnimatableDelta-nOcc-ac  reason: not valid java name */
    public final long m33403getNotAnimatableDeltanOccac() {
        return this.notAnimatableDelta;
    }

    public final List<PlaceableInfo> getPlaceables() {
        return this.placeables;
    }

    /* renamed from: setNotAnimatableDelta--gyyYBs  reason: not valid java name */
    public final void m33404setNotAnimatableDeltagyyYBs(long j) {
        this.notAnimatableDelta = j;
    }
}
