package androidx.activity;

import androidx.lifecycle.LifecycleOwner;

/* compiled from: OnBackPressedDispatcherOwner.kt */
public interface OnBackPressedDispatcherOwner extends LifecycleOwner {
    OnBackPressedDispatcher getOnBackPressedDispatcher();
}
