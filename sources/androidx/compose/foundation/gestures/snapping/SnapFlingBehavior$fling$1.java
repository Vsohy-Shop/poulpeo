package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", mo50610f = "SnapFlingBehavior.kt", mo50611l = {132}, mo50612m = "fling")
/* compiled from: SnapFlingBehavior.kt */
final class SnapFlingBehavior$fling$1 extends C12737d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapFlingBehavior$fling$1(SnapFlingBehavior snapFlingBehavior, C12074d<? super SnapFlingBehavior$fling$1> dVar) {
        super(dVar);
        this.this$0 = snapFlingBehavior;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fling((ScrollScope) null, 0.0f, (Function1<? super Float, C11921v>) null, this);
    }
}
