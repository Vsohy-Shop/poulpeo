package androidx.compose.p002ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.p002ui.text.TextRange;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.input.InputState_androidKt */
/* compiled from: InputState.android.kt */
public final class InputState_androidKt {
    public static final ExtractedText toExtractedText(TextFieldValue textFieldValue) {
        C12775o.m28639i(textFieldValue, "<this>");
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.getText();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.getText().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.m37973getMinimpl(textFieldValue.m38194getSelectiond9O1mEE());
        extractedText.selectionEnd = TextRange.m37972getMaximpl(textFieldValue.m38194getSelectiond9O1mEE());
        extractedText.flags = C13755w.m31550I(textFieldValue.getText(), 10, false, 2, (Object) null) ^ true ? 1 : 0;
        return extractedText;
    }
}
