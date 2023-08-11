package androidx.compose.foundation.lazy;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope;
import androidx.compose.p002ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nLazyListAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,65:1\n116#2,2:66\n33#2,6:68\n118#2:74\n132#2,3:75\n33#2,4:78\n135#2,2:82\n38#2:84\n137#2:85\n*S KotlinDebug\n*F\n+ 1 LazyListAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListAnimateScrollScope\n*L\n44#1:66,2\n44#1:68,6\n44#1:74\n54#1:75,3\n54#1:78,4\n54#1:82,2\n54#1:84\n54#1:85\n*E\n"})
/* compiled from: LazyListAnimateScrollScope.kt */
public final class LazyListAnimateScrollScope implements LazyAnimateScrollScope {
    private final int numOfItemsForTeleport = 100;
    private final LazyListState state;

    public LazyListAnimateScrollScope(LazyListState lazyListState) {
        C12775o.m28639i(lazyListState, "state");
        this.state = lazyListState;
    }

    public float expectedDistanceTo(int i, int i2) {
        List<LazyListItemInfo> visibleItemsInfo = this.state.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += visibleItemsInfo.get(i4).getSize();
        }
        int size2 = i3 / visibleItemsInfo.size();
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
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) C12686e0.m28232k0(this.state.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo != null) {
            return lazyListItemInfo.getIndex();
        }
        return 0;
    }

    public int getNumOfItemsForTeleport() {
        return this.numOfItemsForTeleport;
    }

    public Integer getTargetItemOffset(int i) {
        LazyListItemInfo lazyListItemInfo;
        boolean z;
        List<LazyListItemInfo> visibleItemsInfo = this.state.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                lazyListItemInfo = null;
                break;
            }
            lazyListItemInfo = visibleItemsInfo.get(i2);
            if (lazyListItemInfo.getIndex() == i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i2++;
        }
        LazyListItemInfo lazyListItemInfo2 = lazyListItemInfo;
        if (lazyListItemInfo2 != null) {
            return Integer.valueOf(lazyListItemInfo2.getOffset());
        }
        return null;
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
