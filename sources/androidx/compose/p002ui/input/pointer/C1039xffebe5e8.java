package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilter;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", mo50610f = "SuspendingPointerInputFilter.kt", mo50611l = {628}, mo50612m = "withTimeout")
/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 */
/* compiled from: SuspendingPointerInputFilter.kt */
final class C1039xffebe5e8<T> extends C12737d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1039xffebe5e8(SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, C12074d<? super C1039xffebe5e8> dVar) {
        super(dVar);
        this.this$0 = pointerEventHandlerCoroutine;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.withTimeout(0, (C13088o) null, this);
    }
}
