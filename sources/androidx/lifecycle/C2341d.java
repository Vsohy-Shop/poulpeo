package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import p466yf.C14054y1;

/* renamed from: androidx.lifecycle.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2341d implements LifecycleEventObserver {

    /* renamed from: b */
    public final /* synthetic */ LifecycleController f1055b;

    /* renamed from: c */
    public final /* synthetic */ C14054y1 f1056c;

    public /* synthetic */ C2341d(LifecycleController lifecycleController, C14054y1 y1Var) {
        this.f1055b = lifecycleController;
        this.f1056c = y1Var;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        LifecycleController.observer$lambda$0(this.f1055b, this.f1056c, lifecycleOwner, event);
    }
}
