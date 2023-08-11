package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1", mo50610f = "AppBar.kt", mo50611l = {1539, 1540}, mo50612m = "onPostFling-RZ2iAVY")
/* renamed from: androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 */
/* compiled from: AppBar.kt */
final class C0851x78ae0263 extends C12737d {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0851x78ae0263(ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 exitUntilCollapsedScrollBehavior$nestedScrollConnection$1, C12074d<? super C0851x78ae0263> dVar) {
        super(dVar);
        this.this$0 = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m34414onPostFlingRZ2iAVY(0, 0, this);
    }
}
