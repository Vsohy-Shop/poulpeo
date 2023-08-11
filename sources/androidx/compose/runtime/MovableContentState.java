package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@InternalComposeApi
@StabilityInferred(parameters = 0)
/* compiled from: Composer.kt */
public final class MovableContentState {
    public static final int $stable = 8;
    private final SlotTable slotTable;

    public MovableContentState(SlotTable slotTable2) {
        C12775o.m28639i(slotTable2, "slotTable");
        this.slotTable = slotTable2;
    }

    public final SlotTable getSlotTable$runtime_release() {
        return this.slotTable;
    }
}
