package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.Stable;

@Stable
/* renamed from: androidx.compose.ui.platform.WindowInfo */
/* compiled from: WindowInfo.kt */
public interface WindowInfo {
    @ExperimentalComposeUiApi
    /* renamed from: getKeyboardModifiers-k7X9c1A  reason: not valid java name */
    int m37793getKeyboardModifiersk7X9c1A() {
        return WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui_release().getValue().m37237unboximpl();
    }

    boolean isWindowFocused();

    /* renamed from: getKeyboardModifiers-k7X9c1A$annotations  reason: not valid java name */
    static /* synthetic */ void m37792getKeyboardModifiersk7X9c1A$annotations() {
    }
}
