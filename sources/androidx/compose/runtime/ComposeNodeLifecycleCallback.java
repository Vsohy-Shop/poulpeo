package androidx.compose.runtime;

/* compiled from: ComposeNodeLifecycleCallback.kt */
public interface ComposeNodeLifecycleCallback {
    void onDeactivate();

    void onRelease();

    void onReuse();
}
