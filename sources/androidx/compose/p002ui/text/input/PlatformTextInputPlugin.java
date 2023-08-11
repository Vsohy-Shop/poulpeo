package androidx.compose.p002ui.text.input;

import android.view.View;
import androidx.compose.p002ui.text.ExperimentalTextApi;
import androidx.compose.p002ui.text.input.PlatformTextInputAdapter;
import androidx.compose.runtime.Immutable;

@Immutable
@ExperimentalTextApi
/* renamed from: androidx.compose.ui.text.input.PlatformTextInputPlugin */
/* compiled from: PlatformTextInputAdapter.android.kt */
public interface PlatformTextInputPlugin<T extends PlatformTextInputAdapter> {
    T createAdapter(PlatformTextInput platformTextInput, View view);
}
