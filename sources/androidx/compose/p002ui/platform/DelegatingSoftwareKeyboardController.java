package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.text.input.TextInputService;
import kotlin.jvm.internal.C12775o;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.platform.DelegatingSoftwareKeyboardController */
/* compiled from: LocalSoftwareKeyboardController.kt */
final class DelegatingSoftwareKeyboardController implements SoftwareKeyboardController {
    private final TextInputService textInputService;

    public DelegatingSoftwareKeyboardController(TextInputService textInputService2) {
        C12775o.m28639i(textInputService2, "textInputService");
        this.textInputService = textInputService2;
    }

    public final TextInputService getTextInputService() {
        return this.textInputService;
    }

    public void hide() {
        this.textInputService.hideSoftwareKeyboard();
    }

    public void show() {
        this.textInputService.showSoftwareKeyboard();
    }
}
