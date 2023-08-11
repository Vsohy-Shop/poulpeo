package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.layout.SubcomposeSlotReusePolicy;
import java.util.Iterator;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.layout.FixedCountSubcomposeSlotReusePolicy */
/* compiled from: SubcomposeLayout.kt */
final class FixedCountSubcomposeSlotReusePolicy implements SubcomposeSlotReusePolicy {
    private final int maxSlotsToRetainForReuse;

    public FixedCountSubcomposeSlotReusePolicy(int i) {
        this.maxSlotsToRetainForReuse = i;
    }

    public boolean areCompatible(Object obj, Object obj2) {
        return true;
    }

    public void getSlotsToRetain(SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        C12775o.m28639i(slotIdsSet, "slotIds");
        if (slotIdsSet.size() > this.maxSlotsToRetainForReuse) {
            Iterator<Object> it = slotIdsSet.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                i++;
                if (i > this.maxSlotsToRetainForReuse) {
                    it.remove();
                }
            }
        }
    }
}
