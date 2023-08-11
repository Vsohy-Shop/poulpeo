package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
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

@SourceDebugExtension({"SMAP\nLazyListItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,350:1\n101#2,2:351\n33#2,6:353\n103#2:359\n33#2,4:360\n38#2:365\n33#2,6:368\n33#2,6:376\n101#2,2:383\n33#2,6:385\n103#2:391\n33#2,6:395\n33#2,6:403\n69#2,4:414\n74#2:420\n101#2,2:421\n33#2,4:423\n38#2:428\n103#2:429\n86#3:364\n86#3:409\n86#3:410\n79#3:411\n86#3:412\n79#3:413\n86#3:418\n79#3:419\n86#3:427\n1011#4,2:366\n1002#4,2:374\n1855#4:382\n1856#4:392\n1011#4,2:393\n1002#4,2:401\n*S KotlinDebug\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n*L\n74#1:351,2\n74#1:353,6\n74#1:359\n93#1:360,4\n93#1:365\n124#1:368,6\n133#1:376,6\n148#1:383,2\n148#1:385,6\n148#1:391\n167#1:395,6\n178#1:403,6\n278#1:414,4\n278#1:420\n316#1:421,2\n316#1:423,4\n316#1:428\n316#1:429\n113#1:364\n208#1:409\n209#1:410\n251#1:411\n254#1:412\n272#1:413\n279#1:418\n284#1:419\n317#1:427\n123#1:366,2\n132#1:374,2\n141#1:382\n141#1:392\n166#1:393,2\n177#1:401,2\n*E\n"})
/* compiled from: LazyListItemPlacementAnimator.kt */
public final class LazyListItemPlacementAnimator {
    private int firstVisibleIndex;
    private final boolean isVertical;
    /* access modifiers changed from: private */
    public Map<Object, Integer> keyToIndexMap = C12716r0.m28416g();
    private final Map<Object, ItemInfo> keyToItemInfoMap = new LinkedHashMap();
    private final LinkedHashSet<Object> movingAwayKeys = new LinkedHashSet<>();
    private final List<LazyMeasuredItem> movingAwayToEndBound = new ArrayList();
    private final List<LazyMeasuredItem> movingAwayToStartBound = new ArrayList();
    private final List<LazyListPositionedItem> movingInFromEndBound = new ArrayList();
    private final List<LazyListPositionedItem> movingInFromStartBound = new ArrayList();
    private final C13995l0 scope;

    public LazyListItemPlacementAnimator(C13995l0 l0Var, boolean z) {
        C12775o.m28639i(l0Var, "scope");
        this.scope = l0Var;
        this.isVertical = z;
    }

    private final ItemInfo createItemInfo(LazyListPositionedItem lazyListPositionedItem, int i) {
        long j;
        ItemInfo itemInfo = new ItemInfo();
        long r8 = lazyListPositionedItem.m33418getOffsetBjo55l4(0);
        if (this.isVertical) {
            j = IntOffset.m38582copyiSbpLlY$default(r8, 0, i, 1, (Object) null);
        } else {
            j = IntOffset.m38582copyiSbpLlY$default(r8, i, 0, 2, (Object) null);
        }
        int placeablesCount = lazyListPositionedItem.getPlaceablesCount();
        for (int i2 = 0; i2 < placeablesCount; i2++) {
            long r4 = lazyListPositionedItem.m33418getOffsetBjo55l4(i2);
            long IntOffset = IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(r4) - IntOffset.m38586getXimpl(r8), IntOffset.m38587getYimpl(r4) - IntOffset.m38587getYimpl(r8));
            itemInfo.getPlaceables().add(new PlaceableInfo(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(j) + IntOffset.m38586getXimpl(IntOffset), IntOffset.m38587getYimpl(j) + IntOffset.m38587getYimpl(IntOffset)), lazyListPositionedItem.getMainAxisSize(i2), (DefaultConstructorMarker) null));
        }
        return itemInfo;
    }

    static /* synthetic */ ItemInfo createItemInfo$default(LazyListItemPlacementAnimator lazyListItemPlacementAnimator, LazyListPositionedItem lazyListPositionedItem, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = lazyListItemPlacementAnimator.m33405getMainAxisgyyYBs(lazyListPositionedItem.m33418getOffsetBjo55l4(0));
        }
        return lazyListItemPlacementAnimator.createItemInfo(lazyListPositionedItem, i);
    }

    /* renamed from: getMainAxis--gyyYBs  reason: not valid java name */
    private final int m33405getMainAxisgyyYBs(long j) {
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
            long r5 = placeableInfo.m33429getTargetOffsetnOccac();
            long r7 = itemInfo.m33403getNotAnimatableDeltanOccac();
            long IntOffset = IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(r5) + IntOffset.m38586getXimpl(r7), IntOffset.m38587getYimpl(r5) + IntOffset.m38587getYimpl(r7));
            if (m33405getMainAxisgyyYBs(IntOffset) + placeableInfo.getMainAxisSize() <= 0 || m33405getMainAxisgyyYBs(IntOffset) >= i) {
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

    private final void startAnimationsIfNeeded(LazyListPositionedItem lazyListPositionedItem, ItemInfo itemInfo) {
        LazyListPositionedItem lazyListPositionedItem2 = lazyListPositionedItem;
        while (itemInfo.getPlaceables().size() > lazyListPositionedItem.getPlaceablesCount()) {
            Object unused = C12669b0.m28190N(itemInfo.getPlaceables());
        }
        while (itemInfo.getPlaceables().size() < lazyListPositionedItem.getPlaceablesCount()) {
            int size = itemInfo.getPlaceables().size();
            long r4 = lazyListPositionedItem2.m33418getOffsetBjo55l4(size);
            List<PlaceableInfo> placeables = itemInfo.getPlaceables();
            long r7 = itemInfo.m33403getNotAnimatableDeltanOccac();
            placeables.add(new PlaceableInfo(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(r4) - IntOffset.m38586getXimpl(r7), IntOffset.m38587getYimpl(r4) - IntOffset.m38587getYimpl(r7)), lazyListPositionedItem2.getMainAxisSize(size), (DefaultConstructorMarker) null));
        }
        List<PlaceableInfo> placeables2 = itemInfo.getPlaceables();
        int size2 = placeables2.size();
        for (int i = 0; i < size2; i++) {
            PlaceableInfo placeableInfo = placeables2.get(i);
            long r6 = placeableInfo.m33429getTargetOffsetnOccac();
            long r8 = itemInfo.m33403getNotAnimatableDeltanOccac();
            long IntOffset = IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(r6) + IntOffset.m38586getXimpl(r8), IntOffset.m38587getYimpl(r6) + IntOffset.m38587getYimpl(r8));
            long r82 = lazyListPositionedItem2.m33418getOffsetBjo55l4(i);
            placeableInfo.setMainAxisSize(lazyListPositionedItem2.getMainAxisSize(i));
            FiniteAnimationSpec<IntOffset> animationSpec = lazyListPositionedItem2.getAnimationSpec(i);
            if (!IntOffset.m38585equalsimpl0(IntOffset, r82)) {
                long r62 = itemInfo.m33403getNotAnimatableDeltanOccac();
                placeableInfo.m33430setTargetOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(r82) - IntOffset.m38586getXimpl(r62), IntOffset.m38587getYimpl(r82) - IntOffset.m38587getYimpl(r62)));
                if (animationSpec != null) {
                    placeableInfo.setInProgress(true);
                    C14054y1 unused2 = C13985j.m32422d(this.scope, (C12079g) null, (C14004n0) null, new LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1(placeableInfo, animationSpec, (C12074d<? super LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1>) null), 3, (Object) null);
                }
            }
        }
    }

    /* renamed from: toOffset-Bjo55l4  reason: not valid java name */
    private final long m33406toOffsetBjo55l4(int i) {
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
    public final long m33407getAnimatedOffsetYT5a7pE(Object obj, int i, int i2, int i3, long j) {
        C12775o.m28639i(obj, "key");
        ItemInfo itemInfo = this.keyToItemInfoMap.get(obj);
        if (itemInfo == null) {
            return j;
        }
        PlaceableInfo placeableInfo = itemInfo.getPlaceables().get(i);
        long r11 = placeableInfo.getAnimatedOffset().getValue().m38595unboximpl();
        long r0 = itemInfo.m33403getNotAnimatableDeltanOccac();
        long IntOffset = IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(r11) + IntOffset.m38586getXimpl(r0), IntOffset.m38587getYimpl(r11) + IntOffset.m38587getYimpl(r0));
        long r02 = placeableInfo.m33429getTargetOffsetnOccac();
        long r2 = itemInfo.m33403getNotAnimatableDeltanOccac();
        long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(r02) + IntOffset.m38586getXimpl(r2), IntOffset.m38587getYimpl(r02) + IntOffset.m38587getYimpl(r2));
        if (placeableInfo.getInProgress() && ((m33405getMainAxisgyyYBs(IntOffset2) <= i2 && m33405getMainAxisgyyYBs(IntOffset) <= i2) || (m33405getMainAxisgyyYBs(IntOffset2) >= i3 && m33405getMainAxisgyyYBs(IntOffset) >= i3))) {
            C14054y1 unused = C13985j.m32422d(this.scope, (C12079g) null, (C14004n0) null, new LazyListItemPlacementAnimator$getAnimatedOffset$1(placeableInfo, (C12074d<? super LazyListItemPlacementAnimator$getAnimatedOffset$1>) null), 3, (Object) null);
        }
        return IntOffset;
    }

    public final void onMeasured(int i, int i2, int i3, List<LazyListPositionedItem> list, LazyMeasuredItemProvider lazyMeasuredItemProvider) {
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8 = i2;
        int i9 = i3;
        List<LazyListPositionedItem> list2 = list;
        LazyMeasuredItemProvider lazyMeasuredItemProvider2 = lazyMeasuredItemProvider;
        C12775o.m28639i(list2, "positionedItems");
        C12775o.m28639i(lazyMeasuredItemProvider2, "itemProvider");
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z = false;
                break;
            } else if (list2.get(i10).getHasAnimations()) {
                z = true;
                break;
            } else {
                i10++;
            }
        }
        if (z || !this.keyToItemInfoMap.isEmpty()) {
            int i11 = this.firstVisibleIndex;
            LazyListPositionedItem lazyListPositionedItem = (LazyListPositionedItem) C12686e0.m28223b0(list);
            if (lazyListPositionedItem != null) {
                i4 = lazyListPositionedItem.getIndex();
            } else {
                i4 = 0;
            }
            this.firstVisibleIndex = i4;
            Map<Object, Integer> map = this.keyToIndexMap;
            this.keyToIndexMap = lazyMeasuredItemProvider.getKeyToIndexMap();
            if (this.isVertical) {
                i5 = i9;
            } else {
                i5 = i8;
            }
            long r10 = m33406toOffsetBjo55l4(i);
            this.movingAwayKeys.addAll(this.keyToItemInfoMap.keySet());
            int size2 = list.size();
            int i12 = 0;
            while (i12 < size2) {
                LazyListPositionedItem lazyListPositionedItem2 = list2.get(i12);
                this.movingAwayKeys.remove(lazyListPositionedItem2.getKey());
                if (lazyListPositionedItem2.getHasAnimations()) {
                    ItemInfo itemInfo = this.keyToItemInfoMap.get(lazyListPositionedItem2.getKey());
                    if (itemInfo == null) {
                        Integer num = map.get(lazyListPositionedItem2.getKey());
                        if (num == null || lazyListPositionedItem2.getIndex() == num.intValue()) {
                            i7 = i11;
                            i6 = size2;
                            this.keyToItemInfoMap.put(lazyListPositionedItem2.getKey(), createItemInfo$default(this, lazyListPositionedItem2, 0, 2, (Object) null));
                        } else {
                            if (num.intValue() < i11) {
                                this.movingInFromStartBound.add(lazyListPositionedItem2);
                            } else {
                                this.movingInFromEndBound.add(lazyListPositionedItem2);
                            }
                            i7 = i11;
                            i6 = size2;
                        }
                    } else {
                        i7 = i11;
                        i6 = size2;
                        long r5 = itemInfo.m33403getNotAnimatableDeltanOccac();
                        itemInfo.m33404setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(r5) + IntOffset.m38586getXimpl(r10), IntOffset.m38587getYimpl(r5) + IntOffset.m38587getYimpl(r10)));
                        startAnimationsIfNeeded(lazyListPositionedItem2, itemInfo);
                    }
                } else {
                    i7 = i11;
                    i6 = size2;
                    this.keyToItemInfoMap.remove(lazyListPositionedItem2.getKey());
                }
                i12++;
                size2 = i6;
                i11 = i7;
            }
            int i13 = 0;
            List<LazyListPositionedItem> list3 = this.movingInFromStartBound;
            if (list3.size() > 1) {
                C12664a0.m28170A(list3, new C0522xd022a35(map));
            }
            List<LazyListPositionedItem> list4 = this.movingInFromStartBound;
            int size3 = list4.size();
            int i14 = 0;
            for (int i15 = 0; i15 < size3; i15++) {
                LazyListPositionedItem lazyListPositionedItem3 = list4.get(i15);
                int size4 = (0 - i14) - lazyListPositionedItem3.getSize();
                i14 += lazyListPositionedItem3.getSize();
                ItemInfo createItemInfo = createItemInfo(lazyListPositionedItem3, size4);
                this.keyToItemInfoMap.put(lazyListPositionedItem3.getKey(), createItemInfo);
                startAnimationsIfNeeded(lazyListPositionedItem3, createItemInfo);
            }
            List<LazyListPositionedItem> list5 = this.movingInFromEndBound;
            if (list5.size() > 1) {
                C12664a0.m28170A(list5, new LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$1(map));
            }
            List<LazyListPositionedItem> list6 = this.movingInFromEndBound;
            int size5 = list6.size();
            int i16 = 0;
            for (int i17 = 0; i17 < size5; i17++) {
                LazyListPositionedItem lazyListPositionedItem4 = list6.get(i17);
                int i18 = i5 + i16;
                i16 += lazyListPositionedItem4.getSize();
                ItemInfo createItemInfo2 = createItemInfo(lazyListPositionedItem4, i18);
                this.keyToItemInfoMap.put(lazyListPositionedItem4.getKey(), createItemInfo2);
                startAnimationsIfNeeded(lazyListPositionedItem4, createItemInfo2);
            }
            for (T next : this.movingAwayKeys) {
                ItemInfo itemInfo2 = (ItemInfo) C12716r0.m28417h(this.keyToItemInfoMap, next);
                Integer num2 = this.keyToIndexMap.get(next);
                List<PlaceableInfo> placeables = itemInfo2.getPlaceables();
                int size6 = placeables.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size6) {
                        z2 = false;
                        break;
                    } else if (placeables.get(i19).getInProgress()) {
                        z2 = true;
                        break;
                    } else {
                        i19++;
                    }
                }
                if (itemInfo2.getPlaceables().isEmpty() || num2 == null || ((!z2 && C12775o.m28634d(num2, map.get(next))) || (!z2 && !isWithinBounds(itemInfo2, i5)))) {
                    this.keyToItemInfoMap.remove(next);
                } else {
                    LazyMeasuredItem r6 = lazyMeasuredItemProvider2.m33425getAndMeasureZjPyQlc(DataIndex.m33391constructorimpl(num2.intValue()));
                    if (num2.intValue() < this.firstVisibleIndex) {
                        this.movingAwayToStartBound.add(r6);
                    } else {
                        this.movingAwayToEndBound.add(r6);
                    }
                }
            }
            List<LazyMeasuredItem> list7 = this.movingAwayToStartBound;
            if (list7.size() > 1) {
                C12664a0.m28170A(list7, new C0523xd022a36(this));
            }
            List<LazyMeasuredItem> list8 = this.movingAwayToStartBound;
            int size7 = list8.size();
            int i20 = 0;
            for (int i21 = 0; i21 < size7; i21++) {
                LazyMeasuredItem lazyMeasuredItem = list8.get(i21);
                int size8 = (0 - i20) - lazyMeasuredItem.getSize();
                i20 += lazyMeasuredItem.getSize();
                LazyListPositionedItem position = lazyMeasuredItem.position(size8, i8, i9);
                list2.add(position);
                startAnimationsIfNeeded(position, (ItemInfo) C12716r0.m28417h(this.keyToItemInfoMap, lazyMeasuredItem.getKey()));
            }
            List<LazyMeasuredItem> list9 = this.movingAwayToEndBound;
            if (list9.size() > 1) {
                C12664a0.m28170A(list9, new LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$2(this));
            }
            List<LazyMeasuredItem> list10 = this.movingAwayToEndBound;
            int size9 = list10.size();
            for (int i22 = 0; i22 < size9; i22++) {
                LazyMeasuredItem lazyMeasuredItem2 = list10.get(i22);
                int i23 = i5 + i13;
                i13 += lazyMeasuredItem2.getSize();
                LazyListPositionedItem position2 = lazyMeasuredItem2.position(i23, i8, i9);
                list2.add(position2);
                startAnimationsIfNeeded(position2, (ItemInfo) C12716r0.m28417h(this.keyToItemInfoMap, lazyMeasuredItem2.getKey()));
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
