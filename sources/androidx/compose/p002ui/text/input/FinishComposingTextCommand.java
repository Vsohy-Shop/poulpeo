package androidx.compose.p002ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.text.input.FinishComposingTextCommand */
/* compiled from: EditCommand.kt */
public final class FinishComposingTextCommand implements EditCommand {
    public static final int $stable = 0;

    public void applyTo(EditingBuffer editingBuffer) {
        C12775o.m28639i(editingBuffer, "buffer");
        editingBuffer.commitComposition$ui_text_release();
    }

    public boolean equals(Object obj) {
        return obj instanceof FinishComposingTextCommand;
    }

    public int hashCode() {
        return C12764h0.m28586b(FinishComposingTextCommand.class).hashCode();
    }

    public String toString() {
        return "FinishComposingTextCommand()";
    }
}
