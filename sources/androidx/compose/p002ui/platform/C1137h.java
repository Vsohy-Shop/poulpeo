package androidx.compose.p002ui.platform;

import android.view.accessibility.AccessibilityManager;

/* renamed from: androidx.compose.ui.platform.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1137h implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: b */
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f374b;

    public /* synthetic */ C1137h(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.f374b = androidComposeViewAccessibilityDelegateCompat;
    }

    public final void onAccessibilityStateChanged(boolean z) {
        AndroidComposeViewAccessibilityDelegateCompat.enabledStateListener$lambda$0(this.f374b, z);
    }
}
