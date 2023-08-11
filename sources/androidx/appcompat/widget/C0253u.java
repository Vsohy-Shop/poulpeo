package androidx.appcompat.widget;

import android.window.OnBackInvokedCallback;

/* renamed from: androidx.appcompat.widget.u */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0253u implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ Runnable f199a;

    public /* synthetic */ C0253u(Runnable runnable) {
        this.f199a = runnable;
    }

    public final void onBackInvoked() {
        this.f199a.run();
    }
}
