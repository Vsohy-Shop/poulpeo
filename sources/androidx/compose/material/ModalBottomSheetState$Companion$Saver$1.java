package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: ModalBottomSheet.kt */
final class ModalBottomSheetState$Companion$Saver$1 extends C12777p implements C13088o<SaverScope, ModalBottomSheetState, ModalBottomSheetValue> {
    public static final ModalBottomSheetState$Companion$Saver$1 INSTANCE = new ModalBottomSheetState$Companion$Saver$1();

    ModalBottomSheetState$Companion$Saver$1() {
        super(2);
    }

    public final ModalBottomSheetValue invoke(SaverScope saverScope, ModalBottomSheetState modalBottomSheetState) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(modalBottomSheetState, "it");
        return modalBottomSheetState.getCurrentValue();
    }
}
