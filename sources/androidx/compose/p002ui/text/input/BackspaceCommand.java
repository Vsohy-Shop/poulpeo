package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.text.JvmCharHelpers_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.text.input.BackspaceCommand */
/* compiled from: EditCommand.kt */
public final class BackspaceCommand implements EditCommand {
    public static final int $stable = 0;

    public void applyTo(EditingBuffer editingBuffer) {
        C12775o.m28639i(editingBuffer, "buffer");
        if (editingBuffer.hasComposition$ui_text_release()) {
            editingBuffer.delete$ui_text_release(editingBuffer.getCompositionStart$ui_text_release(), editingBuffer.getCompositionEnd$ui_text_release());
        } else if (editingBuffer.getCursor$ui_text_release() == -1) {
            int selectionStart$ui_text_release = editingBuffer.getSelectionStart$ui_text_release();
            int selectionEnd$ui_text_release = editingBuffer.getSelectionEnd$ui_text_release();
            editingBuffer.setCursor$ui_text_release(editingBuffer.getSelectionStart$ui_text_release());
            editingBuffer.delete$ui_text_release(selectionStart$ui_text_release, selectionEnd$ui_text_release);
        } else if (editingBuffer.getCursor$ui_text_release() != 0) {
            editingBuffer.delete$ui_text_release(JvmCharHelpers_androidKt.findPrecedingBreak(editingBuffer.toString(), editingBuffer.getCursor$ui_text_release()), editingBuffer.getCursor$ui_text_release());
        }
    }

    public boolean equals(Object obj) {
        return obj instanceof BackspaceCommand;
    }

    public int hashCode() {
        return C12764h0.m28586b(BackspaceCommand.class).hashCode();
    }

    public String toString() {
        return "BackspaceCommand()";
    }
}
