package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12745k;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", mo50610f = "TapGestureDetector.kt", mo50611l = {212}, mo50612m = "invokeSuspend")
/* compiled from: TapGestureDetector.kt */
final class TapGestureDetectorKt$awaitSecondDown$2 extends C12745k implements C13088o<AwaitPointerEventScope, C12074d<? super PointerInputChange>, Object> {
    final /* synthetic */ PointerInputChange $firstUp;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TapGestureDetectorKt$awaitSecondDown$2(PointerInputChange pointerInputChange, C12074d<? super TapGestureDetectorKt$awaitSecondDown$2> dVar) {
        super(2, dVar);
        this.$firstUp = pointerInputChange;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2(this.$firstUp, dVar);
        tapGestureDetectorKt$awaitSecondDown$2.L$0 = obj;
        return tapGestureDetectorKt$awaitSecondDown$2;
    }

    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, C12074d<? super PointerInputChange> dVar) {
        return ((TapGestureDetectorKt$awaitSecondDown$2) create(awaitPointerEventScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r12.label
            r2 = 1
            if (r1 == 0) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            long r3 = r12.J$0
            java.lang.Object r1 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r1
            p336ef.C11910n.m25701b(r13)
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r12
            goto L_0x0052
        L_0x0019:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0021:
            p336ef.C11910n.m25701b(r13)
            java.lang.Object r13 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r13
            androidx.compose.ui.input.pointer.PointerInputChange r1 = r12.$firstUp
            long r3 = r1.getUptimeMillis()
            androidx.compose.ui.platform.ViewConfiguration r1 = r13.getViewConfiguration()
            long r5 = r1.getDoubleTapMinTimeMillis()
            long r3 = r3 + r5
            r1 = r13
            r9 = r3
            r13 = r12
        L_0x003a:
            r4 = 0
            r5 = 0
            r7 = 3
            r8 = 0
            r13.L$0 = r1
            r13.J$0 = r9
            r13.label = r2
            r3 = r1
            r6 = r13
            java.lang.Object r3 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r3, r4, r5, r6, r7, r8)
            if (r3 != r0) goto L_0x004d
            return r0
        L_0x004d:
            r11 = r0
            r0 = r13
            r13 = r3
            r3 = r1
            r1 = r11
        L_0x0052:
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r13
            long r4 = r13.getUptimeMillis()
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x005d
            return r13
        L_0x005d:
            r13 = r0
            r0 = r1
            r1 = r3
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
