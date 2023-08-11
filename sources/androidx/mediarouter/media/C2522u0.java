package androidx.mediarouter.media;

import androidx.mediarouter.media.MediaRouter;

/* renamed from: androidx.mediarouter.media.u0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2522u0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaRouter.PrepareTransferNotifier f1066b;

    public /* synthetic */ C2522u0(MediaRouter.PrepareTransferNotifier prepareTransferNotifier) {
        this.f1066b = prepareTransferNotifier;
    }

    public final void run() {
        this.f1066b.finishTransfer();
    }
}
