package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilter;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1", mo50610f = "SuspendingPointerInputFilter.kt", mo50611l = {620, 621}, mo50612m = "invokeSuspend")
/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1 */
/* compiled from: SuspendingPointerInputFilter.kt */
final class C1040xbd8dd741 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ long $timeMillis;
    int label;
    final /* synthetic */ SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1040xbd8dd741(long j, SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, C12074d<? super C1040xbd8dd741> dVar) {
        super(2, dVar);
        this.$timeMillis = j;
        this.this$0 = pointerEventHandlerCoroutine;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new C1040xbd8dd741(this.$timeMillis, this.this$0, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r8.label
            r2 = 1
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r5) goto L_0x001c
            if (r1 != r4) goto L_0x0014
            p336ef.C11910n.m25701b(r9)
            goto L_0x0038
        L_0x0014:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x001c:
            p336ef.C11910n.m25701b(r9)
            goto L_0x002f
        L_0x0020:
            p336ef.C11910n.m25701b(r9)
            long r6 = r8.$timeMillis
            long r6 = r6 - r2
            r8.label = r5
            java.lang.Object r9 = p466yf.C14041v0.m32563a(r6, r8)
            if (r9 != r0) goto L_0x002f
            return r0
        L_0x002f:
            r8.label = r4
            java.lang.Object r9 = p466yf.C14041v0.m32563a(r2, r8)
            if (r9 != r0) goto L_0x0038
            return r0
        L_0x0038:
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine<R> r9 = r8.this$0
            yf.n r9 = r9.pointerAwaiter
            if (r9 == 0) goto L_0x0054
            ef.m$a r0 = p336ef.C11907m.f18600b
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            long r1 = r8.$timeMillis
            r0.<init>(r1)
            java.lang.Object r0 = p336ef.C11910n.m25700a(r0)
            java.lang.Object r0 = p336ef.C11907m.m25696a(r0)
            r9.resumeWith(r0)
        L_0x0054:
            ef.v r9 = p336ef.C11921v.f18618a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.input.pointer.C1040xbd8dd741.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((C1040xbd8dd741) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
