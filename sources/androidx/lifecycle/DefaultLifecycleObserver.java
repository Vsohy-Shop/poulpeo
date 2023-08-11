package androidx.lifecycle;

import kotlin.jvm.internal.C12775o;

/* compiled from: DefaultLifecycleObserver.kt */
public interface DefaultLifecycleObserver extends LifecycleObserver {
    void onCreate(LifecycleOwner lifecycleOwner) {
        C12775o.m28639i(lifecycleOwner, "owner");
    }

    void onDestroy(LifecycleOwner lifecycleOwner) {
        C12775o.m28639i(lifecycleOwner, "owner");
    }

    void onPause(LifecycleOwner lifecycleOwner) {
        C12775o.m28639i(lifecycleOwner, "owner");
    }

    void onResume(LifecycleOwner lifecycleOwner) {
        C12775o.m28639i(lifecycleOwner, "owner");
    }

    void onStart(LifecycleOwner lifecycleOwner) {
        C12775o.m28639i(lifecycleOwner, "owner");
    }

    void onStop(LifecycleOwner lifecycleOwner) {
        C12775o.m28639i(lifecycleOwner, "owner");
    }
}
