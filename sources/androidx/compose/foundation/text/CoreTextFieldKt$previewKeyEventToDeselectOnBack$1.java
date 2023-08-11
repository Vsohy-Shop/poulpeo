package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.key.KeyEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$previewKeyEventToDeselectOnBack$1 extends C12777p implements Function1<KeyEvent, Boolean> {
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ TextFieldState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$previewKeyEventToDeselectOnBack$1(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        super(1);
        this.$state = textFieldState;
        this.$manager = textFieldSelectionManager;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m33648invokeZmokQxo(((KeyEvent) obj).m37015unboximpl());
    }

    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    public final Boolean m33648invokeZmokQxo(android.view.KeyEvent keyEvent) {
        boolean z;
        C12775o.m28639i(keyEvent, "keyEvent");
        if (this.$state.getHandleState() != HandleState.Selection || !KeyEventHelpers_androidKt.m33656cancelsTextSelectionZmokQxo(keyEvent)) {
            z = false;
        } else {
            z = true;
            TextFieldSelectionManager.m33840deselect_kEHs6E$foundation_release$default(this.$manager, (Offset) null, 1, (Object) null);
        }
        return Boolean.valueOf(z);
    }
}
