package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13933b1;
import p466yf.C13970h;
import p466yf.C13995l0;

/* compiled from: PausingDispatcher.kt */
public final class PausingDispatcherKt {
    public static final <T> Object whenCreated(LifecycleOwner lifecycleOwner, C13088o<? super C13995l0, ? super C12074d<? super T>, ? extends Object> oVar, C12074d<? super T> dVar) {
        return whenCreated(lifecycleOwner.getLifecycle(), oVar, dVar);
    }

    public static final <T> Object whenResumed(LifecycleOwner lifecycleOwner, C13088o<? super C13995l0, ? super C12074d<? super T>, ? extends Object> oVar, C12074d<? super T> dVar) {
        return whenResumed(lifecycleOwner.getLifecycle(), oVar, dVar);
    }

    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, C13088o<? super C13995l0, ? super C12074d<? super T>, ? extends Object> oVar, C12074d<? super T> dVar) {
        return whenStarted(lifecycleOwner.getLifecycle(), oVar, dVar);
    }

    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, C13088o<? super C13995l0, ? super C12074d<? super T>, ? extends Object> oVar, C12074d<? super T> dVar) {
        return C13970h.m32378g(C13933b1.m32212c().mo49059t0(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, oVar, (C12074d<? super PausingDispatcherKt$whenStateAtLeast$2>) null), dVar);
    }

    public static final <T> Object whenCreated(Lifecycle lifecycle, C13088o<? super C13995l0, ? super C12074d<? super T>, ? extends Object> oVar, C12074d<? super T> dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, oVar, dVar);
    }

    public static final <T> Object whenResumed(Lifecycle lifecycle, C13088o<? super C13995l0, ? super C12074d<? super T>, ? extends Object> oVar, C12074d<? super T> dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, oVar, dVar);
    }

    public static final <T> Object whenStarted(Lifecycle lifecycle, C13088o<? super C13995l0, ? super C12074d<? super T>, ? extends Object> oVar, C12074d<? super T> dVar) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, oVar, dVar);
    }
}
