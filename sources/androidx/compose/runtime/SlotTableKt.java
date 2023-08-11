package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3443:1\n82#2,3:3444\n33#2,4:3447\n85#2,2:3451\n38#2:3453\n87#2:3454\n1#3:3455\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n3246#1:3444,3\n3246#1:3447,4\n3246#1:3451,2\n3246#1:3453\n3246#1:3454\n*E\n"})
/* compiled from: SlotTable.kt */
public final class SlotTableKt {
    private static final int Aux_Mask = 268435456;
    private static final int Aux_Shift = 28;
    private static final int ContainsMark_Mask = 67108864;
    private static final int DataAnchor_Offset = 4;
    private static final int GroupInfo_Offset = 1;
    private static final int Group_Fields_Size = 5;
    private static final int Key_Offset = 0;
    private static final int Mark_Mask = 134217728;
    private static final int MinGroupGrowthSize = 32;
    private static final int MinSlotsGrowthSize = 32;
    private static final int NodeBit_Mask = 1073741824;
    private static final int NodeCount_Mask = 67108863;
    private static final int ObjectKey_Mask = 536870912;
    private static final int ObjectKey_Shift = 29;
    private static final int ParentAnchor_Offset = 2;
    private static final int Size_Offset = 3;
    private static final int Slots_Shift = 28;
    private static final int parentAnchorPivot = -2;

    /* access modifiers changed from: private */
    public static final void addAux(int[] iArr, int i) {
        int i2 = (i * 5) + 1;
        iArr[i2] = iArr[i2] | Aux_Mask;
    }

    /* access modifiers changed from: private */
    public static final int auxIndex(int[] iArr, int i) {
        int i2 = i * 5;
        if (i2 >= iArr.length) {
            return iArr.length;
        }
        return countOneBits(iArr[i2 + 1] >> 29) + iArr[i2 + 4];
    }

    /* access modifiers changed from: private */
    public static final boolean containsAnyMark(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 201326592) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean containsMark(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & ContainsMark_Mask) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final int countOneBits(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* access modifiers changed from: private */
    public static final int dataAnchor(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    /* access modifiers changed from: private */
    public static final List<Integer> dataAnchors(int[] iArr, int i) {
        return slice(iArr, C13537l.m30892s(C13537l.m30893t(4, i), 5));
    }

    static /* synthetic */ List dataAnchors$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return dataAnchors(iArr, i);
    }

    private static final Anchor getOrAdd(ArrayList<Anchor> arrayList, int i, int i2, C13074a<Anchor> aVar) {
        int access$search = search(arrayList, i, i2);
        if (access$search < 0) {
            Anchor invoke = aVar.invoke();
            arrayList.add(-(access$search + 1), invoke);
            return invoke;
        }
        Anchor anchor = arrayList.get(access$search);
        C12775o.m28638h(anchor, "get(location)");
        return anchor;
    }

    /* access modifiers changed from: private */
    public static final int groupInfo(int[] iArr, int i) {
        return iArr[(i * 5) + 1];
    }

    /* access modifiers changed from: private */
    public static final int groupSize(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    /* access modifiers changed from: private */
    public static final List<Integer> groupSizes(int[] iArr, int i) {
        return slice(iArr, C13537l.m30892s(C13537l.m30893t(3, i), 5));
    }

    static /* synthetic */ List groupSizes$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return groupSizes(iArr, i);
    }

    /* access modifiers changed from: private */
    public static final boolean hasAux(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & Aux_Mask) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean hasMark(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & Mark_Mask) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean hasObjectKey(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & ObjectKey_Mask) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final void initGroup(int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (z) {
            i5 = 1073741824;
        } else {
            i5 = 0;
        }
        if (z2) {
            i6 = ObjectKey_Mask;
        } else {
            i6 = 0;
        }
        if (z3) {
            i7 = Aux_Mask;
        } else {
            i7 = 0;
        }
        int i8 = i * 5;
        iArr[i8 + 0] = i2;
        iArr[i8 + 1] = i5 | i6 | i7;
        iArr[i8 + 2] = i3;
        iArr[i8 + 3] = 0;
        iArr[i8 + 4] = i4;
    }

    /* access modifiers changed from: private */
    public static final boolean isNode(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final int key(int[] iArr, int i) {
        return iArr[i * 5];
    }

    /* access modifiers changed from: private */
    public static final List<Integer> keys(int[] iArr, int i) {
        return slice(iArr, C13537l.m30892s(C13537l.m30893t(0, i), 5));
    }

    static /* synthetic */ List keys$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return keys(iArr, i);
    }

    /* access modifiers changed from: private */
    public static final int locationOf(ArrayList<Anchor> arrayList, int i, int i2) {
        int search = search(arrayList, i, i2);
        if (search >= 0) {
            return search;
        }
        return -(search + 1);
    }

    /* access modifiers changed from: private */
    public static final int nodeCount(int[] iArr, int i) {
        return iArr[(i * 5) + 1] & NodeCount_Mask;
    }

    /* access modifiers changed from: private */
    public static final List<Integer> nodeCounts(int[] iArr, int i) {
        List<Integer> slice = slice(iArr, C13537l.m30892s(C13537l.m30893t(1, i), 5));
        ArrayList arrayList = new ArrayList(slice.size());
        int size = slice.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Integer.valueOf(slice.get(i2).intValue() & NodeCount_Mask));
        }
        return arrayList;
    }

    static /* synthetic */ List nodeCounts$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return nodeCounts(iArr, i);
    }

    /* access modifiers changed from: private */
    public static final int nodeIndex(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    /* access modifiers changed from: private */
    public static final int objectKeyIndex(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + countOneBits(iArr[i2 + 1] >> 30);
    }

    /* access modifiers changed from: private */
    public static final int parentAnchor(int[] iArr, int i) {
        return iArr[(i * 5) + 2];
    }

    /* access modifiers changed from: private */
    public static final List<Integer> parentAnchors(int[] iArr, int i) {
        return slice(iArr, C13537l.m30892s(C13537l.m30893t(2, i), 5));
    }

    static /* synthetic */ List parentAnchors$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iArr.length;
        }
        return parentAnchors(iArr, i);
    }

    /* access modifiers changed from: private */
    public static final int search(ArrayList<Anchor> arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int location$runtime_release = arrayList.get(i4).getLocation$runtime_release();
            if (location$runtime_release < 0) {
                location$runtime_release += i2;
            }
            int k = C12775o.m28641k(location$runtime_release, i);
            if (k < 0) {
                i3 = i4 + 1;
            } else if (k <= 0) {
                return i4;
            } else {
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    private static final List<Integer> slice(int[] iArr, Iterable<Integer> iterable) {
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : iterable) {
            arrayList.add(Integer.valueOf(iArr[intValue.intValue()]));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final int slotAnchor(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + countOneBits(iArr[i2 + 1] >> 28);
    }

    /* access modifiers changed from: private */
    public static final void updateContainsMark(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        if (z) {
            iArr[i2] = iArr[i2] | ContainsMark_Mask;
        } else {
            iArr[i2] = iArr[i2] & -67108865;
        }
    }

    /* access modifiers changed from: private */
    public static final void updateDataAnchor(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = i2;
    }

    private static final void updateGroupKey(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 0] = i2;
    }

    /* access modifiers changed from: private */
    public static final void updateGroupSize(int[] iArr, int i, int i2) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        ComposerKt.runtimeCheck(z);
        iArr[(i * 5) + 3] = i2;
    }

    /* access modifiers changed from: private */
    public static final void updateMark(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        if (z) {
            iArr[i2] = iArr[i2] | Mark_Mask;
        } else {
            iArr[i2] = iArr[i2] & -134217729;
        }
    }

    /* access modifiers changed from: private */
    public static final void updateNodeCount(int[] iArr, int i, int i2) {
        boolean z;
        if (i2 < 0 || i2 >= NodeCount_Mask) {
            z = false;
        } else {
            z = true;
        }
        ComposerKt.runtimeCheck(z);
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & -67108864);
    }

    /* access modifiers changed from: private */
    public static final void updateParentAnchor(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 2] = i2;
    }
}
