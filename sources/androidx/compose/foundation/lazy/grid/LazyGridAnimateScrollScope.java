package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSize;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nLazyGridAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,122:1\n116#2,2:123\n33#2,6:125\n118#2:131\n*S KotlinDebug\n*F\n+ 1 LazyGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope\n*L\n42#1:123,2\n42#1:125,6\n42#1:131\n*E\n"})
/* compiled from: LazyGridAnimateScrollScope.kt */
public final class LazyGridAnimateScrollScope implements LazyAnimateScrollScope {
    private final LazyGridState state;

    public LazyGridAnimateScrollScope(LazyGridState lazyGridState) {
        C12775o.m28639i(lazyGridState, "state");
        this.state = lazyGridState;
    }

    private final int calculateLineAverageMainAxisSize(List<? extends LazyGridItemInfo> list, boolean z) {
        int i;
        C0532x964d917a lazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1 = new C0532x964d917a(z, list);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < list.size()) {
            int intValue = ((Number) lazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1.invoke(Integer.valueOf(i2))).intValue();
            if (intValue == -1) {
                i2++;
            } else {
                int i5 = 0;
                while (i2 < list.size() && ((Number) lazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1.invoke(Integer.valueOf(i2))).intValue() == intValue) {
                    if (z) {
                        i = IntSize.m38627getHeightimpl(((LazyGridItemInfo) list.get(i2)).m33462getSizeYbymL2g());
                    } else {
                        i = IntSize.m38628getWidthimpl(((LazyGridItemInfo) list.get(i2)).m33462getSizeYbymL2g());
                    }
                    i5 = Math.max(i5, i);
                    i2++;
                }
                i3 += i5;
                i4++;
            }
        }
        return i3 / i4;
    }

    public float expectedDistanceTo(int i, int i2) {
        boolean z;
        List<LazyGridItemInfo> visibleItemsInfo = this.state.getLayoutInfo().getVisibleItemsInfo();
        int slotsPerLine$foundation_release = this.state.getSlotsPerLine$foundation_release();
        int calculateLineAverageMainAxisSize = calculateLineAverageMainAxisSize(visibleItemsInfo, this.state.isVertical$foundation_release());
        int i3 = 1;
        if (i < getFirstVisibleItemIndex()) {
            z = true;
        } else {
            z = false;
        }
        int firstVisibleItemIndex = i - getFirstVisibleItemIndex();
        int i4 = slotsPerLine$foundation_release - 1;
        if (z) {
            i3 = -1;
        }
        int i5 = (firstVisibleItemIndex + (i4 * i3)) / slotsPerLine$foundation_release;
        int min = Math.min(Math.abs(i2), calculateLineAverageMainAxisSize);
        if (i2 < 0) {
            min *= -1;
        }
        return (((float) (calculateLineAverageMainAxisSize * i5)) + ((float) min)) - ((float) getFirstVisibleItemScrollOffset());
    }

    public Density getDensity() {
        return this.state.getDensity$foundation_release();
    }

    public int getFirstVisibleItemIndex() {
        return this.state.getFirstVisibleItemIndex();
    }

    public int getFirstVisibleItemScrollOffset() {
        return this.state.getFirstVisibleItemScrollOffset();
    }

    public int getItemCount() {
        return this.state.getLayoutInfo().getTotalItemsCount();
    }

    public int getLastVisibleItemIndex() {
        LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) C12686e0.m28232k0(this.state.getLayoutInfo().getVisibleItemsInfo());
        if (lazyGridItemInfo != null) {
            return lazyGridItemInfo.getIndex();
        }
        return 0;
    }

    public int getNumOfItemsForTeleport() {
        return this.state.getSlotsPerLine$foundation_release() * 100;
    }

    public Integer getTargetItemOffset(int i) {
        LazyGridItemInfo lazyGridItemInfo;
        int i2;
        boolean z;
        List<LazyGridItemInfo> visibleItemsInfo = this.state.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                lazyGridItemInfo = null;
                break;
            }
            lazyGridItemInfo = visibleItemsInfo.get(i3);
            if (lazyGridItemInfo.getIndex() == i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i3++;
        }
        LazyGridItemInfo lazyGridItemInfo2 = lazyGridItemInfo;
        if (lazyGridItemInfo2 == null) {
            return null;
        }
        if (this.state.isVertical$foundation_release()) {
            i2 = IntOffset.m38587getYimpl(lazyGridItemInfo2.m33461getOffsetnOccac());
        } else {
            i2 = IntOffset.m38586getXimpl(lazyGridItemInfo2.m33461getOffsetnOccac());
        }
        return Integer.valueOf(i2);
    }

    public Object scroll(C13088o<? super ScrollScope, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super C11921v> dVar) {
        Object scroll$default = ScrollableState.scroll$default(this.state, (MutatePriority) null, oVar, dVar, 1, (Object) null);
        if (scroll$default == C12150d.m26492c()) {
            return scroll$default;
        }
        return C11921v.f18618a;
    }

    public void snapToItem(ScrollScope scrollScope, int i, int i2) {
        C12775o.m28639i(scrollScope, "<this>");
        this.state.snapToItemIndexInternal$foundation_release(i, i2);
    }
}
