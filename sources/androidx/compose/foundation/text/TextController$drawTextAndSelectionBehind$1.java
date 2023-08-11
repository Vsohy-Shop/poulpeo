package androidx.compose.foundation.text;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$drawTextAndSelectionBehind$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,702:1\n214#2,8:703\n261#2,11:711\n245#2:722\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$drawTextAndSelectionBehind$1\n*L\n463#1:703,8\n463#1:711,11\n469#1:722\n*E\n"})
/* compiled from: CoreText.kt */
final class TextController$drawTextAndSelectionBehind$1 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ TextController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextController$drawTextAndSelectionBehind$1(TextController textController) {
        super(1);
        this.this$0 = textController;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0024, code lost:
        r3 = r3.getSubselections();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.p002ui.graphics.drawscope.DrawScope r22) {
        /*
            r21 = this;
            r0 = r21
            java.lang.String r1 = "$this$drawBehind"
            r12 = r22
            kotlin.jvm.internal.C12775o.m28639i(r12, r1)
            androidx.compose.foundation.text.TextController r1 = r0.this$0
            androidx.compose.foundation.text.TextState r1 = r1.getState()
            androidx.compose.ui.text.TextLayoutResult r1 = r1.getLayoutResult()
            if (r1 == 0) goto L_0x011b
            androidx.compose.foundation.text.TextController r2 = r0.this$0
            androidx.compose.foundation.text.TextState r3 = r2.getState()
            r3.getDrawScopeInvalidation()
            androidx.compose.foundation.text.selection.SelectionRegistrar r3 = r2.selectionRegistrar
            if (r3 == 0) goto L_0x003d
            java.util.Map r3 = r3.getSubselections()
            if (r3 == 0) goto L_0x003d
            androidx.compose.foundation.text.TextState r4 = r2.getState()
            long r4 = r4.getSelectableId()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r3 = r3.get(r4)
            androidx.compose.foundation.text.selection.Selection r3 = (androidx.compose.foundation.text.selection.Selection) r3
            goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            androidx.compose.foundation.text.TextState r4 = r2.getState()
            androidx.compose.foundation.text.selection.Selectable r4 = r4.getSelectable()
            r5 = 0
            if (r4 == 0) goto L_0x004e
            int r4 = r4.getLastVisibleOffset()
            goto L_0x004f
        L_0x004e:
            r4 = r5
        L_0x004f:
            if (r3 == 0) goto L_0x010e
            boolean r6 = r3.getHandlesCrossed()
            if (r6 != 0) goto L_0x0060
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r6 = r3.getStart()
            int r6 = r6.getOffset()
            goto L_0x0068
        L_0x0060:
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r6 = r3.getEnd()
            int r6 = r6.getOffset()
        L_0x0068:
            int r6 = p436tf.C13537l.m30886m(r6, r5, r4)
            boolean r7 = r3.getHandlesCrossed()
            if (r7 != 0) goto L_0x007b
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r3 = r3.getEnd()
            int r3 = r3.getOffset()
            goto L_0x0083
        L_0x007b:
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r3 = r3.getStart()
            int r3 = r3.getOffset()
        L_0x0083:
            int r3 = p436tf.C13537l.m30886m(r3, r5, r4)
            if (r6 == r3) goto L_0x010e
            androidx.compose.ui.text.MultiParagraph r4 = r1.getMultiParagraph()
            androidx.compose.ui.graphics.Path r3 = r4.getPathForRange(r6, r3)
            androidx.compose.ui.text.TextLayoutInput r4 = r1.getLayoutInput()
            int r4 = r4.m37944getOverflowgIe3tQ8()
            androidx.compose.ui.text.style.TextOverflow$Companion r5 = androidx.compose.p002ui.text.style.TextOverflow.Companion
            int r5 = r5.m38399getVisiblegIe3tQ8()
            boolean r4 = androidx.compose.p002ui.text.style.TextOverflow.m38390equalsimpl0(r4, r5)
            if (r4 == 0) goto L_0x00ba
            androidx.compose.foundation.text.TextState r2 = r2.getState()
            long r4 = r2.m33745getSelectionBackgroundColor0d7_KjU()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 60
            r11 = 0
            r2 = r22
            androidx.compose.p002ui.graphics.drawscope.DrawScope.m36246drawPathLG529CI$default(r2, r3, r4, r6, r7, r8, r9, r10, r11)
            goto L_0x010e
        L_0x00ba:
            r14 = 0
            r15 = 0
            long r4 = r22.m36274getSizeNHjbRc()
            float r16 = androidx.compose.p002ui.geometry.Size.m35491getWidthimpl(r4)
            long r4 = r22.m36274getSizeNHjbRc()
            float r17 = androidx.compose.p002ui.geometry.Size.m35488getHeightimpl(r4)
            androidx.compose.ui.graphics.ClipOp$Companion r4 = androidx.compose.p002ui.graphics.ClipOp.Companion
            int r18 = r4.m35660getIntersectrtfAjoo()
            androidx.compose.ui.graphics.drawscope.DrawContext r11 = r22.getDrawContext()
            long r9 = r11.m36217getSizeNHjbRc()
            androidx.compose.ui.graphics.Canvas r4 = r11.getCanvas()
            r4.save()
            androidx.compose.ui.graphics.drawscope.DrawTransform r13 = r11.getTransform()
            r13.m36329clipRectN_I0leg(r14, r15, r16, r17, r18)
            androidx.compose.foundation.text.TextState r2 = r2.getState()
            long r4 = r2.m33745getSelectionBackgroundColor0d7_KjU()
            r6 = 0
            r7 = 0
            r8 = 0
            r13 = 0
            r14 = 60
            r15 = 0
            r2 = r22
            r19 = r9
            r9 = r13
            r10 = r14
            r13 = r11
            r11 = r15
            androidx.compose.p002ui.graphics.drawscope.DrawScope.m36246drawPathLG529CI$default(r2, r3, r4, r6, r7, r8, r9, r10, r11)
            androidx.compose.ui.graphics.Canvas r2 = r13.getCanvas()
            r2.restore()
            r2 = r19
            r13.m36218setSizeuvyYCjk(r2)
        L_0x010e:
            androidx.compose.ui.graphics.drawscope.DrawContext r2 = r22.getDrawContext()
            androidx.compose.ui.graphics.Canvas r2 = r2.getCanvas()
            androidx.compose.foundation.text.TextDelegate$Companion r3 = androidx.compose.foundation.text.TextDelegate.Companion
            r3.paint(r2, r1)
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextController$drawTextAndSelectionBehind$1.invoke(androidx.compose.ui.graphics.drawscope.DrawScope):void");
    }
}
