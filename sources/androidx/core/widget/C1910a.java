package androidx.core.widget;

/* renamed from: androidx.core.widget.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1910a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ContentLoadingProgressBar f541b;

    public /* synthetic */ C1910a(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.f541b = contentLoadingProgressBar;
    }

    public final void run() {
        this.f541b.showOnUiThread();
    }
}
