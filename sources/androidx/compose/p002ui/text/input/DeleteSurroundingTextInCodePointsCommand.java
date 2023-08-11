package androidx.compose.p002ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand */
/* compiled from: EditCommand.kt */
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {
    public static final int $stable = 0;
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public DeleteSurroundingTextInCodePointsCommand(int i, int i2) {
        boolean z;
        this.lengthBeforeCursor = i;
        this.lengthAfterCursor = i2;
        if (i < 0 || i2 < 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.").toString());
        }
    }

    public void applyTo(EditingBuffer editingBuffer) {
        C12775o.m28639i(editingBuffer, "buffer");
        int i = this.lengthBeforeCursor;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2++;
            if (editingBuffer.getSelectionStart$ui_text_release() > i2 && EditCommandKt.isSurrogatePair(editingBuffer.get$ui_text_release((editingBuffer.getSelectionStart$ui_text_release() - i2) - 1), editingBuffer.get$ui_text_release(editingBuffer.getSelectionStart$ui_text_release() - i2))) {
                i2++;
            }
            if (i2 == editingBuffer.getSelectionStart$ui_text_release()) {
                break;
            }
        }
        int i4 = this.lengthAfterCursor;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5++;
            if (editingBuffer.getSelectionEnd$ui_text_release() + i5 < editingBuffer.getLength$ui_text_release() && EditCommandKt.isSurrogatePair(editingBuffer.get$ui_text_release((editingBuffer.getSelectionEnd$ui_text_release() + i5) - 1), editingBuffer.get$ui_text_release(editingBuffer.getSelectionEnd$ui_text_release() + i5))) {
                i5++;
            }
            if (editingBuffer.getSelectionEnd$ui_text_release() + i5 == editingBuffer.getLength$ui_text_release()) {
                break;
            }
        }
        editingBuffer.delete$ui_text_release(editingBuffer.getSelectionEnd$ui_text_release(), editingBuffer.getSelectionEnd$ui_text_release() + i5);
        editingBuffer.delete$ui_text_release(editingBuffer.getSelectionStart$ui_text_release() - i2, editingBuffer.getSelectionStart$ui_text_release());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) obj;
        if (this.lengthBeforeCursor == deleteSurroundingTextInCodePointsCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextInCodePointsCommand.lengthAfterCursor) {
            return true;
        }
        return false;
    }

    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.lengthBeforeCursor + ", lengthAfterCursor=" + this.lengthAfterCursor + ')';
    }
}
