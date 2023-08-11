package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nLifecycleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n1#1,70:1\n57#1,3:71\n57#1,3:74\n*S KotlinDebug\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n49#1:71,3\n36#1:74,3\n*E\n"})
@MainThread
/* compiled from: LifecycleController.kt */
public final class LifecycleController {
    private final DispatchQueue dispatchQueue;
    private final Lifecycle lifecycle;
    private final Lifecycle.State minState;
    private final LifecycleEventObserver observer;

    public LifecycleController(Lifecycle lifecycle2, Lifecycle.State state, DispatchQueue dispatchQueue2, C14054y1 y1Var) {
        C12775o.m28639i(lifecycle2, "lifecycle");
        C12775o.m28639i(state, "minState");
        C12775o.m28639i(dispatchQueue2, "dispatchQueue");
        C12775o.m28639i(y1Var, "parentJob");
        this.lifecycle = lifecycle2;
        this.minState = state;
        this.dispatchQueue = dispatchQueue2;
        C2341d dVar = new C2341d(this, y1Var);
        this.observer = dVar;
        if (lifecycle2.getCurrentState() == Lifecycle.State.DESTROYED) {
            C14054y1.C14055a.m32600a(y1Var, (CancellationException) null, 1, (Object) null);
            finish();
            return;
        }
        lifecycle2.addObserver(dVar);
    }

    private final void handleDestroy(C14054y1 y1Var) {
        C14054y1.C14055a.m32600a(y1Var, (CancellationException) null, 1, (Object) null);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void observer$lambda$0(LifecycleController lifecycleController, C14054y1 y1Var, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C12775o.m28639i(lifecycleController, "this$0");
        C12775o.m28639i(y1Var, "$parentJob");
        C12775o.m28639i(lifecycleOwner, APIParams.SOURCE);
        C12775o.m28639i(event, "<anonymous parameter 1>");
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            C14054y1.C14055a.m32600a(y1Var, (CancellationException) null, 1, (Object) null);
            lifecycleController.finish();
        } else if (lifecycleOwner.getLifecycle().getCurrentState().compareTo(lifecycleController.minState) < 0) {
            lifecycleController.dispatchQueue.pause();
        } else {
            lifecycleController.dispatchQueue.resume();
        }
    }

    @MainThread
    public final void finish() {
        this.lifecycle.removeObserver(this.observer);
        this.dispatchQueue.finish();
    }
}
