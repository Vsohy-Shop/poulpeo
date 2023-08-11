package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12745k;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", mo50610f = "ForEachGesture.kt", mo50611l = {77}, mo50612m = "invokeSuspend")
/* compiled from: ForEachGesture.kt */
final class ForEachGestureKt$awaitAllPointersUp$2 extends C12745k implements C13088o<AwaitPointerEventScope, C12074d<? super C11921v>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    ForEachGestureKt$awaitAllPointersUp$2(C12074d<? super ForEachGestureKt$awaitAllPointersUp$2> dVar) {
        super(2, dVar);
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        ForEachGestureKt$awaitAllPointersUp$2 forEachGestureKt$awaitAllPointersUp$2 = new ForEachGestureKt$awaitAllPointersUp$2(dVar);
        forEachGestureKt$awaitAllPointersUp$2.L$0 = obj;
        return forEachGestureKt$awaitAllPointersUp$2;
    }

    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, C12074d<? super C11921v> dVar) {
        return ((ForEachGestureKt$awaitAllPointersUp$2) create(awaitPointerEventScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            this.label = 1;
            if (ForEachGestureKt.awaitAllPointersUp((AwaitPointerEventScope) this.L$0, (C12074d<? super C11921v>) this) == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11921v.f18618a;
    }
}
