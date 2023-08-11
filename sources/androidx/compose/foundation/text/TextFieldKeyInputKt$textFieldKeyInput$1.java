package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: TextFieldKeyInput.kt */
final class TextFieldKeyInputKt$textFieldKeyInput$1 extends C12777p implements Function1<TextFieldValue, C11921v> {
    public static final TextFieldKeyInputKt$textFieldKeyInput$1 INSTANCE = new TextFieldKeyInputKt$textFieldKeyInput$1();

    TextFieldKeyInputKt$textFieldKeyInput$1() {
        super(1);
    }

    public final void invoke(TextFieldValue textFieldValue) {
        C12775o.m28639i(textFieldValue, "it");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextFieldValue) obj);
        return C11921v.f18618a;
    }
}
