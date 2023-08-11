package androidx.browser.trusted;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.browser.trusted.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0300a implements CallbackToFutureAdapter.Resolver {

    /* renamed from: a */
    public final /* synthetic */ ConnectionHolder f206a;

    public /* synthetic */ C0300a(ConnectionHolder connectionHolder) {
        this.f206a = connectionHolder;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return this.f206a.lambda$getServiceWrapper$0(completer);
    }
}
