package androidx.core.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: androidx.core.view.x */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1892x implements LifecycleEventObserver {

    /* renamed from: b */
    public final /* synthetic */ MenuHostHelper f536b;

    /* renamed from: c */
    public final /* synthetic */ Lifecycle.State f537c;

    /* renamed from: d */
    public final /* synthetic */ MenuProvider f538d;

    public /* synthetic */ C1892x(MenuHostHelper menuHostHelper, Lifecycle.State state, MenuProvider menuProvider) {
        this.f536b = menuHostHelper;
        this.f537c = state;
        this.f538d = menuProvider;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.f536b.lambda$addMenuProvider$1(this.f537c, this.f538d, lifecycleOwner, event);
    }
}
