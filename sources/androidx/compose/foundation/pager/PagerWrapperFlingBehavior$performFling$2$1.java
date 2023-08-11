package androidx.compose.foundation.pager;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Pager.kt */
final class PagerWrapperFlingBehavior$performFling$2$1 extends C12777p implements Function1<Float, C11921v> {
    final /* synthetic */ PagerWrapperFlingBehavior this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PagerWrapperFlingBehavior$performFling$2$1(PagerWrapperFlingBehavior pagerWrapperFlingBehavior) {
        super(1);
        this.this$0 = pagerWrapperFlingBehavior;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return C11921v.f18618a;
    }

    public final void invoke(float f) {
        this.this$0.getPagerState().setSnapRemainingScrollOffset$foundation_release(f);
    }
}
