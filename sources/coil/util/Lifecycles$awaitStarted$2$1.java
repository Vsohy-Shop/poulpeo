package coil.util;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import p336ef.C11907m;
import p336ef.C11921v;
import p466yf.C14002n;

/* renamed from: coil.util.-Lifecycles$awaitStarted$2$1  reason: invalid class name */
/* compiled from: Lifecycles.kt */
public final class Lifecycles$awaitStarted$2$1 implements DefaultLifecycleObserver {

    /* renamed from: b */
    final /* synthetic */ C14002n<C11921v> f3269b;

    Lifecycles$awaitStarted$2$1(C14002n<? super C11921v> nVar) {
        this.f3269b = nVar;
    }

    public void onStart(LifecycleOwner lifecycleOwner) {
        C14002n<C11921v> nVar = this.f3269b;
        C11907m.C11908a aVar = C11907m.f18600b;
        nVar.resumeWith(C11907m.m25696a(C11921v.f18618a));
    }
}
