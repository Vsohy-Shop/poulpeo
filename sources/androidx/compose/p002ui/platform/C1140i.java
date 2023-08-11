package androidx.compose.p002ui.platform;

import android.view.accessibility.AccessibilityManager;

/* renamed from: androidx.compose.ui.platform.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1140i implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f375a;

    public /* synthetic */ C1140i(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.f375a = androidComposeViewAccessibilityDelegateCompat;
    }

    public final void onTouchExplorationStateChanged(boolean z) {
        AndroidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener$lambda$1(this.f375a, z);
    }
}
