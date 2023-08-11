package androidx.compose.p002ui.text.input;

import android.view.Choreographer;

/* renamed from: androidx.compose.ui.text.input.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1229c implements Choreographer.FrameCallback {

    /* renamed from: b */
    public final /* synthetic */ Runnable f384b;

    public /* synthetic */ C1229c(Runnable runnable) {
        this.f384b = runnable;
    }

    public final void doFrame(long j) {
        TextInputServiceAndroid_androidKt.asExecutor$lambda$1$lambda$0(this.f384b, j);
    }
}
