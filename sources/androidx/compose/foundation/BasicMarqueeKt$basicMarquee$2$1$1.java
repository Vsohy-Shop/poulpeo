package androidx.compose.foundation;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.foundation.BasicMarqueeKt$basicMarquee$2$1$1", mo50610f = "BasicMarquee.kt", mo50611l = {174}, mo50612m = "invokeSuspend")
/* compiled from: BasicMarquee.kt */
final class BasicMarqueeKt$basicMarquee$2$1$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ MarqueeModifier $modifier;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BasicMarqueeKt$basicMarquee$2$1$1(MarqueeModifier marqueeModifier, C12074d<? super BasicMarqueeKt$basicMarquee$2$1$1> dVar) {
        super(2, dVar);
        this.$modifier = marqueeModifier;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new BasicMarqueeKt$basicMarquee$2$1$1(this.$modifier, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            MarqueeModifier marqueeModifier = this.$modifier;
            this.label = 1;
            if (marqueeModifier.runAnimation(this) == c) {
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
        return ((BasicMarqueeKt$basicMarquee$2$1$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
