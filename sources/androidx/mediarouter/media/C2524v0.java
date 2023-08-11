package androidx.mediarouter.media;

import androidx.mediarouter.media.MediaRouter;
import java.util.concurrent.Executor;

/* renamed from: androidx.mediarouter.media.v0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2524v0 implements Executor {

    /* renamed from: b */
    public final /* synthetic */ MediaRouter.GlobalMediaRouter.CallbackHandler f1067b;

    public /* synthetic */ C2524v0(MediaRouter.GlobalMediaRouter.CallbackHandler callbackHandler) {
        this.f1067b = callbackHandler;
    }

    public final void execute(Runnable runnable) {
        this.f1067b.post(runnable);
    }
}
