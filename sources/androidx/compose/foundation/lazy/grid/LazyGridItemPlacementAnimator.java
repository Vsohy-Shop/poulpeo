package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12074d;
import p355hf.C12079g;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nLazyGridItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,412:1\n101#2,2:413\n33#2,6:415\n103#2:421\n33#2,4:422\n38#2:427\n33#2,6:430\n33#2,6:438\n101#2,2:445\n33#2,6:447\n103#2:453\n33#2,6:457\n33#2,6:465\n69#2,4:474\n74#2:480\n101#2,2:481\n33#2,4:483\n38#2:488\n103#2:489\n86#3:426\n86#3:471\n86#3:472\n79#3:473\n86#3:478\n79#3:479\n86#3:487\n1011#4,2:428\n1002#4,2:436\n1855#4:444\n1856#4:454\n1011#4,2:455\n1002#4,2:463\n*S KotlinDebug\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n77#1:413,2\n77#1:415,6\n77#1:421\n96#1:422,4\n96#1:427\n131#1:430,6\n149#1:438,6\n171#1:445,2\n171#1:447,6\n171#1:453\n199#1:457,6\n227#1:465,6\n338#1:474,4\n338#1:480\n376#1:481,2\n376#1:483,4\n376#1:488\n376#1:489\n116#1:426\n272#1:471\n273#1:472\n332#1:473\n339#1:478\n344#1:479\n377#1:487\n128#1:428,2\n148#1:436,2\n164#1:444\n164#1:454\n198#1:455,2\n226#1:463,2\n*E\n"})
/* compiled from: LazyGridItemPlacementAnimator.kt */
public final class LazyGridItemPlacementAnimator {
    private int firstVisibleIndex;
    private final boolean isVertical;
    /* access modifiers changed from: private */
    public Map<Object, Integer> keyToIndexMap = C12716r0.m28416g();
    private final Map<Object, ItemInfo> keyToItemInfoMap = new LinkedHashMap();
    private final LinkedHashSet<Object> movingAwayKeys = new LinkedHashSet<>();
    private final List<LazyGridMeasuredItem> movingAwayToEndBound = new ArrayList();
    private final List<LazyGridMeasuredItem> movingAwayToStartBound = new ArrayList();
    private final List<LazyGridPositionedItem> movingInFromEndBound = new ArrayList();
    private final List<LazyGridPositionedItem> movingInFromStartBound = new ArrayList();
    private final C13995l0 scope;

    public LazyGridItemPlacementAnimator(C13995l0 l0Var, boolean z) {
        C12775o.m28639i(l0Var, "scope");
        this.scope = l0Var;
        this.isVertical = z;
    }

    private final ItemInfo createItemInfo(LazyGridPositionedItem lazyGridPositionedItem, int i) {
        long j;
        ItemInfo itemInfo = new ItemInfo(lazyGridPositionedItem.getCrossAxisSize(), lazyGridPositionedItem.getCrossAxisOffset());
        if (this.isVertical) {
            j = IntOffset.m38582copyiSbpLlY$default(lazyGridPositionedItem.m33479getOffsetnOccac(), 0, i, 1, (Object) null);
        } else {
            j = IntOffset.m38582copyiSbpLlY$default(lazyGridPositionedItem.m33479getOffsetnOccac(), i, 0, 2, (Object) null);
        }
        int placeablesCount = lazyGridPositionedItem.getPlaceablesCount();
        for (int i2 = 0; i2 < placeablesCount; i2++) {
            itemInfo.getPlaceables().add(new PlaceableInfo(j, lazyGridPositionedItem.getMainAxisSize(i2), (DefaultConstructorMarker) null));
        }
        return itemInfo;
    }

    static /* synthetic */ ItemInfo createItemInfo$default(LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, LazyGridPositionedItem lazyGridPositionedItem, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = lazyGridItemPlacementAnimator.m33463getMainAxisgyyYBs(lazyGridPositionedItem.m33479getOffsetnOccac());
        }
        return lazyGridItemPlacementAnimator.createItemInfo(lazyGridPositionedItem, i);
    }

    private final int getLine(LazyGridPositionedItem lazyGridPositionedItem) {
        if (this.isVertical) {
            return lazyGridPositionedItem.getRow();
        }
        return lazyGridPositionedItem.getColumn();
    }

    /* renamed from: getMainAxis--gyyYBs  reason: not valid java name */
    private final int m33463getMainAxisgyyYBs(long j) {
        if (this.isVertical) {
            return IntOffset.m38587getYimpl(j);
        }
        return IntOffset.m38586getXimpl(j);
    }

    private final boolean isWithinBounds(ItemInfo itemInfo, int i) {
        boolean z;
        List<PlaceableInfo> placeables = itemInfo.getPlaceables();
        int size = placeables.size();
        for (int i2 = 0; i2 < size; i2++) {
            PlaceableInfo placeableInfo = placeables.get(i2);
            long r5 = placeableInfo.m33509getTargetOffsetnOccac();
            long r7 = itemInfo.m33453getNotAnimatableDeltanOccac();
            long IntOffset = IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(r5) + IntOffset.m38586getXimpl(r7), IntOffset.m38587getYimpl(r5) + IntOffset.m38587getYimpl(r7));
            if (m33463getMainAxisgyyYBs(IntOffset) + placeableInfo.getMainAxisSize() <= 0 || m33463getMainAxisgyyYBs(IntOffset) >= i) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private final void startAnimationsIfNeeded(LazyGridPositionedItem lazyGridPositionedItem, ItemInfo itemInfo) {
        LazyGridPositionedItem lazyGridPositionedItem2 = lazyGridPositionedItem;
        while (itemInfo.getPlaceables().size() > lazyGridPositionedItem.getPlaceablesCount()) {
            Object unused = C12669b0.m28190N(itemInfo.getPlaceables());
        }
        while (itemInfo.getPlaceables().size() < lazyGridPositionedItem.getPlaceablesCount()) {
            int size = itemInfo.getPlaceables().size();
            long r4 = lazyGridPositionedItem.m33479getOffsetnOccac();
            List<PlaceableInfo> placeables = itemInfo.getPlaceables();
            long r7 = itemInfo.m33453getNotAnimatableDeltanOccac();
            placeables.add(new PlaceableInfo(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(r4) - IntOffset.m38586getXimpl(r7), IntOffset.m38587getYimpl(r4) - IntOffset.m38587getYimpl(r7)), lazyGridPositionedItem2.getMainAxisSize(size), (DefaultConstructorMarker) null));
        }
        List<PlaceableInfo> placeables2 = itemInfo.getPlaceables();
        int size2 = placeables2.size();
        for (int i = 0; i < size2; i++) {
            PlaceableInfo placeableInfo = placeables2.get(i);
            long r6 = placeableInfo.m33509getTargetOffsetnOccac();
            long r8 = itemInfo.m33453getNotAnimatableDeltanOccac();
            long IntOffset = IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(r6) + IntOffset.m38586getXimpl(r8), IntOffset.m38587getYimpl(r6) + IntOffset.m38587getYimpl(r8));
            long r82 = lazyGridPositionedItem.m33479getOffsetnOccac();
            placeableInfo.setMainAxisSize(lazyGridPositionedItem2.getMainAxisSize(i));
            FiniteAnimationSpec<IntOffset> animationSpec = lazyGridPositionedItem2.getAnimationSpec(i);
            if (!IntOffset.m38585equalsimpl0(IntOffset, r82)) {
                long r62 = itemInfo.m33453getNotAnimatableDeltanOccac();
                placeableInfo.m33510setTargetOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(r82) - IntOffset.m38586getXimpl(r62), IntOffset.m38587getYimpl(r82) - IntOffset.m38587getYimpl(r62)));
                if (animationSpec != null) {
                    placeableInfo.setInProgress(true);
                    C14054y1 unused2 = C13985j.m32422d(this.scope, (C12079g) null, (C14004n0) null, new LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1(placeableInfo, animationSpec, (C12074d<? super LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1>) null), 3, (Object) null);
                }
            }
        }
    }

    /* renamed from: toOffset-Bjo55l4  reason: not valid java name */
    private final long m33464toOffsetBjo55l4(int i) {
        int i2;
        boolean z = this.isVertical;
        if (z) {
            i2 = 0;
        } else {
            i2 = i;
        }
        if (!z) {
            i = 0;
        }
        return IntOffsetKt.IntOffset(i2, i);
    }

    /* renamed from: getAnimatedOffset-YT5a7pE  reason: not valid java name */
    public final long m33465getAnimatedOffsetYT5a7pE(Object obj, int i, int i2, int i3, long j) {
        C12775o.m28639i(obj, "key");
        ItemInfo itemInfo = this.keyToItemInfoMap.get(obj);
        if (itemInfo == null) {
            return j;
        }
        PlaceableInfo placeableInfo = itemInfo.getPlaceables().get(i);
        long r11 = placeableInfo.getAnimatedOffset().getValue().m38595unboximpl();
        long r0 = itemInfo.m33453getNotAnimatableDeltanOccac();
        long IntOffset = IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(r11) + IntOffset.m38586getXimpl(r0), IntOffset.m38587getYimpl(r11) + IntOffset.m38587getYimpl(r0));
        long r02 = placeableInfo.m33509getTargetOffsetnOccac();
        long r2 = itemInfo.m33453getNotAnimatableDeltanOccac();
        long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(r02) + IntOffset.m38586getXimpl(r2), IntOffset.m38587getYimpl(r02) + IntOffset.m38587getYimpl(r2));
        if (placeableInfo.getInProgress() && ((m33463getMainAxisgyyYBs(IntOffset2) <= i2 && m33463getMainAxisgyyYBs(IntOffset) < i2) || (m33463getMainAxisgyyYBs(IntOffset2) >= i3 && m33463getMainAxisgyyYBs(IntOffset) > i3))) {
            C14054y1 unused = C13985j.m32422d(this.scope, (C12079g) null, (C14004n0) null, new LazyGridItemPlacementAnimator$getAnimatedOffset$1(placeableInfo, (C12074d<? super LazyGridItemPlacementAnimator$getAnimatedOffset$1>) null), 3, (Object) null);
        }
        return IntOffset;
    }

    public final void onMeasured(int i, int i2, int i3, List<LazyGridPositionedItem> list, LazyMeasuredItemProvider lazyMeasuredItemProvider, LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider) {
        boolean z;
        int i4;
        int i5;
        boolean z2;
        long j;
        int i6;
        List<LazyGridPositionedItem> list2 = list;
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider2 = lazyGridSpanLayoutProvider;
        C12775o.m28639i(list2, "positionedItems");
        C12775o.m28639i(lazyMeasuredItemProvider, "itemProvider");
        C12775o.m28639i(lazyGridSpanLayoutProvider2, "spanLayoutProvider");
        int size = list.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                z = false;
                break;
            } else if (list2.get(i8).getHasAnimations()) {
                z = true;
                break;
            } else {
                i8++;
            }
        }
        if (z || !this.keyToItemInfoMap.isEmpty()) {
            int i9 = this.firstVisibleIndex;
            LazyGridPositionedItem lazyGridPositionedItem = (LazyGridPositionedItem) C12686e0.m28223b0(list);
            if (lazyGridPositionedItem != null) {
                i4 = lazyGridPositionedItem.getIndex();
            } else {
                i4 = 0;
            }
            this.firstVisibleIndex = i4;
            Map<Object, Integer> map = this.keyToIndexMap;
            this.keyToIndexMap = lazyMeasuredItemProvider.getKeyToIndexMap();
            if (this.isVertical) {
                i5 = i3;
            } else {
                i5 = i2;
            }
            long r4 = m33464toOffsetBjo55l4(i);
            this.movingAwayKeys.addAll(this.keyToItemInfoMap.keySet());
            int size2 = list.size();
            int i10 = 0;
            while (i10 < size2) {
                LazyGridPositionedItem lazyGridPositionedItem2 = list2.get(i10);
                this.movingAwayKeys.remove(lazyGridPositionedItem2.getKey());
                if (lazyGridPositionedItem2.getHasAnimations()) {
                    ItemInfo itemInfo = this.keyToItemInfoMap.get(lazyGridPositionedItem2.getKey());
                    if (itemInfo == null) {
                        Integer num = map.get(lazyGridPositionedItem2.getKey());
                        if (num == null || lazyGridPositionedItem2.getIndex() == num.intValue()) {
                            i6 = i9;
                            this.keyToItemInfoMap.put(lazyGridPositionedItem2.getKey(), createItemInfo$default(this, lazyGridPositionedItem2, i7, 2, (Object) null));
                        } else {
                            if (num.intValue() < i9) {
                                this.movingInFromStartBound.add(lazyGridPositionedItem2);
                            } else {
                                this.movingInFromEndBound.add(lazyGridPositionedItem2);
                            }
                            i6 = i9;
                        }
                    } else {
                        i6 = i9;
                        long r17 = itemInfo.m33453getNotAnimatableDeltanOccac();
                        itemInfo.m33454setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(r17) + IntOffset.m38586getXimpl(r4), IntOffset.m38587getYimpl(r17) + IntOffset.m38587getYimpl(r4)));
                        itemInfo.setCrossAxisSize(lazyGridPositionedItem2.getCrossAxisSize());
                        itemInfo.setCrossAxisOffset(lazyGridPositionedItem2.getCrossAxisOffset());
                        startAnimationsIfNeeded(lazyGridPositionedItem2, itemInfo);
                    }
                } else {
                    i6 = i9;
                    this.keyToItemInfoMap.remove(lazyGridPositionedItem2.getKey());
                }
                i10++;
                i9 = i6;
                i7 = 0;
            }
            List<LazyGridPositionedItem> list3 = this.movingInFromStartBound;
            if (list3.size() > 1) {
                C12664a0.m28170A(list3, new C0533xb35e58dd(map));
            }
            List<LazyGridPositionedItem> list4 = this.movingInFromStartBound;
            int size3 = list4.size();
            int i11 = -1;
            int i12 = -1;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i13 < size3) {
                LazyGridPositionedItem lazyGridPositionedItem3 = list4.get(i13);
                int line = getLine(lazyGridPositionedItem3);
                if (line == i11 || line != i12) {
                    i14 += i15;
                    i15 = lazyGridPositionedItem3.getMainAxisSize();
                    i12 = line;
                } else {
                    i15 = Math.max(i15, lazyGridPositionedItem3.getMainAxisSize());
                }
                ItemInfo createItemInfo = createItemInfo(lazyGridPositionedItem3, (0 - i14) - lazyGridPositionedItem3.getMainAxisSize());
                this.keyToItemInfoMap.put(lazyGridPositionedItem3.getKey(), createItemInfo);
                startAnimationsIfNeeded(lazyGridPositionedItem3, createItemInfo);
                i13++;
                i11 = -1;
            }
            List<LazyGridPositionedItem> list5 = this.movingInFromEndBound;
            if (list5.size() > 1) {
                C12664a0.m28170A(list5, new LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$1(map));
            }
            List<LazyGridPositionedItem> list6 = this.movingInFromEndBound;
            int size4 = list6.size();
            int i16 = -1;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < size4; i19++) {
                LazyGridPositionedItem lazyGridPositionedItem4 = list6.get(i19);
                int line2 = getLine(lazyGridPositionedItem4);
                if (line2 == -1 || line2 != i16) {
                    i17 += i18;
                    i18 = lazyGridPositionedItem4.getMainAxisSize();
                    i16 = line2;
                } else {
                    i18 = Math.max(i18, lazyGridPositionedItem4.getMainAxisSize());
                }
                ItemInfo createItemInfo2 = createItemInfo(lazyGridPositionedItem4, i5 + i17);
                this.keyToItemInfoMap.put(lazyGridPositionedItem4.getKey(), createItemInfo2);
                startAnimationsIfNeeded(lazyGridPositionedItem4, createItemInfo2);
            }
            for (T next : this.movingAwayKeys) {
                ItemInfo itemInfo2 = (ItemInfo) C12716r0.m28417h(this.keyToItemInfoMap, next);
                Integer num2 = this.keyToIndexMap.get(next);
                List<PlaceableInfo> placeables = itemInfo2.getPlaceables();
                int size5 = placeables.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size5) {
                        z2 = false;
                        break;
                    } else if (placeables.get(i20).getInProgress()) {
                        z2 = true;
                        break;
                    } else {
                        i20++;
                    }
                }
                if (itemInfo2.getPlaceables().isEmpty() || num2 == null || ((!z2 && C12775o.m28634d(num2, map.get(next))) || (!z2 && !isWithinBounds(itemInfo2, i5)))) {
                    this.keyToItemInfoMap.remove(next);
                } else {
                    int r6 = ItemIndex.m33442constructorimpl(num2.intValue());
                    if (this.isVertical) {
                        j = Constraints.Companion.m38422fixedWidthOenEA2s(itemInfo2.getCrossAxisSize());
                    } else {
                        j = Constraints.Companion.m38421fixedHeightOenEA2s(itemInfo2.getCrossAxisSize());
                    }
                    LazyGridMeasuredItem r42 = LazyMeasuredItemProvider.m33489getAndMeasureednRnyU$default(lazyMeasuredItemProvider, r6, 0, j, 2, (Object) null);
                    if (num2.intValue() < this.firstVisibleIndex) {
                        this.movingAwayToStartBound.add(r42);
                    } else {
                        this.movingAwayToEndBound.add(r42);
                    }
                }
            }
            List<LazyGridMeasuredItem> list7 = this.movingAwayToStartBound;
            if (list7.size() > 1) {
                C12664a0.m28170A(list7, new C0534xb35e58de(this));
            }
            List<LazyGridMeasuredItem> list8 = this.movingAwayToStartBound;
            int size6 = list8.size();
            int i21 = 0;
            int i22 = 0;
            int i23 = -1;
            for (int i24 = 0; i24 < size6; i24++) {
                LazyGridMeasuredItem lazyGridMeasuredItem = list8.get(i24);
                int r8 = lazyGridSpanLayoutProvider2.m33487getLineIndexOfItem_Ze7BM(lazyGridMeasuredItem.m33476getIndexVZbfaAc());
                if (r8 == -1 || r8 != i23) {
                    i21 += i22;
                    i22 = lazyGridMeasuredItem.getMainAxisSize();
                    i23 = r8;
                } else {
                    i22 = Math.max(i22, lazyGridMeasuredItem.getMainAxisSize());
                }
                int mainAxisSize = (0 - i21) - lazyGridMeasuredItem.getMainAxisSize();
                ItemInfo itemInfo3 = (ItemInfo) C12716r0.m28417h(this.keyToItemInfoMap, lazyGridMeasuredItem.getKey());
                LazyGridPositionedItem position = lazyGridMeasuredItem.position(mainAxisSize, itemInfo3.getCrossAxisOffset(), i2, i3, -1, -1);
                list2.add(position);
                startAnimationsIfNeeded(position, itemInfo3);
            }
            List<LazyGridMeasuredItem> list9 = this.movingAwayToEndBound;
            if (list9.size() > 1) {
                C12664a0.m28170A(list9, new LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$2(this));
            }
            List<LazyGridMeasuredItem> list10 = this.movingAwayToEndBound;
            int size7 = list10.size();
            int i25 = -1;
            int i26 = 0;
            int i27 = 0;
            for (int i28 = 0; i28 < size7; i28++) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = list10.get(i28);
                int r7 = lazyGridSpanLayoutProvider2.m33487getLineIndexOfItem_Ze7BM(lazyGridMeasuredItem2.m33476getIndexVZbfaAc());
                if (r7 == -1 || r7 != i25) {
                    i27 += i26;
                    i26 = lazyGridMeasuredItem2.getMainAxisSize();
                    i25 = r7;
                } else {
                    i26 = Math.max(i26, lazyGridMeasuredItem2.getMainAxisSize());
                }
                ItemInfo itemInfo4 = (ItemInfo) C12716r0.m28417h(this.keyToItemInfoMap, lazyGridMeasuredItem2.getKey());
                LazyGridPositionedItem position2 = lazyGridMeasuredItem2.position(i5 + i27, itemInfo4.getCrossAxisOffset(), i2, i3, -1, -1);
                list2.add(position2);
                startAnimationsIfNeeded(position2, itemInfo4);
            }
            this.movingInFromStartBound.clear();
            this.movingInFromEndBound.clear();
            this.movingAwayToStartBound.clear();
            this.movingAwayToEndBound.clear();
            this.movingAwayKeys.clear();
            return;
        }
        reset();
    }

    public final void reset() {
        this.keyToItemInfoMap.clear();
        this.keyToIndexMap = C12716r0.m28416g();
        this.firstVisibleIndex = -1;
    }
}
