package androidx.compose.runtime;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C13933b1;
import p466yf.C13970h;
import p466yf.C14010o;

@SourceDebugExtension({"SMAP\nActualAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,99:1\n314#2,11:100\n*S KotlinDebug\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock\n*L\n64#1:100,11\n*E\n"})
/* compiled from: ActualAndroid.android.kt */
final class DefaultChoreographerFrameClock implements MonotonicFrameClock {
    public static final DefaultChoreographerFrameClock INSTANCE = new DefaultChoreographerFrameClock();
    /* access modifiers changed from: private */
    public static final Choreographer choreographer = ((Choreographer) C13970h.m32376e(C13933b1.m32212c().mo49059t0(), new DefaultChoreographerFrameClock$choreographer$1((C12074d<? super DefaultChoreographerFrameClock$choreographer$1>) null)));

    private DefaultChoreographerFrameClock() {
    }

    public <R> R fold(R r, C13088o<? super R, ? super C12079g.C12082b, ? extends R> oVar) {
        return MonotonicFrameClock.DefaultImpls.fold(this, r, oVar);
    }

    public <E extends C12079g.C12082b> E get(C12079g.C12084c<E> cVar) {
        return MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    public C12079g minusKey(C12079g.C12084c<?> cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    public C12079g plus(C12079g gVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, gVar);
    }

    public <R> Object withFrameNanos(Function1<? super Long, ? extends R> function1, C12074d<? super R> dVar) {
        C14010o oVar = new C14010o(C12147c.m26491b(dVar), 1);
        oVar.mo53786B();
        DefaultChoreographerFrameClock$withFrameNanos$2$callback$1 defaultChoreographerFrameClock$withFrameNanos$2$callback$1 = new DefaultChoreographerFrameClock$withFrameNanos$2$callback$1(oVar, function1);
        choreographer.postFrameCallback(defaultChoreographerFrameClock$withFrameNanos$2$callback$1);
        oVar.mo49526f(new DefaultChoreographerFrameClock$withFrameNanos$2$1(defaultChoreographerFrameClock$withFrameNanos$2$callback$1));
        Object y = oVar.mo53797y();
        if (y == C12150d.m26492c()) {
            C12741h.m28573c(dVar);
        }
        return y;
    }
}
