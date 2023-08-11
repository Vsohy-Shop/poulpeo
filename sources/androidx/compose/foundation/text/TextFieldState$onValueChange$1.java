package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: CoreTextField.kt */
final class TextFieldState$onValueChange$1 extends C12777p implements Function1<TextFieldValue, C11921v> {
    final /* synthetic */ TextFieldState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldState$onValueChange$1(TextFieldState textFieldState) {
        super(1);
        this.this$0 = textFieldState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextFieldValue) obj);
        return C11921v.f18618a;
    }

    public final void invoke(TextFieldValue textFieldValue) {
        C12775o.m28639i(textFieldValue, "it");
        String text = textFieldValue.getText();
        AnnotatedString untransformedText = this.this$0.getUntransformedText();
        if (!C12775o.m28634d(text, untransformedText != null ? untransformedText.getText() : null)) {
            this.this$0.setHandleState(HandleState.None);
        }
        this.this$0.onValueChangeOriginal.invoke(textFieldValue);
        this.this$0.getRecomposeScope().invalidate();
    }
}
