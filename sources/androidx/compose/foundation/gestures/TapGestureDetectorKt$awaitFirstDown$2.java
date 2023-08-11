package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", mo50610f = "TapGestureDetector.kt", mo50611l = {279}, mo50612m = "awaitFirstDown")
/* compiled from: TapGestureDetector.kt */
final class TapGestureDetectorKt$awaitFirstDown$2 extends C12737d {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    TapGestureDetectorKt$awaitFirstDown$2(C12074d<? super TapGestureDetectorKt$awaitFirstDown$2> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.awaitFirstDown((AwaitPointerEventScope) null, false, (PointerEventPass) null, this);
    }
}
