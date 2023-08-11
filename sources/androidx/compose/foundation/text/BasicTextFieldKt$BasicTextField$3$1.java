package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.input.TextFieldValue;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: BasicTextField.kt */
final class BasicTextFieldKt$BasicTextField$3$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ TextFieldValue $textFieldValue;
    final /* synthetic */ MutableState<TextFieldValue> $textFieldValueState$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BasicTextFieldKt$BasicTextField$3$1(TextFieldValue textFieldValue, MutableState<TextFieldValue> mutableState) {
        super(0);
        this.$textFieldValue = textFieldValue;
        this.$textFieldValueState$delegate = mutableState;
    }

    public final void invoke() {
        if (!TextRange.m37968equalsimpl0(this.$textFieldValue.m38194getSelectiond9O1mEE(), BasicTextFieldKt.BasicTextField$lambda$2(this.$textFieldValueState$delegate).m38194getSelectiond9O1mEE()) || !C12775o.m28634d(this.$textFieldValue.m38193getCompositionMzsxiRA(), BasicTextFieldKt.BasicTextField$lambda$2(this.$textFieldValueState$delegate).m38193getCompositionMzsxiRA())) {
            BasicTextFieldKt.BasicTextField$lambda$3(this.$textFieldValueState$delegate, this.$textFieldValue);
        }
    }
}
