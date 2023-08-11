package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntOffsetKt;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,1097:1\n1088#1:1102\n1086#1:1103\n33#2,4:1098\n38#2:1105\n86#3:1104\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem\n*L\n1074#1:1102\n1075#1:1103\n1072#1:1098,4\n1072#1:1105\n1081#1:1104\n*E\n"})
/* compiled from: LazyStaggeredGridMeasure.kt */
final class LazyStaggeredGridPositionedItem implements LazyStaggeredGridItemInfo {
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int lane;
    private final int mainAxisLayoutSize;
    private final long offset;
    private final List<Placeable> placeables;
    private final long size;

    public /* synthetic */ LazyStaggeredGridPositionedItem(long j, int i, int i2, Object obj, long j2, List list, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, i2, obj, j2, list, z, i3);
    }

    /* renamed from: copy-4Tuh3kE  reason: not valid java name */
    private final long m33565copy4Tuh3kE(long j, Function1<? super Integer, Integer> function1) {
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

    private final int getMainAxisSize(Placeable placeable) {
        if (this.isVertical) {
            return placeable.getHeight();
        }
        return placeable.getWidth();
    }

    public int getIndex() {
        return this.index;
    }

    public Object getKey() {
        return this.key;
    }

    public int getLane() {
        return this.lane;
    }

    /* renamed from: getOffset-nOcc-ac  reason: not valid java name */
    public long m33566getOffsetnOccac() {
        return this.offset;
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    public long m33567getSizeYbymL2g() {
        return this.size;
    }

    public final void place(Placeable.PlacementScope placementScope, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        C12775o.m28639i(placementScope, "scope");
        C12775o.m28639i(lazyStaggeredGridMeasureContext, "context");
        List<Placeable> list = this.placeables;
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Placeable placeable = list.get(i5);
            if (lazyStaggeredGridMeasureContext.getReverseLayout()) {
                long r3 = m33566getOffsetnOccac();
                if (this.isVertical) {
                    i = IntOffset.m38586getXimpl(r3);
                } else {
                    int r7 = this.mainAxisLayoutSize - IntOffset.m38586getXimpl(r3);
                    if (this.isVertical) {
                        i4 = placeable.getHeight();
                    } else {
                        i4 = placeable.getWidth();
                    }
                    i = r7 - i4;
                }
                if (this.isVertical) {
                    int r4 = this.mainAxisLayoutSize - IntOffset.m38587getYimpl(r3);
                    if (this.isVertical) {
                        i3 = placeable.getHeight();
                    } else {
                        i3 = placeable.getWidth();
                    }
                    i2 = r4 - i3;
                } else {
                    i2 = IntOffset.m38587getYimpl(r3);
                }
                j = IntOffsetKt.IntOffset(i, i2);
            } else {
                j = m33566getOffsetnOccac();
            }
            long r6 = lazyStaggeredGridMeasureContext.m33553getContentOffsetnOccac();
            Placeable.PlacementScope.m37407placeRelativeWithLayeraW9wM$default(placementScope, placeable, IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(j) + IntOffset.m38586getXimpl(r6), IntOffset.m38587getYimpl(j) + IntOffset.m38587getYimpl(r6)), 0.0f, (Function1) null, 6, (Object) null);
        }
    }

    public String toString() {
        return super.toString();
    }

    private LazyStaggeredGridPositionedItem(long j, int i, int i2, Object obj, long j2, List<? extends Placeable> list, boolean z, int i3) {
        this.offset = j;
        this.index = i;
        this.lane = i2;
        this.key = obj;
        this.size = j2;
        this.placeables = list;
        this.isVertical = z;
        this.mainAxisLayoutSize = i3;
    }
}
