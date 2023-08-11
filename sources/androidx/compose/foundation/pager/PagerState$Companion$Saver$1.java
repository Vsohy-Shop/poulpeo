package androidx.compose.foundation.pager;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: PagerState.kt */
final class PagerState$Companion$Saver$1 extends C12777p implements C13088o<SaverScope, PagerState, List<? extends Object>> {
    public static final PagerState$Companion$Saver$1 INSTANCE = new PagerState$Companion$Saver$1();

    PagerState$Companion$Saver$1() {
        super(2);
    }

    public final List<Object> invoke(SaverScope saverScope, PagerState pagerState) {
        C12775o.m28639i(saverScope, "$this$listSaver");
        C12775o.m28639i(pagerState, "it");
        return C12726w.m28527n(Integer.valueOf(pagerState.getCurrentPage()), Float.valueOf(pagerState.getCurrentPageOffsetFraction()));
    }
}
