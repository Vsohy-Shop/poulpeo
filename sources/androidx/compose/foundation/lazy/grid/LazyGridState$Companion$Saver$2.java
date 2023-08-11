package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: LazyGridState.kt */
final class LazyGridState$Companion$Saver$2 extends C12777p implements Function1<List<? extends Integer>, LazyGridState> {
    public static final LazyGridState$Companion$Saver$2 INSTANCE = new LazyGridState$Companion$Saver$2();

    LazyGridState$Companion$Saver$2() {
        super(1);
    }

    public final LazyGridState invoke(List<Integer> list) {
        C12775o.m28639i(list, "it");
        return new LazyGridState(list.get(0).intValue(), list.get(1).intValue());
    }
}
