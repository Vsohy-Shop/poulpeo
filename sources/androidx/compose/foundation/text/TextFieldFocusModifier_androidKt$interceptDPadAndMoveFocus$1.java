package androidx.compose.foundation.text;

import android.view.InputDevice;
import androidx.compose.p002ui.focus.FocusDirection;
import androidx.compose.p002ui.focus.FocusManager;
import androidx.compose.p002ui.input.key.KeyEvent;
import androidx.compose.p002ui.input.key.KeyEventType;
import androidx.compose.p002ui.input.key.KeyEvent_androidKt;
import androidx.compose.p002ui.input.key.Key_androidKt;
import androidx.compose.p002ui.text.input.TextInputSession;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: TextFieldFocusModifier.android.kt */
final class TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1 extends C12777p implements Function1<KeyEvent, Boolean> {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ TextFieldState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1(FocusManager focusManager, TextFieldState textFieldState) {
        super(1);
        this.$focusManager = focusManager;
        this.$state = textFieldState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m33719invokeZmokQxo(((KeyEvent) obj).m37015unboximpl());
    }

    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    public final Boolean m33719invokeZmokQxo(android.view.KeyEvent keyEvent) {
        boolean z;
        C12775o.m28639i(keyEvent, "keyEvent");
        InputDevice device = keyEvent.getDevice();
        if (device == null) {
            return Boolean.FALSE;
        }
        if (device.getKeyboardType() == 2 && device.isVirtual()) {
            return Boolean.FALSE;
        }
        if (!KeyEventType.m37019equalsimpl0(KeyEvent_androidKt.m37027getTypeZmokQxo(keyEvent), KeyEventType.Companion.m37023getKeyDownCS__XNY())) {
            return Boolean.FALSE;
        }
        switch (Key_androidKt.m37037getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m37026getKeyZmokQxo(keyEvent))) {
            case 19:
                z = this.$focusManager.m35362moveFocus3ESFkO8(FocusDirection.Companion.m35361getUpdhqQ8s());
                break;
            case 20:
                z = this.$focusManager.m35362moveFocus3ESFkO8(FocusDirection.Companion.m35352getDowndhqQ8s());
                break;
            case 21:
                z = this.$focusManager.m35362moveFocus3ESFkO8(FocusDirection.Companion.m35356getLeftdhqQ8s());
                break;
            case 22:
                z = this.$focusManager.m35362moveFocus3ESFkO8(FocusDirection.Companion.m35360getRightdhqQ8s());
                break;
            case 23:
                TextInputSession inputSession = this.$state.getInputSession();
                if (inputSession != null) {
                    inputSession.showSoftwareKeyboard();
                }
                z = true;
                break;
            default:
                z = false;
                break;
        }
        return Boolean.valueOf(z);
    }
}
