package androidx.compose.foundation.pager;

import androidx.compose.p002ui.unit.Density;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt$Pager$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,781:1\n1#2:782\n*E\n"})
@C12739f(mo50609c = "androidx.compose.foundation.pager.PagerKt$Pager$2$1", mo50610f = "Pager.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* compiled from: Pager.kt */
final class PagerKt$Pager$2$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ Density $density;
    final /* synthetic */ float $pageSpacing;
    final /* synthetic */ PagerState $state;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagerKt$Pager$2$1(Density density, PagerState pagerState, float f, C12074d<? super PagerKt$Pager$2$1> dVar) {
        super(2, dVar);
        this.$density = density;
        this.$state = pagerState;
        this.$pageSpacing = f;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new PagerKt$Pager$2$1(this.$density, this.$state, this.$pageSpacing, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            this.$state.setPageSpacing$foundation_release(this.$density.m38443roundToPx0680j_4(this.$pageSpacing));
            return C11921v.f18618a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((PagerKt$Pager$2$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
