package androidx.compose.material3;

import androidx.compose.runtime.Stable;

@Stable
/* compiled from: SnackbarHost.kt */
public interface SnackbarVisuals {
    String getActionLabel();

    SnackbarDuration getDuration();

    String getMessage();

    boolean getWithDismissAction();
}
