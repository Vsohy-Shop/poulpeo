package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p336ef.C11921v;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.ForEachGestureKt", mo50610f = "ForEachGesture.kt", mo50611l = {86}, mo50612m = "awaitAllPointersUp")
/* compiled from: ForEachGesture.kt */
final class ForEachGestureKt$awaitAllPointersUp$3 extends C12737d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    ForEachGestureKt$awaitAllPointersUp$3(C12074d<? super ForEachGestureKt$awaitAllPointersUp$3> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ForEachGestureKt.awaitAllPointersUp((AwaitPointerEventScope) null, (C12074d<? super C11921v>) this);
    }
}
