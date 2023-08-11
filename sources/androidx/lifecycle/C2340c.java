package androidx.lifecycle;

/* renamed from: androidx.lifecycle.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2340c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ DispatchQueue f1053b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f1054c;

    public /* synthetic */ C2340c(DispatchQueue dispatchQueue, Runnable runnable) {
        this.f1053b = dispatchQueue;
        this.f1054c = runnable;
    }

    public final void run() {
        DispatchQueue.dispatchAndEnqueue$lambda$2$lambda$1(this.f1053b, this.f1054c);
    }
}
