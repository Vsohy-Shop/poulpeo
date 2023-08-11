package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.text.ExperimentalTextApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;

@ExperimentalTextApi
@Stable
/* renamed from: androidx.compose.ui.text.input.PlatformTextInputPluginRegistry */
/* compiled from: PlatformTextInputAdapter.kt */
public interface PlatformTextInputPluginRegistry {
    @Composable
    <T extends PlatformTextInputAdapter> T rememberAdapter(PlatformTextInputPlugin<T> platformTextInputPlugin, Composer composer, int i);
}
