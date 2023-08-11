package androidx.lifecycle;

/* renamed from: androidx.lifecycle.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2342e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ProcessLifecycleOwner f1057b;

    public /* synthetic */ C2342e(ProcessLifecycleOwner processLifecycleOwner) {
        this.f1057b = processLifecycleOwner;
    }

    public final void run() {
        ProcessLifecycleOwner.delayedPauseRunnable$lambda$0(this.f1057b);
    }
}
