package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p404of.C13089p;
import p466yf.C13934b2;
import p466yf.C13995l0;
import p466yf.C13999m0;
import p466yf.C14002n;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1408:1\n70#2:1409\n70#2:1416\n33#3,6:1410\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n*L\n893#1:1409\n903#1:1416\n894#1:1410,6\n*E\n"})
@C12739f(mo50609c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", mo50610f = "Recomposer.kt", mo50611l = {898}, mo50612m = "invokeSuspend")
/* compiled from: Recomposer.kt */
final class Recomposer$recompositionRunner$2 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C13089p<C13995l0, MonotonicFrameClock, C12074d<? super C11921v>, Object> $block;
    final /* synthetic */ MonotonicFrameClock $parentFrameClock;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Recomposer this$0;

    @C12739f(mo50609c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", mo50610f = "Recomposer.kt", mo50611l = {899}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2 */
    /* compiled from: Recomposer.kt */
    static final class C09422 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C09422 r0 = new C09422(pVar, monotonicFrameClock, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                C13089p<C13995l0, MonotonicFrameClock, C12074d<? super C11921v>, Object> pVar = pVar;
                MonotonicFrameClock monotonicFrameClock = monotonicFrameClock;
                this.label = 1;
                if (pVar.invoke((C13995l0) this.L$0, monotonicFrameClock, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11921v.f18618a;
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C09422) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recomposer$recompositionRunner$2(Recomposer recomposer, C13089p<? super C13995l0, ? super MonotonicFrameClock, ? super C12074d<? super C11921v>, ? extends Object> pVar, MonotonicFrameClock monotonicFrameClock, C12074d<? super Recomposer$recompositionRunner$2> dVar) {
        super(2, dVar);
        this.this$0 = recomposer;
        this.$block = pVar;
        this.$parentFrameClock = monotonicFrameClock;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.this$0, this.$block, this.$parentFrameClock, dVar);
        recomposer$recompositionRunner$2.L$0 = obj;
        return recomposer$recompositionRunner$2;
    }

    public final Object invokeSuspend(Object obj) {
        Throwable th;
        C14054y1 y1Var;
        ObserverHandle observerHandle;
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            y1Var = C13934b2.m32226n(((C13995l0) this.L$0).getCoroutineContext());
            this.this$0.registerRunnerJob(y1Var);
            ObserverHandle registerApplyObserver = Snapshot.Companion.registerApplyObserver(new Recomposer$recompositionRunner$2$unregisterApplyObserver$1(this.this$0));
            Recomposer.Companion.addRunning(this.this$0.recomposerInfo);
            try {
                Object access$getStateLock$p = this.this$0.stateLock;
                Recomposer recomposer = this.this$0;
                synchronized (access$getStateLock$p) {
                    List access$getKnownCompositions$p = recomposer.knownCompositions;
                    int size = access$getKnownCompositions$p.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((ControlledComposition) access$getKnownCompositions$p.get(i2)).invalidateAll();
                    }
                    C11921v vVar = C11921v.f18618a;
                }
                final C13089p<C13995l0, MonotonicFrameClock, C12074d<? super C11921v>, Object> pVar = this.$block;
                final MonotonicFrameClock monotonicFrameClock = this.$parentFrameClock;
                C09422 r4 = new C09422((C12074d<? super C09422>) null);
                this.L$0 = y1Var;
                this.L$1 = registerApplyObserver;
                this.label = 1;
                if (C13999m0.m32451e(r4, this) == c) {
                    return c;
                }
                observerHandle = registerApplyObserver;
            } catch (Throwable th2) {
                Throwable th3 = th2;
                observerHandle = registerApplyObserver;
                th = th3;
                observerHandle.dispose();
                Object access$getStateLock$p2 = this.this$0.stateLock;
                Recomposer recomposer2 = this.this$0;
                synchronized (access$getStateLock$p2) {
                    if (recomposer2.runnerJob == y1Var) {
                        recomposer2.runnerJob = null;
                    }
                    C14002n unused = recomposer2.deriveStateLocked();
                }
                Recomposer.Companion.removeRunning(this.this$0.recomposerInfo);
                throw th;
            }
        } else if (i == 1) {
            observerHandle = (ObserverHandle) this.L$1;
            y1Var = (C14054y1) this.L$0;
            try {
                C11910n.m25701b(obj);
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        observerHandle.dispose();
        Object access$getStateLock$p3 = this.this$0.stateLock;
        Recomposer recomposer3 = this.this$0;
        synchronized (access$getStateLock$p3) {
            if (recomposer3.runnerJob == y1Var) {
                recomposer3.runnerJob = null;
            }
            C14002n unused2 = recomposer3.deriveStateLocked();
        }
        Recomposer.Companion.removeRunning(this.this$0.recomposerInfo);
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((Recomposer$recompositionRunner$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
