package androidx.compose.material3;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: Swipeable.kt */
final class SwipeableState$Companion$Saver$1 extends C12777p implements C13088o<SaverScope, SwipeableState<T>, T> {
    public static final SwipeableState$Companion$Saver$1 INSTANCE = new SwipeableState$Companion$Saver$1();

    SwipeableState$Companion$Saver$1() {
        super(2);
    }

    public final T invoke(SaverScope saverScope, SwipeableState<T> swipeableState) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(swipeableState, "it");
        return swipeableState.getCurrentValue();
    }
}
