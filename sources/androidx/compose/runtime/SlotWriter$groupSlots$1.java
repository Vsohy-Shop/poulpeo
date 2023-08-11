package androidx.compose.runtime;

import java.util.Iterator;
import p412pf.C13212a;

/* compiled from: SlotTable.kt */
public final class SlotWriter$groupSlots$1 implements Iterator<Object>, C13212a {
    final /* synthetic */ int $end;
    private int current;
    final /* synthetic */ SlotWriter this$0;

    SlotWriter$groupSlots$1(int i, int i2, SlotWriter slotWriter) {
        this.$end = i2;
        this.this$0 = slotWriter;
        this.current = i;
    }

    public final int getCurrent() {
        return this.current;
    }

    public boolean hasNext() {
        if (this.current < this.$end) {
            return true;
        }
        return false;
    }

    public Object next() {
        if (!hasNext()) {
            return null;
        }
        Object[] access$getSlots$p = this.this$0.slots;
        SlotWriter slotWriter = this.this$0;
        int i = this.current;
        this.current = i + 1;
        return access$getSlots$p[slotWriter.dataIndexToDataAddress(i)];
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setCurrent(int i) {
        this.current = i;
    }
}
