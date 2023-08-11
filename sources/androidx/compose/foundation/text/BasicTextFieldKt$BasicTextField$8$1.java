package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: BasicTextField.kt */
final class BasicTextFieldKt$BasicTextField$8$1 extends C12777p implements Function1<TextFieldValue, C11921v> {
    final /* synthetic */ Function1<TextFieldValue, C11921v> $onValueChange;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BasicTextFieldKt$BasicTextField$8$1(TextFieldValue textFieldValue, Function1<? super TextFieldValue, C11921v> function1) {
        super(1);
        this.$value = textFieldValue;
        this.$onValueChange = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextFieldValue) obj);
        return C11921v.f18618a;
    }

    public final void invoke(TextFieldValue textFieldValue) {
        C12775o.m28639i(textFieldValue, "it");
        if (!C12775o.m28634d(this.$value, textFieldValue)) {
            this.$onValueChange.invoke(textFieldValue);
        }
    }
}
