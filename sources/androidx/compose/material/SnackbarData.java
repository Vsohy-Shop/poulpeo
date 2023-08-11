package androidx.compose.material;

/* compiled from: SnackbarHost.kt */
public interface SnackbarData {
    void dismiss();

    String getActionLabel();

    SnackbarDuration getDuration();

    String getMessage();

    void performAction();
}
