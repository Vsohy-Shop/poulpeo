package androidx.appcompat.app;

import androidx.appcompat.app.AppLocalesStorageHelper;

/* renamed from: androidx.appcompat.app.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0170g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AppLocalesStorageHelper.SerialExecutor f194b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f195c;

    public /* synthetic */ C0170g(AppLocalesStorageHelper.SerialExecutor serialExecutor, Runnable runnable) {
        this.f194b = serialExecutor;
        this.f195c = runnable;
    }

    public final void run() {
        this.f194b.lambda$execute$0(this.f195c);
    }
}
