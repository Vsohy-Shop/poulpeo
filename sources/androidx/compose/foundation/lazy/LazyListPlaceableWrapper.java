package androidx.compose.foundation.lazy;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LazyMeasuredItem.kt */
public final class LazyListPlaceableWrapper {
    private final long offset;
    private final Placeable placeable;

    public /* synthetic */ LazyListPlaceableWrapper(long j, Placeable placeable2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, placeable2);
    }

    /* renamed from: getOffset-nOcc-ac  reason: not valid java name */
    public final long m33416getOffsetnOccac() {
        return this.offset;
    }

    public final Placeable getPlaceable() {
        return this.placeable;
    }

    private LazyListPlaceableWrapper(long j, Placeable placeable2) {
        this.offset = j;
        this.placeable = placeable2;
    }
}
