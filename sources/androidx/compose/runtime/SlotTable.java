package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12755d0;
import kotlin.jvm.internal.C12760f0;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p412pf.C13212a;

@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3443:1\n146#1,8:3486\n162#1,4:3494\n167#1,3:3504\n4513#2,5:3444\n4513#2,5:3449\n4513#2,5:3454\n4513#2,5:3466\n4513#2,5:3471\n4513#2,5:3476\n4513#2,5:3481\n1#3:3459\n3323#4,6:3460\n33#5,6:3498\n33#5,6:3507\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n310#1:3486,8\n338#1:3494,4\n338#1:3504,3\n190#1:3444,5\n191#1:3449,5\n207#1:3454,5\n221#1:3466,5\n241#1:3471,5\n242#1:3476,5\n251#1:3481,5\n209#1:3460,6\n340#1:3498,6\n477#1:3507,6\n*E\n"})
/* compiled from: SlotTable.kt */
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, C13212a {
    private ArrayList<Anchor> anchors = new ArrayList<>();
    private int[] groups = new int[0];
    private int groupsSize;
    private int readers;
    private Object[] slots = new Object[0];
    private int slotsSize;
    private int version;
    private boolean writer;

    private final List<Integer> dataIndexes() {
        return SlotTableKt.dataAnchors(this.groups, this.groupsSize * 5);
    }

    private final int emitGroup(StringBuilder sb, int i, int i2) {
        boolean z = false;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(' ');
        }
        sb.append("Group(");
        sb.append(i);
        sb.append(") key=");
        sb.append(SlotTableKt.key(this.groups, i));
        int access$groupSize = SlotTableKt.groupSize(this.groups, i);
        sb.append(", nodes=");
        sb.append(SlotTableKt.nodeCount(this.groups, i));
        sb.append(", size=");
        sb.append(access$groupSize);
        if (SlotTableKt.hasMark(this.groups, i)) {
            sb.append(", mark");
        }
        if (SlotTableKt.containsMark(this.groups, i)) {
            sb.append(", contains mark");
        }
        int emitGroup$dataIndex = emitGroup$dataIndex(this, i);
        int i4 = i + 1;
        int emitGroup$dataIndex2 = emitGroup$dataIndex(this, i4);
        if (emitGroup$dataIndex >= 0 && emitGroup$dataIndex <= emitGroup$dataIndex2) {
            z = true;
        }
        if (!z || emitGroup$dataIndex2 > this.slotsSize) {
            sb.append(", *invalid data offsets " + emitGroup$dataIndex + '-' + emitGroup$dataIndex2 + '*');
        } else {
            if (SlotTableKt.hasObjectKey(this.groups, i)) {
                sb.append(" objectKey=" + this.slots[SlotTableKt.objectKeyIndex(this.groups, i)]);
            }
            if (SlotTableKt.isNode(this.groups, i)) {
                sb.append(" node=" + this.slots[SlotTableKt.nodeIndex(this.groups, i)]);
            }
            if (SlotTableKt.hasAux(this.groups, i)) {
                sb.append(" aux=" + this.slots[SlotTableKt.auxIndex(this.groups, i)]);
            }
            int access$slotAnchor = SlotTableKt.slotAnchor(this.groups, i);
            if (access$slotAnchor < emitGroup$dataIndex2) {
                sb.append(", slots=[");
                sb.append(access$slotAnchor);
                sb.append(": ");
                for (int i5 = access$slotAnchor; i5 < emitGroup$dataIndex2; i5++) {
                    if (i5 != access$slotAnchor) {
                        sb.append(", ");
                    }
                    sb.append(String.valueOf(this.slots[i5]));
                }
                sb.append("]");
            }
        }
        sb.append(10);
        int i6 = i + access$groupSize;
        while (i4 < i6) {
            i4 += emitGroup(sb, i4, i2 + 1);
        }
        return access$groupSize;
    }

    private static final int emitGroup$dataIndex(SlotTable slotTable, int i) {
        if (i >= slotTable.groupsSize) {
            return slotTable.slotsSize;
        }
        return SlotTableKt.dataAnchor(slotTable.groups, i);
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int i) {
        while (i > 0) {
            Iterator<Object> it = new DataIterator(this, i).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof RecomposeScopeImpl) {
                    return (RecomposeScopeImpl) next;
                }
            }
            i = SlotTableKt.parentAnchor(this.groups, i);
        }
        return null;
    }

    private final List<Integer> groupSizes() {
        return SlotTableKt.groupSizes(this.groups, this.groupsSize * 5);
    }

    private final boolean invalidateGroup(int i) {
        while (i >= 0) {
            Iterator<Object> it = new DataIterator(this, i).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof RecomposeScopeImpl) {
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) next;
                    recomposeScopeImpl.setRequiresRecompose(true);
                    if (recomposeScopeImpl.invalidateForResult((Object) null) != InvalidationResult.IGNORED) {
                        return true;
                    }
                    return false;
                }
            }
            i = SlotTableKt.parentAnchor(this.groups, i);
        }
        return false;
    }

    private static final void invalidateGroupsWithKey$lambda$14$scanGroup(SlotReader slotReader, int i, List<Anchor> list, C12755d0 d0Var, SlotTable slotTable, List<RecomposeScopeImpl> list2) {
        if (slotReader.getGroupKey() == i) {
            list.add(SlotReader.anchor$default(slotReader, 0, 1, (Object) null));
            if (d0Var.f20407b) {
                RecomposeScopeImpl findEffectiveRecomposeScope = slotTable.findEffectiveRecomposeScope(slotReader.getCurrentGroup());
                if (findEffectiveRecomposeScope != null) {
                    list2.add(findEffectiveRecomposeScope);
                } else {
                    d0Var.f20407b = false;
                    list2.clear();
                }
            }
            slotReader.skipGroup();
            return;
        }
        slotReader.startGroup();
        while (!slotReader.isGroupEnd()) {
            invalidateGroupsWithKey$lambda$14$scanGroup(slotReader, i, list, d0Var, slotTable, list2);
        }
        slotReader.endGroup();
    }

    private final List<Integer> keys() {
        return SlotTableKt.keys(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> nodes() {
        return SlotTableKt.nodeCounts(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> parentIndexes() {
        return SlotTableKt.parentAnchors(this.groups, this.groupsSize * 5);
    }

    private static final int verifyWellFormed$validateGroup(C12760f0 f0Var, SlotTable slotTable, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i4 = f0Var.f20416b;
        int i5 = i4 + 1;
        f0Var.f20416b = i5;
        int access$parentAnchor = SlotTableKt.parentAnchor(slotTable.groups, i4);
        boolean z11 = false;
        if (access$parentAnchor == i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int access$groupSize = SlotTableKt.groupSize(slotTable.groups, i4) + i4;
            if (access$groupSize <= slotTable.groupsSize) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (access$groupSize <= i2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    int access$dataAnchor = SlotTableKt.dataAnchor(slotTable.groups, i4);
                    if (i4 >= slotTable.groupsSize - 1) {
                        i3 = slotTable.slotsSize;
                    } else {
                        i3 = SlotTableKt.dataAnchor(slotTable.groups, i5);
                    }
                    if (i3 <= slotTable.slots.length) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if (access$dataAnchor <= i3) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            if (SlotTableKt.slotAnchor(slotTable.groups, i4) <= i3) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                if (i3 - access$dataAnchor >= (SlotTableKt.isNode(slotTable.groups, i4) ? 1 : 0) + (SlotTableKt.hasObjectKey(slotTable.groups, i4) ? 1 : 0) + (SlotTableKt.hasAux(slotTable.groups, i4) ? 1 : 0)) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    boolean access$isNode = SlotTableKt.isNode(slotTable.groups, i4);
                                    if (!access$isNode || slotTable.slots[SlotTableKt.nodeIndex(slotTable.groups, i4)] != null) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    if (z8) {
                                        int i6 = 0;
                                        while (f0Var.f20416b < access$groupSize) {
                                            i6 += verifyWellFormed$validateGroup(f0Var, slotTable, i4, access$groupSize);
                                        }
                                        int access$nodeCount = SlotTableKt.nodeCount(slotTable.groups, i4);
                                        int access$groupSize2 = SlotTableKt.groupSize(slotTable.groups, i4);
                                        if (access$nodeCount == i6) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        if (z9) {
                                            int i7 = f0Var.f20416b - i4;
                                            if (access$groupSize2 == i7) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                if (SlotTableKt.containsAnyMark(slotTable.groups, i4)) {
                                                    if (i4 <= 0 || SlotTableKt.containsMark(slotTable.groups, i)) {
                                                        z11 = true;
                                                    }
                                                    if (!z11) {
                                                        throw new IllegalStateException(("Expected group " + i + " to record it contains a mark because " + i4 + " does").toString());
                                                    }
                                                }
                                                if (access$isNode) {
                                                    return 1;
                                                }
                                                return i6;
                                            }
                                            throw new IllegalStateException(("Incorrect slot count detected at " + i4 + ", expected " + access$groupSize2 + ", received " + i7).toString());
                                        }
                                        throw new IllegalStateException(("Incorrect node count detected at " + i4 + ", expected " + access$nodeCount + ", received " + i6).toString());
                                    }
                                    throw new IllegalStateException(("No node recorded for a node group at " + i4).toString());
                                }
                                throw new IllegalStateException(("Not enough slots added for group " + i4).toString());
                            }
                            throw new IllegalStateException(("Slots start out of range at " + i4).toString());
                        }
                        throw new IllegalStateException(("Invalid data anchor at " + i4).toString());
                    }
                    throw new IllegalStateException(("Slots for " + i4 + " extend past the end of the slot table").toString());
                }
                throw new IllegalStateException(("A group extends past its parent group at " + i4).toString());
            }
            throw new IllegalStateException(("A group extends past the end of the table at " + i4).toString());
        }
        throw new IllegalStateException(("Invalid parent index detected at " + i4 + ", expected parent index to be " + i + " found " + access$parentAnchor).toString());
    }

    public final Anchor anchor(int i) {
        if (!this.writer) {
            boolean z = false;
            if (i >= 0 && i < this.groupsSize) {
                z = true;
            }
            if (z) {
                ArrayList<Anchor> arrayList = this.anchors;
                int access$search = SlotTableKt.search(arrayList, i, this.groupsSize);
                if (access$search < 0) {
                    Anchor anchor = new Anchor(i);
                    arrayList.add(-(access$search + 1), anchor);
                    return anchor;
                }
                Anchor anchor2 = arrayList.get(access$search);
                C12775o.m28638h(anchor2, "get(location)");
                return anchor2;
            }
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        ComposerKt.composeRuntimeError("use active SlotWriter to create an anchor location instead ".toString());
        throw new KotlinNothingValueException();
    }

    public final int anchorIndex(Anchor anchor) {
        C12775o.m28639i(anchor, "anchor");
        if (!(!this.writer)) {
            ComposerKt.composeRuntimeError("Use active SlotWriter to determine anchor location instead".toString());
            throw new KotlinNothingValueException();
        } else if (anchor.getValid()) {
            return anchor.getLocation$runtime_release();
        } else {
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
    }

    public final String asString() {
        if (this.writer) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(10);
        int i = this.groupsSize;
        if (i > 0) {
            int i2 = 0;
            while (i2 < i) {
                i2 += emitGroup(sb, i2, 0);
            }
        } else {
            sb.append("<EMPTY>");
        }
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void close$runtime_release(SlotReader slotReader) {
        C12775o.m28639i(slotReader, "reader");
        if (slotReader.getTable$runtime_release() == this && this.readers > 0) {
            this.readers--;
        } else {
            ComposerKt.composeRuntimeError("Unexpected reader close()".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final boolean containsMark() {
        if (this.groupsSize <= 0 || !SlotTableKt.containsMark(this.groups, 0)) {
            return false;
        }
        return true;
    }

    public CompositionGroup find(Object obj) {
        C12775o.m28639i(obj, "identityToFind");
        return new SlotTableGroup(this, 0, 0, 4, (DefaultConstructorMarker) null).find(obj);
    }

    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    public final int getVersion$runtime_release() {
        return this.version;
    }

    public final boolean getWriter$runtime_release() {
        return this.writer;
    }

    public final boolean groupContainsAnchor(int i, Anchor anchor) {
        boolean z;
        boolean z2;
        C12775o.m28639i(anchor, "anchor");
        if (!this.writer) {
            if (i < 0 || i >= this.groupsSize) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (ownsAnchor(anchor)) {
                    int access$groupSize = SlotTableKt.groupSize(this.groups, i) + i;
                    int location$runtime_release = anchor.getLocation$runtime_release();
                    if (i > location$runtime_release || location$runtime_release >= access$groupSize) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        return true;
                    }
                }
                return false;
            }
            ComposerKt.composeRuntimeError("Invalid group index".toString());
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("Writer is active".toString());
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: finally extract failed */
    public final List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release(int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C12755d0 d0Var = new C12755d0();
        d0Var.f20407b = true;
        SlotReader openReader = openReader();
        try {
            invalidateGroupsWithKey$lambda$14$scanGroup(openReader, i, arrayList, d0Var, this, arrayList2);
            C11921v vVar = C11921v.f18618a;
            openReader.close();
            SlotWriter openWriter = openWriter();
            try {
                openWriter.startGroup();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Anchor anchor = (Anchor) arrayList.get(i2);
                    if (anchor.toIndexFor(openWriter) >= openWriter.getCurrentGroup()) {
                        openWriter.seek(anchor);
                        openWriter.bashGroup$runtime_release();
                    }
                }
                openWriter.skipToGroupEnd();
                openWriter.endGroup();
                openWriter.close();
                if (d0Var.f20407b) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th) {
                openWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            openReader.close();
            throw th2;
        }
    }

    public boolean isEmpty() {
        if (this.groupsSize == 0) {
            return true;
        }
        return false;
    }

    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    public final SlotReader openReader() {
        if (!this.writer) {
            this.readers++;
            return new SlotReader(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    public final SlotWriter openWriter() {
        boolean z;
        if (!this.writer) {
            if (this.readers <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.writer = true;
                this.version++;
                return new SlotWriter(this);
            }
            ComposerKt.composeRuntimeError("Cannot start a writer when a reader is pending".toString());
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("Cannot start a writer when another writer is pending".toString());
        throw new KotlinNothingValueException();
    }

    public final boolean ownsAnchor(Anchor anchor) {
        boolean z;
        C12775o.m28639i(anchor, "anchor");
        if (!anchor.getValid()) {
            return false;
        }
        int access$search = SlotTableKt.search(this.anchors, anchor.getLocation$runtime_release(), this.groupsSize);
        if (access$search < 0 || !C12775o.m28634d(this.anchors.get(access$search), anchor)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final <T> T read(Function1<? super SlotReader, ? extends T> function1) {
        C12775o.m28639i(function1, "block");
        SlotReader openReader = openReader();
        try {
            return function1.invoke(openReader);
        } finally {
            C12773m.m28629b(1);
            openReader.close();
            C12773m.m28628a(1);
        }
    }

    public final void setAnchors$runtime_release(ArrayList<Anchor> arrayList) {
        C12775o.m28639i(arrayList, "<set-?>");
        this.anchors = arrayList;
    }

    public final void setTo$runtime_release(int[] iArr, int i, Object[] objArr, int i2, ArrayList<Anchor> arrayList) {
        C12775o.m28639i(iArr, "groups");
        C12775o.m28639i(objArr, "slots");
        C12775o.m28639i(arrayList, "anchors");
        this.groups = iArr;
        this.groupsSize = i;
        this.slots = objArr;
        this.slotsSize = i2;
        this.anchors = arrayList;
    }

    public final void setVersion$runtime_release(int i) {
        this.version = i;
    }

    public final List<Object> slotsOf$runtime_release(int i) {
        int i2;
        int access$dataAnchor = SlotTableKt.dataAnchor(this.groups, i);
        int i3 = i + 1;
        if (i3 < this.groupsSize) {
            i2 = SlotTableKt.dataAnchor(this.groups, i3);
        } else {
            i2 = this.slots.length;
        }
        return C12710p.m28405g0(this.slots).subList(access$dataAnchor, i2);
    }

    public final void verifyWellFormed() {
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        C12760f0 f0Var = new C12760f0();
        int i3 = -1;
        if (this.groupsSize > 0) {
            while (true) {
                i = f0Var.f20416b;
                i2 = this.groupsSize;
                if (i >= i2) {
                    break;
                }
                verifyWellFormed$validateGroup(f0Var, this, -1, i + SlotTableKt.groupSize(this.groups, i));
            }
            if (i == i2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                throw new IllegalStateException(("Incomplete group at root " + f0Var.f20416b + " expected to be " + this.groupsSize).toString());
            }
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            int indexFor = arrayList.get(i4).toIndexFor(this);
            if (indexFor < 0 || indexFor > this.groupsSize) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (i3 < indexFor) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i4++;
                    i3 = indexFor;
                } else {
                    throw new IllegalArgumentException("Anchor is out of order".toString());
                }
            } else {
                throw new IllegalArgumentException("Invalid anchor, location out of bound".toString());
            }
        }
    }

    public final <T> T write(Function1<? super SlotWriter, ? extends T> function1) {
        C12775o.m28639i(function1, "block");
        SlotWriter openWriter = openWriter();
        try {
            return function1.invoke(openWriter);
        } finally {
            C12773m.m28629b(1);
            openWriter.close();
            C12773m.m28628a(1);
        }
    }

    public final void close$runtime_release(SlotWriter slotWriter, int[] iArr, int i, Object[] objArr, int i2, ArrayList<Anchor> arrayList) {
        C12775o.m28639i(slotWriter, "writer");
        C12775o.m28639i(iArr, "groups");
        C12775o.m28639i(objArr, "slots");
        C12775o.m28639i(arrayList, "anchors");
        if (slotWriter.getTable$runtime_release() == this && this.writer) {
            this.writer = false;
            setTo$runtime_release(iArr, i, objArr, i2, arrayList);
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }

    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }
}
