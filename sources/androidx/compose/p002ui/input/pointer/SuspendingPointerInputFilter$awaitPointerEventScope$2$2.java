package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$awaitPointerEventScope$2$2 */
/* compiled from: SuspendingPointerInputFilter.kt */
final class SuspendingPointerInputFilter$awaitPointerEventScope$2$2 extends C12777p implements Function1<Throwable, C11921v> {
    final /* synthetic */ SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> $handlerCoroutine;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuspendingPointerInputFilter$awaitPointerEventScope$2$2(SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine) {
        super(1);
        this.$handlerCoroutine = pointerEventHandlerCoroutine;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Throwable th) {
        this.$handlerCoroutine.cancel(th);
    }
}
