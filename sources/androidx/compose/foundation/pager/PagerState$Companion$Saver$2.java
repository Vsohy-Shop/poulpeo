package androidx.compose.foundation.pager;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: PagerState.kt */
final class PagerState$Companion$Saver$2 extends C12777p implements Function1<List, PagerState> {
    public static final PagerState$Companion$Saver$2 INSTANCE = new PagerState$Companion$Saver$2();

    PagerState$Companion$Saver$2() {
        super(1);
    }

    public final PagerState invoke(List<? extends Object> list) {
        C12775o.m28639i(list, "it");
        Object obj = list.get(0);
        C12775o.m28637g(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        Object obj2 = list.get(1);
        C12775o.m28637g(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new PagerState(intValue, ((Float) obj2).floatValue());
    }
}
