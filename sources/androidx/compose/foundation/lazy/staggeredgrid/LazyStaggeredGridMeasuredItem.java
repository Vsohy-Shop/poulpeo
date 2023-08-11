package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.p002ui.unit.IntSizeKt;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n+ 2 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1097:1\n59#2,3:1098\n62#2,2:1105\n64#2:1108\n99#2,8:1109\n33#3,4:1101\n38#3:1107\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n*L\n1020#1:1098,3\n1020#1:1105,2\n1020#1:1108\n1026#1:1109,8\n1020#1:1101,4\n1020#1:1107\n*E\n"})
/* compiled from: LazyStaggeredGridMeasure.kt */
final class LazyStaggeredGridMeasuredItem {
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private boolean isVisible = true;
    private final Object key;
    private final int lane;
    private final int mainAxisSize;
    private final List<Placeable> placeables;
    private final int sizeWithSpacings;
    private final int spacing;
    private final int span;

    public LazyStaggeredGridMeasuredItem(int i, Object obj, List<? extends Placeable> list, boolean z, int i2, int i3, int i4) {
        Integer num;
        int i5;
        int i6;
        int i7;
        C12775o.m28639i(obj, "key");
        C12775o.m28639i(list, "placeables");
        this.index = i;
        this.key = obj;
        this.placeables = list;
        this.isVertical = z;
        this.spacing = i2;
        this.lane = i3;
        this.span = i4;
        int i8 = 1;
        int i9 = 0;
        Integer num2 = 0;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Placeable placeable = (Placeable) list.get(i10);
            int intValue = num2.intValue();
            if (this.isVertical) {
                i7 = placeable.getHeight();
            } else {
                i7 = placeable.getWidth();
            }
            num2 = Integer.valueOf(intValue + i7);
        }
        int intValue2 = num2.intValue();
        this.mainAxisSize = intValue2;
        this.sizeWithSpacings = C13537l.m30877d(intValue2 + this.spacing, 0);
        List<Placeable> list2 = this.placeables;
        if (list2.isEmpty()) {
            num = null;
        } else {
            Placeable placeable2 = list2.get(0);
            if (this.isVertical) {
                i5 = placeable2.getWidth();
            } else {
                i5 = placeable2.getHeight();
            }
            Integer valueOf = Integer.valueOf(i5);
            int m = C12726w.m28526m(list2);
            if (1 <= m) {
                while (true) {
                    Placeable placeable3 = list2.get(i8);
                    if (this.isVertical) {
                        i6 = placeable3.getWidth();
                    } else {
                        i6 = placeable3.getHeight();
                    }
                    Integer valueOf2 = Integer.valueOf(i6);
                    valueOf = valueOf2.compareTo(valueOf) > 0 ? valueOf2 : valueOf;
                    if (i8 == m) {
                        break;
                    }
                    i8++;
                }
            }
            num = valueOf;
        }
        Integer num3 = num;
        this.crossAxisSize = num3 != null ? num3.intValue() : i9;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final int getIndex() {
        return this.index;
    }

    public final Object getKey() {
        return this.key;
    }

    public final int getLane() {
        return this.lane;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final List<Placeable> getPlaceables() {
        return this.placeables;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    public final int getSpacing() {
        return this.spacing;
    }

    public final int getSpan() {
        return this.span;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final LazyStaggeredGridPositionedItem position(int i, int i2, int i3, int i4) {
        long j;
        long j2;
        if (this.isVertical) {
            j = IntOffsetKt.IntOffset(i3, i2);
        } else {
            int i5 = i2;
            int i6 = i3;
            j = IntOffsetKt.IntOffset(i2, i3);
        }
        long j3 = j;
        int i7 = this.index;
        Object obj = this.key;
        if (this.isVertical) {
            j2 = IntSizeKt.IntSize(this.crossAxisSize, this.sizeWithSpacings);
        } else {
            j2 = IntSizeKt.IntSize(this.sizeWithSpacings, this.crossAxisSize);
        }
        return new LazyStaggeredGridPositionedItem(j3, i7, i, obj, j2, this.placeables, this.isVertical, i4, (DefaultConstructorMarker) null);
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }
}
