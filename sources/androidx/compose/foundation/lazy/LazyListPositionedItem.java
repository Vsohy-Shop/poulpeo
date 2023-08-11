package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntOffsetKt;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListPositionedItem\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,193:1\n186#1:194\n86#2:195\n86#2:196\n*S KotlinDebug\n*F\n+ 1 LazyMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListPositionedItem\n*L\n170#1:194\n177#1:195\n179#1:196\n*E\n"})
/* compiled from: LazyMeasuredItem.kt */
public final class LazyListPositionedItem implements LazyListItemInfo {
    private final boolean hasAnimations;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int mainAxisLayoutSize;
    private final int maxMainAxisOffset;
    private final int minMainAxisOffset;
    private final int offset;
    private final LazyListItemPlacementAnimator placementAnimator;
    private final boolean reverseLayout;
    private final int size;
    private final long visualOffset;
    private final List<LazyListPlaceableWrapper> wrappers;

    public /* synthetic */ LazyListPositionedItem(int i, int i2, Object obj, int i3, int i4, int i5, boolean z, List list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j, boolean z2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, obj, i3, i4, i5, z, list, lazyListItemPlacementAnimator, j, z2, i6);
    }

    /* renamed from: copy-4Tuh3kE  reason: not valid java name */
    private final long m33417copy4Tuh3kE(long j, Function1<? super Integer, Integer> function1) {
        int i;
        if (this.isVertical) {
            i = IntOffset.m38586getXimpl(j);
        } else {
            i = function1.invoke(Integer.valueOf(IntOffset.m38586getXimpl(j))).intValue();
        }
        boolean z = this.isVertical;
        int r3 = IntOffset.m38587getYimpl(j);
        if (z) {
            r3 = function1.invoke(Integer.valueOf(r3)).intValue();
        }
        return IntOffsetKt.IntOffset(i, r3);
    }

    public final FiniteAnimationSpec<IntOffset> getAnimationSpec(int i) {
        Object parentData = this.wrappers.get(i).getPlaceable().getParentData();
        if (parentData instanceof FiniteAnimationSpec) {
            return (FiniteAnimationSpec) parentData;
        }
        return null;
    }

    public final boolean getHasAnimations() {
        return this.hasAnimations;
    }

    public int getIndex() {
        return this.index;
    }

    public Object getKey() {
        return this.key;
    }

    public final int getMainAxisSize(int i) {
        return getMainAxisSize(this.wrappers.get(i).getPlaceable());
    }

    public int getOffset() {
        return this.offset;
    }

    /* renamed from: getOffset-Bjo55l4  reason: not valid java name */
    public final long m33418getOffsetBjo55l4(int i) {
        return this.wrappers.get(i).m33416getOffsetnOccac();
    }

    public final int getPlaceablesCount() {
        return this.wrappers.size();
    }

    public int getSize() {
        return this.size;
    }

    public final void place(Placeable.PlacementScope placementScope) {
        long j;
        int i;
        int i2;
        C12775o.m28639i(placementScope, "scope");
        int placeablesCount = getPlaceablesCount();
        for (int i3 = 0; i3 < placeablesCount; i3++) {
            Placeable placeable = this.wrappers.get(i3).getPlaceable();
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i4 = this.maxMainAxisOffset;
            if (getAnimationSpec(i3) != null) {
                j = this.placementAnimator.m33407getAnimatedOffsetYT5a7pE(getKey(), i3, mainAxisSize, i4, m33418getOffsetBjo55l4(i3));
            } else {
                j = m33418getOffsetBjo55l4(i3);
            }
            if (this.reverseLayout) {
                if (this.isVertical) {
                    i = IntOffset.m38586getXimpl(j);
                } else {
                    i = (this.mainAxisLayoutSize - IntOffset.m38586getXimpl(j)) - getMainAxisSize(placeable);
                }
                if (this.isVertical) {
                    i2 = (this.mainAxisLayoutSize - IntOffset.m38587getYimpl(j)) - getMainAxisSize(placeable);
                } else {
                    i2 = IntOffset.m38587getYimpl(j);
                }
                j = IntOffsetKt.IntOffset(i, i2);
            }
            if (this.isVertical) {
                long j2 = this.visualOffset;
                Placeable.PlacementScope.m37408placeWithLayeraW9wM$default(placementScope, placeable, IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(j) + IntOffset.m38586getXimpl(j2), IntOffset.m38587getYimpl(j) + IntOffset.m38587getYimpl(j2)), 0.0f, (Function1) null, 6, (Object) null);
            } else {
                long j3 = this.visualOffset;
                Placeable.PlacementScope.m37407placeRelativeWithLayeraW9wM$default(placementScope, placeable, IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(j) + IntOffset.m38586getXimpl(j3), IntOffset.m38587getYimpl(j) + IntOffset.m38587getYimpl(j3)), 0.0f, (Function1) null, 6, (Object) null);
            }
        }
    }

    private LazyListPositionedItem(int i, int i2, Object obj, int i3, int i4, int i5, boolean z, List<LazyListPlaceableWrapper> list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j, boolean z2, int i6) {
        this.offset = i;
        this.index = i2;
        this.key = obj;
        this.size = i3;
        this.minMainAxisOffset = i4;
        this.maxMainAxisOffset = i5;
        this.isVertical = z;
        this.wrappers = list;
        this.placementAnimator = lazyListItemPlacementAnimator;
        this.visualOffset = j;
        this.reverseLayout = z2;
        this.mainAxisLayoutSize = i6;
        int placeablesCount = getPlaceablesCount();
        boolean z3 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= placeablesCount) {
                break;
            } else if (getAnimationSpec(i7) != null) {
                z3 = true;
                break;
            } else {
                i7++;
            }
        }
        this.hasAnimations = z3;
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }
}
