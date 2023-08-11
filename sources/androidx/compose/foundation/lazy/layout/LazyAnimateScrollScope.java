package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.p002ui.unit.Density;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

/* compiled from: LazyAnimateScroll.kt */
public interface LazyAnimateScrollScope {
    float expectedDistanceTo(int i, int i2);

    Density getDensity();

    int getFirstVisibleItemIndex();

    int getFirstVisibleItemScrollOffset();

    int getItemCount();

    int getLastVisibleItemIndex();

    int getNumOfItemsForTeleport();

    Integer getTargetItemOffset(int i);

    Object scroll(C13088o<? super ScrollScope, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super C11921v> dVar);

    void snapToItem(ScrollScope scrollScope, int i, int i2);
}
