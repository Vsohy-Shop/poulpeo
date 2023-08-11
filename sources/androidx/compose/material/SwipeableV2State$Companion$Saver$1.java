package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: SwipeableV2.kt */
final class SwipeableV2State$Companion$Saver$1 extends C12777p implements C13088o<SaverScope, SwipeableV2State<T>, T> {
    public static final SwipeableV2State$Companion$Saver$1 INSTANCE = new SwipeableV2State$Companion$Saver$1();

    SwipeableV2State$Companion$Saver$1() {
        super(2);
    }

    public final T invoke(SaverScope saverScope, SwipeableV2State<T> swipeableV2State) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(swipeableV2State, "it");
        return swipeableV2State.getCurrentValue();
    }
}
