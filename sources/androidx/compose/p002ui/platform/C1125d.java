package androidx.compose.p002ui.platform;

import android.view.ViewTreeObserver;

/* renamed from: androidx.compose.ui.platform.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1125d implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: b */
    public final /* synthetic */ AndroidComposeView f370b;

    public /* synthetic */ C1125d(AndroidComposeView androidComposeView) {
        this.f370b = androidComposeView;
    }

    public final void onScrollChanged() {
        AndroidComposeView.scrollChangedListener$lambda$2(this.f370b);
    }
}
