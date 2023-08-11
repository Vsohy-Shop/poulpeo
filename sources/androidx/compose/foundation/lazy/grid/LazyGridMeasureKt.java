package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p436tf.C13525d;

@SourceDebugExtension({"SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n+ 2 ItemIndex.kt\nandroidx/compose/foundation/lazy/grid/LineIndex\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n1#1,435:1\n315#1,3:446\n318#1,14:453\n333#1:468\n315#1,3:469\n318#1,14:476\n333#1:491\n30#2:436\n25#2:441\n27#2:443\n25#2:444\n30#2:445\n33#3,4:437\n38#3:442\n33#3,4:449\n38#3:467\n33#3,4:472\n38#3:490\n33#3,4:495\n38#3:501\n33#3,6:503\n132#3,3:509\n33#3,4:512\n135#3,2:516\n38#3:518\n137#3:519\n33#3,6:520\n33#3,6:526\n33#3,6:532\n36#4,3:492\n39#4,2:499\n41#4:502\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n*L\n213#1:446,3\n213#1:453,14\n213#1:468\n221#1:469,3\n221#1:476,14\n221#1:491\n118#1:436\n142#1:441\n163#1:443\n168#1:444\n178#1:445\n141#1:437,4\n141#1:442\n213#1:449,4\n213#1:467\n221#1:472,4\n221#1:490\n294#1:495,4\n294#1:501\n317#1:503,6\n360#1:509,3\n360#1:512,4\n360#1:516,2\n360#1:518\n360#1:519\n403#1:520,6\n409#1:526,6\n414#1:532,6\n294#1:492,3\n294#1:499,2\n294#1:502\n*E\n"})
/* compiled from: LazyGridMeasure.kt */
public final class LazyGridMeasureKt {
    @ExperimentalFoundationApi
    private static final List<LazyGridMeasuredItem> calculateExtraItems(LazyLayoutPinnedItemList lazyLayoutPinnedItemList, LazyMeasuredItemProvider lazyMeasuredItemProvider, LazyGridItemProvider lazyGridItemProvider, Function1<? super ItemIndex, Constraints> function1, Function1<? super Integer, Boolean> function12) {
        int size = lazyLayoutPinnedItemList.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            LazyLayoutPinnedItemList lazyLayoutPinnedItemList2 = lazyLayoutPinnedItemList;
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = (LazyLayoutPinnedItemList.PinnedItem) lazyLayoutPinnedItemList.get(i);
            int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyGridItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            if (function12.invoke(Integer.valueOf(findIndexByKey)).booleanValue()) {
                int r9 = ItemIndex.m33442constructorimpl(findIndexByKey);
                LazyMeasuredItemProvider lazyMeasuredItemProvider2 = lazyMeasuredItemProvider;
                LazyGridMeasuredItem r4 = LazyMeasuredItemProvider.m33489getAndMeasureednRnyU$default(lazyMeasuredItemProvider2, r9, 0, function1.invoke(ItemIndex.m33440boximpl(r9)).m38418unboximpl(), 2, (Object) null);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(r4);
            } else {
                Function1<? super ItemIndex, Constraints> function13 = function1;
            }
        }
        if (arrayList == null) {
            return C12726w.m28524k();
        }
        return arrayList;
    }

    private static final List<LazyGridPositionedItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i6;
        boolean z3;
        boolean z4;
        List<LazyGridMeasuredLine> list4 = list;
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
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += list.get(i11).getItems().length;
        }
        ArrayList arrayList = new ArrayList(i10);
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                z6 = false;
            }
            if (z6) {
                int size2 = list.size();
                int[] iArr = new int[size2];
                for (int i12 = 0; i12 < size2; i12++) {
                    iArr[i12] = list.get(calculateItemsOffsets$reverseAware(i12, z5, size2)).getMainAxisSize();
                }
                int[] iArr2 = new int[size2];
                for (int i13 = 0; i13 < size2; i13++) {
                    iArr2[i13] = 0;
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
                        int i14 = iArr2[j];
                        LazyGridMeasuredLine lazyGridMeasuredLine = list.get(calculateItemsOffsets$reverseAware(j, z5, size2));
                        if (z5) {
                            i14 = (i6 - i14) - lazyGridMeasuredLine.getMainAxisSize();
                        }
                        arrayList.addAll(lazyGridMeasuredLine.position(i14, i7, i8));
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
            int size3 = list2.size();
            int i15 = i5;
            for (int i16 = 0; i16 < size3; i16++) {
                List<LazyGridMeasuredItem> list5 = list2;
                LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(i16);
                i15 -= lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                arrayList.add(positionExtraItem(lazyGridMeasuredItem, i15, i7, i8));
            }
            int size4 = list.size();
            int i17 = i5;
            for (int i18 = 0; i18 < size4; i18++) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(i18);
                arrayList.addAll(lazyGridMeasuredLine2.position(i17, i7, i8));
                i17 += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i19 = 0; i19 < size5; i19++) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i19);
                arrayList.add(positionExtraItem(lazyGridMeasuredItem2, i17, i7, i8));
                i17 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v10, resolved type: androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01d7  */
    /* renamed from: measureLazyGrid-t5wl_D8  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.lazy.grid.LazyGridMeasureResult m33474measureLazyGridt5wl_D8(int r34, androidx.compose.foundation.lazy.grid.LazyGridItemProvider r35, androidx.compose.foundation.lazy.grid.LazyMeasuredLineProvider r36, androidx.compose.foundation.lazy.grid.LazyMeasuredItemProvider r37, int r38, int r39, int r40, int r41, int r42, int r43, float r44, long r45, boolean r47, androidx.compose.foundation.layout.Arrangement.Vertical r48, androidx.compose.foundation.layout.Arrangement.Horizontal r49, boolean r50, androidx.compose.p002ui.unit.Density r51, androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator r52, androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider r53, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList r54, p404of.C13089p<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.layout.Placeable.PlacementScope, p336ef.C11921v>, ? extends androidx.compose.p002ui.layout.MeasureResult> r55) {
        /*
            r9 = r34
            r0 = r35
            r1 = r36
            r2 = r38
            r3 = r39
            r4 = r45
            r6 = r54
            r7 = r55
            java.lang.String r8 = "itemProvider"
            kotlin.jvm.internal.C12775o.m28639i(r0, r8)
            java.lang.String r8 = "measuredLineProvider"
            kotlin.jvm.internal.C12775o.m28639i(r1, r8)
            java.lang.String r8 = "measuredItemProvider"
            r15 = r37
            kotlin.jvm.internal.C12775o.m28639i(r15, r8)
            java.lang.String r8 = "density"
            r13 = r51
            kotlin.jvm.internal.C12775o.m28639i(r13, r8)
            java.lang.String r8 = "placementAnimator"
            r14 = r52
            kotlin.jvm.internal.C12775o.m28639i(r14, r8)
            java.lang.String r8 = "spanLayoutProvider"
            r12 = r53
            kotlin.jvm.internal.C12775o.m28639i(r12, r8)
            java.lang.String r8 = "pinnedItems"
            kotlin.jvm.internal.C12775o.m28639i(r6, r8)
            java.lang.String r8 = "layout"
            kotlin.jvm.internal.C12775o.m28639i(r7, r8)
            r11 = 0
            if (r3 < 0) goto L_0x0045
            r10 = 1
            goto L_0x0046
        L_0x0045:
            r10 = r11
        L_0x0046:
            java.lang.String r16 = "Failed requirement."
            if (r10 == 0) goto L_0x0441
            if (r40 < 0) goto L_0x004e
            r10 = 1
            goto L_0x004f
        L_0x004e:
            r10 = r11
        L_0x004f:
            if (r10 == 0) goto L_0x0437
            if (r9 > 0) goto L_0x0095
            androidx.compose.foundation.lazy.grid.LazyGridMeasureResult r14 = new androidx.compose.foundation.lazy.grid.LazyGridMeasureResult
            r1 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            int r0 = androidx.compose.p002ui.unit.Constraints.m38414getMinWidthimpl(r45)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = androidx.compose.p002ui.unit.Constraints.m38413getMinHeightimpl(r45)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$1 r5 = androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$1.INSTANCE
            java.lang.Object r0 = r7.invoke(r0, r4, r5)
            r5 = r0
            androidx.compose.ui.layout.MeasureResult r5 = (androidx.compose.p002ui.layout.MeasureResult) r5
            java.util.List r7 = kotlin.collections.C12726w.m28524k()
            int r10 = -r3
            int r11 = r2 + r40
            r12 = 0
            if (r47 == 0) goto L_0x007f
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x0081
        L_0x007f:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x0081:
            r13 = r0
            r0 = r14
            r2 = r6
            r3 = r8
            r4 = r9
            r6 = r7
            r7 = r10
            r8 = r11
            r9 = r12
            r10 = r50
            r11 = r13
            r12 = r40
            r13 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        L_0x0095:
            int r10 = p418qf.C13265c.m30134c(r44)
            int r17 = r43 - r10
            int r8 = androidx.compose.foundation.lazy.grid.LineIndex.m33496constructorimpl(r11)
            r11 = r42
            boolean r8 = androidx.compose.foundation.lazy.grid.LineIndex.m33499equalsimpl0(r11, r8)
            if (r8 == 0) goto L_0x00ad
            if (r17 >= 0) goto L_0x00ad
            int r10 = r10 + r17
            r17 = 0
        L_0x00ad:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r15 = -r3
            if (r41 >= 0) goto L_0x00b8
            r19 = r41
            goto L_0x00ba
        L_0x00b8:
            r19 = 0
        L_0x00ba:
            int r11 = r15 + r19
            int r17 = r17 + r11
            r12 = r17
            r17 = r42
        L_0x00c2:
            if (r12 >= 0) goto L_0x00eb
            r42 = 0
            int r18 = androidx.compose.foundation.lazy.grid.LineIndex.m33496constructorimpl(r42)
            int r18 = r17 - r18
            if (r18 <= 0) goto L_0x00eb
            int r17 = r17 + -1
            int r13 = androidx.compose.foundation.lazy.grid.LineIndex.m33496constructorimpl(r17)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r14 = r1.m33492getAndMeasurebKFJvoY(r13)
            r43 = r13
            r13 = r42
            r8.add(r13, r14)
            int r13 = r14.getMainAxisSizeWithSpacings()
            int r12 = r12 + r13
            r17 = r43
            r13 = r51
            r14 = r52
            goto L_0x00c2
        L_0x00eb:
            if (r12 >= r11) goto L_0x00ef
            int r10 = r10 + r12
            r12 = r11
        L_0x00ef:
            int r12 = r12 - r11
            int r13 = r2 + r40
            r19 = r15
            r14 = 0
            int r15 = p436tf.C13537l.m30877d(r13, r14)
            int r14 = -r12
            r42 = r12
            int r12 = r8.size()
            r20 = r14
            r21 = r17
            r14 = 0
        L_0x0105:
            if (r14 >= r12) goto L_0x011c
            java.lang.Object r22 = r8.get(r14)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r22 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r22
            int r21 = r21 + 1
            int r21 = androidx.compose.foundation.lazy.grid.LineIndex.m33496constructorimpl(r21)
            int r22 = r22.getMainAxisSizeWithSpacings()
            int r20 = r20 + r22
            int r14 = r14 + 1
            goto L_0x0105
        L_0x011c:
            r12 = r42
            r42 = r13
            r14 = r20
            r13 = r21
        L_0x0124:
            if (r13 >= r9) goto L_0x017d
            if (r14 < r15) goto L_0x0130
            if (r14 <= 0) goto L_0x0130
            boolean r20 = r8.isEmpty()
            if (r20 == 0) goto L_0x017d
        L_0x0130:
            r43 = r15
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r15 = r1.m33492getAndMeasurebKFJvoY(r13)
            boolean r20 = r15.isEmpty()
            if (r20 == 0) goto L_0x013d
            goto L_0x017d
        L_0x013d:
            int r20 = r15.getMainAxisSizeWithSpacings()
            int r14 = r14 + r20
            if (r14 > r11) goto L_0x0169
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r20 = r15.getItems()
            java.lang.Object r20 = kotlin.collections.C12710p.m28393U(r20)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r20 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r20
            r21 = r11
            int r11 = r20.m33476getIndexVZbfaAc()
            r20 = r14
            int r14 = r9 + -1
            if (r11 == r14) goto L_0x016d
            int r11 = r13 + 1
            int r11 = androidx.compose.foundation.lazy.grid.LineIndex.m33496constructorimpl(r11)
            int r14 = r15.getMainAxisSizeWithSpacings()
            int r12 = r12 - r14
            r17 = r11
            goto L_0x0170
        L_0x0169:
            r21 = r11
            r20 = r14
        L_0x016d:
            r8.add(r15)
        L_0x0170:
            int r13 = r13 + 1
            int r13 = androidx.compose.foundation.lazy.grid.LineIndex.m33496constructorimpl(r13)
            r15 = r43
            r14 = r20
            r11 = r21
            goto L_0x0124
        L_0x017d:
            if (r14 >= r2) goto L_0x01ac
            int r11 = r2 - r14
            int r12 = r12 - r11
            int r14 = r14 + r11
        L_0x0183:
            r13 = 0
            if (r12 >= r3) goto L_0x01a5
            int r15 = androidx.compose.foundation.lazy.grid.LineIndex.m33496constructorimpl(r13)
            int r15 = r17 - r15
            if (r15 <= 0) goto L_0x01a5
            int r17 = r17 + -1
            int r15 = androidx.compose.foundation.lazy.grid.LineIndex.m33496constructorimpl(r17)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r7 = r1.m33492getAndMeasurebKFJvoY(r15)
            r8.add(r13, r7)
            int r7 = r7.getMainAxisSizeWithSpacings()
            int r12 = r12 + r7
            r7 = r55
            r17 = r15
            goto L_0x0183
        L_0x01a5:
            int r10 = r10 + r11
            if (r12 >= 0) goto L_0x01ad
            int r10 = r10 + r12
            int r14 = r14 + r12
            r7 = r13
            goto L_0x01ae
        L_0x01ac:
            r13 = 0
        L_0x01ad:
            r7 = r12
        L_0x01ae:
            r15 = r14
            int r11 = p418qf.C13265c.m30134c(r44)
            int r11 = p418qf.C13265c.m30132a(r11)
            int r12 = p418qf.C13265c.m30132a(r10)
            if (r11 != r12) goto L_0x01ce
            int r11 = p418qf.C13265c.m30134c(r44)
            int r11 = java.lang.Math.abs(r11)
            int r12 = java.lang.Math.abs(r10)
            if (r11 < r12) goto L_0x01ce
            float r10 = (float) r10
            r14 = r10
            goto L_0x01d0
        L_0x01ce:
            r14 = r44
        L_0x01d0:
            if (r7 < 0) goto L_0x01d4
            r10 = 1
            goto L_0x01d5
        L_0x01d4:
            r10 = r13
        L_0x01d5:
            if (r10 == 0) goto L_0x042d
            int r12 = -r7
            java.lang.Object r10 = kotlin.collections.C12686e0.m28221Z(r8)
            r17 = r10
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r17 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r17
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r10 = r17.getItems()
            java.lang.Object r10 = kotlin.collections.C12710p.m28381I(r10)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r10 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r10
            if (r10 == 0) goto L_0x01f2
            int r10 = r10.m33476getIndexVZbfaAc()
            r11 = r10
            goto L_0x01f3
        L_0x01f2:
            r11 = r13
        L_0x01f3:
            java.lang.Object r10 = kotlin.collections.C12686e0.m28232k0(r8)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r10 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r10
            if (r10 == 0) goto L_0x020e
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r10 = r10.getItems()
            if (r10 == 0) goto L_0x020e
            java.lang.Object r10 = kotlin.collections.C12710p.m28395W(r10)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r10 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r10
            if (r10 == 0) goto L_0x020e
            int r10 = r10.m33476getIndexVZbfaAc()
            goto L_0x020f
        L_0x020e:
            r10 = r13
        L_0x020f:
            r43 = r15
            int r15 = r54.size()
            r18 = 0
            r16 = r12
            r12 = r13
            r20 = r18
        L_0x021c:
            if (r12 >= r15) goto L_0x02a6
            java.lang.Object r21 = r6.get(r12)
            androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList$PinnedItem r21 = (androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem) r21
            java.lang.Object r13 = r21.getKey()
            r23 = r7
            int r7 = r21.getIndex()
            int r7 = androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt.findIndexByKey(r0, r13, r7)
            if (r7 < 0) goto L_0x0238
            if (r7 >= r11) goto L_0x0238
            r13 = 1
            goto L_0x0239
        L_0x0238:
            r13 = 0
        L_0x0239:
            if (r13 == 0) goto L_0x027a
            int r7 = androidx.compose.foundation.lazy.grid.ItemIndex.m33442constructorimpl(r7)
            long r24 = r1.m33493itemConstraintsHZ0wssc(r7)
            r13 = 0
            r21 = 2
            r26 = 0
            r27 = r10
            r10 = r37
            r29 = r11
            r28 = 0
            r11 = r7
            r22 = r12
            r7 = r16
            r12 = r13
            r30 = r42
            r31 = r14
            r13 = r24
            r32 = r43
            r24 = r19
            r19 = r15
            r15 = r21
            r16 = r26
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r10 = androidx.compose.foundation.lazy.grid.LazyMeasuredItemProvider.m33489getAndMeasureednRnyU$default(r10, r11, r12, r13, r15, r16)
            if (r20 != 0) goto L_0x0272
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            goto L_0x0274
        L_0x0272:
            r11 = r20
        L_0x0274:
            r11.add(r10)
            r20 = r11
            goto L_0x028e
        L_0x027a:
            r30 = r42
            r32 = r43
            r27 = r10
            r29 = r11
            r22 = r12
            r31 = r14
            r7 = r16
            r24 = r19
            r28 = 0
            r19 = r15
        L_0x028e:
            int r12 = r22 + 1
            r16 = r7
            r15 = r19
            r7 = r23
            r19 = r24
            r10 = r27
            r13 = r28
            r11 = r29
            r42 = r30
            r14 = r31
            r43 = r32
            goto L_0x021c
        L_0x02a6:
            r30 = r42
            r32 = r43
            r23 = r7
            r27 = r10
            r29 = r11
            r28 = r13
            r31 = r14
            r7 = r16
            r24 = r19
            if (r20 != 0) goto L_0x02be
            java.util.List r20 = kotlin.collections.C12726w.m28524k()
        L_0x02be:
            r25 = r20
            int r15 = r54.size()
            r13 = r28
        L_0x02c6:
            if (r13 >= r15) goto L_0x0323
            java.lang.Object r10 = r6.get(r13)
            androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList$PinnedItem r10 = (androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem) r10
            java.lang.Object r11 = r10.getKey()
            int r10 = r10.getIndex()
            int r10 = androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt.findIndexByKey(r0, r11, r10)
            r14 = r27
            int r11 = r14 + 1
            if (r11 > r10) goto L_0x02e4
            if (r10 >= r9) goto L_0x02e4
            r11 = 1
            goto L_0x02e6
        L_0x02e4:
            r11 = r28
        L_0x02e6:
            if (r11 == 0) goto L_0x0316
            int r11 = androidx.compose.foundation.lazy.grid.ItemIndex.m33442constructorimpl(r10)
            long r19 = r1.m33493itemConstraintsHZ0wssc(r11)
            r12 = 0
            r16 = 2
            r21 = 0
            r10 = r37
            r22 = r13
            r33 = r14
            r13 = r19
            r19 = r15
            r15 = r16
            r16 = r21
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r10 = androidx.compose.foundation.lazy.grid.LazyMeasuredItemProvider.m33489getAndMeasureednRnyU$default(r10, r11, r12, r13, r15, r16)
            if (r18 != 0) goto L_0x030e
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
        L_0x030e:
            r11 = r18
            r11.add(r10)
            r18 = r11
            goto L_0x031c
        L_0x0316:
            r22 = r13
            r33 = r14
            r19 = r15
        L_0x031c:
            int r13 = r22 + 1
            r15 = r19
            r27 = r33
            goto L_0x02c6
        L_0x0323:
            r33 = r27
            if (r18 != 0) goto L_0x032b
            java.util.List r18 = kotlin.collections.C12726w.m28524k()
        L_0x032b:
            r0 = r18
            if (r3 > 0) goto L_0x0337
            if (r41 >= 0) goto L_0x0332
            goto L_0x0337
        L_0x0332:
            r1 = r17
            r3 = r23
            goto L_0x0363
        L_0x0337:
            int r1 = r8.size()
            r3 = r23
            r11 = r28
        L_0x033f:
            if (r11 >= r1) goto L_0x0361
            java.lang.Object r6 = r8.get(r11)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r6 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r6
            int r6 = r6.getMainAxisSizeWithSpacings()
            if (r3 == 0) goto L_0x0361
            if (r6 > r3) goto L_0x0361
            int r10 = kotlin.collections.C12726w.m28526m(r8)
            if (r11 == r10) goto L_0x0361
            int r3 = r3 - r6
            int r11 = r11 + 1
            java.lang.Object r6 = r8.get(r11)
            r17 = r6
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r17 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine) r17
            goto L_0x033f
        L_0x0361:
            r1 = r17
        L_0x0363:
            if (r47 == 0) goto L_0x036e
            int r6 = androidx.compose.p002ui.unit.Constraints.m38412getMaxWidthimpl(r45)
            r23 = r6
            r6 = r32
            goto L_0x0376
        L_0x036e:
            r6 = r32
            int r10 = androidx.compose.p002ui.unit.ConstraintsKt.m38426constrainWidthK40F9xA(r4, r6)
            r23 = r10
        L_0x0376:
            if (r47 == 0) goto L_0x037d
            int r4 = androidx.compose.p002ui.unit.ConstraintsKt.m38425constrainHeightK40F9xA(r4, r6)
            goto L_0x0381
        L_0x037d:
            int r4 = androidx.compose.p002ui.unit.Constraints.m38411getMaxHeightimpl(r45)
        L_0x0381:
            r10 = r8
            r11 = r25
            r12 = r0
            r13 = r23
            r14 = r4
            r15 = r6
            r16 = r38
            r17 = r7
            r18 = r47
            r19 = r48
            r20 = r49
            r21 = r50
            r22 = r51
            java.util.List r5 = calculateItemsOffsets(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r7 = r31
            int r11 = (int) r7
            r10 = r52
            r12 = r23
            r13 = r4
            r14 = r5
            r15 = r37
            r16 = r53
            r10.onMeasured(r11, r12, r13, r14, r15, r16)
            int r8 = r9 + -1
            r10 = r33
            if (r10 != r8) goto L_0x03b7
            if (r6 <= r2) goto L_0x03b4
            goto L_0x03b7
        L_0x03b4:
            r6 = r28
            goto L_0x03b8
        L_0x03b7:
            r6 = 1
        L_0x03b8:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$3 r8 = new androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$3
            r8.<init>(r5)
            r11 = r55
            java.lang.Object r2 = r11.invoke(r2, r4, r8)
            r8 = r2
            androidx.compose.ui.layout.MeasureResult r8 = (androidx.compose.p002ui.layout.MeasureResult) r8
            boolean r2 = r25.isEmpty()
            if (r2 == 0) goto L_0x03dc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x03dc
            r10 = r5
            goto L_0x040d
        L_0x03dc:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r5.size()
            r0.<init>(r2)
            int r2 = r5.size()
            r11 = r28
        L_0x03eb:
            if (r11 >= r2) goto L_0x040c
            java.lang.Object r4 = r5.get(r11)
            r12 = r4
            androidx.compose.foundation.lazy.grid.LazyGridPositionedItem r12 = (androidx.compose.foundation.lazy.grid.LazyGridPositionedItem) r12
            int r12 = r12.getIndex()
            r13 = r29
            if (r13 > r12) goto L_0x0400
            if (r12 > r10) goto L_0x0400
            r12 = 1
            goto L_0x0402
        L_0x0400:
            r12 = r28
        L_0x0402:
            if (r12 == 0) goto L_0x0407
            r0.add(r4)
        L_0x0407:
            int r11 = r11 + 1
            r29 = r13
            goto L_0x03eb
        L_0x040c:
            r10 = r0
        L_0x040d:
            if (r47 == 0) goto L_0x0412
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x0414
        L_0x0412:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x0414:
            r11 = r0
            androidx.compose.foundation.lazy.grid.LazyGridMeasureResult r14 = new androidx.compose.foundation.lazy.grid.LazyGridMeasureResult
            r0 = r14
            r2 = r3
            r3 = r6
            r4 = r7
            r5 = r8
            r6 = r10
            r7 = r24
            r8 = r30
            r9 = r34
            r10 = r50
            r12 = r40
            r13 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        L_0x042d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r16.toString()
            r0.<init>(r1)
            throw r0
        L_0x0437:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r16.toString()
            r0.<init>(r1)
            throw r0
        L_0x0441:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r16.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.m33474measureLazyGridt5wl_D8(int, androidx.compose.foundation.lazy.grid.LazyGridItemProvider, androidx.compose.foundation.lazy.grid.LazyMeasuredLineProvider, androidx.compose.foundation.lazy.grid.LazyMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator, androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList, of.p):androidx.compose.foundation.lazy.grid.LazyGridMeasureResult");
    }

    private static final LazyGridPositionedItem positionExtraItem(LazyGridMeasuredItem lazyGridMeasuredItem, int i, int i2, int i3) {
        return lazyGridMeasuredItem.position(i, 0, i2, i3, 0, 0);
    }
}
