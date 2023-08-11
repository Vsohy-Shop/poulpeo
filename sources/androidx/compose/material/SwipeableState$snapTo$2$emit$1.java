package androidx.compose.material;

import java.util.Map;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p336ef.C11921v;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.material.SwipeableState$snapTo$2", mo50610f = "Swipeable.kt", mo50611l = {316}, mo50612m = "emit")
/* compiled from: Swipeable.kt */
final class SwipeableState$snapTo$2$emit$1 extends C12737d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeableState$snapTo$2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableState$snapTo$2$emit$1(SwipeableState$snapTo$2 swipeableState$snapTo$2, C12074d<? super SwipeableState$snapTo$2$emit$1> dVar) {
        super(dVar);
        this.this$0 = swipeableState$snapTo$2;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Map) null, (C12074d<? super C11921v>) this);
    }
}
