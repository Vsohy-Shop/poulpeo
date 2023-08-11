package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p412pf.C13212a;

@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,3443:1\n146#2,8:3444\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n*L\n3016#1:3444,8\n*E\n"})
/* compiled from: SlotTable.kt */
final class SlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, C13212a {
    private final int group;
    private final SlotTable table;
    private final int version;

    public SlotTableGroup(SlotTable slotTable, int i, int i2) {
        C12775o.m28639i(slotTable, "table");
        this.table = slotTable;
        this.group = i;
        this.version = i2;
    }

    private final void validateRead() {
        if (this.table.getVersion$runtime_release() != this.version) {
            throw new ConcurrentModificationException();
        }
    }

    public CompositionGroup find(Object obj) {
        Anchor anchor;
        int anchorIndex;
        int i;
        C12775o.m28639i(obj, "identityToFind");
        if (obj instanceof Anchor) {
            anchor = (Anchor) obj;
        } else {
            anchor = null;
        }
        if (anchor == null || !this.table.ownsAnchor(anchor) || (anchorIndex = this.table.anchorIndex(anchor)) < (i = this.group) || anchorIndex - i >= SlotTableKt.groupSize(this.table.getGroups(), this.group)) {
            return null;
        }
        return new SlotTableGroup(this.table, anchorIndex, this.version);
    }

    public Iterable<Object> getData() {
        return new DataIterator(this.table, this.group);
    }

    public final int getGroup() {
        return this.group;
    }

    public int getGroupSize() {
        return SlotTableKt.groupSize(this.table.getGroups(), this.group);
    }

    public Object getIdentity() {
        validateRead();
        SlotReader openReader = this.table.openReader();
        try {
            return openReader.anchor(this.group);
        } finally {
            openReader.close();
        }
    }

    public Object getKey() {
        if (!SlotTableKt.hasObjectKey(this.table.getGroups(), this.group)) {
            return Integer.valueOf(SlotTableKt.key(this.table.getGroups(), this.group));
        }
        Object obj = this.table.getSlots()[SlotTableKt.objectKeyIndex(this.table.getGroups(), this.group)];
        C12775o.m28636f(obj);
        return obj;
    }

    public Object getNode() {
        if (SlotTableKt.isNode(this.table.getGroups(), this.group)) {
            return this.table.getSlots()[SlotTableKt.nodeIndex(this.table.getGroups(), this.group)];
        }
        return null;
    }

    public int getSlotsSize() {
        int i;
        int groupSize = this.group + getGroupSize();
        if (groupSize < this.table.getGroupsSize()) {
            i = SlotTableKt.dataAnchor(this.table.getGroups(), groupSize);
        } else {
            i = this.table.getSlotsSize();
        }
        return i - SlotTableKt.dataAnchor(this.table.getGroups(), this.group);
    }

    public String getSourceInfo() {
        if (!SlotTableKt.hasAux(this.table.getGroups(), this.group)) {
            return null;
        }
        Object obj = this.table.getSlots()[SlotTableKt.auxIndex(this.table.getGroups(), this.group)];
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    public final int getVersion() {
        return this.version;
    }

    public boolean isEmpty() {
        if (SlotTableKt.groupSize(this.table.getGroups(), this.group) == 0) {
            return true;
        }
        return false;
    }

    public Iterator<CompositionGroup> iterator() {
        validateRead();
        SlotTable slotTable = this.table;
        int i = this.group;
        return new GroupIterator(slotTable, i + 1, i + SlotTableKt.groupSize(slotTable.getGroups(), this.group));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SlotTableGroup(SlotTable slotTable, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(slotTable, i, (i3 & 4) != 0 ? slotTable.getVersion$runtime_release() : i2);
    }

    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }
}
