package androidx.compose.foundation.text;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.focus.FocusManager;
import androidx.compose.p002ui.input.key.KeyInputModifierKt;
import kotlin.jvm.internal.C12775o;

/* compiled from: TextFieldFocusModifier.android.kt */
public final class TextFieldFocusModifier_androidKt {
    public static final Modifier interceptDPadAndMoveFocus(Modifier modifier, TextFieldState textFieldState, FocusManager focusManager) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(textFieldState, "state");
        C12775o.m28639i(focusManager, "focusManager");
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1(focusManager, textFieldState));
    }
}
