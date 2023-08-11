package androidx.compose.p002ui.text.input;

/* renamed from: androidx.compose.ui.text.input.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1228b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ TextInputServiceAndroid f383b;

    public /* synthetic */ C1228b(TextInputServiceAndroid textInputServiceAndroid) {
        this.f383b = textInputServiceAndroid;
    }

    public final void run() {
        TextInputServiceAndroid.sendInputCommand$lambda$1(this.f383b);
    }
}
