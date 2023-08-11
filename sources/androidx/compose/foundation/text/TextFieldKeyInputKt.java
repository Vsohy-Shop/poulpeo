package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.text.input.OffsetMapping;
import androidx.compose.p002ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: TextFieldKeyInput.kt */
public final class TextFieldKeyInputKt {
    public static final Modifier textFieldKeyInput(Modifier modifier, TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, Function1<? super TextFieldValue, C11921v> function1, boolean z, boolean z2, OffsetMapping offsetMapping, UndoManager undoManager) {
        Modifier modifier2 = modifier;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(textFieldState, "state");
        C12775o.m28639i(textFieldSelectionManager, "manager");
        C12775o.m28639i(textFieldValue, "value");
        C12775o.m28639i(function1, "onValueChange");
        OffsetMapping offsetMapping2 = offsetMapping;
        C12775o.m28639i(offsetMapping2, "offsetMapping");
        UndoManager undoManager2 = undoManager;
        C12775o.m28639i(undoManager2, "undoManager");
        return ComposedModifierKt.composed$default(modifier, (Function1) null, new TextFieldKeyInputKt$textFieldKeyInput$2(textFieldState, textFieldSelectionManager, textFieldValue, z, z2, offsetMapping2, undoManager2, function1), 1, (Object) null);
    }

    public static /* synthetic */ Modifier textFieldKeyInput$default(Modifier modifier, TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, Function1 function1, boolean z, boolean z2, OffsetMapping offsetMapping, UndoManager undoManager, int i, Object obj) {
        TextFieldKeyInputKt$textFieldKeyInput$1 textFieldKeyInputKt$textFieldKeyInput$1;
        if ((i & 8) != 0) {
            textFieldKeyInputKt$textFieldKeyInput$1 = TextFieldKeyInputKt$textFieldKeyInput$1.INSTANCE;
        } else {
            textFieldKeyInputKt$textFieldKeyInput$1 = function1;
        }
        return textFieldKeyInput(modifier, textFieldState, textFieldSelectionManager, textFieldValue, textFieldKeyInputKt$textFieldKeyInput$1, z, z2, offsetMapping, undoManager);
    }
}
