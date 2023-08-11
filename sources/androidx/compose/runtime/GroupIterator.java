package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.C12775o;
import p412pf.C13212a;

/* compiled from: SlotTable.kt */
final class GroupIterator implements Iterator<CompositionGroup>, C13212a {
    private final int end;
    private int index;
    private final SlotTable table;
    private final int version;

    public GroupIterator(SlotTable slotTable, int i, int i2) {
        C12775o.m28639i(slotTable, "table");
        this.table = slotTable;
        this.end = i2;
        this.index = i;
        this.version = slotTable.getVersion$runtime_release();
        if (slotTable.getWriter$runtime_release()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void validateRead() {
        if (this.table.getVersion$runtime_release() != this.version) {
            throw new ConcurrentModificationException();
        }
    }

    public final int getEnd() {
        return this.end;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    public boolean hasNext() {
        if (this.index < this.end) {
            return true;
        }
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public CompositionGroup next() {
        validateRead();
        int i = this.index;
        this.index = SlotTableKt.groupSize(this.table.getGroups(), i) + i;
        return new SlotTableGroup(this.table, i, this.version);
    }
}
