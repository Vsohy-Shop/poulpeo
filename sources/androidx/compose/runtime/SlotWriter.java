package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 6 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3443:1\n4513#2,5:3444\n4513#2,5:3449\n4513#2,5:3454\n4513#2,5:3459\n4513#2,5:3465\n4513#2,5:3470\n4513#2,5:3475\n4513#2,5:3480\n4513#2,5:3485\n4513#2,5:3490\n4513#2,5:3495\n4513#2,5:3500\n4513#2,5:3505\n4513#2,5:3510\n4513#2,5:3515\n4513#2,5:3520\n4513#2,5:3525\n4513#2,5:3530\n4513#2,5:3543\n4513#2,5:3562\n4513#2,5:3567\n4513#2,5:3572\n1#3:3464\n162#4,8:3535\n162#4,8:3548\n3323#5,6:3556\n33#6,6:3577\n82#6,3:3583\n33#6,4:3586\n85#6,2:3590\n38#6:3592\n87#6:3593\n231#6,3:3594\n64#6,4:3597\n234#6,2:3601\n69#6:3603\n236#6:3604\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1346#1:3444,5\n1370#1:3449,5\n1383#1:3454,5\n1386#1:3459,5\n1426#1:3465,5\n1441#1:3470,5\n1488#1:3475,5\n1493#1:3480,5\n1533#1:3485,5\n1544#1:3490,5\n1671#1:3495,5\n1747#1:3500,5\n1752#1:3505,5\n1784#1:3510,5\n1827#1:3515,5\n1828#1:3520,5\n1841#1:3525,5\n1935#1:3530,5\n2210#1:3543,5\n2500#1:3562,5\n2512#1:3567,5\n2703#1:3572,5\n2193#1:3535,8\n2282#1:3548,8\n2302#1:3556,6\n2799#1:3577,6\n2969#1:3583,3\n2969#1:3586,4\n2969#1:3590,2\n2969#1:3592\n2969#1:3593\n2972#1:3594,3\n2972#1:3597,4\n2972#1:3601,2\n2972#1:3603\n2972#1:3604\n*E\n"})
/* compiled from: SlotTable.kt */
public final class SlotWriter {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public ArrayList<Anchor> anchors;
    private boolean closed;
    /* access modifiers changed from: private */
    public int currentGroup;
    private int currentGroupEnd;
    /* access modifiers changed from: private */
    public int currentSlot;
    private int currentSlotEnd;
    private final IntStack endStack = new IntStack();
    private int groupGapLen;
    /* access modifiers changed from: private */
    public int groupGapStart;
    /* access modifiers changed from: private */
    public int[] groups;
    private int insertCount;
    /* access modifiers changed from: private */
    public int nodeCount;
    private final IntStack nodeCountStack = new IntStack();
    private int parent = -1;
    private PrioritySet pendingRecalculateMarks;
    /* access modifiers changed from: private */
    public Object[] slots;
    /* access modifiers changed from: private */
    public int slotsGapLen;
    /* access modifiers changed from: private */
    public int slotsGapOwner;
    /* access modifiers changed from: private */
    public int slotsGapStart;
    private final IntStack startStack = new IntStack();
    private final SlotTable table;

    @SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3443:1\n1#2:3444\n4513#3,5:3445\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n*L\n2089#1:3445,5\n*E\n"})
    /* compiled from: SlotTable.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final List<Anchor> moveGroup(SlotWriter slotWriter, int i, SlotWriter slotWriter2, boolean z, boolean z2) {
            int i2;
            ArrayList arrayList;
            boolean z3;
            int i3;
            SlotWriter slotWriter3 = slotWriter;
            int i4 = i;
            SlotWriter slotWriter4 = slotWriter2;
            int groupSize = slotWriter.groupSize(i);
            int i5 = i4 + groupSize;
            int access$dataIndex = slotWriter.dataIndex(i);
            int access$dataIndex2 = slotWriter3.dataIndex(i5);
            int i6 = access$dataIndex2 - access$dataIndex;
            boolean access$containsAnyGroupMarks = slotWriter.containsAnyGroupMarks(i);
            slotWriter4.insertGroups(groupSize);
            slotWriter4.insertSlots(i6, slotWriter2.getCurrentGroup());
            if (slotWriter.groupGapStart < i5) {
                slotWriter3.moveGroupGapTo(i5);
            }
            if (slotWriter.slotsGapStart < access$dataIndex2) {
                slotWriter3.moveSlotGapTo(access$dataIndex2, i5);
            }
            int[] access$getGroups$p = slotWriter2.groups;
            int currentGroup = slotWriter2.getCurrentGroup();
            int[] unused = C12708o.m28340g(slotWriter.groups, access$getGroups$p, currentGroup * 5, i4 * 5, i5 * 5);
            Object[] access$getSlots$p = slotWriter2.slots;
            int access$getCurrentSlot$p = slotWriter2.currentSlot;
            Object[] unused2 = C12708o.m28342i(slotWriter.slots, access$getSlots$p, access$getCurrentSlot$p, access$dataIndex, access$dataIndex2);
            int parent = slotWriter2.getParent();
            SlotTableKt.updateParentAnchor(access$getGroups$p, currentGroup, parent);
            int i7 = currentGroup - i4;
            int i8 = currentGroup + groupSize;
            int access$dataIndex3 = access$getCurrentSlot$p - slotWriter4.dataIndex(access$getGroups$p, currentGroup);
            int access$getSlotsGapOwner$p = slotWriter2.slotsGapOwner;
            int i9 = parent;
            int access$getSlotsGapLen$p = slotWriter2.slotsGapLen;
            int length = access$getSlots$p.length;
            boolean z4 = access$containsAnyGroupMarks;
            int i10 = access$getSlotsGapOwner$p;
            int i11 = access$getCurrentSlot$p;
            int i12 = currentGroup;
            while (true) {
                i2 = 0;
                if (i12 >= i8) {
                    break;
                }
                if (i12 != currentGroup) {
                    i3 = i8;
                    SlotTableKt.updateParentAnchor(access$getGroups$p, i12, SlotTableKt.parentAnchor(access$getGroups$p, i12) + i7);
                } else {
                    i3 = i8;
                }
                int access$dataIndex4 = slotWriter4.dataIndex(access$getGroups$p, i12) + access$dataIndex3;
                if (i10 >= i12) {
                    i2 = slotWriter2.slotsGapStart;
                }
                int i13 = access$dataIndex3;
                SlotTableKt.updateDataAnchor(access$getGroups$p, i12, slotWriter4.dataIndexToDataAnchor(access$dataIndex4, i2, access$getSlotsGapLen$p, length));
                if (i12 == i10) {
                    i10++;
                }
                i12++;
                access$dataIndex3 = i13;
                i8 = i3;
            }
            int i14 = i8;
            slotWriter4.slotsGapOwner = i10;
            int access$locationOf = SlotTableKt.locationOf(slotWriter.anchors, i4, slotWriter.getSize$runtime_release());
            int access$locationOf2 = SlotTableKt.locationOf(slotWriter.anchors, i5, slotWriter.getSize$runtime_release());
            if (access$locationOf < access$locationOf2) {
                ArrayList access$getAnchors$p = slotWriter.anchors;
                ArrayList arrayList2 = new ArrayList(access$locationOf2 - access$locationOf);
                for (int i15 = access$locationOf; i15 < access$locationOf2; i15++) {
                    Object obj = access$getAnchors$p.get(i15);
                    C12775o.m28638h(obj, "sourceAnchors[anchorIndex]");
                    Anchor anchor = (Anchor) obj;
                    anchor.setLocation$runtime_release(anchor.getLocation$runtime_release() + i7);
                    arrayList2.add(anchor);
                }
                slotWriter2.anchors.addAll(SlotTableKt.locationOf(slotWriter2.anchors, slotWriter2.getCurrentGroup(), slotWriter2.getSize$runtime_release()), arrayList2);
                access$getAnchors$p.subList(access$locationOf, access$locationOf2).clear();
                arrayList = arrayList2;
            } else {
                arrayList = C12726w.m28524k();
            }
            int parent2 = slotWriter.parent(i);
            int i16 = 1;
            if (z) {
                if (parent2 >= 0) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    slotWriter.startGroup();
                    slotWriter3.advanceBy(parent2 - slotWriter.getCurrentGroup());
                    slotWriter.startGroup();
                }
                slotWriter3.advanceBy(i4 - slotWriter.getCurrentGroup());
                z3 = slotWriter.removeGroup();
                if (i2 != 0) {
                    slotWriter.skipToGroupEnd();
                    slotWriter.endGroup();
                    slotWriter.skipToGroupEnd();
                    slotWriter.endGroup();
                }
            } else {
                boolean access$removeGroups = slotWriter3.removeGroups(i4, groupSize);
                slotWriter3.removeSlots(access$dataIndex, i6, i4 - 1);
                z3 = access$removeGroups;
            }
            if (!z3) {
                int access$getNodeCount$p = slotWriter2.nodeCount;
                if (!SlotTableKt.isNode(access$getGroups$p, currentGroup)) {
                    i16 = SlotTableKt.nodeCount(access$getGroups$p, currentGroup);
                }
                slotWriter4.nodeCount = access$getNodeCount$p + i16;
                if (z2) {
                    slotWriter4.currentGroup = i14;
                    slotWriter4.currentSlot = i11 + i6;
                }
                if (z4) {
                    slotWriter4.updateContainsMark(i9);
                }
                return arrayList;
            }
            ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
            throw new KotlinNothingValueException();
        }
    }

    public SlotWriter(SlotTable slotTable) {
        C12775o.m28639i(slotTable, "table");
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        this.slots = slotTable.getSlots();
        this.anchors = slotTable.getAnchors$runtime_release();
        this.groupGapStart = slotTable.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
        this.slotsGapStart = slotTable.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable.getSlotsSize();
        this.slotsGapOwner = slotTable.getGroupsSize();
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter slotWriter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i);
    }

    private final int auxIndex(int[] iArr, int i) {
        return dataIndex(iArr, i) + SlotTableKt.countOneBits(SlotTableKt.groupInfo(iArr, i) >> 29);
    }

    private final boolean childContainsAnyMarks(int i) {
        int i2 = i + 1;
        int groupSize = i + groupSize(i);
        while (i2 < groupSize) {
            if (SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(i2))) {
                return true;
            }
            i2 += groupSize(i2);
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final boolean containsAnyGroupMarks(int i) {
        if (i < 0 || !SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(i))) {
            return false;
        }
        return true;
    }

    private final boolean containsGroupMark(int i) {
        if (i < 0 || !SlotTableKt.containsMark(this.groups, groupIndexToAddress(i))) {
            return false;
        }
        return true;
    }

    private final int dataAnchorToDataIndex(int i, int i2, int i3) {
        if (i < 0) {
            return (i3 - i2) + i + 1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    public final int dataIndex(int i) {
        return dataIndex(this.groups, groupIndexToAddress(i));
    }

    /* access modifiers changed from: private */
    public final int dataIndexToDataAddress(int i) {
        if (i < this.slotsGapStart) {
            return i;
        }
        return i + this.slotsGapLen;
    }

    /* access modifiers changed from: private */
    public final int dataIndexToDataAnchor(int i, int i2, int i3, int i4) {
        if (i > i2) {
            return -(((i4 - i3) - i) + 1);
        }
        return i;
    }

    private final List<Integer> dataIndexes(int[] iArr) {
        List dataAnchors$default = SlotTableKt.dataAnchors$default(this.groups, 0, 1, (Object) null);
        List o0 = C12686e0.m28236o0(C12686e0.m28241t0(dataAnchors$default, C13537l.m30893t(0, this.groupGapStart)), C12686e0.m28241t0(dataAnchors$default, C13537l.m30893t(this.groupGapStart + this.groupGapLen, iArr.length / 5)));
        ArrayList arrayList = new ArrayList(o0.size());
        int size = o0.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(dataAnchorToDataIndex(((Number) o0.get(i)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final void fixParentAnchorsFor(int i, int i2, int i3) {
        int parentIndexToAnchor = parentIndexToAnchor(i, this.groupGapStart);
        while (i3 < i2) {
            SlotTableKt.updateParentAnchor(this.groups, groupIndexToAddress(i3), parentIndexToAnchor);
            int access$groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i3)) + i3;
            fixParentAnchorsFor(i3, access$groupSize, i3 + 1);
            i3 = access$groupSize;
        }
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    private final void groupAsString(StringBuilder sb, int i) {
        int groupIndexToAddress = groupIndexToAddress(i);
        sb.append("Group(");
        if (i < 10) {
            sb.append(' ');
        }
        if (i < 100) {
            sb.append(' ');
        }
        if (i < 1000) {
            sb.append(' ');
        }
        sb.append(i);
        if (groupIndexToAddress != i) {
            sb.append("(");
            sb.append(groupIndexToAddress);
            sb.append(")");
        }
        sb.append('#');
        sb.append(SlotTableKt.groupSize(this.groups, groupIndexToAddress));
        boolean groupAsString$isStarted = groupAsString$isStarted(this, i);
        if (groupAsString$isStarted) {
            sb.append('?');
        }
        sb.append('^');
        sb.append(parentAnchorToIndex(SlotTableKt.parentAnchor(this.groups, groupIndexToAddress)));
        sb.append(": key=");
        sb.append(SlotTableKt.key(this.groups, groupIndexToAddress));
        sb.append(", nodes=");
        sb.append(SlotTableKt.nodeCount(this.groups, groupIndexToAddress));
        if (groupAsString$isStarted) {
            sb.append('?');
        }
        sb.append(", dataAnchor=");
        sb.append(SlotTableKt.dataAnchor(this.groups, groupIndexToAddress));
        sb.append(", parentAnchor=");
        sb.append(SlotTableKt.parentAnchor(this.groups, groupIndexToAddress));
        if (SlotTableKt.isNode(this.groups, groupIndexToAddress)) {
            sb.append(", node=" + this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))]);
        }
        int slotIndex = slotIndex(this.groups, groupIndexToAddress);
        int dataIndex = dataIndex(this.groups, groupIndexToAddress + 1);
        if (dataIndex > slotIndex) {
            sb.append(", [");
            for (int i2 = slotIndex; i2 < dataIndex; i2++) {
                if (i2 != slotIndex) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(this.slots[dataIndexToDataAddress(i2)]));
            }
            sb.append(']');
        }
        sb.append(")");
    }

    private static final boolean groupAsString$isStarted(SlotWriter slotWriter, int i) {
        if (i >= slotWriter.currentGroup || (i != slotWriter.parent && slotWriter.startStack.indexOf(i) < 0 && !groupAsString$isStarted(slotWriter, slotWriter.parent(i)))) {
            return false;
        }
        return true;
    }

    private final int groupIndexToAddress(int i) {
        if (i < this.groupGapStart) {
            return i;
        }
        return i + this.groupGapLen;
    }

    /* access modifiers changed from: private */
    public final void insertGroups(int i) {
        int i2;
        if (i > 0) {
            int i3 = this.currentGroup;
            moveGroupGapTo(i3);
            int i4 = this.groupGapStart;
            int i5 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i) {
                int max = Math.max(Math.max(length * 2, i6 + i), 32);
                int[] iArr2 = new int[(max * 5)];
                int i8 = max - i6;
                int[] unused = C12708o.m28340g(iArr, iArr2, 0, 0, i4 * 5);
                int[] unused2 = C12708o.m28340g(iArr, iArr2, (i4 + i8) * 5, (i5 + i4) * 5, length * 5);
                this.groups = iArr2;
                i5 = i8;
            }
            int i9 = this.currentGroupEnd;
            if (i9 >= i4) {
                this.currentGroupEnd = i9 + i;
            }
            int i10 = i4 + i;
            this.groupGapStart = i10;
            this.groupGapLen = i5 - i;
            if (i6 > 0) {
                i2 = dataIndex(i3 + i);
            } else {
                i2 = 0;
            }
            if (this.slotsGapOwner >= i4) {
                i7 = this.slotsGapStart;
            }
            int dataIndexToDataAnchor = dataIndexToDataAnchor(i2, i7, this.slotsGapLen, this.slots.length);
            for (int i11 = i4; i11 < i10; i11++) {
                SlotTableKt.updateDataAnchor(this.groups, i11, dataIndexToDataAnchor);
            }
            int i12 = this.slotsGapOwner;
            if (i12 >= i4) {
                this.slotsGapOwner = i12 + i;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void insertSlots(int i, int i2) {
        if (i > 0) {
            moveSlotGapTo(this.currentSlot, i2);
            int i3 = this.slotsGapStart;
            int i4 = this.slotsGapLen;
            if (i4 < i) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                Object[] unused = C12708o.m28342i(objArr, objArr2, 0, 0, i3);
                Object[] unused2 = C12708o.m28342i(objArr, objArr2, i3 + i7, i4 + i3, length);
                this.slots = objArr2;
                i4 = i7;
            }
            int i8 = this.currentSlotEnd;
            if (i8 >= i3) {
                this.currentSlotEnd = i8 + i;
            }
            this.slotsGapStart = i3 + i;
            this.slotsGapLen = i4 - i;
        }
    }

    private final List<Integer> keys() {
        boolean z;
        List keys$default = SlotTableKt.keys$default(this.groups, 0, 1, (Object) null);
        ArrayList arrayList = new ArrayList(keys$default.size());
        int size = keys$default.size();
        for (int i = 0; i < size; i++) {
            Object obj = keys$default.get(i);
            ((Number) obj).intValue();
            int i2 = this.groupGapStart;
            if (i < i2 || i >= i2 + this.groupGapLen) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.parent;
        }
        slotWriter.markGroup(i);
    }

    private final void moveAnchors(int i, int i2, int i3) {
        int i4 = i3 + i;
        int size$runtime_release = getSize$runtime_release();
        int access$locationOf = SlotTableKt.locationOf(this.anchors, i, size$runtime_release);
        ArrayList arrayList = new ArrayList();
        if (access$locationOf >= 0) {
            while (access$locationOf < this.anchors.size()) {
                Anchor anchor = this.anchors.get(access$locationOf);
                C12775o.m28638h(anchor, "anchors[index]");
                Anchor anchor2 = anchor;
                int anchorIndex = anchorIndex(anchor2);
                if (anchorIndex < i || anchorIndex >= i4) {
                    break;
                }
                arrayList.add(anchor2);
                this.anchors.remove(access$locationOf);
            }
        }
        int i5 = i2 - i;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Anchor anchor3 = (Anchor) arrayList.get(i6);
            int anchorIndex2 = anchorIndex(anchor3) + i5;
            if (anchorIndex2 >= this.groupGapStart) {
                anchor3.setLocation$runtime_release(-(size$runtime_release - anchorIndex2));
            } else {
                anchor3.setLocation$runtime_release(anchorIndex2);
            }
            this.anchors.add(SlotTableKt.locationOf(this.anchors, anchorIndex2, size$runtime_release), anchor3);
        }
    }

    /* access modifiers changed from: private */
    public final void moveGroupGapTo(int i) {
        int i2;
        int i3 = this.groupGapLen;
        int i4 = this.groupGapStart;
        if (i4 != i) {
            boolean z = true;
            if (!this.anchors.isEmpty()) {
                updateAnchors(i4, i);
            }
            if (i3 > 0) {
                int[] iArr = this.groups;
                int i5 = i * 5;
                int i6 = i3 * 5;
                int i7 = i4 * 5;
                if (i < i4) {
                    int[] unused = C12708o.m28340g(iArr, iArr, i6 + i5, i5, i7);
                } else {
                    int[] unused2 = C12708o.m28340g(iArr, iArr, i7, i7 + i6, i5 + i6);
                }
            }
            if (i < i4) {
                i4 = i + i3;
            }
            int capacity = getCapacity();
            if (i2 >= capacity) {
                z = false;
            }
            ComposerKt.runtimeCheck(z);
            while (i2 < capacity) {
                int access$parentAnchor = SlotTableKt.parentAnchor(this.groups, i2);
                int parentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(access$parentAnchor), i);
                if (parentIndexToAnchor != access$parentAnchor) {
                    SlotTableKt.updateParentAnchor(this.groups, i2, parentIndexToAnchor);
                }
                i2++;
                if (i2 == i) {
                    i2 += i3;
                }
            }
        }
        this.groupGapStart = i;
    }

    /* access modifiers changed from: private */
    public final void moveSlotGapTo(int i, int i2) {
        boolean z;
        boolean z2;
        int i3 = this.slotsGapLen;
        int i4 = this.slotsGapStart;
        int i5 = this.slotsGapOwner;
        if (i4 != i) {
            Object[] objArr = this.slots;
            if (i < i4) {
                Object[] unused = C12708o.m28342i(objArr, objArr, i + i3, i, i4);
            } else {
                Object[] unused2 = C12708o.m28342i(objArr, objArr, i4, i4 + i3, i + i3);
            }
            C12708o.m28352s(objArr, null, i, i + i3);
        }
        int min = Math.min(i2 + 1, getSize$runtime_release());
        if (i5 != min) {
            int length = this.slots.length - i3;
            if (min < i5) {
                int groupIndexToAddress = groupIndexToAddress(min);
                int groupIndexToAddress2 = groupIndexToAddress(i5);
                int i6 = this.groupGapStart;
                while (groupIndexToAddress < groupIndexToAddress2) {
                    int access$dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
                    if (access$dataAnchor >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        SlotTableKt.updateDataAnchor(this.groups, groupIndexToAddress, -((length - access$dataAnchor) + 1));
                        groupIndexToAddress++;
                        if (groupIndexToAddress == i6) {
                            groupIndexToAddress += this.groupGapLen;
                        }
                    } else {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a positive anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            } else {
                int groupIndexToAddress3 = groupIndexToAddress(i5);
                int groupIndexToAddress4 = groupIndexToAddress(min);
                while (groupIndexToAddress3 < groupIndexToAddress4) {
                    int access$dataAnchor2 = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress3);
                    if (access$dataAnchor2 < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        SlotTableKt.updateDataAnchor(this.groups, groupIndexToAddress3, access$dataAnchor2 + length + 1);
                        groupIndexToAddress3++;
                        if (groupIndexToAddress3 == this.groupGapStart) {
                            groupIndexToAddress3 += this.groupGapLen;
                        }
                    } else {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a negative anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            }
            this.slotsGapOwner = min;
        }
        this.slotsGapStart = i;
    }

    private final int nodeIndex(int[] iArr, int i) {
        return dataIndex(iArr, i);
    }

    private final int parentAnchorToIndex(int i) {
        if (i > -2) {
            return i;
        }
        return getSize$runtime_release() + i + 2;
    }

    private final int parentIndexToAnchor(int i, int i2) {
        if (i < i2) {
            return i;
        }
        return -((getSize$runtime_release() - i) + 2);
    }

    private final void recalculateMarks() {
        PrioritySet prioritySet = this.pendingRecalculateMarks;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty()) {
                updateContainsMarkNow(prioritySet.takeMax(), prioritySet);
            }
        }
    }

    private final boolean removeAnchors(int i, int i2) {
        int i3 = i2 + i;
        int access$locationOf = SlotTableKt.locationOf(this.anchors, i3, getCapacity() - this.groupGapLen);
        if (access$locationOf >= this.anchors.size()) {
            access$locationOf--;
        }
        int i4 = access$locationOf + 1;
        boolean z = false;
        int i5 = 0;
        while (access$locationOf >= 0) {
            Anchor anchor = this.anchors.get(access$locationOf);
            C12775o.m28638h(anchor, "anchors[index]");
            Anchor anchor2 = anchor;
            int anchorIndex = anchorIndex(anchor2);
            if (anchorIndex < i) {
                break;
            }
            if (anchorIndex < i3) {
                anchor2.setLocation$runtime_release(Integer.MIN_VALUE);
                if (i5 == 0) {
                    i5 = access$locationOf + 1;
                }
                i4 = access$locationOf;
            }
            access$locationOf--;
        }
        if (i4 < i5) {
            z = true;
        }
        if (z) {
            this.anchors.subList(i4, i5).clear();
        }
        return z;
    }

    /* access modifiers changed from: private */
    public final boolean removeGroups(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            moveGroupGapTo(i);
            if (!arrayList.isEmpty()) {
                z = removeAnchors(i, i2);
            }
            this.groupGapStart = i;
            this.groupGapLen += i2;
            int i3 = this.slotsGapOwner;
            if (i3 > i) {
                this.slotsGapOwner = Math.max(i, i3 - i2);
            }
            int i4 = this.currentGroupEnd;
            if (i4 >= this.groupGapStart) {
                this.currentGroupEnd = i4 - i2;
            }
            if (containsGroupMark(this.parent)) {
                updateContainsMark(this.parent);
            }
        }
        return z;
    }

    /* access modifiers changed from: private */
    public final void removeSlots(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.slotsGapLen;
            int i5 = i + i2;
            moveSlotGapTo(i5, i3);
            this.slotsGapStart = i;
            this.slotsGapLen = i4 + i2;
            C12708o.m28352s(this.slots, null, i, i5);
            int i6 = this.currentSlotEnd;
            if (i6 >= i) {
                this.currentSlotEnd = i6 - i2;
            }
        }
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int slotIndex(int[] iArr, int i) {
        if (i >= getCapacity()) {
            return this.slots.length - this.slotsGapLen;
        }
        return dataAnchorToDataIndex(SlotTableKt.slotAnchor(iArr, i), this.slotsGapLen, this.slots.length);
    }

    private final void updateAnchors(int i, int i2) {
        int i3;
        int capacity = getCapacity() - this.groupGapLen;
        if (i < i2) {
            int access$locationOf = SlotTableKt.locationOf(this.anchors, i, capacity);
            while (access$locationOf < this.anchors.size()) {
                Anchor anchor = this.anchors.get(access$locationOf);
                C12775o.m28638h(anchor, "anchors[index]");
                Anchor anchor2 = anchor;
                int location$runtime_release = anchor2.getLocation$runtime_release();
                if (location$runtime_release < 0 && (i3 = location$runtime_release + capacity) < i2) {
                    anchor2.setLocation$runtime_release(i3);
                    access$locationOf++;
                } else {
                    return;
                }
            }
            return;
        }
        int access$locationOf2 = SlotTableKt.locationOf(this.anchors, i2, capacity);
        while (access$locationOf2 < this.anchors.size()) {
            Anchor anchor3 = this.anchors.get(access$locationOf2);
            C12775o.m28638h(anchor3, "anchors[index]");
            Anchor anchor4 = anchor3;
            int location$runtime_release2 = anchor4.getLocation$runtime_release();
            if (location$runtime_release2 >= 0) {
                anchor4.setLocation$runtime_release(-(capacity - location$runtime_release2));
                access$locationOf2++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void updateContainsMark(int i) {
        if (i >= 0) {
            PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet == null) {
                prioritySet = new PrioritySet((List) null, 1, (DefaultConstructorMarker) null);
                this.pendingRecalculateMarks = prioritySet;
            }
            prioritySet.add(i);
        }
    }

    private final void updateContainsMarkNow(int i, PrioritySet prioritySet) {
        boolean z;
        int groupIndexToAddress = groupIndexToAddress(i);
        boolean childContainsAnyMarks = childContainsAnyMarks(i);
        if (SlotTableKt.containsMark(this.groups, groupIndexToAddress) != childContainsAnyMarks) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            SlotTableKt.updateContainsMark(this.groups, groupIndexToAddress, childContainsAnyMarks);
            int parent2 = parent(i);
            if (parent2 >= 0) {
                prioritySet.add(parent2);
            }
        }
    }

    private final void updateDataIndex(int[] iArr, int i, int i2) {
        SlotTableKt.updateDataAnchor(iArr, i, dataIndexToDataAnchor(i2, this.slotsGapStart, this.slotsGapLen, this.slots.length));
    }

    private final void updateNodeOfGroup(int i, Object obj) {
        boolean z;
        int groupIndexToAddress = groupIndexToAddress(i);
        int[] iArr = this.groups;
        if (groupIndexToAddress >= iArr.length || !SlotTableKt.isNode(iArr, groupIndexToAddress)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))] = obj;
            return;
        }
        ComposerKt.composeRuntimeError(("Updating the node of a group at " + i + " that was not created with as a node group").toString());
        throw new KotlinNothingValueException();
    }

    public final void addToGroupSizeAlongSpine(int i, int i2) {
        while (i > 0) {
            int[] iArr = this.groups;
            SlotTableKt.updateGroupSize(iArr, i, SlotTableKt.groupSize(iArr, i) + i2);
            i = groupIndexToAddress(parentAnchorToIndex(SlotTableKt.parentAnchor(this.groups, i)));
        }
    }

    public final void advanceBy(int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.insertCount <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalStateException("Cannot call seek() while inserting".toString());
            } else if (i != 0) {
                int i2 = this.currentGroup + i;
                if (i2 < this.parent || i2 > this.currentGroupEnd) {
                    z3 = false;
                }
                if (z3) {
                    this.currentGroup = i2;
                    int dataIndex = dataIndex(this.groups, groupIndexToAddress(i2));
                    this.currentSlot = dataIndex;
                    this.currentSlotEnd = dataIndex;
                    return;
                }
                ComposerKt.composeRuntimeError(("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')').toString());
                throw new KotlinNothingValueException();
            }
        } else {
            ComposerKt.composeRuntimeError("Cannot seek backwards".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final Anchor anchor(int i) {
        ArrayList<Anchor> arrayList = this.anchors;
        int access$search = SlotTableKt.search(arrayList, i, getSize$runtime_release());
        if (access$search < 0) {
            if (i > this.groupGapStart) {
                i = -(getSize$runtime_release() - i);
            }
            Anchor anchor = new Anchor(i);
            arrayList.add(-(access$search + 1), anchor);
            return anchor;
        }
        Anchor anchor2 = arrayList.get(access$search);
        C12775o.m28638h(anchor2, "get(location)");
        return anchor2;
    }

    public final int anchorIndex(Anchor anchor) {
        C12775o.m28639i(anchor, "anchor");
        int location$runtime_release = anchor.getLocation$runtime_release();
        if (location$runtime_release < 0) {
            return location$runtime_release + getSize$runtime_release();
        }
        return location$runtime_release;
    }

    public final void bashGroup$runtime_release() {
        startGroup();
        while (!isGroupEnd()) {
            insertParentGroup(-3);
            skipGroup();
        }
        endGroup();
    }

    public final void beginInsert() {
        int i = this.insertCount;
        this.insertCount = i + 1;
        if (i == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final void close() {
        this.closed = true;
        if (this.startStack.isEmpty()) {
            moveGroupGapTo(getSize$runtime_release());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            recalculateMarks();
        }
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors);
    }

    public final int endGroup() {
        boolean z;
        int i;
        int i2 = 1;
        int i3 = 0;
        if (this.insertCount > 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = this.currentGroup;
        int i5 = this.currentGroupEnd;
        int i6 = this.parent;
        int groupIndexToAddress = groupIndexToAddress(i6);
        int i7 = this.nodeCount;
        int i8 = i4 - i6;
        boolean access$isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (z) {
            SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress, i8);
            SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i7);
            int pop = this.nodeCountStack.pop();
            if (!access$isNode) {
                i2 = i7;
            }
            this.nodeCount = pop + i2;
            this.parent = parent(this.groups, i6);
        } else {
            if (i4 != i5) {
                i2 = 0;
            }
            if (i2 != 0) {
                int access$groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
                int access$nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
                SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress, i8);
                SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i7);
                int pop2 = this.startStack.pop();
                restoreCurrentGroupEnd();
                this.parent = pop2;
                int parent2 = parent(this.groups, i6);
                int pop3 = this.nodeCountStack.pop();
                this.nodeCount = pop3;
                if (parent2 == pop2) {
                    if (!access$isNode) {
                        i3 = i7 - access$nodeCount;
                    }
                    this.nodeCount = pop3 + i3;
                } else {
                    int i9 = i8 - access$groupSize;
                    if (access$isNode) {
                        i = 0;
                    } else {
                        i = i7 - access$nodeCount;
                    }
                    if (!(i9 == 0 && i == 0)) {
                        while (parent2 != 0 && parent2 != pop2 && (i != 0 || i9 != 0)) {
                            int groupIndexToAddress2 = groupIndexToAddress(parent2);
                            if (i9 != 0) {
                                SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress2, SlotTableKt.groupSize(this.groups, groupIndexToAddress2) + i9);
                            }
                            if (i != 0) {
                                int[] iArr = this.groups;
                                SlotTableKt.updateNodeCount(iArr, groupIndexToAddress2, SlotTableKt.nodeCount(iArr, groupIndexToAddress2) + i);
                            }
                            if (SlotTableKt.isNode(this.groups, groupIndexToAddress2)) {
                                i = 0;
                            }
                            parent2 = parent(this.groups, parent2);
                        }
                    }
                    this.nodeCount += i;
                }
            } else {
                ComposerKt.composeRuntimeError("Expected to be at the end of a group".toString());
                throw new KotlinNothingValueException();
            }
        }
        return i7;
    }

    public final void endInsert() {
        boolean z;
        int i = this.insertCount;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = i - 1;
            this.insertCount = i2;
            if (i2 == 0) {
                if (this.nodeCountStack.getSize() != this.startStack.getSize()) {
                    z2 = false;
                }
                if (z2) {
                    restoreCurrentGroupEnd();
                } else {
                    ComposerKt.composeRuntimeError("startGroup/endGroup mismatch while inserting".toString());
                    throw new KotlinNothingValueException();
                }
            }
        } else {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
    }

    public final void ensureStarted(int i) {
        boolean z = true;
        if (this.insertCount <= 0) {
            int i2 = this.parent;
            if (i2 != i) {
                if (i < i2 || i >= this.currentGroupEnd) {
                    z = false;
                }
                if (z) {
                    int i3 = this.currentGroup;
                    int i4 = this.currentSlot;
                    int i5 = this.currentSlotEnd;
                    this.currentGroup = i;
                    startGroup();
                    this.currentGroup = i3;
                    this.currentSlot = i4;
                    this.currentSlotEnd = i5;
                    return;
                }
                ComposerKt.composeRuntimeError(("Started group at " + i + " must be a subgroup of the group at " + i2).toString());
                throw new KotlinNothingValueException();
            }
            return;
        }
        ComposerKt.composeRuntimeError("Cannot call ensureStarted() while inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize$runtime_release() {
        return getCapacity() - this.groupGapLen;
    }

    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    public final Object groupAux(int i) {
        int groupIndexToAddress = groupIndexToAddress(i);
        if (SlotTableKt.hasAux(this.groups, groupIndexToAddress)) {
            return this.slots[auxIndex(this.groups, groupIndexToAddress)];
        }
        return Composer.Companion.getEmpty();
    }

    public final int groupKey(int i) {
        return SlotTableKt.key(this.groups, groupIndexToAddress(i));
    }

    public final Object groupObjectKey(int i) {
        int groupIndexToAddress = groupIndexToAddress(i);
        if (SlotTableKt.hasObjectKey(this.groups, groupIndexToAddress)) {
            return this.slots[SlotTableKt.objectKeyIndex(this.groups, groupIndexToAddress)];
        }
        return null;
    }

    public final int groupSize(int i) {
        return SlotTableKt.groupSize(this.groups, groupIndexToAddress(i));
    }

    public final Iterator<Object> groupSlots() {
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i = this.currentGroup;
        return new SlotWriter$groupSlots$1(dataIndex, dataIndex(iArr, groupIndexToAddress(i + groupSize(i))), this);
    }

    public final String groupsAsString() {
        StringBuilder sb = new StringBuilder();
        int size$runtime_release = getSize$runtime_release();
        for (int i = 0; i < size$runtime_release; i++) {
            groupAsString(sb, i);
            sb.append(10);
        }
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final boolean indexInCurrentGroup(int i) {
        return indexInGroup(i, this.currentGroup);
    }

    public final boolean indexInGroup(int i, int i2) {
        int i3;
        int groupSize;
        if (i2 == this.parent) {
            i3 = this.currentGroupEnd;
        } else {
            if (i2 > this.startStack.peekOr(0)) {
                groupSize = groupSize(i2);
            } else {
                int indexOf = this.startStack.indexOf(i2);
                if (indexOf < 0) {
                    groupSize = groupSize(i2);
                } else {
                    i3 = (getCapacity() - this.groupGapLen) - this.endStack.peek(indexOf);
                }
            }
            i3 = groupSize + i2;
        }
        if (i <= i2 || i >= i3) {
            return false;
        }
        return true;
    }

    public final boolean indexInParent(int i) {
        int i2 = this.parent;
        if ((i <= i2 || i >= this.currentGroupEnd) && (i2 != 0 || i != 0)) {
            return false;
        }
        return true;
    }

    public final void insertAux(Object obj) {
        boolean z;
        boolean z2 = false;
        if (this.insertCount >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = this.parent;
            int groupIndexToAddress = groupIndexToAddress(i);
            if (!SlotTableKt.hasAux(this.groups, groupIndexToAddress)) {
                insertSlots(1, i);
                int auxIndex = auxIndex(this.groups, groupIndexToAddress);
                int dataIndexToDataAddress = dataIndexToDataAddress(auxIndex);
                int i2 = this.currentSlot;
                if (i2 > auxIndex) {
                    int i3 = i2 - auxIndex;
                    if (i3 < 3) {
                        z2 = true;
                    }
                    if (z2) {
                        if (i3 > 1) {
                            Object[] objArr = this.slots;
                            objArr[dataIndexToDataAddress + 2] = objArr[dataIndexToDataAddress + 1];
                        }
                        Object[] objArr2 = this.slots;
                        objArr2[dataIndexToDataAddress + 1] = objArr2[dataIndexToDataAddress];
                    } else {
                        throw new IllegalStateException("Moving more than two slot not supported".toString());
                    }
                }
                SlotTableKt.addAux(this.groups, groupIndexToAddress);
                this.slots[dataIndexToDataAddress] = obj;
                this.currentSlot++;
                return;
            }
            ComposerKt.composeRuntimeError("Group already has auxiliary data".toString());
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("Cannot insert auxiliary data when not inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final void insertParentGroup(int i) {
        boolean z;
        int i2 = 0;
        if (this.insertCount == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ComposerKt.composeRuntimeError("Writer cannot be inserting".toString());
            throw new KotlinNothingValueException();
        } else if (isGroupEnd()) {
            beginInsert();
            startGroup(i);
            endGroup();
            endInsert();
        } else {
            int i3 = this.currentGroup;
            int parent2 = parent(this.groups, i3);
            int groupSize = parent2 + groupSize(parent2);
            int i4 = groupSize - i3;
            int i5 = i3;
            while (i5 < groupSize) {
                int groupIndexToAddress = groupIndexToAddress(i5);
                i2 += SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
                i5 += SlotTableKt.groupSize(this.groups, groupIndexToAddress);
            }
            int access$dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress(i3));
            beginInsert();
            insertGroups(1);
            endInsert();
            int groupIndexToAddress2 = groupIndexToAddress(i3);
            SlotTableKt.initGroup(this.groups, groupIndexToAddress2, i, false, false, false, parent2, access$dataAnchor);
            SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress2, i4 + 1);
            SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress2, i2);
            addToGroupSizeAlongSpine(groupIndexToAddress(parent2), 1);
            fixParentAnchorsFor(parent2, groupSize, i3);
            this.currentGroup = groupSize;
        }
    }

    public final boolean isGroupEnd() {
        if (this.currentGroup == this.currentGroupEnd) {
            return true;
        }
        return false;
    }

    public final boolean isNode() {
        int i = this.currentGroup;
        return i < this.currentGroupEnd && SlotTableKt.isNode(this.groups, groupIndexToAddress(i));
    }

    public final void markGroup(int i) {
        int groupIndexToAddress = groupIndexToAddress(i);
        if (!SlotTableKt.hasMark(this.groups, groupIndexToAddress)) {
            SlotTableKt.updateMark(this.groups, groupIndexToAddress, true);
            if (!SlotTableKt.containsMark(this.groups, groupIndexToAddress)) {
                updateContainsMark(parent(i));
            }
        }
    }

    public final List<Anchor> moveFrom(SlotTable slotTable, int i) {
        boolean z;
        C12775o.m28639i(slotTable, "table");
        if (this.insertCount > 0) {
            z = true;
        } else {
            z = false;
        }
        ComposerKt.runtimeCheck(z);
        if (i == 0 && this.currentGroup == 0 && this.table.getGroupsSize() == 0) {
            int[] iArr = this.groups;
            Object[] objArr = this.slots;
            ArrayList<Anchor> arrayList = this.anchors;
            int[] groups2 = slotTable.getGroups();
            int groupsSize = slotTable.getGroupsSize();
            Object[] slots2 = slotTable.getSlots();
            int slotsSize = slotTable.getSlotsSize();
            this.groups = groups2;
            this.slots = slots2;
            this.anchors = slotTable.getAnchors$runtime_release();
            this.groupGapStart = groupsSize;
            this.groupGapLen = (groups2.length / 5) - groupsSize;
            this.slotsGapStart = slotsSize;
            this.slotsGapLen = slots2.length - slotsSize;
            this.slotsGapOwner = groupsSize;
            slotTable.setTo$runtime_release(iArr, 0, objArr, 0, arrayList);
            return this.anchors;
        }
        SlotWriter openWriter = slotTable.openWriter();
        try {
            return Companion.moveGroup(openWriter, i, this, true, true);
        } finally {
            openWriter.close();
        }
    }

    public final void moveGroup(int i) {
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        if (this.insertCount == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                ComposerKt.composeRuntimeError("Parameter offset is out of bounds".toString());
                throw new KotlinNothingValueException();
            } else if (i != 0) {
                int i3 = this.currentGroup;
                int i4 = this.parent;
                int i5 = this.currentGroupEnd;
                int i6 = i;
                int i7 = i3;
                while (i6 > 0) {
                    i7 += SlotTableKt.groupSize(this.groups, groupIndexToAddress(i7));
                    if (i7 <= i5) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i6--;
                    } else {
                        ComposerKt.composeRuntimeError("Parameter offset is out of bounds".toString());
                        throw new KotlinNothingValueException();
                    }
                }
                int access$groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i7));
                int i8 = this.currentSlot;
                int dataIndex = dataIndex(this.groups, groupIndexToAddress(i7));
                int i9 = i7 + access$groupSize;
                int dataIndex2 = dataIndex(this.groups, groupIndexToAddress(i9));
                int i10 = dataIndex2 - dataIndex;
                insertSlots(i10, Math.max(this.currentGroup - 1, 0));
                insertGroups(access$groupSize);
                int[] iArr = this.groups;
                int groupIndexToAddress = groupIndexToAddress(i9) * 5;
                int[] unused = C12708o.m28340g(iArr, iArr, groupIndexToAddress(i3) * 5, groupIndexToAddress, (access$groupSize * 5) + groupIndexToAddress);
                if (i10 > 0) {
                    Object[] objArr = this.slots;
                    Object[] unused2 = C12708o.m28342i(objArr, objArr, i8, dataIndexToDataAddress(dataIndex + i10), dataIndexToDataAddress(dataIndex2 + i10));
                }
                int i11 = dataIndex + i10;
                int i12 = i11 - i8;
                int i13 = this.slotsGapStart;
                int i14 = this.slotsGapLen;
                int length = this.slots.length;
                int i15 = this.slotsGapOwner;
                int i16 = i3 + access$groupSize;
                int i17 = i3;
                while (i17 < i16) {
                    int groupIndexToAddress2 = groupIndexToAddress(i17);
                    int i18 = i13;
                    int dataIndex3 = dataIndex(iArr, groupIndexToAddress2) - i12;
                    int i19 = i12;
                    if (i15 < groupIndexToAddress2) {
                        i2 = 0;
                    } else {
                        i2 = i18;
                    }
                    updateDataIndex(iArr, groupIndexToAddress2, dataIndexToDataAnchor(dataIndex3, i2, i14, length));
                    i17++;
                    i13 = i18;
                    i12 = i19;
                }
                moveAnchors(i9, i3, access$groupSize);
                if (!removeGroups(i9, access$groupSize)) {
                    fixParentAnchorsFor(i4, this.currentGroupEnd, i3);
                    if (i10 > 0) {
                        removeSlots(i11, i10, i9 - 1);
                        return;
                    }
                    return;
                }
                ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
                throw new KotlinNothingValueException();
            }
        } else {
            ComposerKt.composeRuntimeError("Cannot move a group while inserting".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (groupSize(r9.currentGroup + r10) == 1) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<androidx.compose.runtime.Anchor> moveIntoGroupFrom(int r10, androidx.compose.runtime.SlotTable r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "table"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            int r0 = r9.insertCount
            if (r0 > 0) goto L_0x0014
            int r0 = r9.currentGroup
            int r0 = r0 + r10
            int r0 = r9.groupSize(r0)
            r1 = 1
            if (r0 != r1) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            androidx.compose.runtime.ComposerKt.runtimeCheck(r1)
            int r0 = r9.currentGroup
            int r1 = r9.currentSlot
            int r2 = r9.currentSlotEnd
            r9.advanceBy(r10)
            r9.startGroup()
            r9.beginInsert()
            androidx.compose.runtime.SlotWriter r10 = r11.openWriter()
            androidx.compose.runtime.SlotWriter$Companion r3 = Companion     // Catch:{ all -> 0x0046 }
            r7 = 0
            r8 = 1
            r4 = r10
            r5 = r12
            r6 = r9
            java.util.List r11 = r3.moveGroup(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0046 }
            r10.close()
            r9.endInsert()
            r9.endGroup()
            r9.currentGroup = r0
            r9.currentSlot = r1
            r9.currentSlotEnd = r2
            return r11
        L_0x0046:
            r11 = move-exception
            r10.close()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.moveIntoGroupFrom(int, androidx.compose.runtime.SlotTable, int):java.util.List");
    }

    public final List<Anchor> moveTo(Anchor anchor, int i, SlotWriter slotWriter) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        C12775o.m28639i(anchor, "anchor");
        C12775o.m28639i(slotWriter, "writer");
        boolean z5 = true;
        if (slotWriter.insertCount > 0) {
            z = true;
        } else {
            z = false;
        }
        ComposerKt.runtimeCheck(z);
        if (this.insertCount == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ComposerKt.runtimeCheck(z2);
        ComposerKt.runtimeCheck(anchor.getValid());
        int anchorIndex = anchorIndex(anchor) + i;
        int i3 = this.currentGroup;
        if (i3 > anchorIndex || anchorIndex >= this.currentGroupEnd) {
            z3 = false;
        } else {
            z3 = true;
        }
        ComposerKt.runtimeCheck(z3);
        int parent2 = parent(anchorIndex);
        int groupSize = groupSize(anchorIndex);
        if (isNode(anchorIndex)) {
            i2 = 1;
        } else {
            i2 = nodeCount(anchorIndex);
        }
        List<Anchor> access$moveGroup = Companion.moveGroup(this, anchorIndex, slotWriter, false, false);
        updateContainsMark(parent2);
        if (i2 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        while (parent2 >= i3) {
            int groupIndexToAddress = groupIndexToAddress(parent2);
            int[] iArr = this.groups;
            SlotTableKt.updateGroupSize(iArr, groupIndexToAddress, SlotTableKt.groupSize(iArr, groupIndexToAddress) - groupSize);
            if (z4) {
                if (SlotTableKt.isNode(this.groups, groupIndexToAddress)) {
                    z4 = false;
                } else {
                    int[] iArr2 = this.groups;
                    SlotTableKt.updateNodeCount(iArr2, groupIndexToAddress, SlotTableKt.nodeCount(iArr2, groupIndexToAddress) - i2);
                }
            }
            parent2 = parent(parent2);
        }
        if (z4) {
            if (this.nodeCount < i2) {
                z5 = false;
            }
            ComposerKt.runtimeCheck(z5);
            this.nodeCount -= i2;
        }
        return access$moveGroup;
    }

    public final Object node(int i) {
        int groupIndexToAddress = groupIndexToAddress(i);
        if (SlotTableKt.isNode(this.groups, groupIndexToAddress)) {
            return this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))];
        }
        return null;
    }

    public final int nodeCount(int i) {
        return SlotTableKt.nodeCount(this.groups, groupIndexToAddress(i));
    }

    public final int parent(int i) {
        return parent(this.groups, i);
    }

    public final boolean removeGroup() {
        boolean z;
        if (this.insertCount == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = this.currentGroup;
            int i2 = this.currentSlot;
            int skipGroup = skipGroup();
            PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet != null) {
                while (prioritySet.isNotEmpty() && prioritySet.peek() >= i) {
                    prioritySet.takeMax();
                }
            }
            boolean removeGroups = removeGroups(i, this.currentGroup - i);
            removeSlots(i2, this.currentSlot - i2, i - 1);
            this.currentGroup = i;
            this.currentSlot = i2;
            this.nodeCount -= skipGroup;
            return removeGroups;
        }
        ComposerKt.composeRuntimeError("Cannot remove group while inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final void reset() {
        boolean z;
        if (this.insertCount == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            recalculateMarks();
            this.currentGroup = 0;
            this.currentGroupEnd = getCapacity() - this.groupGapLen;
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            this.nodeCount = 0;
            return;
        }
        ComposerKt.composeRuntimeError("Cannot reset when inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final void seek(Anchor anchor) {
        C12775o.m28639i(anchor, "anchor");
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    public final void set(Object obj) {
        int i = this.currentSlot;
        if (i <= this.currentSlotEnd) {
            this.slots[dataIndexToDataAddress(i - 1)] = obj;
        } else {
            ComposerKt.composeRuntimeError("Writing to an invalid slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i = this.currentSlot;
        this.currentSlot = i + 1;
        return objArr[dataIndexToDataAddress(i)];
    }

    public final int skipGroup() {
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int access$groupSize = this.currentGroup + SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        this.currentGroup = access$groupSize;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(access$groupSize));
        if (SlotTableKt.isNode(this.groups, groupIndexToAddress)) {
            return 1;
        }
        return SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
    }

    public final void skipToGroupEnd() {
        int i = this.currentGroupEnd;
        this.currentGroup = i;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i));
    }

    public final Object slot(Anchor anchor, int i) {
        C12775o.m28639i(anchor, "anchor");
        return slot(anchorIndex(anchor), i);
    }

    public final void startData(int i, Object obj, Object obj2) {
        startGroup(i, obj, false, obj2);
    }

    public final void startGroup() {
        if (this.insertCount == 0) {
            Composer.Companion companion = Composer.Companion;
            startGroup(0, companion.getEmpty(), false, companion.getEmpty());
            return;
        }
        ComposerKt.composeRuntimeError("Key must be supplied when inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final void startNode(int i, Object obj) {
        startGroup(i, obj, true, Composer.Companion.getEmpty());
    }

    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    public final Object update(Object obj) {
        Object skip = skip();
        set(obj);
        return skip;
    }

    public final void updateAux(Object obj) {
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        if (SlotTableKt.hasAux(this.groups, groupIndexToAddress)) {
            this.slots[dataIndexToDataAddress(auxIndex(this.groups, groupIndexToAddress))] = obj;
        } else {
            ComposerKt.composeRuntimeError("Updating the data of a group that was not created with a data slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void updateNode(Object obj) {
        updateNodeOfGroup(this.currentGroup, obj);
    }

    public final void updateParentNode(Object obj) {
        updateNodeOfGroup(this.parent, obj);
    }

    public final void verifyDataAnchors$runtime_release() {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int size$runtime_release = getSize$runtime_release();
        int i2 = 0;
        int i3 = 0;
        boolean z4 = false;
        while (i2 < size$runtime_release) {
            int groupIndexToAddress = groupIndexToAddress(i2);
            int access$dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
            int dataIndex = dataIndex(this.groups, groupIndexToAddress);
            if (dataIndex >= i3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (dataIndex <= length) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (access$dataAnchor < 0 && !z4) {
                        if (i == i2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            z4 = true;
                        } else {
                            throw new IllegalStateException(("Expected the slot gap owner to be " + i + " found gap at " + i2).toString());
                        }
                    }
                    i2++;
                    i3 = dataIndex;
                } else {
                    throw new IllegalStateException(("Data index, " + dataIndex + ", out of bound at " + i2).toString());
                }
            } else {
                throw new IllegalStateException(("Data index out of order at " + i2 + ", previous = " + i3 + ", current = " + dataIndex).toString());
            }
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        boolean z;
        boolean z2;
        int i = this.groupGapStart;
        int i2 = this.groupGapLen;
        int capacity = getCapacity();
        int i3 = 0;
        while (true) {
            boolean z3 = true;
            if (i3 < i) {
                if (SlotTableKt.parentAnchor(this.groups, i3) <= -2) {
                    z3 = false;
                }
                if (z3) {
                    i3++;
                } else {
                    throw new IllegalStateException(("Expected a start relative anchor at " + i3).toString());
                }
            } else {
                for (int i4 = i2 + i; i4 < capacity; i4++) {
                    int access$parentAnchor = SlotTableKt.parentAnchor(this.groups, i4);
                    if (parentAnchorToIndex(access$parentAnchor) < i) {
                        if (access$parentAnchor > -2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new IllegalStateException(("Expected a start relative anchor at " + i4).toString());
                        }
                    } else {
                        if (access$parentAnchor <= -2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            throw new IllegalStateException(("Expected an end relative anchor at " + i4).toString());
                        }
                    }
                }
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public final int dataIndex(int[] iArr, int i) {
        if (i >= getCapacity()) {
            return this.slots.length - this.slotsGapLen;
        }
        return dataAnchorToDataIndex(SlotTableKt.dataAnchor(iArr, i), this.slotsGapLen, this.slots.length);
    }

    public final boolean isNode(int i) {
        return SlotTableKt.isNode(this.groups, groupIndexToAddress(i));
    }

    public final int parent(Anchor anchor) {
        C12775o.m28639i(anchor, "anchor");
        if (anchor.getValid()) {
            return parent(this.groups, anchorIndex(anchor));
        }
        return -1;
    }

    public final Object slot(int i, int i2) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(i));
        boolean z = true;
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i + 1));
        int i3 = i2 + slotIndex;
        if (slotIndex > i3 || i3 >= dataIndex) {
            z = false;
        }
        if (!z) {
            return Composer.Companion.getEmpty();
        }
        return this.slots[dataIndexToDataAddress(i3)];
    }

    public final void startData(int i, Object obj) {
        startGroup(i, Composer.Companion.getEmpty(), false, obj);
    }

    public final void startNode(int i, Object obj, Object obj2) {
        startGroup(i, obj, true, obj2);
    }

    public final void updateNode(Anchor anchor, Object obj) {
        C12775o.m28639i(anchor, "anchor");
        updateNodeOfGroup(anchor.toIndexFor(this), obj);
    }

    private final int parent(int[] iArr, int i) {
        return parentAnchorToIndex(SlotTableKt.parentAnchor(iArr, groupIndexToAddress(i)));
    }

    public final Object node(Anchor anchor) {
        C12775o.m28639i(anchor, "anchor");
        return node(anchor.toIndexFor(this));
    }

    public final Object set(int i, Object obj) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(this.currentGroup));
        boolean z = true;
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
        int i2 = slotIndex + i;
        if (i2 < slotIndex || i2 >= dataIndex) {
            z = false;
        }
        if (z) {
            int dataIndexToDataAddress = dataIndexToDataAddress(i2);
            Object[] objArr = this.slots;
            Object obj2 = objArr[dataIndexToDataAddress];
            objArr[dataIndexToDataAddress] = obj;
            return obj2;
        }
        ComposerKt.composeRuntimeError(("Write to an invalid slot index " + i + " for group " + this.currentGroup).toString());
        throw new KotlinNothingValueException();
    }

    public final void startGroup(int i) {
        Composer.Companion companion = Composer.Companion;
        startGroup(i, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startGroup(int i, Object obj) {
        startGroup(i, obj, false, Composer.Companion.getEmpty());
    }

    private final void startGroup(int i, Object obj, boolean z, Object obj2) {
        int i2;
        Object obj3 = obj;
        Object obj4 = obj2;
        boolean z2 = this.insertCount > 0;
        this.nodeCountStack.push(this.nodeCount);
        if (z2) {
            insertGroups(1);
            int i3 = this.currentGroup;
            int groupIndexToAddress = groupIndexToAddress(i3);
            Composer.Companion companion = Composer.Companion;
            boolean z3 = obj3 != companion.getEmpty();
            boolean z4 = !z && obj4 != companion.getEmpty();
            SlotTableKt.initGroup(this.groups, groupIndexToAddress, i, z, z3, z4, this.parent, this.currentSlot);
            this.currentSlotEnd = this.currentSlot;
            int i4 = (z ? 1 : 0) + (z3 ? 1 : 0) + (z4 ? 1 : 0);
            if (i4 > 0) {
                insertSlots(i4, i3);
                Object[] objArr = this.slots;
                int i5 = this.currentSlot;
                if (z) {
                    objArr[i5] = obj4;
                    i5++;
                }
                if (z3) {
                    objArr[i5] = obj3;
                    i5++;
                }
                if (z4) {
                    objArr[i5] = obj4;
                    i5++;
                }
                this.currentSlot = i5;
            }
            this.nodeCount = 0;
            i2 = i3 + 1;
            this.parent = i3;
            this.currentGroup = i2;
        } else {
            this.startStack.push(this.parent);
            saveCurrentGroupEnd();
            int i6 = this.currentGroup;
            int groupIndexToAddress2 = groupIndexToAddress(i6);
            if (!C12775o.m28634d(obj4, Composer.Companion.getEmpty())) {
                if (z) {
                    updateNode(obj4);
                } else {
                    updateAux(obj4);
                }
            }
            this.currentSlot = slotIndex(this.groups, groupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            this.nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress2);
            this.parent = i6;
            this.currentGroup = i6 + 1;
            i2 = i6 + SlotTableKt.groupSize(this.groups, groupIndexToAddress2);
        }
        this.currentGroupEnd = i2;
    }

    public final void ensureStarted(Anchor anchor) {
        C12775o.m28639i(anchor, "anchor");
        ensureStarted(anchor.toIndexFor(this));
    }
}
