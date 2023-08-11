package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", mo50610f = "TapGestureDetector.kt", mo50611l = {305, 320}, mo50612m = "waitForUpOrCancellation")
/* compiled from: TapGestureDetector.kt */
final class TapGestureDetectorKt$waitForUpOrCancellation$2 extends C12737d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    TapGestureDetectorKt$waitForUpOrCancellation$2(C12074d<? super TapGestureDetectorKt$waitForUpOrCancellation$2> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.waitForUpOrCancellation((AwaitPointerEventScope) null, (PointerEventPass) null, this);
    }
}
