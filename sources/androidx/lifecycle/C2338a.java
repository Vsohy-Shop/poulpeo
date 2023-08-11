package androidx.lifecycle;

/* renamed from: androidx.lifecycle.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2338a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ComputableLiveData f1051b;

    public /* synthetic */ C2338a(ComputableLiveData computableLiveData) {
        this.f1051b = computableLiveData;
    }

    public final void run() {
        ComputableLiveData.refreshRunnable$lambda$0(this.f1051b);
    }
}
