package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", mo50610f = "TapGestureDetector.kt", mo50611l = {357}, mo50612m = "reset")
/* compiled from: TapGestureDetector.kt */
final class PressGestureScopeImpl$reset$1 extends C12737d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PressGestureScopeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PressGestureScopeImpl$reset$1(PressGestureScopeImpl pressGestureScopeImpl, C12074d<? super PressGestureScopeImpl$reset$1> dVar) {
        super(dVar);
        this.this$0 = pressGestureScopeImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.reset(this);
    }
}
