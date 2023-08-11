package androidx.compose.runtime;

import kotlin.jvm.internal.C12775o;

/* compiled from: SlotTable.kt */
public final class Anchor {
    private int location;

    public Anchor(int i) {
        this.location = i;
    }

    public final int getLocation$runtime_release() {
        return this.location;
    }

    public final boolean getValid() {
        if (this.location != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final void setLocation$runtime_release(int i) {
        this.location = i;
    }

    public final int toIndexFor(SlotTable slotTable) {
        C12775o.m28639i(slotTable, "slots");
        return slotTable.anchorIndex(this);
    }

    public final int toIndexFor(SlotWriter slotWriter) {
        C12775o.m28639i(slotWriter, "writer");
        return slotWriter.anchorIndex(this);
    }
}
