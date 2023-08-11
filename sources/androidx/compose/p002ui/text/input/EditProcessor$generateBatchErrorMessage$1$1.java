package androidx.compose.p002ui.text.input;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.text.input.EditProcessor$generateBatchErrorMessage$1$1 */
/* compiled from: EditProcessor.kt */
final class EditProcessor$generateBatchErrorMessage$1$1 extends C12777p implements Function1<EditCommand, CharSequence> {
    final /* synthetic */ EditCommand $failedCommand;
    final /* synthetic */ EditProcessor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EditProcessor$generateBatchErrorMessage$1$1(EditCommand editCommand, EditProcessor editProcessor) {
        super(1);
        this.$failedCommand = editCommand;
        this.this$0 = editProcessor;
    }

    public final CharSequence invoke(EditCommand editCommand) {
        C12775o.m28639i(editCommand, "it");
        String str = this.$failedCommand == editCommand ? " > " : "   ";
        return str + this.this$0.toStringForLog(editCommand);
    }
}
