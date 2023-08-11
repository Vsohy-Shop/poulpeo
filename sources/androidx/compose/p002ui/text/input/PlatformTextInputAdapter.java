package androidx.compose.p002ui.text.input;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p002ui.text.ExperimentalTextApi;

@ExperimentalTextApi
/* renamed from: androidx.compose.ui.text.input.PlatformTextInputAdapter */
/* compiled from: PlatformTextInputAdapter.android.kt */
public interface PlatformTextInputAdapter {
    InputConnection createInputConnection(EditorInfo editorInfo);

    TextInputForTests getInputForTests();

    void onDisposed() {
    }
}
