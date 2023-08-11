package androidx.compose.animation.core;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.animation.core.MutatorMutex$mutateWith$2", mo50610f = "InternalMutatorMutex.kt", mo50611l = {171, 158}, mo50612m = "invokeSuspend")
/* compiled from: InternalMutatorMutex.kt */
final class MutatorMutex$mutateWith$2 extends C12746l implements C13088o<C13995l0, C12074d<? super R>, Object> {
    final /* synthetic */ C13088o<T, C12074d<? super R>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    final /* synthetic */ T $receiver;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ MutatorMutex this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MutatorMutex$mutateWith$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, C13088o<? super T, ? super C12074d<? super R>, ? extends Object> oVar, T t, C12074d<? super MutatorMutex$mutateWith$2> dVar) {
        super(2, dVar);
        this.$priority = mutatePriority;
        this.this$0 = mutatorMutex;
        this.$block = oVar;
        this.$receiver = t;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.$priority, this.this$0, this.$block, this.$receiver, dVar);
        mutatorMutex$mutateWith$2.L$0 = obj;
        return mutatorMutex$mutateWith$2;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x009e=Splitter:B:20:0x009e, B:26:0x00af=Splitter:B:26:0x00af} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0042
            if (r1 == r3) goto L_0x002b
            if (r1 != r2) goto L_0x0023
            java.lang.Object r0 = r9.L$2
            androidx.compose.animation.core.MutatorMutex r0 = (androidx.compose.animation.core.MutatorMutex) r0
            java.lang.Object r1 = r9.L$1
            hg.a r1 = (p356hg.C12088a) r1
            java.lang.Object r2 = r9.L$0
            androidx.compose.animation.core.MutatorMutex$Mutator r2 = (androidx.compose.animation.core.MutatorMutex.Mutator) r2
            p336ef.C11910n.m25701b(r10)     // Catch:{ all -> 0x0020 }
            goto L_0x009e
        L_0x0020:
            r10 = move-exception
            goto L_0x00af
        L_0x0023:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x002b:
            java.lang.Object r1 = r9.L$4
            androidx.compose.animation.core.MutatorMutex r1 = (androidx.compose.animation.core.MutatorMutex) r1
            java.lang.Object r3 = r9.L$3
            java.lang.Object r5 = r9.L$2
            of.o r5 = (p404of.C13088o) r5
            java.lang.Object r6 = r9.L$1
            hg.a r6 = (p356hg.C12088a) r6
            java.lang.Object r7 = r9.L$0
            androidx.compose.animation.core.MutatorMutex$Mutator r7 = (androidx.compose.animation.core.MutatorMutex.Mutator) r7
            p336ef.C11910n.m25701b(r10)
            r10 = r6
            goto L_0x0087
        L_0x0042:
            p336ef.C11910n.m25701b(r10)
            java.lang.Object r10 = r9.L$0
            yf.l0 r10 = (p466yf.C13995l0) r10
            androidx.compose.animation.core.MutatorMutex$Mutator r1 = new androidx.compose.animation.core.MutatorMutex$Mutator
            androidx.compose.animation.core.MutatePriority r5 = r9.$priority
            hf.g r10 = r10.getCoroutineContext()
            yf.y1$b r6 = p466yf.C14054y1.f22970b0
            hf.g$b r10 = r10.get(r6)
            kotlin.jvm.internal.C12775o.m28636f(r10)
            yf.y1 r10 = (p466yf.C14054y1) r10
            r1.<init>(r5, r10)
            androidx.compose.animation.core.MutatorMutex r10 = r9.this$0
            r10.tryMutateOrCancel(r1)
            androidx.compose.animation.core.MutatorMutex r10 = r9.this$0
            hg.a r10 = r10.mutex
            of.o<T, hf.d<? super R>, java.lang.Object> r5 = r9.$block
            T r6 = r9.$receiver
            androidx.compose.animation.core.MutatorMutex r7 = r9.this$0
            r9.L$0 = r1
            r9.L$1 = r10
            r9.L$2 = r5
            r9.L$3 = r6
            r9.L$4 = r7
            r9.label = r3
            java.lang.Object r3 = r10.mo49516a(r4, r9)
            if (r3 != r0) goto L_0x0083
            return r0
        L_0x0083:
            r3 = r6
            r8 = r7
            r7 = r1
            r1 = r8
        L_0x0087:
            r9.L$0 = r7     // Catch:{ all -> 0x00a9 }
            r9.L$1 = r10     // Catch:{ all -> 0x00a9 }
            r9.L$2 = r1     // Catch:{ all -> 0x00a9 }
            r9.L$3 = r4     // Catch:{ all -> 0x00a9 }
            r9.L$4 = r4     // Catch:{ all -> 0x00a9 }
            r9.label = r2     // Catch:{ all -> 0x00a9 }
            java.lang.Object r2 = r5.invoke(r3, r9)     // Catch:{ all -> 0x00a9 }
            if (r2 != r0) goto L_0x009a
            return r0
        L_0x009a:
            r0 = r1
            r1 = r10
            r10 = r2
            r2 = r7
        L_0x009e:
            java.util.concurrent.atomic.AtomicReference r0 = r0.currentMutator     // Catch:{ all -> 0x00b7 }
            androidx.compose.animation.core.C0344a.m496a(r0, r2, r4)     // Catch:{ all -> 0x00b7 }
            r1.mo49519f(r4)
            return r10
        L_0x00a9:
            r0 = move-exception
            r2 = r7
            r8 = r1
            r1 = r10
            r10 = r0
            r0 = r8
        L_0x00af:
            java.util.concurrent.atomic.AtomicReference r0 = r0.currentMutator     // Catch:{ all -> 0x00b7 }
            androidx.compose.animation.core.C0344a.m496a(r0, r2, r4)     // Catch:{ all -> 0x00b7 }
            throw r10     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r10 = move-exception
            r1.mo49519f(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.MutatorMutex$mutateWith$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super R> dVar) {
        return ((MutatorMutex$mutateWith$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
