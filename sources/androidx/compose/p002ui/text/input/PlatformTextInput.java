package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.text.ExperimentalTextApi;

@ExperimentalTextApi
/* renamed from: androidx.compose.ui.text.input.PlatformTextInput */
/* compiled from: PlatformTextInputAdapter.kt */
public interface PlatformTextInput {
    void releaseInputFocus();

    void requestInputFocus();
}
