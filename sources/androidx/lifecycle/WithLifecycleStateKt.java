package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12074d;
import p355hf.C12085h;
import p404of.C13074a;
import p466yf.C13933b1;
import p466yf.C13971h0;
import p466yf.C13988j2;
import p466yf.C14010o;

@SourceDebugExtension({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,206:1\n154#1,8:207\n154#1,8:215\n154#1,8:223\n154#1,8:231\n43#1,5:239\n154#1,8:244\n43#1,5:252\n154#1,8:257\n154#1,8:265\n154#1,8:273\n154#1,8:281\n314#2,11:289\n*S KotlinDebug\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n*L\n47#1:207,8\n58#1:215,8\n71#1:223,8\n84#1:231,8\n98#1:239,5\n98#1:244,8\n98#1:252,5\n98#1:257,8\n111#1:265,8\n124#1:273,8\n137#1:281,8\n177#1:289,11\n*E\n"})
/* compiled from: WithLifecycleState.kt */
public final class WithLifecycleStateKt {
    public static final <R> Object suspendWithStateAtLeastUnchecked(Lifecycle lifecycle, Lifecycle.State state, boolean z, C13971h0 h0Var, C13074a<? extends R> aVar, C12074d<? super R> dVar) {
        C14010o oVar = new C14010o(C12147c.m26491b(dVar), 1);
        oVar.mo53786B();
        C2337xfdb59cc4 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = new C2337xfdb59cc4(state, lifecycle, oVar, aVar);
        if (z) {
            h0Var.dispatch(C12085h.f18916b, new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1(lifecycle, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1));
        } else {
            lifecycle.addObserver(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
        }
        oVar.mo49526f(new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2(h0Var, lifecycle, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1));
        Object y = oVar.mo53797y();
        if (y == C12150d.m26492c()) {
            C12741h.m28573c(dVar);
        }
        return y;
    }

    public static final <R> Object withCreated(Lifecycle lifecycle, C13074a<? extends R> aVar, C12074d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        C13988j2 t0 = C13933b1.m32212c().mo49059t0();
        boolean isDispatchNeeded = t0.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, t0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    private static final <R> Object withCreated$$forInline(Lifecycle lifecycle, C13074a<? extends R> aVar, C12074d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C13933b1.m32212c().mo49059t0();
        C12773m.m28630c(3);
        throw null;
    }

    public static final <R> Object withResumed(Lifecycle lifecycle, C13074a<? extends R> aVar, C12074d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C13988j2 t0 = C13933b1.m32212c().mo49059t0();
        boolean isDispatchNeeded = t0.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, t0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    private static final <R> Object withResumed$$forInline(Lifecycle lifecycle, C13074a<? extends R> aVar, C12074d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C13933b1.m32212c().mo49059t0();
        C12773m.m28630c(3);
        throw null;
    }

    public static final <R> Object withStarted(Lifecycle lifecycle, C13074a<? extends R> aVar, C12074d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        C13988j2 t0 = C13933b1.m32212c().mo49059t0();
        boolean isDispatchNeeded = t0.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, t0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    private static final <R> Object withStarted$$forInline(Lifecycle lifecycle, C13074a<? extends R> aVar, C12074d<? super R> dVar) {
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C13933b1.m32212c().mo49059t0();
        C12773m.m28630c(3);
        throw null;
    }

    public static final <R> Object withStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, C13074a<? extends R> aVar, C12074d<? super R> dVar) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C13988j2 t0 = C13933b1.m32212c().mo49059t0();
            boolean isDispatchNeeded = t0.isDispatchNeeded(dVar.getContext());
            if (!isDispatchNeeded) {
                if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                    throw new LifecycleDestroyedException();
                } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, t0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    private static final <R> Object withStateAtLeast$$forInline(Lifecycle lifecycle, Lifecycle.State state, C13074a<? extends R> aVar, C12074d<? super R> dVar) {
        if (!(state.compareTo(Lifecycle.State.CREATED) >= 0)) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        C13933b1.m32212c().mo49059t0();
        C12773m.m28630c(3);
        throw null;
    }

    public static final <R> Object withStateAtLeastUnchecked(Lifecycle lifecycle, Lifecycle.State state, C13074a<? extends R> aVar, C12074d<? super R> dVar) {
        C13988j2 t0 = C13933b1.m32212c().mo49059t0();
        boolean isDispatchNeeded = t0.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, t0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    private static final <R> Object withStateAtLeastUnchecked$$forInline(Lifecycle lifecycle, Lifecycle.State state, C13074a<? extends R> aVar, C12074d<? super R> dVar) {
        C13933b1.m32212c().mo49059t0();
        C12773m.m28630c(3);
        throw null;
    }

    private static final <R> Object withCreated$$forInline(LifecycleOwner lifecycleOwner, C13074a<? extends R> aVar, C12074d<? super R> dVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C13933b1.m32212c().mo49059t0();
        C12773m.m28630c(3);
        throw null;
    }

    private static final <R> Object withResumed$$forInline(LifecycleOwner lifecycleOwner, C13074a<? extends R> aVar, C12074d<? super R> dVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C13933b1.m32212c().mo49059t0();
        C12773m.m28630c(3);
        throw null;
    }

    private static final <R> Object withStarted$$forInline(LifecycleOwner lifecycleOwner, C13074a<? extends R> aVar, C12074d<? super R> dVar) {
        lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        C13933b1.m32212c().mo49059t0();
        C12773m.m28630c(3);
        throw null;
    }

    private static final <R> Object withStateAtLeast$$forInline(LifecycleOwner lifecycleOwner, Lifecycle.State state, C13074a<? extends R> aVar, C12074d<? super R> dVar) {
        lifecycleOwner.getLifecycle();
        if (!(state.compareTo(Lifecycle.State.CREATED) >= 0)) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        C13933b1.m32212c().mo49059t0();
        C12773m.m28630c(3);
        throw null;
    }

    public static final <R> Object withCreated(LifecycleOwner lifecycleOwner, C13074a<? extends R> aVar, C12074d<? super R> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        C13988j2 t0 = C13933b1.m32212c().mo49059t0();
        boolean isDispatchNeeded = t0.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, t0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    public static final <R> Object withResumed(LifecycleOwner lifecycleOwner, C13074a<? extends R> aVar, C12074d<? super R> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C13988j2 t0 = C13933b1.m32212c().mo49059t0();
        boolean isDispatchNeeded = t0.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, t0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    public static final <R> Object withStarted(LifecycleOwner lifecycleOwner, C13074a<? extends R> aVar, C12074d<? super R> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        C13988j2 t0 = C13933b1.m32212c().mo49059t0();
        boolean isDispatchNeeded = t0.isDispatchNeeded(dVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, t0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
    }

    public static final <R> Object withStateAtLeast(LifecycleOwner lifecycleOwner, Lifecycle.State state, C13074a<? extends R> aVar, C12074d<? super R> dVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C13988j2 t0 = C13933b1.m32212c().mo49059t0();
            boolean isDispatchNeeded = t0.isDispatchNeeded(dVar.getContext());
            if (!isDispatchNeeded) {
                if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                    throw new LifecycleDestroyedException();
                } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return aVar.invoke();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, t0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(aVar), dVar);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }
}
