package androidx.compose.p002ui.text.input;

import android.view.inputmethod.ExtractedText;

/* renamed from: androidx.compose.ui.text.input.InputMethodManager */
/* compiled from: InputMethodManager.kt */
public interface InputMethodManager {
    void hideSoftInput();

    void restartInput();

    void showSoftInput();

    void updateExtractedText(int i, ExtractedText extractedText);

    void updateSelection(int i, int i2, int i3, int i4);
}
