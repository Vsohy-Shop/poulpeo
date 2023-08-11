package androidx.savedstate;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: androidx.savedstate.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2622a implements LifecycleEventObserver {

    /* renamed from: b */
    public final /* synthetic */ SavedStateRegistry f1093b;

    public /* synthetic */ C2622a(SavedStateRegistry savedStateRegistry) {
        this.f1093b = savedStateRegistry;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        SavedStateRegistry.performAttach$lambda$4(this.f1093b, lifecycleOwner, event);
    }
}
