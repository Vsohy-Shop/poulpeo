package androidx.compose.runtime;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1", mo50610f = "ProduceState.kt", mo50611l = {84}, mo50612m = "invokeSuspend")
/* compiled from: ProduceState.kt */
final class SnapshotStateKt__ProduceStateKt$produceState$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C13088o<ProduceStateScope<T>, C12074d<? super C11921v>, Object> $producer;
    final /* synthetic */ MutableState<T> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotStateKt__ProduceStateKt$produceState$1(C13088o<? super ProduceStateScope<T>, ? super C12074d<? super C11921v>, ? extends Object> oVar, MutableState<T> mutableState, C12074d<? super SnapshotStateKt__ProduceStateKt$produceState$1> dVar) {
        super(2, dVar);
        this.$producer = oVar;
        this.$result = mutableState;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        SnapshotStateKt__ProduceStateKt$produceState$1 snapshotStateKt__ProduceStateKt$produceState$1 = new SnapshotStateKt__ProduceStateKt$produceState$1(this.$producer, this.$result, dVar);
        snapshotStateKt__ProduceStateKt$produceState$1.L$0 = obj;
        return snapshotStateKt__ProduceStateKt$produceState$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            C13088o<ProduceStateScope<T>, C12074d<? super C11921v>, Object> oVar = this.$producer;
            ProduceStateScopeImpl produceStateScopeImpl = new ProduceStateScopeImpl(this.$result, ((C13995l0) this.L$0).getCoroutineContext());
            this.label = 1;
            if (oVar.invoke(produceStateScopeImpl, this) == c) {
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
        return ((SnapshotStateKt__ProduceStateKt$produceState$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
