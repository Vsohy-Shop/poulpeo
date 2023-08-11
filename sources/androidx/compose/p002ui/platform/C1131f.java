package androidx.compose.p002ui.platform;

/* renamed from: androidx.compose.ui.platform.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1131f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AndroidComposeView f372b;

    public /* synthetic */ C1131f(AndroidComposeView androidComposeView) {
        this.f372b = androidComposeView;
    }

    public final void run() {
        AndroidComposeView.sendHoverExitEvent$lambda$5(this.f372b);
    }
}
