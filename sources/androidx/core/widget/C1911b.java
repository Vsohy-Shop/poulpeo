package androidx.core.widget;

/* renamed from: androidx.core.widget.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1911b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ContentLoadingProgressBar f542b;

    public /* synthetic */ C1911b(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.f542b = contentLoadingProgressBar;
    }

    public final void run() {
        this.f542b.hideOnUiThread();
    }
}
