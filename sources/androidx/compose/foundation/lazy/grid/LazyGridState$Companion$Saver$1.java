package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: LazyGridState.kt */
final class LazyGridState$Companion$Saver$1 extends C12777p implements C13088o<SaverScope, LazyGridState, List<? extends Integer>> {
    public static final LazyGridState$Companion$Saver$1 INSTANCE = new LazyGridState$Companion$Saver$1();

    LazyGridState$Companion$Saver$1() {
        super(2);
    }

    public final List<Integer> invoke(SaverScope saverScope, LazyGridState lazyGridState) {
        C12775o.m28639i(saverScope, "$this$listSaver");
        C12775o.m28639i(lazyGridState, "it");
        return C12726w.m28527n(Integer.valueOf(lazyGridState.getFirstVisibleItemIndex()), Integer.valueOf(lazyGridState.getFirstVisibleItemScrollOffset()));
    }
}
