package androidx.compose.foundation.lazy;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: LazyListState.kt */
final class LazyListState$Companion$Saver$1 extends C12777p implements C13088o<SaverScope, LazyListState, List<? extends Integer>> {
    public static final LazyListState$Companion$Saver$1 INSTANCE = new LazyListState$Companion$Saver$1();

    LazyListState$Companion$Saver$1() {
        super(2);
    }

    public final List<Integer> invoke(SaverScope saverScope, LazyListState lazyListState) {
        C12775o.m28639i(saverScope, "$this$listSaver");
        C12775o.m28639i(lazyListState, "it");
        return C12726w.m28527n(Integer.valueOf(lazyListState.getFirstVisibleItemIndex()), Integer.valueOf(lazyListState.getFirstVisibleItemScrollOffset()));
    }
}
