package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.p002ui.unit.IntSize;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyGridMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridPositionedItem\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,196:1\n194#1:197\n86#2:198\n86#2:199\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridPositionedItem\n*L\n178#1:197\n185#1:198\n187#1:199\n*E\n"})
/* compiled from: LazyGridMeasuredItem.kt */
public final class LazyGridPositionedItem implements LazyGridItemInfo {
    private final int column;
    private final boolean hasAnimations;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int mainAxisLayoutSize;
    private final int maxMainAxisOffset;
    private final int minMainAxisOffset;
    private final long offset;
    private final List<Placeable> placeables;
    private final LazyGridItemPlacementAnimator placementAnimator;
    private final boolean reverseLayout;
    private final int row;
    private final long size;
    private final long visualOffset;

    public /* synthetic */ LazyGridPositionedItem(long j, int i, Object obj, int i2, int i3, long j2, int i4, int i5, boolean z, List list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j3, int i6, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, obj, i2, i3, j2, i4, i5, z, list, lazyGridItemPlacementAnimator, j3, i6, z2);
    }

    /* renamed from: copy-4Tuh3kE  reason: not valid java name */
    private final long m33478copy4Tuh3kE(long j, Function1<? super Integer, Integer> function1) {
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
        Object parentData = this.placeables.get(i).getParentData();
        if (parentData instanceof FiniteAnimationSpec) {
            return (FiniteAnimationSpec) parentData;
        }
        return null;
    }

    public int getColumn() {
        return this.column;
    }

    public final int getCrossAxisOffset() {
        if (this.isVertical) {
            return IntOffset.m38586getXimpl(m33479getOffsetnOccac());
        }
        return IntOffset.m38587getYimpl(m33479getOffsetnOccac());
    }

    public final int getCrossAxisSize() {
        if (this.isVertical) {
            return IntSize.m38628getWidthimpl(m33480getSizeYbymL2g());
        }
        return IntSize.m38627getHeightimpl(m33480getSizeYbymL2g());
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
        return getMainAxisSize(this.placeables.get(i));
    }

    /* renamed from: getOffset-nOcc-ac  reason: not valid java name */
    public long m33479getOffsetnOccac() {
        return this.offset;
    }

    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    public int getRow() {
        return this.row;
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    public long m33480getSizeYbymL2g() {
        return this.size;
    }

    public final void place(Placeable.PlacementScope placementScope) {
        long j;
        int i;
        int i2;
        C12775o.m28639i(placementScope, "scope");
        int placeablesCount = getPlaceablesCount();
        for (int i3 = 0; i3 < placeablesCount; i3++) {
            Placeable placeable = this.placeables.get(i3);
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i4 = this.maxMainAxisOffset;
            if (getAnimationSpec(i3) != null) {
                j = this.placementAnimator.m33465getAnimatedOffsetYT5a7pE(getKey(), i3, mainAxisSize, i4, m33479getOffsetnOccac());
            } else {
                j = m33479getOffsetnOccac();
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

    private LazyGridPositionedItem(long j, int i, Object obj, int i2, int i3, long j2, int i4, int i5, boolean z, List<? extends Placeable> list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j3, int i6, boolean z2) {
        this.offset = j;
        this.index = i;
        this.key = obj;
        this.row = i2;
        this.column = i3;
        this.size = j2;
        this.minMainAxisOffset = i4;
        this.maxMainAxisOffset = i5;
        this.isVertical = z;
        this.placeables = list;
        this.placementAnimator = lazyGridItemPlacementAnimator;
        this.visualOffset = j3;
        this.mainAxisLayoutSize = i6;
        this.reverseLayout = z2;
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

    public final int getMainAxisSize() {
        return this.isVertical ? IntSize.m38627getHeightimpl(m33480getSizeYbymL2g()) : IntSize.m38628getWidthimpl(m33480getSizeYbymL2g());
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }
}
