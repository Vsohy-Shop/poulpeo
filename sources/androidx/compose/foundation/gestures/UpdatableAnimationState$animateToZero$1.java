package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.UpdatableAnimationState", mo50610f = "UpdatableAnimationState.kt", mo50611l = {100, 146}, mo50612m = "animateToZero")
/* compiled from: UpdatableAnimationState.kt */
final class UpdatableAnimationState$animateToZero$1 extends C12737d {
    float F$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdatableAnimationState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UpdatableAnimationState$animateToZero$1(UpdatableAnimationState updatableAnimationState, C12074d<? super UpdatableAnimationState$animateToZero$1> dVar) {
        super(dVar);
        this.this$0 = updatableAnimationState;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.animateToZero((Function1<? super Float, C11921v>) null, (C13074a<C11921v>) null, this);
    }
}
