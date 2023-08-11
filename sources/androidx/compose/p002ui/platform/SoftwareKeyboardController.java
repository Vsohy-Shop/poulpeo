package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.Stable;

@ExperimentalComposeUiApi
@Stable
/* renamed from: androidx.compose.ui.platform.SoftwareKeyboardController */
/* compiled from: SoftwareKeyboardController.kt */
public interface SoftwareKeyboardController {
    void hide();

    void hideSoftwareKeyboard() {
        hide();
    }

    void show();

    void showSoftwareKeyboard() {
        show();
    }
}
