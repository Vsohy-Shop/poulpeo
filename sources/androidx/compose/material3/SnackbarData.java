package androidx.compose.material3;

import androidx.compose.runtime.Stable;

@Stable
/* compiled from: SnackbarHost.kt */
public interface SnackbarData {
    void dismiss();

    SnackbarVisuals getVisuals();

    void performAction();
}
