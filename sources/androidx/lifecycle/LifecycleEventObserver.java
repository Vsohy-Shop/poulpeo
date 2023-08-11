package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* compiled from: LifecycleEventObserver.kt */
public interface LifecycleEventObserver extends LifecycleObserver {
    void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event);
}
