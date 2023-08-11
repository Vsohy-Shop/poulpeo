package androidx.compose.p002ui.node;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$1 */
/* compiled from: LayoutNodeLayoutDelegate.kt */
final class LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$1 extends C12777p implements Function1<AlignmentLinesOwner, C11921v> {
    public static final LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$1 INSTANCE = new LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$1();

    LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AlignmentLinesOwner) obj);
        return C11921v.f18618a;
    }

    public final void invoke(AlignmentLinesOwner alignmentLinesOwner) {
        C12775o.m28639i(alignmentLinesOwner, "it");
        alignmentLinesOwner.getAlignmentLines().setUsedDuringParentMeasurement$ui_release(false);
    }
}
