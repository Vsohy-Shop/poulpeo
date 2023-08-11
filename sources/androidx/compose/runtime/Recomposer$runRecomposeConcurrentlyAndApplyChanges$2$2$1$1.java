package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11907m;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14002n;

@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1408:1\n70#2:1409\n1#3:1410\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1\n*L\n754#1:1409\n*E\n"})
@C12739f(mo50609c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1", mo50610f = "Recomposer.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* compiled from: Recomposer.kt */
final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ ControlledComposition $composition;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1(Recomposer recomposer, ControlledComposition controlledComposition, C12074d<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1> dVar) {
        super(2, dVar);
        this.this$0 = recomposer;
        this.$composition = controlledComposition;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1(this.this$0, this.$composition, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        C14002n access$deriveStateLocked;
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            ControlledComposition access$performRecompose = this.this$0.performRecompose(this.$composition, (IdentityArraySet<Object>) null);
            Object access$getStateLock$p = this.this$0.stateLock;
            Recomposer recomposer = this.this$0;
            synchronized (access$getStateLock$p) {
                if (access$performRecompose != null) {
                    try {
                        recomposer.compositionsAwaitingApply.add(access$performRecompose);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                recomposer.concurrentCompositionsOutstanding = recomposer.concurrentCompositionsOutstanding - 1;
                access$deriveStateLocked = recomposer.deriveStateLocked();
            }
            if (access$deriveStateLocked != null) {
                C11907m.C11908a aVar = C11907m.f18600b;
                access$deriveStateLocked.resumeWith(C11907m.m25696a(C11921v.f18618a));
            }
            return C11921v.f18618a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
