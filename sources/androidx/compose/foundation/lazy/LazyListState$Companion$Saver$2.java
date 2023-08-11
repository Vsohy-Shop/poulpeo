package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: LazyListState.kt */
final class LazyListState$Companion$Saver$2 extends C12777p implements Function1<List<? extends Integer>, LazyListState> {
    public static final LazyListState$Companion$Saver$2 INSTANCE = new LazyListState$Companion$Saver$2();

    LazyListState$Companion$Saver$2() {
        super(1);
    }

    public final LazyListState invoke(List<Integer> list) {
        C12775o.m28639i(list, "it");
        return new LazyListState(list.get(0).intValue(), list.get(1).intValue());
    }
}
