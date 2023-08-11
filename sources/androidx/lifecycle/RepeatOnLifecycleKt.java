package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C13999m0;

/* compiled from: RepeatOnLifecycle.kt */
public final class RepeatOnLifecycleKt {
    public static final Object repeatOnLifecycle(Lifecycle lifecycle, Lifecycle.State state, C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super C11921v> dVar) {
        if (!(state != Lifecycle.State.INITIALIZED)) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
        } else if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return C11921v.f18618a;
        } else {
            Object e = C13999m0.m32451e(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, oVar, (C12074d<? super RepeatOnLifecycleKt$repeatOnLifecycle$3>) null), dVar);
            return e == C12150d.m26492c() ? e : C11921v.f18618a;
        }
    }

    public static final Object repeatOnLifecycle(LifecycleOwner lifecycleOwner, Lifecycle.State state, C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super C11921v> dVar) {
        Object repeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, oVar, dVar);
        return repeatOnLifecycle == C12150d.m26492c() ? repeatOnLifecycle : C11921v.f18618a;
    }
}
