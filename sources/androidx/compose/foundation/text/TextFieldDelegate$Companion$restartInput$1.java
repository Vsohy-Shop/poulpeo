package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.input.EditCommand;
import androidx.compose.p002ui.text.input.EditProcessor;
import androidx.compose.p002ui.text.input.TextFieldValue;
import androidx.compose.p002ui.text.input.TextInputSession;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.Ref$ObjectRef;
import p336ef.C11921v;

/* compiled from: TextFieldDelegate.kt */
final class TextFieldDelegate$Companion$restartInput$1 extends C12777p implements Function1<List<? extends EditCommand>, C11921v> {
    final /* synthetic */ EditProcessor $editProcessor;
    final /* synthetic */ Function1<TextFieldValue, C11921v> $onValueChange;
    final /* synthetic */ Ref$ObjectRef<TextInputSession> $session;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldDelegate$Companion$restartInput$1(EditProcessor editProcessor, Function1<? super TextFieldValue, C11921v> function1, Ref$ObjectRef<TextInputSession> ref$ObjectRef) {
        super(1);
        this.$editProcessor = editProcessor;
        this.$onValueChange = function1;
        this.$session = ref$ObjectRef;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends EditCommand>) (List) obj);
        return C11921v.f18618a;
    }

    public final void invoke(List<? extends EditCommand> list) {
        C12775o.m28639i(list, "it");
        TextFieldDelegate.Companion.onEditCommand$foundation_release(list, this.$editProcessor, this.$onValueChange, (TextInputSession) this.$session.f20403b);
    }
}
