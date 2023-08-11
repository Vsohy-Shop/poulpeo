package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C12775o;
import p355hf.C12074d;
import p355hf.C12079g;
import p466yf.C13933b1;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* compiled from: Lifecycle.kt */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {
    private final C12079g coroutineContext;
    private final Lifecycle lifecycle;

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle2, C12079g gVar) {
        C12775o.m28639i(lifecycle2, "lifecycle");
        C12775o.m28639i(gVar, "coroutineContext");
        this.lifecycle = lifecycle2;
        this.coroutineContext = gVar;
        if (getLifecycle$lifecycle_common().getCurrentState() == Lifecycle.State.DESTROYED) {
            C13944d2.m32238e(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }

    public C12079g getCoroutineContext() {
        return this.coroutineContext;
    }

    public Lifecycle getLifecycle$lifecycle_common() {
        return this.lifecycle;
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C12775o.m28639i(lifecycleOwner, APIParams.SOURCE);
        C12775o.m28639i(event, NotificationCompat.CATEGORY_EVENT);
        if (getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            getLifecycle$lifecycle_common().removeObserver(this);
            C13944d2.m32238e(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }

    public final void register() {
        C14054y1 unused = C13985j.m32422d(this, C13933b1.m32212c().mo49059t0(), (C14004n0) null, new LifecycleCoroutineScopeImpl$register$1(this, (C12074d<? super LifecycleCoroutineScopeImpl$register$1>) null), 2, (Object) null);
    }
}
