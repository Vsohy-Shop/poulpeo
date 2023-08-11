package androidx.compose.p002ui.input.nestedscroll;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", mo50610f = "NestedScrollModifierLocal.kt", mo50611l = {94, 96}, mo50612m = "onPostFling-RZ2iAVY")
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1 */
/* compiled from: NestedScrollModifierLocal.kt */
final class NestedScrollModifierLocal$onPostFling$1 extends C12737d {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollModifierLocal this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NestedScrollModifierLocal$onPostFling$1(NestedScrollModifierLocal nestedScrollModifierLocal, C12074d<? super NestedScrollModifierLocal$onPostFling$1> dVar) {
        super(dVar);
        this.this$0 = nestedScrollModifierLocal;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m37056onPostFlingRZ2iAVY(0, 0, this);
    }
}
