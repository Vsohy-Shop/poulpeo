package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1", mo50610f = "AppBar.kt", mo50611l = {1454, 1455}, mo50612m = "onPostFling-RZ2iAVY")
/* compiled from: AppBar.kt */
final class EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends C12737d {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EnterAlwaysScrollBehavior$nestedScrollConnection$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(EnterAlwaysScrollBehavior$nestedScrollConnection$1 enterAlwaysScrollBehavior$nestedScrollConnection$1, C12074d<? super EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1> dVar) {
        super(dVar);
        this.this$0 = enterAlwaysScrollBehavior$nestedScrollConnection$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m34411onPostFlingRZ2iAVY(0, 0, this);
    }
}
