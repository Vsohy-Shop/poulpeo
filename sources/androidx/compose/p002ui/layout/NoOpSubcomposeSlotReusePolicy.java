package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.layout.SubcomposeSlotReusePolicy;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.layout.NoOpSubcomposeSlotReusePolicy */
/* compiled from: SubcomposeLayout.kt */
final class NoOpSubcomposeSlotReusePolicy implements SubcomposeSlotReusePolicy {
    public static final NoOpSubcomposeSlotReusePolicy INSTANCE = new NoOpSubcomposeSlotReusePolicy();

    private NoOpSubcomposeSlotReusePolicy() {
    }

    public boolean areCompatible(Object obj, Object obj2) {
        return false;
    }

    public void getSlotsToRetain(SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        C12775o.m28639i(slotIdsSet, "slotIds");
        slotIdsSet.clear();
    }
}
