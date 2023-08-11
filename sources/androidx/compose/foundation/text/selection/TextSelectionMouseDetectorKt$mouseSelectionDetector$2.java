package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12745k;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2", mo50610f = "TextSelectionMouseDetector.kt", mo50611l = {89, 96, 111}, mo50612m = "invokeSuspend")
/* compiled from: TextSelectionMouseDetector.kt */
final class TextSelectionMouseDetectorKt$mouseSelectionDetector$2 extends C12745k implements C13088o<AwaitPointerEventScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ MouseSelectionObserver $observer;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextSelectionMouseDetectorKt$mouseSelectionDetector$2(MouseSelectionObserver mouseSelectionObserver, C12074d<? super TextSelectionMouseDetectorKt$mouseSelectionDetector$2> dVar) {
        super(2, dVar);
        this.$observer = mouseSelectionObserver;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        TextSelectionMouseDetectorKt$mouseSelectionDetector$2 textSelectionMouseDetectorKt$mouseSelectionDetector$2 = new TextSelectionMouseDetectorKt$mouseSelectionDetector$2(this.$observer, dVar);
        textSelectionMouseDetectorKt$mouseSelectionDetector$2.L$0 = obj;
        return textSelectionMouseDetectorKt$mouseSelectionDetector$2;
    }

    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, C12074d<? super C11921v> dVar) {
        return ((TextSelectionMouseDetectorKt$mouseSelectionDetector$2) create(awaitPointerEventScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0051 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r12.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 == r4) goto L_0x0027
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            goto L_0x001a
        L_0x0012:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001a:
            java.lang.Object r1 = r12.L$1
            androidx.compose.foundation.text.selection.ClicksCounter r1 = (androidx.compose.foundation.text.selection.ClicksCounter) r1
            java.lang.Object r5 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r5
            p336ef.C11910n.m25701b(r13)
            r13 = r5
            goto L_0x0044
        L_0x0027:
            java.lang.Object r1 = r12.L$1
            androidx.compose.foundation.text.selection.ClicksCounter r1 = (androidx.compose.foundation.text.selection.ClicksCounter) r1
            java.lang.Object r5 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r5
            p336ef.C11910n.m25701b(r13)
            r6 = r12
            goto L_0x0056
        L_0x0034:
            p336ef.C11910n.m25701b(r13)
            java.lang.Object r13 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r13
            androidx.compose.foundation.text.selection.ClicksCounter r1 = new androidx.compose.foundation.text.selection.ClicksCounter
            androidx.compose.ui.platform.ViewConfiguration r5 = r13.getViewConfiguration()
            r1.<init>(r5)
        L_0x0044:
            r5 = r12
        L_0x0045:
            r5.L$0 = r13
            r5.L$1 = r1
            r5.label = r4
            java.lang.Object r6 = androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.awaitMouseEventDown(r13, r5)
            if (r6 != r0) goto L_0x0052
            return r0
        L_0x0052:
            r11 = r5
            r5 = r13
            r13 = r6
            r6 = r11
        L_0x0056:
            androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.p002ui.input.pointer.PointerEvent) r13
            r1.update(r13)
            java.util.List r7 = r13.getChanges()
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r7
            boolean r13 = androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.isShiftPressed(r13)
            if (r13 == 0) goto L_0x0093
            androidx.compose.foundation.text.selection.MouseSelectionObserver r13 = r6.$observer
            long r8 = r7.m37169getPositionF1C5BW0()
            boolean r13 = r13.m33756onExtendk4lQ0M(r8)
            if (r13 == 0) goto L_0x00d6
            r7.consume()
            long r7 = r7.m37168getIdJ3iCeTQ()
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1 r13 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1
            androidx.compose.foundation.text.selection.MouseSelectionObserver r9 = r6.$observer
            r13.<init>(r9)
            r6.L$0 = r5
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m33062dragjO51t88(r5, r7, r13, r6)
            if (r13 != r0) goto L_0x00d6
            return r0
        L_0x0093:
            int r13 = r1.getClicks()
            if (r13 == r4) goto L_0x00a9
            if (r13 == r3) goto L_0x00a2
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r13 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion
            androidx.compose.foundation.text.selection.SelectionAdjustment r13 = r13.getParagraph()
            goto L_0x00af
        L_0x00a2:
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r13 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion
            androidx.compose.foundation.text.selection.SelectionAdjustment r13 = r13.getWord()
            goto L_0x00af
        L_0x00a9:
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r13 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion
            androidx.compose.foundation.text.selection.SelectionAdjustment r13 = r13.getNone()
        L_0x00af:
            androidx.compose.foundation.text.selection.MouseSelectionObserver r8 = r6.$observer
            long r9 = r7.m37169getPositionF1C5BW0()
            boolean r8 = r8.m33758onStart3MmeM6k(r9, r13)
            if (r8 == 0) goto L_0x00d6
            r7.consume()
            long r7 = r7.m37168getIdJ3iCeTQ()
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$2 r9 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$2
            androidx.compose.foundation.text.selection.MouseSelectionObserver r10 = r6.$observer
            r9.<init>(r10, r13)
            r6.L$0 = r5
            r6.L$1 = r1
            r6.label = r2
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m33062dragjO51t88(r5, r7, r9, r6)
            if (r13 != r0) goto L_0x00d6
            return r0
        L_0x00d6:
            r13 = r5
            r5 = r6
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
