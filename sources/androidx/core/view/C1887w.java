package androidx.core.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: androidx.core.view.w */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1887w implements LifecycleEventObserver {

    /* renamed from: b */
    public final /* synthetic */ MenuHostHelper f534b;

    /* renamed from: c */
    public final /* synthetic */ MenuProvider f535c;

    public /* synthetic */ C1887w(MenuHostHelper menuHostHelper, MenuProvider menuProvider) {
        this.f534b = menuHostHelper;
        this.f535c = menuProvider;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.f534b.lambda$addMenuProvider$0(this.f535c, lifecycleOwner, event);
    }
}
