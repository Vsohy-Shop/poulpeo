package androidx.lifecycle;

/* renamed from: androidx.lifecycle.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2339b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ComputableLiveData f1052b;

    public /* synthetic */ C2339b(ComputableLiveData computableLiveData) {
        this.f1052b = computableLiveData;
    }

    public final void run() {
        ComputableLiveData.invalidationRunnable$lambda$1(this.f1052b);
    }
}
