package coil.request;

import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil.util.Lifecycles;
import java.util.concurrent.CancellationException;
import p080f.C7539e;
import p205r.C9339g;
import p205r.C9350m;
import p226t.C9588b;
import p259w.C10070i;
import p466yf.C14054y1;

/* compiled from: RequestDelegate.kt */
public final class ViewTargetRequestDelegate implements C9350m {

    /* renamed from: b */
    private final C7539e f3258b;

    /* renamed from: c */
    private final C9339g f3259c;

    /* renamed from: d */
    private final C9588b<?> f3260d;

    /* renamed from: e */
    private final Lifecycle f3261e;

    /* renamed from: f */
    private final C14054y1 f3262f;

    public ViewTargetRequestDelegate(C7539e eVar, C9339g gVar, C9588b<?> bVar, Lifecycle lifecycle, C14054y1 y1Var) {
        this.f3258b = eVar;
        this.f3259c = gVar;
        this.f3260d = bVar;
        this.f3261e = lifecycle;
        this.f3262f = y1Var;
    }

    /* renamed from: a */
    public void mo30068a() {
        if (!this.f3260d.getView().isAttachedToWindow()) {
            C10070i.m21152l(this.f3260d.getView()).mo43781c(this);
            throw new CancellationException("'ViewTarget.view' must be attached to a window.");
        }
    }

    /* renamed from: b */
    public void mo30069b() {
        C14054y1.C14055a.m32600a(this.f3262f, (CancellationException) null, 1, (Object) null);
        C9588b<?> bVar = this.f3260d;
        if (bVar instanceof LifecycleObserver) {
            this.f3261e.removeObserver((LifecycleObserver) bVar);
        }
        this.f3261e.removeObserver(this);
    }

    @MainThread
    /* renamed from: c */
    public final void mo30070c() {
        this.f3258b.mo41285c(this.f3259c);
    }

    public void onDestroy(LifecycleOwner lifecycleOwner) {
        C10070i.m21152l(this.f3260d.getView()).mo43779a();
    }

    public void start() {
        this.f3261e.addObserver(this);
        C9588b<?> bVar = this.f3260d;
        if (bVar instanceof LifecycleObserver) {
            Lifecycles.m4801b(this.f3261e, (LifecycleObserver) bVar);
        }
        C10070i.m21152l(this.f3260d.getView()).mo43781c(this);
    }
}
