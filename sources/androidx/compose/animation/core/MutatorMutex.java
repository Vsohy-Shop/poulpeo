package androidx.compose.animation.core;

import androidx.compose.runtime.Stable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p355hf.C12074d;
import p356hg.C12088a;
import p356hg.C12096c;
import p404of.C13088o;
import p466yf.C13999m0;
import p466yf.C14054y1;

@Stable
/* compiled from: InternalMutatorMutex.kt */
public final class MutatorMutex {
    /* access modifiers changed from: private */
    public final AtomicReference<Mutator> currentMutator = new AtomicReference<>((Object) null);
    /* access modifiers changed from: private */
    public final C12088a mutex = C12096c.m26296b(false, 1, (Object) null);

    /* compiled from: InternalMutatorMutex.kt */
    private static final class Mutator {
        private final C14054y1 job;
        private final MutatePriority priority;

        public Mutator(MutatePriority mutatePriority, C14054y1 y1Var) {
            C12775o.m28639i(mutatePriority, "priority");
            C12775o.m28639i(y1Var, "job");
            this.priority = mutatePriority;
            this.job = y1Var;
        }

        public final boolean canInterrupt(Mutator mutator) {
            C12775o.m28639i(mutator, "other");
            if (this.priority.compareTo(mutator.priority) >= 0) {
                return true;
            }
            return false;
        }

        public final void cancel() {
            C14054y1.C14055a.m32600a(this.job, (CancellationException) null, 1, (Object) null);
        }

        public final C14054y1 getJob() {
            return this.job;
        }

        public final MutatePriority getPriority() {
            return this.priority;
        }
    }

    public static /* synthetic */ Object mutate$default(MutatorMutex mutatorMutex, MutatePriority mutatePriority, Function1 function1, C12074d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutate(mutatePriority, function1, dVar);
    }

    public static /* synthetic */ Object mutateWith$default(MutatorMutex mutatorMutex, Object obj, MutatePriority mutatePriority, C13088o oVar, C12074d dVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutateWith(obj, mutatePriority, oVar, dVar);
    }

    /* access modifiers changed from: private */
    public final void tryMutateOrCancel(Mutator mutator) {
        Mutator mutator2;
        do {
            mutator2 = this.currentMutator.get();
            if (mutator2 != null && !mutator.canInterrupt(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!C0344a.m496a(this.currentMutator, mutator2, mutator));
        if (mutator2 != null) {
            mutator2.cancel();
        }
    }

    public final <R> Object mutate(MutatePriority mutatePriority, Function1<? super C12074d<? super R>, ? extends Object> function1, C12074d<? super R> dVar) {
        return C13999m0.m32451e(new MutatorMutex$mutate$2(mutatePriority, this, function1, (C12074d<? super MutatorMutex$mutate$2>) null), dVar);
    }

    public final <T, R> Object mutateWith(T t, MutatePriority mutatePriority, C13088o<? super T, ? super C12074d<? super R>, ? extends Object> oVar, C12074d<? super R> dVar) {
        return C13999m0.m32451e(new MutatorMutex$mutateWith$2(mutatePriority, this, oVar, t, (C12074d<? super MutatorMutex$mutateWith$2>) null), dVar);
    }
}
