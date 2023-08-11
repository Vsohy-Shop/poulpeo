package androidx.compose.p002ui.platform;

import android.view.ViewTreeObserver;

/* renamed from: androidx.compose.ui.platform.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1122c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ AndroidComposeView f369b;

    public /* synthetic */ C1122c(AndroidComposeView androidComposeView) {
        this.f369b = androidComposeView;
    }

    public final void onGlobalLayout() {
        AndroidComposeView.globalLayoutListener$lambda$1(this.f369b);
    }
}
