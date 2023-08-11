package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.C12771l;
import p404of.C13088o;

/* compiled from: LazyStaggeredGridState.kt */
/* synthetic */ class LazyStaggeredGridState$scrollPosition$1 extends C12771l implements C13088o<Integer, Integer, int[]> {
    LazyStaggeredGridState$scrollPosition$1(Object obj) {
        super(2, obj, LazyStaggeredGridState.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
    }

    public final int[] invoke(int i, int i2) {
        return ((LazyStaggeredGridState) this.receiver).fillNearestIndices(i, i2);
    }
}
