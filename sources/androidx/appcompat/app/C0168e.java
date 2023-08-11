package androidx.appcompat.app;

import android.window.OnBackInvokedCallback;

/* renamed from: androidx.appcompat.app.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0168e implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ AppCompatDelegateImpl f192a;

    public /* synthetic */ C0168e(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f192a = appCompatDelegateImpl;
    }

    public final void onBackInvoked() {
        this.f192a.onBackPressed();
    }
}
