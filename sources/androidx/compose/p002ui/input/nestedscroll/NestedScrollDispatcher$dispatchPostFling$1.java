package androidx.compose.p002ui.input.nestedscroll;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", mo50610f = "NestedScrollModifier.kt", mo50611l = {217}, mo50612m = "dispatchPostFling-RZ2iAVY")
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 */
/* compiled from: NestedScrollModifier.kt */
final class NestedScrollDispatcher$dispatchPostFling$1 extends C12737d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollDispatcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NestedScrollDispatcher$dispatchPostFling$1(NestedScrollDispatcher nestedScrollDispatcher, C12074d<? super NestedScrollDispatcher$dispatchPostFling$1> dVar) {
        super(dVar);
        this.this$0 = nestedScrollDispatcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m37052dispatchPostFlingRZ2iAVY(0, 0, this);
    }
}
