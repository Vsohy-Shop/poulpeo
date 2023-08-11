package androidx.compose.p002ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12074d;
import p355hf.C12075e;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C14010o;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidUiFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,53:1\n314#2,11:54\n*S KotlinDebug\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n*L\n31#1:54,11\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidUiFrameClock */
/* compiled from: AndroidUiFrameClock.android.kt */
public final class AndroidUiFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private final Choreographer choreographer;

    public AndroidUiFrameClock(Choreographer choreographer2) {
        C12775o.m28639i(choreographer2, "choreographer");
        this.choreographer = choreographer2;
    }

    public <R> R fold(R r, C13088o<? super R, ? super C12079g.C12082b, ? extends R> oVar) {
        return MonotonicFrameClock.DefaultImpls.fold(this, r, oVar);
    }

    public <E extends C12079g.C12082b> E get(C12079g.C12084c<E> cVar) {
        return MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    public C12079g minusKey(C12079g.C12084c<?> cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    public C12079g plus(C12079g gVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, gVar);
    }

    public <R> Object withFrameNanos(Function1<? super Long, ? extends R> function1, C12074d<? super R> dVar) {
        AndroidUiDispatcher androidUiDispatcher;
        C12079g.C12082b bVar = dVar.getContext().get(C12075e.f18913W);
        if (bVar instanceof AndroidUiDispatcher) {
            androidUiDispatcher = (AndroidUiDispatcher) bVar;
        } else {
            androidUiDispatcher = null;
        }
        C14010o oVar = new C14010o(C12147c.m26491b(dVar), 1);
        oVar.mo53786B();
        AndroidUiFrameClock$withFrameNanos$2$callback$1 androidUiFrameClock$withFrameNanos$2$callback$1 = new AndroidUiFrameClock$withFrameNanos$2$callback$1(oVar, this, function1);
        if (androidUiDispatcher == null || !C12775o.m28634d(androidUiDispatcher.getChoreographer(), getChoreographer())) {
            getChoreographer().postFrameCallback(androidUiFrameClock$withFrameNanos$2$callback$1);
            oVar.mo49526f(new AndroidUiFrameClock$withFrameNanos$2$2(this, androidUiFrameClock$withFrameNanos$2$callback$1));
        } else {
            androidUiDispatcher.postFrameCallback$ui_release(androidUiFrameClock$withFrameNanos$2$callback$1);
            oVar.mo49526f(new AndroidUiFrameClock$withFrameNanos$2$1(androidUiDispatcher, androidUiFrameClock$withFrameNanos$2$callback$1));
        }
        Object y = oVar.mo53797y();
        if (y == C12150d.m26492c()) {
            C12741h.m28573c(dVar);
        }
        return y;
    }
}
