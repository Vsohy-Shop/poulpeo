package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.text.JvmCharHelpers_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.text.input.MoveCursorCommand */
/* compiled from: EditCommand.kt */
public final class MoveCursorCommand implements EditCommand {
    public static final int $stable = 0;
    private final int amount;

    public MoveCursorCommand(int i) {
        this.amount = i;
    }

    public void applyTo(EditingBuffer editingBuffer) {
        C12775o.m28639i(editingBuffer, "buffer");
        if (editingBuffer.getCursor$ui_text_release() == -1) {
            editingBuffer.setCursor$ui_text_release(editingBuffer.getSelectionStart$ui_text_release());
        }
        int selectionStart$ui_text_release = editingBuffer.getSelectionStart$ui_text_release();
        String editingBuffer2 = editingBuffer.toString();
        int i = this.amount;
        int i2 = 0;
        if (i <= 0) {
            int i3 = -i;
            while (i2 < i3) {
                int findPrecedingBreak = JvmCharHelpers_androidKt.findPrecedingBreak(editingBuffer2, selectionStart$ui_text_release);
                if (findPrecedingBreak == -1) {
                    break;
                }
                i2++;
                selectionStart$ui_text_release = findPrecedingBreak;
            }
        } else {
            while (i2 < i) {
                int findFollowingBreak = JvmCharHelpers_androidKt.findFollowingBreak(editingBuffer2, selectionStart$ui_text_release);
                if (findFollowingBreak == -1) {
                    break;
                }
                i2++;
                selectionStart$ui_text_release = findFollowingBreak;
            }
        }
        editingBuffer.setCursor$ui_text_release(selectionStart$ui_text_release);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof MoveCursorCommand) && this.amount == ((MoveCursorCommand) obj).amount) {
            return true;
        }
        return false;
    }

    public final int getAmount() {
        return this.amount;
    }

    public int hashCode() {
        return this.amount;
    }

    public String toString() {
        return "MoveCursorCommand(amount=" + this.amount + ')';
    }
}
