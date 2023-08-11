package androidx.compose.runtime;

@InternalComposeApi
/* compiled from: Recomposer.kt */
public interface RecomposerErrorInfo {
    Exception getCause();

    boolean getRecoverable();
}
