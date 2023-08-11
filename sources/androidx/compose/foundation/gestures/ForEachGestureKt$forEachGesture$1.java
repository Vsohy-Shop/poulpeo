package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.ForEachGestureKt", mo50610f = "ForEachGesture.kt", mo50611l = {48, 51, 56}, mo50612m = "forEachGesture")
/* compiled from: ForEachGesture.kt */
final class ForEachGestureKt$forEachGesture$1 extends C12737d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    ForEachGestureKt$forEachGesture$1(C12074d<? super ForEachGestureKt$forEachGesture$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ForEachGestureKt.forEachGesture((PointerInputScope) null, (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) null, this);
    }
}
