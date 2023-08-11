package androidx.compose.foundation.pager;

import androidx.compose.runtime.SnapshotStateKt;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.SourceDebugExtension;
import p314bg.C10962f;
import p314bg.C10967g;
import p314bg.C10971h;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt$Pager$3$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,781:1\n20#2:782\n22#2:786\n50#3:783\n55#3:785\n106#4:784\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt$Pager$3$1\n*L\n285#1:782\n285#1:786\n285#1:783\n285#1:785\n285#1:784\n*E\n"})
@C12739f(mo50609c = "androidx.compose.foundation.pager.PagerKt$Pager$3$1", mo50610f = "Pager.kt", mo50611l = {287}, mo50612m = "invokeSuspend")
/* compiled from: Pager.kt */
final class PagerKt$Pager$3$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ PagerState $state;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagerKt$Pager$3$1(PagerState pagerState, C12074d<? super PagerKt$Pager$3$1> dVar) {
        super(2, dVar);
        this.$state = pagerState;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new PagerKt$Pager$3$1(this.$state, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final PagerState pagerState = this.$state;
            C10962f h = C10971h.m23601h(new PagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1(SnapshotStateKt.snapshotFlow(new C13074a<Boolean>() {
                public final Boolean invoke() {
                    return Boolean.valueOf(pagerState.isScrollInProgress());
                }
            })), 1);
            final PagerState pagerState2 = this.$state;
            C05833 r1 = new C10967g<Boolean>() {
                public /* bridge */ /* synthetic */ Object emit(Object obj, C12074d dVar) {
                    return emit(((Boolean) obj).booleanValue(), (C12074d<? super C11921v>) dVar);
                }

                public final Object emit(boolean z, C12074d<? super C11921v> dVar) {
                    pagerState2.updateOnScrollStopped$foundation_release();
                    return C11921v.f18618a;
                }
            };
            this.label = 1;
            if (h.collect(r1, this) == c) {
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
        return ((PagerKt$Pager$3$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
