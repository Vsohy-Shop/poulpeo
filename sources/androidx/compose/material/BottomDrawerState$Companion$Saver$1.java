package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: Drawer.kt */
final class BottomDrawerState$Companion$Saver$1 extends C12777p implements C13088o<SaverScope, BottomDrawerState, BottomDrawerValue> {
    public static final BottomDrawerState$Companion$Saver$1 INSTANCE = new BottomDrawerState$Companion$Saver$1();

    BottomDrawerState$Companion$Saver$1() {
        super(2);
    }

    public final BottomDrawerValue invoke(SaverScope saverScope, BottomDrawerState bottomDrawerState) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(bottomDrawerState, "it");
        return (BottomDrawerValue) bottomDrawerState.getCurrentValue();
    }
}
