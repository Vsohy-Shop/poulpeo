package androidx.savedstate;

import androidx.lifecycle.LifecycleOwner;

/* compiled from: SavedStateRegistryOwner.kt */
public interface SavedStateRegistryOwner extends LifecycleOwner {
    SavedStateRegistry getSavedStateRegistry();
}
