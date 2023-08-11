package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.TextRange;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.input.TextFieldValueKt */
/* compiled from: TextFieldValue.kt */
public final class TextFieldValueKt {
    public static final AnnotatedString getSelectedText(TextFieldValue textFieldValue) {
        C12775o.m28639i(textFieldValue, "<this>");
        return textFieldValue.getAnnotatedString().m37847subSequence5zctL8(textFieldValue.m38194getSelectiond9O1mEE());
    }

    public static final AnnotatedString getTextAfterSelection(TextFieldValue textFieldValue, int i) {
        C12775o.m28639i(textFieldValue, "<this>");
        return textFieldValue.getAnnotatedString().subSequence(TextRange.m37972getMaximpl(textFieldValue.m38194getSelectiond9O1mEE()), Math.min(TextRange.m37972getMaximpl(textFieldValue.m38194getSelectiond9O1mEE()) + i, textFieldValue.getText().length()));
    }

    public static final AnnotatedString getTextBeforeSelection(TextFieldValue textFieldValue, int i) {
        C12775o.m28639i(textFieldValue, "<this>");
        return textFieldValue.getAnnotatedString().subSequence(Math.max(0, TextRange.m37973getMinimpl(textFieldValue.m38194getSelectiond9O1mEE()) - i), TextRange.m37973getMinimpl(textFieldValue.m38194getSelectiond9O1mEE()));
    }
}
