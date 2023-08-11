package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.material3.SwipeableKt$PreUpPostDownNestedScrollConnection$1", mo50610f = "Swipeable.kt", mo50611l = {869}, mo50612m = "onPreFling-QWom1Mo")
/* compiled from: Swipeable.kt */
final class SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 extends C12737d {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeableKt$PreUpPostDownNestedScrollConnection$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1(SwipeableKt$PreUpPostDownNestedScrollConnection$1 swipeableKt$PreUpPostDownNestedScrollConnection$1, C12074d<? super SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1> dVar) {
        super(dVar);
        this.this$0 = swipeableKt$PreUpPostDownNestedScrollConnection$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m34616onPreFlingQWom1Mo(0, this);
    }
}
