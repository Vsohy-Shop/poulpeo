package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p336ef.C11915r;
import p436tf.C13525d;

@SourceDebugExtension({"SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n+ 2 DataIndex.kt\nandroidx/compose/foundation/lazy/DataIndex\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n1#1,515:1\n30#2:516\n25#2:521\n27#2:523\n25#2:524\n30#2:525\n33#3,4:517\n38#3:522\n33#3,6:526\n33#3,6:532\n33#3,4:541\n38#3:547\n33#3,6:549\n33#3,6:555\n33#3,6:561\n33#3,6:567\n33#3,6:573\n36#4,3:538\n39#4,2:545\n41#4:548\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n*L\n127#1:516\n152#1:521\n169#1:523\n176#1:524\n186#1:525\n151#1:517,4\n151#1:522\n248#1:526,6\n264#1:532,6\n330#1:541,4\n330#1:547\n376#1:549,6\n419#1:555,6\n494#1:561,6\n500#1:567,6\n505#1:573,6\n330#1:538,3\n330#1:545,2\n330#1:548\n*E\n"})
/* compiled from: LazyListMeasure.kt */
public final class LazyListMeasureKt {
    private static final C11906l<Integer, Integer> EmptyRange = C11915r.m25707a(Integer.MIN_VALUE, Integer.MIN_VALUE);

    private static final List<LazyListPositionedItem> calculateItemsOffsets(List<LazyMeasuredItem> list, List<LazyMeasuredItem> list2, List<LazyMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i6;
        boolean z3;
        boolean z4;
        List<LazyMeasuredItem> list4 = list;
        int i7 = i;
        int i8 = i2;
        Arrangement.Vertical vertical2 = vertical;
        boolean z5 = z2;
        int i9 = i4;
        if (z) {
            i6 = i8;
        } else {
            i6 = i7;
        }
        boolean z6 = true;
        if (i3 < Math.min(i6, i9)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (i5 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                z6 = false;
            }
            if (z6) {
                int size = list.size();
                int[] iArr = new int[size];
                for (int i10 = 0; i10 < size; i10++) {
                    iArr[i10] = list.get(calculateItemsOffsets$reverseAware(i10, z5, size)).getSize();
                }
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = 0;
                }
                if (!z) {
                    Density density2 = density;
                    if (horizontal != null) {
                        horizontal.arrange(density, i6, iArr, LayoutDirection.Ltr, iArr2);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (vertical2 != null) {
                    vertical2.arrange(density, i6, iArr, iArr2);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                C13525d J = C12710p.m28382J(iArr2);
                if (z5) {
                    J = C13537l.m30891r(J);
                }
                int j = J.mo53147j();
                int k = J.mo53148k();
                int q = J.mo53149q();
                if ((q > 0 && j <= k) || (q < 0 && k <= j)) {
                    while (true) {
                        int i12 = iArr2[j];
                        LazyMeasuredItem lazyMeasuredItem = list.get(calculateItemsOffsets$reverseAware(j, z5, size));
                        if (z5) {
                            i12 = (i6 - i12) - lazyMeasuredItem.getSize();
                        }
                        arrayList.add(lazyMeasuredItem.position(i12, i7, i8));
                        if (j == k) {
                            break;
                        }
                        j += q;
                    }
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            int size2 = list2.size();
            int i13 = i5;
            for (int i14 = 0; i14 < size2; i14++) {
                List<LazyMeasuredItem> list5 = list2;
                LazyMeasuredItem lazyMeasuredItem2 = list2.get(i14);
                i13 -= lazyMeasuredItem2.getSizeWithSpacings();
                arrayList.add(lazyMeasuredItem2.position(i13, i7, i8));
            }
            int size3 = list.size();
            int i15 = i5;
            for (int i16 = 0; i16 < size3; i16++) {
                LazyMeasuredItem lazyMeasuredItem3 = list.get(i16);
                arrayList.add(lazyMeasuredItem3.position(i15, i7, i8));
                i15 += lazyMeasuredItem3.getSizeWithSpacings();
            }
            int size4 = list3.size();
            for (int i17 = 0; i17 < size4; i17++) {
                LazyMeasuredItem lazyMeasuredItem4 = list3.get(i17);
                arrayList.add(lazyMeasuredItem4.position(i15, i7, i8));
                i15 += lazyMeasuredItem4.getSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        if (!z) {
            return i;
        }
        return (i2 - i) - 1;
    }

    private static final List<LazyMeasuredItem> createItemsAfterList(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, List<LazyMeasuredItem> list, LazyMeasuredItemProvider lazyMeasuredItemProvider, LazyListItemProvider lazyListItemProvider, int i, int i2, LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        int index = ((LazyMeasuredItem) C12686e0.m28231j0(list)).getIndex();
        if (lazyListBeyondBoundsInfo.hasIntervals()) {
            index = Math.max(createItemsAfterList$endIndex(lazyListBeyondBoundsInfo, i), index);
        }
        int min = Math.min(index + i2, i - 1);
        int index2 = ((LazyMeasuredItem) C12686e0.m28231j0(list)).getIndex() + 1;
        if (index2 <= min) {
            while (true) {
                createItemsAfterList$addItem(ref$ObjectRef, lazyMeasuredItemProvider, index2);
                if (index2 == min) {
                    break;
                }
                index2++;
            }
        }
        int size = lazyLayoutPinnedItemList.size();
        for (int i3 = 0; i3 < size; i3++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = (LazyLayoutPinnedItemList.PinnedItem) lazyLayoutPinnedItemList.get(i3);
            int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyListItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            if (findIndexByKey > min && findIndexByKey < i) {
                createItemsAfterList$addItem(ref$ObjectRef, lazyMeasuredItemProvider, findIndexByKey);
            }
        }
        List<LazyMeasuredItem> list2 = (List) ref$ObjectRef.f20403b;
        if (list2 == null) {
            return C12726w.m28524k();
        }
        return list2;
    }

    private static final void createItemsAfterList$addItem(Ref$ObjectRef<List<LazyMeasuredItem>> ref$ObjectRef, LazyMeasuredItemProvider lazyMeasuredItemProvider, int i) {
        if (ref$ObjectRef.f20403b == null) {
            ref$ObjectRef.f20403b = new ArrayList();
        }
        T t = ref$ObjectRef.f20403b;
        if (t != null) {
            ((List) t).add(lazyMeasuredItemProvider.m33425getAndMeasureZjPyQlc(DataIndex.m33391constructorimpl(i)));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private static final int createItemsAfterList$endIndex(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i) {
        return Math.min(lazyListBeyondBoundsInfo.getEnd(), i - 1);
    }

    /* renamed from: createItemsBeforeList-tv8sHfA  reason: not valid java name */
    private static final List<LazyMeasuredItem> m33413createItemsBeforeListtv8sHfA(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i, LazyMeasuredItemProvider lazyMeasuredItemProvider, LazyListItemProvider lazyListItemProvider, int i2, int i3, LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        int i4;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (lazyListBeyondBoundsInfo.hasIntervals()) {
            i4 = Math.min(createItemsBeforeList_tv8sHfA$startIndex(lazyListBeyondBoundsInfo, i2), i);
        } else {
            i4 = i;
        }
        int max = Math.max(0, i4 - i3);
        int i5 = i - 1;
        if (max <= i5) {
            while (true) {
                createItemsBeforeList_tv8sHfA$addItem$5(ref$ObjectRef, lazyMeasuredItemProvider, i5);
                if (i5 == max) {
                    break;
                }
                i5--;
            }
        }
        int size = lazyLayoutPinnedItemList.size();
        for (int i6 = 0; i6 < size; i6++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = (LazyLayoutPinnedItemList.PinnedItem) lazyLayoutPinnedItemList.get(i6);
            int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyListItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            if (findIndexByKey < max) {
                createItemsBeforeList_tv8sHfA$addItem$5(ref$ObjectRef, lazyMeasuredItemProvider, findIndexByKey);
            }
        }
        List<LazyMeasuredItem> list = (List) ref$ObjectRef.f20403b;
        if (list == null) {
            return C12726w.m28524k();
        }
        return list;
    }

    private static final void createItemsBeforeList_tv8sHfA$addItem$5(Ref$ObjectRef<List<LazyMeasuredItem>> ref$ObjectRef, LazyMeasuredItemProvider lazyMeasuredItemProvider, int i) {
        if (ref$ObjectRef.f20403b == null) {
            ref$ObjectRef.f20403b = new ArrayList();
        }
        T t = ref$ObjectRef.f20403b;
        if (t != null) {
            ((List) t).add(lazyMeasuredItemProvider.m33425getAndMeasureZjPyQlc(DataIndex.m33391constructorimpl(i)));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private static final int createItemsBeforeList_tv8sHfA$startIndex(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i) {
        return Math.min(lazyListBeyondBoundsInfo.getStart(), i - 1);
    }

    private static final boolean getNotInEmptyRange(int i) {
        if (i != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: androidx.compose.foundation.lazy.LazyMeasuredItem} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01f2  */
    /* renamed from: measureLazyList-Hh3qtAg  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.lazy.LazyListMeasureResult m33414measureLazyListHh3qtAg(int r32, androidx.compose.foundation.lazy.LazyListItemProvider r33, androidx.compose.foundation.lazy.LazyMeasuredItemProvider r34, int r35, int r36, int r37, int r38, int r39, int r40, float r41, long r42, boolean r44, java.util.List<java.lang.Integer> r45, androidx.compose.foundation.layout.Arrangement.Vertical r46, androidx.compose.foundation.layout.Arrangement.Horizontal r47, boolean r48, androidx.compose.p002ui.unit.Density r49, androidx.compose.foundation.lazy.LazyListItemPlacementAnimator r50, androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo r51, int r52, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList r53, p404of.C13089p<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.layout.Placeable.PlacementScope, p336ef.C11921v>, ? extends androidx.compose.p002ui.layout.MeasureResult> r54) {
        /*
            r9 = r32
            r7 = r34
            r8 = r35
            r15 = r36
            r10 = r42
            r14 = r45
            r13 = r54
            java.lang.String r0 = "itemProvider"
            r12 = r33
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            java.lang.String r0 = "measuredItemProvider"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            java.lang.String r0 = "headerIndexes"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            java.lang.String r0 = "density"
            r6 = r49
            kotlin.jvm.internal.C12775o.m28639i(r6, r0)
            java.lang.String r0 = "placementAnimator"
            r5 = r50
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            java.lang.String r0 = "beyondBoundsInfo"
            r4 = r51
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            java.lang.String r0 = "pinnedItems"
            r3 = r53
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            java.lang.String r0 = "layout"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            r23 = 1
            r2 = 0
            if (r15 < 0) goto L_0x0048
            r0 = r23
            goto L_0x0049
        L_0x0048:
            r0 = r2
        L_0x0049:
            java.lang.String r1 = "Failed requirement."
            if (r0 == 0) goto L_0x03b0
            if (r37 < 0) goto L_0x0052
            r0 = r23
            goto L_0x0053
        L_0x0052:
            r0 = r2
        L_0x0053:
            if (r0 == 0) goto L_0x03a6
            if (r9 > 0) goto L_0x0091
            androidx.compose.foundation.lazy.LazyListMeasureResult r14 = new androidx.compose.foundation.lazy.LazyListMeasureResult
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            int r0 = androidx.compose.p002ui.unit.Constraints.m38414getMinWidthimpl(r42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r5 = androidx.compose.p002ui.unit.Constraints.m38413getMinHeightimpl(r42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$1 r6 = androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$1.INSTANCE
            java.lang.Object r0 = r13.invoke(r0, r5, r6)
            r5 = r0
            androidx.compose.ui.layout.MeasureResult r5 = (androidx.compose.p002ui.layout.MeasureResult) r5
            java.util.List r6 = kotlin.collections.C12726w.m28524k()
            int r7 = -r15
            int r8 = r8 + r37
            r9 = 0
            if (r44 == 0) goto L_0x0083
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x0085
        L_0x0083:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x0085:
            r11 = r0
            r0 = r14
            r10 = r48
            r12 = r37
            r13 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        L_0x0091:
            r0 = r39
            if (r0 < r9) goto L_0x009e
            int r0 = r9 + -1
            int r0 = androidx.compose.foundation.lazy.DataIndex.m33391constructorimpl(r0)
            r16 = r2
            goto L_0x00a0
        L_0x009e:
            r16 = r40
        L_0x00a0:
            int r17 = p418qf.C13265c.m30134c(r41)
            int r16 = r16 - r17
            int r3 = androidx.compose.foundation.lazy.DataIndex.m33391constructorimpl(r2)
            boolean r3 = androidx.compose.foundation.lazy.DataIndex.m33394equalsimpl0(r0, r3)
            if (r3 == 0) goto L_0x00b6
            if (r16 >= 0) goto L_0x00b6
            int r17 = r17 + r16
            r16 = r2
        L_0x00b6:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r2 = -r15
            if (r38 >= 0) goto L_0x00c3
            r19 = r38
            r20 = r0
            goto L_0x00c7
        L_0x00c3:
            r20 = r0
            r19 = 0
        L_0x00c7:
            int r0 = r2 + r19
            int r16 = r16 + r0
            r4 = 0
            r31 = r16
            r16 = r2
            r2 = r31
        L_0x00d2:
            if (r2 >= 0) goto L_0x0103
            r39 = 0
            int r18 = androidx.compose.foundation.lazy.DataIndex.m33391constructorimpl(r39)
            int r18 = r20 - r18
            if (r18 <= 0) goto L_0x0103
            int r20 = r20 + -1
            int r5 = androidx.compose.foundation.lazy.DataIndex.m33391constructorimpl(r20)
            androidx.compose.foundation.lazy.LazyMeasuredItem r6 = r7.m33425getAndMeasureZjPyQlc(r5)
            r40 = r5
            r5 = r39
            r3.add(r5, r6)
            int r5 = r6.getCrossAxisSize()
            int r4 = java.lang.Math.max(r4, r5)
            int r5 = r6.getSizeWithSpacings()
            int r2 = r2 + r5
            r20 = r40
            r6 = r49
            r5 = r50
            goto L_0x00d2
        L_0x0103:
            if (r2 >= r0) goto L_0x0108
            int r17 = r17 + r2
            r2 = r0
        L_0x0108:
            int r2 = r2 - r0
            int r6 = r8 + r37
            r19 = r4
            r5 = 0
            int r4 = p436tf.C13537l.m30877d(r6, r5)
            int r5 = -r2
            r39 = r2
            int r2 = r3.size()
            r21 = r5
            r22 = r20
            r5 = 0
        L_0x011e:
            if (r5 >= r2) goto L_0x0135
            java.lang.Object r24 = r3.get(r5)
            androidx.compose.foundation.lazy.LazyMeasuredItem r24 = (androidx.compose.foundation.lazy.LazyMeasuredItem) r24
            int r22 = r22 + 1
            int r22 = androidx.compose.foundation.lazy.DataIndex.m33391constructorimpl(r22)
            int r24 = r24.getSizeWithSpacings()
            int r21 = r21 + r24
            int r5 = r5 + 1
            goto L_0x011e
        L_0x0135:
            r2 = r39
            r39 = r6
            r5 = r19
            r6 = r21
            r14 = r22
        L_0x013f:
            if (r14 >= r9) goto L_0x0186
            if (r6 < r4) goto L_0x014b
            if (r6 <= 0) goto L_0x014b
            boolean r19 = r3.isEmpty()
            if (r19 == 0) goto L_0x0186
        L_0x014b:
            r40 = r4
            androidx.compose.foundation.lazy.LazyMeasuredItem r4 = r7.m33425getAndMeasureZjPyQlc(r14)
            int r19 = r4.getSizeWithSpacings()
            int r6 = r6 + r19
            if (r6 > r0) goto L_0x016d
            r19 = r0
            int r0 = r9 + -1
            if (r14 == r0) goto L_0x016f
            int r0 = r14 + 1
            int r0 = androidx.compose.foundation.lazy.DataIndex.m33391constructorimpl(r0)
            int r4 = r4.getSizeWithSpacings()
            int r2 = r2 - r4
            r20 = r0
            goto L_0x017b
        L_0x016d:
            r19 = r0
        L_0x016f:
            int r0 = r4.getCrossAxisSize()
            int r0 = java.lang.Math.max(r5, r0)
            r3.add(r4)
            r5 = r0
        L_0x017b:
            int r14 = r14 + 1
            int r14 = androidx.compose.foundation.lazy.DataIndex.m33391constructorimpl(r14)
            r4 = r40
            r0 = r19
            goto L_0x013f
        L_0x0186:
            if (r6 >= r8) goto L_0x01c5
            int r0 = r8 - r6
            int r2 = r2 - r0
            int r6 = r6 + r0
        L_0x018c:
            if (r2 >= r15) goto L_0x01b8
            r4 = 0
            int r18 = androidx.compose.foundation.lazy.DataIndex.m33391constructorimpl(r4)
            int r18 = r20 - r18
            if (r18 <= 0) goto L_0x01b8
            int r20 = r20 + -1
            int r12 = androidx.compose.foundation.lazy.DataIndex.m33391constructorimpl(r20)
            androidx.compose.foundation.lazy.LazyMeasuredItem r13 = r7.m33425getAndMeasureZjPyQlc(r12)
            r3.add(r4, r13)
            int r4 = r13.getCrossAxisSize()
            int r5 = java.lang.Math.max(r5, r4)
            int r4 = r13.getSizeWithSpacings()
            int r2 = r2 + r4
            r13 = r54
            r20 = r12
            r12 = r33
            goto L_0x018c
        L_0x01b8:
            int r17 = r17 + r0
            if (r2 >= 0) goto L_0x01c5
            int r17 = r17 + r2
            int r6 = r6 + r2
            r12 = r5
            r13 = r6
            r0 = r17
            r2 = 0
            goto L_0x01c9
        L_0x01c5:
            r12 = r5
            r13 = r6
            r0 = r17
        L_0x01c9:
            int r4 = p418qf.C13265c.m30134c(r41)
            int r4 = p418qf.C13265c.m30132a(r4)
            int r5 = p418qf.C13265c.m30132a(r0)
            if (r4 != r5) goto L_0x01e8
            int r4 = p418qf.C13265c.m30134c(r41)
            int r4 = java.lang.Math.abs(r4)
            int r5 = java.lang.Math.abs(r0)
            if (r4 < r5) goto L_0x01e8
            float r0 = (float) r0
            r6 = r0
            goto L_0x01ea
        L_0x01e8:
            r6 = r41
        L_0x01ea:
            if (r2 < 0) goto L_0x01ef
            r0 = r23
            goto L_0x01f0
        L_0x01ef:
            r0 = 0
        L_0x01f0:
            if (r0 == 0) goto L_0x039c
            int r5 = -r2
            java.lang.Object r0 = kotlin.collections.C12686e0.m28221Z(r3)
            androidx.compose.foundation.lazy.LazyMeasuredItem r0 = (androidx.compose.foundation.lazy.LazyMeasuredItem) r0
            if (r15 > 0) goto L_0x0202
            if (r38 >= 0) goto L_0x01fe
            goto L_0x0202
        L_0x01fe:
            r4 = r0
            r24 = r2
            goto L_0x0236
        L_0x0202:
            int r1 = r3.size()
            r4 = r2
            r2 = r0
            r0 = 0
        L_0x0209:
            if (r0 >= r1) goto L_0x0230
            java.lang.Object r17 = r3.get(r0)
            androidx.compose.foundation.lazy.LazyMeasuredItem r17 = (androidx.compose.foundation.lazy.LazyMeasuredItem) r17
            r40 = r1
            int r1 = r17.getSizeWithSpacings()
            if (r4 == 0) goto L_0x0230
            if (r1 > r4) goto L_0x0230
            r41 = r2
            int r2 = kotlin.collections.C12726w.m28526m(r3)
            if (r0 == r2) goto L_0x0232
            int r4 = r4 - r1
            int r0 = r0 + 1
            java.lang.Object r1 = r3.get(r0)
            r2 = r1
            androidx.compose.foundation.lazy.LazyMeasuredItem r2 = (androidx.compose.foundation.lazy.LazyMeasuredItem) r2
            r1 = r40
            goto L_0x0209
        L_0x0230:
            r41 = r2
        L_0x0232:
            r24 = r4
            r4 = r41
        L_0x0236:
            r0 = r51
            r1 = r20
            r26 = r16
            r25 = 0
            r2 = r34
            r27 = r3
            r3 = r33
            r7 = r4
            r4 = r32
            r17 = r5
            r5 = r52
            r28 = r39
            r8 = r6
            r6 = r53
            java.util.List r6 = m33413createItemsBeforeListtv8sHfA(r0, r1, r2, r3, r4, r5, r6)
            int r0 = r6.size()
            r2 = r25
        L_0x025a:
            if (r2 >= r0) goto L_0x026d
            java.lang.Object r1 = r6.get(r2)
            androidx.compose.foundation.lazy.LazyMeasuredItem r1 = (androidx.compose.foundation.lazy.LazyMeasuredItem) r1
            int r1 = r1.getCrossAxisSize()
            int r12 = java.lang.Math.max(r12, r1)
            int r2 = r2 + 1
            goto L_0x025a
        L_0x026d:
            r0 = r51
            r1 = r27
            r2 = r34
            r3 = r33
            r4 = r32
            r5 = r52
            r16 = r6
            r6 = r53
            java.util.List r0 = createItemsAfterList(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r0.size()
            r2 = r25
        L_0x0287:
            if (r2 >= r1) goto L_0x029a
            java.lang.Object r3 = r0.get(r2)
            androidx.compose.foundation.lazy.LazyMeasuredItem r3 = (androidx.compose.foundation.lazy.LazyMeasuredItem) r3
            int r3 = r3.getCrossAxisSize()
            int r12 = java.lang.Math.max(r12, r3)
            int r2 = r2 + 1
            goto L_0x0287
        L_0x029a:
            java.lang.Object r1 = kotlin.collections.C12686e0.m28221Z(r27)
            boolean r1 = kotlin.jvm.internal.C12775o.m28634d(r7, r1)
            if (r1 == 0) goto L_0x02b3
            boolean r1 = r16.isEmpty()
            if (r1 == 0) goto L_0x02b3
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x02b3
            r6 = r23
            goto L_0x02b5
        L_0x02b3:
            r6 = r25
        L_0x02b5:
            if (r44 == 0) goto L_0x02b9
            r1 = r12
            goto L_0x02ba
        L_0x02b9:
            r1 = r13
        L_0x02ba:
            int r29 = androidx.compose.p002ui.unit.ConstraintsKt.m38426constrainWidthK40F9xA(r10, r1)
            if (r44 == 0) goto L_0x02c1
            r12 = r13
        L_0x02c1:
            int r30 = androidx.compose.p002ui.unit.ConstraintsKt.m38425constrainHeightK40F9xA(r10, r12)
            r10 = r27
            r11 = r16
            r12 = r0
            r5 = r54
            r4 = r13
            r13 = r29
            r3 = r14
            r14 = r30
            r15 = r4
            r16 = r35
            r18 = r44
            r19 = r46
            r20 = r47
            r21 = r48
            r22 = r49
            java.util.List r10 = calculateItemsOffsets(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            int r1 = (int) r8
            r0 = r50
            r2 = r29
            r14 = r3
            r3 = r30
            r11 = r4
            r4 = r10
            r12 = r5
            r5 = r34
            r0.onMeasured(r1, r2, r3, r4, r5)
            r0 = r45
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x030f
            r0 = r10
            r1 = r34
            r2 = r45
            r3 = r36
            r4 = r29
            r5 = r30
            androidx.compose.foundation.lazy.LazyListPositionedItem r0 = androidx.compose.foundation.lazy.LazyListHeadersKt.findOrComposeLazyListHeader(r0, r1, r2, r3, r4, r5)
            goto L_0x0310
        L_0x030f:
            r0 = 0
        L_0x0310:
            if (r14 < r9) goto L_0x031b
            r1 = r35
            r4 = r8
            if (r11 <= r1) goto L_0x0318
            goto L_0x031c
        L_0x0318:
            r3 = r25
            goto L_0x031e
        L_0x031b:
            r4 = r8
        L_0x031c:
            r3 = r23
        L_0x031e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r29)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r30)
            androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$5 r5 = new androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$5
            r5.<init>(r10, r0)
            java.lang.Object r1 = r12.invoke(r1, r2, r5)
            r5 = r1
            androidx.compose.ui.layout.MeasureResult r5 = (androidx.compose.p002ui.layout.MeasureResult) r5
            if (r6 == 0) goto L_0x0336
            r6 = r10
            goto L_0x037e
        L_0x0336:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r10.size()
            r1.<init>(r2)
            int r2 = r10.size()
            r6 = r25
        L_0x0345:
            if (r6 >= r2) goto L_0x037d
            java.lang.Object r8 = r10.get(r6)
            r11 = r8
            androidx.compose.foundation.lazy.LazyListPositionedItem r11 = (androidx.compose.foundation.lazy.LazyListPositionedItem) r11
            int r12 = r11.getIndex()
            java.lang.Object r13 = kotlin.collections.C12686e0.m28221Z(r27)
            androidx.compose.foundation.lazy.LazyMeasuredItem r13 = (androidx.compose.foundation.lazy.LazyMeasuredItem) r13
            int r13 = r13.getIndex()
            if (r12 < r13) goto L_0x036e
            int r12 = r11.getIndex()
            java.lang.Object r13 = kotlin.collections.C12686e0.m28231j0(r27)
            androidx.compose.foundation.lazy.LazyMeasuredItem r13 = (androidx.compose.foundation.lazy.LazyMeasuredItem) r13
            int r13 = r13.getIndex()
            if (r12 <= r13) goto L_0x0370
        L_0x036e:
            if (r11 != r0) goto L_0x0373
        L_0x0370:
            r11 = r23
            goto L_0x0375
        L_0x0373:
            r11 = r25
        L_0x0375:
            if (r11 == 0) goto L_0x037a
            r1.add(r8)
        L_0x037a:
            int r6 = r6 + 1
            goto L_0x0345
        L_0x037d:
            r6 = r1
        L_0x037e:
            if (r44 == 0) goto L_0x0383
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x0385
        L_0x0383:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x0385:
            r11 = r0
            androidx.compose.foundation.lazy.LazyListMeasureResult r14 = new androidx.compose.foundation.lazy.LazyListMeasureResult
            r0 = r14
            r1 = r7
            r2 = r24
            r7 = r26
            r8 = r28
            r9 = r32
            r10 = r48
            r12 = r37
            r13 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        L_0x039c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x03a6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x03b0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureKt.m33414measureLazyListHh3qtAg(int, androidx.compose.foundation.lazy.LazyListItemProvider, androidx.compose.foundation.lazy.LazyMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, java.util.List, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.LazyListItemPlacementAnimator, androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo, int, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList, of.p):androidx.compose.foundation.lazy.LazyListMeasureResult");
    }
}
