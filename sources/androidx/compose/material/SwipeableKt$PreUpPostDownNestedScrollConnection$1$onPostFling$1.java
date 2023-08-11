package androidx.compose.material;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1", mo50610f = "Swipeable.kt", mo50611l = {882}, mo50612m = "onPostFling-RZ2iAVY")
/* compiled from: Swipeable.kt */
final class SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 extends C12737d {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeableKt$PreUpPostDownNestedScrollConnection$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1(SwipeableKt$PreUpPostDownNestedScrollConnection$1 swipeableKt$PreUpPostDownNestedScrollConnection$1, C12074d<? super SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1> dVar) {
        super(dVar);
        this.this$0 = swipeableKt$PreUpPostDownNestedScrollConnection$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m34141onPostFlingRZ2iAVY(0, 0, this);
    }
}
