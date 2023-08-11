package androidx.compose.animation.core;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.animation.core.MutatorMutex$mutate$2", mo50610f = "InternalMutatorMutex.kt", mo50611l = {171, 119}, mo50612m = "invokeSuspend")
/* compiled from: InternalMutatorMutex.kt */
final class MutatorMutex$mutate$2 extends C12746l implements C13088o<C13995l0, C12074d<? super R>, Object> {
    final /* synthetic */ Function1<C12074d<? super R>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutatorMutex this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MutatorMutex$mutate$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, Function1<? super C12074d<? super R>, ? extends Object> function1, C12074d<? super MutatorMutex$mutate$2> dVar) {
        super(2, dVar);
        this.$priority = mutatePriority;
        this.this$0 = mutatorMutex;
        this.$block = function1;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.$priority, this.this$0, this.$block, dVar);
        mutatorMutex$mutate$2.L$0 = obj;
        return mutatorMutex$mutate$2;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0096=Splitter:B:20:0x0096, B:26:0x00a7=Splitter:B:26:0x00a7} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0040
            if (r1 == r3) goto L_0x002b
            if (r1 != r2) goto L_0x0023
            java.lang.Object r0 = r8.L$2
            androidx.compose.animation.core.MutatorMutex r0 = (androidx.compose.animation.core.MutatorMutex) r0
            java.lang.Object r1 = r8.L$1
            hg.a r1 = (p356hg.C12088a) r1
            java.lang.Object r2 = r8.L$0
            androidx.compose.animation.core.MutatorMutex$Mutator r2 = (androidx.compose.animation.core.MutatorMutex.Mutator) r2
            p336ef.C11910n.m25701b(r9)     // Catch:{ all -> 0x0020 }
            goto L_0x0096
        L_0x0020:
            r9 = move-exception
            goto L_0x00a7
        L_0x0023:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x002b:
            java.lang.Object r1 = r8.L$3
            androidx.compose.animation.core.MutatorMutex r1 = (androidx.compose.animation.core.MutatorMutex) r1
            java.lang.Object r3 = r8.L$2
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.lang.Object r5 = r8.L$1
            hg.a r5 = (p356hg.C12088a) r5
            java.lang.Object r6 = r8.L$0
            androidx.compose.animation.core.MutatorMutex$Mutator r6 = (androidx.compose.animation.core.MutatorMutex.Mutator) r6
            p336ef.C11910n.m25701b(r9)
            r9 = r5
            goto L_0x0081
        L_0x0040:
            p336ef.C11910n.m25701b(r9)
            java.lang.Object r9 = r8.L$0
            yf.l0 r9 = (p466yf.C13995l0) r9
            androidx.compose.animation.core.MutatorMutex$Mutator r1 = new androidx.compose.animation.core.MutatorMutex$Mutator
            androidx.compose.animation.core.MutatePriority r5 = r8.$priority
            hf.g r9 = r9.getCoroutineContext()
            yf.y1$b r6 = p466yf.C14054y1.f22970b0
            hf.g$b r9 = r9.get(r6)
            kotlin.jvm.internal.C12775o.m28636f(r9)
            yf.y1 r9 = (p466yf.C14054y1) r9
            r1.<init>(r5, r9)
            androidx.compose.animation.core.MutatorMutex r9 = r8.this$0
            r9.tryMutateOrCancel(r1)
            androidx.compose.animation.core.MutatorMutex r9 = r8.this$0
            hg.a r9 = r9.mutex
            kotlin.jvm.functions.Function1<hf.d<? super R>, java.lang.Object> r5 = r8.$block
            androidx.compose.animation.core.MutatorMutex r6 = r8.this$0
            r8.L$0 = r1
            r8.L$1 = r9
            r8.L$2 = r5
            r8.L$3 = r6
            r8.label = r3
            java.lang.Object r3 = r9.mo49516a(r4, r8)
            if (r3 != r0) goto L_0x007d
            return r0
        L_0x007d:
            r3 = r5
            r7 = r6
            r6 = r1
            r1 = r7
        L_0x0081:
            r8.L$0 = r6     // Catch:{ all -> 0x00a1 }
            r8.L$1 = r9     // Catch:{ all -> 0x00a1 }
            r8.L$2 = r1     // Catch:{ all -> 0x00a1 }
            r8.L$3 = r4     // Catch:{ all -> 0x00a1 }
            r8.label = r2     // Catch:{ all -> 0x00a1 }
            java.lang.Object r2 = r3.invoke(r8)     // Catch:{ all -> 0x00a1 }
            if (r2 != r0) goto L_0x0092
            return r0
        L_0x0092:
            r0 = r1
            r1 = r9
            r9 = r2
            r2 = r6
        L_0x0096:
            java.util.concurrent.atomic.AtomicReference r0 = r0.currentMutator     // Catch:{ all -> 0x00af }
            androidx.compose.animation.core.C0344a.m496a(r0, r2, r4)     // Catch:{ all -> 0x00af }
            r1.mo49519f(r4)
            return r9
        L_0x00a1:
            r0 = move-exception
            r2 = r6
            r7 = r1
            r1 = r9
            r9 = r0
            r0 = r7
        L_0x00a7:
            java.util.concurrent.atomic.AtomicReference r0 = r0.currentMutator     // Catch:{ all -> 0x00af }
            androidx.compose.animation.core.C0344a.m496a(r0, r2, r4)     // Catch:{ all -> 0x00af }
            throw r9     // Catch:{ all -> 0x00af }
        L_0x00af:
            r9 = move-exception
            r1.mo49519f(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.MutatorMutex$mutate$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super R> dVar) {
        return ((MutatorMutex$mutate$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
