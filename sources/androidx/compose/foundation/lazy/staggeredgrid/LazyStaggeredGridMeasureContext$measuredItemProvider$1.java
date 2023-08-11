package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.p002ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* compiled from: LazyStaggeredGridMeasure.kt */
final class LazyStaggeredGridMeasureContext$measuredItemProvider$1 implements MeasuredItemFactory {
    final /* synthetic */ LazyStaggeredGridMeasureContext this$0;

    LazyStaggeredGridMeasureContext$measuredItemProvider$1(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        this.this$0 = lazyStaggeredGridMeasureContext;
    }

    public final LazyStaggeredGridMeasuredItem createItem(int i, int i2, int i3, Object obj, List<? extends Placeable> list) {
        C12775o.m28639i(obj, "key");
        C12775o.m28639i(list, "placeables");
        return new LazyStaggeredGridMeasuredItem(i, obj, list, this.this$0.isVertical(), this.this$0.getMainAxisSpacing(), i2, i3);
    }
}
