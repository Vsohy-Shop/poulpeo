package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: BottomSheetScaffold.kt */
final class BottomSheetState$Companion$Saver$1 extends C12777p implements C13088o<SaverScope, BottomSheetState, BottomSheetValue> {
    public static final BottomSheetState$Companion$Saver$1 INSTANCE = new BottomSheetState$Companion$Saver$1();

    BottomSheetState$Companion$Saver$1() {
        super(2);
    }

    public final BottomSheetValue invoke(SaverScope saverScope, BottomSheetState bottomSheetState) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(bottomSheetState, "it");
        return bottomSheetState.getSwipeableState$material_release().getCurrentValue();
    }
}
