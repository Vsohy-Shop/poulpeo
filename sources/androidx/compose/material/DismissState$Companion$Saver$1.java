package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: SwipeToDismiss.kt */
final class DismissState$Companion$Saver$1 extends C12777p implements C13088o<SaverScope, DismissState, DismissValue> {
    public static final DismissState$Companion$Saver$1 INSTANCE = new DismissState$Companion$Saver$1();

    DismissState$Companion$Saver$1() {
        super(2);
    }

    public final DismissValue invoke(SaverScope saverScope, DismissState dismissState) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(dismissState, "it");
        return (DismissValue) dismissState.getCurrentValue();
    }
}
