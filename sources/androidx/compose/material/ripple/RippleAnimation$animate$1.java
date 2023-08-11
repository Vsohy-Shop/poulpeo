package androidx.compose.material.ripple;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.material.ripple.RippleAnimation", mo50610f = "RippleAnimation.kt", mo50611l = {80, 82, 83}, mo50612m = "animate")
/* compiled from: RippleAnimation.kt */
final class RippleAnimation$animate$1 extends C12737d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RippleAnimation this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RippleAnimation$animate$1(RippleAnimation rippleAnimation, C12074d<? super RippleAnimation$animate$1> dVar) {
        super(dVar);
        this.this$0 = rippleAnimation;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.animate(this);
    }
}
