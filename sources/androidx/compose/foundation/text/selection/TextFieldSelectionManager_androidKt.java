package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.MagnifierStyle;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.input.pointer.PointerEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* compiled from: TextFieldSelectionManager.android.kt */
public final class TextFieldSelectionManager_androidKt {
    public static final boolean isShiftPressed(PointerEvent pointerEvent) {
        C12775o.m28639i(pointerEvent, "<this>");
        return false;
    }

    public static final Modifier textFieldMagnifier(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(textFieldSelectionManager, "manager");
        if (!MagnifierStyle.Companion.getTextDefault().isSupported()) {
            return modifier;
        }
        return ComposedModifierKt.composed$default(modifier, (Function1) null, new TextFieldSelectionManager_androidKt$textFieldMagnifier$1(textFieldSelectionManager), 1, (Object) null);
    }
}
