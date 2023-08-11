package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: LazyStaggeredGridState.kt */
final class LazyStaggeredGridState$Companion$Saver$1 extends C12777p implements C13088o<SaverScope, LazyStaggeredGridState, List<? extends int[]>> {
    public static final LazyStaggeredGridState$Companion$Saver$1 INSTANCE = new LazyStaggeredGridState$Companion$Saver$1();

    LazyStaggeredGridState$Companion$Saver$1() {
        super(2);
    }

    public final List<int[]> invoke(SaverScope saverScope, LazyStaggeredGridState lazyStaggeredGridState) {
        C12775o.m28639i(saverScope, "$this$listSaver");
        C12775o.m28639i(lazyStaggeredGridState, "state");
        return C12726w.m28527n(lazyStaggeredGridState.getScrollPosition$foundation_release().getIndices(), lazyStaggeredGridState.getScrollPosition$foundation_release().getOffsets());
    }
}
