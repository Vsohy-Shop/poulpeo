package androidx.profileinstaller;

import android.view.Choreographer;

/* renamed from: androidx.profileinstaller.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2559h implements Choreographer.FrameCallback {

    /* renamed from: b */
    public final /* synthetic */ Runnable f1083b;

    public /* synthetic */ C2559h(Runnable runnable) {
        this.f1083b = runnable;
    }

    public final void doFrame(long j) {
        this.f1083b.run();
    }
}
