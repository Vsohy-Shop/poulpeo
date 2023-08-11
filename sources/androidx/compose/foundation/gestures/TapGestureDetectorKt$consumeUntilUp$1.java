package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", mo50610f = "TapGestureDetector.kt", mo50611l = {195}, mo50612m = "consumeUntilUp")
/* compiled from: TapGestureDetector.kt */
final class TapGestureDetectorKt$consumeUntilUp$1 extends C12737d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    TapGestureDetectorKt$consumeUntilUp$1(C12074d<? super TapGestureDetectorKt$consumeUntilUp$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.consumeUntilUp((AwaitPointerEventScope) null, this);
    }
}
