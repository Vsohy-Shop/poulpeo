package androidx.compose.runtime;

/* compiled from: RememberObserver.kt */
public interface RememberObserver {
    void onAbandoned();

    void onForgotten();

    void onRemembered();
}
