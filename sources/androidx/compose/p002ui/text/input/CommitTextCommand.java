package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.text.input.CommitTextCommand */
/* compiled from: EditCommand.kt */
public final class CommitTextCommand implements EditCommand {
    public static final int $stable = 0;
    private final AnnotatedString annotatedString;
    private final int newCursorPosition;

    public CommitTextCommand(AnnotatedString annotatedString2, int i) {
        C12775o.m28639i(annotatedString2, "annotatedString");
        this.annotatedString = annotatedString2;
        this.newCursorPosition = i;
    }

    public void applyTo(EditingBuffer editingBuffer) {
        int i;
        C12775o.m28639i(editingBuffer, "buffer");
        if (editingBuffer.hasComposition$ui_text_release()) {
            editingBuffer.replace$ui_text_release(editingBuffer.getCompositionStart$ui_text_release(), editingBuffer.getCompositionEnd$ui_text_release(), getText());
        } else {
            editingBuffer.replace$ui_text_release(editingBuffer.getSelectionStart$ui_text_release(), editingBuffer.getSelectionEnd$ui_text_release(), getText());
        }
        int cursor$ui_text_release = editingBuffer.getCursor$ui_text_release();
        int i2 = this.newCursorPosition;
        if (i2 > 0) {
            i = (cursor$ui_text_release + i2) - 1;
        } else {
            i = (cursor$ui_text_release + i2) - getText().length();
        }
        editingBuffer.setCursor$ui_text_release(C13537l.m30886m(i, 0, editingBuffer.getLength$ui_text_release()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommitTextCommand)) {
            return false;
        }
        CommitTextCommand commitTextCommand = (CommitTextCommand) obj;
        if (C12775o.m28634d(getText(), commitTextCommand.getText()) && this.newCursorPosition == commitTextCommand.newCursorPosition) {
            return true;
        }
        return false;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        return (getText().hashCode() * 31) + this.newCursorPosition;
    }

    public String toString() {
        return "CommitTextCommand(text='" + getText() + "', newCursorPosition=" + this.newCursorPosition + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CommitTextCommand(String str, int i) {
        this(new AnnotatedString(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), i);
        C12775o.m28639i(str, "text");
    }
}
