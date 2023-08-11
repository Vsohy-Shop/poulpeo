package androidx.compose.material3;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: AppBar.kt */
final class TopAppBarState$Companion$Saver$2 extends C12777p implements Function1<List<? extends Float>, TopAppBarState> {
    public static final TopAppBarState$Companion$Saver$2 INSTANCE = new TopAppBarState$Companion$Saver$2();

    TopAppBarState$Companion$Saver$2() {
        super(1);
    }

    public final TopAppBarState invoke(List<Float> list) {
        C12775o.m28639i(list, "it");
        return new TopAppBarState(list.get(0).floatValue(), list.get(1).floatValue(), list.get(2).floatValue());
    }
}
