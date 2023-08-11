package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
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

@SourceDebugExtension({"SMAP\nLazyStaggeredGridAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,70:1\n132#2,3:71\n33#2,4:74\n135#2,2:78\n38#2:80\n137#2:81\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope\n*L\n55#1:71,3\n55#1:74,4\n55#1:78,2\n55#1:80\n55#1:81\n*E\n"})
@ExperimentalFoundationApi
/* compiled from: LazyStaggeredGridAnimateScrollScope.kt */
public final class LazyStaggeredGridAnimateScrollScope implements LazyAnimateScrollScope {
    private final LazyStaggeredGridState state;

    public LazyStaggeredGridAnimateScrollScope(LazyStaggeredGridState lazyStaggeredGridState) {
        C12775o.m28639i(lazyStaggeredGridState, "state");
        this.state = lazyStaggeredGridState;
    }

    public float expectedDistanceTo(int i, int i2) {
        int i3;
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = this.state.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = visibleItemsInfo.get(i5);
            if (this.state.isVertical$foundation_release()) {
                i3 = IntSize.m38627getHeightimpl(lazyStaggeredGridItemInfo.m33549getSizeYbymL2g());
            } else {
                i3 = IntSize.m38628getWidthimpl(lazyStaggeredGridItemInfo.m33549getSizeYbymL2g());
            }
            i4 += i3;
        }
        int size2 = i4 / (visibleItemsInfo.size() * this.state.getLaneCount$foundation_release());
        int firstVisibleItemIndex = i - getFirstVisibleItemIndex();
        int min = Math.min(Math.abs(i2), size2);
        if (i2 < 0) {
            min *= -1;
        }
        return (((float) (size2 * firstVisibleItemIndex)) + ((float) min)) - ((float) getFirstVisibleItemScrollOffset());
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
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = (LazyStaggeredGridItemInfo) C12686e0.m28232k0(this.state.getLayoutInfo().getVisibleItemsInfo());
        if (lazyStaggeredGridItemInfo != null) {
            return lazyStaggeredGridItemInfo.getIndex();
        }
        return 0;
    }

    public int getNumOfItemsForTeleport() {
        return this.state.getLaneCount$foundation_release() * 100;
    }

    public Integer getTargetItemOffset(int i) {
        int i2;
        LazyStaggeredGridItemInfo findVisibleItem = LazyStaggeredGridMeasureResultKt.findVisibleItem(this.state.getLayoutInfo(), i);
        if (findVisibleItem == null) {
            return null;
        }
        long r0 = findVisibleItem.m33548getOffsetnOccac();
        if (this.state.isVertical$foundation_release()) {
            i2 = IntOffset.m38587getYimpl(r0);
        } else {
            i2 = IntOffset.m38586getXimpl(r0);
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
        this.state.snapToItemInternal$foundation_release(scrollScope, i, i2);
    }
}
