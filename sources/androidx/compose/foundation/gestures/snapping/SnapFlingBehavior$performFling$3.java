package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", mo50610f = "SnapFlingBehavior.kt", mo50611l = {118}, mo50612m = "performFling")
/* compiled from: SnapFlingBehavior.kt */
final class SnapFlingBehavior$performFling$3 extends C12737d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapFlingBehavior$performFling$3(SnapFlingBehavior snapFlingBehavior, C12074d<? super SnapFlingBehavior$performFling$3> dVar) {
        super(dVar);
        this.this$0 = snapFlingBehavior;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.performFling((ScrollScope) null, 0.0f, (Function1<? super Float, C11921v>) null, this);
    }
}
