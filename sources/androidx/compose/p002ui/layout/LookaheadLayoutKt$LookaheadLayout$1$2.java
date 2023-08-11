package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.layout.LookaheadLayoutKt$LookaheadLayout$1$2 */
/* compiled from: LookaheadLayout.kt */
final class LookaheadLayoutKt$LookaheadLayout$1$2 extends C12777p implements Function1<LayoutNode, C11921v> {
    public static final LookaheadLayoutKt$LookaheadLayout$1$2 INSTANCE = new LookaheadLayoutKt$LookaheadLayout$1$2();

    LookaheadLayoutKt$LookaheadLayout$1$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutNode) obj);
        return C11921v.f18618a;
    }

    public final void invoke(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "$this$init");
        layoutNode.setLookaheadRoot(true);
    }
}
