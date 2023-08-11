package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.input.TextFieldValue;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: BasicTextField.kt */
final class BasicTextFieldKt$BasicTextField$4$1 extends C12777p implements Function1<TextFieldValue, C11921v> {
    final /* synthetic */ MutableState<String> $lastTextValue$delegate;
    final /* synthetic */ Function1<String, C11921v> $onValueChange;
    final /* synthetic */ MutableState<TextFieldValue> $textFieldValueState$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BasicTextFieldKt$BasicTextField$4$1(Function1<? super String, C11921v> function1, MutableState<TextFieldValue> mutableState, MutableState<String> mutableState2) {
        super(1);
        this.$onValueChange = function1;
        this.$textFieldValueState$delegate = mutableState;
        this.$lastTextValue$delegate = mutableState2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextFieldValue) obj);
        return C11921v.f18618a;
    }

    public final void invoke(TextFieldValue textFieldValue) {
        C12775o.m28639i(textFieldValue, "newTextFieldValueState");
        BasicTextFieldKt.BasicTextField$lambda$3(this.$textFieldValueState$delegate, textFieldValue);
        boolean z = !C12775o.m28634d(BasicTextFieldKt.BasicTextField$lambda$6(this.$lastTextValue$delegate), textFieldValue.getText());
        BasicTextFieldKt.BasicTextField$lambda$7(this.$lastTextValue$delegate, textFieldValue.getText());
        if (z) {
            this.$onValueChange.invoke(textFieldValue.getText());
        }
    }
}
