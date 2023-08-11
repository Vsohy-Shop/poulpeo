package androidx.compose.runtime;

import java.util.Iterator;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p412pf.C13212a;

@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/DataIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3443:1\n1#2:3444\n*E\n"})
/* compiled from: SlotTable.kt */
final class DataIterator implements Iterable<Object>, Iterator<Object>, C13212a {
    private final int end;
    private final int group;
    private int index;
    private final int start;
    private final SlotTable table;

    public DataIterator(SlotTable slotTable, int i) {
        int i2;
        C12775o.m28639i(slotTable, "table");
        this.table = slotTable;
        this.group = i;
        int access$dataAnchor = SlotTableKt.dataAnchor(slotTable.getGroups(), i);
        this.start = access$dataAnchor;
        if (i + 1 < slotTable.getGroupsSize()) {
            i2 = SlotTableKt.dataAnchor(slotTable.getGroups(), i + 1);
        } else {
            i2 = slotTable.getSlotsSize();
        }
        this.end = i2;
        this.index = access$dataAnchor;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getGroup() {
        return this.group;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getStart() {
        return this.start;
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

    public Object next() {
        Object obj;
        int i = this.index;
        if (i < 0 || i >= this.table.getSlots().length) {
            obj = null;
        } else {
            obj = this.table.getSlots()[this.index];
        }
        this.index++;
        return obj;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public Iterator<Object> iterator() {
        return this;
    }
}
