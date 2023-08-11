package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.ScrollState;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.material3.ScrollableTabData$onLaidOut$1$1", mo50610f = "TabRow.kt", mo50611l = {448}, mo50612m = "invokeSuspend")
/* compiled from: TabRow.kt */
final class ScrollableTabData$onLaidOut$1$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ int $calculatedOffset;
    int label;
    final /* synthetic */ ScrollableTabData this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollableTabData$onLaidOut$1$1(ScrollableTabData scrollableTabData, int i, C12074d<? super ScrollableTabData$onLaidOut$1$1> dVar) {
        super(2, dVar);
        this.this$0 = scrollableTabData;
        this.$calculatedOffset = i;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new ScrollableTabData$onLaidOut$1$1(this.this$0, this.$calculatedOffset, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            ScrollState access$getScrollState$p = this.this$0.scrollState;
            int i2 = this.$calculatedOffset;
            AnimationSpec access$getScrollableTabRowScrollSpec$p = TabRowKt.ScrollableTabRowScrollSpec;
            this.label = 1;
            if (access$getScrollState$p.animateScrollTo(i2, access$getScrollableTabRowScrollSpec$p, this) == c) {
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
        return ((ScrollableTabData$onLaidOut$1$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
