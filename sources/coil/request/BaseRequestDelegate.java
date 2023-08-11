package coil.request;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.CancellationException;
import p205r.C9350m;
import p466yf.C14054y1;

/* compiled from: RequestDelegate.kt */
public final class BaseRequestDelegate implements C9350m {

    /* renamed from: b */
    private final Lifecycle f3256b;

    /* renamed from: c */
    private final C14054y1 f3257c;

    public BaseRequestDelegate(Lifecycle lifecycle, C14054y1 y1Var) {
        this.f3256b = lifecycle;
        this.f3257c = y1Var;
    }

    /* renamed from: b */
    public void mo30065b() {
        C14054y1.C14055a.m32600a(this.f3257c, (CancellationException) null, 1, (Object) null);
    }

    public void complete() {
        this.f3256b.removeObserver(this);
    }

    public void onDestroy(LifecycleOwner lifecycleOwner) {
        mo30065b();
    }

    public void start() {
        this.f3256b.addObserver(this);
    }
}
