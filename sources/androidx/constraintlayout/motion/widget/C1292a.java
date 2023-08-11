package androidx.constraintlayout.motion.widget;

import android.view.View;

/* renamed from: androidx.constraintlayout.motion.widget.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1292a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ViewTransition f436b;

    /* renamed from: c */
    public final /* synthetic */ View[] f437c;

    public /* synthetic */ C1292a(ViewTransition viewTransition, View[] viewArr) {
        this.f436b = viewTransition;
        this.f437c = viewArr;
    }

    public final void run() {
        this.f436b.lambda$applyTransition$0(this.f437c);
    }
}
