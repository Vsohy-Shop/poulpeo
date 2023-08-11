package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nTextSelectionMouseDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextSelectionMouseDetector.kt\nandroidx/compose/foundation/text/selection/TextSelectionMouseDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,134:1\n86#2,2:135\n33#2,6:137\n88#2:143\n*S KotlinDebug\n*F\n+ 1 TextSelectionMouseDetector.kt\nandroidx/compose/foundation/text/selection/TextSelectionMouseDetectorKt\n*L\n128#1:135,2\n128#1:137,6\n128#1:143\n*E\n"})
/* compiled from: TextSelectionMouseDetector.kt */
public final class TextSelectionMouseDetectorKt {
    public static final double ClicksSlop = 100.0d;

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    public static final java.lang.Object awaitMouseEventDown(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r10, p355hf.C12074d<? super androidx.compose.p002ui.input.pointer.PointerEvent> r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1 r0 = (androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1 r0 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r10 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r10
            p336ef.C11910n.m25701b(r11)
            goto L_0x0045
        L_0x002d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0035:
            p336ef.C11910n.m25701b(r11)
        L_0x0038:
            androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.p002ui.input.pointer.PointerEventPass.Main
            r0.L$0 = r10
            r0.label = r3
            java.lang.Object r11 = r10.awaitPointerEvent(r11, r0)
            if (r11 != r1) goto L_0x0045
            return r1
        L_0x0045:
            androidx.compose.ui.input.pointer.PointerEvent r11 = (androidx.compose.p002ui.input.pointer.PointerEvent) r11
            int r2 = r11.m37112getButtonsry648PA()
            boolean r2 = androidx.compose.p002ui.input.pointer.PointerEvent_androidKt.m37145isPrimaryPressedaHzCxE(r2)
            if (r2 == 0) goto L_0x0038
            java.util.List r2 = r11.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L_0x005b:
            if (r6 >= r4) goto L_0x0082
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r7
            int r8 = r7.m37172getTypeT8wyACA()
            androidx.compose.ui.input.pointer.PointerType$Companion r9 = androidx.compose.p002ui.input.pointer.PointerType.Companion
            int r9 = r9.m37246getMouseT8wyACA()
            boolean r8 = androidx.compose.p002ui.input.pointer.PointerType.m37241equalsimpl0(r8, r9)
            if (r8 == 0) goto L_0x007b
            boolean r7 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToDown(r7)
            if (r7 == 0) goto L_0x007b
            r7 = r3
            goto L_0x007c
        L_0x007b:
            r7 = r5
        L_0x007c:
            if (r7 != 0) goto L_0x007f
            goto L_0x0083
        L_0x007f:
            int r6 = r6 + 1
            goto L_0x005b
        L_0x0082:
            r5 = r3
        L_0x0083:
            if (r5 == 0) goto L_0x0038
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.awaitMouseEventDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, hf.d):java.lang.Object");
    }

    public static final Object mouseSelectionDetector(PointerInputScope pointerInputScope, MouseSelectionObserver mouseSelectionObserver, C12074d<? super C11921v> dVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new TextSelectionMouseDetectorKt$mouseSelectionDetector$2(mouseSelectionObserver, (C12074d<? super TextSelectionMouseDetectorKt$mouseSelectionDetector$2>) null), dVar);
        if (awaitEachGesture == C12150d.m26492c()) {
            return awaitEachGesture;
        }
        return C11921v.f18618a;
    }
}
