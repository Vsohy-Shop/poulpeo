package androidx.compose.foundation.relocation;

import androidx.compose.p002ui.geometry.Rect;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", mo50610f = "BringIntoViewRequester.kt", mo50611l = {126}, mo50612m = "bringIntoView")
/* compiled from: BringIntoViewRequester.kt */
final class BringIntoViewRequesterImpl$bringIntoView$1 extends C12737d {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BringIntoViewRequesterImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BringIntoViewRequesterImpl$bringIntoView$1(BringIntoViewRequesterImpl bringIntoViewRequesterImpl, C12074d<? super BringIntoViewRequesterImpl$bringIntoView$1> dVar) {
        super(dVar);
        this.this$0 = bringIntoViewRequesterImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.bringIntoView((Rect) null, this);
    }
}
