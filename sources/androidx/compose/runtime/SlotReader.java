package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n1#1,3443:1\n1#2:3444\n4513#3,5:3445\n4513#3,5:3450\n4513#3,5:3455\n4513#3,5:3460\n4513#3,5:3465\n3323#4,6:3470\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n*L\n949#1:3445,5\n959#1:3450,5\n967#1:3455,5\n986#1:3460,5\n1000#1:3465,5\n1051#1:3470,6\n*E\n"})
/* compiled from: SlotTable.kt */
public final class SlotReader {
    private boolean closed;
    private int currentEnd;
    private int currentGroup;
    private int currentSlot;
    private int currentSlotEnd;
    private int emptyCount;
    private final int[] groups;
    private final int groupsSize;
    private int parent = -1;
    private final Object[] slots;
    private final int slotsSize;
    private final SlotTable table;

    public SlotReader(SlotTable slotTable) {
        C12775o.m28639i(slotTable, "table");
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        int groupsSize2 = slotTable.getGroupsSize();
        this.groupsSize = groupsSize2;
        this.slots = slotTable.getSlots();
        this.slotsSize = slotTable.getSlotsSize();
        this.currentEnd = groupsSize2;
    }

    public static /* synthetic */ Anchor anchor$default(SlotReader slotReader, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotReader.currentGroup;
        }
        return slotReader.anchor(i);
    }

    private final Object aux(int[] iArr, int i) {
        if (SlotTableKt.hasAux(iArr, i)) {
            return this.slots[SlotTableKt.auxIndex(iArr, i)];
        }
        return Composer.Companion.getEmpty();
    }

    private final Object objectKey(int[] iArr, int i) {
        if (SlotTableKt.hasObjectKey(iArr, i)) {
            return this.slots[SlotTableKt.objectKeyIndex(iArr, i)];
        }
        return null;
    }

    public final Anchor anchor(int i) {
        ArrayList<Anchor> anchors$runtime_release = this.table.getAnchors$runtime_release();
        int access$search = SlotTableKt.search(anchors$runtime_release, i, this.groupsSize);
        if (access$search < 0) {
            Anchor anchor = new Anchor(i);
            anchors$runtime_release.add(-(access$search + 1), anchor);
            return anchor;
        }
        Anchor anchor2 = anchors$runtime_release.get(access$search);
        C12775o.m28638h(anchor2, "get(location)");
        return anchor2;
    }

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final void close() {
        this.closed = true;
        this.table.close$runtime_release(this);
    }

    public final boolean containsMark(int i) {
        return SlotTableKt.containsMark(this.groups, i);
    }

    public final void endEmpty() {
        boolean z;
        int i = this.emptyCount;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.emptyCount = i - 1;
            return;
        }
        throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
    }

    public final void endGroup() {
        boolean z;
        int i;
        if (this.emptyCount == 0) {
            if (this.currentGroup == this.currentEnd) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int access$parentAnchor = SlotTableKt.parentAnchor(this.groups, this.parent);
                this.parent = access$parentAnchor;
                if (access$parentAnchor < 0) {
                    i = this.groupsSize;
                } else {
                    i = access$parentAnchor + SlotTableKt.groupSize(this.groups, access$parentAnchor);
                }
                this.currentEnd = i;
                return;
            }
            ComposerKt.composeRuntimeError("endGroup() not called at the end of a group".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final List<KeyInfo> extractKeys() {
        int i;
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount > 0) {
            return arrayList;
        }
        int i2 = this.currentGroup;
        int i3 = 0;
        while (i2 < this.currentEnd) {
            int access$key = SlotTableKt.key(this.groups, i2);
            Object objectKey = objectKey(this.groups, i2);
            if (SlotTableKt.isNode(this.groups, i2)) {
                i = 1;
            } else {
                i = SlotTableKt.nodeCount(this.groups, i2);
            }
            arrayList.add(new KeyInfo(access$key, objectKey, i2, i, i3));
            i2 += SlotTableKt.groupSize(this.groups, i2);
            i3++;
        }
        return arrayList;
    }

    public final void forEachData$runtime_release(int i, C13088o<? super Integer, Object, C11921v> oVar) {
        int i2;
        C12775o.m28639i(oVar, "block");
        int access$slotAnchor = SlotTableKt.slotAnchor(this.groups, i);
        int i3 = i + 1;
        if (i3 < this.table.getGroupsSize()) {
            i2 = SlotTableKt.dataAnchor(this.table.getGroups(), i3);
        } else {
            i2 = this.table.getSlotsSize();
        }
        for (int i4 = access$slotAnchor; i4 < i2; i4++) {
            oVar.invoke(Integer.valueOf(i4 - access$slotAnchor), this.slots[i4]);
        }
    }

    public final Object get(int i) {
        int i2 = this.currentSlot + i;
        if (i2 < this.currentSlotEnd) {
            return this.slots[i2];
        }
        return Composer.Companion.getEmpty();
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentEnd() {
        return this.currentEnd;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final Object getGroupAux() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return aux(this.groups, i);
        }
        return 0;
    }

    public final int getGroupEnd() {
        return this.currentEnd;
    }

    public final int getGroupKey() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return SlotTableKt.key(this.groups, i);
        }
        return 0;
    }

    public final Object getGroupNode() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return node(this.groups, i);
        }
        return null;
    }

    public final Object getGroupObjectKey() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return objectKey(this.groups, i);
        }
        return null;
    }

    public final int getGroupSize() {
        return SlotTableKt.groupSize(this.groups, this.currentGroup);
    }

    public final int getGroupSlotCount() {
        int i;
        int i2 = this.currentGroup;
        int access$slotAnchor = SlotTableKt.slotAnchor(this.groups, i2);
        int i3 = i2 + 1;
        if (i3 < this.groupsSize) {
            i = SlotTableKt.dataAnchor(this.groups, i3);
        } else {
            i = this.slotsSize;
        }
        return i - access$slotAnchor;
    }

    public final int getGroupSlotIndex() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    public final boolean getInEmpty() {
        if (this.emptyCount > 0) {
            return true;
        }
        return false;
    }

    public final int getNodeCount() {
        return SlotTableKt.nodeCount(this.groups, this.currentGroup);
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getParentNodes() {
        int i = this.parent;
        if (i >= 0) {
            return SlotTableKt.nodeCount(this.groups, i);
        }
        return 0;
    }

    public final int getSize() {
        return this.groupsSize;
    }

    public final int getSlot() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    public final Object groupAux(int i) {
        return aux(this.groups, i);
    }

    public final int groupEnd(int i) {
        return i + SlotTableKt.groupSize(this.groups, i);
    }

    public final Object groupGet(int i) {
        return groupGet(this.currentGroup, i);
    }

    public final int groupKey(int i) {
        return SlotTableKt.key(this.groups, i);
    }

    public final Object groupObjectKey(int i) {
        return objectKey(this.groups, i);
    }

    public final int groupSize(int i) {
        return SlotTableKt.groupSize(this.groups, i);
    }

    public final boolean hasMark(int i) {
        return SlotTableKt.hasMark(this.groups, i);
    }

    public final boolean hasObjectKey(int i) {
        return SlotTableKt.hasObjectKey(this.groups, i);
    }

    public final boolean isGroupEnd() {
        if (getInEmpty() || this.currentGroup == this.currentEnd) {
            return true;
        }
        return false;
    }

    public final boolean isNode() {
        return SlotTableKt.isNode(this.groups, this.currentGroup);
    }

    public final Object next() {
        int i;
        if (this.emptyCount > 0 || (i = this.currentSlot) >= this.currentSlotEnd) {
            return Composer.Companion.getEmpty();
        }
        Object[] objArr = this.slots;
        this.currentSlot = i + 1;
        return objArr[i];
    }

    public final Object node(int i) {
        if (SlotTableKt.isNode(this.groups, i)) {
            return node(this.groups, i);
        }
        return null;
    }

    public final int nodeCount(int i) {
        return SlotTableKt.nodeCount(this.groups, i);
    }

    public final int parent(int i) {
        return SlotTableKt.parentAnchor(this.groups, i);
    }

    public final int parentOf(int i) {
        boolean z;
        if (i < 0 || i >= this.groupsSize) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return SlotTableKt.parentAnchor(this.groups, i);
        }
        throw new IllegalArgumentException(("Invalid group index " + i).toString());
    }

    public final void reposition(int i) {
        boolean z;
        int i2;
        if (this.emptyCount == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.currentGroup = i;
            if (i < this.groupsSize) {
                i2 = SlotTableKt.parentAnchor(this.groups, i);
            } else {
                i2 = -1;
            }
            this.parent = i2;
            if (i2 < 0) {
                this.currentEnd = this.groupsSize;
            } else {
                this.currentEnd = i2 + SlotTableKt.groupSize(this.groups, i2);
            }
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            return;
        }
        ComposerKt.composeRuntimeError("Cannot reposition while in an empty region".toString());
        throw new KotlinNothingValueException();
    }

    public final void restoreParent(int i) {
        boolean z;
        int access$groupSize = SlotTableKt.groupSize(this.groups, i) + i;
        int i2 = this.currentGroup;
        if (i2 < i || i2 > access$groupSize) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.parent = i;
            this.currentEnd = access$groupSize;
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            return;
        }
        ComposerKt.composeRuntimeError(("Index " + i + " is not a parent of " + i2).toString());
        throw new KotlinNothingValueException();
    }

    public final int skipGroup() {
        boolean z;
        int i = 1;
        if (this.emptyCount == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!SlotTableKt.isNode(this.groups, this.currentGroup)) {
                i = SlotTableKt.nodeCount(this.groups, this.currentGroup);
            }
            int i2 = this.currentGroup;
            this.currentGroup = i2 + SlotTableKt.groupSize(this.groups, i2);
            return i;
        }
        ComposerKt.composeRuntimeError("Cannot skip while in an empty region".toString());
        throw new KotlinNothingValueException();
    }

    public final void skipToGroupEnd() {
        boolean z;
        if (this.emptyCount == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.currentGroup = this.currentEnd;
        } else {
            ComposerKt.composeRuntimeError("Cannot skip the enclosing group while in an empty region".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void startGroup() {
        boolean z;
        int i;
        if (this.emptyCount <= 0) {
            if (SlotTableKt.parentAnchor(this.groups, this.currentGroup) == this.parent) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i2 = this.currentGroup;
                this.parent = i2;
                this.currentEnd = i2 + SlotTableKt.groupSize(this.groups, i2);
                int i3 = this.currentGroup;
                int i4 = i3 + 1;
                this.currentGroup = i4;
                this.currentSlot = SlotTableKt.slotAnchor(this.groups, i3);
                if (i3 >= this.groupsSize - 1) {
                    i = this.slotsSize;
                } else {
                    i = SlotTableKt.dataAnchor(this.groups, i4);
                }
                this.currentSlotEnd = i;
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    public final void startNode() {
        if (this.emptyCount > 0) {
            return;
        }
        if (SlotTableKt.isNode(this.groups, this.currentGroup)) {
            startGroup();
            return;
        }
        throw new IllegalArgumentException("Expected a node group".toString());
    }

    public String toString() {
        return "SlotReader(current=" + this.currentGroup + ", key=" + getGroupKey() + ", parent=" + this.parent + ", end=" + this.currentEnd + ')';
    }

    private final Object node(int[] iArr, int i) {
        if (SlotTableKt.isNode(iArr, i)) {
            return this.slots[SlotTableKt.nodeIndex(iArr, i)];
        }
        return Composer.Companion.getEmpty();
    }

    public final Object groupGet(int i, int i2) {
        int access$slotAnchor = SlotTableKt.slotAnchor(this.groups, i);
        int i3 = i + 1;
        int i4 = access$slotAnchor + i2;
        return i4 < (i3 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i3) : this.slotsSize) ? this.slots[i4] : Composer.Companion.getEmpty();
    }

    public final int groupKey(Anchor anchor) {
        C12775o.m28639i(anchor, "anchor");
        if (anchor.getValid()) {
            return SlotTableKt.key(this.groups, this.table.anchorIndex(anchor));
        }
        return 0;
    }

    public final boolean isNode(int i) {
        return SlotTableKt.isNode(this.groups, i);
    }
}
