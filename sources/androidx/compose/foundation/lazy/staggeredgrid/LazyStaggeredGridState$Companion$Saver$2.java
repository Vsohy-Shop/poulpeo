package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LazyStaggeredGridState.kt */
final class LazyStaggeredGridState$Companion$Saver$2 extends C12777p implements Function1<List<? extends int[]>, LazyStaggeredGridState> {
    public static final LazyStaggeredGridState$Companion$Saver$2 INSTANCE = new LazyStaggeredGridState$Companion$Saver$2();

    LazyStaggeredGridState$Companion$Saver$2() {
        super(1);
    }

    public final LazyStaggeredGridState invoke(List<int[]> list) {
        C12775o.m28639i(list, "it");
        return new LazyStaggeredGridState(list.get(0), list.get(1), (DefaultConstructorMarker) null);
    }
}
