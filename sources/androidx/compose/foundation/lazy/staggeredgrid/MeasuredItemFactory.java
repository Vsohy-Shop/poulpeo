package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.p002ui.layout.Placeable;
import java.util.List;

/* compiled from: LazyStaggeredGridMeasure.kt */
interface MeasuredItemFactory {
    LazyStaggeredGridMeasuredItem createItem(int i, int i2, int i3, Object obj, List<? extends Placeable> list);
}
