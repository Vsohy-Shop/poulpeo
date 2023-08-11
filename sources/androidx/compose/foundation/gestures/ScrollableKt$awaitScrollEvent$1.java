package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.ScrollableKt", mo50610f = "Scrollable.kt", mo50611l = {313}, mo50612m = "awaitScrollEvent")
/* compiled from: Scrollable.kt */
final class ScrollableKt$awaitScrollEvent$1 extends C12737d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    ScrollableKt$awaitScrollEvent$1(C12074d<? super ScrollableKt$awaitScrollEvent$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ScrollableKt.awaitScrollEvent((AwaitPointerEventScope) null, this);
    }
}
