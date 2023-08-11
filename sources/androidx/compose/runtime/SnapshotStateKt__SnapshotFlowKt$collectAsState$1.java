package androidx.compose.runtime;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import p314bg.C10962f;
import p314bg.C10967g;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p355hf.C12085h;
import p404of.C13088o;
import p466yf.C13970h;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", mo50610f = "SnapshotFlow.kt", mo50611l = {65, 66}, mo50612m = "invokeSuspend")
/* compiled from: SnapshotFlow.kt */
final class SnapshotStateKt__SnapshotFlowKt$collectAsState$1 extends C12746l implements C13088o<ProduceStateScope<R>, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C12079g $context;
    final /* synthetic */ C10962f<T> $this_collectAsState;
    private /* synthetic */ Object L$0;
    int label;

    @C12739f(mo50609c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", mo50610f = "SnapshotFlow.kt", mo50611l = {67}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2 */
    /* compiled from: SnapshotFlow.kt */
    static final class C09462 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C09462(fVar2, produceStateScope, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                C10962f<T> fVar = fVar2;
                final ProduceStateScope<R> produceStateScope = produceStateScope;
                C09471 r1 = new C10967g<T>() {
                    public final Object emit(T t, C12074d<? super C11921v> dVar) {
                        produceStateScope.setValue(t);
                        return C11921v.f18618a;
                    }
                };
                this.label = 1;
                if (fVar.collect(r1, this) == c) {
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
            return ((C09462) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotStateKt__SnapshotFlowKt$collectAsState$1(C12079g gVar, C10962f<? extends T> fVar, C12074d<? super SnapshotStateKt__SnapshotFlowKt$collectAsState$1> dVar) {
        super(2, dVar);
        this.$context = gVar;
        this.$this_collectAsState = fVar;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(this.$context, this.$this_collectAsState, dVar);
        snapshotStateKt__SnapshotFlowKt$collectAsState$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$collectAsState$1;
    }

    public final Object invoke(ProduceStateScope<R> produceStateScope, C12074d<? super C11921v> dVar) {
        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1) create(produceStateScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            if (C12775o.m28634d(this.$context, C12085h.f18916b)) {
                C10962f<T> fVar = this.$this_collectAsState;
                C09451 r2 = new C10967g<T>() {
                    public final Object emit(T t, C12074d<? super C11921v> dVar) {
                        produceStateScope.setValue(t);
                        return C11921v.f18618a;
                    }
                };
                this.label = 1;
                if (fVar.collect(r2, this) == c) {
                    return c;
                }
            } else {
                C12079g gVar = this.$context;
                final C10962f<T> fVar2 = this.$this_collectAsState;
                C09462 r3 = new C09462((C12074d<? super C09462>) null);
                this.label = 2;
                if (C13970h.m32378g(gVar, r3, this) == c) {
                    return c;
                }
            }
        } else if (i == 1 || i == 2) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11921v.f18618a;
    }
}
