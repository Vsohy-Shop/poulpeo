package androidx.compose.p002ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.text.input.SetSelectionCommand */
/* compiled from: EditCommand.kt */
public final class SetSelectionCommand implements EditCommand {
    public static final int $stable = 0;
    private final int end;
    private final int start;

    public SetSelectionCommand(int i, int i2) {
        this.start = i;
        this.end = i2;
    }

    public void applyTo(EditingBuffer editingBuffer) {
        C12775o.m28639i(editingBuffer, "buffer");
        int m = C13537l.m30886m(this.start, 0, editingBuffer.getLength$ui_text_release());
        int m2 = C13537l.m30886m(this.end, 0, editingBuffer.getLength$ui_text_release());
        if (m < m2) {
            editingBuffer.setSelection$ui_text_release(m, m2);
        } else {
            editingBuffer.setSelection$ui_text_release(m2, m);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetSelectionCommand)) {
            return false;
        }
        SetSelectionCommand setSelectionCommand = (SetSelectionCommand) obj;
        if (this.start == setSelectionCommand.start && this.end == setSelectionCommand.end) {
            return true;
        }
        return false;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return (this.start * 31) + this.end;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.start + ", end=" + this.end + ')';
    }
}
