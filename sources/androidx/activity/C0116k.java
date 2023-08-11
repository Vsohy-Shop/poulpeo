package androidx.activity;

import android.window.OnBackInvokedCallback;
import androidx.activity.OnBackPressedDispatcher;
import p404of.C13074a;

/* renamed from: androidx.activity.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0116k implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ C13074a f169a;

    public /* synthetic */ C0116k(C13074a aVar) {
        this.f169a = aVar;
    }

    public final void onBackInvoked() {
        OnBackPressedDispatcher.Api33Impl.createOnBackInvokedCallback$lambda$0(this.f169a);
    }
}
