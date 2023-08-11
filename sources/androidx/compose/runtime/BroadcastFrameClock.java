package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11907m;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C14010o;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,132:1\n70#2:133\n70#2:134\n70#2:144\n70#2:147\n314#3,9:135\n323#3,2:145\n33#4,6:148\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n*L\n54#1:133\n62#1:134\n81#1:144\n112#1:147\n79#1:135,9\n79#1:145,2\n115#1:148,6\n*E\n"})
/* compiled from: BroadcastFrameClock.kt */
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    /* access modifiers changed from: private */
    public List<FrameAwaiter<?>> awaiters;
    /* access modifiers changed from: private */
    public Throwable failureCause;
    /* access modifiers changed from: private */
    public final Object lock;
    /* access modifiers changed from: private */
    public final C13074a<C11921v> onNewAwaiters;
    private List<FrameAwaiter<?>> spareList;

    @SourceDebugExtension({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
    /* compiled from: BroadcastFrameClock.kt */
    private static final class FrameAwaiter<R> {
        private final C12074d<R> continuation;
        private final Function1<Long, R> onFrame;

        public FrameAwaiter(Function1<? super Long, ? extends R> function1, C12074d<? super R> dVar) {
            C12775o.m28639i(function1, "onFrame");
            C12775o.m28639i(dVar, "continuation");
            this.onFrame = function1;
            this.continuation = dVar;
        }

        public final C12074d<R> getContinuation() {
            return this.continuation;
        }

        public final Function1<Long, R> getOnFrame() {
            return this.onFrame;
        }

        public final void resume(long j) {
            Object obj;
            C12074d<R> dVar = this.continuation;
            try {
                C11907m.C11908a aVar = C11907m.f18600b;
                obj = C11907m.m25696a(this.onFrame.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                C11907m.C11908a aVar2 = C11907m.f18600b;
                obj = C11907m.m25696a(C11910n.m25700a(th));
            }
            dVar.resumeWith(obj);
        }
    }

    public BroadcastFrameClock() {
        this((C13074a) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void cancel$default(BroadcastFrameClock broadcastFrameClock, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        broadcastFrameClock.cancel(cancellationException);
    }

    /* access modifiers changed from: private */
    public final void fail(Throwable th) {
        synchronized (this.lock) {
            if (this.failureCause == null) {
                this.failureCause = th;
                List<FrameAwaiter<?>> list = this.awaiters;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C12074d continuation = list.get(i).getContinuation();
                    C11907m.C11908a aVar = C11907m.f18600b;
                    continuation.resumeWith(C11907m.m25696a(C11910n.m25700a(th)));
                }
                this.awaiters.clear();
                C11921v vVar = C11921v.f18618a;
            }
        }
    }

    public final void cancel(CancellationException cancellationException) {
        C12775o.m28639i(cancellationException, "cancellationException");
        fail(cancellationException);
    }

    public <R> R fold(R r, C13088o<? super R, ? super C12079g.C12082b, ? extends R> oVar) {
        return MonotonicFrameClock.DefaultImpls.fold(this, r, oVar);
    }

    public <E extends C12079g.C12082b> E get(C12079g.C12084c<E> cVar) {
        return MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    public final boolean getHasAwaiters() {
        boolean z;
        synchronized (this.lock) {
            z = !this.awaiters.isEmpty();
        }
        return z;
    }

    public C12079g minusKey(C12079g.C12084c<?> cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    public C12079g plus(C12079g gVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, gVar);
    }

    public final void sendFrame(long j) {
        synchronized (this.lock) {
            List<FrameAwaiter<?>> list = this.awaiters;
            this.awaiters = this.spareList;
            this.spareList = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).resume(j);
            }
            list.clear();
            C11921v vVar = C11921v.f18618a;
        }
    }

    public <R> Object withFrameNanos(Function1<? super Long, ? extends R> function1, C12074d<? super R> dVar) {
        boolean z;
        FrameAwaiter frameAwaiter;
        C14010o oVar = new C14010o(C12147c.m26491b(dVar), 1);
        oVar.mo53786B();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (this.lock) {
            Throwable access$getFailureCause$p = this.failureCause;
            if (access$getFailureCause$p != null) {
                C11907m.C11908a aVar = C11907m.f18600b;
                oVar.resumeWith(C11907m.m25696a(C11910n.m25700a(access$getFailureCause$p)));
            } else {
                ref$ObjectRef.f20403b = new FrameAwaiter(function1, oVar);
                if (!this.awaiters.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                List access$getAwaiters$p = this.awaiters;
                T t = ref$ObjectRef.f20403b;
                if (t == null) {
                    C12775o.m28656z("awaiter");
                    frameAwaiter = null;
                } else {
                    frameAwaiter = (FrameAwaiter) t;
                }
                access$getAwaiters$p.add(frameAwaiter);
                boolean z2 = !z;
                oVar.mo49526f(new BroadcastFrameClock$withFrameNanos$2$1(this, ref$ObjectRef));
                if (z2 && this.onNewAwaiters != null) {
                    try {
                        this.onNewAwaiters.invoke();
                    } catch (Throwable th) {
                        fail(th);
                    }
                }
            }
        }
        Object y = oVar.mo53797y();
        if (y == C12150d.m26492c()) {
            C12741h.m28573c(dVar);
        }
        return y;
    }

    public BroadcastFrameClock(C13074a<C11921v> aVar) {
        this.onNewAwaiters = aVar;
        this.lock = new Object();
        this.awaiters = new ArrayList();
        this.spareList = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BroadcastFrameClock(C13074a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aVar);
    }
}
