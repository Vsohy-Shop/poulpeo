package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1", mo50610f = "Scrollable.kt", mo50611l = {516}, mo50612m = "onPostFling-RZ2iAVY")
/* compiled from: Scrollable.kt */
final class ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 extends C12737d {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScrollableKt$scrollableNestedScrollConnection$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1(ScrollableKt$scrollableNestedScrollConnection$1 scrollableKt$scrollableNestedScrollConnection$1, C12074d<? super ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1> dVar) {
        super(dVar);
        this.this$0 = scrollableKt$scrollableNestedScrollConnection$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m33131onPostFlingRZ2iAVY(0, 0, this);
    }
}
