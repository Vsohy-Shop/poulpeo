package androidx.compose.p002ui.platform;

import android.view.ViewTreeObserver;

/* renamed from: androidx.compose.ui.platform.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1128e implements ViewTreeObserver.OnTouchModeChangeListener {

    /* renamed from: b */
    public final /* synthetic */ AndroidComposeView f371b;

    public /* synthetic */ C1128e(AndroidComposeView androidComposeView) {
        this.f371b = androidComposeView;
    }

    public final void onTouchModeChanged(boolean z) {
        AndroidComposeView.touchModeChangeListener$lambda$3(this.f371b, z);
    }
}
