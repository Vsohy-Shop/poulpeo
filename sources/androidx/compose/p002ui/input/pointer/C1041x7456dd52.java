package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilter;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", mo50610f = "SuspendingPointerInputFilter.kt", mo50611l = {600}, mo50612m = "withTimeoutOrNull")
/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 */
/* compiled from: SuspendingPointerInputFilter.kt */
final class C1041x7456dd52<T> extends C12737d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1041x7456dd52(SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, C12074d<? super C1041x7456dd52> dVar) {
        super(dVar);
        this.this$0 = pointerEventHandlerCoroutine;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.withTimeoutOrNull(0, (C13088o) null, this);
    }
}
