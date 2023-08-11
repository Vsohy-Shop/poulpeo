package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p308ag.C10894d;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.TransformableKt", mo50610f = "Transformable.kt", mo50611l = {134, 136}, mo50612m = "detectZoom")
/* compiled from: Transformable.kt */
final class TransformableKt$detectZoom$1 extends C12737d {
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    TransformableKt$detectZoom$1(C12074d<? super TransformableKt$detectZoom$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TransformableKt.detectZoom((AwaitPointerEventScope) null, (State<Boolean>) null, (C10894d<TransformEvent>) null, this);
    }
}
